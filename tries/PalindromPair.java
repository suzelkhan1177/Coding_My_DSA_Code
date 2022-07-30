package tries;

import java.util.*;
public class PalindromPair {
	
	private TrieNode root;
	
	 private void add(TrieNode root, String word){
	        if(word.length() == 0){
	            root.isTerminal = true;
	            return;
	        }		
	        int childIndex = word.charAt(0) - 'a';
	        TrieNode child = root.children[childIndex];
	        if(child == null){
	            child = new TrieNode(word.charAt(0));
	            root.children[childIndex] = child;
	            root.childCount++;
	        }
	        add(child, word.substring(1));
	    }

	    public void add(String word){
	        add(root, word);
	    }
	
	public boolean isPalindromePair(ArrayList<String> words) {
		
		 for(String word : words) {
			 this.add(reverseWord(word));
		 }
		 
		 return isPalindromePair(this.root, words);
	}
	
	private  String reverseWord(String word) {
		String rev = "";
		
		for(int i = word.length()-1; i>=0; i--) {
			rev +=  word.charAt(i);
		}
		return rev;
	}
	
	private boolean isPalindromePair(TrieNode root, ArrayList<String> word) {
		
		 if(word == null || word.size() == 0) {
			 return false;
		 }
		 
		 for(String words : word) {
			 if(doesPairExistFor(root, words, 0)) {
				 return true;
			 }
		 }
		 
		 return false;
	}
	
	private boolean doesPairExistFor(TrieNode root, String word, int startIndex) {
		
		   if(word == "") {
			   return true;
		   }
		    if(startIndex == word.length()) {
			    if(root.isTerminal) {
				   return true;
			   }
			    
			    return CheckRemaningBranch(root, "");
		   }
		    
		    int childIndex = word.charAt(startIndex) -'a';
		    TrieNode child = root.children[childIndex];
		    
		    if(child == null) {
		    	
		    	if(root.isTerminal) {
		    		return checkWordPalindrom(word.substring(startIndex));
		    	}
		    	return false;
		    }
		    
		    
		    return doesPairExistFor(child, word, startIndex +1);
	}
	
	private boolean CheckRemaningBranch(TrieNode root , String word) {
		
		return false;
	}
	
	private boolean checkWordPalindrom(String word) {
		
		   int start = 0;
		   int end = word.length()-1;
		   
		   while(start < end) {
			   if(word.charAt(start) != word.charAt(end)) {
				   return false;
			   }
			    start++;
			   end--;
		   }
		   
		   return true;
	}
	
	

	public static void main(String[] args) {
		
		PalindromPair p = new  PalindromPair();
		
		String str = "abcmscba";
	  System.out.print(p.checkWordPalindrom(str));

	}
	

}

package tries;

import java.util.*;

//Sample Input 1 :
//7
//do dont no not note notes den
//no
//Sample Output 2 :
//no
//not
//note
//notes

public class AutoCompleteANDGoogelSearch {
private TrieNode root;
	
	public AutoCompleteANDGoogelSearch () {
		 root = new TrieNode('\0');
	}
	
	public void add(TrieNode root, String word) { 
		
		if(word.length() == 0) {
			root.isTerminal = true;
			return;
		}
		
		//find index
		int childIndex =  word.charAt(0) - 'a';
		
		//present
		TrieNode child =  root.children[childIndex];
		
		//absent
		if(child == null) {
			//create Node
			child = new TrieNode(word.charAt(0));
			root.children[childIndex] = child;
			root.childCount++;
			
		}
		
		//recursion call
		add(child ,  word.substring(1));
		
	}
	
	public void add(String word) {
		add(root, word);
	}
	
	   public TrieNode search(TrieNode root, String word) { 
	        if(word.length() == 0){
	            return root;
	        }
	        int childIndex = word.charAt(0) - 'a';
	        TrieNode child = root.children[childIndex];
	        if(child == null){
	            return null; 
	        }
	        return search(child, word.substring(1));
	    } 
	    
	    public void allwords(TrieNode root,String word,String output){    
	        if(root.childCount == 0) { 
	            if(output.length() > 0) {
	                System.out.println(word + output); 
	            }
	            return; 
	        }
	        if(root.isTerminal == true) {
	            System.out.println(word + output);
	        }

	        for(int i = 0; i < root.children.length; i++) {
	            if(root.children[i] != null) {
	                String ans = output + root.children[i].data; 
	                allwords(root.children[i],word,ans);
	            }
	       }
	    }
	     public void autoComplete(ArrayList<String> input, String word){    
	       
	    	 for(String w : input) {
	    		 add(w);
	    	 }
	       
	    	 TrieNode child=search(root,word);
	    	if(child == null || child.childCount == 0) { 
	            return;
	        }
	  
	        String output = ""; 
	        allwords(child,word,output); 
	    }
}

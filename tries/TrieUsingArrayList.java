package tries;

import java.util.*;

class TrieNode{
    
    ArrayList<TrieNode> child;
    boolean isEnd ;
    
    TrieNode(){
        
        child = new ArrayList<TrieNode>(26);
        
          for(int i=0; i<26; i++) {
              child.add(null); 
          }
          
          this.isEnd = false;
    }
    
}


public  class TrieUsingArrayList{
	
	public static TrieNode root;
	
	//Initialization Data Structure here
	
	TrieUsingArrayList(){
		root = new TrieNode();	
	}
	
	
	public static void insert(String word) {
		
		  TrieNode roots = root;
		  
		  for(int i=0; i<word.length(); i++) {
			  
			  int index = word.charAt(i) -'a';
			  
			   
			  //index is not present
			  if(roots.child.get(index) == null) {
				  
				  roots.child.set(index, new TrieNode());
			  }
                 
				  // index is present move next index
			     roots = roots.child.get(index);
			  
			  
		  }
		  
		  roots.isEnd = true;
	}
	
	public static  boolean search(String word) {
		

			  TrieNode roots = root;
			  
			  for(int i=0; i<word.length(); i++) {
				  
				  int index = word.charAt(i) -'a';
				  
				   
				  //index is not present
				  if(roots.child.get(index) == null) {
					  
					 return false;
				  }
	               
					  // index is present move next index
				     roots = roots.child.get(index);
				  
				  
			  }
			  
			  return roots.isEnd;
	}
	
	public static  boolean prefix(String word) {
		

		  TrieNode roots = root;
		  
		  for(int i=0; i<word.length(); i++) {
			  
			  int index = word.charAt(i) -'a';
			  
			   
			  //index is not present
			  if(roots.child.get(index) == null) {
				  
				 return false;
			  }
             
				  // index is present move next index
			     roots = roots.child.get(index);
			  
			  
		  }
		  
		  return true;
	}
	
	
	public static String longestCommonPrefix(String[] arr, int n) {
	
		  String ans = "";
		  
		  for(int i=0; i<arr[0].length(); i++) {
			  
			  char ch = arr[0].charAt(i);
			  
			  boolean match = true;
			  
			  for(int j=1; j<n; j++) {
				  
				  if(arr[j].length() < i || ch != arr[j].charAt(i)) {
					  match = false;
					  break;
				  }
			  }
			  
			  if(match) {
				  ans += ch;
			  }else {
				  break;
			  } 
		  }
		  
		  return ans;	  
	}


	public static void main(String[] args) {
		
		   // Input keys (use only 'a' through 'z' and lower case)
        String keys[] = {"the", "a", "there", "answer", "any",
                         "by", "bye", "their"};
      
        String output[] = {"Not present in trie", "Present in trie"};
      
      
        root = new TrieNode();
      
        // Construct trie
        int i;
        for (i = 0; i < keys.length ; i++)
            insert(keys[i]);
      
        // Search for different keys
        if(search("the") == true)
            System.out.println("the --- " + output[1]);
        else System.out.println("the --- " + output[0]);
         
        if(search("these") == true)
            System.out.println("these --- " + output[1]);
        else System.out.println("these --- " + output[0]);
         
        if(search("their") == true)
            System.out.println("their --- " + output[1]);
        else System.out.println("their --- " + output[0]);
         
        if(search("thaw") == true)
            System.out.println("thaw --- " + output[1]);
        else System.out.println("thaw --- " + output[0]);
        
	}
}

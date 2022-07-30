package tries;

class TrieNode{
	
	char data;
	boolean isTerminal;
	TrieNode children[];
	int childCount;
	TrieNode(char data){
		
		 this.data = data;
		 this.isTerminal = false;
		 this. children = new  TrieNode[26];
		 this.childCount = 0;
	}
}


public class Tries {
	
	private TrieNode root;
	
	public Tries() {
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
	
   public boolean search(TrieNode root, String word) {
		
	   // base
	      if(word.length() == 0) {
	    	  return root.isTerminal;
	      }
	        int childIndex =  word.charAt(0) -'a';
	      TrieNode child = root.children[childIndex];
	      
//	      preasent
	      if(child != null) {
	    	  root.children[childIndex] = child;
	      }else {
	    	  //absent
	    	  return false;
	      }
	      
	      return search(child, word.substring(1));
	}
	 
	public boolean search(String word) {
		
		return search(root, word);
	}
	
      public void remove(TrieNode root, String word) {
		
    	  if(word.length() == 0) {
    		  root.isTerminal = false;
    		  return;
    	  }
    	  
    	  int childeIndex = word.charAt(0) -'a';
    	  TrieNode child = root.children[childeIndex];
    	  
    	  if(child == null) {
    		  return;
    	  }
    	  
    	   remove(child, word.substring(1));
    	   
    	   //remove spece
    	   if(!root.isTerminal && root.childCount ==0) {
    		   root.children[childeIndex] = null;
    		   root.childCount--;
    	   }
    }
	
	public void remove(String word) {
		 remove(root,word);
		 
	}
	

	
	public static void main(String[] args) {
		
		 Tries t = new Tries();
		 
		 t.add("note");
		 t.add("no");
		 t.add("notout");
		 
//		 System.out.println(t.search("note"));
//		    t.remove("note");
//		    System.out.println(t.search("note"));
		    
//		    System.out.println(t.countWords());
	}

}

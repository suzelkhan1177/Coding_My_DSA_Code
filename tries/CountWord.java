package tries;

public class CountWord {
	
private TrieNode root;
	
	public CountWord() {
		 root = new TrieNode('\0');
	}

	 public int wordCount(TrieNode root)
	    {
	       int result =0;
     
        if(root.isTerminal)
            result++;
     
     for(int i=0; i<26; i++)
         if(root.children[i] != null)
         result += wordCount(root.children[i]);
     
     
     return result;
	    }
	 
	     public int countWords() {
		  return wordCount(root);
		}
	
}

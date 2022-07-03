package trees;

public class Next_Lagest_element {

	   static TreeNode<Integer> max;
	    
	   static void nextLargerElementUtil(TreeNode<Integer> root, int x)
	  {
	      if (root == null)
	          return;
	   
	    
	      if (root.data > x)
	          if ((max == null || max.data > root.data))
	              max = root;
	   
	      for(TreeNode<Integer> child : root.children)
	          nextLargerElementUtil(child, x);
	   
	     
	  }
	  	
	  	public static TreeNode<Integer> findNextLargerNode(TreeNode<Integer> root, int n){
	  		
	  		max = null;
	          nextLargerElementUtil(root, n);
	          return max;

	  	}
}

package trees;

public class Replace_node_with_depth {

//	    Sample Input 1 :
//		10 3 20 30 40 2 40 50 0 0 0 0 
//		Sample Output 1 : (Level wise, each level in new line)
//		0 
//		1 1 1 
//		2 2
	
	public static void helper(TreeNode<Integer> root, int depth){

		   root.data = depth;
	    
	        for(TreeNode<Integer> child : root.children){
	            
	            helper(child, depth +1);
	        }
			
		}
	    
		public static void replaceWithDepthValue(TreeNode<Integer> root){

			int depth = 0;
	        
	        helper(root, depth);
			
		}
}

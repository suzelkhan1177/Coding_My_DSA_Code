package Binary_Serch_Tree;

public class Longest_BST {
	
	//Approch 1
	public static int largestBSTSubtrees(BinaryTreeNode<Integer> root) {

	        if(root == null){
	            return 0;
	        }
	        if (isBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE)){
	            return findHeight(root);
	        }else{
	            return Math.max(largestBSTSubtrees(root.left),largestBSTSubtrees(root.right));
	        }

	    }

	    private static int findHeight(BinaryTreeNode<Integer> root){
	        if (root==null)
	            return 0;

	        if (root.left==null && root.right==null)
	            return 1;

	        return Math.max(findHeight(root.left),findHeight(root.right))+1;
	    }

	    private static boolean isBST(BinaryTreeNode<Integer> root, int min, int max){
	        if(root == null)
	            return true;

	        if(root.data < min || root.data > max)
	            return false;
	        else
	            return isBST(root.left,min,root.data -1) && isBST(root.right,root.data +1,max);
	    }
	
	
	
	
	
	
	
    // Approch 2
	 public static class isBSTClass{
	        
	        static int size;
	      static   int max;
	      static  int  min;
	      static  boolean isBST;
	        
	        isBSTClass(){
	        }
	        
	        isBSTClass(int size, int max , int min, boolean isBST){
	            
	            this.size = size;
	            this.min = min;
	            this.max = max;
	            this.isBST = isBST;
	        }
	        
	    }
	    
	  public  static isBSTClass findBST(BinaryTreeNode<Integer> root){
	        
	           if(root == null){
	              return new isBSTClass(0, Integer.MIN_VALUE, Integer.MAX_VALUE, true);
	          }
       
      
	          // if (root.left == null && root.right == null) {
	          // return new isBSTClass(1, root.data, root.data, true);
	          // }
	        
	        
	        isBSTClass left  = findBST(root.left);
	        isBSTClass right = findBST(root.right);
	        
	        isBSTClass currNode = new isBSTClass();
	        
	        currNode.size = left.size + right.size +1;
	        isBSTClass.min = Math.min(Math.min(left.min, right.min) , root.data);
	        isBSTClass.max = Math.max(Math.max(left.max, right.max) , root.data);
	        
	        if(left.isBST && right.isBST && (left.max < root.data && right.min > root.data)){
	            
	              currNode.isBST = true;
	        }else{
	            currNode.isBST = false;
	        }
	        
	        currNode.size = Math.max(left.size , right.size);
	        
	        return currNode;
	    }
	    
		public static int largestBSTSubtree(BinaryTreeNode<Integer> root) {
			
	          return findBST(root).size;
		}
}

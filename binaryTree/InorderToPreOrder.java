package binaryTree;

import java.util.*;
public class InorderToPreOrder {
    
	  static HashMap<Integer,Integer> mp = new HashMap<>();
	    static int preIndex =0;
	    
	    public static  BinaryTreeNode  InoToPre(int pre[] , int in[] , int start , int end){
	        
	           if( start > end){
	               return null;
	           }
	        
	        int curr = pre[preIndex++];
	        BinaryTreeNode root = new BinaryTreeNode<>(curr);
	        
	        if(start == end){
	            return root;
	        }
	        
	        int inIndex = mp.get(curr);
	        
	        
	        root.left = InoToPre(pre , in, start, inIndex -1 );
	        root.right = InoToPre(pre , in  ,  inIndex+1 , end);
	        
	        return root;
	          
	    }

		public static BinaryTreeNode<Integer> buildTree(int[] preOrder, int[] inOrder) {
			
	        int n = preOrder.length;
	        
	        for(int i=0; i<n; i++){
	            
	            mp.put(inOrder[i], i);
	        }
	        
	        return InoToPre(preOrder, inOrder, 0, n-1 );
		}
}

package binaryTree;

import java.util.*;
public class InorderToPostOrder {

	   static HashMap<Integer, Integer> mp = new HashMap<>();
	    static int postIndex;
	    
	    public static BinaryTreeNode InoToPost(int[] post, int[] Ino , int start , int end) {
	        
	        if(start > end){
	            return null;
	        }
	      
	        int curr = post[postIndex--];
	        BinaryTreeNode root = new BinaryTreeNode(curr);
	        
	        if(start == end){
	            return root;
	        }
	        
	        int inIndex = mp.get(curr);
	        
	        root.right = InoToPost(post , Ino , inIndex +1 , end);
	          root.left = InoToPost(post , Ino , start , inIndex -1);
	        
	        return root;
	        
	    }

		public static BinaryTreeNode<Integer> buildTree(int[] postOrder, int[] inOrder) {
			
	           int len = inOrder.length;
	        for(int i=0; i<len; i++){
	            
	            mp.put(inOrder[i], i);
	        }
	        
	        postIndex = len-1;
	        
	        return InoToPost(postOrder, inOrder, 0, len-1);
		}

}

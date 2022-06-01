package binaryTree;

import java.util.*;
public class Assinment_2_Question {

	
	
	// Question 1
//	   Sample Input 1:
//		2 3 9 4 8 -1 2 4 -1 -1 -1 6 -1 -1 -1 -1 -1
//		13
//		 Sample Output 1:
//		2 3 4 4 
//		2 3 8
	 public static void rootToLeafPathsSumToKhelper(BinaryTreeNode<Integer> root, int k, String st){
	        if(root==null){
	            return;
	        }
	    
	        if(root.left==null && root.right==null){
	            st=st+" "+root.data;
	            if(k-root.data==0){
	                System.out.println(st.substring(1));
	            }
	            return;
	        }
	        
	        rootToLeafPathsSumToKhelper(root.left,k-root.data,st+" "+root.data);
	        rootToLeafPathsSumToKhelper(root.right,k-root.data,st+" "+root.data);
	    }
	    
		public static void rootToLeafPathsSumToK(BinaryTreeNode<Integer> root, int k) {
			
	        rootToLeafPathsSumToKhelper(root,k,"");
		}
		
		//Quetion 2
		
//		   Sample Input 1:
//			10 20 30 40 50 -1 60 -1 -1 -1 -1 -1 -1
//			Sample Output 1:
//			10 
//			10 30 
//			20 30 60 
//			20 50 60 
//			40 50 
//			40   
		
		public static void insertDuplicateNode(BinaryTreeNode<Integer> root) {

            BinaryTreeNode  oldleft;
        
             if(root == null){
                 return;
             }
        
        insertDuplicateNode(root.left);
        insertDuplicateNode(root.right);
        
        
          oldleft = root.left;
         root.left =  new BinaryTreeNode(root.data);
        root.left.left = oldleft;
        
	}
}

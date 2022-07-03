package Binary_Serch_Tree;

import java.util.*;

                                                                                                                                                               
class BinaryTreeNode<T>{                                                                                                                                                              
                                                                                                                                                                                      
	 T data;                                                                                                                                                                          
	 BinaryTreeNode<T> left;                                                                                                                                                          
	 BinaryTreeNode<T> right;                                                                                                                                                         
	                                                                                                                                                                                  
	 public BinaryTreeNode(T data) {                                                                                                                                                  
		 this.data = data;                                                                                                                                                            
		 left = null;                                                                                                                                                                 
		 right = null;                                                                                                                                                                
	 }                                                                                                                                                                                
}                                                                                                                                                                                     
                                                                                                                                                                                      
                                                                                                                                                                                      
public class BST_Ques1 {   
	

        // Serch in Binary Serch Tree                                                                                                                                                                              
	public static boolean searchInBST(BinaryTreeNode<Integer> root, int k) {                                                                                                          
		                                                                                                                                                                              
        if(root == null)                                                                                                                                                              
            return false;                                                                                                                                                             
                                                                                                                                                                                      
         if(root.data == k)                                                                                                                                                           
             return true;                                                                                                                                                             
                                                                                                                                                                                      
          if(root.data > k){                                                                                                                                                          
                                                                                                                                                                                      
              return searchInBST(root.left , k);                                                                                                                                      
          }                                                                                                                                                                           
                                                                                                                                                                                      
        return searchInBST(root.right , k);                                                                                                                                           
	}                                                                                                                                                                                 
	                             
	
	//Insert in Binary Serch Tree
	static BinaryTreeNode insert(BinaryTreeNode<Integer> root, int x) {                                                                                                               
	                                                                                                                                                                                  
        if(root == null){                                                                                                                                                             
            return new BinaryTreeNode(x);                                                                                                                                             
        }                                                                                                                                                                             
                                                                                                                                                                                      
        if( root.data < x){                                                                                                                                                           
            root.right = insert(root.right, x);                                                                                                                                       
        }                                                                                                                                                                             
                                                                                                                                                                                      
         if( root.data > x){                                                                                                                                                          
            root.left = insert(root.left, x);                                                                                                                                         
        }                                                                                                                                                                             
        return root;                                                                                                                                                                  
    }  
	
	
	 public static BinaryTreeNode<Integer> createTree(int[] arr, int start , int end){
			
//		    Sample Input 1:
//			 7
//			 1 2 3 4 5 6 7
//			 Sample Output 1:
//			 4 2 1 3 6 5 7 
		 
         if(start > end){
             return null;
         }
     
        int mid =start + (end - start )/2;
     
       BinaryTreeNode root = new BinaryTreeNode(arr[mid]);
     
        root.left = createTree(arr , start , mid -1);
     
        root.right = createTree(arr, mid+1 , end);
     
     return root;
	}

	public static BinaryTreeNode<Integer> SortedArrayToBST(int[] arr, int n){
		
          BinaryTreeNode root = createTree(arr , 0 , n-1);
       
       return root;
	}
	                                                                                                                                                                                  
	                                                                                                                                                                                  
	
	
	 // Traversal LNR = left-Node-right
	  public static void  InorderTraversal(BinaryTreeNode root) {
		  
		  if( root != null) {
			  
			  InorderTraversal(root.left);
			  System.out.print(root.data + " ");
			  InorderTraversal(root.right);
		  }
	  }
	  
	  
	  //Print Element in range 
	  public static void elementsInRangeK1K2(BinaryTreeNode<Integer> root,int k1,int k2){
//		     Sample Input 1:
//			  8 5 10 2 6 -1 -1 -1 -1 -1 7 -1 -1
//			  6 10
//			  Sample Output 1:
//			  6 7 8 10
		  
		  
          if(root == null)
              return;
       
       
         if(root.data > k1)
          elementsInRangeK1K2(root.left, k1, k2);
       
       if(root.data >= k1 && root.data <= k2)
           System.out.print(root.data + " ");

       
        if(root.data < k2)
          elementsInRangeK1K2(root.right, k1, k2);
	}
	  
	  
	  //check BST is true or Not
	  public static boolean isBST(BinaryTreeNode<Integer> root, int min , int max) 
	    {
	        if(root == null)
	            return true;
	        
	        if(root.data > min && root.data < max){
	             boolean left = isBST(root.left , min , root.data );
	            boolean right = isBST(root.right, root.data, max);
	            
	            return left && right;
	            
	        }else{
	            return false;
	        }
	        
	    }
	    
	    static BinaryTreeNode prev = null;
		public static boolean validateBST(BinaryTreeNode<Integer> root) 
	    {
//	        if(root != null){
//	            
//	            if(!validateBST(root.left))
//	                return false;
//	         
////	            if(prev != null && root.data < prev.data )
////	                return false;
//	                
//	                prev = root;
//	            
//	            return validateBST(root.right);
//	        }
//	        
//	        
//	        return true;
	 		return isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
		}
		
		
		
		// Delete Binary tree Node
		  public static BinaryTreeNode deleteNode(BinaryTreeNode<Integer> root, int x) {
		       
	           if(root == null){
	               return null;
	           }
	           
	           if(root.data > x){
	               
	               root.left = deleteNode(root.left , x);
	               
	           }else if(root.data < x){
	               
	               root.right = deleteNode(root.right , x);
	           }else{
	               
	               if(root.left == null){
	                   return root.right;
	               }else if(root.right == null){
	                   return root.left;
	               }
	               
	               root.data = minValue(root.right);
	               root.right = deleteNode(root.right , root.data);
	               
	           }
	           
	           return root;
	    }
	    
	    static int minValue(BinaryTreeNode<Integer> root){
	        
	        int min = root.data;
	        while(root.left != null){
	            
	            min = root.left.data;
	            root = root.left;
	        }
	        return min;
	    }
		
		
	                                                                      
		
		
		
		
	public static void main(String[] args) {                                                                                                                                          
		                  
//		int arr[] = {5,1,2,3,4,6,7,8};
		int arr[] = {8 ,5, 10, 2 ,6, -1, -1 ,-1, -1, -1, 7, -1 ,-1};
		
		BinaryTreeNode root = null; 
		
		for(int i=0; i<arr.length; i++) {
			
			root = insert(root, arr[i]);
		}
		
	   InorderTraversal(root);
		                
		
		                                                                                                                                                                              
	}                                                                                                                                                                                 
}                                                                                                                                                                                     
                                                                                                                                                                                      

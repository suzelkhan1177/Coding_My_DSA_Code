package Binary_Serch_Tree;

import java.util.ArrayList;



public class Merge_Two_BST {
 
	  public static void sortInOrder(BinaryTreeNode < Integer >  root, ArrayList<Integer> arr){
	        if(root != null){
	            sortInOrder(root.left, arr);
	            arr.add(root.data);
	            sortInOrder(root.right, arr);
	        }
	    }

	    
	    static ArrayList<Integer> MergeArray(ArrayList<Integer> arr1, ArrayList<Integer> arr2){
	        
	        int m = arr1.size();
	        int n = arr2.size();
	        
	        ArrayList<Integer> arr = new ArrayList<Integer>();
	        int i=0, j =0;
	        
	        while( i < m && j < n){
	            if(arr1.get(i) < arr2.get(j)){
	                arr.add(arr1.get(i));
	                i++;
	            }else{
	                arr.add(arr2.get(j));
	                j++;
	            }
	        }
	        
	        while(i < m){
	            arr.add(arr1.get(i));
	            i++;
	        }
	        while(j < n){
	            arr.add(arr2.get(j));
	            j++;
	        }
	        return arr;
	    }
	    
	    static BinaryTreeNode < Integer > constantBST(ArrayList<Integer> arr, int start , int end){
	        
	         if(start > end){
	             return null;
	         }
	        
	        int mid = (start + end) /2;
	        BinaryTreeNode < Integer >  node = new BinaryTreeNode<>(arr.get(mid));
	        
	        node.left = constantBST(arr , start , mid -1);
	        node.right = constantBST(arr, mid +1 , end);
	        
	        return node;
	    }
		static void printMergeTrees(BinaryTreeNode<Integer> root1,
				BinaryTreeNode<Integer> root2) {
			
	        ArrayList<Integer> temp1 = new ArrayList<Integer>();
	       sortInOrder(root1, temp1);
	       
	       ArrayList<Integer> temp2 = new ArrayList<Integer>();
	       sortInOrder(root2, temp2);
	       
	       ArrayList<Integer> temp3 = MergeArray( temp1,  temp2);
	       
	       BinaryTreeNode<Integer> node = constantBST(temp3 , 0 , temp3.size() - 1);
	     
	         InOrder(node);
		}
	    
	    public static void InOrder(BinaryTreeNode < Integer > root) {
	        if (root != null) {
	            InOrder(root.left);
	            System.out.print(root.data+ " ");

	            InOrder(root.right);
	        }
	    }
}

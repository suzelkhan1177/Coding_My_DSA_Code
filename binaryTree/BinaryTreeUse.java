package binaryTree;

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


public class BinaryTreeUse {
   
	// Create Binary Tree
  public static BinaryTreeNode<Integer>  BuildTree(BinaryTreeNode<Integer> root){
		
		System.out.println("Enter tha root data : ");
		
		Scanner sc = new Scanner(System.in);
		
		int data = sc.nextInt();
		
		root = new BinaryTreeNode(data);
		
		if(data == -1) {
			return null;
		}
		
		System.out.println("Enter data insert left "+ data);
		
		root.left = BuildTree(root.left);
	
         System.out.println("Enter data insert right "+ data);
		
		root.right = BuildTree(root.right);
		
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
  
  
  
  //Traversel NLR = Node-left-right
  public static void  PreorderTraversal(BinaryTreeNode root) {
	  
	  if( root != null) {
		  
		  System.out.print(root.data + " ");
		  PreorderTraversal(root.left);
		  PreorderTraversal(root.right);
	  }
  }
  
  
  
  
  //Traversal LRN = left-right-Node
 public static void  PostTraversal(BinaryTreeNode root) {
	  
	  if( root != null) {
		  
		  PostTraversal(root.left);
		  PostTraversal(root.right);
		  System.out.print(root.data + " ");
	  }
  }
 
 // Height of tree
  public static int height(BinaryTreeNode root) {
	  
	  if(root == null)
		  return 0;
	  
	  return Math.max(height(root.left), height(root.right)) +1;
  }
  
  
  
  
  //Size of binary tree
  public static int sizeBinaryTree(BinaryTreeNode root) {
	  
	     if(root == null)
	    	  return 0;
	     
	     return sizeBinaryTree(root.left) + sizeBinaryTree(root.right) + 1;
  }
  
  
  
  
  //Find Maximum Number 
  public static int MaxNumber(BinaryTreeNode root) {
	  
	     if(root == null)
	    	  return Integer.MIN_VALUE;
	     
	     int l = MaxNumber(root.left);
	     int r = MaxNumber(root.right);
	     
  return Math.max((int) root.data, Math.max(l, r));
}
  
  
  
  //find Minmum Number
  public static int MinNumber(BinaryTreeNode root) {
	  
	     if(root == null)
	    	  return Integer.MAX_VALUE;
	     
	     int l = MinNumber(root.left);
	     int r = MinNumber(root.right);
	     
return Math.min((int) root.data, Math.min(l, r));
}
  
  
  
  // Print Order traversel
  public static void PrintOrderTraversal(BinaryTreeNode root) {
	 
	  Queue<BinaryTreeNode> q = new LinkedList<>();
	  
	  q.add(root);
	  q.add(null);
	  
	  while(!q.isEmpty()) {
		  
		  BinaryTreeNode curr = q.poll();
		  
	       if(curr == null) {
	    	   
	    	   if(q.isEmpty())
	    		   return;
	    	   
	    	   q.add(null);
	    	   System.out.println();
	    	   continue;
	       }
	       
	     System.out.print(curr.data + " ");
	     
	     if(curr.left != null) {
	    	 q.add(curr.left);
	     }
	      
	     if(curr.right != null) {
	    	 q.add(curr.right);
	     }
	  
	  }
	  
  }
  
  //Sum of Binary Tree Node
private static   int sum =0;
public static int getSum(BinaryTreeNode<Integer> root) {
         
         if(root == null){
             return 0;
         }
         
           sum += root.data;
         getSum(root.left);
         getSum(root.right);
       
         
         return sum;
    }



private  static int count ;
	public static int countNodesGreaterThanX(BinaryTreeNode<Integer> root, int x) {
		//Your code goes here
       
       if(root == null){
           return -1;
       }
       
       if(root.data > x){
           count++;
       }
       
       countNodesGreaterThanX( root.left, x);
       countNodesGreaterThanX( root.right, x);
       
           return count;
	}
	
	public static void main(String[] args) {
		
		// 1 3 7 -1 -1  11 -1 -1 5 17 -1 -1 -1
		BinaryTreeNode<Integer> root = null;
		
		root = BuildTree(root);
		
//		InorderTraversal(root);
//		System.out.println();
//		PreorderTraversal(root);
//		System.out.println();
//		PostTraversal(root);
//		System.out.println();
//		System.out.println(height(root));
		
//	      System.out.println(sizeBinaryTree(root));
//	      System.out.println(MaxNumber(root));
//	      System.out.println(MinNumber(root));
		
		PrintOrderTraversal(root);
//		2 4 5 6 -1 -1 7 20 30 80 90 -1 -1 -1 -1 -1 -1 -1 -1
	}
	
}

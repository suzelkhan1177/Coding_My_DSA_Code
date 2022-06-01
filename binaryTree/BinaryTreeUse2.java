package binaryTree;

import java.util.*;

//class BinaryTreeNode<T>{
//
//	 T data;
//	 BinaryTreeNode<T> left;
//	 BinaryTreeNode<T> right;
//	 
//	 public BinaryTreeNode(T data) {
//		 this.data = data;
//		 left = null;
//		 right = null;
//	 }
//}

class Height{
	int height =0;
}

public class BinaryTreeUse2 {
	
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
	  
	  
	  // Print Node of Depth k
	  
	  public static void printNodeOfDepth(BinaryTreeNode root, int k) {
		  
		  if(root == null) {
			  return;
		  }
		  
		  if(k==0) {
			  System.out.print(root.data + " ");
		  }
		  printNodeOfDepth(root.left,  k-1);
		  printNodeOfDepth(root.right,  k-1);
		  
	  }
	  
	// Serch Element in Tree
	  public static boolean isNodePresent(BinaryTreeNode<Integer> root, int x) {
			 
          if(root == null){
               return false;
           }
       if(root.data == x){
          return true;
      }
      boolean ans1=  isNodePresent(root.left, x);
      if(ans1) return true;
      
      boolean ans2 =   isNodePresent(root.right, x);
      return ans2;
	}
	  
	
	  // Print all nodes that don’t have sibling
	  public static void printNodesWithoutSibling(BinaryTreeNode<Integer> root) {
//			
//		    Sample Input 1:
//			  5 6 10 2 3 -1 -1 -1 -1 -1 9 -1 -1
//			  Sample Output 1:
//			  9    
		  
	         if(root == null){
	             return;
	         }
	        
	        if(root.left != null & root.right != null){
	            
	            printNodesWithoutSibling(root.left);
	            printNodesWithoutSibling(root.right);
	            
	        }else if(root.right != null){
	            
	            System.out.print(root.right.data + " ");

	            printNodesWithoutSibling(root.right);
	            
	        }else if(root.left != null){
	            
	            System.out.print(root.left.data + " ");

	            printNodesWithoutSibling(root.left);
	            
	        }
		}
	 
	 //Remove leaf Node
public static  BinaryTreeNode removeLeafNodes(BinaryTreeNode root) {
	
	if(root == null){
        return null;
    }
	
    if(root.left == null && root.right == null){
        return null;
    }
    
   root.left = removeLeafNodes( root.left);
   root.right = removeLeafNodes( root.right);
    return root;
}

//Mirror Binary Tree
public static void mirrorBinaryTree(BinaryTreeNode<Integer> root){
	//Your code goes here
    if(root == null){
        return ;
    }
    
    Queue<BinaryTreeNode> q = new LinkedList<>();
    
    q.add(root);
    
     while(! q.isEmpty()){
         
          BinaryTreeNode curr = q.peek();
          q.remove();
         
         BinaryTreeNode temp = curr.left;
           
         curr.left = curr.right;
         curr.right = temp;
         
         if(root.left != null){
             mirrorBinaryTree( root.left);
         }
         
          if(root.right != null){
             mirrorBinaryTree( root.right);
         }
         
     }

}

//Diameter Of Binary Tree
static  int ans =0;
public static int heightDiameter(BinaryTreeNode<Integer> root){
    
       if(root == null){
        return 0;
    }
    
    int lh = heightDiameter( root.left);
    int rh = heightDiameter(root.right);
    
    ans = Math.max(ans, 1+lh+rh);
    
    return 1 + Math.max(lh, rh);
}

public static int diameterOfBinaryTree(BinaryTreeNode<Integer> root){
	
    heightDiameter(root);
    
    return ans;
    
}

//checked tree is Balanced

public static boolean isBalanced(BinaryTreeNode root, Height ht) {
	
	if(root == null) {
		ht.height =0;
		return true;
	}
	
	
	//Height left and right
    Height lh = new Height();
    Height rh = new Height();
    
    boolean left = isBalanced(root.left , lh);
    boolean right = isBalanced(root.right , rh);
    
    int l = lh.height;
    int r = rh.height;
    
    ht.height = Math.max(l, r) +1;
    
    if(Math.abs(l-r) >= 2) {
    	return false;
    }else{
    	
    	return left && right;
    }
}

	public static void main(String[] args) {
		
		Height ht = new Height();
		// 1 3 7 -1 -1  11 -1 -1 5 17 -1 -1 -1
				BinaryTreeNode<Integer> root = null;
				
				root = BuildTree(root);
				
//				/System.out.println(isBalanced(root, ht));
//				printNodeOfDepth(root, 1);
				PrintOrderTraversal(root);
//				removeLeafNodes(root);
//				
//				System.out.println();
//				PrintOrderTraversal(root);
				
				
				
	}

}

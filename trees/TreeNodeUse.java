package trees;

import java.util.*;
public class TreeNodeUse {
	
	
	public static int numberOfNodes(TreeNode<Integer> root) {
		
		  int count =1;
		  for(int i=0; i<root.children.size(); i++) {
			  int child = numberOfNodes(root.children.get(i));
			  
			  count += child;
		  }
		  
		  return count;
	}
	
	static int sum;
	public static int sumOfAllNode(TreeNode<Integer> root){
		
		  sum += root.data;
		for(int i=0; i<root.children.size(); i++) {
			 
			 TreeNode<Integer> child = root.children.get(i);
			 sumOfAllNode(child);
		 }
		
		return sum;
	}
	
	
	public static void  printTree(TreeNode<Integer> root) {
		
//		Special case and not  the base case
		
		if(root == null)
			return;
		
		 System.out.print(root.data + " : ");
		 
		 for(int i=0; i<root.children.size(); i++) {
			 System.out.print(root.children.get(i).data + " ");
		 }
		 System.out.println();
		 
		 for(int i=0; i<root.children.size(); i++) {
			 
			 TreeNode<Integer> child = root.children.get(i);
			 printTree(child);
		 }
	}
	

	 public static void main(String[] args) {
		
		 TreeNode<Integer>  root = new TreeNode(4);
		 TreeNode<Integer> node1 = new TreeNode(2);
		 TreeNode<Integer> node2 = new TreeNode(3);
		 TreeNode<Integer> node3 = new TreeNode(1);
		 TreeNode<Integer> node4 = new TreeNode(5);
		 TreeNode<Integer> node5 = new TreeNode(6);
		 
		 root.children.add(node1);
		 root.children.add(node2);
		 root.children.add(node3);
		 
		 node2.children.add(node4);
		 node2.children.add(node5);
		 
//		 printTree(root);
//		 System.out.println(numberOfNodes(root));
//		 System.out.println(sumOfAllNode(root));
//		 printLevelWise(root);
	
		 
		 
	}
}

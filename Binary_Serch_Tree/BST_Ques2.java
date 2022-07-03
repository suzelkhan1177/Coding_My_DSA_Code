package Binary_Serch_Tree;

import java.util.*;
public class BST_Ques2 {

	
	//Question 1 
//	Find path in BST
	
	public static ArrayList<Integer> getPath(BinaryTreeNode<Integer> root, int data){
		
        if(root == null){
            
            return null;
        }
     
    
       if(root.data == data){
            ArrayList<Integer> output = new ArrayList<>();
           output.add(root.data);
           return output;
       }
     
     ArrayList<Integer> LeftOutput = getPath(root.left, data);
       if(LeftOutput != null){
           LeftOutput.add(root.data);
           return LeftOutput;
       }
     
        ArrayList<Integer> rightOutput =  getPath(root.right, data);
       if(rightOutput != null){
           rightOutput.add(root.data);
           return rightOutput;
       }
     
     return null;
	}
	
	public static BinaryTreeNode<Integer> LCAinaBST(BinaryTreeNode<Integer> root, BinaryTreeNode<Integer> p,
			BinaryTreeNode<Integer> q) 
    {		
         if( root == null) return null;
        
        if(root.data < p.data && root.data < q.data){
            return LCAinaBST(root.right , p , q);
        }
        
        if(root.data > p.data && root.data > q.data){
            return LCAinaBST(root.left , p , q);
        }
        
        return root;
	}
}

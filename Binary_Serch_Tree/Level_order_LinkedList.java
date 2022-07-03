package Binary_Serch_Tree;

import java.util.*;

import javax.naming.Name;
public class Level_order_LinkedList {

	public static ArrayList<LinkedListNode<Integer>> constructLinkedListForEachLevel(BinaryTreeNode<Integer> root){
	
         if (root == null) {
            return null;		
        }	
         
        Queue<BinaryTreeNode<Integer>> q = new LinkedList<BinaryTreeNode<Integer>>();		
        q.add(root);				
        int level = 1;	    
        int Count = 0;	    		
        LinkedListNode<Integer> Head = null;		
        LinkedListNode<Integer> Tail = null;		
        ArrayList<LinkedListNode<Integer>> output = new ArrayList<>();		
        while (!q.isEmpty()) {
            BinaryTreeNode<Integer> currNode = q.remove();	
            LinkedListNode<Integer> newNode = new LinkedListNode<Integer>(currNode.data);				
            if (Head == null) {					
                Head = newNode;
                Tail = newNode;
            }
            else {
                Tail.next = newNode;
                Tail = newNode;
            }
            if (currNode.left != null) {
                q.add(currNode.left);
                Count++;
            }
            if (currNode.right != null) {
                q.add(currNode.right);
                Count++;
            }	
            level--;
            if (level == 0) {
                output.add(Head);
                Head = null;
                Tail = null;
                level = Count;
                Count=0;
            }
        }
        return output;
    }
 
}

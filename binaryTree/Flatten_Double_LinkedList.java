package binaryTree;

public class Flatten_Double_LinkedList {

	public static void flatten(Node root)
    {
       Node curr = root;
       
       while(curr != null){
           
           if(curr.left != null){
               
               Node prev = curr.left;
               
               while(prev.right != null)
               prev = prev.right;
               
               prev.right = curr.right;
               curr.right =  curr.left;
               curr.left = null;
           }
           
           curr = curr.right;
       }
}

package Binary_Serch_Tree;

class LinkedListNode<T> {
    T data;
    LinkedListNode<T> next;
    
    public LinkedListNode(T data) {
        this.data = data;
    }
}

public class Assinment_1 {
   
	
//	Question 1
	
	// Binary Serch tree  To LinkedList
	public static LinkedListNode<Integer> constructLinkedList(BinaryTreeNode<Integer> root) {

        if(root == null)
          return null;
        LinkedListNode<Integer> newHead = constructLinkedList(root.left);
       LinkedListNode<Integer> temp = newHead;
       
        if(newHead == null)
         newHead = new LinkedListNode<>(root.data);
        else
       {           
         while(temp != null && temp.next != null)
       {

         temp = temp.next;
         }
        temp.next = new LinkedListNode<>(root.data);
     
     }
     
      LinkedListNode<Integer> rightHead = constructLinkedList(root.right);
     if(newHead.next == null)
     newHead.next = rightHead;
     else
     temp.next.next = rightHead;
     return newHead;
	}
	
	
	
//	Question 2
	
	//find Lower commen ASSIstor
	 public static BinaryTreeNode LCA(BinaryTreeNode<Integer> root, int a, int b) {
			
          if(root == null)
              return null;
       
        if(root.data == a || root.data == b)
            return root;
       
       
         BinaryTreeNode left = LCA(root.left , a , b);
        BinaryTreeNode right = LCA(root.right , a , b);
       
       if(left == null)
           return right;
       
       if(right == null)
           return left;
       
       return root;
	}
	
	public static int getLCA(BinaryTreeNode<Integer> root, int a, int b) {
		
		 if(root == null)
             return -1;
		
        BinaryTreeNode ans = LCA(root, a, b);
       
       return  (int) ans.data;
	}
	
	// Question 3
	
	//Replace with Sum of greater nodes
	
	  static int sum = 0;
		public static void replaceWithLargerNodesSum(BinaryTreeNode<Integer> root) {
			
	        if(root == null)
	            return;
	        replaceWithLargerNodesSum(root.right);
	          sum = sum + root.data;
	           root.data = sum ;
	        
	        replaceWithLargerNodesSum(root.left);
	         
	       }
	
	
	
	
}

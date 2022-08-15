package Full_Test_2;


//Input:
//8 1 2 2 4 5 6 7 8 4
//
//Output:
//4 2 2 1 8 7 6 5
//
//Explanation:
//Since, k = 4. So, we have to reverse every group of two elements.
//Modified linked list is as 4, 2, 2, 1, 8, 7, 6, 5.
public class Reverse_LinkedList {
	
	class Node{
	    int data;
	    Node next;
	    Node (int key)
	    {
	        data=key;
	        next=null;
	    }
	}
	
	 public static Node reverse(Node head, int k)
	    {
	      
	         if(head == null)
	             return null;
	        
	        if(k== 0)
	        return head;
	        
	        Node curr = head;
	        Node next = null;
	        Node prev = null;
	        
	        int count =0;
	        
	        while(count < k && curr != null){
	            
	              next = curr.next;
	              curr.next = prev;
	            
	            prev = curr;
	            curr = next;
	            
	            count++;
	        }
	        
	        if(next != null)
	           head.next = reverse(next, k);
	        
	        
	        return prev;
	        
	     }

}


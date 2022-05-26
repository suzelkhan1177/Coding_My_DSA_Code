package Test5;

public  class Next_Number_Q2 {

public  static	class LinkedListNode<T> {
		T data;
		LinkedListNode<T> next;

		public LinkedListNode(T data) {
			this.data = data;
		}
	}
 
//   Input format :
//	 Line 1 : Linked list elements (separated by space and terminated by -1)
//	 
//	 Output Format :
//	 Line 1: Updated linked list elements 
 
//  Sample Input 1 :
//	 3 9 2 5 -1
//	 Sample Output 1 :
//	 3 9 2 6
//	 
//	 Sample Input 2 :
//	 9 9 9 -1
//	 Sample Output 1 :
//	 1 0 0 0 


	public class Solution {
	    
	    
	   public LinkedListNode<Integer> rev(LinkedListNode<Integer> node) {
	    
	       LinkedListNode<Integer> previous = null;  
	LinkedListNode<Integer> curr = node;  
	LinkedListNode<Integer> next = null;  
	  
	  
	     while (curr != null)   
	    {  
	     next = curr.next;  
	    curr.next = previous;  
	    previous = curr;  
	    curr = next;  
	    }  
	   node = previous;  
	   return node;  

		}

		public  LinkedListNode<Integer> nextLargeNumber(LinkedListNode<Integer> head) {
	   
	        if(head == null){
	             return null;
	        }
	        
	       head= rev(head);
	    boolean b = true;
	        LinkedListNode<Integer>  curr = head;
	        
	        while(curr != null && b == true){
	            
	            if(curr.next == null && curr.data == 9){
	                curr.data = 1;
	                LinkedListNode<Integer>  temp = new LinkedListNode<Integer>(0);
	                temp.next = head;
	                head = temp;
	                curr = curr.next;
	                
	            }else if(curr.data == 9){
	                
	                curr.data = 0;
	                curr = curr.next;
	                
	            }else{
	                
	                curr.data = curr.data +1;
	                curr = curr.next;
	                b = false;
	            }
	            
	            
	        }
	       
	        
	       head = rev(head);
	        
	        return head;
		}

}

package Test5;

import Test5.Next_Number_Q2.LinkedListNode;

public class sort_LinkedList_Q3 {
	
	public  static	class LinkedListNode<T> {
		T data;
		LinkedListNode<T> next;

		public LinkedListNode(T data) {
			this.data = data;
		}
	}
	
//	   Input format :
//		Line 1 : Linked list elements of length L (separated by space and terminated by -1)
//		Line 2 : Integer n
//		Output format :
//		Updated list elements (separated by space)
//		Sample Input 1 :
//		10 40 53 30 67 12 89 -1
//		Sample Output 1 :
//		10 12 30 40 53 67 89 
   
public static LinkedListNode<Integer> midLL(LinkedListNode<Integer> head) {
        
        LinkedListNode<Integer> fast = head;
        LinkedListNode<Integer> slow = head;
        
        while(fast.next != null && fast.next.next != null){
            
            fast = fast.next.next;
            slow = slow.next;
        }
        
        return slow;
    }

	public static LinkedListNode<Integer> sort(LinkedListNode<Integer> head) {
		//Your code goes here
        
          if(head == null || head.next == null ){
            return head;
        }
        
        
             //find mid point or break tha linked List
         	LinkedListNode<Integer> mid = midLL(head);
        
         LinkedListNode<Integer> left = head;
        LinkedListNode<Integer> right = mid.next;
         mid.next = null;
            
        left = sort(left);
        right = sort(right);
        
        LinkedListNode<Integer> result = merge(left,right);
        
        return result;
	}
    
     public static LinkedListNode<Integer> merge(LinkedListNode<Integer> head1, LinkedListNode<Integer> head2) {
     
        
        
        if(head1 == null){
            return head2;
        }
        
        if(head2 == null){
            return head1;
        }
        
        LinkedListNode<Integer> t1 = head1, t2 = head2;
        LinkedListNode<Integer> head = null , tail = null;
        
          if(t1.data <= t2.data){
              head = t1;
              tail = t1;
              t1 = t1.next;
          }else{
              head = t2;
              tail = t2;
              t2 = t2.next;
          }
        
        while(t1 != null && t2 != null){
            
            if(t1.data <= t2.data){
                
                tail.next = t1;
                tail = t1;
                t1 = t1.next;
                
            }else{
               
                tail.next = t2;
                tail = t2;
                t2 = t2.next;
            }
        }
        
        if(t1 != null){
            tail.next = t1;
        }
        
        if(t2 != null){
          tail.next = t2;
        }
        
        return head;
    }
}

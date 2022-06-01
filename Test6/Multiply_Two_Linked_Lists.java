package Test6;

class LinkedListNode<T> {
    T data;
    LinkedListNode<T> next;
    
    public LinkedListNode(T data) {
        this.data = data;
        this.next = null;
    }
}
public class Multiply_Two_Linked_Lists {
   
	 private static int length(LinkedListNode<Integer> head) {
	        int len = 0; 
	        while(head != null) {
	            len += 1; 
	            head = head.next; 
	        } 
	        return len; 
	    }
	    private static LinkedListNode<Integer> reverseIteratively(LinkedListNode<Integer> head) {
	        if(head == null) { 
	            return null; 
	        } 
	        LinkedListNode<Integer> prev = null;
	        LinkedListNode<Integer> curr = head; 
	        LinkedListNode<Integer> currNext = curr.next;
	        
	        while(curr != null && currNext != null) { 
	            curr.next = prev;
	            prev = curr; 
	            curr = currNext; 
	            currNext = currNext.next;
	        } 
	        if(curr != null) { 
	            curr.next = prev;
	            prev = curr; 
	        } 
	        return prev; 
	    }
	    
	    private static LinkedListNode<Integer> makeLLOfSize(int n) {
	        int nc = 0; 
	        LinkedListNode<Integer> head = null;
	        LinkedListNode<Integer> tail = null;
	        while(nc < n) { 
	            LinkedListNode<Integer> newNode = new LinkedListNode<>(0);
	            if(head == null) {
	                head = newNode;
	                tail = newNode;
	            } else {
	                tail.next = newNode;
	                tail = newNode;
	            }
	            nc += 1;
	        } 
	        return head;
	    }
	    
	    private static LinkedListNode<Integer> addFirst(LinkedListNode<Integer> head) {
	        LinkedListNode<Integer> newNode = new LinkedListNode<>(0);
	        if(head == null) {
	            head = newNode; 
	        } else { 
	            newNode.next = head;
	            head = newNode; 
	        } return head;
	    }
	    
	    public static void multiply(LinkedListNode<Integer> head1, LinkedListNode<Integer> head2) {
	       
	        head1 = reverseIteratively(head1);
	        head2 = reverseIteratively(head2); 
	        int len1 = length(head1); 
	        int len2 = length(head2); 
	        LinkedListNode<Integer> first = head1;
	        LinkedListNode<Integer> second = head2;
	        int carry = 0; 
	        LinkedListNode<Integer> res1 = makeLLOfSize(len1+len2+1); 
	        while(second != null) {
	            LinkedListNode<Integer> res2 = makeLLOfSize(len1+len2+1); 
	            first = head1;
	            LinkedListNode<Integer> temp2 = res2;
	            LinkedListNode<Integer> temp1 = res1; 
	            carry = 0;
	            while(first != null) {
	                int ans=temp1.data + carry + second.data * first.data;
	                temp2.data = ans % 10;
	                carry = ans/10; 
	                temp2 = temp2.next; 
	                temp1 = temp1.next;
	                first = first.next; 
	            } 
	            if(carry!=0){
	                int ans=temp1.data + carry; 
	                temp2.data = ans;
	            }
	            res1 = res2; 
	            head1 = addFirst(head1);
	            second = second.next;
	        } 
	        res1 = reverseIteratively(res1);
	        printL(res1);
	    }
	    private static void printL(LinkedListNode<Integer> head) {
	      
	        
	        while(head.data == 0) { 
	            head = head.next;
	        } 
	        while(head != null) {
	            System.out.print(head.data + " ");
	            head = head.next;
	        }
	        System.out.println();
	            
	    }
}

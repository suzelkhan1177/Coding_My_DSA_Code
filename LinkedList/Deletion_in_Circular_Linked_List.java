
// Sample Input 1:
// 3
// 10 20 30 40 -1
// 20
// 8 9 8 -1
// 8
// 4 -1
// 4
// Sample Output 1:
// 10 30 40 -1
// 9 8 -1
// -1

public class Solution {
	public static Node deleteNode(Node head, int val) {
	
	// only one node
           if(head.next == head){
              if(head.data == val){
				  return null;
			  }
			     return head;
		   }


       //  head is deleted
      if(head.data == val){
            Node tail = head;
			while(tail.next != head){
				 tail = tail.next;
			}
			tail.next = head.next;
			head = tail.next;
			return head;
	  }

      Node curr = head;
	  while(curr.next != head && curr.next.data != val){
		  curr = curr.next;
	  }

	  //data not presnt 
	  if(curr.next.data != val){
		  return head;
	  }

    Node temp = curr.next;
   curr.next = temp.next;

  return head;

	}
}

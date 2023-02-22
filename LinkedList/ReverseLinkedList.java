
	public static Node reverseLinkedList(Node head) 
	{

		//Recurcive Approche 1

		if(head == null || head.next == null){
            return head;
        }

		Node newHead =reverseLinkedList(head.next);

	   head.next.next = head;
	   head.next = null;
	   return newHead;

  // Iterative Approch 2
    
	  if(head == null || head.next == null){
            return head;
        }
         ListNode prev = head;
        ListNode curr = head.next;
        
        while(curr != null){
            //store head next element
           ListNode temp = curr.next; 

            //curr element reveres
            //   4 -> 5
            //   4 <- 5 
            curr.next = prev;

        // update
            prev = curr;
            curr = temp;
        }
        head.next = null;
        head = prev;
        return head;


  // Iterative Approch 3

         Node prev = null;
		 Node curr = head;

		 while(curr != null){
			Node next = curr.next;
			  curr.next = prev;

			  prev = curr;
			  curr = next;
		 }

		 head = prev;
		 return head;
    
    
    
    

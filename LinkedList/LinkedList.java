
class LinkedListNode<T> {
    	T data;
    	LinkedListNode<T> next;
    
    	public LinkedListNode(T data) {
        	this.data = data;
    	}
	}


public static LinkedListNode<Integer> insert(LinkedListNode<Integer> head, int pos, int data){
		//Your code goes here
        LinkedListNode<Integer> nodeNext = new LinkedListNode<Integer>(data);
        
        if(pos == 0){
            nodeNext.next = head;
            return nodeNext;
            
        }else{
        
        int count =0;
        LinkedListNode<Integer> prev = head;
        while(count < pos -1 && prev != null){
            count++;
            prev = prev.next;
        }
        if( prev != null){
        nodeNext.next = prev.next;
        prev.next = nodeNext;
         }
        }
        return head;
	}
	
	
	
	public static LinkedListNode<Integer> deleteNode(LinkedListNode<Integer> head, int pos) {
		// Write your code here.
        
        if(head== null)
            return head;
        
        if(pos ==0){
            head = head.next;
            return head;
        }else{
            int count =0;
            LinkedListNode<Integer> prev = head;
            while(count < pos -1 && prev.next != null){
                count++;
                prev = prev.next;
            }
            if(prev.next != null)
                prev.next = prev.next.next;
         
        }
        return head;
	}





public static void printReverse(LinkedListNode<Integer> head) {
	    
          if(head == null){
              return;
          }
        printReverse( head.next);
        System.out.print(head.data +" ");

	}

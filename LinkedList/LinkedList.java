
class LinkedListNode<T> {
    	T data;
    	LinkedListNode<T> next;
    
    	public LinkedListNode(T data) {
        	this.data = data;
    	}
	}

public static LinkedListNode<Integer> removeDuplicates(LinkedListNode<Integer> head) {
		
        if(head == null || head.next == null)
            return head;
 
        LinkedListNode<Integer> prev = head;    
        LinkedListNode<Integer> p = head.next;
 
        while(p != null){
            if(p.data.compareTo(prev.data) == 0)//compare non primitive dataType like this not using == (VERY IMPORTANT THING TO NOTE)
            {
                prev.next = p.next;
                p = p.next;
            }
            else{
                prev = p;
                p = p.next; 
            }
        }
       return head;
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

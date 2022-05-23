
class LinkedListNode<T> {
    	T data;
    	LinkedListNode<T> next;
    
    	public LinkedListNode(T data) {
        	this.data = data;
    	}
}

public static LinkedListNode<Integer> skipMdeleteN(LinkedListNode<Integer> head, int m, int n) {
		
          if(head==null)
            return head;
          if(m==0)
            return null;
        if(n==0)
            return head;
      
         LinkedListNode<Integer> curr = head ,t;
          int count;
        
        while(curr != null){
            
            for(count = 1; count < m && curr != null; count++){
                curr = curr.next;
            }
            
            if(curr == null)
                return head;
            
              t = curr.next;
            for(count =1; count <=n && t != null; count++){
                
                   LinkedListNode<Integer> temp = t;
                t = t.next;
            }
            
            
            curr.next = t;
            curr = t;
             
        }
        
      
        
        return head;
        
	}


public static LinkedListNode<Integer> evenAfterOdd(LinkedListNode<Integer> head) {
		LinkedListNode<Integer> oddHead = null;
        LinkedListNode<Integer> oddTail = null;
        
        LinkedListNode<Integer> evenHead = null;
        LinkedListNode<Integer> evenTail = null;
        
        LinkedListNode<Integer> temp = head;
        
        while(temp != null){
            
              if(temp.data%2 == 0){
                  
                    if(evenHead == null){
                      evenHead = temp;
                        evenTail = evenHead;
                  }else{
                      evenTail.next = temp;
                      evenTail = evenTail.next; 
                  }
                  
              }else{
                  
                  if(oddHead == null){
                      oddHead = temp;
                      oddTail = oddHead;
                  }else{
                      oddTail.next = temp;
                      oddTail = oddTail.next; 
                  }
              }
            temp = temp.next;
        }
        
       if(oddHead == null){
           return evenHead;
       }
        
      if(evenHead == null){
          return oddHead;
      }
        
        oddTail.next = evenHead;
        evenTail.next = null;
        head = oddHead;
        return head;
        
	}


public static LinkedListNode<Integer> mergeSort(LinkedListNode<Integer> head) {
		
        if(head == null || head.next == null ){
            return head;
        }
        
        
             //find mid point or break tha linked List
         	LinkedListNode<Integer> mid = midLL(head);
        
         LinkedListNode<Integer> left = head;
        LinkedListNode<Integer> right = mid.next;
         mid.next = null;
            
        left = mergeSort(left);
        right = mergeSort(right);
        
        LinkedListNode<Integer> result = merge(left,right);
        
        return result;
        
	}


 public static LinkedListNode<Integer> mergeTwoSortedLinkedLists(LinkedListNode<Integer> head1, LinkedListNode<Integer> head2) {
        //Your code goes here
        
        
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



public static LinkedListNode<Integer> appendLastNToFirst(LinkedListNode<Integer> head, int n) {
		
        if(head == null)
            return null;
        
        if(n == 0)
        return head;
        
        LinkedListNode<Integer> newTail = null;
        LinkedListNode<Integer> newHead = null;
        LinkedListNode<Integer> tail = head;
        
        int l = length(head);
        int count =1;
        n = n%l;
        
        while(tail.next != null){
            
            if(count == l-n){
                newTail = tail;
            }
            
            if(count == l-n+1){
                
                newHead = tail;
            }
            
            tail = tail.next;
            count++;
        }
        
        newTail.next = null;
        tail.next = head;
        
        return newHead;
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

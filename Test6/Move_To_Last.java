package Test6;

public class Move_To_Last {
   

	public static LinkedListNode<Integer> func(LinkedListNode<Integer> head,int key) {
      
		LinkedListNode<Integer> prev = head;
		LinkedListNode<Integer> temp = head;
        
        while(temp != null){
            
            
            if(temp != prev && temp.data != key){
                
                prev.data = temp.data;
                temp.data = key;
                prev = prev.next;
            }
            
            
            if(prev.data != key)
              prev = prev.next;
            
            
              temp = temp.next;
            
        }
        
       		
        return head;
	}

}

package queue;

public class QueueUsing {

	public static void main(String[] args) {

//              QueueImpArray q = new QueueImpArray();
		      QueueImpLinkedList<Integer> q = new QueueImpLinkedList<>();
              
              int arr[] = {10 ,20 ,30 ,40 ,50};
              
              for(int elm : arr) {
            	  
            	    try {
            	    	q.enqueue(elm);
            	    }catch(Exception e){
            	    	
            	    }
              }
              
              
              while(!q.isEmpty()) {
            	  
            	  try {
          	      System.out.println(q.dequeue());
          	    }catch(Exception e){
          	    	
          	    }
              }
              
              
//              q.enqueue(10);
//              q.enqueue(20);
//              q.enqueue(30);
//              q.enqueue(40);
//              q.enqueue(50);
              
//              System.out.println(q.size());
//                System.out.println(  q.dequeue());
//              System.out.println(q.front());
//              System.out.println(q.rear());
//              System.out.println(q.size());
              
	}

}

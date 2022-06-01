package queue;

import java.util.*;
public class QueueImpStack{
    
	 private   Queue<Integer> q1;
		private   Queue<Integer> q2;
		private int size;
		   
		   public QueueImpStack() {
			   
			   q1 = new  LinkedList<>();
			   q2 = new  LinkedList<>();
	           size =0;
		   }

		    public int getSize() { 
		      
		       return size;
		    }

		    public boolean isEmpty() {
		       
		    	return q1.isEmpty();
		    }

		    public void push(int elm) {
		        
		    	   q1.add(elm);
	               size++;
		    }

		    public int pop(){
	            
	            if(q1.isEmpty()){
	                return -1;
	            }
		       
		    	while(q1.size() != 1){
	                
	                q2.add(q1.peek());
	                q1.poll();
	            }
		    	
		    	int temp = q1.poll();
	              size--;
		    	
	           Queue<Integer> t = q1;
	               
	              q1= q2;
	              q2 = t;
		    	
		    	return temp;
		    }

		    public int top() {
		      
	            if (q1.isEmpty())
	            return -1;
	 
	        while (q1.size() != 1) {
	            q2.add(q1.peek());
	            q1.poll();
	        }
	 
	       
	        int temp = q1.peek();

	        q1.poll();
	 
	   
	        q2.add(temp);
	   
	        Queue<Integer> q = q1;
	        q1 = q2;
	        q2 = q;
	        return temp;
		    }
}

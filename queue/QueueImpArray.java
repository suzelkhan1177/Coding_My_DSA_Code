package queue;

public class QueueImpArray {
	
	 private  int data[];
	 private  int front;
	 
	  private int rear;
	  private int size;
	
	public QueueImpArray() {
		data = new int[2];
		front =-1;
		rear = -1;
	}
	
	public QueueImpArray(int len) {
		data = new int[len];
		front =-1;
		rear = -1;
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size ==0;
	}
	
	
	public void enqueue(int elm) {
		  
		if(size == data.length) {
			dobuleCapacity();
		}
		
		  if(size == 0) {
			 front++;
		  }
//			  rear++;
//			  if(rear == data.length) {
//				  rear = 0;
//			  }
		  rear = (rear +1) % data.length;
			  data[rear] = elm;
			  size++;
		  
	}
	
	private void dobuleCapacity() {
	       
		   int temp[] = data;
		   data = new int[ 2 * data.length];
		   int idx=0;
		   for(int i =front; i<temp.length; i++) {
			   
			     data[idx++] = temp[i];
		   }
		   
		   for(int i =0; i<front -1; i++) {
			   
			     data[idx++] = temp[i];
		   }
		   front =0;
		   rear = temp.length -1;
		   
	}

	public int front() {
		if(size ==0)
			return -1;
		return data[front];
	}
	
    public int rear() {
    	
    	if(size ==0)
			return -1;
		
		return data[rear];
	}
	
	public int dequeue() {
		
		if(size ==0)
			return -1;
		
		 int temp = data[front];
//		 front++;
//		 
//		 if(front == data.length) {
//			  front = 0;
//		  }
		 
		 front = (front + 1) % data.length;
		 size--;
		 
		if(size == 0) {
			front = -1;
			rear = -1;
		}
		 
		 return temp;
	}
	
	 

}

package stack;

public class StackImpArray {
	
	private int data[];
	private int count;
	
	public StackImpArray() {
		
		data = new int[2];
		count =-1;
	}

	public void push(int i){
		
		if(count == data.length -1) {
			
////			StackFullException e = new StackFullException();
////			throw e;
//			throw new StackFullException();
			doubleCapacity();
		}
		
		count++;
		data[count] = i;
		
		
	}
	
	private void doubleCapacity() {
		
		int temp[] = data;
		data = new int[2 * temp.length];
		for(int i=1; i<temp.length; i++) {
			
			data[i] = temp[i];
		}
		
	}

	public int size() {
		
		
		return count +1;
	}
	
	public int  pop(){
		
//		if(count == -1) {
//			throw new StackEmptyException();
//		}
		
		
          int temp = data[count];
             count--;
            return temp;
	}
	
	public boolean isEmpty() {
		
		return count == -1;
	}
	
	public int top() {
		
		return data[count];
	}

}

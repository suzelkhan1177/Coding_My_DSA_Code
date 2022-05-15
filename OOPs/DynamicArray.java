package DynamicArray;

public class DynamicArray {

	   private int data[];
	   private int nextIndex;
	   
	   public DynamicArray() {
		   
		   data = new int[5];
		   nextIndex=0;
	   }
	   
	   public boolean isEmpty() {
		   return nextIndex ==0;
	   }
	   
	   
	   public int size() {
		   return nextIndex;
	   }
	   
	   public int get(int i) {
		   if(i >= nextIndex) {
			   return -1;
		   }
		   return data[i];
	   }
	   
	   
	   public void set(int Idx, int i ) {
		   if(Idx >= nextIndex) {
			   return;
		   }
		   data[Idx] = i;
	   }

	public int removeLast() {
		
		if(nextIndex == 0)
			 return -1;
	
		  int temp = data[nextIndex -1];
		   data[nextIndex -1] =0;
		  return temp;
	}
	
	private void doubleCapacity() {
		
		int temp[] = data;
		data = new int[ 2 * temp.length];
		for(int i=0; i<temp.length; i++) {
			data[i] = temp[i];
		}
	}

	public void add(int elm) {
		
		if(nextIndex == data.length) {
			doubleCapacity();
		}
		
		data[nextIndex] = elm;
		nextIndex++;
	}
	   
	   
}

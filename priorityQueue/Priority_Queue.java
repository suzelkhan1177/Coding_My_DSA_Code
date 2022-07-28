package priorityQueue;

import java.util.*;

import javax.swing.text.html.HTMLDocument.HTMLReader.PreAction;
public class Priority_Queue<T> {
	
	private ArrayList<Element<T>>  heap;
	
	public Priority_Queue() {
		heap = new ArrayList<>();
	}
	
	public void insert(T value, int priority) {
		
		Element<T> e = new Element<>(value ,priority);
		heap.add(e);
		//find child
		int childIndex = heap.size() -1;
		//find child parents
		int parentsIndex = (childIndex -1) /2;
		
		while(childIndex > 	0) {
		//swap tha Value
		if(heap.get(childIndex).priority < heap.get(parentsIndex).priority) {
			
			Element<T> temp = heap.get(childIndex);
			heap.set(childIndex, heap.get(parentsIndex));
			heap.set(parentsIndex, temp);
			childIndex = parentsIndex;
			parentsIndex = (childIndex -1) /2;
		}else {
			return;
		  }
		
		
		}
	}
	
	public T getMin() throws PriorityQueueException {
		if(isEmpty()) {
			 throw new PriorityQueueException();
		}
		
		return heap.get(0).value;
	}
	
	public T removeMin() throws PriorityQueueException {
		if(isEmpty()) {
			 throw new PriorityQueueException();
		}
		
		Element<T>  removed = heap.get(0);
		T ans = removed.value;
		
		heap.set(0,  heap.get( heap.size()-1));
		heap.remove(heap.size()-1);
		
		int parentsIndx = 0;
		int leftChildIndex = 2*parentsIndx+1;
		int rightChildIndex = 2*parentsIndx+2;
		
		
		while(leftChildIndex < heap.size()) {
		int minIndex = parentsIndx;
		
		//compare left child smaler or not
		if(heap.get(leftChildIndex).priority < heap.get(minIndex).priority ) {
			   minIndex = leftChildIndex;
		}
		
		//compare right child smaler or not
		if(rightChildIndex < heap.size() &&  (heap.get(rightChildIndex).priority < heap.get(minIndex).priority )) {
					   minIndex = rightChildIndex;
	   }
		if(minIndex == parentsIndx) {
			break;
		}
		
		Element<T> temp = heap.get(minIndex);
		heap.set(minIndex, heap.get(parentsIndx));
		heap.set(parentsIndx, temp);
		
	      parentsIndx = minIndex  ;
		 leftChildIndex = 2*parentsIndx+1;
	     rightChildIndex = 2*parentsIndx+2;
		}
		
		return ans;
		
	}
	
	public int size() {
		return heap.size();
	}
	
	public boolean isEmpty() {
		if(size() == 0) {
			return true;
		}else {
			return false;
		}
	}

}

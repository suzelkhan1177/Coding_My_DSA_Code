package priorityQueue;

public class MaxHeapify {
	
//	Sample Input 1:
//		6 
//		2 6 8 5 4 3
//		Sample Output 1:
//		8 6 5 4 3 2
	
	public static  void heapify(int arr[], int n, int i ) {
		
		// root element initilaiz
		  int largest = i; 
		  int left = 2 *i +1;  
		  int rigth = 2 *i +2;
		  
		  // left child greater than root
		  if(left < n && arr[left] > arr[largest]) {
			    largest = left;
		  }
		  
		  //rigth child greater then root
		  if(rigth < n && arr[rigth] > arr[largest]) {
			   largest = rigth;
		  }
		  
		  //largest element not root
		  if(largest != i) {
			  int swap = arr[i];
			  arr[i] = arr[largest];
			  arr[largest] = swap;
			  
			  //Recursion call
			  heapify(arr, n, largest);
		  }
	}

}

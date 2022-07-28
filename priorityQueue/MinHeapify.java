package priorityQueue;

public class MinHeapify {

	 public static  void heapify(int arr[], int n, int i ) {
	        
	        // root element initilaiz
	          int smallest = i; 
	          int left = 2 *i +1;  
	          int rigth = 2 *i +2;
	          
	          // left child greater than root
	          if(left < n && arr[left] < arr[smallest]) {
	                smallest = left;
	          }
	          
	          //rigth child greater then root
	          if(rigth < n && arr[rigth] < arr[smallest]) {
	               smallest = rigth;
	          }
	          
	          //largest element not root
	          if(smallest != i) {
	              int swap = arr[i];
	              arr[i] = arr[smallest];
	              arr[smallest] = swap;
	              
	              //Recursion call
	              heapify(arr, n, smallest);
	          }
	    }
		public static int[] buildMinHeap(int[] arr)
		{
	        int n = arr.length;
	        for(int i= n/2-1; i>=0; i--){
	            heapify(arr,n ,i);
	        }
			return arr;
		}
}

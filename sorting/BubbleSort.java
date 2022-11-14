package sorting;

public class BubbleSort {
	
	   public static void bubbleSort(int[] arr, int n) {   
	       
	        for(int i=0; i<n-1; i++){
	            for(int j=i+1; j<n; j++){
	            if(arr[i] > arr[j]){
	                int temp = arr[i];
	                arr[i] = arr[j];
	                arr[j] = temp;
	            }
	            } 
	        }

	    }

	public static void main(String[] args) {

		int arr[] = {3, 7,4,6,1};
	 bubbleSort(arr, arr.length);
		
		for(int i=0; i< arr.length; i++)
		System.out.print(arr[i] + " ");
	}

}

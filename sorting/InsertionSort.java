package sorting;

public class InsertionSort {
	
	public static void insertionSort( int[] arr, int n ) {
		 for(int i=1; i<n; i++){
             //current element 8
             int curr = arr[i];
             
             //position
             int j = i-1;
             
             while(j >= 0){
                 if( arr[j] > curr){
                     //left
                     arr[j+1] = arr[j];
                 }else{
                     break;
                 }
              j--;
             }
             //right
           arr[j+1] = curr ;
         }
	}
	
	public static void main(String[] args) {

		int arr[] = {3, 7,4,6,1};
	 insertionSort(arr, arr.length);
		
		for(int i=0; i< arr.length; i++)
		System.out.print(arr[i] + " ");
	}

}

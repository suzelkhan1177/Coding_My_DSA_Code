package sorting;

public class MergeSort {
	
	public static void divide(int arr[], int st, int ed) {
		
		if(st >= ed) {
			return;
		}
		
		int mid = st + (ed -st) /2;
		divide(arr, st , mid);
		divide(arr, mid +1, ed);
        mergeSort(arr, st , mid, ed);	
	}
	
	public static  void mergeSort(int arr[], int st, int mid,  int ed) {
		
		int merge[] = new int[ed-st+1];
		int idx1 = st;
		int idx2 = mid+1;
		int x =0;
		
		while(idx1 <= mid && idx2 <= ed) {
			   if(arr[idx1] <= arr[idx2]) {
				 merge[x++] = arr[idx1++];
				   
			     }else {
				   merge[x++] = arr[idx2++];
			   }
		    }
		
		while(idx1 <= mid) {
			merge[x++] = arr[idx1++];
		}
		
		while(idx2 <= ed) {
			merge[x++] = arr[idx2++];
		}
		
	  for(int i=0, j=st;  i<merge.length; i++, j++) {
		  arr[j] = merge[i];
	  }
		
	}
	

	public static void main(String[] args) {
		int arr[] = {3, 7,4,6,1};
	 divide(arr, 0,  arr.length-1);
		
		for(int i=0; i< arr.length; i++)
		System.out.print(arr[i] + " ");
	}

}

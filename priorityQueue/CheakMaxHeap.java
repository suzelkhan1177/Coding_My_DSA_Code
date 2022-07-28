package priorityQueue;

public class CheakMaxHeap {
//	   Sample Input 1:
//		8
//		42 20 18 6 14 11 9 4
//		Sample Output 1:
//		true
	
	public static boolean checkMaxHeap(int arr[]) {
		   
        int n = arr.length;
        
        for(int i=0; i<=(n-2)/2; i++){
            
            //left child is greater
            if(arr[2 *i +1] > arr[i])
                return false;
            
             //right child is greater
            if( 2*i+2  < n  && arr[2*i+2] > arr[i])
                return false;
             
        }
        return true;
	}

}

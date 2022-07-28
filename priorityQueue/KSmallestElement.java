package priorityQueue;

import java.util.*;
public class KSmallestElement {
//	   Sample Input 1 :
//		13
//		2 12 9 16 10 5 3 20 25 11 1 8 6 
//		4
//		Sample Output 1 :
//		1 2 3 5    
	public static ArrayList<Integer> kSmallest(int n, int[] arr, int k) {
	       ArrayList<Integer> list = new ArrayList<>();
	         //max heap
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
	        
	        for(int i=0; i<arr.length; i++){
	            if(i < k){
	                pq.add(arr[i]);
	            }else{
	               if( arr[i] < pq.peek()){
	                     pq.remove();
	                     pq.add(arr[i]);
	                 }
	            }
	        }
	        
	         while(pq.size()  > 0){
	             list.add(pq.remove());
	         }
			return list;
		}
}

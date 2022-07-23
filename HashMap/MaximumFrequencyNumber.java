package HashMap;

import java.util.HashMap;
public class MaximumFrequencyNumber {
//	   Sample Input 1 :
//		13
//		2 12 2 11 12 2 1 2 2 11 12 2 6 
//		Sample Output 1 :
//		2
	
	 public static int maxFrequencyNumber(int[] arr){ 
		  
		  HashMap<Integer, Integer> map = new HashMap<>();
		    
	       for(int key : arr) {
	    	   
	    	   if(!map.containsKey(key)) {
	    		   map.put(key,1);
	    		  }
	    		  else {
	    		   map.put(key, map.get(key)+1);
	    		  } 
	       }
	       
	       int maxKey = Integer.MIN_VALUE;
	       int maxValue = 0;
	      for(int key : arr) {
	    	   if(map.get(key) > maxValue) {
	    	
	    		  maxValue = map.get(key);
	    		  maxKey = key;
	    	  }
	      }
       
       return maxKey;
    }


	public static void main(String[] args) {
		
		int arr[] = {2, 12, 2, 11, 12, 2, 1 ,2, 2, 11, 12, 2, 6};
		
		 System.out.println(maxFrequencyNumber(arr));

	}
}

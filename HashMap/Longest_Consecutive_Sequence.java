package HashMap;

import java.util.*;
public class Longest_Consecutive_Sequence {

   public static ArrayList<Integer> longestConsecutiveIncreasingSequence(int[] arr) {
		ArrayList<Integer> ans = new ArrayList<>();
	    HashMap<Integer,Boolean> map = new HashMap<>();
	    
	    for(int val : arr) {
	    	map.put(val, true);
	    }
	    
	    for(int val : arr) {
	    	if(map.containsKey(val-1)) {
	    		map.put(val, false);
	    	}
	    }
	    
	    int msp =0;
	    int ml =0;
	    
	    for(int val: arr) {
	    	if(map.get(val) == true) {
	    		
	    		int tl =1;
	    		int tsp = val;
	    		while(map.containsKey( tl + tsp)) {
	    			tl++;
	    		}
	    		
	    		if(tl > ml) {
	    			msp = tsp;
	    			ml = tl;
	    		}
	    	}
	    }
	    
	    ans.add(msp);
	    ans.add(msp + ml-1);
	  return ans;
	   
    }
	
	public static void main(String[] args) {
	
		  int arr[] = {10, 5, 9,1 ,11 ,8,6 , 5, 3,12 ,2};
		  
		  longestConsecutiveIncreasingSequence(arr);
	}

}

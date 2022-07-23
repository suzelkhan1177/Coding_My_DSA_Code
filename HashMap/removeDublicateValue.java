package HashMap;

import java.util.*;
public class removeDublicateValue {
	
	public static ArrayList<Integer> removeDuplicate(int arr[]){
		ArrayList<Integer> list = new ArrayList<>();
		
		 HashMap<Integer, Boolean> map = new HashMap<>();
		    
	       for(int i=0; i<arr.length; i++) {
	    	   
	    	     if(map.containsKey(arr[i])) {
	    	    	 continue;
	    	     }else {
	    	    	 list.add(arr[i]);
	    	    	 map.put(arr[i],true);
	    	     }
	    	     
	       }
	       
	       return list;
	}

	public static void main(String[] args) {
		
		int arr[] = {1,3,2,2 ,3,1 ,6,5};
		
		ArrayList<Integer> list =  removeDuplicate(arr);
			
		System.out.println(list);

	}

}

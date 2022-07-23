package HashMap;

import java.util.*;
public class Print_Insertion {
	
	
//	    Sample Input 1 :
//		2
//		6
//		2 6 8 5 4 3
//		4
//		2 3 4 7 
//		2
//		10 10
//		1
//		10
//		Sample Output 1 :
//		2 3 4
//		10
   
public static void intersection(int[] arr1, int[] arr2) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int key : arr1){
            
              if(map.containsKey(key)){
                  map.put(key, map.get(key) +1);
              }else{
                  map.put(key, 1);
              }
        }
        
        Arrays.sort(arr2);
        for(int key : arr2){
            
              if(map.containsKey(key)){
                   int val = map.get(key);
                  if(val> 0){
                  System.out.print(key+" ");
                    map.put(key, val -1);
           }
        }
	  }
        
    }

}

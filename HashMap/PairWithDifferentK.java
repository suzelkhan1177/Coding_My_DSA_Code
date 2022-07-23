package HashMap;

import java.util.*;
public class PairWithDifferentK {
//	   Sample Input 1 :
//		4 
//		5 1 2 4
//		3
//		Sample Output 1 :
//		2
//		Sample Input 2 :
//		4
//		4 4 4 4 
//		0
//		Sample Output 2 :
//		6
public static int getPairsWithDifferenceK(int arr[], int k) {
		
        HashMap<Integer,Integer> map = new HashMap<>();
        int count =0;
        for(int i=0; i<arr.length; i++){	
            
            boolean  flag = false;
            if(arr[i] == arr[i]+k){
                flag =true;
            }
            
            if(map.containsKey(arr[i] +k)){
                count += map.get(arr[i] +k);
            }
            
            if(map.containsKey(arr[i] -k) && !flag){
                count += map.get(arr[i] -k);
             }
            
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])  +1);
            }else{
                map.put(arr[i], 1);
            }
            
        }
        
       return count ;
        
	}
}

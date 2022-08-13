package Full_Test_1;

import java.util.*;
public class Check_Subset {
//	Sample Input :
//		15
//		3 6 5 8 15 1 14 18 7 9 14 9 3 12 8 
//		4
//		18 6 9 8
//		Sample Output :
//		true

	public static boolean CheckSubset(int[] arr1, int m, int[] arr2, int n) {
		
        int i=0, j = 0;
        
        if(m < n)
          return false;
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        while(i < n && j < m){
            
            if(arr1[j]  < arr2[i]){
                j++;
                
            }else if(arr1[j]  == arr2[i]){
                
                i++;
                j++;
                
            }else if(arr1[j]  >  arr2[i]){
                return false;
            }
        }
        
        
        if( i < n){
            return false;
        }else{
            return true;
        }
       
	}
}

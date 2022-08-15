package Full_Test_3;

import java.util.*;
//Sample Input 2:
//6
//6
//4
//5
//5
//5
//5
//Sample Output 2:
//21
import java.util.*;
public class Array_Cost {
   
	public static void main (String[] args) {
		   
	     Scanner sc = new Scanner(System.in);
       
       int n = sc.nextInt();
       int arr[] = new int[n];
       
       for(int i=0; i<n; i++){
           arr[i] = sc.nextInt();
       }
       
       Integer temp[] = new Integer[n];
       
         for(int i=0; i<n; i++) {
        	 temp[i] = Integer.valueOf(arr[i]);
         }
         
         //desanding Order
         Arrays.sort(temp , Collections.reverseOrder());
         int ans = 0;
         
         for(int i=0; i< temp.length; i++) {
        	 if(i % 3 == 2) {
        		 continue;
        	 }
        	 ans += temp[i];
         }
         System.out.println(ans);
	}
}

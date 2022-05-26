package Test4;
import java.util.*;
public class Maximum_Profit_on_App {

//	Input format :
//		Line 1 : N (No. of subscribers)
//		Line 2 : Budget of subscribers (separated by space)
//		Output Format :
//		 Maximum profit
//		Constraints :
//		1 <= N <= 10^6
//		1 <=budget[i]<=9999
//		Sample Input 1 :
//		4
//		30 20 53 14
//		Sample Output 1 :
//		60
//		Sample Output 1 Explanation :
//		Price of your app should be Rs. 20 or Rs. 30. For both prices, you can get the profit Rs. 60.
//		Sample Input 2 :
//		5
//		34 78 90 15 67
//		Sample Output 2 :
//		201
//		Sample Output 2 Explanation :
//		Price of your app should be Rs. 67. You can get the profit Rs. 201 (i.e. 3 * 67).


	public static int maximumProfit(int arr[]) {
		

	      int ans = Integer.MIN_VALUE;
	        
	        int profit =0;
	        
	        Arrays.sort(arr);
	        
	        int n = arr.length;
	        
	        for(int i=0; i<n; i++){
	            
	            int count = (n-i);
	            
	            if(ans < count *arr[i] ){
	                
	                profit = arr[i];
	                ans = count * arr[i];
	            }
	        
	        }
	        
	       
	        
	        return ans;
		}

}

package Full_Test_1;
import java.util.*;
//Sample Input :
//2
//Output :
//2
//Explanation:
//(The 2-nd element is 0. It occurs twice among the first two elements, since 
//		the first two elements are both 0.)
public class Infinity_Sequence {

	   static int search(int arr[], int x, int index){
	         for(int i= index -2; i>=0; i--){
	              if( arr[i] == x)
	                 return i; 
	             
	         }
	         return -1;
	     }
		public static void main(String[] args) {
			
	         int arr[] = new int[128];
	          arr[0] = 0;
	        
	        for(int i=1; i<128; i++){
	            int index = search(arr , arr[i-1] ,i);
	            
	            if(index == -1){
	                arr[i] = 0;
	            }else{
	                arr[i] = i - index-1;
	         }
	        }
	        
	        Scanner sc = new Scanner(System.in);
	         
	        int n = sc.nextInt();
	        int count =0;
	        for(int i=0; i<n; i++){
	            
	            if(arr[i] == arr[n-1])
	                count++;
	        }
	        System.out.println(count);

	         
		}
}

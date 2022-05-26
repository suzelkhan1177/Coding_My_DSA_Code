package Test4;

public class Split_Array {
   
//	Note : You will get marks only if all the test cases are passed.
//	Input Format :
//	Line 1 : Integer N (size of array)
//	Line 2 : Array A elements (separated by space)
//	Output Format :
//	true or false
//	Constraints :
//	1 <= N <= 50
//	Sample Input 1 :
//	2
//	1 2
//	Sample Output 1 :
//	false
//	Sample Input 2 :
//	3
//	1 4 3
//	Sample Output 2 :
//	true
	
	 public static boolean helper(int arr[], int n, int start , int l, int r){
	        
	        if(start == n){
	            return l==r;
	        }
	        
	        
	        if(arr[start] % 5 ==0){
	            
	            l += arr[start];
	            
	        }else if(arr[start] % 3 == 0){
	            
	            r += arr[start];
	        }else{
	            
	            return helper(arr ,n, start +1,  l + arr[start], r)  || 
	                helper(arr ,n, start +1,  l, r + arr[start]);
	        }
	        
	        
	        return helper(arr ,n, start +1,  l, r);
	    }
	    
		public static boolean splitArray(int arr[]) {
			
	        return helper(arr, arr.length,0,0,0);
			
		}
}

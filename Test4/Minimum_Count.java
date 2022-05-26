package Test4;

public class Minimum_Count {

//	   Sample Input 1 :
//		12
//		Sample Output 1 :
//		3
//		Sample Output 1 Explanation :
//		12 can be represented as :
//		1^1 + 1^1 + 1^1 + 1^1 + 1^1 + 1^1 + 1^1 + 1^1 + 1^1 + 1^1 + 1^1 + 1^1
//		1^1 + 1^1 + 1^1 + 1^1 + 1^1 + 1^1 + 1^1 + 1^1 + 2^2
//		1^1 + 1^1 + 1^1 + 1^1 + 2^2 + 2^2
//		2^2 + 2^2 + 2^2
//		As we can see, the output should be 3.
//		Sample Input 2 :
//		9
//		Sample Output 2 :
//		1
	
	public static int minCount(int n){
		
	     if(n ==0 || n ==1 || n==2 || n==3){
            return n;
        }
       int ans = Integer.MAX_VALUE;
       
       for(int i=1; i*i<=n; i++){
           
           ans = Math.min(ans, 1 + minCount(n-i*i));
           
       }
       return ans;
	}
}

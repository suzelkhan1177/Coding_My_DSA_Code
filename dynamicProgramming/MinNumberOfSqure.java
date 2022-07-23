package dynamicProgramming;

public class MinNumberOfSqure {
//	Sample Input 1 :
//		12
//		Sample Output 1 :
//		3
//		Explanation of Sample Output 1 :
//		12 can be represented as : 
//		A) (1^2) + (1^2) + (1^2) + (1^2) + (1^2) + (1^2) + (1^2) + (1^2) + (1^2) + (1^2) + (1^2) + (1^2)
//
//		B) (1^2) + (1^2) + (1^2) + (1^2) + (1^2) + (1^2) + (1^2) + (1^2)  + (2 ^ 2)
//
//		C) (1^2) + (1^2) + (1^2) + (1^2) + (2 ^ 2) + (2 ^ 2)
//
//		D) (2 ^ 2) + (2 ^ 2) + (2 ^ 2)
//
//		As we can see, the output should be 3.
	
public static int minCount(int n) {
		
        int dp[] = new int[n+1];
        dp[0] =0;
        
        for(int i=1; i<=n; i++){
            int minAns = Integer.MAX_VALUE;
            for(int j=1; j*j <=i; j++){
                 int curr = dp[i -(j*j)];
                if(minAns > curr){
                    minAns = curr;
                }
            }
            dp[i] = 1 + minAns;  
        }
        return dp[n];  
     }

}

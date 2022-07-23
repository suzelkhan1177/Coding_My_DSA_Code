package dynamicProgramming;

//Sample Input 1 :
//4
//1 4 4 6
//Sample Output 1 :
//6
public class ChoclateDistribution {
	
public static int getMin(int arr[], int n){
        
        int dp[] =  new int[n+1];
        
        //every student distrin=but 1 chocolate
         for(int i=0; i<n; i++)
             dp[i] = 1;
        
        //Left to right
         for(int i=1; i<n; i++){
            
              if(arr[i] > arr[i -1]){
                  dp[i] = dp[i-1] +1;
              }else{
                  dp[i] =1;
              }
        }
        //right to left
        for(int i= n-2; i >=0; i--){
            if(arr[i] > arr[i+1]){
                 dp[i] = Math.max(dp[i+1] +1, dp[i]);
            }else{
                dp[i] = Math.max(dp[i], 1);
            }
        }
        int sum =0;
        
        for(int i=0; i<n; i++)
            sum += dp[i];
        
        return sum;
        
    }

}

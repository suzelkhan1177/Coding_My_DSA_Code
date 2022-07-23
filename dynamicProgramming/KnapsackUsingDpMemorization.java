package dynamicProgramming;

//Sample Input 1 :
//4
//1 2 4 5
//5 4 8 6
//5
//Sample Output 1 :
//13
public class KnapsackUsingDpMemorization {
	
	 public static int solve(int[] weights, int[] values, int index, int capicity , int dp[][]) {
		  
         if(index == 0){
             if(weights[0] <= capicity)
                 return values[0];
             else
                 return 0;
             
         } 
        
        if(dp[index][capicity] != -1)
            return dp[index][capicity];
            
             //include
             int include =0;
             if(weights[index] <= capicity){
                 
          include = values[index] + solve(weights, values , index-1 , capicity - weights[index] ,dp);
             }
             
             //exclude
             int exclude = solve(weights, values , index-1 , capicity, dp);
             
              dp[index][capicity] = Math.max(include,exclude);
        
             return dp[index][capicity];      
         
	}
	public static int knapsack(int[] weights, int[] values, int n, int maxWeight) {
        
        int dp[][] = new int[n][maxWeight +1];
        
         for(int i=0; i<dp.length; i++){
             for(int j=0; j<dp[0].length; j++){
                 dp[i][j] = -1;
             }
         }
        
        return solve(weights ,values , n-1, maxWeight, dp );
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

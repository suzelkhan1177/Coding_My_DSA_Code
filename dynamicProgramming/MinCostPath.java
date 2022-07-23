package dynamicProgramming;

//From a cell (i, j), you can move in three directions:
//1. ((i + 1),  j) which is, "down"
//2. (i, (j + 1)) which is, "to the right"
//3. ((i+1), (j+1)) which is, "to the diagonal"
//Sample Input 1 :
//3 4
//3 4 1 2
//2 1 8 9
//4 7 8 1
//Sample Output 1 :
//13

public class MinCostPath {

	//Approach 1 recurtion
	 public static int minCostPath(int[][] cost, int i , int j) {
			int m =  cost.length;
	        int  n = cost[0].length;
	        
	        if(i == m-1 && j == n-1)
	            return cost[i][j];
	        
	        if(i >= m || j>= n)
	         return Integer.MAX_VALUE;
	        
	        int ans1 = minCostPath(cost , i+1, j);
	        int ans2 = minCostPath(cost , i ,j+1);
	        int ans3 = minCostPath(cost, i+1, j+1);
	        
	        int ans = cost[i][j] + Math.min(ans1, Math.min(ans2,ans3));
	        
	        
	        return ans;
	        
		}

		public static int minCostPath(int[][] input) {
			
	        return minCostPath(input, 0,0);
		}
		
		
		//Approach 2 Bottom up
		public static int minCostPath2(int[][] cost) {
			
	         int m = cost.length;
	        int n = cost[0].length;
	        
	        int dp[][] = new int[m+1][n+1];
	        
	        for(int i=0; i<dp.length; i++){
	            for(int j=0; j<dp[0].length; j++){
	                dp[i][j] = Integer.MAX_VALUE;
	            }
	        }
	        
	        for(int i = m-1; i>=0; i--){
	            for(int j = n-1; j>=0; j--){
	                
	                //base conditon
	                if(i == m-1 && j== n-1){
	                    dp[i][j] = cost[i][j];
	                    continue;
	                }
	                int ans1 = dp[i][j+1];
	                int ans2 = dp[i+1][j];
	                int ans3 = dp[i+1][j+1];
	                
	                dp[i][j] = cost[i][j] + Math.min(ans1,Math.min(ans2,ans3));
	                
	            }
	        }
	        
	        return dp[0][0];
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

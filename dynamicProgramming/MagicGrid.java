package dynamicProgramming;

//Sample Input 1:
//3
//2 3
//0 1 -3
//1 -2 0
//2 2
//0 1
//2 0
//3 4
//0 -2 -3 1
//-1 4 0 -2
//1 -2 -3 0
//Sample Output 1:
//2
//1
//2
public class MagicGrid {
	
	 public static int getMinimumStrength(int[][] grid) {
	        
	        int row = grid.length;
	        int col = grid[0].length;
	        
	        
	        if(row==0)
	        return row;
	        
	        if(col == 0)
	        return col;
	        
	        int dp[][] = new int[row][col];
	        dp[row -1][col-1] =1;
	        
	        //fill tha row
	        for(int i = col-2; i>=0; i--){
	            
	            dp[row-1][i] = dp[row-1][i+1] - grid[row-1][i];
	        }
	        
	        //fill tha column
	        for(int i= row-2; i>=0; i--){
	            
	            dp[i][col-1] = dp[i+1][col-1] - grid[i][col-1];
	        }
	        
	        for(int i = row-2; i>=0; i--){
	            for(int j = col-2; j>=0; j--){
	                
	                //bottom
	                int ans1 = dp[i+1][j];
	                //right
	                int ans2 = dp[i][j+1];
	                
	                dp[i][j] = Math.max(1 , Math.min(ans1, ans2) - grid[i][j]);
	                
	            }
	        }
	        
	        return dp[0][0];
	        
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

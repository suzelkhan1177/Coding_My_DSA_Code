package dynamicProgramming;

//Sample Input 2:
//4 4
//0 0 0 0
//0 0 0 0
//0 0 0 0
//0 0 0 0
//Sample Output 2:
//4
public class MazimumSquareMatrixAllZero {

        
	public static int findMaxSquareWithAllZeros(int[][] input){
        
		//base case
        if (input == null || input.length == 0 || input[0].length == 0) {
        return 0;
    }
        
        
		int dp [][] = new int[input.length][input[0].length];
    
        
		//all column fill 1
        for(int i=0;i<dp[0].length;i++){
            if(input[0][i] == 0){
                dp[0][i] = 1;
            }else{
                dp[0][i] = 0;
            }
        }
        
        //all row fill 1
        for(int i=0;i<dp.length;i++){
            if(input[i][0] == 0){
                dp[i][0] = 1;
            }else{
                dp[i][0] = 0;
            }
        }
        
        
        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[0].length;j++){
                if(input[i][j] != 0){
                    dp[i][j] = 0;
                }else{
                    dp[i][j] = 1 + Math.min(dp[i-1][j-1] ,Math.min(dp[i][j-1],dp[i-1][j]));
                }
                
            }
        }
        
    int maximum = 0;
         for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                if(dp[i][j] > maximum){
                    maximum = dp[i][j];
                }
            }
        }
        
        return maximum;
	}

}

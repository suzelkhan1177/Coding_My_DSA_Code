package dynamicProgramming;

//Sample Input 1 :
//3
//1 2 3
//4
//Sample Output 1 :
//4
//Explanation to Sample Input 1 :
//Number of ways are - 4 total i.e. (1,1,1,1), (1,1, 2), (1, 3) and (2, 2).
public class WayToCoinChange {


	public static int countWaysToMakeChange(int coin[], int value){
       
        int dp[] = new int[value +1];
        
        dp[0] = 1;
        
        for(int i=0; i<coin.length; i++){
            for( int j= coin[i]; j<=value; j++){
                
                dp[j]  += dp[j- coin[i]];
            }
        }
        
        
        return dp[value];
	}
}

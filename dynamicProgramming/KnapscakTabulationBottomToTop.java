package dynamicProgramming;

public class KnapscakTabulationBottomToTop {
	
public static int knapsack(int[] weights, int[] values, int index, int capicity) {
		
        //step 1
        int dp[][] = new int[index][capicity +1];
        
        //step 2 Base Case
        for(int w = weights[0];  w<=capicity; w++){
            if(weights[0] <= capicity){
                 dp[0][w] = values[0];
              }else{
                  dp[0][w] = 0;
              }
        }
        
        for(int idx=1; idx < index; idx++){
            for(int cap =0; cap <=capicity; cap++ ){
                
                //include
                int include =0;
                
                if(weights[idx] <= cap)
                 include = values[idx] + dp[idx -1][cap - weights[idx]];
                
                //exclude
                int exclude = 0 + dp[idx -1][cap];
                
                dp[idx][cap] = Math.max(include,exclude);
                
            }
        }
        
        return dp[index-1][capicity];
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

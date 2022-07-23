package dynamicProgramming;

//Sample Input 1 :
//4
//4 3 5 2
//13
//Sample Output 1 :
//No
//Sample Input 2 :
//5
//4 2 5 6 7
//14
//Sample Output 2 :
//Yes
public class SubSet_Sum {

	 static boolean isSubsetPresent(int[] arr, int n, int sum) {

	       boolean dp[][] = new boolean[n+1][sum+1];
	        
	        for(int i=0; i<dp.length; i++){
	            for(int j=0; j<dp[0].length; j++){
	                
	                if(i ==0 && j== 0){
	                    dp[i][j] = true;
	                    
	                }else if(i==0){
	                    dp[i][j] =false;
	                    
	                }else if(j==0){
	                    dp[i][j] = true;
	                }else{
	                    
	                    if(dp[i-1][j] == true){
	                        
	                        dp[i][j] = true;
	                    }else{
	                        int val =  arr[i-1];
	                        if(j >= val){
	                            
	                            if(dp[i - 1][j - val] == true){
	                                dp[i][j] = true;
	                            }
	                        }
	                    }
	                }
	            }
	        }           
	        return dp[arr.length][sum];
	    }
}

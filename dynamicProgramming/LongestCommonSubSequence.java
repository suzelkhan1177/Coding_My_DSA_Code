package dynamicProgramming;

public class LongestCommonSubSequence {
	
	//Approach 1 Recurtion
	public static int lcs(String str1, String str2 , int i , int j) {
		   
        if(str1.length() == i || str2.length() == j)
            return 0;
        
        int ans ;
        if(str1.charAt(i) == str2.charAt(j)){
            
            int smlAns = lcs(str1,str2 ,i+1 , j+1);
            
            ans = 1 + smlAns;
        }else{
            
            int ans1 = lcs(str1, str2, i, j+1);
            int ans2 = lcs(str1, str2, i+1 ,j);
            
            ans = Math.max(ans1, ans2);
        }
        return ans;
    }
	
	
	//Approach 2 Memorization
	  public static int lcs(String str1, String str2 , int i , int j , int dp[][]) {
		   
	        if(str1.length() == i || str2.length() == j)
	            return 0;
	        
	        int ans ;
	        if(str1.charAt(i) == str2.charAt(j)){
	            
	            int smlAns ;
	            if(dp[i +1 ][j +1 ] == -1){
	                
	            smlAns = lcs(str1,str2 ,i+1 , j+1, dp);
	                dp[i][j] = smlAns;
	            }else{
	                
	                smlAns = dp[i +1 ][j +1];
	                
	            }
	            
	            ans = 1 + smlAns;
	        }else{
	            
	            int ans1,ans2;
	            
	            if(dp[i+1][j] == -1){
	                   ans1  = lcs(str1, str2, i, j+1, dp);
	                   dp[i +1][j] = ans1;
	            }else{
	                
	                ans1 = dp[i+1][j];
	            }
	          
	            if(dp[i][j+1] == -1){
	            ans2 = lcs(str1, str2, i+1 ,j ,dp);
	             dp[i][j+1] = ans2;
	                
	            }else{
	                
	                ans2 = dp[i][j+1];
	            }
	            
	            ans = Math.max(ans1, ans2);
	        }
	        return ans;
	    }

		public static int lcs(String str1, String str2) {
		   
	         int dp[][] = new int[str1.length()+1][str2.length()+1];
	        
	        for(int i=0; i<dp.length; i++){
	            for(int j=0; j<dp[0].length; j++){
	                dp[i][j] = -1;
	            }
	        }
	        
	        return lcs(str1,str2,0,0,dp);
	    }
		
		//Approach3 iterative
		public static int lcs2(String str1, String str2) {
	          int m = str1.length();
	          int n = str2.length();
	          int dp[][] = new int[m +1][n +1];
	        for(int i= m-1; i>=0; i--){
	            for(int j = n-1; j>=0; j--){
	                 int ans;
	                  if(str1.charAt(i) == str2.charAt(j)){
	                      ans = 1 + dp[i+1][j+1];
	                  }else{
	                      int ans1 = dp[i][j+1];
	                      int ans2 = dp[i+1][j];
	                      ans = Math.max(ans1, ans2);
	                 }
	                 dp[i][j] = ans;
	            }
	        }  
	        return dp[0][0];
	    }


	public static void main(String[] args) {
		
		

	}

}

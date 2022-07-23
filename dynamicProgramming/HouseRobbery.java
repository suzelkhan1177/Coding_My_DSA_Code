package dynamicProgramming;

public class HouseRobbery {
	
public static int maxMoneyLooted(int[] arr) {
		
        if(arr.length == 0)
            return 0;
        
         int dp[] = new int[arr.length];
        
        dp[0] = arr[0];
        dp[1] = Math.max(arr[1], dp[0]);
        
        for(int i=2; i<dp.length; i++){
            
            dp[i] = Math.max(arr[i] + dp[i-2], dp[i-1]);
        }
        
        return dp[dp.length -1];

        
}
}

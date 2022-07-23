package dynamicProgramming;

public class factorial {
	
	
	//Approch -1  Top Down = Recursion + Memorization
	// Time complexcity - O(N)
	//Space complexcity -  O(N) + O(N)
	static int fib(int n, int dp[]) {
		
	 if(n==0 || n==1){
			return n;
		}
	 
	  int ans1,ans2;
	  
	     if(dp[n-1] == -1) {
	    	 ans1 = fib(n-1,dp);
	    	 dp[n-1] = ans1;
	     }else {
	    	 ans1 = dp[n-1];
	     }
	     
	     if(dp[n-2] == -1) {
	    	 ans2 = fib(n-2 ,dp);
	    	 dp[n-2] = ans2;
	     }else {
	    	 ans2 = dp[n-2];
	     }
	     
	     int ans = ans1 + ans2;
	     return ans;
	}
	
	
	//Approch 2  Bottom up  = Tabulation
	// Time complexcity - O(N)
	//Space complexcity -  O(N)
	static int fib(int n) {
		
		int f[] = new int[n +2];
		
		 f[0] = 0;
	     f[1] = 1;
	     
	     for(int i=2; i<=n; i++) {
	    	 f[i] = f[i-1] + f[i-2];
	     }
		
		return f[n];
	}
	
	//Approch 3  Brain Stroming
		// Time complexcity - O(N)
		//Space complexcity -  O(1)
	
	static int fibo(int n) {
		int a = 0, b=1, c;
		
		if(n==0)
		return a;
		
		for(int i=2; i<=n; i++) {
			c = a+b;
			a=b;
			b=c;
		}
		return b;
	}
	
	

	public static void main(String[] args) {
	
		int n=10;
		int dp[] = new int[n+1];
		
		for(int i=0; i<dp.length; i++) {
			dp[i] = -1;
		}
		
		System.out.println(fibo(n));

	}

}

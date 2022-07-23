package dynamicProgramming;


//Sample Input 2 :
//whgtdwhgtdg
//aswcfg
//Sample Output 2 :
//9
public class editDistancce {
   
	//Approach 1 Recurtion
public static int editDistance(String s1, String s2) {
		
        if(s1.length()==0 && s2.length()==0)
            return 0;
        if(s2.length()==0)
            return s1.length();
        if(s1.length()==0)
            return s2.length();
        
        if(s1.charAt(0)==s2.charAt(0))
            return editDistance(s1.substring(1),s2.substring(1));
        else{
            //insert
            int op1=editDistance(s1,s2.substring(1));
            //delete
             int op2=editDistance(s1.substring(1),s2);
            //substitute
             int op3=editDistance(s1.substring(1),s2.substring(1));
            return 1+Math.min(op1,Math.min(op2,op3));
            
        }
    }


//Approach 2 Memorization
public static int editDistance1(String s1, String s2 ) {
    int m = s1.length();
    int n = s2.length();
    
    if(m==0 && n==0)
        return 0;
    
    if(m == 0)
        return n;
    
    if(n==0)
      return m;
    
    int dp[][] = new int[m+1][n+1];
    dp[0][0] =0;
     for(int i=1; i<=n; i++)
        dp[0][i] = i;
    
    for(int i=1; i<=m; i++)
        dp[i][0] = i;
    
for(int i=1; i<=m; i++){
    for(int j=1; j<=n; j++){
        if(s1.charAt(m-i) == s2.charAt(n-j)){
            dp[i][j] = dp[i-1][j-1];
        }else{
         dp[i][j] = 1 + Math.min(Math.min(dp[i-1][j], dp[i][j-1]), dp[i-1][j-1]);  
        }
    }
}
    
    
    return dp[m][n];
}

    public static void main(String[] args) {
		
    	System.out.println(editDistance1("acdefgd",
    			"aawdfg"));
	}
}

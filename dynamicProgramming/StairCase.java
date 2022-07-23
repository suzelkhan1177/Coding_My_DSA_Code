package dynamicProgramming;

public class StairCase {
	
	//Approch -1  Top Down  and Bottom up
		// Time complexcity - O(N)
		//Space complexcity -  O(N)
public static long staircase(int n) {

		
        long res[] = new long[n+1];
        
        
          if(n==0 ||  n==1 || n==2){
            return n;
          } 
        
        res[0] = 1;
        res[1] = 1;
        res[2] = 2;
        
        for(int i=3; i<=n; i++)
            res[i] = res[i-1] + res[i-2] + res[i-3];
        
        return res[n];
}
//Approch 3  Brain Stroming
		// Time complexcity - O(N)
		//Space complexcity -  O(1)
	
public static long staircases(int n) {
	
    long a =1 ,b=2,  c =4;
    long d =0;
    if(n==0||  n==1 || n==2){
        return n;
    }
    
    
    if(n==3)
    return c;
    
    for(int i=4; i<=n; i++){
        
           d = c+b+a;
         a=b;
        b=c;
        c=d;
    }
    
    return d;
}

public static void main(String[] args) {
	
	System.out.println(staircase(4));
}

}

package Full_Test_2;

import java.util.*;
public class Binomial_Expansion {
//	Sample input:
//		 1 2 6
//		Sample Output:
//		1 12 60 160 240 192 64
  
	  static void series(int A, int X, int n)
	    {
	         
	       
	        int term = (int)Math.pow(A, n);
	        System.out.print(term + " ");
	 
	        for (int i = 1; i <= n; i++) {
	 
	            term = term * X * (n - i + 1)
	                                / (i * A);
	 
	            System.out.print(term + " ");
	        }
	    }
		public static void main(String[] args) 
		{ 
	        
	        Scanner sc = new Scanner(System.in);
	        
	        int A = sc.nextInt();
	         int X = sc.nextInt();
	         int N = sc.nextInt();
	          series(A, X, N);
		    
		} 
}

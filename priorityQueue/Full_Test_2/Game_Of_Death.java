package Full_Test_2;

import java.util.Scanner;

public class Game_Of_Death {
//	Sample input 2:
//		50 10
//		Sample output 2:
//		36
	  
    static int josephus(int n, int k)
   {
       if (n == 1)
           return 1;
       else
        
           return (josephus(n - 1, k) + k - 1) % n + 1;
   }
	
	public static void main(String[] args) 
	{ 
	    Scanner s=new Scanner(System.in);
		
		    int n=s.nextInt();
		    int k=s.nextInt();
		   
		   System.out.println(josephus(n,k));

	}

}

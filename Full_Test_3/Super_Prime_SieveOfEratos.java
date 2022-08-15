package Full_Test_3;

import java.util.*;
public class Super_Prime_SieveOfEratos {
//	Sample Input 1:
//		7
//		Sample Output 1:
//		3 5
//		Sample Input 2:
//		17
//		Sample Output 2:
//		3 5 11 17 

	static void SieveOfEratosthenes(int n, boolean isPrime[])
    {
        
        isPrime[0] = isPrime[1] = false;
        for (int i = 2; i <= n; i++)
            isPrime[i] = true;
 
        for (int p = 2; p * p <= n; p++) {
          
            if (isPrime[p] == true) {
            
                for (int i = p * 2; i <= n; i += p)
                    isPrime[i] = false;
            }
        }
    }
 

    static void superPrimes(int n)
    {
 
      
        boolean isPrime[] = new boolean[n + 1];
        SieveOfEratosthenes(n, isPrime);
 
        
        int primes[] = new int[n + 1];
        int j = 0;
 
        for (int p = 2; p <= n; p++)
            if (isPrime[p])
                primes[j++] = p;
 
       
        for (int k = 0; k < j; k++)
            if (isPrime[k + 1])
                System.out.print(primes[k] + " ");
    }
 
    
    
	public static void main (String[] args) {
	   
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        superPrimes(n);
	}
}

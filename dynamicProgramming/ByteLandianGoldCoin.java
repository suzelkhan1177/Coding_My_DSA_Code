package dynamicProgramming;
import java.util.*;
public class ByteLandianGoldCoin {

//	    Sample Input 1 :
//		12
//		Sample Output 1 :
//		13
//		Explanation of Sample Output 1 :
//		 You can change 12 into 6, 4 and 3, and then change these into $6 + $4 + $3 = $13.
//	
	public static long bytelandian(long n, HashMap<Long, Long> map) {
	       
        if(n==0 || n==1)
            return n;
        
        if(map.containsKey(n))
            return map.get(n);
        
        long max = Math.max(n,bytelandian(n/2, map)+ bytelandian(n/3,map) + bytelandian(n/4,map));
        if(n<100000)
            map.put(n,max);
        
        return max;
	}


}

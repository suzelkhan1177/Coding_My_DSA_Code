package Full_Test_3;

import java.util.*;
public class Even_Sum {
//	Sample Input 1:
//		4
//		1 3 2 5
//		Sample Output 1:
//		3
//		Explanation:
//		 Removing 1,3 or 5 would result in even sum of the array.
	
	public static void main (String[] args) {
		   
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        
        int odd =0, even = 0; 
        for(int i=0;  i<n; i++){
            if( arr[i] %2 ==0){
                even++;
            }else{
                odd++;
            }
        }
        
        if(odd % 2 == 1){
            System.out.println(odd);
        }else{
             System.out.println(even);
        }
        
       
	}

}

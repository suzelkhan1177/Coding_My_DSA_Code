package Full_Test_3;

import java.util.*;
public class Game_Of_Number {
//	Sample Input 1:
//		2 3
//		Sample Output 1:
//		2
//		Explanation:
//		Use double operation and then decrement operation {2 -> 4 -> 3}

	static int minOperations(int x, int y) {
		int ans =0;
		while(y > x) {
			ans++;
			
			if(y % 2==1) {
				y++;
			}else {
				y /= 2;
			}
		}
		return ans + x -y;
		}
	
	
	public static void main (String[] args) {
		 
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        
	System.out.println(minOperations(x, y));
	}

	

}

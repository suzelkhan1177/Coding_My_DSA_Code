package test7;

import java.util.*;
//Sample Input 1:
//2
//aba
//babcddc
//Sample Output 1:
//1
//2
public class BobAndHisString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t-- >0) {
			String s = sc.next();
			
			int arr[] = new int[26];
			for(int i=0; i<arr.length; i++)
				arr[i] = -1;
			
			int max = Integer.MIN_VALUE;
			
			for(int i=0; i<s.length(); i++) {
				int index = s.charAt(i) - 'a';
				
				if(arr[index] == -1) {
					arr[index] = i;
				}else{
					int distance = i - arr[index];
					if(distance > max) {
						max = distance;
					}	
				}
			}
			
			if(max == Integer.MIN_VALUE)
				System.out.println(-1);
			else
				System.out.println(max -1);
		}
	}

}

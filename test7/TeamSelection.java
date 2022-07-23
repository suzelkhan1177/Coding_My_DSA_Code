package test7;

import java.util.*;

//Sample Input 0
//13
//1 2 3 4 5 6 7 8 9 10 11 12 13


//Sample Output 0
//1 2 3 4 5 6 7 8 9 10 11 12
//1 2 3 4 5 6 7 8 9 10 11 13 
//1 2 3 4 5 6 7 8 9 10 12 13 
//1 2 3 4 5 6 7 8 9 11 12 13 
//1 2 3 4 5 6 7 8 10 11 12 13 
//1 2 3 4 5 6 7 9 10 11 12 13 
//1 2 3 4 5 6 8 9 10 11 12 13 
//1 2 3 4 5 7 8 9 10 11 12 13 
//1 2 3 4 6 7 8 9 10 11 12 13 
//1 2 3 5 6 7 8 9 10 11 12 13 
//1 2 4 5 6 7 8 9 10 11 12 13 
//1 3 4 5 6 7 8 9 10 11 12 13 
//2 3 4 5 6 7 8 9 10 11 12 13
public class TeamSelection {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
		int arr[] =  new int[n];
        
        for(int i=0; i<n; i++){
          arr[i] = sc.nextInt();
        }
        
        solve(arr, 12, 0, "" );
	}
	
	public static void solve(int arr[], int stu , int index, String set) {
		
		    //complete one set
		    if(stu == 0) {
		    	System.out.println(set);
		    	return;
		    }
		    
		    //base case
		    if(index == arr.length)
		    	return;
		    
		    //element get add to set
		    solve(arr, stu -1 , index +1, set + arr[index] +" ");
		    
		    //element is  not Add to Set
		    solve(arr, stu, index +1 ,set);
	}

}

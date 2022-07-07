package recursion3;

import java.util.*;
public class PermutationRecursion {
	
	private static void swap(char input[], int i ,int j) {
		
		char temp = input[i];
		input[i] = input[j];
		input[j]  = temp;
	}
  
	public static void permut(char[] input, int index) {
		
		         //base case
		        if(index == input.length -1) {
		        	System.out.println(String.valueOf(input));
		        	return;
		        }
		        
		        for(int i = index; i<input.length; i++) {
		        	
		        	swap(input , index, i);
		        	
		        	permut(input, index+1);
		        	swap(input , index, i);
		        }
	}
	
	
	public static void permutations(String input){
		 
		
		if(input == null  || input.length() == 0) {
			return;
		}
		
		permut(input.toCharArray(),0);

	}
	
	 public static void main(String[] args) {
		
		 String str = "abc";
		 permutations(str);
		 
	}
}

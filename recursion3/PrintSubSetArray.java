package recursion3;

import java.util.*;
public class PrintSubSetArray {

	
	public static void SubSet(List<List<Integer>> ans , int num[], ArrayList<Integer>
	  output ,int idx) {
	
           if(num.length == idx) {
        	   ans.add(output);
        	   return;
           }
           
           //exclude
           SubSet(ans, num , new ArrayList(output), idx +1 );
           
           
           //include
           output.add(num[idx]);
           SubSet(ans, num , new ArrayList(output), idx +1 );
        
	}
	

	 
	public static void printSubsets(int input[]) {
		
		List<List<Integer>> ans = new ArrayList<>();

		
		SubSet(ans, input, new ArrayList(), 0);
		   for(int i = 0; i < ans.size(); i++){
		          for(int j = 0; j < ans.get(i).size(); j++){
		              System.out.print(ans.get(i).get(j) + " ");
		          }
		          System.out.println();
		      }

	}
	
	public static void main(String[] args) {
	   
		int arr[] = {1,2,3};
		
		printSubsets(arr);
	}

}

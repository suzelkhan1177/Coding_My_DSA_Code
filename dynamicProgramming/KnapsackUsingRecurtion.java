package dynamicProgramming;


//Sample Input 1 :
//4
//1 2 4 5
//5 4 8 6
//5
//Sample Output 1 :
//13
public class KnapsackUsingRecurtion {
	
	  public static int solve(int[] weights, int[] values, int index, int capicity) {
		  
	         if(index == 0){
	             if(weights[0] <= capicity)
	                 return values[0];
	             else
	                 return 0;
	         }  
	             
	             //include
	             int include =0;
	             if(weights[index] <= capicity){
	                 
	          include = values[index] + solve(weights, values , index-1 , capicity - weights[index]);
	             }
	             
	             //exclude
	             int exclude = solve(weights, values , index-1 , capicity);
	             
	             int ans = Math.max(include,exclude);
	             return ans;
	             
	         
		}
	    
		public static int knapsack(int[] weights, int[] values, int n, int maxWeight) {
		
	          return solve(weights ,values, n-1, maxWeight);
		}


	public static void main(String[] args) {
		
		
	}

}

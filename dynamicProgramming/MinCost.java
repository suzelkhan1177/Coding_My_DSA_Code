package dynamicProgramming;

public class MinCost {
	
	
	//Recurtion 
	public static int countMinStepsToOne(int n) {
        if(n== 1)
	    return 0;
	    
	       int count1, count2 = Integer.MAX_VALUE, count3 = Integer.MAX_VALUE;
	        count1 = countMinStepsToOne(n-1);
	        if((n%2) == 0){
	            count2 = countMinStepsToOne(n/2);
	        }
	       if((n%3) == 0){
	            count3 = countMinStepsToOne(n/3);
	        }
	        return 1 + Math.min(count1, Math.min(count2,count3));  
		}

	
	
	//Dayanamic programming
	public static int countMinStepsToOneD(int n) {
        
	       int minCost[] = new int[n+1];
	           minCost[1] = 0;
	          for(int i=2; i<minCost.length; i++){
	              
	              int count1 = Integer.MAX_VALUE;
	               int count2 = Integer.MAX_VALUE;
	               int count3 = Integer.MAX_VALUE;
	              count1 = minCost[i-1];
	              if(i%2 == 0){
	                  count2 =  minCost[i/2];
	              }
	              if(i%3 == 0){
	                  count3 =  minCost[i/3];
	              }
	               minCost[i] = 1+  Math.min(count3,Math.min(count2,count1));  
	                
	          }
	        return minCost[n];
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

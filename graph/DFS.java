package graph;

import java.util.*;

//Input 
//6 5
//0 1
//0 2
//1 3
//2 3
//4 5
//
//output
//0 1 3 2  
public class DFS {
	
	
	//Approch 1
	   public static ArrayList<ArrayList<Integer>> depthFirstSearch(int v, int e, ArrayList<ArrayList<Integer>> edges) {
	        
	        //adjcency List
	        ArrayList<ArrayList<Integer>> adj = new  ArrayList<ArrayList<Integer>>();
	        for(int i=0; i<v; i++)
	            adj.add(new ArrayList());
	        
	       for(ArrayList<Integer> edg : edges){
	           adj.get(edg.get(0)).add(edg.get(1));
	           adj.get(edg.get(1)).add(edg.get(0));
	       }
	        
	 
	      
	        boolean[] visited = new boolean[v];
	       ArrayList<ArrayList<Integer>> ans = new  ArrayList<>();
	       
	       
	        //not visited 
	        for(int i=0; i<v; i++){
	            if(!visited[i]){
	                ArrayList<Integer> component = new ArrayList<>();
	                dfs(i, adj, visited, component);
	                ans.add(component);
	            }
	        }
	        return ans;
	    }
	    
	   //visited function
	    public static void dfs(int node, ArrayList<ArrayList<Integer>> adj, boolean[] 
	                          visited ,ArrayList<Integer> component){
	        //ans store
	        component.add(node);
	        //mark visited
	        visited[node]= true;
	        
	        //all connected node  k liya  recursive  call
	        for(int i : adj.get(node)){
	            if(!visited[i]){
	                dfs(i, adj, visited, component);
	            }
	        }
	    }
	     
	    //approch 2
	  public static void dfsTraversl(int adjMatrix[][], int currVertex ,boolean[] visited) {
	    	
	    	visited[currVertex] = true;
	    	System.out.print(currVertex + " ");
	    	
	    	for(int i=0; i<adjMatrix.length; i++) {
	    		if(adjMatrix[currVertex][i] == 1  && visited[i] == false) {
	    			visited[i] = true;
	    			//i is neigbour of current vertix
	    			dfsTraversl(adjMatrix, i, visited);
	           }
	    	}	
	    }
	  
	  public static void dfsTraversl(int adjMatrix[][]) {
	    	boolean visited[] = new boolean[adjMatrix.length];
	    	  dfsTraversl(adjMatrix,0, visited);
//	    	for(int i=0; i<adjMatrix.length; i++) {
//	    		
//	    		if(!visited[i])
//	    	    dfsTraversl(adjMatrix,i, visited);
//	    	}
	    }
	    
   
	  public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
			 
			 int v = sc .nextInt();
			 int e = sc. nextInt();
			 
			 int adjMat[][] = new int[v][v];
			 for(int i=0; i<e; i++) {
				 int v1 = sc.nextInt();
				 int v2 =  sc.nextInt();
				 
				 adjMat[v1][v2]=1;
				 adjMat[v2][v1]= 1;
			 }
			 
			 dfsTraversl(adjMat);
//			 depthFirstSearch(v, e, adjMat);
			 
	}
}

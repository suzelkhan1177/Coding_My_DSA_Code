package graph;


import java.util.*;
public class DijkstraS_Algorithm {
	
	public static  int minDistance(ArrayList<Integer> distance,  ArrayList<Boolean> visited, int vertices) {
		int min = Integer.MAX_VALUE;
		int minVertex =0;
	   for(int i=0; i< vertices; i++) {
			if(visited.get(i) == false  &&  distance.get(i) <= min) {
				
				min = distance.get(i);
				minVertex = i;
			}
		}
		return minVertex;			
	}
	
	public static ArrayList<Integer> dijkstraHelper(int adjMatrix[][], int vertices, int source){
		
		    ArrayList<Integer> distance = new ArrayList<>(vertices);
		    ArrayList<Boolean>  visited = new ArrayList<>(vertices);
		    
		    for(int i=0; i<vertices; i++) {
		    	
		    	distance.add(Integer.MAX_VALUE);
		    	visited.add(false);
		    }
		    
		    // Distance of source to itself is 0.
	        distance.set(source, 0);
		    
		    for(int i=0; i<vertices; i++) {
		    	
		    	int  u = minDistance(distance, visited, vertices);
		    
		    
		    //Mark Current vertix Ture
		    	visited.set(u, true);
		    	
		    	for(int v=0; v<vertices; v++) {
		    		
		    		if(!visited.get(v) && adjMatrix[u][v] != 0 &&  distance.get(u) != Integer.MAX_VALUE
		    			&&  distance.get(u) + adjMatrix[u][v] < distance.get(v)	){
		    			
		    			distance.set(v, distance.get(u) + adjMatrix[u][v] );
		    		}
		    	}
		    
		    }  
		    return distance;
	}
  
	public static ArrayList < Integer > dijkstra(ArrayList< ArrayList < Integer > > vec, int vertices, int edges, int source){
	
		 int ajtMatrix[][] =  new int[vertices][vertices];
		 
		 for(int i=0; i<vec.size(); i++) {
			 
			 int u = vec.get(i).get(0);
			 int v = vec.get(i).get(1);
			 int w = vec.get(i).get(2);
			 
			 if(ajtMatrix[u][v] != 0) {
				 
				 ajtMatrix[u][v] = Math.min(ajtMatrix[u][v], w);
				 ajtMatrix[v][u] = Math.min(ajtMatrix[v][u], w);
			 }else {
				 
				 ajtMatrix[u][v] = w;
				 ajtMatrix[v][u] = w;
			 }
		 }
		 
		 return dijkstraHelper(ajtMatrix, vertices, source);
	}
}

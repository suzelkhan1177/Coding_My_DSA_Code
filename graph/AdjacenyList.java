package graph;

import java.util.*;
public class AdjacenyList{
	
	//Undirected Graph
	public static void addEdge(ArrayList<ArrayList<Integer>> adj, int v1, int v2){
		
		adj.get(v1).add(v2);
		adj.get(v2).add(v1);
	}
	
	public static void printGraph(ArrayList<ArrayList<Integer>> adj) {
		
		     for(int i=0; i<adj.size(); i++) {
		    	 System.out.print(i + " -> ");
		    	 
		    	 for(int j=0; j<adj.get(i).size(); j++) {
		    		 System.out.print(adj.get(i).get(j) + " ");
		    	 }
		    	 System.out.println();
		     }
	}

	public static void main(String[] args) {
		
             int v = 5; 
             
          ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(v);
             
          for(int i=0; i<v; i++) {
        	  adj.add(new ArrayList<Integer>());
          }
             
          addEdge(adj, 0, 1);
          addEdge(adj, 0, 4);
          addEdge(adj, 1, 2);
          addEdge(adj, 1, 3);
          addEdge(adj, 1, 4);
          addEdge(adj, 2, 3);

   
          printGraph(adj);
	}

}

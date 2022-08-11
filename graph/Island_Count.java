package graph;

import java.util.*;

public class Island_Count {
 
	public static int numConnected(int[][] edges, int n) {
        boolean[] visited = new boolean[n]; 
        int count =0;
        for(int i=0; i<edges.length; i++){
           if( visited[i] == false){
                    DFS(edges, i, visited);
                     count++;
                }
        } 
        return count;
	}
    
    public static void DFS(int edges[][], int v , boolean visited[]) {
    	   visited[v] = true;
    	      for(int i=0; i<edges.length; i++) {
    	    	  if(edges[v][i]== 1 && !visited[i]) {
    	    		   visited[i] = true;
    	    		      DFS(edges, i, visited);
    	    	  }
    	      }
     }
    public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
        // total number of edges e
		int e = s.nextInt();
        int edges[][]=new int[n][n];
        for(int i=0;i<e;i++){
            int fv=s.nextInt();
            int sv=s.nextInt();
            edges[fv][sv]=1;
            edges[sv][fv]=1;
        }
        numConnected(edges, edges.length);
    }
}

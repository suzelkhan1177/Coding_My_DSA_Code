package graph;

import java.util.*;
public class isConnecting {

//	    Sample Input 1:
//		4 4
//		0 1
//		0 3
//		1 2
//		2 3
//		Sample Output 1:
//		true
	public static boolean isConnecting(int edges[][]) {
		  if(edges.length == 0)
	            return true;
		
		boolean visited[] = new boolean[edges.length];
		DFS(edges,0 , visited);
		for(boolean elm : visited) {
			 if(elm == false)
				 return false;
		}
		return true;
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
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int V = sc.nextInt();
		int E = sc.nextInt();
		
		int edges[][] = new int[V][V];
		for(int i=0; i<E; i++) {
			int v1 = sc.nextInt();
			int v2 = sc.nextInt();
			
           edges[v1][v2] = 1;
			edges[v2][v1] = 1;
		}
		boolean ans =  isConnecting(edges);
		System.out.println(ans);
	}

}

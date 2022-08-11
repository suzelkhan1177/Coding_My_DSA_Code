package graph;

import java.util.*;

public class HasPathCycleUndirectedGraph {
	
//	Sample Input 1 :
//		4 4
//		0 1
//		0 3
//		1 2
//		2 3
//		1 3
//		Sample Output 1 :
//		true
	  public static boolean hasPath(int edges[][], int v1, int v2, boolean visited[]) {
		  
		  //base case
			  if(v1 > (edges.length -1) ||  v2 > (edges.length -1) )
	              return false;
		  
			if(edges[v1][v2] == 1) {
				  return true;
			  }
			  Queue<Integer> q = new LinkedList<Integer>();
			  q.add(v1);
			  visited[v1] = true;
			  
			  while(!q.isEmpty()) {
				  int curr= q.poll();
				  for(int i=0; i<edges.length; i++) {
					  
					  if(edges[curr][i] == 1 && !visited[i]) {
						  q.add(i);
						  visited[i] = true;
					  }
				  }
			  }
			  
			 if(visited[v2]) {
				  return true;
			  }else {
				 return  false;
			  }
		}
	    
	    private static boolean dfs(int s, int d,int adj[][], boolean[] visited) {
			visited[s]=true;
			if(s==d) {

				return true;
			}
			for(int i=0;i<adj.length;i++) {
				if(!visited[i] && adj[s][i]==1) {
					boolean ans=dfs(i,d,adj,visited);
					if(ans) {
						return true;
					}
				}

			}
			return false;
		}

		public static void main(String[] args) throws NumberFormatException{
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
			
			int st = sc.nextInt();
			int ed = sc.nextInt();
			
			boolean visited[] = new boolean[V];
			
			// boolean ans = hasPath(edges, st, ed, visited);
	        	boolean ans = dfs( st, ed,edges, visited);
			System.out.println(ans);
		}

}

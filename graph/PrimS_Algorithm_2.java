package graph;

import java.util.*;

//Sample Input 1 :
//4 4
//0 1 3
//0 3 5
//1 2 1
//2 3 8
//Sample Output 1 :
//0 1 3
//1 2 1
//0 3 5
public class PrimS_Algorithm_2 {
	public static int findMin(boolean visited[], int weight[]) {
		int minVertex = -1;
	   for(int i=0; i<visited.length; i++) {
			if(!visited[i] && (minVertex == -1 || weight[i] < weight[minVertex])) {
				minVertex = i;
			}
			
		}
		return minVertex;
	}
	
	public static void PrimsAlgo(int adjMatrix[][]) {
		int n = adjMatrix.length;
		boolean visited[] = new boolean[n];
		int parent[] = new int[n];
		int weight[] = new int[n];
		
		parent[0] = -1;
		weight[0] = 0;
		for(int i=1; i<n; i++) {
			weight[i] = Integer.MAX_VALUE;
		}
		
		for(int i=0; i<n; i++) {
			int u = findMin(visited, weight);
			
			visited[u] = true;
			
			//find neighbour of min
			for(int j=0; j<n; j++) {
				if(adjMatrix[u][j] != 0 && !visited[j]) {
					
					if(weight[j]  > adjMatrix[u][j]) {
						
						// upadet Value
						weight[j] = adjMatrix[u][j];
						parent[j] = u;
					}
				}
			}
			
		}
		
		for(int i=1; i<n; i++) {
			
			if(i < parent[i]) {
				System.out.println(i + " " + parent[i] + " "+ weight[i]);
			}else {
				System.out.println(parent[i]  + " " + i+ " "+ weight[i]);
			}
		}
		
	}

	  public static void main(String[] args) {
		
		  Scanner sc = new Scanner(System.in);
		  int n = sc.nextInt();
		  int e = sc.nextInt();
		  
		  int adjMatrix[][] = new int[n][n];
		  for(int i=0; i<e; i++) {
			  
			  int v1 = sc.nextInt();
			  int v2 = sc.nextInt();
			  int weight = sc.nextInt();
			  
			  adjMatrix[v1][v2] = weight;
			  adjMatrix[v2][v1] = weight;
		  }
		  
		  PrimsAlgo(adjMatrix);
		   
	}
}

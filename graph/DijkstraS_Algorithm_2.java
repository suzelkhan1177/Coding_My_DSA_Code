package graph;

import java.util.*;
//
//Sample Input 1 :
//4 4
//0 1 3
//0 3 5
//1 2 1
//2 3 8
//Sample Output 1 :
//0 0
//1 3
//2 4
//3 5

public class DijkstraS_Algorithm_2 {
	
	public static int findMin(boolean visited[], int distance[]) {
		int minVertex = -1;
	   for(int i=0; i<visited.length; i++) {
			if(!visited[i] && (minVertex == -1 || distance[i] < distance[minVertex])) {
				minVertex = i;
			}
			
		}
		return minVertex;
	}
	
	public static  void dijkstra(int adjMatrix[][]) {
		
		 int n = adjMatrix.length;
		 boolean visited[] = new boolean[n];
		 int distance[] = new int[n];
		 
		 distance[0] = 0;
		  for(int i=1; i<distance.length; i++) {
			 distance[i] = Integer.MAX_VALUE;
		 }
		 
		 for(int i=0; i<n; i++) {
			 int minDistance = findMin(visited, distance);
			 
			 visited[minDistance] = true;
			 
			 for(int j=0; j<n; j++) {
				 if( adjMatrix[minDistance][j] != 0 && ! visited[j]) {
					  if( distance[j] > distance[minDistance] + adjMatrix[minDistance][j]) {
						 distance[j] = distance[minDistance] + adjMatrix[minDistance][j];
					 }
				 }
			 } 
		 }
		 
		 for(int i=0; i<n; i++) {
			 System.out.println(i + " "+ distance[i]);
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
     
		   dijkstra(adjMatrix);
	}

}

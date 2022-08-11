package graph;

import java.util.*;

import java.io.IOException;
public class BSF {
	
//	
//	Sample Input 1:
//		4 4
//		0 1
//		0 3
//		1 2
//		2 3
//		Sample Output 1:
//		0 1 3 2

	   public static void BFS(int adjMatrix[][] , int idx , boolean visited[] ) {
		   Queue<Integer> q = new LinkedList<Integer>();
		   visited[idx] = true;
		   q.add(idx);
		   while(!q.isEmpty()) {
			   int curr = q.poll();
			   System.out.print(curr + " ");
			   for(int i=0; i<adjMatrix.length; i++) {
				   if(adjMatrix[curr][i] == 1 && !visited[i]) {
					   //unvisited neighbour
					    q.add(i);
					   visited[i] = true;
				   }
			   }  
		   }  
	   }
	   
	   //Visisted
	   public static void print(int edges[][]) {
		   boolean visited[] = new boolean[edges.length];
		    for(int i=0; i<edges.length; i++) {
			   if(!visited[i]) {
				   BFS(edges, i , visited);
			   }
		   }
	   }

	public static void main(String[] args) throws NumberFormatException, IOException {
        
        Scanner sc = new Scanner(System.in);
		
		 int v =  sc.nextInt();
		 int e =  sc.nextInt();
		 int adjMat[][] = new int[v][v];
		
		for(int i=0; i<e; i++) {
			 int v1 = sc.nextInt();
			 int v2 = sc.nextInt();
			 
			adjMat[v1][v2] =1;
			adjMat[v2][v1] =1;
			 
		 }

		print(adjMat);
	}


}

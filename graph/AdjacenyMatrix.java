package graph;

import java.util.*;
public class AdjacenyMatrix {
//        v e 
//Input - 4 5
//        0 1
//        0 2
//        3 0
//        1 3
//        2 3
 
//output	0 1 1 1 
//	       1 0 0 1 
//	       1 0 0 1 
//	       1 1 1 0 
	
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 int n = sc .nextInt();
		 int e = sc. nextInt();
		 
		 int adjMat[][] = new int[n][n];
		 for(int i=0; i<e; i++) {
			 int v1 = sc.nextInt();
			 int v2 =  sc.nextInt();
			 
			 adjMat[v1][v2]=1;
			 adjMat[v2][v1]= 1;
		 }
		 
		 for(int i=0; i<n; i++) {
			 for(int j=0; j<n; j++) {
				 System.out.print(adjMat[i][j] + " ");
			 }
			 System.out.println();
		 }

	}

}

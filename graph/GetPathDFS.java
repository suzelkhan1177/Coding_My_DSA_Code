package graph;

import java.util.*;
public class GetPathDFS {
//	Sample Input 1 :
//		4 4
//		0 1
//		0 3
//		1 2
//		2 3
//		1 3
//		Sample Output 1 :
//		3 0 1
	
	public static  ArrayList<Integer> getPathDFS(int edges[][], boolean visited[], int v1, int v2) {
		
		 if(v1 == v2) {
			 ArrayList<Integer> ans = new ArrayList<>();
			 ans.add(v1);
			 visited[v1] = true;
			 return ans;
		 }
		 
		 visited[v1] = true;
		 for(int i=0; i<edges.length; i++) {
			 if(edges[v1][i] == 1 && !visited[i]) {
				  ArrayList<Integer> ans =  getPathDFS(edges, visited, i, v2);
				 
				 if(ans != null) {
					 ans.add(v1);
					 
					 return ans;
				 }
			 }
		 }
		 return null;
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
		
		int st = sc.nextInt();
		int ed = sc.nextInt();
	       boolean visited[]=new boolean[V];

         ArrayList<Integer> ans = getPathDFS(edges, visited, st, ed);
         
         if(ans!=null){
             for(int elem:ans)
             {
                 System.out.print(elem+" ");
             }
         }
	}
	
}

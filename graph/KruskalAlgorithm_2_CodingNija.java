package graph;

import java.util.*;
class Edge implements Comparable<Edge>{

	int v1;
	int v2;
	int weight;
	
	Edge(int v1 , int v2 , int weight){
		this.v1 = v1;
		this.v2 = v2;
		this.weight = weight;
	}
	
   @Override
	public int compareTo(Edge secondWeight) {
      return this.weight - secondWeight.weight;
	} 	
}

//Sample Input 1 :
//4 4
//0 1 3
//0 3 5
//1 2 1
//2 3 8
//Sample Output 1 :
//1 2 1
//0 1 3
//0 3 5


public class KruskalAlgorithm_2_CodingNija {
	
	public  static int findParent(int node, int parent[]) {
		if(node == parent[node]) {
			return node;
		}
		return parent[node] =  findParent(parent[node], parent);
	}
	
	public static Edge[] KruskalAlgorithm(Edge[] edges , int n) {
		
		//weight sort
		Arrays.sort(edges);
		Edge mst[] = new  Edge[n-1];
		int parent[] = new int[n];
		
		for(int j=0; j<n; j++) {
			parent[j] = j;
		}
		
		int count = 0, i = 0 ;
		
		while(count != n -1) {
			Edge currentEdge = edges[i++];
			int v1Parent =  findParent(currentEdge.v1, parent);
			int v2Parent =  findParent(currentEdge.v2, parent);
			
			if(v1Parent != v2Parent) {
				
				//Include Edges
				mst[count] = currentEdge;
				count++;
				//update Parent
				parent[v1Parent] = v2Parent;
			}
		}
		return mst;
	}

	public static void print(Edge mst[]) {
		
		for(int i=0; i<mst.length; i++) {
			  
			  if(mst[i].v1 < mst[i].v2) {
				  System.out.println(mst[i].v1 + " " + mst[i].v2 + " " + mst[i].weight);
			  }else {
				  System.out.println(mst[i].v2 + " " + mst[i].v1 + " " + mst[i].weight);
			  }
		  }
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n =  sc.nextInt();
		int e = sc.nextInt();
		
		Edge edges[] = new Edge[e];
		
		  for(int i=0; i<e; i++) {
			  
			  int v1 = sc.nextInt();
			  int v2 = sc.nextInt();
			  int weight = sc.nextInt();
			  
			  Edge edge = new  Edge(v1, v2, weight);
			  
			  edges[i] = edge;
		  }
		  
		  Edge mst[] = KruskalAlgorithm(edges, n);
		  
		  print(mst);
	}

}

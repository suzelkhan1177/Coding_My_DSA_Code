package graph;

import java.util.*;
public class Graph{
  
	private static ArrayList<Integer> adj[];
	
	public Graph(int v){
		adj = new ArrayList[v];
		
		for(int i=0; i<v; i++) {
			adj[i] = new ArrayList<Integer>();
		}
	}
	
	public void addEdge(int v1, int v2) {
		
		adj[v1].add(v2);
		adj[v2].add(v1);
	}
	
	public static ArrayList<Integer> BFS(int source, int edges[][]){
		
		ArrayList<Integer> arr = new ArrayList<>(); 
		 boolean visited[] =  new boolean[edges.length];
		  int a = 0;
		  Queue<Integer> q = new  LinkedList<>();
		  
		  q.add(source);
		  visited[source] = true;
		  
		  while(!q.isEmpty()) {
			  int curr = q.poll();
	          
			  arr.add(curr);
//			  System.out.print(curr + " ");
			  for(int i=0; i<adj[curr].size(); i++) {
				  
				  a = adj[curr].get(i);
				  if(!visited[a]) {
					  
					  visited[a]= true;
					  q.add(a);	
				  }
			  }
		  }
		  return arr;
	}
	
	public static void BFS(int source , int destination) {
		
		  boolean visited[] =  new boolean[adj.length];
		  int a = 0;
		  Queue<Integer> q = new  LinkedList<>();
		  
		  q.add(source);
		  visited[source] = true;
		  
		  while(!q.isEmpty()) {
			  int curr = q.poll();
	          
			  System.out.print(curr + " ");
			  for(int i=0; i<adj[curr].size(); i++) {
				  
				  a = adj[curr].get(i);
				  if(!visited[a]) {
					  
					  visited[a]= true;
					  q.add(a);	
				  }
			  }
		  }
	}
	
	 public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 int v = 4;
		 int e = 4;
		 
		 Graph graph = new Graph(v);
		 System.out.println("Enter the "+ e + " edges");
		 
		 for(int i=0; i<e; i++) {
			 int source = sc.nextInt();
			 int destination = sc.nextInt();
			 
			 graph.addEdge(source, destination  );
			 
		 }
		 
//	 System.out.println(	graph.BFS(e, null));
		 graph.BFS(0,0);
	}
}

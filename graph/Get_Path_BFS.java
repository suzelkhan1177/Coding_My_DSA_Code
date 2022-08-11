package graph;

import java.util.*;

//Sample Input 1 :
//4 4
//0 1
//0 3
//1 2
//2 3
//1 3
//Sample Output 1 :
//3 0 1
public class Get_Path_BFS {
	
	//Approch first
	public static ArrayList<Integer> shortestPath(int[][] edges, int n, int e, int s, int t) {
        
		//adj List
		ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(n+1);
        for(int i=0; i<=n; i++) {
            adj.add(new ArrayList<Integer>());
        }
    
         for(int i=0; i< e; i++) {
             
             int v1 = edges[i][0];
             int v2 = edges[i][1];
             
                adj.get(v1).add(v2);
                adj.get(v2).add(v1); 
         }
         
         int visited[] = new int[n+1];
         int parents[] = new int[n+1];
         
         for(int i=0; i<n; i++) {
             visited[i] = 0;
             parents[i] = -1;
         }
         
         //BFS Traversal
        Queue<Integer> q = new LinkedList<>();
         
         visited[s] = 1;
         parents[s] = -1;
         q.add(s);
         
         
         while(!q.isEmpty()) {
             int currentNode = q.poll();
             
             for (int i = 0; i < adj.get(currentNode).size(); i++) 
             {
           
                 if (visited[adj.get(currentNode).get(i)] == 0) 
                 {
                     visited[adj.get(currentNode).get(i)] = 1;
                     q.add(adj.get(currentNode).get(i));
                     parents[adj.get(currentNode).get(i)] = currentNode;
                 }
             }
         }
         
         ArrayList<Integer> ans = new ArrayList<>();
         int currNode = t;
           ans.add(currNode);
          while(parents[currNode] != -1) {
              
              currNode =  parents[currNode];
              ans.add(currNode);
          }
            Collections.reverse(ans);
          return ans;
        
    }
	
	// Approch 2
	
	   public static ArrayList<Integer> getPathBFS(int[][] edges,boolean[] visited,int v1,int v2){
	        if(v1==v2)
	        {
	            ArrayList<Integer> ans=new ArrayList<Integer>();
	            ans.add(v1);
	            visited[v1]=true;
	            return ans;
	        }
	        Queue<Integer> q=new LinkedList<Integer>();
	        HashMap<Integer,Integer> parent=new HashMap<>();
	        ArrayList<Integer> ans=new ArrayList<>();
	        q.add(v1);
	        visited[v1]=true;
	        while(!q.isEmpty() ){
	            int curr=q.poll();
	            
	            for(int i=0;i<edges.length;i++){
	            	
	                if(edges[curr][i]==1 && !visited[i]){
	                    visited[i]=true;
	                    q.add(i);
	                    parent.put(i,curr);
	                    
	                    if(i==v2)
	                    {    
	                    	ans.add(i); 
	                     while(!ans.contains(v1)){

	                    	 int currVertex = parent.get(i);
	                         ans.add(currVertex);
	                         i= currVertex;
	                     }
	                     return ans;
	                    }
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
//         ArrayList<Integer> ans =shortestPath(edges, V, E, st, ed);
         
         ArrayList<Integer> ans = getPathBFS(edges, visited, st, ed);
         
         if(ans!=null){
             for(int elem:ans)
             {
                 System.out.print(elem+" ");
             }
         }
	}
}

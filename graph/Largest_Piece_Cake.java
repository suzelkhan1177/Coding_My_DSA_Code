package graph;

public class Largest_Piece_Cake {
	
	
	public static int dfs(String[] edge, int n) {
		   boolean[][]  visited = new boolean[edge.length][edge[0].length()];
	          int max = Integer.MIN_VALUE;
	        for(int i=0; i<n; i++){
	            for(int j=0; j<n; j++){
	                 if(edge[i].charAt(j) == '1' && visited[i][j] == false){
	                      int ans = dfsHelper(edge, i,j, visited);
	                     if( ans > max){
	                         max = ans;
	                     }
	                  }
	            }
	        }
	        return max;
		}
	    
	    
	    public static int dfsHelper(String edges[] , int i, int j, boolean visited[][]){
	        
	          if(i < 0 || j<0 || i>= edges.length || j>= edges.length || visited[i][j] == true){
	              return 0;
	          }
	        
	         int ans =0;
	         if( edges[i].charAt(j) == '1'){
	             
	             visited[i][j] = true;
	            ans = 1;
	             ans += dfsHelper(edges, i+1, j, visited);
	               ans += dfsHelper(edges, i, j+1, visited);
	               ans += dfsHelper(edges, i, j-1, visited);
	               ans += dfsHelper(edges, i-1, j, visited);     
	        }
	        
	        return ans;
	    }

}

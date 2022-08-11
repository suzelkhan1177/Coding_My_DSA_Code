package graph;

public class Three_3_Cycle {
	
	public static int solve(boolean[][] graph, int n) {
	    int count =0;
for(int i=0; i<n; i++){
      for(int j=0; j<n; j++){
          if(graph[i][j] == true){
              for(int k=0; k<n; k++){
                  if(graph[j][k] == true && graph[k][i] == true){
                        count++;
                    }
              }
          }
          
      }
  }
  return count/6;
}

}

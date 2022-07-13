package backTracking;

public class CheckRatMaze {
  
	public static boolean ratInAMaze(int maze[][]){

		int n = maze.length;
		int path[][] = new int[n][n];
		
		
       return solveMaze(maze,0,0,path);
	}
	
	public static boolean solveMaze(int maze[][], int i, int j, int path[][]) {
		
		int n = maze.length;
		
		//check i , j is valid or Not 
	if(i < 0 || i >=n  || j<0 ||  j>=n || maze[i][j] == 0 || path[i][j] ==1) {
			return false;
		}
	
	// include tha cell current path
	   path[i][j] = 1;
	   
	   //Achived Destination
	   if(i == n-1 && j== n-1) {
		   path[i][j] =0;
		   return  true;
	   }
	   
		boolean posible = false;
		
		//top
		if(solveMaze(maze, i-1,j ,path)) {
			posible = true;
		}
		
		//right
		if(solveMaze(maze, i, j+1, path)) {
			posible  = true;
		}
		
		//left
		if(solveMaze(maze, i, j-1, path)) {
			posible = true;
		}
		
		//bottom
		if(solveMaze(maze, i+1, j, path)) {
			posible = true;
		}
		
		
		return posible;
	}
	
	public static void main(String[] args) {
		
		int arr[][] = {
			 {1,0,0,0},
			 {1,1 ,0,1},
			 {1,1 ,0,0},
			 {0,1 ,1,1}
		};
		
	   System.out.println(ratInAMaze(arr));
	}
}

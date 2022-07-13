package backTracking;

public class RatMazeAllPath {

	public static void ratInAMaze(int maze[][], int n) {
		
        int path[][] = new int[n][n];
        printMazePath(maze, 0, 0,path,n);

	}
   	public static void printMazePath(int maze[][], int i, int j, int path[][] ,int n) {
			
      	//check i , j is valid or Not 
			if(i<0 || i>=n || j<0 || j>=n || maze[i][j]==0 || path[i][j] ==1) {
				return;
			}
			// include tha cell current path
			path[i][j] =1;
			
			   //Achived Destination
			if(i == n-1 && j==n-1) {
				for(int r=0;  r < n; r++) {
					for(int c=0; c < n; c++) {
						System.out.print(path[r][c] + " ");
					}
				}
				System.out.println();
			   path[i][j] =0;
			   return;
			}
			//top
			printMazePath(maze, i-1, j, path,n);
			//bottom
			printMazePath(maze, i+1, j, path,n);
			
			//left
	       printMazePath(maze, i, j-1, path,n);
			//right
			printMazePath(maze, i, j+1, path,n);
			//important
			path[i][j] =0;

		}
public static void main(String[] args) {
		
		int arr[][] = {
				{1,0, 1},
				{1, 1 ,1},
				{1 ,1, 1}
		};
		
	  ratInAMaze(arr, arr.length);
	}
}

package backTracking;

public class Sudoku {

	 static  boolean isSafe(int row, int col, int sudoku[][], int val){
	        
	       for(int i=0; i<sudoku.length; i++){
	           
	           //row check
	           if(sudoku[row][i] == val)
	               return false;
	               
	               //column check
	               if(sudoku[i][col] == val)
	                   return false;
	           
	           //check 3 * 3 Matrix
	           int r = 3*(row/3) + i/3;
	           int c = 3*(col/3) + i%3;
	           if(sudoku[r][c] == val)
	               return false;  
	       }
	        return true;
	    }
	   
	 static   boolean solve(int[][] sudoku){
	        int n = sudoku.length;
	        
	        for(int row =0; row<n; row++){
	            for(int col=0; col<n; col++){
	                
	                //cell isEmpty
	                if(sudoku[row][col] ==0){
	                    for(int val =1; val<=9; val++){
	                        if(isSafe(row , col , sudoku,val)){
	                            
	                            sudoku[row][col] = val;
	                             //recurtion call backtrack
	                             boolean nextSolution = solve(sudoku);
	                            if(nextSolution){
	                                return true;
	                            }else{
	                                sudoku[row][col] = 0;
	                            }
	                        }
	                    }
	                    return false;
	                }
	            }
	        }
	        
	        return true;
	    } 
	    
		public static void solveSudoku(int[][] sudoku) {
	     
	        solve(sudoku);
		}
}

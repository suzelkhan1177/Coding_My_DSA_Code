package backTracking;

import java.util.*;


public class NQueeenProblem {
	
	  public boolean isSafe(int row, int col, char board[][]){
	        
	        //horizotial or row
	        for(int j =0; j<board.length; j++){
	            if(board[row][j]== 'Q'){
	                return false;
	            }
	        }
	        
	        //vertial or column
	        for(int i=0; i<board[0].length; i++){
	            if(board[i][col] == 'Q'){
	                return false;
	            }
	        }
	        
	        int r = row;
	        
	        //upper left
	       for(int c =col; c>=0 && r >=0; r--, c-- ){
	            if(board[r][c]== 'Q'){
	                return false;
	            }
	        }
	        
	        //upper right
	        r = row;
	        
	        for(int c=col; c <board.length && r >=0; r--,c++){
	             if(board[r][c]== 'Q'){
	                return false;
	            }
	        }
	        
	        //lower left
	        r =row;
	        for(int c = col;  r<board.length && c >=0; r++,c--){
	             if(board[r][c]== 'Q'){
	                return false;
	            }
	        }
	        
	        //lower right
	        r=row;
	        for(int c=col; c<board.length && r<board.length  ; r++,c++ ){
	             if(board[r][c]== 'Q'){
	                return false;
	            }
	        }
	        
	        
	        return true;
	    }
	    
	    
	    public void saveBoard(char board[][], List<List<String>> allBoard){
	        String row = "";
	    List<String> newBoard = new ArrayList<>();
	        
	        for(int i=0; i<board.length; i++){
	            row="";
	            for(int j=0; j<board[0].length;  j++){
	                
	                if(board[i][j] == 'Q'){
	                    row += "1 ";
	                }else{
	                    row +="0 ";
	                }
	            }
	            
	            newBoard.add(row);
	        }
	        
	        allBoard.add(newBoard);
	    }
	    
	    public void helper(char board[][], List<List<String>> allBoard, int col){
	        
	        //base case
	        if(col == board.length){
	            saveBoard(board,allBoard);
	            return;
	        }
	    
	        
	        for(int row =0; row<board.length; row++){
	             if(isSafe(row,col,board)){
	                board[row][col] = 'Q';
	                helper(board, allBoard, col +1);
	                board[row][col] = '.';
	                
	            }
	        }
	    }
	    
	    public void solveNQueens(int n) {
	         
	        List<List<String>> allBoard = new ArrayList<>();
	        char board[][] = new char[n][n];
	        
	        helper(board, allBoard, 0);
	        
	        for(int i = 0; i < allBoard.size(); i++){
		          for(int j = 0; j < allBoard.get(i).size(); j++){
		              System.out.print(allBoard.get(i).get(j) + " ");
		          }
		          System.out.println();
		      }
	        
	    }
	 

	
	public static void main(String[] args) {
		
		NQueeenProblem obj = new NQueeenProblem();
	     int n =4;
	     obj.solveNQueens(n);
	}

}

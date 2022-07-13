package backTracking;

 public boolean isSafe(int row, int col, int board[][]){
	        
	        //horizotial or row
	        for(int j =0; j<board.length; j++){
	            if(board[row][j]== 1){
	                return false;
	            }
	        }
	        
	        //vertial or column
	        for(int i=0; i<board[0].length; i++){
	            if(board[i][col] == 1){
	                return false;
	            }
	        }
	        
	        int r = row;
	        
	        //upper left
	       for(int c =col; c>=0 && r >=0; r--, c-- ){
	            if(board[r][c]== 1){
	                return false;
	            }
	        }
	        
	        //upper right
	        r = row;
	        
	        for(int c=col; c <board.length && r >=0; r--,c++){
	             if(board[r][c]== 1){
	                return false;
	            }
	        }
	        
	        //lower left
	        r =row;
	        for(int c = col;  r<board.length && c >=0; r++,c--){
	             if(board[r][c]== 1){
	                return false;
	            }
	        }
	        
	        //lower right
	        r=row;
	        for(int c=col; c<board.length && r<board.length  ; r++,c++ ){
	             if(board[r][c]== 1){
	                return false;
	            }
	        }
	        
	        
	        return true;
	    }
	    
	    
	
	    
	    public void helper(int[][] board,  int col, int n){
	        
	       if(col == n) {
	    	   for(int i=0; i <n ; i++) {
	    		   for(int j=0; j<n; j++) {
	    			   System.out.print(board[i][j] + " ");
	    		   }
	    	   }
	    	   System.out.println();
	       }
	    
	        
	        for(int row =0; row<board.length; row++){
	             if(isSafe(row,col,board)){
	                board[row][col] = 1;
	                helper(board,  col +1 , n);
	                board[row][col] = 0;
	                
	            }
	        }
	    }
	    
	    public void solveNQueens(int n) {
	         int board[][] =  new int[n][n];
	         helper(board, 0 ,n);
	        
	    }
	 

	
	public static void main(String[] args) {
		
		NQueeenProblem obj = new NQueeenProblem();
	     int n =4;
	     obj.solveNQueens(n);
	}

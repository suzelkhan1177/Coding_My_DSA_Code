package tictactoe;

public class Board {
	
	private char board[][];
	private int boardSize = 3;
	private char p1Symbol, p2Symbol;
	
//	count of tha nubmer of cell filled
	private int count;
	private static final char EMPTY = ' ';
	public static final int PLAYER1WINS = 1;
	public static final int PLAYER2WINS = 2;
	public static final int DRAW = 3;
	public static final int INCOMPLETE = 4;
	public static final int INVALIDE = 5;
	
	
	
	public Board(char p1Symbol, char p2Symbol){
		 board = new char[boardSize][boardSize];
		 for(int i=0; i<boardSize; i++) {
			 for(int j=0; j<boardSize; j++) {
				 board[i][j] = EMPTY;
			 }
		 }
		 this.p1Symbol = p1Symbol;
		 this.p2Symbol = p2Symbol;
	}
	
	
	public int move(char symbol , int x , int y) {
		
		//base inside tha Matrix
		if(x < 0 || x >= boardSize || y < 0 || y >= boardSize || board[x][y] != EMPTY) {
			return INVALIDE;
		}
		
		board[x][y] = symbol;
		count++;
		
		//Row
		if(board[x][0] ==  board[x][1] &&  board[x][0] ==  board[x][2]) {
			return symbol == p1Symbol ? PLAYER1WINS : PLAYER2WINS;
		}
		
		//col
		if(board[0][y] ==  board[1][y] &&  board[0][y] ==  board[2][y]) {
			return symbol == p1Symbol ? PLAYER1WINS : PLAYER2WINS;
		}
		
		//First Diagonal
		if(board[0][0] != EMPTY && board[0][0] == board[1][1] && board[0][0] == board[2][2]) {
			return symbol == p1Symbol ? PLAYER1WINS : PLAYER2WINS;
		}
		
		//seacod Diagonal
		if(board[0][2] != EMPTY && board[0][2] == board[1][1] && board[0][2] == board[2][0]) {
			return symbol == p1Symbol ? PLAYER1WINS : PLAYER2WINS;
		}
		
		
		if( count ==  boardSize * boardSize) {
			return DRAW;
		}
		
		return INCOMPLETE;
	}
	
	public void print() {
		System.out.println("---------------");
		for(int i=0; i<boardSize; i++) {
			 for(int j=0; j<boardSize; j++) {
				  System.out.print("| "+ board[i][j] + " |");
			 }
			 System.out.println();
		 }
//		System.out.println();
		System.out.println("---------------");
	}
	

}

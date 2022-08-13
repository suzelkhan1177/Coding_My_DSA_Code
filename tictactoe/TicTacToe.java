package tictactoe;

import java.util.*;
public class TicTacToe {
	
	private Player player1, player2;
	private Board board;
	private int numPlayer;
	
	
	public static void main(String[] args) {
		TicTacToe t = new TicTacToe();
		t.startGame();
	}
	
	public void startGame() {
		Scanner sc = new Scanner(System.in);
		
		//take plyer input
		player1 = takePlayerInput(++numPlayer);
		player2 = takePlayerInput(++numPlayer);
		
		while(player1.getSymbol() == player2.getSymbol()) {
			System.out.println("Symbol is already taken!!  Please taken symbol again");
			
			player2.setSymbol(sc.next().charAt(0));
		}
		
		//Create Board
		board = new Board(player1.getSymbol(), player2.getSymbol());
		
		//play the game
		boolean player1Turn = true;
		int status = Board.INCOMPLETE;
		while(status == Board.INCOMPLETE || status ==  Board.INVALIDE) {
			//first player
			if(player1Turn) {
				System.out.println("Player 1 - " + player1.getName() + "'s turn");
				System.out.println("Enter x: ");
				int x = sc.nextInt();
				
				System.out.println("Enter y: ");
				int y = sc.nextInt();
				
				 status = board.move(player1.getSymbol(), x ,y);
				
				if(status == Board.INVALIDE) {
					System.out.println("Invalid move !! Please Try Again!!");
					continue;
				}
				
				}else {
					
					//Second Player
					System.out.println("Player 2 - " + player2.getName() + "'s turn");
					System.out.println("Enter x: ");
					int x = sc.nextInt();
					
					System.out.println("Enter y: ");
					int y = sc.nextInt();
					
					 status = board.move(player2.getSymbol(), x ,y);
					
					if(status == Board.INVALIDE) {
						System.out.println("Invalid move !! Please Try Again!!");
						continue;
					}
		     	}
			
			player1Turn = !player1Turn;
			board.print();
		}
			
			if(status  == Board.PLAYER1WINS) {
				System.out.println("Player 1 - " + player1.getName() + " Win !!");
				
			}else if(status  == Board.PLAYER2WINS) {
				System.out.println("Player 2 - " + player2.getName() + " Win !!");
			}else {
				System.out.println("Draw !!");
			}
			
	  
			//end Bracket
	}
	
	private Player takePlayerInput(int num) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Player "+ num + " name: ");
		String name = sc.nextLine();
		
		System.out.println("Enter Player "+ num + " symbol: ");
		char symbol = sc.next().charAt(0);
		
		Player p = new Player(name, symbol);
		return p;
	}

}

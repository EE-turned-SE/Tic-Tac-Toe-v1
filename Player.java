

import java.util.Scanner;

abstract public class Player {
	protected String name;
	protected Board board;
	protected Player opponent;
	protected char mark;
	
	/**
	 * 
	 * This is the constructor for the class Player. This initializes the private data members name and mark with the string and character that is passed in.
	 * @param name This initializes private data member 'name'
	 * @param mark This initializes private data member 'mark'
	 */
	public Player(String name, char mark) {
		this.name = name;
		this.mark = mark;
	}
	
	/**
	 * This method calls method makeMove to get the move of a player before printing that move onto the board.
	 * The method also checks if the game is over either by a tie or a win by either player. If those statements are false
	 * then it continues the game by recalling this function and passing the turn over to the opposing player.
	 * 
	 */
	protected void play() {

		makeMove();	
		board.display();
		
		if(board.xWins()) {
			System.out.println("The GAME IS OVER: " + name + " is the winner!");
			System.out.println("Game Ended....");
			System.exit(0);
		}
		else if (board.oWins()) {
			System.out.println("The GAME IS OVER: " + name + " is the winner!");
			System.out.println("Game Ended....");
			System.exit(0);
		}
		else if (board.isFull()) {
			System.out.println("The game has resulted in a tie.");
			System.out.println("Game Ended....");
			System.exit(0);
		}
		else
			opponent.play();
		
	}
	
	/**
	 * This method takes in the move that the player would like to make and calls the method addMark 
	 * to mark that move onto the board. The method makes sure that the player is not entering invalid rows or columns
	 * as well as makes sure that the move that they enter has not already been used prior.
	 */
	protected abstract void makeMove(); 
	
	/**
	 * This is the setter for private data member opponent
	 * @param p This is the parameter that sets the private data member opponent
	 */
	protected void setOpponent(Player p) {
		opponent = p;
	}
	
	/**
	 * This is the setter for private data member board
	 * @param theBoard This is the parameter that sets the private data member board
	 */
	protected void setBoard(Board theBoard) {
		board = theBoard;
	}
}

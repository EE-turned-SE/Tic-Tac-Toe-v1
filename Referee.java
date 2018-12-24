

public class Referee {
	
	private Player xPlayer;
	private Player oPlayer;
	private Board board;
	
	/**
	 * This is the default constructor for Class Referee
	 */
	public Referee() {}
	
	/**
	 * This method initiates the game. First it sets the opponents for 
	 * both players, then it displays the board before calling on xPlayer to make the first move
	 */
	public void runTheGame() {
		System.out.println("\nReferee started the game...");
		xPlayer.setOpponent(oPlayer);
		oPlayer.setOpponent(xPlayer);
		board.display();
		xPlayer.play();
	}
	
	/**
	 * This is the setter for the private data member board.
	 * @param board This parameter sets the private data member board
	 */
	public void setBoard(Board board) {
		this.board = board;
	}
	
	/**
	 * This is the setter for the private data member oPlayer
	 * @param oPlayer This parameter sets the private data member oPlayer
	 */
	public void setoPlayer(Player oPlayer) {
		this.oPlayer = oPlayer;
	}
	
	/**
	 * This is the setter for the private data member xPlayer
	 * @param xPlayer This parameter sets the private data member xPlayer
	 */
	public void setxPlayer(Player xPlayer) {
		this.xPlayer = xPlayer;
	}
	
}

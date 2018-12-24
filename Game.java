//Programmed by Leon Ngai, October 3, 2018


import java.io.*;



public class Game implements Constants {

	private Board theBoard;
	private Referee theRef;
	
    /**
     * This is the default constructor for class Game 
     */
    public Game( ) {
        theBoard  = new Board();
	}
    
    /**
     * This method sets the private data member theRef and calls the method runTheGame which
     * initiates the start of the game
     * @param r This parameter sets the private data member theRef
     * @throws IOException This is to account for any input output errors
     */
    public void appointReferee(Referee r) throws IOException {
        theRef = r;
    	theRef.runTheGame();
    }
	
	/**
	 * This is the main function for the class and creates a new game before getting two users to
	 * enter their names to represent both the x and o player. The referee is then appointed to begin
	 * the initiation of the game.
	 * @param args unused
	 * @throws IOException This is to account for any input output errors
	 */
	public static void main(String[] args) throws IOException {
		Referee theRef;
		Player xPlayer, oPlayer;
		BufferedReader stdin;
		Game theGame = new Game();
		stdin = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("\nPlease enter the name of the \'X\' player: ");
		String name= stdin.readLine(); // name = x player
		while (name == null) {
			System.out.print("Please try again: ");
			name = stdin.readLine();
		}

		xPlayer = new Player(name, LETTER_X); //calls player class to create x player
		xPlayer.setBoard(theGame.theBoard);
		
		System.out.print("\nPlease enter the name of the \'O\' player: ");
		name = stdin.readLine();
		while (name == null) {
			System.out.print("Please try again: ");
			name = stdin.readLine();
		}
		
		oPlayer = new Player(name, LETTER_O);
		oPlayer.setBoard(theGame.theBoard);
		
		theRef = new Referee();
		theRef.setBoard(theGame.theBoard);
		theRef.setoPlayer(oPlayer);
		theRef.setxPlayer(xPlayer);
        
        theGame.appointReferee(theRef);
	}
	

}

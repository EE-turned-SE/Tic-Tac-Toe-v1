

import java.util.Scanner;

public class HumanPlayer extends Player {
	public HumanPlayer(String name, char mark) {
		super(name, mark);
	}
	
	@Override
	public void makeMove() {
		int row, column;
		
		while(true) {
			while(true) {
		    	System.out.println(name + ", what row should your next " + mark + " be placed in?");
				Scanner scanRow = new Scanner(System.in);
		    	row = scanRow.nextInt();
		    	
		    	if (row < 0 || row > 2)
		    		System.out.println("Invalid entry, try again.");
		    	else
		    		break;
			}
	
			while(true) {
		    	System.out.println(name + ", what column should your next " + mark + " be placed in?");
				Scanner scanColumn = new Scanner(System.in);
		    	column = scanColumn.nextInt();
		    	
		    	if (column < 0 || column > 2)
		    		System.out.println("Invalid entry, try again.");
		    	else
		    		break;
			}
	
	    	if (board.getMark(row, column) != ' ') {
	    		System.out.println("Sorry, this spot has already been taken. Try again.");
	    	}
	    	else
	    		break;
		}
		
    	board.addMark(row, column, mark);
    	
	}
}



public class BlockingPlayer extends RandomPlayer{

	public BlockingPlayer(String name, char mark) {
		super(name, mark);
	}
	
	@Override
	protected void makeMove() {
//		first traverses through the board to check if they need 
//		to block the opponent from winning on the next move
		for (int row = 0; row < 3; row++) {
			for (int col = 0; col < 3; col++) {
				if (testForBlocking(row,col)) {
					board.addMark(row,col,mark);
					return;
				}		
			}
		}
		
		super.makeMove();
//		if there is no blocking move needed to be made, the program will go through
//		the previous code from parent class RandomPlayer and choose a random space 

	}
	
	protected boolean testForBlocking(int row, int col) {
		int result;
		if (board.getMark(row, col) == SPACE_CHAR) {
			board.addMark(row,col,opponent.mark);
			result = board.checkWinner(opponent.mark);
			board.decrementMarkCount(row, col);
		}
		else
			return false;
		
		if (result == 1)
			return true;
		else
			return false;
	}
}


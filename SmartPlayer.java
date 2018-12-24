

public class SmartPlayer extends BlockingPlayer{
	public SmartPlayer(String name, char mark) {
		super(name,mark);
	}
	
	@Override
	protected void makeMove() {
		for (int row = 0; row < 3; row++) {
			for (int col = 0; col < 3; col++) {
				if (testForWinning(row,col)) {
					board.addMark(row,col,mark);
					return;
				}
			}
		}
				
		super.makeMove();

	}
	
	protected boolean testForWinning(int row, int col) {
		int result;
		if (board.getMark(row, col) == SPACE_CHAR) {
			board.addMark(row,col,mark);
			result = board.checkWinner(mark);
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


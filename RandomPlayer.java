

public class RandomPlayer extends Player implements Constants {

	public RandomPlayer(String name, char mark) {
		super(name, mark);
	}

	@Override
	protected void makeMove() {
		int row, column;
		RandomGenerator generatedMove = new RandomGenerator();
		while (true) {
			row = generatedMove.discrete(0, 2);
			column = generatedMove.discrete(0, 2);
			
			if (board.getMark(row, column) == SPACE_CHAR)
				break;
		}

		board.addMark(row, column, mark);
	}
	
}

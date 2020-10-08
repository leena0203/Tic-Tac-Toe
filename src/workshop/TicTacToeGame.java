package workshop;

public class TicTacToeGame {
	public char[] board;

	public TicTacToeGame() {
		board = new char[10];
		initializeBoard();
	}

	public void initializeBoard() {
		for (int i = 1; i <= 10; i++) {
			board[i] = 0;
		}
	}
}

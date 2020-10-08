package workshop;

import java.util.Scanner;

public class TicTacToeGame {
	char computer;
	static char currentPlayerMark;

	public static char[] initializeBoard() {
		char[] board = new char[10];
		for (int i = 1; i <= 9; i++) {
			board[i] = ' ';
		}
		return board;
	}

	public static void input() {
		char computer, currentPlayerMark;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Input:");
		currentPlayerMark = input.next().charAt(0);
		if (currentPlayerMark == 'X' || currentPlayerMark == 'O') {
			if (currentPlayerMark == 'X') {
				computer = 'O';
			} else {
				computer = 'X';
			}
		} else {
			System.out.println("Not a Valid Input.");
		}

	}

	public static void printBoard(char[] board) {
		for (int i = 1; i < board.length; i++) {
			System.out.print(board[i] + " | ");
			if (i % 3 == 0) {
				System.out.println("");
			}
		}
	}

	public static void enterAtValidPosition(Scanner input, char[] board) {
		int entry = 0;
		System.out.println("Enter the index:");
		entry = input.nextInt();
		if (entry < 1 || entry > 9) {
			System.out.println("Invalid entry");
			enterAtValidPosition(input, board);
		}

		if (!(board[entry] == ' ')) {
			System.out.println("Already taken this position");
			enterAtValidPosition(input, board);
		}

		board[entry] = currentPlayerMark;
		printBoard(board);
	}
	
	public static void whoStartFirst() {
		if(Math.random() < 0.5) {
			System.out.println("Head is up:its currentPlayerMark");
		}
		else {
			System.out.println("Tails is up:its computer's turn");
		}
		
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char[] board = initializeBoard();
		input();
		whoStartFirst();
		printBoard(board);
		enterAtValidPosition(input, board);

	}
}

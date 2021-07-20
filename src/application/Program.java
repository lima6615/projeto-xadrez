package application;

import java.util.Locale;
import java.util.Scanner;

import boardgame.Board;
import chess.ChessMatch;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		

		ChessMatch chessMath = new ChessMatch();
		
		UI.printBoard(chessMath.getPieces());
		sc.close();
	}
}

package chess;

import boardgame.Board;
import boardgame.Piece;

public class ChessPiece extends Piece {
	private Color color; // Classe color do pacote enum

	// Declarando o construtor
	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

}
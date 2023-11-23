package org.example.Chess;
import org.example.boardgame.Board;
import org.example.boardgame.Piece;
public class ChessPiece extends Piece{
    private Color color;

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }
    public Color getColor() {
        return color;
    }
}

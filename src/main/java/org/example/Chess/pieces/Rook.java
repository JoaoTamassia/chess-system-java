package org.example.Chess.pieces;

import org.example.Chess.ChessPiece;
import org.example.Chess.Color;
import org.example.boardgame.Board;

public class Rook extends ChessPiece {
    public Rook(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "R";
    }
}

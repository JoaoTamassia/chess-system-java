package org.example.Chess.pieces;

import org.example.Chess.ChessPiece;
import org.example.Chess.Color;
import org.example.boardgame.Board;

public class King extends ChessPiece {
    public King(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "K";
    }
}

package org.example.application;

import org.example.Chess.ChessMatch;
import org.example.boardgame.Board;

public class Main {
    public static void main(String[] args) {
        ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());
        }
    }
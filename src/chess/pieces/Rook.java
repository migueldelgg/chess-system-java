package chess.pieces;

import bordgame.Board;
import chess.ChessPiece;
import chess.Color;

public class Rook extends ChessPiece {
    public Rook(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString () {
        return "R"; // R de Rook, no tabuleiro a torre sera representada por R
    }


}

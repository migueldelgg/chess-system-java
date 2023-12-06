package chess.pieces;

import bordgame.Board;
import chess.ChessPiece;
import chess.Color;

public class King extends ChessPiece {
    public King(Board board, Color color) {
        super(board, color);
    }
    @Override
    public String toString() {
        return "K"; //K de king, no tabuleiro o rei sera representado por K
    }

}

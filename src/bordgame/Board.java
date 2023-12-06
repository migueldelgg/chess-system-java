package bordgame;

public class Board {

    private int rows;
    private int columns;
    private Piece[][] pieces;

    public Board(int rows, int colums) {
        if (rows < 1 || colums < 1) {
            throw new BoardException("Error creating board: there must be at least 1 row and 1 column"); // tratamento defensivo
        }
        this.rows = rows;
        this.columns = colums;
        pieces = new Piece[rows][colums];
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }
    public Piece piece(int row, int column) {
        if (!positionExists(row, column)) {
            throw new BoardException("Position not on the board");
        }
         return pieces[row][column];
    }

    public Piece piece(Position position) {
        if (!positionExists(position)) {
            throw new BoardException("Position not on the board");
        }
        return pieces[position.getRow()][position.getColumn()];
    }

    public void placePiece(Piece piece, Position position) {
        if (thereIsAPiece(position)) {
            throw new BoardException("There is already a piece on position " + position);
        }
        pieces [position.getRow()] [position.getColumn()] = piece; // pega a matriz na posição fornecida e atrib a peça
        // Agora essa peça nao está mais na posição nula e sim na posição fornecida, então fazemos:
        piece.position = position; // eu consigo acessar livremente pois á position é protected e está no mesmo pacote.
        // essa matriz e a matriz criada na classe Board
        // e que foi instanciada no construtor
    }
    private boolean positionExists(int row, int column) {
        return row >= 0 && row < rows && column >= 0 && column < columns; //Teste se uma posicao existe
    }
    public boolean positionExists(Position position) {
        return positionExists(position.getRow(), position.getColumn());//Teste se uma posicao existe
    }
    public boolean thereIsAPiece(Position position) {
        if (!positionExists(position)) {
            throw new BoardException("Position not on the board");
        }
        return piece(position) != null;
    }
}

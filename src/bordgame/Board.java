package bordgame;

public class Board {

    private int rows;
    private int columns;
    private Piece[][] pieces;

    public Board(int rows, int colums) {
        this.rows = rows;
        this.columns = colums;
        pieces = new Piece[rows][colums];
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int colums) {
        this.columns = colums;
    }
    public Piece piece(int row, int column) {
        return pieces[row][column];
    }

    public Piece piece(Position position) {
        return pieces[position.getRow()][position.getColumn()];
    }

    public void placePiece(Piece piece, Position position) {
        pieces [position.getRow()] [position.getColumn()] = piece; // pega a matriz na posição fornecida e atrib a peça
        // Agora essa peça nao está mais na posição nula e sim na posição fornecida, então fazemos:
        piece.position = position; // eu consigo acessar livremente pois á position é protected e está no mesmo pacote.
        // essa matriz e a matriz criada na classe Board
        // e que foi instanciada no construtor
    }
}

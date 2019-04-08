import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int boardSize = 6;
        ChessBoard chessBoard = new ChessBoard(boardSize);

        chessBoard.fillBoard(chessBoard);

        chessBoard.nQueen(chessBoard, 0);
    }
}

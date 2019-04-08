public class Main {
    public static void main(String[] args) {
        // choose board size
        int boardSize = 4;
        ChessBoard chessBoard = new ChessBoard(boardSize);
        chessBoard.fillBoard(chessBoard);

        chessBoard.placeQueens(chessBoard, 0);

        System.out.println(chessBoard.getNumberOfSolutions());
    }
}

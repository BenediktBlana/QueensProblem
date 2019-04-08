import java.util.Arrays;

public class ChessBoard {

    private int boardSize;
    private char[][] twoDimArray;

    public ChessBoard (int boardSize){
        this.boardSize = boardSize;
        twoDimArray = new char[boardSize][boardSize];
    }

    public boolean isSafe(ChessBoard board, int r, int c) {

        for (int i = 0; i < r; i++)
            if (board.twoDimArray[i][c] == 'Q')
                return false;


        for (int i = r, j = c; i >= 0 && j >= 0; i--, j--)
            if (board.twoDimArray[i][j] == 'Q')
                return false;


        for (int i = r, j = c; i >= 0 && j < boardSize; i--, j++)
            if (board.twoDimArray[i][j] == 'Q')
                return false;

        return true;
    }

    public void nQueen(ChessBoard board, int r) {

        if (r == boardSize) {
            for (int i = 0; i < boardSize; i++) {
                for (int j = 0; j < boardSize; j++)
                    System.out.print(board.twoDimArray[i][j] + " ");
                System.out.println();
            }
            System.out.println();

            return;
        }


        for (int i = 0; i < boardSize; i++) {

            if (isSafe(board, r, i)) {

                board.twoDimArray[r][i] = 'Q';


                nQueen(board, r + 1);


                board.twoDimArray[r][i] = '-';
            }
        }
    }

    public void fillBoard(ChessBoard chessBoard){
        for (int i = 0; i < chessBoard.boardSize; i++) {
            Arrays.fill(chessBoard.twoDimArray[i], '-');
        }
    }

}

/**
 * @author Adam Klima
 * @author Benedikt Blana
 */

import java.util.Arrays;

public class ChessBoard {

    private int boardSize;
    private char[][] twoDimArray;
    private int numberOfSolutions;

    public ChessBoard(int boardSize) {
        this.boardSize = boardSize;
        twoDimArray = new char[boardSize][boardSize];
        this.numberOfSolutions = 0;
    }

    //return false if queen can attack each other
    public boolean isSafe(ChessBoard board, int r, int c) {
        //check column
        for (int i = 0; i < r; i++)
            if (board.twoDimArray[i][c] == 'Q')
                return false;
        //check diagonal bottom right \
        for (int i = r, j = c; i >= 0 && j >= 0; i--, j--)
            if (board.twoDimArray[i][j] == 'Q')
                return false;
        //check diagonal top right /
        for (int i = r, j = c; i >= 0 && j < boardSize; i--, j++)
            if (board.twoDimArray[i][j] == 'Q')
                return false;

        return true;
    }

    //int r sets the first queen position in first row
    public void placeQueens(ChessBoard board, int r) {

        //if row is equal to board size,
        // means that we have completed one board
        if (r == boardSize) {
            for (int i = 0; i < boardSize; i++) {
                for (int j = 0; j < boardSize; j++)
                    System.out.print(board.twoDimArray[i][j] + " ");
                System.out.println();
            }
            //empty printout to separate boards
            System.out.println("");
            //increment number of solution
            board.incrementNumberOfSolution();

            return;
        }
        // place queen at every place in a row
        // recurse for each valid movement

        for (int i = 0; i < boardSize; i++) {

            if (isSafe(board, r, i)) {

                board.twoDimArray[r][i] = 'Q';

                //move queen to next row - utilize recursion
                placeQueens(board, r + 1);

                //backtrack and remove queen from current position
                board.twoDimArray[r][i] = '-';
            }
        }
    }
    //fill empty positions with '-' string
    public void fillBoard(ChessBoard chessBoard) {
        for (int i = 0; i < chessBoard.boardSize; i++) {
            Arrays.fill(chessBoard.twoDimArray[i], '-');
        }
    }

    public int getNumberOfSolutions() {
        return numberOfSolutions;
    }

    public void incrementNumberOfSolution() {
        this.numberOfSolutions++;
    }

}

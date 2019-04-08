import org.junit.Test;

import static org.junit.Assert.*;

public class ChessBoardTest {
@Test
    public void testNumberOfSolutionsWithBoardSize1(){
        int boardSize = 1;
        ChessBoard chessBoard = new ChessBoard(boardSize);
        assertEquals(0,chessBoard.getNumberOfSolutions());
    }
    @Test
    public void testNumberOfSolutionsWithBoardSize4(){
        int boardSize = 4;
        ChessBoard chessBoard = new ChessBoard(boardSize);
        chessBoard.placeQueens(chessBoard, 0);
        assertEquals(2,chessBoard.getNumberOfSolutions());
    }
    @Test
    public void testNumberOfSolutionsWithBoardSize5(){
        int boardSize = 5;
        ChessBoard chessBoard = new ChessBoard(boardSize);
        chessBoard.placeQueens(chessBoard, 0);
        assertEquals(10,chessBoard.getNumberOfSolutions());
    }
    @Test
    public void testNumberOfSolutionsWithBoardSize6(){
        int boardSize = 6;
        ChessBoard chessBoard = new ChessBoard(boardSize);
        chessBoard.placeQueens(chessBoard, 0);
        assertEquals(4,chessBoard.getNumberOfSolutions());
    }
    @Test
    public void testNumberOfSolutionsWithBoardSize7(){
        int boardSize = 7;
        ChessBoard chessBoard = new ChessBoard(boardSize);
        chessBoard.placeQueens(chessBoard, 0);
        assertEquals(40,chessBoard.getNumberOfSolutions());
    }
    @Test
    public void testNumberOfSolutionsWithBoardSize8(){
        int boardSize = 8;
        ChessBoard chessBoard = new ChessBoard(boardSize);
        chessBoard.placeQueens(chessBoard, 0);
        assertEquals(92,chessBoard.getNumberOfSolutions());
    }
    @Test
    public void testNumberOfSolutionsWithBoardSize9(){
        int boardSize = 9;
        ChessBoard chessBoard = new ChessBoard(boardSize);
        chessBoard.placeQueens(chessBoard, 0);
        assertEquals(352,chessBoard.getNumberOfSolutions());
    }
    @Test
    public void testNumberOfSolutionsWithBoardSize10(){
        int boardSize = 10;
        ChessBoard chessBoard = new ChessBoard(boardSize);
        chessBoard.placeQueens(chessBoard, 0);
        assertEquals(724,chessBoard.getNumberOfSolutions());
    }
    @Test
    public void testNumberOfSolutionsWithBoardSize11(){
        int boardSize = 11;
        ChessBoard chessBoard = new ChessBoard(boardSize);
        chessBoard.placeQueens(chessBoard, 0);
        assertEquals(2680,chessBoard.getNumberOfSolutions());
    }
    @Test
    public void testNumberOfSolutionsWithBoardSize12(){
        int boardSize = 12;
        ChessBoard chessBoard = new ChessBoard(boardSize);
        chessBoard.placeQueens(chessBoard, 0);
        assertEquals(14200,chessBoard.getNumberOfSolutions());
    }
}
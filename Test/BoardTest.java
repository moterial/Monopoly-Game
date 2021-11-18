package Test;

import model.*;
import org.junit.jupiter.api.Test;
import view.Board;

public class BoardTest {

    Board board;

    @Test
    void Test1(){
        board = new Board();
        board.createBoard();
        board.printBoard();
    }
}

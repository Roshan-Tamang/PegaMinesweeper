package com.softwareinstitute.rt;

import com.softwareinstitute.rt.data.GameBoard;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GameBoardTest {

    @Test
    void testing_gameboard_height(){

        GameBoard gameBoard = new GameBoard();

        gameBoard.setHeight(9);

        assertEquals(9,gameBoard.getHeight(),"The height should match");

    }

    @Test
    void testing_gameboard_width(){

        GameBoard gameBoard = new GameBoard();

        gameBoard.setWidth(9);

        assertEquals(9,gameBoard.getWidth(),"The width should match");
    }


}

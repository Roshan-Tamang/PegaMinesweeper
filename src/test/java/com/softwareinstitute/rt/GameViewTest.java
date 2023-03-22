package com.softwareinstitute.rt;


import com.softwareinstitute.rt.ui.GameView;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GameViewTest {

    @Test
    void testing_gameview_menu(){

        GameView gameView = new GameView();

        assertEquals("Welcome to Minesweeper! Please enter the number to select an option:\n"+
        "0: Play Minesweeper\n"+
        "1: Set the Board size\n"+
        "2: Set difficulty level",gameView.getMenu(),"The menu should match");



    }

}

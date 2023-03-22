package com.softwareinstitute.rt.controller;

import com.softwareinstitute.rt.data.GameBoard;
import com.softwareinstitute.rt.ui.ConsoleLogger;
import com.softwareinstitute.rt.ui.GameView;

public class GameController {

    GameView gameView = new GameView();
    GameBoard gameBoard;

    public void run(){

        ConsoleLogger.printToConsole(gameView.getMenu());

        int userChoice = 1;

        switch (userChoice){
            case 0:
                gameBoard = new GameBoard();

                break;
            case 1:
                break;
            case 2:
                break;
            default:
                break;

        }


    }





}

package com.softwareinstitute.rt.controller;

import com.softwareinstitute.rt.data.GameBoard;
import com.softwareinstitute.rt.ui.ConsoleLogger;
import com.softwareinstitute.rt.ui.GameView;

public class GameController {

    GameView gameView = new GameView();
    GameBoard gameBoard;

    public void run(){

        ConsoleLogger.printToConsole(gameView.getMenu());

        int userChoice = 0;

        switch (userChoice){
            case 0:
                gameBoard = new GameBoard();
                startGame();
                break;
            case 1:
                break;
            case 2:
                break;
            default:
                break;
        }


    }

    public void startGame() {

        generateTiles();

        gameView.displayBoard(gameBoard);


    }

    private void generateTiles() {



    }


}

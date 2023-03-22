package com.softwareinstitute.rt.controller;

import com.softwareinstitute.rt.data.Difficulty;
import com.softwareinstitute.rt.data.GameBoard;
import com.softwareinstitute.rt.data.Settings;
import com.softwareinstitute.rt.data.tiles.CleanTiles;
import com.softwareinstitute.rt.data.tiles.MineTiles;
import com.softwareinstitute.rt.data.tiles.Tiles;
import com.softwareinstitute.rt.ui.ConsoleLogger;
import com.softwareinstitute.rt.ui.GameView;


public class GameController {

    GameView gameView = new GameView();
    GameBoard gameBoard;

    Tiles[][] tiles;

    public void run() {

        ConsoleLogger.printToConsole(gameView.getMenu());

        int userChoice = gameView.enterCoordinates("Please make your selection!");

        switch (userChoice) {
            case 0:
                gameBoard = new GameBoard();
                startGame();
                break;
            case 1:
                setTheBoardSize();
                break;
            case 2:
                setGameDifficulty();
                break;
            default:
                break;
        }

    }

    public void setGameDifficulty() {

        int difficulty = gameView.enterCoordinates("Low/Default difficulty: Press 1\n" +
                "Mid difficulty: Press 2\n" +
                "High difficulty: Press 3");

        switch (difficulty){
            case 1:
                Settings.setDifficulty(Difficulty.LOW);
                break;
            case 2:
                Settings.setDifficulty(Difficulty.MEDIUM);
                break;
            case 3:
                Settings.setDifficulty(Difficulty.HIGH);
                break;
            default:
                break;
        }


    }

    public void setTheBoardSize() {
        int height = gameView.enterCoordinates("Please enter the new height");

        int width = gameView.enterCoordinates("Please enter the new weight");

        Settings.setHeight(height);
        Settings.setWidth(width);

    }

    public void startGame() {

        boolean exit = true;

        generateTiles();

        int numOfTiles = gameBoard.getHeight()*gameBoard.getWidth();

        for(int i=0; i<numOfTiles;i++){
            gameView.displayBoard(gameBoard, tiles);

            int x = gameView.enterCoordinates("Enter x coordinates");

            int y = gameView.enterCoordinates("Enter y coordinates");

            Tiles chosenTile = tiles[x][y];
            chosenTile.setUntouched(false);

            exit = checkTypeOfTile(chosenTile);
            if (exit) {
                break;
            } else if (i==numOfTiles-1) {

            }

        }

    }

    public boolean checkTypeOfTile(Tiles tile) {

        if (tile.getClass().getSimpleName().equals("MineTiles")) {

            for(int i = 0; i< gameBoard.getHeight();i++){
                for(int l = 0; l< gameBoard.getWidth();l++){
                    if(tiles[i][l].getClass().getSimpleName().equals("MineTiles")){
                        tiles[i][l].setUntouched(false);
                    }
                }
            }
            gameView.gameOver(gameBoard,tiles);
            return true;
        }

        return false;
    }

    public int checkNumberOfMines(int x, int y) {

        int numberOfMines = 0;

        for (int i = -1; i < 2; i++) {
            if (x < 0 && x > gameBoard.getHeight()) {
                for (int l = -1; l < 2; l++) {
                    if (y < 0 && y > gameBoard.getWidth()) {
                        if (tiles[x + i][y + l].getClass().getSimpleName().equals("MineTiles")) {
                            numberOfMines++;
                        }
                    }
                }
            }
        }

        return numberOfMines;
    }

    public void generateTiles() {

        tiles = new Tiles[gameBoard.getHeight()][gameBoard.getWidth()];

        int totalTiles = gameBoard.getHeight() * gameBoard.getWidth();

        int mines = ((totalTiles*Settings.getDifficulty().getValue())/100);

        for (int i = mines; i > 0; i--) {

            Tiles tile = new MineTiles();

            int x = (int) (Math.random() * gameBoard.getWidth());
            int y = (int) (Math.random() * gameBoard.getHeight());

            tiles[x][y] = tile;
        }

        for (int i = 0; i < gameBoard.getHeight(); i++) {
            for (int l = 0; l < gameBoard.getWidth(); l++) {

                CleanTiles tile = new CleanTiles();

                if (tiles[i][l] == null) {
                    int numberOfMines = checkNumberOfMines(i, l);
                    tile.setNumber(numberOfMines);
                    tiles[i][l] = tile;
                }
            }

        }
    }
}
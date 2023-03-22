package com.softwareinstitute.rt.controller;

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

        int userChoice = 0;

        switch (userChoice) {
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

        boolean exit = true;

        generateTiles();

        do {

            gameView.displayBoard(gameBoard, tiles);

            int x = gameView.enterCoordinates("Enter x coordinates");

            int y = gameView.enterCoordinates("Enter y coordinates");

            Tiles chosenTile = tiles[x][y];
            chosenTile.setUntouched(false);

            exit = checkTypeOfTile(chosenTile);

        } while (exit);

    }

    public boolean checkTypeOfTile(Tiles tile) {

        if (tile.getClass().getSimpleName().equals("MineTiles")) {
            return false;
        }

        return true;
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

        int mines = ((totalTiles / Settings.getDifficulty().getValue()));

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
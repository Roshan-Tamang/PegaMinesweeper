package com.softwareinstitute.rt.ui;

import com.softwareinstitute.rt.data.GameBoard;
import com.softwareinstitute.rt.data.tiles.CleanTiles;
import com.softwareinstitute.rt.data.tiles.Tiles;

import java.util.Scanner;

public class GameView {

    private final String[] mainMenu = {"Welcome to Minesweeper! Please enter the number to select an option:",
            "0: Play Minesweeper",
            "1: Set the Board size",
            "2: Set difficulty level"};

    public String getMenu() {

        StringBuilder menu = new StringBuilder();

        for (int i = 0; i < mainMenu.length; i++) {
            menu.append(mainMenu[i]);
            if (i == (mainMenu.length - 1)) {
                return menu.toString();
            }
            menu.append("\n");
        }
        return null;
    }

    public void displayBoard(GameBoard gameBoard, Tiles[][] tiles) {

        StringBuilder board = new StringBuilder();

        for (int i = 0; i < gameBoard.getWidth(); i++) {
            board.append("-");
            board.append(i);
            if (i == gameBoard.getWidth() - 1) {
                board.append("-");
                ConsoleLogger.printToConsole(board.toString());
                board.setLength(0);
            }
        }

        for (int i = 0; i < gameBoard.getHeight(); i++) {
            for (int l = 0; l < gameBoard.getWidth();l++){
                board.append("|");
                if(tiles[i][l].isUntouched() && !(tiles[i][l].isFlagged())){
                    board.append("?");
                } else if (tiles[i][l].isUntouched() && tiles[i][l].isFlagged()) {
                    board.append("F");
                } else if (!(tiles[i][l].isUntouched()) && (tiles[i][l].getClass().getSimpleName().equals("MineTiles") )) {
                   board.append("*");
                } else if (!(tiles[i][l].isUntouched()) && (tiles[i][l].getClass().getSimpleName().equals("CleanTiles"))){
                    CleanTiles cleanTiles = (CleanTiles) tiles[i][l];
                    board.append(cleanTiles.getNumber());}
                if(l== gameBoard.getWidth()-1){
                    board.append("|");
                    board.append(i);
                    ConsoleLogger.printToConsole(board.toString());
                    board.setLength(0);
                }
            }

        }

    }

    public int enterCoordinates(String message){

        System.out.println(message);

        Scanner sc = new Scanner(System.in);

        int userChoice = sc.nextInt();

        return userChoice;

    }



}

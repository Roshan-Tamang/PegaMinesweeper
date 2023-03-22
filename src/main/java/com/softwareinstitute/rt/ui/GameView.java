package com.softwareinstitute.rt.ui;

public class GameView {

    private final String[] mainMenu = {"Welcome to Minesweeper! Please enter the number to select an option:",
            "0: Play Minesweeper",
            "1: Set the Board size",
            "2: Set difficulty level"};

    public String getMenu(){

        StringBuilder menu = new StringBuilder();

        for(int i =0; i<mainMenu.length; i++) {
            menu.append(mainMenu[i]);
            if(i == (mainMenu.length-1)){
                return menu.toString();
            }
            menu.append("\n");
        }
        return null;
    }


}

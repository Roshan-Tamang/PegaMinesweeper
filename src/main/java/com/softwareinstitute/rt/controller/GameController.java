package com.softwareinstitute.rt.controller;

import com.softwareinstitute.rt.ui.ConsoleLogger;
import com.softwareinstitute.rt.ui.GameView;

public class GameController {

    GameView gameView = new GameView();

    public void run(){

        ConsoleLogger.printToConsole(gameView.getMenu());


    }





}
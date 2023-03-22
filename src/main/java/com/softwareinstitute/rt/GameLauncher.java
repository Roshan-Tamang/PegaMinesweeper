package com.softwareinstitute.rt;

import com.softwareinstitute.rt.controller.GameController;

public class GameLauncher {
    public static void main(String[] args) {

       GameController gameController = new GameController();

       gameController.run();

    }


}
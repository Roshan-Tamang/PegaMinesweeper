package com.softwareinstitute.rt;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

class GameLauncherTest {

    @Test
    void testing_gamelauncher_main(){

        assertEquals("Hello world - Minesweeper",GameLauncher.callHelloWorld(),"The message does not match");

    }



}

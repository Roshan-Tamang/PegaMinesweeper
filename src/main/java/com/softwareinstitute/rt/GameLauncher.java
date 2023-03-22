package com.softwareinstitute.rt;

public class GameLauncher {
    public static void main(String[] args) {

        String message = callHelloWorld();

        System.out.println(message);
    }

    public static String callHelloWorld() {

        return "Hello world - Minesweeper";
    }
}
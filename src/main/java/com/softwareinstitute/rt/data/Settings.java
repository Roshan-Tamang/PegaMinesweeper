package com.softwareinstitute.rt.data;

public class Settings {

    private static int height= 4;

    private static int width = 4;

    private static Difficulty difficulty = Difficulty.LOW;

    public static int getHeight() {
        return height;
    }

    public static void setHeight(int height) {
        Settings.height = height;
    }

    public static int getWidth() {
        return width;
    }

    public static void setWidth(int width) {
        Settings.width = width;
    }

    public static Difficulty getDifficulty() {
        return difficulty;
    }

    public static void setDifficulty(Difficulty difficulty) {
        Settings.difficulty = difficulty;
    }

}

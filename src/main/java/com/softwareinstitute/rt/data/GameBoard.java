package com.softwareinstitute.rt.data;

public class GameBoard {

    private int height;
    private int width;

    
    public GameBoard(){
        this.height = Settings.getHeight();
        this.width = Settings.getWidth();
    }


    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }


}

package com.softwareinstitute.rt.data.tiles;

public abstract class Tiles {

    private boolean isUntouched = true;

    private boolean isFlagged = false;

    public boolean isUntouched() {
        return isUntouched;
    }

    public void setUntouched(boolean untouched) {
        isUntouched = untouched;
    }

    public boolean isFlagged() {
        return isFlagged;
    }
    public void setFlagged(boolean flagged) {
        isFlagged = flagged;
    }
}

package com.softwareinstitute.rt;

public class Tiles {

    private boolean isUntouched = true;

    private Flag flag = Flag.UNFLAGGED;

    public boolean isUntouched() {
        return isUntouched;
    }

    public void setUntouched(boolean untouched) {
        isUntouched = untouched;
    }

    public Flag getFlag() {
        return flag;
    }

    public void setFlag(Flag flag) {
        this.flag = flag;
    }
}

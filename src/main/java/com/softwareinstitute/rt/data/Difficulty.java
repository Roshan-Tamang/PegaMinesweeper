package com.softwareinstitute.rt.data;

public enum Difficulty {
    LOW (10),
    MEDIUM(20),
    HIGH(30);

    private int value;

    Difficulty(int i) {
        this.value = i;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}

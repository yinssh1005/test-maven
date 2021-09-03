package com.testmaven;


public class OnePiece {

    private int testInt;

    public int getTestInt() {
        return testInt;
    }

    public void setTestInt(int testInt) {
        this.testInt = testInt;
    }

    public OnePiece(int testInt) {
        this.testInt = testInt;
    }

    @Override
    public String toString() {
        return "OnePiece{" +
                "testInt=" + testInt +
                '}';
    }
}

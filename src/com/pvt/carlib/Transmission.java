package com.pvt.carlib;

public abstract class Transmission {
    int move;

    public abstract boolean forward();
    public abstract boolean revers();
    public abstract boolean changeGear(int gearNum);

    public int getMove() {
        return move;
    }

    public void setMove(int move) {
        if (move > 0) {
            this.move = move;
        }
    }
}

package com.pvt.carlib;

public abstract class Engine {
    int power;

    public abstract boolean on();
    public abstract boolean off();
    public abstract boolean changePower(int powerPercent);

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}

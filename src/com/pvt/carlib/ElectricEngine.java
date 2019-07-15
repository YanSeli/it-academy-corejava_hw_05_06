package com.pvt.carlib;

public class ElectricEngine extends Engine{
    @Override
    public boolean on() {
        System.out.println("ElectricEngine on");
        return true;
    }

    @Override
    public boolean off() {
        return false;
    }

    @Override
    public boolean changePower(int powerPercent) {
        return false;
    }
}

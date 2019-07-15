package com.pvt.carlib;

public class AutoTransmission extends Transmission{
    @Override
    public boolean forward() {
        System.out.println("Drivemod on");
        return true;
    }

    @Override
    public boolean revers() {
        System.out.println("Reverse on");
        return true;
    }

    @Override
    public boolean changeGear(int gearNum) {
        return false;
    }
}

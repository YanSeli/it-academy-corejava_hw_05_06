package com.pvt.carlib;

public class ManualTransmission extends Transmission{
    @Override
    public boolean forward() {
        System.out.println("First gear included");
        return true;
    }

    @Override
    public boolean revers() {
        System.out.println("Reverse gear included");
        return true;
    }

    @Override
    public boolean changeGear(int gearNum) {
        return false;
    }
}

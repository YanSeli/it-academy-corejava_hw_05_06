package com.pvt.carlib;

public class PassengerCar extends Vehicle {

    public PassengerCar(int wheelCount, int axisCount, int seatCount, int weight, Engine engine, Transmission transmission) throws Exception {
        super(wheelCount, axisCount, seatCount, weight, engine);
    }

    @Override
    public boolean on() {
        super.on();
        System.out.println("Activate brakes system");
        System.out.println("PassengerCar started");
        return true;
    }

    @Override
    public boolean off() {
        return false;
    }

    @Override
    public boolean upSpeed(int powerPercent) {
        return false;
    }

    @Override
    public boolean downSpeed(int powerPercent) {
        return false;
    }
}

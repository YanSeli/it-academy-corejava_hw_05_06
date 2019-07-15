package com.pvt.carlib;

import com.sun.xml.internal.ws.api.message.ExceptionHasMessage;

import java.util.Objects;

public abstract class Vehicle {
    private int wheelCount;
    private int axisCount;
    private int seatCount;
    private int weight;
    private String fuelType;

    private final Engine engine;
    private final Transmission transmission;

    public Vehicle(int wheelCount, int axisCount, int seatCount, int weight, Engine engine, Transmission transmission) throws Exception {
        this.wheelCount = wheelCount;
        this.axisCount = axisCount;
        this.seatCount = seatCount;
        this.weight = weight;

        if(engine != null) {
            this.engine = engine;
        }else {
            throw new Exception();
        }
        if(transmission != null) {
            this.transmission = transmission;
        }else {
            throw new Exception();
        }
    }

    public boolean on(){
        boolean result = engine.on();
        System.out.println("Vehicle start");
        return result;
    }
    public abstract boolean off();
    public abstract boolean upSpeed(int powerPercent);
    public abstract boolean downSpeed(int powerPercent);

    public int getWheelCount() {
        return wheelCount;
    }

    public void setWheelCount(int wheelCount) {
        this.wheelCount = wheelCount;
    }

    public int getAxisCount() {
        return axisCount;
    }

    public void setAxisCount(int axisCount) {
        this.axisCount = axisCount;
    }

    public int getSeatCount() {
        return seatCount;
    }

    public void setSeatCount(int seatCount) {
        this.seatCount = seatCount;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Engine getEngine() {
        return engine;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "wheelCount=" + wheelCount +
                ", axisCount=" + axisCount +
                ", seatCount=" + seatCount +
                ", weight=" + weight +
                ", engine=" + engine +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return wheelCount == vehicle.wheelCount &&
                axisCount == vehicle.axisCount &&
                seatCount == vehicle.seatCount &&
                weight == vehicle.weight &&
                Objects.equals(engine, vehicle.engine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(wheelCount, axisCount, seatCount, weight, engine);
    }
}

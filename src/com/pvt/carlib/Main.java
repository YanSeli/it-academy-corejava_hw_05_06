package com.pvt.carlib;

public class Main {

    public static void main(String[] args) throws Exception {
	    ElectricEngine electricEngine = new ElectricEngine();
	    InternalCombustionEngine internalCombustionEngine = new InternalCombustionEngine();
	    Vehicle vehicle1 = new PassengerCar(4,2,5,1500, electricEngine);
        Vehicle vehicle2 = new Truck(10, 3, 3, 5000, internalCombustionEngine);
        System.out.println("Is vehicle on = " + vehicle1.on());
        System.out.println("Is vehicle on = " + vehicle2.on());
    }
}

package com.pvt.carlib;

public class InternalCombustionEngine extends Engine {

    @Override
    public boolean on() {
        System.out.println("Idle on");
        System.out.println("ICEngine on");
        return true;
    }

    @Override
    public boolean off() {
        System.out.println("ICEngine off");
        return true;
    }

    @Override
    public boolean changePower(int powerPercent) {
        return false;
    }
}

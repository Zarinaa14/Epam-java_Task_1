package com.company;

public class Engine {
    boolean isTurnEngine=false;
    private double power;

    protected Engine(double power) {
        setPower(power);
    }

    protected void setPower(double power) {
        if (power > 0) {
            this.power = power;
        }
    }

    protected double getPower() {
        return power;
    }

    protected  void turnOn() {
        isTurnEngine=true;

    }

    protected void turnOff() {
        isTurnEngine=false;
    }
}
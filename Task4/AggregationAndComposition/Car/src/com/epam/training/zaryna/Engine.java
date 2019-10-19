package com.epam.training.zaryna;

public class Engine {
    public boolean isTurnEngine = false;
    private double power;

    public Engine(double power) {
        setPower(power);
    }

    public void setPower(double power) {
        if (power > 0) {
            this.power = power;
        }
    }

    public double getPower() {
        return power;
    }

    public void turnOn() {
        isTurnEngine = true;

    }

    public void turnOff() {
        isTurnEngine = false;
    }
}
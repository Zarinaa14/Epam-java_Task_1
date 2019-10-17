package com.company.com.company.epam.training;

public class Car {
    private String typeMark;
    private int fuel;
    Engine engine = new Engine(240);

    public Car(String typeMark, int fuel, double enginePower, WheelOfCar wheel) {
        setTypeMark(typeMark);
        setFuel(fuel);
        setEngine(enginePower);
        wheel.setWheelOfCar();
    }


    public void setTypeMark(String typeMark) {
        if (typeMark != null && !typeMark.isEmpty()) {
            this.typeMark = typeMark;
        }
    }

    public void setEngine(double power) {
        engine.setPower(power);
    }

    public void setFuel(int fuel) {
        if (fuel >= 0) {
            this.fuel = fuel;
        }
    }

    public int getFuel() {
        return fuel;
    }


    public String getTypeMark() {
        return typeMark;
    }

    public double getEnginePower() {
        return engine.getPower();
    }

    public void refuel(double fuel) {

        if (fuel > 0) {
            this.fuel += fuel;
            System.out.println("Машина заправлена на " + this.fuel + " л!");
        }
    }

    public boolean isTurnOnOff() {
        if (engine.isTurnEngine) {
            return true;
        }
        return false;
    }

    public void engineTurnOn() {
        System.out.println("Двигатель включен");
        engine.turnOn();
    }

    public void engineTurnOff() {
        System.out.println("Двигатель выключен");
        engine.turnOff();
    }


    //Возвращает проеханный путь
    public int drive() {
        int distance = 0;
        if (engine.isTurnEngine) {
            while (fuel > 0) {
                distance += 5;

                fuel--;

            }
        } else System.out.println("Включите двигатель!");
        return distance;
    }

    public void print() {
        System.out.println(toString());
    }

    public void runCar(Car ob) {
        if (fuel > 0) {
            int distsnce = ob.drive();
            System.out.println("Машина проехала " + distsnce + " км");
        }
        if (fuel == 0) {
            System.out.println("Пора заправить машину.");
        }
        ob.print();
    }

    public void printCarWheel(WheelOfCar ob) {
        ob.printWheel();
    }

    public void change2FirstWheelInCar(WheelOfCar ob) {
        ob.change2FirstWheel();
    }

    public void change2SecondWheelInCar(WheelOfCar ob) {
        ob.change2SecondWheel();
    }

    @Override
    public String toString() {
        return "typeMark: " + typeMark
                + ", fuel " + fuel;
    }
}

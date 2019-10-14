package com.company;

public class WheelOfCar {
    protected String[] wheel = new String[4];

    protected WheelOfCar() {
        wheel[0] = "oneColeso";
        wheel[1] = "twoColeso";
        wheel[2] = "threeColeso";
        wheel[3] = "forColeso";
    }

    protected void setWheelOfCar() {
        wheel[0] = "oneColeso";
        wheel[1] = "twoColeso";
        wheel[2] = "threeColeso";
        wheel[3] = "forColeso";
    }

    protected String[] getWheelOfCar(String[] coleso) {
        return coleso;
    }

    protected void change2FirstWheel() {
        wheel[0] = "newOneColeso";
        wheel[1] = "newTwoColeso";
    }

    protected void change2SecondWheel() {
        wheel[2] = "newThreeColeso";
        wheel[3] = "newForColeso";
    }

    protected void printWheel() {
        String str = "";
        for (int i = 0; i < wheel.length; i++) {
            str += wheel[i] + " ";
        }
        System.out.println(str);

    }
}

package com.company.com.company.epam.training;

public class WheelOfCar {
    private String[] wheel = new String[4];

    public WheelOfCar() {
        wheel[0] = "oneColeso";
        wheel[1] = "twoColeso";
        wheel[2] = "threeColeso";
        wheel[3] = "forColeso";
    }

    public void setWheelOfCar() {
        wheel[0] = "oneColeso";
        wheel[1] = "twoColeso";
        wheel[2] = "threeColeso";
        wheel[3] = "forColeso";
    }

    protected String[] getWheelOfCar(String[] coleso) {
        return coleso;
    }

    public void change2FirstWheel() {
        wheel[0] = "newOneColeso";
        wheel[1] = "newTwoColeso";
    }

    public void change2SecondWheel() {
        wheel[2] = "newThreeColeso";
        wheel[3] = "newForColeso";
    }

    public void printWheel() {
        String str = "";
        for (int i = 0; i < wheel.length; i++) {
            str += wheel[i] + " ";
        }
        System.out.println(str);

    }
}

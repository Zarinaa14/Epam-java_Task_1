package com.company;
//. Создайте класс Test1 двумя переменными.
// Добавьте метод вывода на экран и методы изменения этих переменных.
// Добавьте метод, который находит сумму значений этих переменных, и метод,
// который находит наибольшее значение из этих двух переменных.


public class Test1 {

    private int firstVariable;
    private int secondVariable;

    public Test1() {
        firstVariable = 0;
        secondVariable = 0;
    }

    public Test1(int value1, int value2) {
        firstVariable = value1;
        secondVariable = value2;
    }

    public String printVariables() {
        return "Variable1 = " + firstVariable + ", variable2 = " + secondVariable;
    }

    public void setVariable1(int value) {
        firstVariable = value;
    }

    public void setVariable2(int value) {
        secondVariable = value;
    }

    public int getVar1() {
        return firstVariable;
    }

    public int getVar2() {
        return secondVariable;
    }

    public int sumVars() {
        return firstVariable + secondVariable;
    }

    public int returnMax() {
        return firstVariable > secondVariable ? firstVariable : secondVariable;
    }


}
package com.company;
//. Создайте класс Test1 двумя переменными.
// Добавьте метод вывода на экран и методы изменения этих переменных.
// Добавьте метод, который находит сумму значений этих переменных, и метод,
// который находит наибольшее значение из этих двух переменных.


public class Test1 {

    private int firstVariable;
    private int secondVariable;

    protected Test1() {
        firstVariable = 0;
        secondVariable = 0;
    }

    protected Test1(int value1, int value2) {
        firstVariable = value1;
        secondVariable = value2;
    }

    protected String printVariables() {
        return "Variable1 = " + firstVariable + ", variable2 = " + secondVariable;
    }

    protected void setVariable1(int value) {
        firstVariable = value;
    }

    protected void setVariable2(int value) {
        secondVariable = value;
    }

    protected int getVar1() {
        return firstVariable;
    }

    protected int getVar2() {
        return secondVariable;
    }

    protected int sumVars() {
        return firstVariable + secondVariable;
    }

    protected int returnMax() {
        return firstVariable > secondVariable ? firstVariable : secondVariable;
    }


}
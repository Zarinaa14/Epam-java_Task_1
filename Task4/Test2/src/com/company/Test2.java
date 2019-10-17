package com.company;
// Создйте класс Test2 двумя переменными.
// Добавьте конструктор с входными параметрами.
// Добавьте конструктор, инициализирующий члены класса по умолчанию.
// Добавьте set- и get- методы для полей экземпляра класса.

public class Test2 {

    private int firstVariable;
    private int secondVariable;

    public Test2(){
        firstVariable=0;
        secondVariable =0;
    }

    public  Test2(int value1, int value2){
        firstVariable=value1;
        secondVariable =value2;
    }

    public String printVariables(){
        return "Variable1 = "+ firstVariable +", variable2 = "+ secondVariable;
    }

    public  void setVar1(int value){
        firstVariable=value;
    }

    public  void setVar2(int value){
        secondVariable =value;
    }

    public  int getVar1(){
        return firstVariable;
    }

    public  int getVar2(){
        return secondVariable;
    }


}
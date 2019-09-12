package com.company;

import java.util.Scanner;

public class Task1_5 {
    public static void main(String[] args) {
        // Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах.
        // Вывести данное значение длительности в часах, минутах и секундах в следующей форме: ННч ММмин SSc.

        int  hours, minutes, seconds;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the natural number of seconds");
        int inputSecond =  sc.nextInt();
        hours = inputSecond/3600;
        minutes = (inputSecond%3600)/60;
        seconds = ((inputSecond%3600))%60;
        System.out.printf("%02dч ",hours);
        System.out.printf("%02dмин ",minutes);
        System.out.printf("%02dс",seconds);
        sc.close();
    }
}

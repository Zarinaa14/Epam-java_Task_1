package com.company.zaryna.epam.train;
import java.util.Scanner;
/**
 * Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах.
 * Вывести данное значение длительности в часах, минутах и секундах в следующей форме: ННч ММмин SSc.
 */
public class Task1_5 {
    public static void main(String[] args) {
        int  hours, minutes, seconds;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the natural number of seconds");
        int inputSecond =  sc.nextInt();
        hours = inputSecond/3600;
        minutes = (inputSecond%3600)/60;
        seconds = ((inputSecond%3600))%60;
        System.out.printf("%02d hours, %02d minutes, %02d seconds  ",hours,minutes,seconds);
        sc.close();
    }
}

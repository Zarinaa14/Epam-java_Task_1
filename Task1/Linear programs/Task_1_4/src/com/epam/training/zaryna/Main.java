package com.epam.training.zaryna;
import java.util.Scanner;

/**
 * Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).
 * Поменять местами дробную и целую части числа и вывести полученное значение числа
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях: ");
        String string = sc.nextLine();
        String [] part = string.split("\\.");
        String part1 = part[1];
        part[1] = part[0];
        part[0] = part1;
        System.out.println(part[0] + "." + part[1]);
        sc.close();

    }
}

package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        //Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).
        // Поменять местами дробную и целую части числа и вывести полученное значение числа
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях: ");
        str = sc.nextLine();
        String [] rep = str.split("\\.");
        String part1 = rep[1];
        rep[1] = rep[0];
        rep[0] = part1;
        System.out.println(rep[0] + "." + rep[1]);
        sc.close();

    }
}

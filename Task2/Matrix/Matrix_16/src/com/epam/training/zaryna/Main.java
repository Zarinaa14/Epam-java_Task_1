package com.epam.training.zaryna;

import java.util.*;

/*
    Формирует все магические квадрата n-ого порядка
 */
public class Main {

    public static void main(String[] args) {
        MagicSquare magicSquare = new MagicSquare();
        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите порядок магического квадрата: ");
            int n = in.nextInt();
            magicSquare.generateMagic(n);
        } catch (InputMismatchException ex) {
            System.out.println("Ошибка ввода! " + ex.getMessage());
        }
    }
}
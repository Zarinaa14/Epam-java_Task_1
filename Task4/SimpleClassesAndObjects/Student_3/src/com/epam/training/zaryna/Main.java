package com.epam.training.zaryna;
// Создайте класс с именем Student, содержащий поля: фамилия и инициалы,
// номер группы, успеваемость (массив из пяти элементов).
// Создайте массив из десяти элементов такого типа.
// Добавьте возможность вывода фамилий и номеров групп студентов, имеющих оценки, равные только 9 или 10


import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        ActionStudent action = new ActionStudent();
        ArrayOfStudents arrayOfStudents = new ArrayOfStudents();
        System.out.println("Рандомные студенты: ");
        arrayOfStudents = action.getRandomStudent(7);
        arrayOfStudents.print();
        System.out.println("Лучшие студенты: ");
        ArrayOfStudents newArraysExcellentStudents = action.getArraysExcellentStudents(arrayOfStudents);
        newArraysExcellentStudents.print();

    }
}


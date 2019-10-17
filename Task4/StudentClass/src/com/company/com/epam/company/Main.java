package com.company.com.epam.company;
// Создайте класс с именем Student, содержащий поля: фамилия и инициалы,
// номер группы, успеваемость (массив из пяти элементов).
// Создайте массив из десяти элементов такого типа.
// Добавьте возможность вывода фамилий и номеров групп студентов, имеющих оценки, равные только 9 или 10


public class Main {

    public static void main(String[] args) {
        StudentLogic array = new StudentLogic(3);
        String[] surname = new String[] { "Грибенко", "Милон", "Косенко", "Мирошничюк", "Владовенко", "Слизько", "Гаврило", "Кахошко", "Ведмеденко", "Лонтовко" };
        String[] initials = new String[] { "Валентин Евгенович", "Дима Петрович", "Женя Алексеевич", "Оля Михайловна", " Коля Едуардов", "Ваня Васильевич", "Оля Евгеньевна", "Максим Павлович", "Андрей Анатольевич", "Андрей Владиславович" };
        int [] groupNumber  =new int[]{23,11,24,44,12};
        int [] marks  =new int[]{8,10,9,9,10,7};

        System.out.println("Рандомные студенты: ");
        array.getRandomStudent(surname,initials,marks,groupNumber);
        array.print();
        System.out.println("Лучшие студенты: ");
        StudentLogic newMark=array.getArraysExcellentStudents();
        newMark.print();

    }
}


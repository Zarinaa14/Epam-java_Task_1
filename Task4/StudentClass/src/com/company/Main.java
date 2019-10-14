package com.company;
// Создайте класс с именем Student, содержащий поля: фамилия и инициалы,
// номер группы, успеваемость (массив из пяти элементов).
// Создайте массив из десяти элементов такого типа.
// Добавьте возможность вывода фамилий и номеров групп студентов, имеющих оценки, равные только 9 или 10
import java.util.Random;

import static com.company.Student.showBest;


public class Main {

    public static void main(String[] args) {
        Student[] massiv = new Student[3];
        String[] surname = new String[] { "Грибенко", "Милон", "Косенко", "Мирошничюк", "Владовенко", "Слизько", "Гаврило", "Кахошко", "Ведмеденко", "Лонтовко" };
        String[] initials = new String[] { "Валентин Евгенович", "Дима Петрович", "Женя Алексеевич", "Оля Михайловна", " Коля Едуардов", "Ваня Васильевич", "Оля Евгеньевна", "Максим Павлович", "Андрей Анатольевич", "Андрей Владиславович" };
        int [] groupNumber  =new int[]{23,11,24,44,12};
        Random random=new Random();
        for(int i=0;i<3;i++){
            massiv[i]=new Student(surname[random.nextInt(9)],initials[random.nextInt(9)],new int[]{5, 6, 7, 3, 9},groupNumber[random.nextInt(4)]);
            massiv[i]=new Student(surname[random.nextInt(9)],initials[random.nextInt(9)],new int[]{9, 9, 9, 10, 9},groupNumber[random.nextInt(4)]);
            massiv[i]=new Student(surname[random.nextInt(9)],initials[random.nextInt(9)],new int[]{5, 6, 7, 3, 9},groupNumber[random.nextInt(4)]);
            massiv[i]=new Student(surname[random.nextInt(9)],initials[random.nextInt(9)],new int[]{9, 10, 10, 9, 9},groupNumber[random.nextInt(4)]);

        }
        Student[] listStudent = new Student[10];
        listStudent[0] = new Student("Иванов", "Валентин Евгенович", new int[]{5, 6, 7, 3, 9},23);
        listStudent[1] = new Student("Петров","Дима Петрович",  new int[]{9, 10, 9, 9, 9},11);
        listStudent[2] = new Student("Моряков", "Женя Алексеевич", new int[]{8, 6, 7, 3, 10},11);
        listStudent[3] = new Student("Симашко"," Коля Едуардов" , new int[]{5, 10, 7, 6, 9},13);
        listStudent[4] = new Student("Лойко", "Оля Михайловна", new int[]{9, 10, 9, 9, 9},23);
        listStudent[5] = new Student("Силинская", "Оля Евгеньевна", new int[]{8, 6, 7, 7, 10},12);
        listStudent[6] = new Student("Козлова", "Женя Алексеевна",new int[]{9, 10, 9, 9, 9},23);
        listStudent[7] = new Student("Давидовская", "Карина Михайловна",new int[]{7, 10, 9, 9, 9},23);
        listStudent[8] = new Student("Станков","Дима Евгенович",  new int[]{9, 10, 9, 9, 9},11);
        listStudent[9] = new Student("Бондаренко","Паша Петрович",  new int[]{9, 10, 9, 9, 9},11);
        showBest(listStudent);
        System.out.println("Рандомные студенты: ");
        showBest(massiv);

    }
}


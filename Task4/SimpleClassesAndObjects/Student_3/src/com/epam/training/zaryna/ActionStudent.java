package com.epam.training.zaryna;

import java.util.Random;

public class ActionStudent {
    private ArrayOfStudents array = new ArrayOfStudents();
    private String[] surname = new String[]{"Грибенко", "Милон", "Косенко", "Мирошничюк", "Владовенко", "Слизько", "Гаврило", "Кахошко", "Ведмеденко", "Лонтовко"};
    private String[] initials = new String[]{"Валентин Евгенович", "Дима Петрович", "Женя Алексеевич", "Оля Михайловна", " Коля Едуардов", "Ваня Васильевич", "Оля Евгеньевна", "Максим Павлович", "Андрей Анатольевич", "Андрей Владиславович"};
    private int[] groupNumber = new int[]{23, 11, 24, 44, 12};
    private int[] marks = new int[]{8, 10, 9, 9, 10, 7};

    public ArrayOfStudents getRandomStudent(int size) {
        Random random = new Random();
        Student[] students = new Student[size];
        ArrayOfStudents arrayOfStudents = new ArrayOfStudents();
        for (int i = 0; i < size; i++) {
            int mark = marks[random.nextInt(6)];
            students[i] = new Student(surname[random.nextInt(9)], initials[random.nextInt(9)], new int[]{mark, mark, mark, mark, mark}, groupNumber[random.nextInt(4)]);
        }
        arrayOfStudents.setStudents(students);
        return arrayOfStudents;
    }

    public int getExcellentStudents(ArrayOfStudents students) {
        if (students == null) {
            throw new IllegalArgumentException("Студенты отсутствуют!");
        }

        int isExcellentStudent = 0;

        for (Student student : students.getArrayOfStudents()) {
            if (student.isExcellentStudent()) {
                isExcellentStudent++;
            }
        }

        return isExcellentStudent;
    }

    public ArrayOfStudents getArraysExcellentStudents(ArrayOfStudents students) {
        int numOfHonor = getExcellentStudents(students);
        ArrayOfStudents arrayOfHonorStudents = new ArrayOfStudents();
        if (numOfHonor > 0) {
            Student[] arrayOfHonor = new Student[numOfHonor];

            for (int i = 0, index = 0; i < students.getLengthArrayOfStudent(); i++) {
                if (students.getArrayOfStudents()[i].isExcellentStudent()) {
                    arrayOfHonor[index] = students.getArrayOfStudents()[i];
                    index++;
                }
            }
            arrayOfHonorStudents.setStudents(arrayOfHonor);
        }
        return arrayOfHonorStudents;
    }

}

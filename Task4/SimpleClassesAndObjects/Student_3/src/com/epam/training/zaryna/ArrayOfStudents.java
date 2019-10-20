package com.epam.training.zaryna;

import java.util.Random;

public class ArrayOfStudents {
    public Student[] arrayStudent;

    Random random = new Random();

    public ArrayOfStudents(int size) {
        if (size > 0) {
            arrayStudent = new Student[size];
            for (int i = 0; i < size; i++) {
                arrayStudent[i] = new Student();
            }
        }
    }

    public ArrayOfStudents(Student[] array) {
        setArrayOfStudents(array);
    }

    public int getSize() {
        if (arrayStudent != null) {
            return arrayStudent.length;
        } else {
            return 0;
        }
    }

    public void setArrayOfStudents(Student[] array) {
        if (array != null) {
            arrayStudent = new Student[array.length];
            for (int i = 0; i < getSize(); i++) {
                arrayStudent[i] = array[i];
            }
        }
    }

    public Student[] getArrayOfStudents() {
        return arrayStudent;
    }



    public int getExcellentStudents() {
        if (arrayStudent == null) {
            throw new IllegalArgumentException("Студенты отсутствуют!");
        }

        int isExcellentStudent = 0;

        for (Student student : arrayStudent) {
            if (student.isExcellentStudent()) {
                isExcellentStudent++;
            }
        }

        return isExcellentStudent;
    }

    public ArrayOfStudents getArraysExcellentStudents() {
        int numOfHonor = getExcellentStudents();
        if (numOfHonor > 0) {
            Student[] arrayOfHonor = new Student[numOfHonor];

            for (int i = 0, index = 0; i < arrayStudent.length; i++) {
                if (arrayStudent[i].isExcellentStudent()) {
                    arrayOfHonor[index] = arrayStudent[i];
                    index++;
                }
            }
            return new ArrayOfStudents(arrayOfHonor);

        } else {
            Student[] zeroHonor = new Student[1];
            zeroHonor[0] = new Student();

            return new ArrayOfStudents(zeroHonor);
        }
    }


    public void print() {
        System.out.println(toString());
    }

    public void getRandomStudent(String[] surname, String[] initials, int[] marks, int[] groupNumber) {
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            int mark = marks[random.nextInt(6)];
            arrayStudent[i] = new Student(surname[random.nextInt(9)], initials[random.nextInt(9)], new int[]{mark, mark, mark, mark, mark}, groupNumber[random.nextInt(4)]);
        }
    }


    @Override
    public String toString() {
        if (arrayStudent != null) {
            String string = new String();

            for (Student student : arrayStudent) {
                string += student.toString() + "\n";
            }

            return string;

        } else {
            return "нет студентов";
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        ArrayOfStudents other = (ArrayOfStudents) obj;

        boolean isEqual = (other.getSize() == getSize());

        for (int i = 0; isEqual && i < getSize(); i++) {
            if (!arrayStudent[i].equals(other.getArrayOfStudents()[i])) {
                isEqual = false;
            }
        }

        return isEqual;
    }

    @Override
    public int hashCode() {
        final int number = 31;
        int result = 1;
        for (int i = 0; i < getSize(); i++) {
            result = number * result + arrayStudent[i].hashCode();
        }
        return result;
    }
}

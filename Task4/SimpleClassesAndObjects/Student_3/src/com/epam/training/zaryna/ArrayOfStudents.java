package com.epam.training.zaryna;

import java.util.Random;

public class ArrayOfStudents {

    public Student[] students = new Student[0];

    public ArrayOfStudents() {
        setStudents(students);
    }

    public void setStudents(Student[] array) {
        students = array;
    }

    public Student[] getStudents() {
        return students;
    }


    public int getLengthArrayOfStudent() {
        return students.length;
    }


    public Student getIndexOfStudent(int index) {
        if (index >= 0 && index < students.length) {
            return students[index];
        } else {
            throw new IllegalArgumentException("Индекс выходит за пределы массива!");
        }
    }


    public Student[] getArrayOfStudents() {
        return students;
    }



    public void print() {
        System.out.println(this);
    }


    public Student[] addStudent(Student student) {
        if (students == null) {
            throw new IllegalArgumentException("Массив нулевой длины");
        }
        Student[] newStudents = new Student[getLengthArrayOfStudent() + 1];

        for (int i = 0; i < getLengthArrayOfStudent(); i++) {
            newStudents[i] = students[i];
        }
        newStudents[getLengthArrayOfStudent()] = student;
        students = newStudents;
        return newStudents;

    }





    @Override
    public String toString() {
        if (students.length > 0) {
            StringBuilder res = new StringBuilder();
            for (Student student : students) {
                res.append(student);
                res.append("\n");
            }
            return res.toString();
        } else {
            return "Студенты отсутствуют!";
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

        boolean isEqual = (other.getLengthArrayOfStudent() == getLengthArrayOfStudent());

        for (int i = 0; isEqual && i < getLengthArrayOfStudent(); i++) {
            if (!students[i].equals(other.getArrayOfStudents()[i])) {
                isEqual = false;
            }
        }

        return isEqual;
    }

    @Override
    public int hashCode() {
        final int number = 31;
        int result = 1;
        for (int i = 0; i < getLengthArrayOfStudent(); i++) {
            result = number * result + students[i].hashCode();
        }
        return result;
    }
}

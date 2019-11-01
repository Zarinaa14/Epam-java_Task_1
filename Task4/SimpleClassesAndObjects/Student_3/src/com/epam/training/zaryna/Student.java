package com.epam.training.zaryna;

// Создайте класс с именем Student, содержащий поля: фамилия и инициалы,
// номер группы, успеваемость (массив из пяти элементов).
// Создайте массив из десяти элементов такого типа.
// Добавьте возможность вывода фамилий и номеров групп студентов, имеющих оценки, равные только 9 или 10
public class Student {
    private String surname;
    private String initials;
    private int groupNumber;
    private int[] marks = new int[5];

    public Student() {
        surname = "not found";
        initials = "not found";
        groupNumber = 0;
        int[] marks = {0, 0, 0, 0, 0};

    }

    public Student(String surname, String initials, int[] marks, int groupNumber) {
        this.surname = surname;
        this.initials = initials;
        this.groupNumber = groupNumber;
        this.marks = marks;
    }

    public void setSurname(String surname) {
        if (surname != null && !surname.isEmpty()) {
            this.surname = surname;
        }
    }

    public void setInitial(String initial) {
        if (initial != null && !initial.isEmpty()) {
            this.initials = initial;
        }
    }

    public void setGroupNumber(int group) {
        if (group > 0) {
            groupNumber = group;
        }
    }

    public String getSurname() {
        return surname;
    }

    public String getInitial() {
        return initials;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setMarks(int mark, int subjectNumber) {
        if (subjectNumber >= 0 && subjectNumber < marks.length && mark > 0) {
            marks[subjectNumber] = mark;
        }
    }

    public int[] getMarks() {
        return marks;
    }

    //Получить отметк по отдельному предмету
    public int getMark(int index) {
        if (index >= 0 && index < marks.length) {
            return marks[index];
        } else {
            return 0;
        }
    }

    public void printMarks() {
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
    }


    public boolean isExcellentStudent() {
        int count = 0;
        boolean isExcellentStudent = false;

        for (int i = 0; i < marks.length; i++) {
            if (marks[i] < 9) {

                count++;
            }
        }
        if (count == 0) {
            isExcellentStudent = true;
        }
        return isExcellentStudent;
    }


    @Override
    public String toString() {
        return "Surname " + surname
                + ", initials " + initials
                + ", groupNumber " + groupNumber + " marks " + marks[0] + "; " + marks[1]
                + "; " + marks[2] + "; " + marks[3];
    }

    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }

        if (object == null || object.getClass() != this.getClass()) {
            return false;
        }
        Student other = (Student) object;
        boolean sameMark = getMarks().equals(other.getMarks());
        return sameMark && surname.equals(other.surname) && initials.equals(other.initials) && groupNumber == other.groupNumber;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + ((surname == null) ? 0 : surname.hashCode());
        result = prime * result + ((initials == null) ? 0 : initials.hashCode());
        result = prime * result + groupNumber;
        result = (prime * result) + getGroupNumber();

        return result;
    }
}

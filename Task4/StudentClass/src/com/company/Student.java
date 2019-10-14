package com.company;
// Создайте класс с именем Student, содержащий поля: фамилия и инициалы,
// номер группы, успеваемость (массив из пяти элементов).
// Создайте массив из десяти элементов такого типа.
// Добавьте возможность вывода фамилий и номеров групп студентов, имеющих оценки, равные только 9 или 10
public class Student {
    private String surname;
    private String initials;
    private int groupNumber;
    private int[] marks=new int[5];

    public Student(String surname,String initials,int[] marks,int groupNumber){
        this.surname=surname;
        this.initials=initials;
        this.groupNumber=groupNumber;
        this.marks=marks;
    }
    protected void setSurname(String surname){
        if(surname!=null && !surname.isEmpty()) {
            this.surname = surname;
        }
    }

    protected void setInitial(String initial){
        if(initial !=null && !initial.isEmpty()) {
            this.initials = initial;
        }
    }

    protected void setGroupNumber(int group){
        if(group>0) {
            groupNumber = group;
        }
    }
    protected String getSurname(){
        return surname;
    }

    protected String getInitial(){
        return initials;
    }

    protected int getGroupNumber(){
        return groupNumber;
    }
    protected static void showBest(Student[] listStudents) {
        for (Student student : listStudents) {
            int count = 0;
            for (int a : student.marks) {
                if (a < 9) {
                    count++;
                }
            }
            if (count == 0)
                System.out.println("Лучшие студенты: "+student.surname + " из " + student.groupNumber+" группы");
        }
    }

}

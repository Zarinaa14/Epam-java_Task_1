package com.company.com.company.epam.training;

public class Info {
    public void printStartInfo(){
        System.out.println("Нажмите 1, чтобы вывести список рейсов для заданного пункта назначения \n" +
                "Нажмите 2, чтобы вывести список рейсов для заданного дня недели \n" +
                "Нажмите 3, чтобы вывести список рейсов для заданного дня недели, время вылета для которых больше заданного \n" +
                "Нажмите 5, чтобы выйти\n");
    }
    public void printInfoOfDestination(){
        System.out.println("Задайте любой пункта назначения с большой буквы, который написан выше: \n");
    }
}

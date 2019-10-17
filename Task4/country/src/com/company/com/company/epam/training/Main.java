package com.company.com.company.epam.training;
//3. Создать объект класса Государство, используя классы Область,
//Район, Город. Методы: вывести на консоль столицу, количество областей, площадь, областные центры.
public class Main {

    public static void main(String[] args) {
        ArrayCity arrayCity = new ArrayCity(10);
        arrayCity.ArrayRegion(6);
        arrayCity.ArrayDistrict(6);
        String[] arrayOfCityName = {"Минск","Могилев","Брест","Гродно","Гомель","Витебск"};
        String[] arrayRegion= new String[]{"Минский", "Могилевский", "Бреский", "Гродненский", "Гомельский", "Витебский"};
        String[] arrayDistrict=new String[]{"Барановичи","Борисов","Новогрудок","Пинск","Держинск","Кричев"};
        int[] arraySquare ={234,456,345,332,345,667,656,435};
        arrayCity.runCity(arrayOfCityName,arrayRegion,arrayDistrict,arraySquare);
        arrayCity.print();

    }
}

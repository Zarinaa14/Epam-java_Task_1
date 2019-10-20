package com.epam.training.zaryna;

/*
    Коллекция(массив) авиалиний.
    Возможности:
    1) нахождение списка рейсов для заданного пункта назнач.
    2) нахождение списка рейсов для заданного дня недели
    3) нахождение списка рейсов для заданного дня недели,
    время вылета для которых больше заданного
    4) добавление/удаление рейса
 */

import java.util.Random;

public class ArrayAirplanes {

    private Airplane[] arrayOfAirplane;
    Random random = new Random();

    public ArrayAirplanes(int size) {
        if (size > 0) {
            arrayOfAirplane = new Airplane[size];
            for (int i = 0; i < size; i++) {
                arrayOfAirplane[i] = new Airplane();
            }
        }
    }

    private int age =25;
    private float age2=56f;
    double result=age+age2;
    int i=(int)age2;

    public ArrayAirplanes(Airplane[] array) {
        setArrayOfAirlines(array);
    }

    protected void setArrayOfAirlines(Airplane[] array) {
        if (array != null) {
            arrayOfAirplane = new Airplane[array.length];
            for (int i = 0; i < getSize(); i++) {
                arrayOfAirplane[i] = array[i];
            }
        }
    }

    protected int getSize() {
        if (arrayOfAirplane != null) {
            return arrayOfAirplane.length;
        } else {
            return 0;
        }
    }

    protected Airplane[] getArrayOfAirlines() {
        return arrayOfAirplane;
    }

    public Airplane getAirplane(int index) {
        if (index >= 0 && index < getSize()) {
            return arrayOfAirplane[index];
        } else {
            throw new IllegalArgumentException("Выход за пределы массива!");
        }
    }

    protected void print() {
        System.out.println(toString());
    }

    // Возвращает рейсы в указанный пункт назначений.
    protected void getFlightsToDestination(String destination) {
        for (Airplane airline : arrayOfAirplane) {
            if (airline.getDestination().equals(destination)) {
                airline.print();
            }
        }
    }

    protected void getDays(String day) {
        for (Airplane airline : arrayOfAirplane) {
            if (airline.getDays().equals(day)) {
                airline.print();
            }
        }
    }

    private Time getTime() {
        Time time = new Time();
        int[] arrayHours =   {2, 4, 7, 9, 10, 15, 8, 13, 16, 18};
        int[] arrayMinutes = {23, 44, 17, 49, 10, 15, 28, 53, 16, 18};
        int[] arraySeconds = {23, 44, 17, 49, 10, 15, 28, 53, 16, 18};
        time.setTime(arrayHours[random.nextInt(10)], arrayMinutes[random.nextInt(10)], arraySeconds[random.nextInt(10)]);
        return time;
    }

    protected void getRandomAirline(String[] arrayOfDestination, int[] arrayFlightNumber, String[] arrayPlaneType, String[] arrayOfDays) {
        for (int i = 0; i < 10; i++) {
            Time randomTime = getTime();
            arrayOfAirplane[i] = new Airplane(arrayOfDestination[random.nextInt(10)], arrayFlightNumber[random.nextInt(10)], arrayPlaneType[random.nextInt(7)], randomTime, arrayOfDays[random.nextInt(7)]);
        }
    }

    protected void addAirline(Airplane airline) {
        if (airline != null) {
            Airplane[] newAirlines = new Airplane[getSize() + 1];

            for (int i = 0; i < getSize(); i++) {
                newAirlines[i] = arrayOfAirplane[i];
            }
            newAirlines[getSize()] = airline;
            arrayOfAirplane = newAirlines;
        }
    }

    // Возвращает рейсы в указанный день недели после заданного времени.
    protected void getFlightsForDay(String day, Time time) {
        for (Airplane airline : arrayOfAirplane) {
            if (airline.getDays().equals(day)&&time.compareTo(airline.getTimeOfAppointment()) > 0) {
                airline.print();
            }
        }

    }

    @Override
    public String toString() {
        if (arrayOfAirplane != null) {
            String string = new String();

            for (Airplane airline : arrayOfAirplane) {
                string += airline.toString() + "\n";
            }

            return string;

        } else {
            return "Рейсы отсутствуют!";
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

        ArrayAirplanes other = (ArrayAirplanes) obj;

        boolean isEqual = (other.getSize() == getSize());

        for (int i = 0; isEqual && i < getSize(); i++) {
            if (!arrayOfAirplane[i].equals(other.getArrayOfAirlines()[i])) {
                isEqual = false;
            }
        }

        return isEqual;
    }

    @Override
    public int hashCode() {
        final int number = 10;
        int result = 1;
        for (int i = 0; i < getSize(); i++) {
            result = number * result + arrayOfAirplane[i].hashCode();
        }
        return result;
    }
}

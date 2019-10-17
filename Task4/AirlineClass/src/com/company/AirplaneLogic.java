package com.company;
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

public class AirplaneLogic {

    private Airline[] arrayOfAirlines;
    Random random = new Random();

    public AirplaneLogic(int size) {
        if (size > 0) {
            arrayOfAirlines = new Airline[size];
            for (int i = 0; i < size; i++) {
                arrayOfAirlines[i] = new Airline();
            }
        }
    }

    public AirplaneLogic(Airline[] array) {
        setArrayOfAirlines(array);
    }

    public void setArrayOfAirlines(Airline[] array) {
        if (array != null) {
            arrayOfAirlines = new Airline[array.length];
            for (int i = 0; i < getSize(); i++) {
                arrayOfAirlines[i] = array[i];
            }
        }
    }

    public int getSize() {
        if (arrayOfAirlines != null) {
            return arrayOfAirlines.length;
        } else {
            return 0;
        }
    }

    public Airline[] getArrayOfAirlines() {
        return arrayOfAirlines;
    }

    public Airline getAirline(int index) {
        if (index >= 0 && index < getSize()) {
            return arrayOfAirlines[index];
        } else {
            throw new IllegalArgumentException("Выход за пределы массива!");
        }
    }

    public void print() {
        System.out.println(toString());
    }

    // Возвращает рейсы в указанный пункт назначений.
    public void getFlightsToDestination(String destination) {
        for (Airline airline : arrayOfAirlines) {
            if (airline.getDestination().equals(destination)) {
                airline.print();
            }
        }
    }

    public void getDays(String day) {
        for (Airline airline : arrayOfAirlines) {
            if (airline.getDays().equals(day)) {
                airline.print();
            }
        }
    }

    public String getTime() {
        Time time = new Time();
        int[] arrayHours =   {2, 4, 7, 9, 10, 15, 8, 13, 16, 18};
        int[] arrayMinutes = {23, 44, 17, 49, 10, 15, 28, 53, 16, 18};
        int[] arraySeconds = {23, 44, 17, 49, 10, 15, 28, 53, 16, 18};
        time.setTime(arrayHours[random.nextInt(10)], arrayMinutes[random.nextInt(10)], arraySeconds[random.nextInt(10)]);
        return time.getTimeObject(time);
    }

    public void getRandomAirline(String[] arrayOfDestination, int[] arrayFlightNumber, String[] arrayPlaneType, String[] arrayOfDays) {
        for (int i = 0; i < 10; i++) {
            String randomTime = getTime();
            arrayOfAirlines[i] = new Airline(arrayOfDestination[random.nextInt(10)], arrayFlightNumber[random.nextInt(10)], arrayPlaneType[random.nextInt(7)], randomTime, arrayOfDays[random.nextInt(7)]);
        }
    }

    public void addAirline(Airline airline) {
        if (airline != null) {
            Airline[] newAirlines = new Airline[getSize() + 1];

            for (int i = 0; i < getSize(); i++) {
                newAirlines[i] = arrayOfAirlines[i];
            }
            newAirlines[getSize()] = airline;
            arrayOfAirlines = newAirlines;
        }
    }

    // Возвращает рейсы в указанный день недели после заданного времени.
    public void getFlightsForDay(String day, String time) {
        for (Airline airline : arrayOfAirlines) {
            if (time.compareTo(airline.getTimeOfAppointment()) < 0) ;
            if (airline.getDays().equals(day)) {
                airline.print();
            }
        }
    }

    @Override
    public String toString() {
        if (arrayOfAirlines != null) {
            String string = new String();

            for (Airline airline : arrayOfAirlines) {
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

        AirplaneLogic other = (AirplaneLogic) obj;

        boolean isEqual = (other.getSize() == getSize());

        for (int i = 0; isEqual && i < getSize(); i++) {
            if (!arrayOfAirlines[i].equals(other.getArrayOfAirlines()[i])) {
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
            result = number * result + arrayOfAirlines[i].hashCode();
        }
        return result;
    }
}

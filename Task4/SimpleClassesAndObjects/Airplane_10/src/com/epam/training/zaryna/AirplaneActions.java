package com.epam.training.zaryna;

import java.util.Random;

public class AirplaneActions {
    private String[] arrayPlaneType = {"Airbus A330", "Boeing-737", "Airbus A567", "Boeing-747", "Boeing-777", "Boeing-767", "Boeing-524", "Airbus B567", "Airbus H876"};
    private int[] arrayFlightNumber = {4533, 5543, 7654, 9876, 3211, 2345, 4456, 5456, 5443, 6676};
    private String[] arrayOfDestination = {"Minsk", "Moscow", "Poland", "Italy", "Spain", "Egypt", "France", "Netherlands", "Russia", "Ukraine"};
    private String[] arrayOfDays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
    Random random = new Random();

    public Time getTime() {
        Time time = new Time();
        int[] arrayHours = {2, 4, 7, 9, 10, 15, 8, 13, 16, 18};
        int[] arrayMinutes = {23, 44, 17, 49, 10, 15, 28, 53, 16, 18};
        int[] arraySeconds = {23, 44, 17, 49, 10, 15, 28, 53, 16, 18};
        time.setTime(arrayHours[random.nextInt(10)], arrayMinutes[random.nextInt(10)], arraySeconds[random.nextInt(10)]);
        return time;
    }

    public ArrayAirplanes getRandomAirline(int size) {

        ArrayAirplanes arrayAirplanes = new ArrayAirplanes();
        Airplane[] airplanes = new Airplane[size];
        for (int i = 0; i < size; i++) {
            Time randomTime = getTime();
            airplanes[i] = new Airplane(arrayOfDestination[random.nextInt(10)], arrayFlightNumber[random.nextInt(10)], arrayPlaneType[random.nextInt(7)], randomTime, arrayOfDays[random.nextInt(7)]);
        }
        arrayAirplanes.setAirplanes(airplanes);
        return arrayAirplanes;
    }


    // Возвращает рейсы в указанный пункт назначений.
    public ArrayAirplanes getFlightsToDestination(ArrayAirplanes arrayAirplanes, String destination) {
        ArrayAirplanes sortedArrayOfCustomers = new ArrayAirplanes();
        int countAirplane = 0;

        for (Airplane airline : arrayAirplanes.getAirplanes()) {
            if (airline.getDestination().equals(destination)) {
                countAirplane++;
            }
        }
        if (countAirplane > 0) {
            Airplane[] newAirplane = new Airplane[countAirplane];
            int i = 0;
            for (Airplane airplane : arrayAirplanes.getAirplanes()) {
                if (airplane.getDestination().equals(destination)) {
                    newAirplane[i] = airplane;
                    i++;
                }
            }
            sortedArrayOfCustomers.setAirplanes(newAirplane);
        }
        return sortedArrayOfCustomers;
    }

    public ArrayAirplanes getDays(ArrayAirplanes arrayAirplanes, String day) {
        int countAirplane = 0;
        ArrayAirplanes sortedArrayOfCustomers = new ArrayAirplanes();
        for (Airplane airline : arrayAirplanes.getAirplanes()) {
            if (airline.getDays().equals(day)) {
                countAirplane++;
            }
        }
        if (countAirplane > 0) {
            Airplane[] newAirplane = new Airplane[countAirplane];
            int i = 0;
            for (Airplane airplane : arrayAirplanes.getAirplanes()) {
                if (airplane.getDays().equals(day)) {
                    newAirplane[i] = airplane;
                    i++;
                }
            }
            sortedArrayOfCustomers.setAirplanes(newAirplane);
        }
        return sortedArrayOfCustomers;

    }


    // Возвращает рейсы в указанный день недели после заданного времени.
    public ArrayAirplanes getFlightsForDay(ArrayAirplanes arrayAirplanes, String day, Time time) {
        int countAirplane = 0;
        ArrayAirplanes sortedArrayOfCustomers = new ArrayAirplanes();
        for (Airplane airplane : arrayAirplanes.getAirplanes()) {
            if (airplane.getDays().equals(day) && time.compareTo(airplane.getTimeOfAppointment()) > 0) {
                countAirplane++;
            }
        }
        if (countAirplane > 0) {
            Airplane[] newAirplane = new Airplane[countAirplane];
            int i = 0;
            for (Airplane airplane : arrayAirplanes.getAirplanes()) {
                if (airplane.getDays().equals(day) && time.compareTo(airplane.getTimeOfAppointment()) > 0) {
                    newAirplane[i] = airplane;
                    i++;
                }
            }

            sortedArrayOfCustomers.setAirplanes(newAirplane);
        }
        return sortedArrayOfCustomers;

    }

}

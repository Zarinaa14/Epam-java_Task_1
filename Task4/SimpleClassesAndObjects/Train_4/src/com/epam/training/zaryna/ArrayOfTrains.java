package com.epam.training.zaryna;

import java.util.Random;

public class ArrayOfTrains {

    public Train[] trains = new Train[0];

    public ArrayOfTrains() {
        setTrains(trains);
    }

    public void setTrains(Train[] array) {
        trains = array;
    }

    public Train[] getTrains() {
        return trains;
    }


    public int getLengthArrayOfTrains() {
        return trains.length;
    }


    public Train getIndexTrains(int index) {
        if (index >= 0 && index < trains.length) {
            return trains[index];
        } else {
            throw new IllegalArgumentException("Индекс выходит за пределы массива!");
        }
    }

    public Train[] getArrayOfTrain() {
        return trains;
    }


    public void print() {
        System.out.println(this);
    }


    public Train[] addTrains(Train airline) {
        if (trains == null) {
            throw new IllegalArgumentException("Массив нулевой длины");
        }
        Train[] newTrains = new Train[getLengthArrayOfTrains() + 1];

        for (int i = 0; i < getLengthArrayOfTrains(); i++) {
            newTrains[i] = trains[i];
        }
        newTrains[getLengthArrayOfTrains()] = airline;
        trains = newTrains;
        return newTrains;

    }


    @Override
    public String toString() {
        if (trains.length > 0) {
            StringBuilder res = new StringBuilder();
            for (Train train : trains) {
                res.append(train);
                res.append("\n");
            }
            return res.toString();
        } else {
            return "Пассажиры отсутствуют!";
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

        ArrayOfTrains other = (ArrayOfTrains) obj;

        boolean isEqual = (other.getLengthArrayOfTrains() == getLengthArrayOfTrains());

        for (int i = 0; isEqual && i < getLengthArrayOfTrains(); i++) {
            if (!trains[i].equals(other.getArrayOfTrain()[i])) {
                isEqual = false;
            }
        }

        return isEqual;
    }

    @Override
    public int hashCode() {
        final int number = 31;
        int result = 1;
        for (int i = 0; i < getLengthArrayOfTrains(); i++) {
            result = number * result + trains[i].hashCode();
        }
        return result;
    }
}

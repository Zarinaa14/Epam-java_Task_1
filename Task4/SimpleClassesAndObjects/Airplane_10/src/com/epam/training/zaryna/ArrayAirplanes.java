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

public class ArrayAirplanes {

    public Airplane[] airplanes = new Airplane[0];

    public ArrayAirplanes() {
        setAirplanes(airplanes);
    }

    public void setAirplanes(Airplane[] array) {
        airplanes = array;
    }

    public Airplane[] getAirplanes() {
        return airplanes;
    }


    public int getLengthArrayOfAirplanes() {
        return airplanes.length;
    }


    public Airplane getAirplanes(int index) {
        if (index >= 0 && index < airplanes.length) {
            return airplanes[index];
        } else {
            throw new IllegalArgumentException("Индекс выходит за пределы массива!");
        }
    }


    public Airplane[] getArrayOfAirplanes() {
        return airplanes;
    }


    public Airplane getIndexAirplane(int index) {
        if (index >= 0 && index < getLengthArrayOfAirplanes()) {
            return airplanes[index];
        } else {
            throw new IllegalArgumentException("Выход за пределы массива!");
        }
    }

    public void print() {
        System.out.println(this);
    }


    public Airplane[] addAirline(Airplane airline) {
        if (airplanes == null) {
            throw new IllegalArgumentException("Массив нулевой длины");
        }
        Airplane[] newAirlines = new Airplane[getLengthArrayOfAirplanes() + 1];

        for (int i = 0; i < getLengthArrayOfAirplanes(); i++) {
            newAirlines[i] = airplanes[i];
        }
        newAirlines[getLengthArrayOfAirplanes()] = airline;
        airplanes = newAirlines;
        return newAirlines;

    }


    @Override
    public String toString() {
        if (airplanes.length > 0) {
            StringBuilder res = new StringBuilder();
            for (Airplane airplane : airplanes) {
                res.append(airplane);
                res.append("\n");
            }
            return res.toString();
        } else {
            return "Покупатели отсутствуют!";
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

        boolean isEqual = (other.getLengthArrayOfAirplanes() == getLengthArrayOfAirplanes());

        for (int i = 0; isEqual && i < getLengthArrayOfAirplanes(); i++) {
            if (!airplanes[i].equals(other.getArrayOfAirplanes()[i])) {
                isEqual = false;
            }
        }

        return isEqual;
    }

    @Override
    public int hashCode() {
        final int number = 31;
        int result = 1;
        for (int i = 0; i < getLengthArrayOfAirplanes(); i++) {
            result = number * result + airplanes[i].hashCode();
        }
        return result;
    }
}

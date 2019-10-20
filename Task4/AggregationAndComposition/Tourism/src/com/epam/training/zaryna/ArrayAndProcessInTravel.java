package com.epam.training.zaryna;

/*
    Коллекция(массив) путевок
    Возможности:
    1) добавление/удаление путевки
    2) поиск путевки
    3) выбор/отмена путевки
    4) сортировка путевок по различным полям
    5) вывод на консоль
 */

public class ArrayAndProcessInTravel {

    private TravelVouncher[] arrayOfTravel;

    public ArrayAndProcessInTravel(int number) {
        if (number > 0) {
            arrayOfTravel = new TravelVouncher[number];
            for (int i = 0; i < number; i++) {
                arrayOfTravel[i] = new TravelVouncher();
            }
        }
    }

    public ArrayAndProcessInTravel(TravelVouncher[] array) {
        setArrayOfTravel(array);
    }

    public void setArrayOfTravel(TravelVouncher[] array) {
        if (array != null) {
            arrayOfTravel = new TravelVouncher[array.length];
            for (int i = 0; i < array.length; i++) {
                arrayOfTravel[i] = array[i];
            }
        }
    }

    public int getNumOfVouchers() {
        return arrayOfTravel.length;
    }

    public TravelVouncher[] getArrayOfTravel() {
        return arrayOfTravel;
    }


    public void addVouncher(int typeChoise, int foodChoice, int transportChoice, int numOfDays, double cost) {
        TravelVouncher[] newVounchers = new TravelVouncher[getNumOfVouchers() + 1];
        for (int i = 0; i < getNumOfVouchers(); i++) {
            newVounchers[i] = arrayOfTravel[i];
        }

        newVounchers[getNumOfVouchers()] = new TravelVouncher(typeChoise, foodChoice, transportChoice, numOfDays, cost);
        arrayOfTravel = newVounchers;
    }

    public void deleteVoucher(double cost) {
        int numOfVounchers = getNumOfVouchers();
        TravelVouncher[] newVouchers = new TravelVouncher[numOfVounchers];
        for (TravelVouncher voucher : arrayOfTravel) {
            if (voucher.getPrice() > cost) {
                numOfVounchers--;
            }
        }

        if (numOfVounchers < getNumOfVouchers()) {

            for (int i = 0, index = 0; i < getNumOfVouchers(); i++) {
                if (arrayOfTravel[i].getPrice() <= cost) {
                    newVouchers[index] = arrayOfTravel[i];
                    index++;
                }
            }
            arrayOfTravel = newVouchers;
        }
    }

    public void deleteVoucher(int index) {
        if (index >= 0 && index < getNumOfVouchers()) {
            int numOfVouchers = getNumOfVouchers() - 1;
            TravelVouncher[] vouchers = new TravelVouncher[numOfVouchers];
            for (int i = 0, j = 0; i < getNumOfVouchers(); i++) {
                if (i != index) {
                    vouchers[j] = arrayOfTravel[i];
                    j++;
                }
            }

            arrayOfTravel = vouchers;
        }
    }


    //Сортирует путевки по цене. Если цены одинаковы, то сортирует по кол-ву дней
    public void sortByPrice() {
        for (int i = 0; i < getNumOfVouchers() - 1; i++) {
            for (int j = 0; j < getNumOfVouchers() - i - 1; j++) {
                if (arrayOfTravel[j].getPrice() > arrayOfTravel[j + 1].getPrice()) {
                    change(j, j + 1);
                } else {
                    if (arrayOfTravel[j + 1].getPrice() == arrayOfTravel[j].getPrice()) {
                        if (arrayOfTravel[j].getNumberOfDays() > arrayOfTravel[j + 1].getNumberOfDays()) {
                            change(j, j + 1);
                        }
                    }
                }
            }
        }
    }

    //Сортирует по типу путевки. Если тип одинаковый, то сортирует по цене
    public void sortByType() {
        int time;

        for (int i = 0; i < getNumOfVouchers() - 1; i++) {
            for (int j = 0; j < getNumOfVouchers() - i - 1; j++) {
                time = arrayOfTravel[j].getTypeTravel().compareTo(arrayOfTravel[j + 1].getTypeTravel());
                if (time > 0) {
                    change(j, j + 1);
                } else {
                    if (time == 0) {
                        if (arrayOfTravel[j].getPrice() > arrayOfTravel[j + 1].getPrice()) {
                            change(j, j + 1);
                        }
                    }
                }
            }
        }
    }


    protected void print() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        String string = new String();

        for (int i = 0; i < getNumOfVouchers(); i++) {
            string += (i + 1) + arrayOfTravel[i].toString() + "\n";
        }

        return string;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        ArrayAndProcessInTravel other = (ArrayAndProcessInTravel) obj;

        boolean isEqual = getNumOfVouchers() == other.getNumOfVouchers();

        for (int i = 0; isEqual && i < getNumOfVouchers(); i++) {
            if (!arrayOfTravel[i].equals(other.getArrayOfTravel()[i])) {
                isEqual = false;
            }
        }

        return isEqual;
    }

    @Override
    public int hashCode() {
        final int number = 10;
        int result = 1;

        for (TravelVouncher vouncher : arrayOfTravel) {
            result = number * result + vouncher.hashCode();
        }

        return result;
    }

    private void change(int index1, int index2) {

        if (index1 >= 0 && index1 < getNumOfVouchers() && index2 >= 0 && index2 < getNumOfVouchers()) {
            TravelVouncher time = arrayOfTravel[index1];
            arrayOfTravel[index1] = arrayOfTravel[index2];
            arrayOfTravel[index2] = time;
        }
    }
}

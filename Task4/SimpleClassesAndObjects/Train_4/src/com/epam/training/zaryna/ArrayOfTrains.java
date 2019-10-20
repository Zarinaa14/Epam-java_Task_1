package com.epam.training.zaryna;

import java.util.Random;

public class ArrayOfTrains {
    public Train[] arrayOfTrain;

    public ArrayOfTrains(int size) {
        if (size > 0) {
            arrayOfTrain = new Train[size];
            for (int i = 0; i < size; i++) {
                arrayOfTrain[i] = new Train();
            }
        }
    }

    public void getRandomTrains(String[] name, int[] number, int[] time) {
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            arrayOfTrain[i] = new Train(name[random.nextInt(8)], number[random.nextInt(6)], time[random.nextInt(8)]);
        }
    }

    public ArrayOfTrains(Train[] array) {
        setArrayOfTrain(array);
    }

    public void print() {
        System.out.println(toString());
    }


    public void setArrayOfTrain(Train[] array) {
        if (array != null) {
            arrayOfTrain = new Train[array.length];
            for (int i = 0; i < getLength(); i++) {
                arrayOfTrain[i] = array[i];
            }
        }
    }

    public Train[] getArrayOfTrain() {
        return arrayOfTrain;
    }

    public int getLength() {
        if (arrayOfTrain != null) {
            return arrayOfTrain.length;
        } else {
            return 0;
        }
    }

    public Train[] sortByNumberOfTrain() {
        for (int i = 0; i < arrayOfTrain.length - 1; i++) {
            for (int j = 0; j < arrayOfTrain.length - 1 - i; j++) {
                int curr = arrayOfTrain[j].numberOfTrain;
                int curr_1 = arrayOfTrain[j + 1].numberOfTrain;
                if (curr > curr_1) {
                    Train tmp = arrayOfTrain[j];
                    arrayOfTrain[j] = arrayOfTrain[j + 1];
                    arrayOfTrain[j + 1] = tmp;
                }

            }
        }
        return arrayOfTrain;
    }


    public void printInfoByNumber(int number) {
        for (int i = 0; i < arrayOfTrain.length; i++) {
            if (arrayOfTrain[i].getTrainNumber() == number) {
                arrayOfTrain[i].print();
            }
        }
    }

    public void sortByDestination() {
        int stringCompare;

        for (int i = 0; i < arrayOfTrain.length - 1; i++) {
            for (int j = 0; j < arrayOfTrain.length - i - 1; j++) {
                stringCompare = arrayOfTrain[j].nameOfTheDestination.compareTo(arrayOfTrain[j + 1].nameOfTheDestination);

                if (stringCompare > 0) {
                    Train temp;
                    temp = arrayOfTrain[j];
                    arrayOfTrain[j] = arrayOfTrain[j + 1];
                    arrayOfTrain[j + 1] = temp;
                } else {
                    if (stringCompare == 0) {
                        if (isIndexMoreThanIndex2(j, j + 1, arrayOfTrain)) {
                            Train temp;
                            temp = arrayOfTrain[j];
                            arrayOfTrain[j] = arrayOfTrain[j + 1];
                            arrayOfTrain[j + 1] = temp;
                        }
                    }
                }
            }
        }
    }

    private boolean isIndexMoreThanIndex2(int index1, int index2, Train[] arrayOfTrain) {
        if (arrayOfTrain[index1].departureTime > arrayOfTrain[index2].departureTime) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        if (arrayOfTrain != null) {
            String string = new String();

            for (Train student : arrayOfTrain) {
                string += student.toString() + "\n";
            }

            return string;

        } else {
            return "нет студентов";
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

        boolean isEqual = (other.getLength() == getLength());

        for (int i = 0; isEqual && i < getLength(); i++) {
            if (!arrayOfTrain[i].equals(other.getArrayOfTrain()[i])) {
                isEqual = false;
            }
        }

        return isEqual;
    }

    @Override
    public int hashCode() {
        final int number = 31;
        int result = 1;
        for (int i = 0; i < getLength(); i++) {
            result = number * result + arrayOfTrain[i].hashCode();
        }
        return result;
    }
}

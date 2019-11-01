package com.epam.training.zaryna;

import java.util.Random;

public class ActionTrain {

    private ArrayOfTrains arrayOfTrain = new ArrayOfTrains();
    private String[] arrayOfName = new String[]{"Minsk", "Gdansk", "Belarus", "Vilnius", "Pinsk", "Vienna", "Bransk", "Montenegro", "Astana"};
    private int[] arrayDepartureTime = new int[]{23, 11, 24, 14, 12, 5, 8, 6, 2, 3};
    private int[] arrayNumberOfTrain = new int[]{88, 10, 99, 98, 10, 77, 12, 56, 12, 45};


    public ArrayOfTrains getRandomTrains(int size) {
        ArrayOfTrains newArrayOfTrains = new ArrayOfTrains();
        Train[] trains = new Train[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            trains[i] = new Train(arrayOfName[random.nextInt(8)], arrayDepartureTime[random.nextInt(6)], arrayNumberOfTrain[random.nextInt(8)]);
        }
        newArrayOfTrains.setTrains(trains);
        return newArrayOfTrains;
    }


    public ArrayOfTrains sortByNumberOfTrain(ArrayOfTrains arrayOfTrain) {
        ArrayOfTrains newArrayOfTrains = new ArrayOfTrains();
        for (int i = 0; i < arrayOfTrain.getLengthArrayOfTrains() - 1; i++) {
            for (int j = 0; j < arrayOfTrain.getLengthArrayOfTrains() - 1 - i; j++) {
                int curr = arrayOfTrain.getArrayOfTrain()[j].numberOfTrain;
                int curr_1 = arrayOfTrain.getArrayOfTrain()[j + 1].numberOfTrain;
                if (curr > curr_1) {
                    Train tmp = arrayOfTrain.getArrayOfTrain()[j];
                    arrayOfTrain.getArrayOfTrain()[j] = arrayOfTrain.getArrayOfTrain()[j + 1];
                    arrayOfTrain.getArrayOfTrain()[j + 1] = tmp;
                }

            }
        }
        return arrayOfTrain;
    }


    public ArrayOfTrains printInfoByNumber(ArrayOfTrains arrayOfTrain, int number) {
        ArrayOfTrains newArrayOfTrains = new ArrayOfTrains();
        int countTrain = 0;
        if (arrayOfTrain == null) {
            throw new IllegalArgumentException("Книги отсутствуют! (null)");
        }

        for (Train train : arrayOfTrain.getArrayOfTrain()) {

            if (train.getTrainNumber() == number) {
                countTrain++;

            }
        }
        if (countTrain > 0) {
            Train[] newTrain = new Train[countTrain];
            int k = 0;
            for (Train train : arrayOfTrain.getArrayOfTrain()) {
                if (train.getTrainNumber() == number) {
                    newTrain[k] = train;
                    k++;
                }
                arrayOfTrain.setTrains(newTrain);
            }

            return arrayOfTrain;
        }
        return arrayOfTrain=null;

    }


    public void sortByDestination(ArrayOfTrains arrayOfTrains) {
        int stringCompare;
        for (int i = 0; i < arrayOfTrains.getLengthArrayOfTrains() - 1; i++) {
            for (int j = 0; j < arrayOfTrains.getLengthArrayOfTrains() - i - 1; j++) {
                stringCompare = arrayOfTrains.getArrayOfTrain()[j].nameOfTheDestination.compareTo(arrayOfTrains.getArrayOfTrain()[j + 1].nameOfTheDestination);

                if (stringCompare > 0) {
                    Train temp;
                    temp = arrayOfTrains.getArrayOfTrain()[j];
                    arrayOfTrains.getArrayOfTrain()[j] = arrayOfTrains.getArrayOfTrain()[j + 1];
                    arrayOfTrains.getArrayOfTrain()[j + 1] = temp;
                } else {
                    if (stringCompare == 0) {
                        if (isIndexMoreThanIndex(j, j + 1, arrayOfTrains)) {
                            Train temp;
                            temp = arrayOfTrains.getArrayOfTrain()[j];
                            arrayOfTrains.getArrayOfTrain()[j] = arrayOfTrains.getArrayOfTrain()[j + 1];
                            arrayOfTrains.getArrayOfTrain()[j + 1] = temp;
                        }
                    }
                }
            }
        }
    }

    private boolean isIndexMoreThanIndex(int index1, int index2, ArrayOfTrains arrayOfTrain) {
        return (arrayOfTrain.getArrayOfTrain()[index1].departureTime > arrayOfTrain.getArrayOfTrain()[index2].departureTime);
    }
}

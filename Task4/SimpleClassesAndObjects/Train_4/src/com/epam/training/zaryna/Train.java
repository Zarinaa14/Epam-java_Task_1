package com.epam.training.zaryna;

/**
 * Создайте класс Train, содержащий поля:
 * название пункта назначения, номер поезда, время отправления.
 * Создайте данные в массив из пяти элементов типа Train,
 * добавьте возможность сортировки элементов массива по номерам поездов.
 * Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
 * Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами назначения
 * должны быть упорядочены по времени отправления.
 */
public class Train {
    private String nameOfTheDestination;
    private int numberOfTrain;
    private int departureTime;

    public Train() {
        nameOfTheDestination = "not found";
        departureTime = Integer.parseInt("00:00");
    }

    public Train(String nameOfTheDestination, int numberOfTrain, int departureTime) {
        this.nameOfTheDestination = nameOfTheDestination;
        this.numberOfTrain = numberOfTrain;
        this.departureTime = departureTime;
        //departureTime= Integer.parseInt("00:00");
    }

    public void setNameOfTheDestination(String nameOfTheDestination) {
        if (nameOfTheDestination != null && !nameOfTheDestination.isEmpty()) {
            this.nameOfTheDestination = nameOfTheDestination;
        }
    }

    public void setDepartureTime(int departureTime) {
        if (departureTime > 0) {
            departureTime = departureTime;
        }
    }

    public void setNumberOfTrain(int numberOfTrain) {
        if (numberOfTrain > 0) {
            numberOfTrain = numberOfTrain;
        }
    }

    public static Train[] sortByNumberOfTrain(Train[] arrayOfTrain) {
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

    public int getTrainNumber() {
        return numberOfTrain;
    }

    public static void printInfoByNumber(int number, Train[] arrayOfTrain) {
        for (int i = 0; i < arrayOfTrain.length; i++) {
            if (arrayOfTrain[i].getTrainNumber() == number) {
                arrayOfTrain[i].print();
            }
        }
    }

    public static void sortByDestination(Train[] arrayOfTrain) {
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
                        if (isIndex1moreInde2(j, j + 1, arrayOfTrain)) {
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

    private static boolean isIndex1moreInde2(int index1, int index2, Train[] arrayOfTrain) {
        if (arrayOfTrain[index1].departureTime > arrayOfTrain[index2].departureTime) {
            return true;
        } else {
            return false;
        }
    }

    public void print() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Пункт назаначения: " + nameOfTheDestination
                + ", номер поезда " + numberOfTrain
                + ", время вылета " + departureTime;
    }


}

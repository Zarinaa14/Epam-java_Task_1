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
    public String nameOfTheDestination;
    public int numberOfTrain;
    public int departureTime;

    public Train() {
        nameOfTheDestination = "not found";
        departureTime = 12;
    }

    public Train(String nameOfTheDestination, int numberOfTrain, int departureTime) {
        this.nameOfTheDestination = nameOfTheDestination;
        this.numberOfTrain = numberOfTrain;
        this.departureTime = departureTime;
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

    public int getTrainNumber() {
        return numberOfTrain;
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

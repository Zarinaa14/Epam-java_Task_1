package com.company.com.company.epam.training;
//2. Создать объект класса Автомобиль, используя классы Колесо, Двигатель.
// Методы: ехать, заправляться, менять колесо, вывести на консоль марку автомобиля.
public class Main {

    public static void main(String[] args) {
        WheelOfCar wheel1 = new WheelOfCar();
        Car car1 = new Car("BMW", 45, 240, wheel1);
        car1.engineTurnOn();
        car1.runCar(car1);
        car1.change2FirstWheelInCar(wheel1);
        car1.printCarWheel(wheel1);
        System.out.println("____________________________________________");
        WheelOfCar wheel2 = new WheelOfCar();
        Car car2 = new Car("Audi", 55, 180, wheel2);
        car2.runCar(car2);
        car2.change2SecondWheelInCar(wheel2);
        car2.printCarWheel(wheel2);

    }
}

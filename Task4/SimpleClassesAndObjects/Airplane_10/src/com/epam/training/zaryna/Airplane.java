package com.epam.training.zaryna;


/**  Создать класс Airplane, спецификация которого приведена ниже.
 Определить конструкторы, set- и get- методы и метод  toString().
 Создать второй класс, агрегирующий массив типа Airplane, с подходящими конструкторами и методами.
 Задать критерии выбора данных и вывести эти данные на консоль.

 Airplane: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
 Найти и вывести:
 a) список рейсов для заданного пункта назначения;
 b) список рейсов для заданного дня недели;
 c) список рейсов для заданного дня недели, время вылета для которых больше заданного. **/
public class Airplane {

    private String destination;
    private int flightNumber;
    private String planeType;
    private Time timeOfAppointment;
    private String day;
    public Airplane(){
        destination="";
        planeType="";
        flightNumber=1;
        timeOfAppointment=new Time(12,12,12);
        day="Monday";
    }
    public Airplane(String destination, int flightNumber, String planeType, Time timeOfAppointment, String days){
        setDestination(destination);
        setFlightNumber(flightNumber);
        setPlaneType(planeType);
        setTimeOfAppointment(timeOfAppointment);
        setDays(days);
    }
    public void setDestination(String destination) {
        if (destination != null && !destination.isEmpty()) {
            this.destination = destination;
        }
    }
    public void setFlightNumber(int flightNumber){
        if(flightNumber>0) {
            this.flightNumber = flightNumber;
        }
    }

    public void setPlaneType(String planeType){
        if (planeType != null && !planeType.isEmpty()) {
            this.planeType = planeType;
        }
    }
    public void setTimeOfAppointment(Time timeOfAppointment){
        this.timeOfAppointment=timeOfAppointment;
    }

    public void setDays(String day){
        this.day = day;
    }

    public int getFlightNumber(){
        return flightNumber;
    }

    public String getDestination(){
        return destination;
    }

    public Time getTimeOfAppointment(){
        return timeOfAppointment;
    }

    public String getDays(){
        return day;
    }

    public String getPlaneType(){
        return planeType;
    }

    public void print(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Destination: " + destination
                + ", flight number " + flightNumber
                + ", type of plane" + planeType
                + ", time: " + timeOfAppointment + ", day of the week " + day;
    }

    @Override
    public boolean equals(Object obj){
        if(obj == this){
            return true;
        }

        if(obj==null || obj.getClass() != this.getClass()){
            return false;
        }

        Airplane other=(Airplane) obj;
        return destination.equals(other.destination) && getDays().equals(other.day) &&
                timeOfAppointment.toString().equals(other.timeOfAppointment.toString()) && getPlaneType().equals(other.planeType);
    }

    @Override
    public int hashCode(){
        int number=10;
        int result=1;

        result=number+((destination==null)?0:destination.hashCode());
        result=number+flightNumber;
        result=number+planeType.hashCode();
        result=number+((timeOfAppointment==null)?0:timeOfAppointment.hashCode());
        result=number+((getDays()==null)?0:getDays().hashCode());

        return result;
    }
}


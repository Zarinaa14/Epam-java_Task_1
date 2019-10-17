package com.company;

/**  Создать класс Airline, спецификация которого приведена ниже.
 Определить конструкторы, set- и get- методы и метод  toString().
 Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и методами.
 Задать критерии выбора данных и вывести эти данные на консоль.

 Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
 Найти и вывести:
 a) список рейсов для заданного пункта назначения;
 b) список рейсов для заданного дня недели;
 c) список рейсов для заданного дня недели, время вылета для которых больше заданного. **/
public class Airline {

    private String destination;
    private int flightNumber;
    private String planeType;
    private String timeOfAppointment;
    private String days;
    public Airline(){
        destination="";
        planeType="";
    }
    public Airline(String destination,int flightNumber,String planeType,String timeOfAppointment,String days){
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
    public void setTimeOfAppointment(String timeOfAppointment){
        this.timeOfAppointment=timeOfAppointment;
    }

    public void setDays(String day){
        this.days = day;
        }

    public int getFlightNumber(){
        return flightNumber;
    }

    public String getDestination(){
        return destination;
    }

    public String getTimeOfAppointment(){
        return timeOfAppointment;
    }

    public String getDays(){
        return days;
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
                + ", time: " + timeOfAppointment + ", day of the week " + days;
    }

    @Override
    public boolean equals(Object obj){
        if(obj == this){
            return true;
        }

        if(obj==null || obj.getClass() != this.getClass()){
            return false;
        }

        Airline other=(Airline) obj;
        return destination.equals(other.destination) && getDays().equals(other.days) &&
                timeOfAppointment.toString().equals(other.timeOfAppointment.toString()) && getPlaneType().equals(other.planeType);
    }

    @Override
    public int hashCode(){
        int number=31;
        int result=1;

        result=number+((destination==null)?0:destination.hashCode());
        result=number+flightNumber;
        result=number+planeType.hashCode();
        result=number+((timeOfAppointment==null)?0:timeOfAppointment.hashCode());
        result=number+((getDays()==null)?0:getDays().hashCode());

        return result;
    }
}

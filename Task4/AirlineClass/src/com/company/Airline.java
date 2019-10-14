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
    protected void setDestination(String destination) {
        if (destination != null && !destination.isEmpty()) {
            this.destination = destination;
        }
    }
    protected void setFlightNumber(int flightNumber){
        if(flightNumber>0) {
            this.flightNumber = flightNumber;
        }
    }

    protected void setPlaneType(String planeType){
        if (planeType != null && !planeType.isEmpty()) {
            this.planeType = planeType;
        }
    }
    protected void setTimeOfAppointment(String timeOfAppointment){
        this.timeOfAppointment=timeOfAppointment;
    }

    protected void setDays(String day){
        this.days = day;
        }

    protected int getFlightNumber(){
        return flightNumber;
    }

    protected String getDestination(){
        return destination;
    }

    protected String getTimeOfAppointment(){
        return timeOfAppointment;
    }

    protected String getDays(){
        return days;
    }

    protected String getPlaneType(){
        return planeType;
    }

    protected void print(){
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

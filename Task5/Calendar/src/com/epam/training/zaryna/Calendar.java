package com.epam.training.zaryna;

import java.util.ArrayList;

public class Calendar {

    private ArrayList<DateOfCalendar> dates=new ArrayList<DateOfCalendar>();

    public Calendar(){

    }

    public void addDate(int year,int month,int day){
        dates.add(new DateOfCalendar(year,month,day));
    }
    public void addHoliday(String name,int year,int month,int day){
        dates.add(new Holiday(name,year,month,day));
    }

    public void addDayOff(int year,int month,int day){
        dates.add(new DayOff(year,month,day));
    }

    public void deleteDate(int index){
        if(index>=0 && index<dates.size()){
            dates.remove(index);
        }
    }

    public void getDate(int index){
        if(index>=0 && index<dates.size()){
            dates.get(index);
        }
    }
    public void sortDate(DateOfCalendar dateOfCalendar){

    }

    public void print(){
        System.out.println(toString());
    }

    @Override
    public String toString(){
            StringBuilder string = new StringBuilder();
            for (int i = 0; i < dates.size(); i++) {
                string.append(i + 1);
                string.append(" ");
                string.append(dates.get(i));
                string.append("\n");
            }

            return string.toString();
    }

    @Override
    public boolean equals(Object obj){
        if(obj == this){
            return true;
        }

        if(obj==null || obj.getClass() != this.getClass()){
            return false;
        }

        Calendar other=(Calendar) obj;

        boolean isEqual= (dates.size() == other.dates.size());

        for(int i=0;isEqual && i<dates.size();i++){
            if(!dates.get(i).equals(other.dates.get(i))){
                isEqual=false;
            }
        }

        return isEqual;
    }

    @Override
    public int hashCode(){
        final int prime=31;
        int result=1;

        for(DateOfCalendar date:dates){
            result=prime*result+date.hashCode();
        }

        return result;
    }
}

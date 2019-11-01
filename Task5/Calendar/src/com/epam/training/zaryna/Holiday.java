package com.epam.training.zaryna;

public class Holiday extends DateOfCalendar {
    private String holidayName;

    public Holiday(String name,int year,int month,int day){
        super(year, month, day);
        holidayName=name;
    }

    public void setHolidayName(String name){
        this.holidayName=name;
    }

    public String getHolidayName(){
        return holidayName;
    }

    @Override
    public String toString(){
        return super.toString()+"  Today is a holiday!!!";
    }
}

package com.epam.training.zaryna;

public class DayOff extends DateOfCalendar {
    public DayOff(int year, int month, int day){
        super(year, month, day);
        super.setDayOff();
    }
}

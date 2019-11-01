package com.epam.training.zaryna;

public class DateOfCalendar {

    private int year;
    private int day;
    private int month;
    private int dayOfWeek;
    private boolean isDayOff;

    public DateOfCalendar() {

    }

    public DateOfCalendar(int year, int month, int day) {
        setYear(year);
        setMonth(month);
        setDay(day);
    }

    public void setYear(int year) {
        if (year >= 1600 && year <= 2200) {
            this.year = year;
        }
    }

    public void setMonth(int month) {
        if (month >= 1 && month <= 12) {
            this.month = month;
        }
    }

    public void setDayOfWeek(int dayOfWeek) {
        if (dayOfWeek >= 1 && dayOfWeek <= 7) {
            this.dayOfWeek = dayOfWeek;
        }
    }

    public void setDay(int day) {
        int fullDayInMonth=getNumberOfMonth(this.year,this.month);
        if (day >= 1 && day <= fullDayInMonth) {
            this.day = day;
        }
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public int getDay() {
        return day;
    }

    public int getDayOfWeek() {
        return dayOfWeek;
    }

    protected void setDayOff() {
        isDayOff = true;
    }



    public int getNumberOfMonth(int year, int month) {

        if (month == 1 || month == 3 || month == 5 || month == 7 ||

                month == 8 || month == 10 || month == 12)

            return 31;

        if (month == 4 || month == 6 || month == 9 || month == 11)

            return 30;

        if (month == 2) return isLeapYear(year) ? 29 : 28;

        return 0; // If month is incorrect

    }


    public int getTotalNumberInYear(int year) {

        int total = 0;

        if (isLeapYear(year)) {
            total = total + 366;
        } else {
            total = total + 365;
        }
        return total;

    }

    static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }

    public String getMonthName(int month) {

        String monthName = null;

        switch (month) {

            case 1:
                monthName = "January";
                break;

            case 2:
                monthName = "February";
                break;

            case 3:
                monthName = "March";
                break;

            case 4:
                monthName = "April";
                break;

            case 5:
                monthName = "May";
                break;

            case 6:
                monthName = "June";
                break;

            case 7:
                monthName = "July";
                break;

            case 8:
                monthName = "August";
                break;

            case 9:
                monthName = "September";
                break;

            case 10:
                monthName = "October";
                break;

            case 11:
                monthName = "November";
                break;

            case 12:
                monthName = "December";

        }

        return monthName;

    }
    
    public int divisionWithoutRemainder(int x, int y){
        int result;
        result = (x - (x % y)) / y;
        return result;
    }

    public int getDayOfWeek(int year, int month, int day){
        int a = divisionWithoutRemainder((14 - month), 12);
        int y = year - a;
        int m = month + 12 * a - 2;
        int y4 = divisionWithoutRemainder(y, 4);
        int y100 = divisionWithoutRemainder(y, 100);
        int y400 = divisionWithoutRemainder(y, 400);
        int x = divisionWithoutRemainder(31 * m, 12);
        int dayOfWeek = (day + y + y4 - y100 + y400 + x) % 7;
        return dayOfWeek;
    }

    public String getNameOfWeek(int day) {

        String dayName = null;

        switch (day) {

            case 1:
                dayName = "Monday";
                break;

            case 2:
                dayName = "Tuesday";
                break;

            case 3:
                dayName = "Wednesday";
                break;

            case 4:
                dayName = "Thursday";
                break;

            case 5:
                dayName = "Friday";
                break;

            case 6:
                dayName = "Saturday";
                break;

            case 0:
                dayName = "Sunday";
                break;
        }

        return dayName;

    }
    public void print() {
        System.out.println(toString());
    }
    @Override
    public String toString() {

        return (day < 10 ? "0" : "") + day + "." + (month < 10 ? "0" : "") + month + "." + year + "   " + "   " + (isDayOff ? "weekends! " : "Sorry, is working day.")+(isLeapYear(this.year) ?  " Leap year " : " not Leap year.");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        DateOfCalendar dateOfCalendar = (DateOfCalendar) obj;

        return year == dateOfCalendar.year && month == dateOfCalendar.month && day == dateOfCalendar.day;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + year;
        result = prime * result + month;
        result = prime * result + day;

        return result;
    }

    public int compareTo(DateOfCalendar ob) {
        if (ob.getYear() > this.getYear()) {
            return 1;
        }
        if (ob.getYear() < this.getYear()) {
            return -1;
        }
        if ((ob.getYear() == this.getYear())) {
            if (ob.getMonth() > this.getMonth()) {
                return 1;
            }

            if (ob.getMonth() < this.getMonth()) {
                return -1;
            }

            if ((ob.getMonth() == this.getMonth())) {
                if (ob.getDay() > this.getDay()) {
                    return 1;
                }

                if (ob.getDay() < this.getDay()) {
                    return -1;
                }
            }
        }


        return 0;
    }
}

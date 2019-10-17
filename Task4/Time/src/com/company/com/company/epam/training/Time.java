package com.company.com.company.epam.training;

/**
 Класс для представления времени.
 Возможности:
 1) Установка времени с помощью строки/числа часов, мин, сек
 2) Изменение времени на заданное число часов, минут, сек
 3) Вывод времени
 **/

public class Time {

    private int hours;
    private int minutes;
    private int seconds;

    public Time() {

    }
    public Time(int hours, int minutes, int seconds) {
        setTime(hours, minutes, seconds);
    }


    //Время установится, если формат и значения времени верны
    public boolean isRightTime(int hour, int minute, int second){
        if ((hour > 0 && hour < 25) || (minute > 0 && minute < 61) || (second > 0 && second < 61))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    //Время установится, если верны переданные значения часов, минут, секунд
    public void setTime(int hours, int minutes, int seconds){
        if(isRightTime(hours, minutes, seconds)) {
            this.hours = hours;
            this.minutes = minutes;
            this.seconds = seconds;

        }else{
            setZero();
        }

    }
    public String getTimeObject(Time ob){
        return ob.toString();

    }

    public void setHours(int hours){
        if(hours>=0 && hours <24){
            this.hours=hours;
        }else{
            setZero();
        }
    }

    public void setMinutes(int minutes){
        if(minutes>=0 && minutes<60){
            this.minutes=minutes;
        }else{
            setZero();
        }
    }

    public void setSeconds(int seconds){
        if(seconds>=0 && seconds<60){
            this.seconds=seconds;
        }else{
            setZero();
        }
    }
    public int getHours() {
        return hours;

    }

    public int getMinutes() {
        return minutes;

    }

    public int getSeconds() {
        return seconds;

    }

    public void addHours(int hours){
        if(hours>0) {
            this.hours = (this.hours + hours) % 24;
        }
    }

    public void addMinutes(int minutes){
        if(minutes>0) {
            this.minutes += minutes;
            this.hours = (this.hours + this.minutes / 60) % 24;
            this.minutes %= 60;
        }
    }

    public void addSeconds(int seconds){
        if(seconds>0) {
            this.seconds += seconds;
            this.minutes = (this.minutes + this.seconds / 60);
            this.hours = (this.hours + this.minutes / 60) % 24;
            this.minutes %= 60;
            this.seconds %= 60;
        }
    }

    @Override
    public String toString(){
        return ((hours<=9)?"0"+hours:hours)+":"+((minutes<=9)?"0"+minutes:minutes)+":"+((seconds<=9)?"0"+seconds:seconds);
    }

    private int setZero(){
        return 0;
    }
}

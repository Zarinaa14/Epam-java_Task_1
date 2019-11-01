package com.epam.training.zaryna;

public class Time {

    private int hours;
    private int minutes;
    private int seconds;

    public Time() {
        hours = 00;
        minutes = 00;
        seconds = 00;
    }

    public Time(int hours, int minutes, int seconds) {
        setTime(hours, minutes, seconds);
    }


    //Время установится, если формат и значения времени верны
    public boolean isRightTime(int hour, int minute, int second) {
        return ((hour > 0 && hour < 25) || (minute > 0 && minute < 61) || (second > 0 && second < 61));
    }

    //Время установится, если верны переданные значения часов, минут, секунд
    public void setTime(int hours, int minutes, int seconds) {
        if (isRightTime(hours, minutes, seconds)) {
            this.hours = hours;
            this.minutes = minutes;
            this.seconds = seconds;

        } else {
            setZero();
        }

    }

    public String getTimeObject(Time ob) {
        return ob.toString();

    }

    public void setHours(int hours) {
        if (hours >= 0 && hours < 24) {
            this.hours = hours;
        } else {
            setZero();
        }
    }

    public void setMinutes(int minutes) {
        if (minutes >= 0 && minutes < 60) {
            this.minutes = minutes;
        } else {
            setZero();
        }
    }

    public void setSeconds(int seconds) {
        if (seconds >= 0 && seconds < 60) {
            this.seconds = seconds;
        } else {
            setZero();
        }
    }

    private int getHours() {
        return hours;

    }

    private int getMinutes() {
        return minutes;

    }

    private int getSeconds() {
        return seconds;

    }

    private void addHours(int hours) {
        if (hours > 0) {
            this.hours = (this.hours + hours) % 24;
        }
    }

    private void addMinutes(int minutes) {
        if (minutes > 0) {
            this.minutes += minutes;
            this.hours = (this.hours + this.minutes / 60) % 24;
            this.minutes %= 60;
        }
    }

    private void addSeconds(int seconds) {
        if (seconds > 0) {
            this.seconds += seconds;
            this.minutes = (this.minutes + this.seconds / 60);
            this.hours = (this.hours + this.minutes / 60) % 24;
            this.minutes %= 60;
            this.seconds %= 60;
        }
    }

    @Override
    public String toString() {
        return ((hours <= 9) ? "0" + hours : hours) + ":" + ((minutes <= 9) ? "0" + minutes : minutes) + ":" + ((seconds <= 9) ? "0" + seconds : seconds);
    }

    private int setZero() {
        return 0;
    }

    public int compareTo(Time ob) {
        if (ob.getHours() > this.getHours()) {
            return 1;
        }
        if (ob.getHours() < this.getHours()) {
            return -1;
        }
        if ((ob.getHours() == this.getHours())) {
            if (ob.getMinutes() > this.getMinutes()) {
                return 1;
            }

            if (ob.getMinutes() < this.getMinutes()) {
                return -1;
            }

            if ((ob.getMinutes() == this.getMinutes())) {
                if (ob.getSeconds() > this.getSeconds()) {
                    return 1;
                }

                if (ob.getSeconds() < this.getSeconds()) {
                    return -1;
                }
            }
        }


        return 0;
    }
}

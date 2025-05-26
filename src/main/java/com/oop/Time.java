package com.oop;

/**
 * The Time class models a time instance with second, minute and hour.
 * This class does not perform input validation for second, minute and hour
 */
public class Time {
    private int second = 0;
    private int minute = 0;
    private int hour = 0;

    public Time() {
    }

    public Time(int second, int minute, int hour) {
        this.second = second;
        this.minute = minute;
        this.hour = hour;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public void setTime (int second, int minute, int hour) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public Time nextSecond() {
        ++second;
        if (second >= 60) {
            second = 0;
            ++minute;
            if (minute >= 60) {
                minute = 0;
                ++hour;
                if (hour >= 24) {
                    hour = 0;
                }
            }
        }
        return this;
    }
}

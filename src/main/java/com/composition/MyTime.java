package com.composition;

import com.oop.Time;

public class MyTime {
    private int hour;
    private int minute;
    private int second;

    public MyTime() {
    }

    public MyTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setTime(int hour, int minute, int second) {
        if ((hour < 0 || hour > 23 || minute < 0 || minute > 59 || second < 0 || second > 59))
            System.out.println("Invalid time");
        else {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        }
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour < 0 || hour > 23) System.out.println("Hour must be between 0 and 23 inclusive");
        else
            this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (minute < 0 || minute > 59) System.out.println("Minute must be between 0 and 59 inclusive");
        else
            this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if (second < 0 || second > 59) System.out.println("Second must be between 0 and 59 inclusive");
        else
            this.second = second;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public MyTime nextSecond() {
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

    public MyTime nextMinute() {
        ++minute;
        if (minute >= 60) {
            minute = 0;
            ++hour;
            if (hour >= 24) {
                hour = 0;
            }
        }
        return this;
    }

    public MyTime nextHour() {
        ++hour;
        if (hour >= 24) {
            hour = 0;
        }
        return this;
    }

    public MyTime previousSecond() {
        --second;
        if (second < 0) {
            second = 59;
            --minute;
            if (minute < 0) {
                minute = 59;
                --hour;
                if (hour < 0) {
                    hour = 23;
                }
            }
        }
        return this;
    }

    public MyTime previousMinute() {
        --minute;
        if (minute < 0) {
            minute = 59;
            --hour;
            if (hour < 0) {
                hour = 23;
            }
        }
        return this;
    }

    public MyTime previousHour() {
        --hour;
        if (hour < 0) {
            hour = 23;
        }
        return this;
    }



}

package com.jdbc.mysql.busReservation;

public class Bus {
    private int busNo;
    private boolean isAc;
    private int capacity;

    public Bus(int busNo, boolean isAc, int capacity) {
        this.busNo = busNo;
        this.isAc = isAc;
        this.capacity = capacity;
    }

    public int getBusNo() {
        return busNo;
    }

    public boolean isAc() {
        return isAc;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setBusNo(int busNo) {
        this.busNo = busNo;
    }

    public void setAc(boolean ac) {
        isAc = ac;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

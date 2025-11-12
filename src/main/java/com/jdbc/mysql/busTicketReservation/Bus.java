package com.jdbc.mysql.busTicketReservation;

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

    public void setAc(boolean isAc) {
        this.isAc = isAc;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return String.format("Bus number=%d,Air-conditioned=%b,Capacity=%d", getBusNo(), isAc(), getCapacity());
    }
}

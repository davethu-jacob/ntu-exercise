package com.javabrains;

class MotorVehicle {
    private int seats;

    public void run() {
        System.out.println("run method in MotorVehicle class: " + seats);
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }
}

class SportsVehicle extends MotorVehicle {
    @Override
    public void run() {
        System.out.println("run method in SportsVehicle: " + getSeats());
    }
}
public class EncapsulationRevisited {
    public static void main(String[] args) {
        MotorVehicle mv = new MotorVehicle();
        mv.setSeats(5);
        mv.run();
        SportsVehicle sv = new SportsVehicle();
        sv.setSeats(2);
        sv.run();
    }

}

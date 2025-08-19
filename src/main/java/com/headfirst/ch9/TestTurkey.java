package com.headfirst.ch9;

class Turkey {
    private int kilos = 6;
    private float floatability = 2.1F;
    private String name = "Generic";
    private long[] feathers = {1, 2, 3, 4, 5, 6, 7};
    private boolean canFly = true;
    private int maxSpeed = 25;

    public Turkey() {
        System.out.println("Type 1 Turkey");
    }

    public Turkey(boolean canFly) {
        this.canFly = canFly;
        System.out.println("Type 2 Turkey");
    }

    public Turkey(String name, long[] feathers) {
        this.name = name;
        this.feathers = feathers;
        System.out.println("Type 3 Turkey");
    }

    public Turkey(int kilos, float floatability) {
        this.kilos = kilos;
        this.floatability = floatability;
        System.out.println("Type 4 Turkey");
    }

    public Turkey(float floatability, int maxSpeed) {
        this.floatability = floatability;
        this.maxSpeed = maxSpeed;
        System.out.println("Type 5 Turkey");
    }

}
public class TestTurkey {
    public static void main(String[] args) {
        int weight = 8;
        float density = 2.3F;
        String name = "Donald";
        long[] feathers = {1, 2, 3, 4, 5, 6};
        boolean canFly = true;
        int airSpeed = 22;

        Turkey[] t = new Turkey[7];
        t[0] = new Turkey();
        t[1] = new Turkey(density, weight);
        t[2] = new Turkey(name, feathers);
        t[3] = new Turkey(canFly);
        t[4] = new Turkey(3.3F, airSpeed);
        t[5] = new Turkey(false);
        t[6] = new Turkey(airSpeed, density);
    }
}

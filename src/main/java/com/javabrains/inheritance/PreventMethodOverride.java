package com.javabrains.inheritance;

class Dog extends Pet {

    // This is the final implementation of the move() method
    @Override
    public final void move() {
        System.out.println("I am a Dog");
    }
}

class WildDog extends Dog {

}
/* You cannot override the method move() since it has been made final
class WildDog extends Dog {
    public void move() {

    }
}

 */

public class PreventMethodOverride {
    public static void main(String[] args) {
        WildDog wd = new WildDog();
        wd.move();
    }
}

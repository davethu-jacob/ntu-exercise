package com.ntu.interfacetutorial.ex61;

public class TestShape {
    public static void main(String[] args) {
//  Shape is abstract class and cannot be instantiated.
//        Shape s0 = new Shape();

// Important facts:
// 1. Object reference variable can point to an object of the same class or an object of subclass
// 2. If an Object reference variable is pointing to an object of a subclass, only methods inherited or overriden
//	  from the super class will be available.
// 3. The object variable type determines what methods we can call from the variable
// 4. The object type determines what version of the method gets run

        // Upcast Circle to Shape
        Shape s1 = new Circle("red", false, 5.5);
        System.out.println(s1);
        System.out.println(s1.getArea());
        System.out.println(s1.getPerimeter());
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());

        // Since s1 reference variable is pointing to an object of a subclass, only methods inherited
        // or overridden can be accessed
//        System.out.println(s1.getRadius());

        // Downcast back to Circle
        Circle c1 = (Circle) s1;
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(s1.isFilled());
        System.out.println(c1.getRadius());

        Circle c2 = new Circle("blue", true, 5.5);
        System.out.println(c2);
        System.out.println(c2.getArea());
        System.out.println(c2.getPerimeter());
        System.out.println(c2.getColor());
        System.out.println(c2.isFilled());
        System.out.println(c2.getRadius());

        // upcast Rectangle to Shape
        Shape s2 = new Rectangle("yellow", true,1.0, 2.0);
        System.out.println(s2);
        System.out.println(s2.getArea());
        System.out.println(s2.getPerimeter());
        System.out.println(s2.getColor());

        // Since s2 reference variable is pointing to an object of a subclass, only methods inherited
        // or overridden can be accessed

//        System.out.println(s2.getLength());

        // Downcast back to Rectangle
        Rectangle r1 = (Rectangle) s2;
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getPerimeter());
        System.out.println(r1.getColor());
        System.out.println(r1.getWidth());
        System.out.println(r1.getLength());

        Shape s3 = new Square(6);
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColor());

        // Since s3 reference variable is pointing to an object of a subclass, only methods inherited
        // or overridden can be accessed
//        System.out.println(s3.getSide());

        Rectangle r2 = (Rectangle) s3;
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getPerimeter());
        System.out.println(r2.getColor());
        System.out.println(r2.getLength());

//        System.out.println(r2.getSide());

        Square sq1 = (Square) r2;
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getPerimeter());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getLength());

        System.out.println(sq1.getSide());

    }
}

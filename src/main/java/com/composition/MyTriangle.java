package com.composition;

public class MyTriangle {
    private final MyPoint v1;
    private final MyPoint v2;
    private final MyPoint v3;

    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        v1 = new MyPoint(x1, y1);
        v2 = new MyPoint(x2, y2);
        v3 = new MyPoint(x3, y3);
    }

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    @Override
    public String toString() {
        return String.format("MyTriangle[v1=%s,v2=%s,v3=%s]", v1, v2, v3);
    }

    public double getPerimeter() {
        double l1 = v1.distance(v2);
        double l2 = v2.distance(v3);
        double l3 = v3.distance(v1);
        System.out.println("Length l1: " + l1);
        System.out.println("Length l2: " + l2);
        System.out.println("Length l3: " + l3);
        return l1 + l2 + l3;
    }

    public String getType() {
        Double l1 = v1.distance(v2);
        Double l2 = v2.distance(v3);
        Double l3 = v3.distance(v1);
        String type = "Scalene";
        System.out.println(l1.equals(l2));
        System.out.println(l2.equals(l3));
        System.out.println(l3.equals(l1));
        if (l1.equals(l2) && l2.equals(l3) && l3.equals(l1)) {
            type = "Equilateral";
        } else if (l1.equals(l2) || l2.equals(l3) || l3.equals(l1)) {
            type = "Isosceles";
        }
        return type;
    }
}


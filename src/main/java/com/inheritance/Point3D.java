package com.inheritance;

public class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        setXY(x, y);
        this.z = z;
    }

    public float[] getXYZ() {
        float[] coordinate = new float[3];
        coordinate[0] = super.getX();
        coordinate[1] = super.getY();
        coordinate[2] = z;
        return coordinate;
    }

    @Override
    public String toString() {
        return String.format("(%.2f,%.2f,%.2f)", super.getX(), super.getY(), z);
    }
}


package com.ntu.composition.eg2;

public class Line {
    private Point begin;
    private Point end;

    public Line(Point begin, Point end) {
        this.begin = begin;
        this.end = end;
    }

    public Line(int x1, int y1, int x2, int y2) {
        begin = new Point(x1, y1);
        end = new Point(x2, y2);
    }

    public Point getBegin() {
        return begin;
    }

    public void setBegin(Point begin) {
        this.begin = begin;
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public int getBeginX() {
        return begin.getX();
    }

    public void setBeginX(int x) {
        begin.setX(x);
    }

    public int getBeginY() {
        return begin.getY();
    }

    public void setBeginY(int y) {
        begin.setY(y);
    }

    public int[] getBeginXY() {
        int[] result = new int[2];
        result[0] = begin.getX();
        result[1] = begin.getY();
        return result;
    }

    public void setBeginXY(int x, int y) {
        begin.setXY(x, y);
    }

    public int getEndX() {
        return end.getX();
    }

    public void setEndX(int x) {
        end.setX(x);
    }

    public int getEndY() {
        return end.getY();
    }

    public void setEndY(int y) {
        end.setY(y);
    }

    public int[] getEndXY() {
        int[] result = new int[2];
        result[0] = end.getX();
        result[1] = end.getY();
        return result;
    }

    public void setEndXY(int x, int y) {
        end.setXY(x, y);
    }

    @Override
    public String toString() {
        return String.format("Line[begin=%s,end=%s]", begin.toString(), end.toString());
    }

    public double getLength() {
        int xDiff = end.getX() - begin.getX();
        int yDiff = end.getY() - begin.getY();
        return Math.sqrt(Math.pow(xDiff, 2) + Math.pow(yDiff, 2));
    }
}

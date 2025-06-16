package com.compositionVsInheritance;

public class LineSub extends Point{
    private Point end;

    public LineSub(int beginX, int beginY, int endX, int endY) {
        super(beginX, beginY);
        this.end = new Point(endX, endY);
    }

    public LineSub(Point begin, Point end) {
        super(begin.getX(), begin.getY());
        this.end = end;
    }

    public Point getBegin() {

    }

    @Override
    public String toString() {
        return String.format("Line[begin=(%d,%d),end=(%d,%d)]", super.getX(), super.getY(), end.getX(), end.getY());
    }
}

package com.compositionVsInheritance;

public class LineSub extends Point {
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
        return new Point(getX(), getY());
    }

    public void setBegin(int x, int y) {
        setXY(x, y);
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    @Override
    public String toString() {
        return String.format("Line[begin=(%d,%d),end=(%d,%d)]", super.getX(), super.getY(), end.getX(), end.getY());
    }
}

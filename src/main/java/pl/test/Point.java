package pl.test;

import java.lang.Math;
/**
 * Created by jakubwrabel on 05.01.2017.
 */
public class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point getCenterPoint(Point point) {
        int xCenter = (x + point.getX()) / 2;
        int yCenter = (y + point.getY()) / 2;

        return new Point(xCenter, yCenter);
    }

    public double distance(Point point) {
        return Math.sqrt(Math.pow(x - point.getX(), 2) + Math.pow(y - point.getY(), 2));
    }




    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

package pl.test;

/**
 * Created by jakubwrabel on 05.01.2017.
 */
public class Rectangle {
    Point point1;
    Point point2;


    public boolean crossing(Rectangle rectangle) {

//        Optional.ofNullable(1).filter(x -> x >= 18).map( age -> "").orElseGet("Bla");
//        Optional.ofNullable(1).ifPresent(System.out::println);

        return false;
    }

    public boolean contains(Rectangle rectangle) {
        return false;
    }

    public Rectangle commonField(Rectangle rectangle) {


        return null;
    }

    public double centersDistance(Rectangle rectangle) {
        Point centerPoint1 = getCenterPoint();
        Point centerPoint2 = rectangle.getCenterPoint();

        return centerPoint1.distance(centerPoint2);
    }

    public Point getCenterPoint() {
        return point1.getCenterPoint(point2);
    }
}

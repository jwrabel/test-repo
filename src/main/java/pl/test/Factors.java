package pl.test;

/**
 * Created by RENT on 2017-01-05.
 */
public class Factors {
    int x;
    int y;

    public Factors(int x, int y) {
        this.x = x;
        this.y = y;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Factors factors = (Factors) o;

        if (x != factors.x) return false;
        return y == factors.y;
    }

}

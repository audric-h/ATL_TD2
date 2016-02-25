package esi.atl.g39121.td2;

/**
 * Created by audric on 25.02.16.
 */
public class Point {
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point p) {
        this.x = p.getX();
        this.y = p.getY();
    }

    public void move(int x, int y) {
        this.x += x;
        this.y += y;
    }

    public double distanceTo(Point point) {
        return Math.sqrt((point.getX()-this.x)*(point.getX()-this.x) +
                         (point.getY()-this.y)*(point.getY()-this.y));
    }
}

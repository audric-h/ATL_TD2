package esi.atl.g39121.td2;

/**
 * Created by audric on 25.02.16.
 */
public interface Shape {
    boolean isInside(Point p);
    void move(int x, int y);
    char getColor();
}

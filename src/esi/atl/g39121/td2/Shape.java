package esi.atl.g39121.td2;

/**
 * Représente une forme d'un repere (X:Y).
 */
public interface Shape {
    boolean isInside(Point p);
    void move(int x, int y);
    char getColor();
}

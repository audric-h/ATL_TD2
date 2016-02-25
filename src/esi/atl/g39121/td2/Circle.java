package esi.atl.g39121.td2;

/**
 * Created by audric on 25.02.16.
 */
public class Circle extends ColoredShape {
    private Point center;
    private int rayon;

    public Circle(Point p, int r, char c) {
        super(c);
        this.center = p;
        this.rayon = r;
    }

    @Override
    public boolean isInside(Point p) {
        return ( center.distanceTo(p) <= rayon );
    }

    @Override
    public void move(int x, int y) {
        center.move(x,y);
    }
}

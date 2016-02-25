package esi.atl.g39121.td2;

/**
 * Created by audric on 25.02.16.
 */
public class Rectangle extends ColoredShape{
    private Point upperLeft;
    int largeur;
    int hauteur;

    public Rectangle(Point upperLeft, int largeur, int hauteur, char c) {
        super(c);
        this.upperLeft = upperLeft;
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    @Override
    public boolean isInside(Point p) {
        return ( (upperLeft.getX() <= p.getX() && upperLeft.getX()+largeur > p.getX()) &&
                 (upperLeft.getY() <= p.getY() && upperLeft.getY()+hauteur > p.getY()));
    }

    @Override
    public void move(int x, int y) {

    }
}

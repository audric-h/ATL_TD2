package esi.atl.g39121.td2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by audric on 25.02.16.
 */
public class Drawing {
    private List<Shape> shapes = new ArrayList<>();
    private int hauteur;
    private int largeur;

    public Drawing() {
        hauteur = 10;
        largeur = 10;
    }

    public Drawing(int hauteur, int largeur) {
        this.hauteur = hauteur;
        this.largeur = largeur;
    }

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    Shape getShapeAt(Point p) {
        for(Shape s : shapes) {
            if(s.isInside(p)) return s;
        }
        return null;
    }

    public int getHauteur() {
        return hauteur;
    }

    public int getLargeur() {
        return largeur;
    }
}

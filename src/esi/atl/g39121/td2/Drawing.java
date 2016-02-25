package esi.atl.g39121.td2;

import java.util.ArrayList;
import java.util.List;

/**
 * Représente la partie du repère que l'on veut représenté?
 */
public class Drawing {
    private List<Shape> shapes = new ArrayList<>();
    private int hauteur;
    private int largeur;

    /**
     * <p>Constructeur par défaut.</p>
     * La hauteur et la largeur du repère est fixée a 10.
     */
    public Drawing() {
        hauteur = 10;
        largeur = 10;
    }

    /**
     * Constructeur.
     * @param hauteur La hauteur du repère.
     * @param largeur La largeur du repère.
     */
    public Drawing(int hauteur, int largeur) {
        this.hauteur = hauteur;
        this.largeur = largeur;
    }

    /**
     * Ajoute une forme dans le repère.
     * @param shape La forme à ajouter.
     */
    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    /**
     * Retourne la {@link Shape} présente dans le repere au {@link Point} souhaité.
     * @param p Le {@link Point} pour lequelle on souhaite la {@link Shape}.
     * @return La {@link Shape} présente un {@link Point}, ou null si il n'y en a aucune.
     */
    Shape getShapeAt(Point p) {
        for(Shape s : shapes) {
            if(s.isInside(p)) return s;
        }
        return null;
    }

    /**
     * Accesseur.
     * @return La hauteur du repère.
     */
    public int getHauteur() {
        return hauteur;
    }

    /**
     * Accesseur.
     * @return La largeur du repère.
     */
    public int getLargeur() {
        return largeur;
    }
}

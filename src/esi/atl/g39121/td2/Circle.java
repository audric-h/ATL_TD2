package esi.atl.g39121.td2;

/**
 * Représente un cercle.
 */
public class Circle extends ColoredShape {
    private Point center;
    private int rayon;

    /**
     * Constructeur.
     * @param p Le centre du cercle.
     * @param r Le rayon du cercle.
     * @param c Le charactère représentant le cercle.
     */
    public Circle(Point p, int r, char c) {
        super(c);
        this.center = p;
        this.rayon = r;
    }

    /**
     * Vérifie si un {@link Point} se trouve à l'intérieur du cercle.
     * @param p Le {@link Point} à vérifier.
     * @return true si le {@link Point} se trouve à l'intérieur, false sinon.
     */
    @Override
    public boolean isInside(Point p) {
        return ( center.distanceTo(p) <= rayon );
    }

    /**
     * Déplace le cercle.
     * @param x Le déplacement en X à effectuer.
     * @param y Le déplacement en Y à effectuer.
     */
    @Override
    public void move(int x, int y) {
        center.move(x,y);
    }
}

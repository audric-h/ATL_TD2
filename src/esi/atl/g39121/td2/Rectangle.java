package esi.atl.g39121.td2;

/**
 * Représente un rectangle.
 */
public class Rectangle extends ColoredShape{
    private Point upperLeft;
    int largeur;
    int hauteur;

    /**
     * Constructeur.
     * @param upperLeft Le {@link Point} en haut a gauche du rectangle.
     * @param largeur La largeur du rectangle.
     * @param hauteur La hauteur du rectangle.
     * @param c Le charactere qui représente un point du rectangle.
     */
    public Rectangle(Point upperLeft, int largeur, int hauteur, char c) {
        super(c);
        this.upperLeft = upperLeft;
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    /**
     * Retourne un boolean qui indique si un {@link Point} si trouve a l'intérieur ou à l'extérieur du rectangle.
     * @param p Le {@link Point} à vérifier.
     * @return true si le {@link Point} se trouve à l'intérieur du rectangle, false sinon.
     */
    @Override
    public boolean isInside(Point p) {
        return ( (upperLeft.getX() <= p.getX() && upperLeft.getX()+largeur > p.getX()) &&
                 (upperLeft.getY() <= p.getY() && upperLeft.getY()+hauteur > p.getY()));
    }

    /**
     * Déplace le rectangle.
     * @param x Le déplacement en X à effectuer.
     * @param y Le déplacement en Y à efefctuer.
     */
    @Override
    public void move(int x, int y) {

    }
}

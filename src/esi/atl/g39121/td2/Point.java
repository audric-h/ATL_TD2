package esi.atl.g39121.td2;

/**
 * <p>Un point est représenté dans un repere avec un axe X et un axe Y.</p>
 * Le point (x=0 : y=0) se trouve en haut a gauche, les X sont les lignes,
 * et les Y les colonnes.
 */
public class Point {
    private int x;
    private int y;

    /**
     * Accesseur de X.
     * @return X
     */
    public int getX() {
        return x;
    }

    /**
     * Accesseur de Y.
     * @return Y
     */
    public int getY() {
        return y;
    }

    /**
     * Constructeur.
     * @param x La coordonnée X du point.
     * @param y La coordonnée Y du point.
     */
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Déplace un point dans son repère.
     * @param x Le déplacement en X à effectuer.
     * @param y Le déplacement en Y à effectuer.
     */
    public void move(int x, int y) {
        this.x += x;
        this.y += y;
    }

    /**
     * Retourne la distance séparant 2 points du repère.
     * @param point Le 2 ème point.
     * @return La distance séparant les 2 points.
     */
    public double distanceTo(Point point) {
        return Math.sqrt((point.getX()-this.x)*(point.getX()-this.x) +
                         (point.getY()-this.y)*(point.getY()-this.y));
    }
}

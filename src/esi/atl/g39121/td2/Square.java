package esi.atl.g39121.td2;

/**
 * <p>Représente un carré</p>
 * Un carré est un {@link Rectangle} dans la largeur et la hauteur sont égales.
 */
public class Square extends Rectangle {

    /**
     * Constructeur.
     * @param upperLeft Le point en haut a gauche de Carré.
     * @param cote La taille d'un coté du carré.
     * @param c Le charactère représentant le carré.
     */
    public Square(Point upperLeft, int cote, char c) {
        super(upperLeft, cote, cote, c);
    }
}

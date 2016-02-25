package esi.atl.g39121.td2;

/**
 * Objet qui représente des formes dans un repère.
 */
public class AsciiPaint {
    private Drawing drawing;

    /**
     * <p>Constructeur par défaut.</p>
     * La hauteur et la largeur du repère sont définie par le constructeur par défaut de {@link Drawing}.
     */
    public AsciiPaint() {
        drawing = new Drawing();
    }

    /**
     * Constructeur.
     * @param hauteur La hauteur du repère.
     * @param largeur La largeur du repère.
     */
    public AsciiPaint(int hauteur, int largeur) {
        drawing = new Drawing(hauteur,largeur);
    }

    /**
     * Ajoute un {@link Circle} dans le repère.
     * @param x La coordonnée X du {@link Point} du centre du {@link Circle}.
     * @param y La coordonnée Y du {@link Point} du centre du {@link Circle}.
     * @param rayon Le rayon du {@link Circle}.
     * @param c Le charactere représentant le {@link Circle}.
     */
    public void newCircle(int x, int y, int rayon, char c) {
        drawing.addShape(new Circle(new Point(x,y),rayon,c));
    }

    /**
     * Ajoute un {@link Rectangle} dans le repère.
     * @param x La coordonnée X du {@link Point} du haut a gauche du {@link Rectangle}.
     * @param y La coordonnée Y du {@link Point} du haut a gauche du {@link Rectangle}.
     * @param largeur La largeur du {@link Rectangle}.
     * @param hauteur La hauteur du {@link Rectangle}.
     * @param c Le charactere représentant le {@link Rectangle}.
     */
    public void newRectangle(int x, int y, int largeur, int hauteur, char c) {
        drawing.addShape(new Rectangle(new Point(x,y),largeur,hauteur,c));
    }

    /**
     * Ajoute un {@link Square} dans le repère.
     * @param x La coordonnée X du {@link Point} du haut a gauche du {@link Square}.
     * @param y La coordonnée Y du {@link Point} du haut a gauche du {@link Square}.
     * @param cote La taille d'un coté du {@link Square}.
     * @param c Le charactère représentant le {@link Square}.
     */
    public void newSquare(int x, int y, int cote, char c) {
        drawing.addShape(new Square(new Point(x,y),cote,c));
    }

    /**
     * Retourne un {@link String} représentant le repére et ses formes contenues.
     * @return Un {@link String} représentant le repére et ses formes contenues.
     */
    public String asAscii() {
        String s = "";
        for(int i=0; i<drawing.getHauteur();i++) {
            for(int j=0; j<drawing.getLargeur();j++) {
                if(drawing.getShapeAt(new Point(i,j)) == null) {
                    s += " ";
                } else {
                    s += drawing.getShapeAt(new Point(i,j)).getColor();
                }
            }
            s += "\n";
        }
        return s;
    }

}

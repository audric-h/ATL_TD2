package esi.atl.g39121.td2;

/**
 * Created by audric on 25.02.16.
 */
public class AsciiPaint {
    private Drawing drawing;

    public AsciiPaint() {
        drawing = new Drawing();
    }

    public AsciiPaint(int hauteur, int largeur) {
        drawing = new Drawing(hauteur,largeur);
    }

    public void newCircle(int x, int y, int rayon, char c) {
        drawing.addShape(new Circle(new Point(x,y),rayon,c));
    }

    public void newRectangle(int x, int y, int largeur, int hauteur, char c) {
        drawing.addShape(new Rectangle(new Point(x,y),largeur,hauteur,c));
    }

    public void newSquare(int x, int y, int cote, char c) {
        drawing.addShape(new Square(new Point(x,y),cote,c));
    }

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

package esi.atl.g39121.td2;

/**
 * Représente une forme "colorée" dans un repère (X:Y).
 */
public abstract class ColoredShape implements Shape {
    private char color;

    ColoredShape(char color) {
        this.color = color;
    }

    public char getColor() {
        return this.color;
    }
}

package esi.atl.g39121.td2;

/**
 * Created by audric on 25.02.16.
 */
public abstract class ColoredShape implements Shape {
    private char color;

    ColoredShape(char color) {
        this.color = color;
    }

    public char getColor() {
        return this.color;
    }

    public void setColor(char c) {
        this.color = c;
    }
}

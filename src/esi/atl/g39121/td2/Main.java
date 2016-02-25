package esi.atl.g39121.td2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AsciiPaint a = new AsciiPaint(10,10);
        Scanner scanner = new Scanner(System.in);
        String s;
        boolean end = false;
        while(!end) {
            s = scanner.nextLine();
            if(s.contains("add")) {
                if (s.contains("rectangle")) {
                    try {
                        int x = Character.getNumericValue(s.charAt(14));
                        int y = Character.getNumericValue(s.charAt(16));
                        int largeur = Character.getNumericValue(s.charAt(18));
                        int longueur = Character.getNumericValue(s.charAt(20));
                        char c = s.charAt(22);
                        a.newRectangle(x, y, largeur, longueur, c);
                    } catch (Exception e) {
                        System.out.println(e.toString());
                    }
                } else if (s.contains("circle")) {
                    try {
                        int x = Character.getNumericValue(s.charAt(11));
                        int y = Character.getNumericValue(s.charAt(13));
                        int rayon = Character.getNumericValue(s.charAt(15));
                        char c = s.charAt(17);
                        a.newCircle(x, y, rayon, c);
                    } catch (Exception e) {
                        System.out.println(e.toString());
                    }
                } else if (s.contains("square")) {
                    try {
                        int x = Character.getNumericValue(s.charAt(11));
                        int y = Character.getNumericValue(s.charAt(13));
                        int cote = Character.getNumericValue(s.charAt(15));
                        char c = s.charAt(17);
                        a.newSquare(x, y, cote, c);
                    } catch (Exception e) {
                        System.out.println(e.toString());
                    }
                }
            }
            if (s.contains("show")) {
                end = true;
            }
        }
        System.out.println(a.asAscii());
    }
}

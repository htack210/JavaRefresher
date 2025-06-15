package com.haertlein;

public class Main {
    public static void main(String[] args) {
        char symb = '\u00A9';
        String var = "Glenn";
        String var2 = "Haertlein";
        int num = 14;

        System.out.println(var + " " + var2 + " " + symb + " " + num);
        System.out.println("This is a Unicode test: \u03A9, \u03C0, \u4E2D, \uD83D\uDE80");
    }
}
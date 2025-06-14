package com.haertlein;
/* Glenn Haertlein  */

public class Main {
    public static void main(String[] args) throws Exception {
        float max = Float.MAX_VALUE;
        float min = Float.MIN_VALUE;
        double dblMax = Double.MAX_VALUE;
        double dblMin = Double.MIN_VALUE;

        System.setOut(new java.io.PrintStream(System.out, true, "UTF-8"));
        System.out.println('\u00A7');
        char var2 = '\u00A7';

        System.out.println(var2);

        System.out.printf("""
                          Float Max = %.2e
                          """, max);
        System.out.printf("""
                          Float Min = %.2e
                          """, -min);
        System.out.printf("""
                          Double Max = %.2e
                          """, dblMax);
        System.out.printf("""
                          Double Min = %.2e
                          """, -dblMin);
    }
}
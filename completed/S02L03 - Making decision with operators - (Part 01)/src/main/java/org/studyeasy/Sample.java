package org.studyeasy;
/* Author: Chand Sheikh */

public class Sample {
    public static void main(String[] args) {
        int x = 3;

        // if (x != 6) {
        // System.out.println("X is not 6");
        // } else {
        // System.out.println("X is 6");
        // }

        // System.out.println("Sample code");

        switch (x) {
            case 1 -> System.out.println("x is 1");
            case 2 -> System.out.println("x is 2");
            case 3 -> System.out.println("x is 3");
            default -> System.out.println("x is " + x);
        }

    }
}

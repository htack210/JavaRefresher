package org.studyeasy;

public class Main {
    public static void main(String[] args) {
        int x = 1234;

        // Calculate sum of digits
        int sum = 0;
        int temp = x;
        while (temp != 0) {
            sum += temp % 10;
            temp /= 10;
        }
        System.out.println("Sum of digits in x: " + sum);

    }
}
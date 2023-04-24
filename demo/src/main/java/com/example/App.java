package com.example;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a non-negative whole number: ");
        int n = input.nextInt();
        System.out.print("Enter a floating point number: ");
        double x = input.nextDouble();

        double result = power(x, n);
        System.out.printf("%.4f to the power of %d = %.4f", x, n, result);
    }

    public static double power(double x, int n) {
        if (n == 0) {
            return 1;
        } else if (n % 2 == 0) {
            double y = power(x, n / 2);
            return y * y;
        } else {
            return x * power(x, n - 1);
        }
    }
}
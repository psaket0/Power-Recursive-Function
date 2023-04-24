package com.example;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative whole number: ");
        int n = Integer.parseInt(scanner.nextLine().trim());
        System.out.print("Enter a floating point number: ");
        double x = Double.parseDouble(scanner.nextLine().trim());

        double result = calculatePower(x, n);
        System.out.printf("%.4f to the power of %d = %.4f", x, n, result);
    }

    private static double calculatePower(double x, int n) {
        if (n == 0) {
            return 1;
        } else if (n % 2 == 0) {
            double halfPower = calculatePower(x, n / 2);
            return halfPower * halfPower;
        } else {
            double halfPower = calculatePower(x, (n - 1) / 2);
            return x * halfPower * halfPower;
        }
    }
}

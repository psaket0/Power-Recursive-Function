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
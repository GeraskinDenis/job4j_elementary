package ru.job4j.condition;

public class SqArea {
    public static double square(double p, double k) {
        double rsl = (2 * p * k) / (4 * k + 4);
        return  rsl;
    }

    public static void main(String[] args) {
        double p = 6;
        double k = 2;
        double s = 2;
        double result1 = SqArea.square(p, k);
        System.out.printf("p = %f, k = %f, s = %f, real = %f", p, k, s, result1);
    }
}

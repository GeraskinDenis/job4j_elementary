package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl = Math.sqrt((Math.pow((x2 - x1), 2)) + (Math.pow((y2 - y1), 2)));
        return rsl;
    }

    public static void main(String[] args) {

        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;

        double result = Point.distance(x1, y1, x2, y2);
        System.out.printf("\nDistance (%d, %d) to (%d, %d) is " + result, x1, y1, x2, y2);

        x1 = 10;
        y1 = -5;
        x2 = 15;
        y2 = 0;
        result = Point.distance(x1, y1, x2, y2);
        System.out.printf("\nDistance (%d, %d) to (%d, %d) is " + result, x1, y1, x2, y2);

        x1 = -100;
        y1 = -20;
        x2 = 0;
        y2 = 0;
        result = Point.distance(x1, y1, x2, y2);
        System.out.printf("\nDistance (%d, %d) to (%d, %d) is " + result, x1, y1, x2, y2);
    }
}

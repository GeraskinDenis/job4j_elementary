package ru.job4j.calculator;

public class Fit {
    public static double manWeight(short height) {
        double rsl = (height - 100) * 1.15;
        return rsl;
    }

    public static double womanWeight(short height) {
        double rsl = (height - 110) * 1.15;
        return rsl;
    }

    public static void main(String[] args) {
        short heightMan = 187;
        double man = Fit.manWeight(heightMan);
        System.out.printf("\nMan %s is " + man, heightMan);

        short heightWoman = 175;
        double woman = Fit.womanWeight(heightWoman);
        System.out.printf("\nWoman %s is " + woman, heightWoman);
    }
}

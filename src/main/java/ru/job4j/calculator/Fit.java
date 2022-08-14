package ru.job4j.calculator;

public class Fit {
    public static double manWeight(short height) {
        return (height - 100) * 1.15;
    }

    public static double womanWeight(short height) {
        return  (height - 110) * 1.15;
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

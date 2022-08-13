package ru.job4j.converter;

public class Converter {
    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        float dollar = Converter.rubleToDollar(210);
        System.out.println("210 rubles are " + dollar + " dollars.");
    }

    private static float rubleToEuro(int value) {
        float rsl = (float) value / 70F;
        return rsl;
    }

    private static float rubleToDollar(int value) {
        float rsl = (float) value / 60F;
        return rsl;
    }
}

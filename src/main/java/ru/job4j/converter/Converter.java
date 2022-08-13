package ru.job4j.converter;

public class Converter {
    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        float dollar = Converter.rubleToDollar(210);
        System.out.println("210 rubles are " + dollar + " dollars.");

        int in = 140;
        float expected = 2f;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.printf("\n%d rubles are %f euro. Test result: %b", in, out, passed);

        in = 210;
        expected = 3.5f;
        out = Converter.rubleToDollar(in);
        passed = expected == out;
        System.out.printf("\n%d rubles are %f dollars. Test result: %b", in, out, passed);
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

package ru.job4j.converter;

public class Converter {
    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140f);
        System.out.println("140 rubles are " + euro + " euro.");
        float dollar = Converter.rubleToDollar(210f);
        System.out.println("210 rubles are " + dollar + " dollars.");

        float in = 140f;
        float expected = 2f;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.printf("\n%d rubles are %f euro. Test result: %b", in, out, passed);

        in = 210f;
        expected = 3.5f;
        out = Converter.rubleToDollar(in);
        passed = expected == out;
        System.out.printf("\n%d rubles are %f dollars. Test result: %b", in, out, passed);
    }

    public static float rubleToEuro(float value) {
        float rsl = value / 70F;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60F;
        return rsl;
    }
}

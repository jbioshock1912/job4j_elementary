package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);

        float rubleIn = 120;
        float expectedDollar = 2;
        float actualOut = rubleToDollar(rubleIn);
        boolean passedRubleToDollar = expectedDollar == actualOut;
        System.out.println(rubleIn + " rubles are " + expectedDollar + " dollars. Test result : " + passedRubleToDollar);
    }
}

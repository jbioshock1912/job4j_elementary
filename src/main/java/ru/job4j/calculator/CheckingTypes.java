package ru.job4j.calculator;

public class CheckingTypes {
    public static void main(String[] args) {
        String loss = "Преобразование, которое происходит с потерей данных; ";
        String withoutLoss = "Преобразование без потери данных; ";

        long l = 129;
        byte b = (byte) l;
        System.out.println(loss + b);

        float f = 12358.7f;
        int i = 45981;
        short rsl = (short) (f + i);
        System.out.println(loss + rsl);

        double d = 121.19;
        b = (byte) d;
        System.out.println(loss + b);

        short s = 1500;
        char c = (char) s;
        d = c;
        System.out.println(withoutLoss + d);
    }
}

package ru.job4j.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double p = (a + b + c) / 2;

        double pMinusA = p - a;
        double pMinusB = p - b;
        double pMinusC = p - c;

        double multiplication = p * pMinusA * pMinusB * pMinusC;
        double resultS = Math.sqrt(multiplication);

        return resultS;
    }

    public static void main(String[] args) {
        double rsl = TrgArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + rsl);
    }
}

package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double resultMinusX = x2 - x1;
        double resultMinusY = y2 - y1;

        double resultPowX = Math.pow(resultMinusX, 2);
        double resultPowY = Math.pow(resultMinusY, 2);

        double sumResult = resultPowX + resultPowY;
        double finalResult = Math.sqrt(sumResult);

        return finalResult;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);

        result = Point.distance(1, 1, 2, 2);
        System.out.println("result (1, 1) to (2, 2) " + result);

        result = Point.distance(-1, 1, -2, 4);
        System.out.println("result (-1, 1) to (-2, 4) " + result);
    }
}

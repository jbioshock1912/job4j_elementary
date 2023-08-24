package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double sumFromOperationsSubAndDiv(double first, double second, double third, double fourth) {
        return sum(subtract(first, second), division(third, fourth));
    }

    public static double sumAllOperations(double first, double second) {
        return sum(sum(subtract(first, second), division(first, second)),
                sum(multiply(first, second), sum(first, second)));
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + sumFromOperationsSubAndDiv(20, 10, 30, 1));
        System.out.println("Результат расчета равен: " + sumAllOperations(20, 2));
    }
}

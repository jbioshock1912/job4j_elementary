package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (boolean datum : data) {
            boolean instance = data[0];
            if (datum != data[0]) {
                result = false;
                break;
            }
        }
        return result;
    }
}

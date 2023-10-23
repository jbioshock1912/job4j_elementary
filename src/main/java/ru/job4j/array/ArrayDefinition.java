package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        System.out.println("Размер массива ages равен: " + ages.length);
        System.out.println("Размер массива surnames равен: " + surnames.length);
        System.out.println("Размер массива prices равен: " + prices.length);

        String[] names = new String[4];
        names[0] = "Olo Smith";
        names[1] = "Jen En";
        names[2] = "Dav Duh";
        names[3] = "Rosa Das";

        for (String name : names) {
            System.out.println(name);
        }
    }
}

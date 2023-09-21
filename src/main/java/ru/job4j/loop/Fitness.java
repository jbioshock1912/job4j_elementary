package ru.job4j.loop;

public class Fitness {
    public static int calc(int ivan, int nik) {
        int month = 0;
        while (ivan <= nik) {
            month++;
            ivan = ivan * month * 3;
            nik = nik * month * 2;
        }
        return month;
    }
}

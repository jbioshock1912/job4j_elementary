package ru.job4j.condition;

import java.time.LocalDate;

public class Greeting {
    public static void main(String[] args) {
        String idea = "I like Java!";
        System.out.println(idea);
        idea += "But I am a newbie.";
        int year = getCurrentYear();
        idea += year;
        System.out.println(idea);
    }

    public static int getCurrentYear() {
        return LocalDate.now().getYear();
    }
}
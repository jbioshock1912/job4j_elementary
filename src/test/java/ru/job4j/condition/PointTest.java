package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PointTest {
    @Test
    void when00to20then2() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double expected = 2;
        double out = a.distance(b);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when11to33then2dot82() {
        Point a = new Point(1, 1);
        Point b = new Point(3, 3);
        double expected = 2.82;
        double out = a.distance(b);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenMinus33Tto11then5dot65() {
        Point a = new Point(-3, -3);
        Point b = new Point(1, 1);
        double expected = 5.65;
        double out = a.distance(b);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when34to45then1dot41() {
        Point a = new Point(3, 4);
        Point b = new Point(4, 5);
        double expected = 1.41;
        double out = a.distance(b);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when30to03then4dot24() {
        Point a = new Point(3, 0);
        Point b = new Point(0, 3);
        double expected = 4.24;
        double out = a.distance(b);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }
}
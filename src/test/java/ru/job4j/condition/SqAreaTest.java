package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class SqAreaTest {

    @Test
    void whenP6K2Square2() {
        int expected = 2;
        int p = 6;
        double k = 2;
        double out = SqArea.square(p, k);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenP33K11Square20Dot796() {
        double expected = 20.796;
        int p = 33;
        double k = 11;
        double out = SqArea.square(p, k);
        assertThat(out).isEqualTo(expected, withPrecision(0.001));
    }

    @Test
    void whenP10K4Square4() {
        double expected = 4;
        int p = 10;
        double k = 4;
        double out = SqArea.square(p, k);
        assertThat(out).isEqualTo(expected, withPrecision(0.001));
    }
}
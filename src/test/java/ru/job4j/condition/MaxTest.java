package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {

    @Test
    void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax20To0Then20() {
        int left = 20;
        int right = 0;
        int result = Max.max(left, right);
        int expected = 20;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax20To20Then20() {
        int left = 20;
        int right = 20;
        int result = Max.max(left, right);
        int expected = 20;
        assertThat(result).isEqualTo(expected);
    }
}
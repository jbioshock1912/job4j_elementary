package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class SwitchArrayTest {
    @Test
    void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSwap2to6() {
        int[] input = {1, 23, 3, 4, 11, 2, 34, 4};
        int source = 2;
        int dest = 6;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {1, 23, 34, 4, 11, 2, 3, 4};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSwap0to1() {
        int[] input = {1, 2};
        int source = 0;
        int dest = 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {2, 1};
        assertThat(result).containsExactly(expected);
    }
}
package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MaxTest {

    @Test
    public void whenLeft10Right20ThenMax20() {
        int left = 10;
        int right = 20;
        int expected = 20;
        int out = Max.max(left, right);
        assertThat(out).isEqualTo(expected);
    }

    @Test
    public void whenLeft33Right33ThenMax33() {
        int left = 33;
        int right = 33;
        int expected = 33;
        int out = Max.max(left, right);
        assertThat(out).isEqualTo(expected);
    }

    @Test
    public void whenLeft50Right30ThenMax50() {
        int left = 50;
        int right = 30;
        int expected = 50;
        int out = Max.max(left, right);
        assertThat(out).isEqualTo(expected);
    }
}
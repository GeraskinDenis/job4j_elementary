package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

public class FitTest {

    @Test
    public void whenMan180Then92() {
        short in = 180;
        double expected = 92;
        double eps = 0.01;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenWoman175Then74dot75() {
        short in = 175;
        double expected = 74.75;
        double eps = 0.01;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(expected, out, eps);
    }
}
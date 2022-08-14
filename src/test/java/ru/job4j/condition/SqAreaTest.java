package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void whenP6K2Square2() {
        int p = 6;
        double k = 2;
        double expected = 2;
        double eps = 0.01;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenP5K3Square1dot171() {
        int p = 5;
        double k = 3;
        double expected = 1.171;
        double eps = 0.01;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenP12K4Square5dot76() {
        int p = 12;
        double k = 4;
        double expected = 5.76;
        double eps = 0.01;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenP7K7Square1dot339() {
        int p = 7;
        double k = 7;
        double expected = 1.339;
        double eps = 0.01;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, eps);
    }
}
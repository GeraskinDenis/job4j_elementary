package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20Then2() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double expected = 2;
        double eps = 0.01;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void when10m5to150Then7dot071() {
        int x1 = 10;
        int y1 = -5;
        int x2 = 15;
        int y2 = 0;
        double expected = 7.071;
        double sps = 0.01;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, sps);
    }

    @Test
    public void whenM100M20to20Then103dot9422() {
        int x1 = -100;
        int y1 = -20;
        int x2 = 2;
        int y2 = 0;
        double expected = 103.9422;
        double eps = 0.01;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void when516toM12164Then134dot833() {
        int x1 = 5;
        int y1 = 16;
        int x2 = -121;
        int y2 = 64;
        double expected = 134.833;
        double eps = 0.01;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, eps);
    }
}
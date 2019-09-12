package nl.itacademy.bonus.algorithms;

import org.junit.Assert;
import org.junit.Test;

public class AlgorithmsTest {


    @Test
    public void testGauss() {
        Assert.assertEquals(55, Algorithms.gauss(10));
        Assert.assertEquals(6, Algorithms.gauss(3));
        Assert.assertEquals(10, Algorithms.gauss(4));
    }

    @Test
    public void testJosephus() {
        Assert.assertEquals(7, Algorithms.josephus(7, 2 )); // 2th person killed, n people total

        Assert.assertEquals(13, Algorithms.josephus(14, 2 )); // 2th person killed, n people total
    }
}

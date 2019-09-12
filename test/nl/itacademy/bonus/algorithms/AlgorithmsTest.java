package nl.itacademy.bonus.algorithms;

import org.junit.Assert;
import org.junit.Test;

public class AlgorithmsTest {

    @Test
    public void testJosephus() {
        Assert.assertEquals(7, Algorithms.josephus(7, 2 )); // 2th person killed, n people total

        Assert.assertEquals(13, Algorithms.josephus(14, 2 )); // 2th person killed, n people total
    }
}

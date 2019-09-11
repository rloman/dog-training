package nl.itacademy.dogtraining.model;

import static org.junit.Assert.*;
import org.junit.Test;

public class TollerTest {

    @Test
    public void testSetName() {
        Toller toller = new Toller();
        toller.setName("Dexter");

        assertEquals("Dexter", toller.getName());
    }

    @Test
    public void testSetAge() {
        Toller toller = new Toller();
        toller.setAge(7);

        assertEquals(7, toller.getAge());
    }

}

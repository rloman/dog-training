package nl.itacademy.ocp;

import org.junit.Assert;
import org.junit.Test;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerBruteForceSelfTest {



    @Test
    public void deepTestAdd() {

    // 100 bakkers

        // 100 consumers

        // run it

        // moet eindigen met een voorraad van 0

        // Assert dus dat voorraad eindigt op 0

//        Assert.assertEquals(0, inventory.getSupply());
    }
}


final class Inventory {

    private AtomicInteger supply = new AtomicInteger(0);

    public void inc() {
        this.supply.incrementAndGet();
    }

    public void dec() {
        this.supply.decrementAndGet();
    }
}

class Bakker {

}

class Consumer {

}
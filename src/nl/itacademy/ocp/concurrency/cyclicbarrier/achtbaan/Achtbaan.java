package nl.itacademy.ocp.concurrency.cyclicbarrier.achtbaan;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Achtbaan {


    private CyclicBarrier inhoud = new CyclicBarrier(8);


    public void enter() throws BrokenBarrierException, InterruptedException {
        inhoud.await();
        System.out.println("Achtbaan loopt");
    }
}

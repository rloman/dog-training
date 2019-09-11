package nl.itacademy.ocp.concurrency.cyclicbarrier.achtbaan;

import java.util.concurrent.BrokenBarrierException;

public class Visitor implements Runnable {

    private int id;
    private final Achtbaan achtbaan;

    public Visitor(int id, Achtbaan achtbaan){
        this.id = id;
        this.achtbaan = achtbaan;
    }
    @Override
    public void run() {
        try {
            System.out.println("Customer with id: "+this.id+" is entering the achtbaan");
            this.achtbaan.enter();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

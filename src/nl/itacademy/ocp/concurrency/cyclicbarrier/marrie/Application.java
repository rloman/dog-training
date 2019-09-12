package nl.itacademy.ocp.concurrency.cyclicbarrier.marrie;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;


// This class shows the usage of the Cyclic Barrier
// a cyclic barrier is no more or less than a kind of weddingDoor where only are a certain amount of people are pushing to marry it ...
public class Application {

    public static void main(String[] args) throws InterruptedException {

        // create a marriage weddingDoor // or how do we call it? :-)
        WeddingDoor weddingDoor = new WeddingDoor(); // trouwloketje!

        Person p1 = new Person(1, weddingDoor);
        Person p2 = new Person(2, weddingDoor);

        new Thread(p1).start();
        new Thread(p2).start();

        // but ... what happens when we add only one still single  person ... ???
        Person p3 = new Person(3, weddingDoor);
        new Thread(p3).start();

        Thread.sleep(5000); // add a wait to see that one person can't marry the weddingDoor

        // without this p3 (again p3) would wait forever since we need two people AT THE SAME TIME to marry the weddingDoor
        Person p4 = new Person(4, weddingDoor);

        new Thread(p4).start();
    }
}

class WeddingDoor {

    private static final int PEOPLE_TOGETHER = 2;

    private final CyclicBarrier barrier = new CyclicBarrier(PEOPLE_TOGETHER);

    public void marry(int id) throws InterruptedException, BrokenBarrierException {
        System.out.printf("Trying to marry weddingDoor by person with id '%d'%n", id);

        barrier.await();

        System.out.printf("WeddingDoor opened by person with id '%d'!%n", id);
    }
}


class Person implements Runnable {

    private int id;
    private WeddingDoor weddingDoor;

    Person(int id, WeddingDoor d) {
        this.id = id;
        this.weddingDoor = d;
    }

    @Override
    public void run() {

        try {
            this.weddingDoor.marry(this.id);
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }
        System.out.println("Married ... ");
    }
}


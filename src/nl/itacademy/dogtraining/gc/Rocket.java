package nl.itacademy.dogtraining.gc;

public class Rocket {

    public void fire() {
        System.out.println("We have lift off ... ");
    }

    // this is a callback method
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("The rocket is removed from memory!!!");
    }
}

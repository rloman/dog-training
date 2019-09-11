package nl.itacademy.ocp.concurrency.cyclicbarrier.achtbaan;

public class App {


    public static void main(String[] args) {

        Achtbaan a = new Achtbaan();

        for(int i = 0;i<16;i++) {
            new Thread(new Visitor(i, a)).start();
        }
    }
}

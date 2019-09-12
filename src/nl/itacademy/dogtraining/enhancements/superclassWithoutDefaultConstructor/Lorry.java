package nl.itacademy.dogtraining.enhancements.superclassWithoutDefaultConstructor;

public class Lorry extends Car {

    public Lorry(String licensePlate) {
//        super(licensePlate);
        super();
    }

}

package nl.itacademy.dogtraining.enhancements.superclassWithoutDefaultConstructor;

public class Car {

    private String licensePlate;

    public Car() {
//        super(); // er wordt altijd impliciet een super() call gedaan
        // tenzij je hier een andere constructor aanroept (bv. this();)
        super();
    }

    public Car(String licensePlate) {
        super();
        this.licensePlate = licensePlate;
    }


    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }
}

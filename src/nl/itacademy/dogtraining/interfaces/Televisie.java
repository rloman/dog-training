package nl.itacademy.dogtraining.interfaces;

public interface Televisie {

    public abstract void on(); // public abstract is impliciet
    void off(); // public abstract
    int switchChannel(int newChannel);
    void changeVolume(boolean increase);
}

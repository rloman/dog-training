package nl.itacademy.dogtraining.enhancements.superclassWithoutDefaultConstructor.solution;

import java.awt.*;

public class Planet {

    private int size;
    private Color color;

    public Planet(int size, Color color) {
        this.size = size;
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}

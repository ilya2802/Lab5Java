package ua.lviv.iot.fortifications.models;

public class Trench extends Fortifications {
    private double width;

    public Trench(double lenght, double depth, double timeToBuild, double width) {
        super(lenght, depth, timeToBuild);
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}

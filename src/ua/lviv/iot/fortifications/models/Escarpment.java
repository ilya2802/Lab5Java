package ua.lviv.iot.fortifications.models;

public class Escarpment extends Fortifications {
    private int numberOfCliffs;

    public Escarpment(double lenght, double depth, double timeToBuild, int numberOfCliffs) {
        super(lenght, depth, timeToBuild);
        this.numberOfCliffs = numberOfCliffs;
    }

    public int getNumberOfCliffs() {
        return numberOfCliffs;
    }

    public void setNumberOfCliffs(int numberOfCliffs) {
        this.numberOfCliffs = numberOfCliffs;
    }
}

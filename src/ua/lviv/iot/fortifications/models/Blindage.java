package ua.lviv.iot.fortifications.models;

public class Blindage extends Fortifications {

    private CoveringType kindOfCovering;
    private int capacityOfPeople;
    private double square;

    public Blindage(double lenght, double depth, double timeToBuild, CoveringType kindOfCovering, int capacityOfPeople, double square) {
        super(lenght, depth, timeToBuild);
        this.kindOfCovering = kindOfCovering;
        this.capacityOfPeople = capacityOfPeople;
        this.square = square;
    }

    public CoveringType getKindOfCovering() {
        return kindOfCovering;
    }

    public void setKindOfCovering(CoveringType kindOfCovering) {
        this.kindOfCovering = kindOfCovering;
    }

    public int getCapacityOfPeople() {
        return capacityOfPeople;
    }

    public void setCapacityOfPeople(int capacityOfPeople) {
        this.capacityOfPeople = capacityOfPeople;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }
}

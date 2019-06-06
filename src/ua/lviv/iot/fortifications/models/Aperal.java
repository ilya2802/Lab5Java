package ua.lviv.iot.fortifications.models;

public class Aperal extends Fortifications {
    private int angleOfInclination;

    public Aperal(double lenght, double depth, double timeToBuild, int angleOfInclination) {
        super(lenght, depth, timeToBuild);
        this.angleOfInclination = angleOfInclination;
    }

    public int getAngleOfInclination() {
        return angleOfInclination;
    }

    public void setAngleOfInclination(int angleOfInclination) {
        this.angleOfInclination = angleOfInclination;
    }
}
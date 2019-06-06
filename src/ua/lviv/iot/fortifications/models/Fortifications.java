package ua.lviv.iot.fortifications.models;

public abstract class Fortifications {

    private double lenght;
    private double depth;
    private double timeToBuild;

    public Fortifications(double lenght, double depth, double timeToBuild) {
        this.lenght = lenght;
        this.depth = depth;
        this.timeToBuild = timeToBuild;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public double getTimeToBuild() {
        return timeToBuild;
    }

    public void setTimeToBuild(double timeToBuild) {
        this.timeToBuild = timeToBuild;
    }
}

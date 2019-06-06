package ua.lviv.iot.fortifications.models;

public class AntitankNadovb extends Fortifications {
    private MaterialType kindOfMaterial;

    public AntitankNadovb(double lenght, double depth, double timeToBuild, MaterialType kindOfMaterial) {
        super(lenght, depth, timeToBuild);
        this.kindOfMaterial = kindOfMaterial;
    }

    public MaterialType getKindOfMaterial() {
        return kindOfMaterial;
    }

    public void setKindOfMaterial(MaterialType kindOfMaterial) {
        this.kindOfMaterial = kindOfMaterial;
    }
}

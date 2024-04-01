package ru.mpei;

public class Table extends Thing{
    private String substance;

    public Table(double height, double width, double length, String color) {
        super(height, width, length, color);
    }

    public Table() {
    }

    public double getWoodVolume(){
        return this.getWidth() * this.getHeight();
    }

    public String getSubstance() {
        return substance;
    }

    public void setSubstance(String substance) {
        this.substance = substance;
    }

    @Override
    public double getHeight() {
        return 2 * super.getHeight();
    }
    @Override
    public double getLength(){
        return 3 * super.getLength();
    }
}

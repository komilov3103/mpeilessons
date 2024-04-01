package ru.mpei;

public class Thing {
    private double height;
    private double width;
    private double length;
    private String color;

    public Thing(double height, double width, double length, String color) {
        this.height = height;
        this.width = width;
        this.length = length;
        this.color = color;
    }

    public Thing() {
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double volume(){
        return width*height*length;
    }
}

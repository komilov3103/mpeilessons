package Lesson3;

public abstract class Animal {

    protected int pawsCount;
    protected int averageWeight;

    public int getPawsCount() {
        return pawsCount;
    }

    public void setPawsCount(int pawsCount) {
        this.pawsCount = pawsCount;
    }

    public int getAverageWeight() {
        return averageWeight;
    }

    public void setAverageWeight(int averageWeight) {
        this.averageWeight = averageWeight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public AnimalType getName() {
        return name;
    }

    public void setName(AnimalType name) {
        this.name = name;
    }

    protected String color;
    protected AnimalType name;
    public abstract boolean canFly();

    protected abstract String whatDoesTheAnimalSay();

    public void say(){
        System.out.println(name + " say: " + this.whatDoesTheAnimalSay());
    }
}

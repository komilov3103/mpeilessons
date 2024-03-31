package Lesson3;

public class Owl extends Animal{
    public Owl() {
        this.name = AnimalType.Owl;
        this.color = "black";
        this.pawsCount = 2;
    }

    @Override
    public boolean canFly() {
        return true;
    }

    @Override
    protected String whatDoesTheAnimalSay() {
        return "uh uh uh";
    }
}

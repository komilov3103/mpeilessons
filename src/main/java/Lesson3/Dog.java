package Lesson3;

public class Dog extends Animal{
    public Dog() {
        this.name = AnimalType.Dog;
        this.color = "black";
        this.pawsCount = 4;
    }

    @Override
    public boolean canFly() {
        return false;
    }

    @Override
    protected String whatDoesTheAnimalSay() {
        return "auf auf auf auf гаф гаф";
    }

    public void runForTail(){
        System.out.println("run baby run");
    }
}

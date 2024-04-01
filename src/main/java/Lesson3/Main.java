package Lesson3;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) throws IOException {
        Animal fox = new Fox();
        Animal dog = new Dog();
        Animal owl = new Owl();

        Animal[] animals = new Animal[5];
        animals[0] = fox;
        animals[1] = dog;
        animals[2] = owl;

        for (Animal animal : animals) {
            if (animal != null){
                System.out.println(animal.whatDoesTheAnimalSay() + "some other stuff");
          }
        }

        if (fox instanceof Animal){
            System.out.println("Of course its animal");
        }else {
            System.out.println("Devnai chii");
        }

        filterDog(animals);

        System.out.println(AnimalType.Fox.ordinal());
        System.out.println(AnimalType.Fox.name());

        String content;
        try {
            content = Files.readString(Path.of("src/main/resources/SomeFile.txt"), StandardCharsets.UTF_8);
            System.out.println(content);
        } catch (Exception e) {
            System.out.println("Catch block");
        }
    }

    public static void filterDog(Animal[] animals){
        for (Animal animal : animals) {
            if (animal instanceof Dog){
                ((Dog) animal).runForTail();
            }

        }
    }
}

package JavaClasses.day57_abstraction_polimorphism.polimorphism;

import java.util.ArrayList;
import java.util.List;

public class AnimalTest {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        Animal animal1 = new Dog();
        Animal animal2 = new Horse();
        Animal animal3 = new Cat();
        animal1.makeNoise();
        animal2.makeNoise();
        animal3.makeNoise();

        List<Animal> listOfAnimals = new ArrayList<>();
        listOfAnimals.add(new Dog());
        listOfAnimals.add(new Dog());
        listOfAnimals.add(new Horse());
        listOfAnimals.add(new Cat());
        for (Animal each: listOfAnimals){
            each.makeNoise();
        }

    }
}

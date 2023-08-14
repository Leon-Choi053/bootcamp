package inclassCoding.W5D5;

import java.util.ArrayList;

public class DemoGenerics {
  public static void main(String[] args) {
    ArrayList<String> strings = new ArrayList<>();

    Zoo<Dog> zoo1 = Zoo.of(Dog.of("xyz"));

    zoo1.setAnimal(Dog.of("def"));

    Zoo<Animal> zoo2 = Zoo.of(new Cat());
    zoo2.setAnimal(new Animal());
    zoo2.setAnimal(Dog.of("abc"));
    zoo2.setAnimal(new Cat());

    // Zoo<String> zoo3 = Zoo.of("Abc"); // String is not extending Animal
  }
}

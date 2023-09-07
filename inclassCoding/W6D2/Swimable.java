package inclassCoding.W6D2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Annoation: check if this interface has one method
@FunctionalInterface
public interface Swimable {
  void swim();

  public static void main(String[] args) {
    // Person person = new Person();
    // person.swim();

    // Lambda: You have to use "return", if you use {} 
    // Comparator<Person> sortByNameDec = (Person p1, Person p2) -> p2.charAt(0) > p1.charAt(0) ? 1 : -1;
    Comparator<Person> sortByNameDec = (Person p1, Person p2) ->{
      return p2.name.charAt(0) > p1.name.charAt(0) ? 1 : -1;
    };
    List<Person> persons = Arrays.asList(new Person("Alison"), new Person("Eric"));
    Collections.sort(persons, sortByNameDec);
    System.out.println(persons);

    // new object <- "() -> System.out.println("Person 1 is swimming");"
    Swimable person1 = () -> System.out.println("Person 1 is swimming");
    person1.swim();

    Swimable person2 = () -> {
      System.out.println("Person 2 is swimming");
      System.out.println("Person 2 stop swimming");
    };
    person2.swim();

    Swimable person3 = () -> {
      System.out.println("Person 2 is swimming");
    };
    person3.swim();

  }
}

package inclassCoding.W6D5;

import java.util.HashSet;
import java.util.Set;

public class DemoRecord {
  public static void main(String[] args) {
    Person person = new Person("john", 30);
    Person1 person1 = new Person1("john", 30);
    Person1 anthorperson = new Person1("john", 30);

    System.out.println(person.getAge()); // 30
    System.out.println(person1.age()); // 30

    System.out.println(person.getName()); // john
    System.out.println(person1.name()); // john

    System.out.println(person1.equals(anthorperson)); // true
    System.out.println(person1); // Person1[name=john, age=30]

    System.out.println();

    // HashMap, Set -> equals(), hashcode()
    Set<Person1> set = new HashSet<>();
    set.add(person1);
    System.out.println(set.add(anthorperson)); // false
  }
}

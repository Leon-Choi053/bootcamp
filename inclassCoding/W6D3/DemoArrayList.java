package inclassCoding.W6D3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import inclassCoding.W6D1.Person;

public class DemoArrayList {
  public static void main(String[] args) {
    List<String> strings = new ArrayList<>();
    strings.add("abc");
    strings.add("def");
    strings.add("ghi");

    // for-each
    for (String s : strings) {
      System.out.println(s);
    }

    // Stream
    Stream<String> streamStrings = strings.stream();
    // Filter
    streamStrings = streamStrings.filter(s -> s.startsWith("a"));
    // Stream.forEach
    streamStrings.forEach(s -> System.out.println(s));

    strings.stream() //
        .filter(s -> s.endsWith("i")) //
        .forEach(s -> System.out.println(s)); // ghi


    List<String> strings2 = strings.stream().filter(s -> s.length() == 3)
        .collect(Collectors.toList());

    System.out.println(strings2.size());

    List<Integer> lengths =
        strings2.stream().filter(e -> e.startsWith("a") || e.startsWith("d"))
            .map(e -> e.length()) // Stream<Integer>
            .collect(Collectors.toList());
    lengths.forEach(e -> System.out.println(e)); // 3 3

    strings2.stream().sorted((s1, s2) -> s2.compareTo((s1)))
        .collect(Collectors.toList()).forEach(s -> System.out.println(s));

    System.out.println(strings2.stream().anyMatch(e -> e.startsWith("a")));

    if (strings2.stream().anyMatch(e -> e.startsWith("a"))) {
      System.out.println("one of the elements starts with a");
    }

    // interminate operations of Steam:
    // filter(), map(), sorted(), anyMatch()

    // terinated operations of Steam:
    // colloect(), forEach()

    // Stream can oly terminate once,
    // but it may have multiple interminate operations

    List<Person> persons =
        Arrays.asList(new Person("John, 30"), new Person("Mary, 25"));
    List<String> names = persons.stream().map(e -> {
      String word = "word ...";
      return e.getName() + word;
    }).collect(Collectors.toList());

    System.out.println(names.stream().filter(e->"John".startsWith("John")).count());

    long l = Stream.of("abc","def","ghi","abc").filter(e->e.length() ==3).distinct().count();

    
  }
}

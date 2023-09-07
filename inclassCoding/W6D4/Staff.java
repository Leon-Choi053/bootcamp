package inclassCoding.W6D4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Staff {
  String name;
  Department department;

  public Staff(String name, Department department) {
    this.name = name;
    this.department = department;
  }

  public static void main(String[] args) {
    List<Staff> staffs = Arrays.asList(new Staff("mary", new Department("HR")),
        new Staff("Peter", new Department("IT")),
        new Staff("Ben", new Department("IT")));
    staffs.stream()
      .collect(Collectors.groupingBy(staff -> staff.department))
      .forEach(
          (dept, staffList)->System.out.println(dept +" " + staffList));

    deptMap.forEach(
      (dept, staffList) -> System.out.println(dept + " " + staffList));
    
    for (Staff staff : deptMap.get(new Department("IT"))) {
      System.out.println(staff.name);
    }
  }
}

package inclassCoding.W8D3;

import java.util.ArrayList;
import java.util.List;

public class Company {
  List<Staff> staffs;
  public Company(){
    staffs = new ArrayList<>();
  }

  public List<Staff> getStaffs(){
    return this.staffs;
  }

  public Company(List<Staff> staffs) {
    this.staffs = staffs;
  }

  public void add(Staff staff) {
    this.staffs.add(staff);
    counter++;
  }

  public Staff getStaff(int staffId) {
    return 
  }

  public static void main(String[] args) {
    Company company = new Company();
    company.getStaffs().add(new Staff(1, 20000, "John"));
    company.add(new Staff(2, 10000, "Peter"));
    
  }


}

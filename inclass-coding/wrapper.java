public class wrapper { // class
  public static void main(String[] args) {
    // primitives:byte,short...
    // Wrapper Classes, corresponding primitive

    boolean isMale = true; // not an Object
    Boolean isFemale = true; // is an Object reference

    isMale = false;
    if (isMale) {

    }
    if (isFemale.compareTo(isMale) == 0) {

    }
    isFemale = null; // success
    // isMale = null; //error

    int num = 2;
    Integer num2 = 4; //num2 is an object reference
    num2 = null;

    num2 = 1000;
    String s = num2.toString(); //"1000"
    Integer i = Integer.valueOf("123"); //123
  }
}

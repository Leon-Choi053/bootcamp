package inclassCoding.W3D4;

import java.util.Arrays;
import inclassCoding.W2D2.Array;

public class StringBox {

  private String string;

  public StringBox() {

  }

  public void setString(String string) {
    this.string = string;
  }

  public String getString() {
    return this.string;
  }

  public StringBox append(String str) {
    this.string = this.string + str;
    // return this.string;
    return this; // StringBox object
  }

  public static StringBox append(String str, String str2) { // obj.append()
    if (str == null || "".equals(str))
      ;
    return null;

  }


  public static void main(String[] args) {
    StringBox s = new StringBox(); // empty constructor
    s.setString("Java");
    System.out.println(s.append("python")); // Javapython
    s.append("javascript").append("HTML").toString();

    StringBox s2 = new StringBox(); // this.string -> Null
    s2.insert(3, "java");

    String s3 = StringBox.append("hello", " world").toString();
    char[] result = s3.toCharArray();
    System.out.println(Arrays.toString(result));

    String a = null;
    a.charAt(2);

  }

  public StringBox insert(int idx, String s) {
    if (idx < 0 && idx > this.string.length()) {
      return this;
    }
    this.string =
        this.string.substring(0, idx) + s + this.string.substring(idx);
    return this;
  }

}
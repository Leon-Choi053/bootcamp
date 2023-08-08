package inclassCoding.W4D5;

public class ReadItCareFully {
  static final String string = "IamFinalString";
  private static char c = 'C';

  static {
    char[] chars = string.toCharArray();
    c = chars[2];
  }

  public static void main(String[] args) {
    ReadItCareFully readItCareFully = new ReadItCareFully();
    System.out.println(readItCareFully.c);
    };
  }

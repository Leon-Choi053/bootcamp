public class DataType {
  public static void main(String[] args) {
    // data type: number [int]
    int num; // int is a way to declare a variable
    // from now on, you cna only put integer to variable num
    num = 3; // from rigrt to left -> assignment
    System.out.println(num);
    System.out.println("3");
    System.out.println(3);

    // data type: text [str]
    String str = "Yolo   !";
    System.out.println(str);

    // String str2 = 12 //error
    // int num2 = "baka" //error

    // re-assignment
    num = 10;
    // floating point
    // int num3 = 1.1; //error, int can only store integer
    double f = 1.03; // double can put 0.xxxxx
    double f2 = 2; // will explain later

    // char, value should be assigned by single quota ''
    char gender = 'M';
    char space = ' ';
    // char empty = ''; //error, cannot be empty in code

    byte b = -128;

    boolean g = true;


    long t = 306247003;
    short gd = -32768;
    System.out.println(f);
    System.out.println(f2);

    float sb = 1.00000000000000000000003f; // norm -> f, but not F

    // String + operation
    String newstr1 = "GG ";
    String newstr2 = "I forgot my LT!";
    System.out.println(newstr1 + newstr2);

    String qq = "I am " + "OptimixPrime";
    System.out.println(qq);

    //
    int a = 1 + 3;
    int b10 = 5 - 2;
    int c1 = 2 - 20;
    int dd = 2 * 5;
    int p = 10 / 3;
    int s = 10 % 3;
    System.out.println(s);

  }
}

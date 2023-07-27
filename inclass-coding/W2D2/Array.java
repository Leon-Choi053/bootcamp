import java.util.Arrays;

public class Array {
  public static void main(String[] args) {
    // array is use to put a lot of values, the data type should all be the same
    int num = 7;
    int num2 = 8;
    int num3 = -30;

    // Create Empty Array (Approach 1)
    int[] nums = new int[3]; // 3 is the length of Array nums
    // whit index 0,1,2 (you can treat it as address)
    nums[0] = -40;
    nums[1] = 500;
    nums[2] = -1000;
    // nums[3] = 54; // ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
    nums[0] = 16; // reasign value

    String[] text = new String[4];
    text[0] = "GG";
    text[1] = "mother";
    text[2] = "What";
    text[3] = "Damn";

    double[] arr = new double[4];
    arr[0] = 1561874561;
    arr[1] = 1561861;
    arr[2] = 156181;
    arr[1] = 'G';
    // numDoubles[1] = "2"; //Type Issue -> error
    // char[], int[], String[]

    // for loop
    for (int i = 0; i < nums.length; i++) { // nums.length -> 3 (0, 1, 2)
      System.out.println("Address[" + i + "]=" + nums[i]);
    }
    // reversely print array nums
    for (int i = nums.length - 1; i >= 0; i--) {
      System.out.println("Address[" + i + "]=" + nums[i]);
    }

    // Apporach 2, create Array
    int[] array = new int[] {1, 9, 99};
    for (int i = 0; i < array.length; ++i) {
      System.out.println("Address[" + i + "]=" + array[i]);
    }
    // can add a new element at tail? No
    // Modify an element
    array[2] = -10;
    // access an element
    int index = 2;
    System.out.println(array[index]);
    for (int i = 0; i < array.length; ++i) {
      System.out.println("Address[" + i + "]=" + array[i]);
    }

    // char[]
    char[] chars = new char[3];
    chars[2] = 'a';
    chars[0] = '!';
    for (int i = 0; i < chars.length; i++) {
      System.out.println("Char Address[" + i + "]=" + chars[i]);
    }

    long[] num4 = new long[4];
    num4[2] = 133;
    for (int i = 0; i < num4.length; ++i) {
      System.out.println("Long Address[" + i + "]=" + num4[i]);
    }

    boolean[] arr2 = new boolean[2];
    arr2[0] = true;
    for (int i = 0; i < arr2.length; ++i) {
      System.out.println("Boolean Address[" + i + "]=" + arr2[i]);
    }

    String[] strs = new String[] {"hello", "GG", "bye"};
    strs[1] = "tiger";
    for (int i = 0; i < strs.length; ++i) {
      System.out.println("String Address[" + i + "]=" + strs[i]);
    }

    String[] LOL = new String[5];
    LOL[0] = "AD";
    LOL[1] = "Tank";
    LOL[2] = "Support";
    LOL[4] = "AP";
    System.out.println(Arrays.toString(LOL));

    byte[] bytes=new byte[6];
    bytes [3] = -2;
    System.out.println(Arrays.toString(bytes));

  }
}

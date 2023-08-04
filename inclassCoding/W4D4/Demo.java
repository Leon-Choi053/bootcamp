package inclassCoding.W4D4;

import java.util.Arrays;
import java.util.Random;

public class Demo {

  private static char[] age;

  public static void main(String[] args) {
    int[][] matrix = new int[3][4];

    Random read = new Random();


    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; i < matrix[0].length; j++) {
        matrix[i][j] = new Random().nextInt(13);
      }
    }
    System.out.println(Arrays.deepToString(matrix));

    int idx = 0;
    int[] arr = new int[matrix.length * matrix[0].length];
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; i < matrix[0].length; j++) {
        arr[idx++] = matrix[i][j];
      }
    }
    System.out.println(Arrays.toString(arr));

    String str = "";
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; i < matrix[0].length; j++) {
        str += matrix[i][j];
      }
    }
    System.out.println(str);

    int[][][] arr3d = new int[1][2][3];
    int[][][][] arr4d = new int[1][2][3][4];

    Demo[][] demo = new Demo[2][2];
    demo[0][0] = new Demo();
    demo[0][1] = new Demo();
    demo[1][0] = new Demo();
    demo[1][1] = new Demo();

    for (int i = 0; i < demo.length; i++) {
      for (int j = 0; j < demo.length; j++) {
        System.out.println(demo[i][j].age);
      }
    }

    String[][] strings = new String[][] {{"abc", "def"}, {"xyz", "ijk"}};
    for (int i = 0; i < strings.length; i++) {
      for (int j = 0; j < strings[0].length; j++) {
        System.out.println(strings[i][j]);;
      }
    }
  }
}

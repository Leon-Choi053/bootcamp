package inclassCoding.W5D3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class DemoSorting {
  public static void main(String[] args) {
    int[] arr = new int[] {4, -10, 9, -20, 100};
    Arrays.sort(arr);
    System.out.println(Arrays.toString(arr));

    ArrayList<Integer> arrayList = new ArrayList<>();
    arrayList.add(100);
    arrayList.add(-100);
    arrayList.add(-88);
    arrayList.add(4);
    Collections.sort(arrayList); // nlogn, ascending sorting
    System.out.println(arrayList); 

    ArrayList<Ball> balls = new ArrayList<>();
    balls.add(new Ball(4, Color.BLACK));
    balls.add(new Ball(1, Color.RED));
    balls.add(new Ball(5, Color.BLUE));
    balls.add(new Ball(100, Color.GREEN));
    Collections.sort(balls, new SortByColor());
    System.out.println(balls);
  }
}

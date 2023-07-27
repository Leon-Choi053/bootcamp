public class InsertionSort {
  public static void main(String[] args) {
    // [5, 1, 4, 8, 2]
    // step1.1: [1, 5, 4, 8, 2] (insert 1 to arr[0], 1 < 5)
    // Afetr round 1, [1, 5] is sorted
    // step2.1: Compare 4 < 5
    // step2.2: Compare 1 < 4 -> [1, 4, 5]
    // After round 2, [1, 4, 5] is sorted
    // ...
    int[] arr = new int[] {5, 1, 4, 8, 2};
    sort(arr);

      for (int i : arr)
      {System.out.println(i);

      }
    }

  public static int[] sort(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
      int min = i;
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[min] > arr[j]) {
          min = j;
        }
      }
      int temp = arr[i];
      arr[i] = arr[min];
      arr[min] = temp;
    }
    return arr;
  }
}

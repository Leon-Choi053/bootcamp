public class ForEach {
  public static void main(String[] args) {
    // basic for-loop
    for (int i = 0; i < 3; i++) {
      System.out.println("hello");
    }
    // For-each
    int[] arr = new int[] {200, 100, 3, 4}; // loop through all elements
    // for (type element :dataset)
    // Difference of for-each
    // 1. for-each do not have stop condition/counter in loop signature
    for (int x : arr) {
      System.out.println("for-each: hello, x= " + x);
      System.out.println(arr[0]); // but you still access element by index
      // modification
      arr[0] = 8;
    }
    for (int i = 0; i < arr.length; i++) { // counter
      if (i > arr.length / 2 - 1) {
        break;
      }
      System.out.println("for-each: hello");
      System.out.println("" + arr[i] + arr.length);
    }

    String[] str = new String[] {"hello", "world"};
    for (String str2 : str) {
      System.out.println(str2);
    }

    Character[] cha = new Character[] {'a', 'G', '!', ']'};
    for (Character c : cha) {
      System.out.println(c);
    }

    char[] y = new char[] {'a', '!'};
    for (int a : y) {
      System.out.println(a);
    }

    String s2 = "Hello world! I am Leon";
    String[] strings = s2.split(" "); // use " " to split the String s2
    for (String s : strings) {
      System.out.println(s);
    }
    // without using split, use for loop to split s2
    // output: String[]
    // 1.substring()
    // 2.toCharArray()
    String s = "Hello world ! I am Leon";
    char[] chars = s.toCharArray();
    for (int i = 0; i < s.length(); i++) {
      while (i < s.length()) {
        int j = s.indexOf(' ', i);
        if (j < 0) {
          j = s.length();
        }
        String word = s.substring(i, j);
        System.out.println(word);
        i = j + 1;
      }
    }
  }
}

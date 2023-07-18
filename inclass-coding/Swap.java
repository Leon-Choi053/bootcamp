public class Swap {
  public static void main(String[] args) {
    int[] arr = new int[] {100, -400, 3, 99};
    // code here ... to swap 100 and 99
    int temp = arr[0];
    // arr[0] = arr[3];
    // arr[3] = temp;
    arr[0] = arr[arr.length - 1]; //same as above
    arr[arr.length - 1] = temp; //same as above
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i] + " ");
    }
    // hello! -> ehll!o
    String str1 = "hello!";
    String output1 = SwapOddEvenCharacter(str1);
    System.out.println(output1);
    // abcd -> badc
    String str2 = "abcd";
    String output2 = SwapOddEvenCharacter(str2);
    System.out.println(output2);
    // aabb -> aabb
    String str3 = "aabb";
    String output3 = SwapOddEvenCharacter(str3);
    System.out.println(output3);
    // abcdef -> badcfe
    String str4 = "abcdef";
    String output4 = SwapOddEvenCharacter(str4);
    System.out.println(output4);
    // abc -> bac
    String str5 = "abc";
    String output5 = SwapOddEvenCharacter(str5);
    System.out.println(output5);
    // c -> c
    String str6 = "c";
    String output6 = SwapOddEvenCharacter(str6);
    System.out.println(output6);
  }

  public static String SwapOddEvenCharacter(String str) {
    char[] chars = str.toCharArray();
    for (int i = 0; i < chars.length - 1; i += 2) {
        char temp = chars[i];
        chars[i] = chars[i + 1];
        chars[i + 1] = temp;
    }
    return new String(chars);
    }
}

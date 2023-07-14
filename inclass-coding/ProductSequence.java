public class ProductSequence {
  public static void main(String[] args) {
    //0,1,2,3,4,5 .....
    //print out 0,2,6,12,20 .....
    //print the first 20 numbers,base on above requirement
    for (int i = 0; i < 20; ++i) {
      int num = i * (i + 1);
      System.out.print(num + " ");
    }




  }
}

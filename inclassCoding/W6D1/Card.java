package inclassCoding.W6D1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Card extends Paper {
  int num;

  public Card(int num, int size) {
    super(size);
    this.num = num;
  }

  @Override
  public String toString() {
    return "[number=" + this.num + ", size=" + super.size + "]";
  }

  public static void main(String[] args) {
    List<Card> cards = Arrays.asList(new Card(1, 2), new Card(4, 3));
    Collections.sort(cards, new SortBySize());
    System.out.println(cards);

    List<? extends Number>numbers = new ArrayList<Integer>();
    numbers = new ArrayList<Double>();

    Number number = Integer.valueOf(10);
    number = Double.valueOf(2.3);
  }
}

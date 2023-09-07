package inclassCoding.W7D5.poker;

import java.util.PrimitiveIterator;
import inclassCoding.W4D1.C;

public class Card {
  private Rank rank;
  private Suit suit;

  private Card(Rank rank, Suit suit){
    this.rank = rank;
    this.suit = suit;
  }

  public static Card of (Rank rank, Suit suit) { // 1-13, 4 suits
    return new Card(rank, suit);
  }

  public Rank getRank() {
    return this.rank;
  }

  public Suit getSuit() {
    return this.suit;
  }

  public static int compare(Card card) {
    
  }

  // public static Joker Joker(){
  //   return Joker.JOKER;
  // }


}

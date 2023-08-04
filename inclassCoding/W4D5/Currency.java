package inclassCoding.W4D5;

public enum Currency {
  USD(1, "US Dollor"), 
  HKD(2, "Hong Kong Dollor"), 
  JPY(3,"Japanese Yen"), 
  GBP(4, "Great British Pound"),
  ;

  private int Id;
  private String description;

  private Currency(int Id, String description) {
    this.Id = Id;
    this.description = description;
  }

  public String getDes() {
    return this.description;
  }

  public int getId() {
    return this.Id;
  }

  public static Currency getCurr(int Id) {
    // value
    for (Currency currency : Currency.values()) {
      if (currency.Id == Id) {
        return currency;
      }
    }
    return null;
  }

  public static void main(String[] args) {
    // valueOf
    System.out.println(Currency.valueOf("HKD").getDes());
  }
}

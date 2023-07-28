package inclassCoding.W3D3.Order;
  
public class ItemDesc {
  private String header;
  private String body;

  public ItemDesc(String header, String body){
    this.header = header;
    this.body = body;
  }

  public static void main(String[] args) {
    ItemDesc itemDesc1 = new ItemDesc("Item a","90% Discount, just for today");
    ItemDesc itemDesc2 = new ItemDesc("Item b","70% Discount, just for today");
    Transaction t = new Transaction(1, itemDesc1, 3, 10.5);
    Transaction t2 = new Transaction(1, itemDesc2, 4, 20.5);
    Order order = new Order(new Transaction[]{t, t2});

  }

}

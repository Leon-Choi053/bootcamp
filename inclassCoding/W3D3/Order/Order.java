package inclassCoding.W3D3.Order;

public class Order {

  private Transaction[] transactions;

  public Order(Transaction[] transactions){
    //pass by reference
    this.transactions = transactions;
  }

  // getTotal() -> sum up subtotal
  
}

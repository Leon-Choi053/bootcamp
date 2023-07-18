public class Invoice {

  // A method to calculate total prices for an item
  public static double calcTotalItemPrice(int quantity, double unitPrice) {
    return quantity * unitPrice;
  }

  // A method to calculate total amount of the invoice
  public static double calcTotalInvoiceAmount(double[] totalItemPrices) {
    double total = 0.0d;
    for (int i = 0; i < totalItemPrices.length; i++) {
      total += totalItemPrices[i];
    }
    return total;
  }

  public static void main(String[] args) {
    int[] quantities = new int[] {5, 10, 4, 7, 20};
    double[] unitPrices = new double[] {10.9, 100.3, 2.1, 9.0, 1000.3};

    double[] totalItemPrices = new double[unitPrices.length];

    for (int i = 0; i < totalItemPrices.length; i++) {
      totalItemPrices[i] = calcTotalItemPrice(quantities[i], unitPrices[i]);
    }
    double invoiceTotalAmount = calcTotalInvoiceAmount(totalItemPrices);
    System.out.println("the total invoice price is " + invoiceTotalAmount);
  }
}

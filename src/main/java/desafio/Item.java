package desafio;

public class Item {
  private String name;
  private int unitaryPrice;
  private int quantity;

  public Item() {
  }

  public Item(String name, int unitaryPrice, int quantity) {
    this.name = name;
    this.unitaryPrice = unitaryPrice;
    this.quantity = quantity;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getUnitaryPrice() {
    return unitaryPrice;
  }

  public void setUnitaryPrice(int unitaryPrice) {
    this.unitaryPrice = unitaryPrice;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }
}
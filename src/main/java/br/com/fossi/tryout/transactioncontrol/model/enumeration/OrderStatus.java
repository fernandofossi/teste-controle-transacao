package br.com.fossi.tryout.transactioncontrol.model.enumeration;

public enum OrderStatus {
  PLACED("placed"),
  
  APPROVED("approved"),
  
  DELIVERED("delivered");

  private String value;

  OrderStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static OrderStatus fromValue(String value) {
    for (OrderStatus b : OrderStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

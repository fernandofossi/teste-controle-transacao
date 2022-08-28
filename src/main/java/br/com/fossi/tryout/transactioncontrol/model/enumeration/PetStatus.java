package br.com.fossi.tryout.transactioncontrol.model.enumeration;

public enum PetStatus {
  AVAILABLE("available"),
  
  PENDING("pending"),
  
  SOLD("sold");

  private String value;

  PetStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PetStatus fromValue(String value) {
    for (PetStatus b : PetStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

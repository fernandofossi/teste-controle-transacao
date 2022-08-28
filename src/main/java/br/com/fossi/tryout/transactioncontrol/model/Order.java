package br.com.fossi.tryout.transactioncontrol.model;

import java.time.LocalDateTime;
import br.com.fossi.tryout.transactioncontrol.model.enumeration.OrderStatus;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
public class Order {

  private Long id;
  private Long petId;
  private Integer quantity;
  private LocalDateTime shipDate;
  private OrderStatus status;
  private Boolean complete;

  public Order id(Long id) {
    this.id = id;
    return this;
  }

  public Order petId(Long petId) {
    this.petId = petId;
    return this;
  }

  public Order quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

  public Order shipDate(LocalDateTime shipDate) {
    this.shipDate = shipDate;
    return this;
  }

  public Order status(OrderStatus status) {
    this.status = status;
    return this;
  }

  public Order complete(Boolean complete) {
    this.complete = complete;
    return this;
  }
}


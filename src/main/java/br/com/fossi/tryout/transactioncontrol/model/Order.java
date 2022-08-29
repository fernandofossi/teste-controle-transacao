package br.com.fossi.tryout.transactioncontrol.model;

import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import br.com.fossi.tryout.transactioncontrol.model.enumeration.OrderStatus;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
@Entity
@Table(name = "orders")
public class Order {
  @Id
  @GeneratedValue(
      strategy = GenerationType.AUTO)
  private Long id;
  @OneToOne
  @JoinColumn(
      name = "pet_id",
      referencedColumnName = "id")
  private Pet pet;
  private Integer quantity;
  private LocalDateTime shipDate;
  private OrderStatus status;
  private Boolean complete;

  public Order id(
      Long id) {
    this.id = id;
    return this;
  }

  public Order pet(
      Pet pet) {
    this.pet = pet;
    return this;
  }

  public Order quantity(
      Integer quantity) {
    this.quantity = quantity;
    return this;
  }

  public Order shipDate(
      LocalDateTime shipDate) {
    this.shipDate = shipDate;
    return this;
  }

  public Order status(
      OrderStatus status) {
    this.status = status;
    return this;
  }

  public Order complete(
      Boolean complete) {
    this.complete = complete;
    return this;
  }
}

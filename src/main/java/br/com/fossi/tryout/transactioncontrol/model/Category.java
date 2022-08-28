package br.com.fossi.tryout.transactioncontrol.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
public class Category {

  private Long id;
  private String name;

  public Category id(Long id) {
    this.id = id;
    return this;
  }

  public Category name(String name) {
    this.name = name;
    return this;
  }

}


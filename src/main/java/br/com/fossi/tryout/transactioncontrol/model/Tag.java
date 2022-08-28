package br.com.fossi.tryout.transactioncontrol.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
public class Tag {

  private Long id;
  private String name;

  public Tag id(Long id) {
    this.id = id;
    return this;
  }

  public Tag name(String name) {
    this.name = name;
    return this;
  }
}


package br.com.fossi.tryout.transactioncontrol.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "tags")
public class Tag {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
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


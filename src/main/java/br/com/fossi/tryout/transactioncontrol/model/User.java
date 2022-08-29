package br.com.fossi.tryout.transactioncontrol.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
@Entity
@Table(name = "users")
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String username;
  private String firstName;
  private String lastName;
  private String email;
  private String password;
  private String phone;
  private Integer userStatus;

  public User id(Long id) {
    this.id = id;
    return this;
  }

  public User username(String username) {
    this.username = username;
    return this;
  }

  public User firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  public User lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  public User email(String email) {
    this.email = email;
    return this;
  }

  public User password(String password) {
    this.password = password;
    return this;
  }

  public User phone(String phone) {
    this.phone = phone;
    return this;
  }

  public User userStatus(Integer userStatus) {
    this.userStatus = userStatus;
    return this;
  }
}


package br.com.fossi.tryout.transactioncontrol.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "photos_urls")
public class PhotoUrl {
  @Id
  @GeneratedValue(
      strategy = GenerationType.AUTO)
  private Long id;
  private String url;
  @ManyToOne
  @JoinColumn(
      name = "pet_id",
      nullable = false)
  private Pet pet;
}

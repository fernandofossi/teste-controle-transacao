package br.com.fossi.tryout.transactioncontrol.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import br.com.fossi.tryout.transactioncontrol.model.enumeration.PetStatus;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
@Entity
@Table(name = "pets")
public class Pet {
  @Id
  @GeneratedValue(
      strategy = GenerationType.AUTO)
  private Long id;
  @ManyToOne
  @JoinColumn(
      name = "category_id",
      referencedColumnName = "id",
      nullable = false)
  private Category category;
  private String name;
  @OneToMany(
      mappedBy = "pet")
  private List<PhotoUrl> photoUrls;
  @ManyToMany
  @JoinTable(
      name = "pet_tags",
      joinColumns = @JoinColumn(
          name = "pet_id"),
      inverseJoinColumns = @JoinColumn(
          name = "tag_id"))
  private List<Tag> tags = null;
  private PetStatus status;

  public Pet id(
      Long id) {
    this.id = id;
    return this;
  }

  public Pet category(
      Category category) {
    this.category = category;
    return this;
  }

  public Pet name(
      String name) {
    this.name = name;
    return this;
  }

  public Pet photoUrls(
      List<PhotoUrl> photoUrls) {
    this.photoUrls = photoUrls;
    return this;
  }

  public Pet addPhotoUrlsItem(
      PhotoUrl photoUrlsItem) {
    if (this.photoUrls == null) {
      this.photoUrls = new ArrayList<>();
    }
    this.photoUrls.add(photoUrlsItem);
    return this;
  }

  public Pet tags(
      List<Tag> tags) {
    this.tags = tags;
    return this;
  }

  public Pet addTagsItem(
      Tag tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  public Pet status(
      PetStatus status) {
    this.status = status;
    return this;
  }
}

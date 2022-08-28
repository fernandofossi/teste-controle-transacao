package br.com.fossi.tryout.transactioncontrol.model;

import java.util.ArrayList;
import java.util.List;
import br.com.fossi.tryout.transactioncontrol.model.enumeration.PetStatus;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
public class Pet {

  private Long id;
  private Category category;
  private String name;
  private List<String> photoUrls = new ArrayList<>();
  private List<Tag> tags = null;
  private PetStatus status;

  public Pet id(Long id) {
    this.id = id;
    return this;
  }

  public Pet category(Category category) {
    this.category = category;
    return this;
  }

  public Pet name(String name) {
    this.name = name;
    return this;
  }

  public Pet photoUrls(List<String> photoUrls) {
    this.photoUrls = photoUrls;
    return this;
  }

  public Pet addPhotoUrlsItem(String photoUrlsItem) {
    this.photoUrls.add(photoUrlsItem);
    return this;
  }

  public Pet tags(List<Tag> tags) {
    this.tags = tags;
    return this;
  }

  public Pet addTagsItem(Tag tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  public Pet status(PetStatus status) {
    this.status = status;
    return this;
  }
}


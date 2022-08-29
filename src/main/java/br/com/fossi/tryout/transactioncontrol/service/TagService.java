package br.com.fossi.tryout.transactioncontrol.service;

import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.fossi.tryout.transactioncontrol.model.Tag;
import br.com.fossi.tryout.transactioncontrol.repository.TagRepository;

@Service
public class TagService {

  @Autowired
  private TagRepository tagRepository;
  
  public Tag getOrCreate(
      String name) {
    return tagRepository
        .findByName(name)
        .orElse(
            new Tag()
                .name(name));
  }

  public void save(Collection<Tag> tags){
    tagRepository.saveAll(tags);
  }
}

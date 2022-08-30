package br.com.fossi.tryout.transactioncontrol.service;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import br.com.fossi.tryout.transactioncontrol.model.Category;
import br.com.fossi.tryout.transactioncontrol.model.Pet;
import br.com.fossi.tryout.transactioncontrol.model.Tag;
import br.com.fossi.tryout.transactioncontrol.repository.PetRepository;

@Service
public class PetService {
  @Autowired
  private PetRepository petRepository;

  @Autowired
  private TagService tagService;

  @Autowired
  private CategoryService categoryService;

  public void save(
      Pet pet) {
    petRepository.save(pet);
  }

  public Pet init(
      Pet body) {
    Pet pet = new Pet()
        .name(body.getName())
        .status(body.getStatus());
    petRepository.save(pet);
    return pet;
  }

  @Async
  public void process(Pet pet, Pet body) {
    try {
      Thread.sleep(60000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    List<Tag> tags = body
        .getTags()
        .stream()
        .map(tag -> tagService.getOrCreate(tag.getName()))
        .collect(Collectors.toList());
    Category category = categoryService.getOrCreate(body.getCategory().getName());
    pet.setTags(tags);
    pet.setCategory(category);
    categoryService.save(category);
    tagService.save(tags);
    petRepository.save(pet);
  }
}

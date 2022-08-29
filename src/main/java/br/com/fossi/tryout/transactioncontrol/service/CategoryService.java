package br.com.fossi.tryout.transactioncontrol.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.fossi.tryout.transactioncontrol.model.Category;
import br.com.fossi.tryout.transactioncontrol.repository.CategoryRepository;

@Service
public class CategoryService {
  
  @Autowired
  private CategoryRepository categoryRepository;

  public Category getOrCreate(
      String name) {
    return categoryRepository
        .findByName(name)
        .orElse(
            new Category()
                .name(name));
  }

  public void save(Category category){
    categoryRepository.save(category);
  }
}

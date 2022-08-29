package br.com.fossi.tryout.transactioncontrol.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import br.com.fossi.tryout.transactioncontrol.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
  
  public Optional<Category> findByName(String name);
}

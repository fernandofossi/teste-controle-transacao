package br.com.fossi.tryout.transactioncontrol.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import br.com.fossi.tryout.transactioncontrol.model.Tag;

public interface TagRepository extends JpaRepository<Tag, Long> {
  
  public Optional<Tag> findByName(String name);
}

package br.com.fossi.tryout.transactioncontrol.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.fossi.tryout.transactioncontrol.model.Pet;

public interface PetRepository extends JpaRepository<Pet, Long> {
  
}

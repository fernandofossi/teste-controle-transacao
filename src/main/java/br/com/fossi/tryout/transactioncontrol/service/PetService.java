package br.com.fossi.tryout.transactioncontrol.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.fossi.tryout.transactioncontrol.model.Pet;
import br.com.fossi.tryout.transactioncontrol.repository.PetRepository;

@Service
public class PetService {
  @Autowired
  private PetRepository petRepository;

  public void save(
      Pet pet) {
    petRepository.save(pet);
  }
}

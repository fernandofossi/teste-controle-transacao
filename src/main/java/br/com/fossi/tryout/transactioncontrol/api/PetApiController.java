package br.com.fossi.tryout.transactioncontrol.api;

import java.util.Optional;
import javax.annotation.Generated;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;
import br.com.fossi.tryout.transactioncontrol.model.Pet;
import br.com.fossi.tryout.transactioncontrol.service.PetService;

@Generated(
    value = "org.openapitools.codegen.languages.SpringCodegen",
    date = "2022-08-28T09:43:06.063-03:00[America/Sao_Paulo]")
@Controller
@RequestMapping("/api/v1")
public class PetApiController implements PetApi {
  private final NativeWebRequest request;

  @Autowired
  private PetService petService;

  @Autowired
  public PetApiController(
      NativeWebRequest request) {
    this.request = request;
  }

  @Override
  public Optional<NativeWebRequest> getRequest() {
    return Optional.ofNullable(request);
  }

  @Override
  public ResponseEntity<Void> addPet(
      @Valid
      Pet body) {
    Pet pet = petService.init(body);
    petService.process(pet, body);
    return ResponseEntity.ok().build();
  }
}

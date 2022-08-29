package br.com.fossi.tryout.transactioncontrol.api;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import javax.annotation.Generated;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;
import br.com.fossi.tryout.transactioncontrol.model.Category;
import br.com.fossi.tryout.transactioncontrol.model.Pet;
import br.com.fossi.tryout.transactioncontrol.model.Tag;
import br.com.fossi.tryout.transactioncontrol.service.CategoryService;
import br.com.fossi.tryout.transactioncontrol.service.PetService;
import br.com.fossi.tryout.transactioncontrol.service.TagService;

@Generated(
    value = "org.openapitools.codegen.languages.SpringCodegen",
    date = "2022-08-28T09:43:06.063-03:00[America/Sao_Paulo]")
@Controller
@RequestMapping("/api/v1")
public class PetApiController implements PetApi {
  private final NativeWebRequest request;

  @Autowired
  private TagService tagService;

  @Autowired
  private CategoryService categoryService;

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
    List<Tag> tags = body
        .getTags()
        .stream()
        .map(tag -> tagService.getOrCreate(tag.getName()))
        .collect(Collectors.toList());
    Category category = categoryService.getOrCreate(body.getCategory().getName());
    body.setTags(tags);
    body.setCategory(category);
    categoryService.save(category);
    tagService.save(tags);
    petService.save(body);
    return ResponseEntity.ok().build();
  }
}

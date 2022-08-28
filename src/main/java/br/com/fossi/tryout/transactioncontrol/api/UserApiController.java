package br.com.fossi.tryout.transactioncontrol.api;

import java.util.Optional;
import javax.annotation.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;

@Generated(
    value = "org.openapitools.codegen.languages.SpringCodegen",
    date = "2022-08-28T09:43:06.063-03:00[America/Sao_Paulo]")
@Controller
@RequestMapping("/api/v1")
public class UserApiController implements UserApi {
  private final NativeWebRequest request;

  @Autowired
  public UserApiController(
      NativeWebRequest request) {
    this.request = request;
  }

  @Override
  public Optional<NativeWebRequest> getRequest() {
    return Optional.ofNullable(request);
  }
}

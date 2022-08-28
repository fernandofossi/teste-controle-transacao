package br.com.fossi.tryout.transactioncontrol.api.dto;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@JsonTypeName("ApiResponse")
@Generated(
    value = "org.openapitools.codegen.languages.SpringCodegen",
    date = "2022-08-28T10:55:29.519-03:00[America/Sao_Paulo]")
@Getter
@Setter
@EqualsAndHashCode
public class ApiResponse {
  private Integer code;
  private String type;
  private String message;

  public ApiResponse code(
      Integer code) {
    this.code = code;
    return this;
  }

  public ApiResponse type(
      String type) {
    this.type = type;
    return this;
  }

  public ApiResponse message(
      String message) {
    this.message = message;
    return this;
  }
}

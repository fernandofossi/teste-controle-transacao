package br.com.fossi.tryout.transactioncontrol.api;

import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.NativeWebRequest;
import br.com.fossi.tryout.transactioncontrol.model.User;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;

@Generated(
    value = "org.openapitools.codegen.languages.SpringCodegen",
    date = "2022-08-28T09:43:06.063-03:00[America/Sao_Paulo]")
@Validated
@Tag(
    name = "user",
    description = "Operations about user")
public interface UserApi {
  default Optional<NativeWebRequest> getRequest() {
    return Optional.empty();
  }

  /**
   * POST /user : Create user This can only be done by the logged in user.
   *
   * @param body Created user object (required)
   * @return successful operation (status code 200)
   */
  @Operation(
      operationId = "createUser",
      summary = "Create user",
      tags = {
          "user"
      },
      responses = {
          @ApiResponse(
              responseCode = "200",
              description = "successful operation")
      })
  @RequestMapping(
      method = RequestMethod.POST,
      value = "/user",
      consumes = {
          "application/json"
      })
  default ResponseEntity<Void> createUser(
      @Parameter(
          name = "body",
          description = "Created user object",
          required = true)
      @Valid
      @RequestBody
      User body) {
    return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
  }

  /**
   * POST /user/createWithArray : Creates list of users with given input array
   *
   * @param body List of user object (required)
   * @return successful operation (status code 200)
   */
  @Operation(
      operationId = "createUsersWithArrayInput",
      summary = "Creates list of users with given input array",
      tags = {
          "user"
      },
      responses = {
          @ApiResponse(
              responseCode = "200",
              description = "successful operation")
      })
  @RequestMapping(
      method = RequestMethod.POST,
      value = "/user/createWithArray",
      consumes = {
          "application/json"
      })
  default ResponseEntity<Void> createUsersWithArrayInput(
      @Parameter(
          name = "body",
          description = "List of user object",
          required = true)
      @Valid
      @RequestBody
      List<User> body) {
    return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
  }

  /**
   * POST /user/createWithList : Creates list of users with given input array
   *
   * @param body List of user object (required)
   * @return successful operation (status code 200)
   */
  @Operation(
      operationId = "createUsersWithListInput",
      summary = "Creates list of users with given input array",
      tags = {
          "user"
      },
      responses = {
          @ApiResponse(
              responseCode = "200",
              description = "successful operation")
      })
  @RequestMapping(
      method = RequestMethod.POST,
      value = "/user/createWithList",
      consumes = {
          "application/json"
      })
  default ResponseEntity<Void> createUsersWithListInput(
      @Parameter(
          name = "body",
          description = "List of user object",
          required = true)
      @Valid
      @RequestBody
      List<User> body) {
    return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
  }

  /**
   * DELETE /user/{username} : Delete user This can only be done by the logged in user.
   *
   * @param username The name that needs to be deleted (required)
   * @return Invalid username supplied (status code 400) or User not found (status code 404)
   */
  @Operation(
      operationId = "deleteUser",
      summary = "Delete user",
      tags = {
          "user"
      },
      responses = {
          @ApiResponse(
              responseCode = "400",
              description = "Invalid username supplied"),
          @ApiResponse(
              responseCode = "404",
              description = "User not found")
      })
  @RequestMapping(
      method = RequestMethod.DELETE,
      value = "/user/{username}")
  default ResponseEntity<Void> deleteUser(
      @Parameter(
          name = "username",
          description = "The name that needs to be deleted",
          required = true)
      @PathVariable("username")
      String username) {
    return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
  }

  /**
   * GET /user/{username} : Get user by user name
   *
   * @param username The name that needs to be fetched. Use user1 for testing. (required)
   * @return successful operation (status code 200) or Invalid username supplied (status code 400)
   *         or User not found (status code 404)
   */
  @Operation(
      operationId = "getUserByName",
      summary = "Get user by user name",
      tags = {
          "user"
      },
      responses = {
          @ApiResponse(
              responseCode = "200",
              description = "successful operation",
              content = {
                  @Content(
                      mediaType = "application/json",
                      schema = @Schema(
                          implementation = User.class)),
                  @Content(
                      mediaType = "application/xml",
                      schema = @Schema(
                          implementation = User.class))
              }),
          @ApiResponse(
              responseCode = "400",
              description = "Invalid username supplied"),
          @ApiResponse(
              responseCode = "404",
              description = "User not found")
      })
  @RequestMapping(
      method = RequestMethod.GET,
      value = "/user/{username}",
      produces = {
          "application/json", "application/xml"
      })
  default ResponseEntity<User> getUserByName(
      @Parameter(
          name = "username",
          description = "The name that needs to be fetched. Use user1 for testing. ",
          required = true)
      @PathVariable("username")
      String username) {
    return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
  }

  /**
   * GET /user/login : Logs user into the system
   *
   * @param username The user name for login (required)
   * @param password The password for login in clear text (required)
   * @return successful operation (status code 200) or Invalid username/password supplied (status
   *         code 400)
   */
  @Operation(
      operationId = "loginUser",
      summary = "Logs user into the system",
      tags = {
          "user"
      },
      responses = {
          @ApiResponse(
              responseCode = "200",
              description = "successful operation",
              content = {
                  @Content(
                      mediaType = "application/json",
                      schema = @Schema(
                          implementation = String.class)),
                  @Content(
                      mediaType = "application/xml",
                      schema = @Schema(
                          implementation = String.class))
              }),
          @ApiResponse(
              responseCode = "400",
              description = "Invalid username/password supplied")
      })
  @RequestMapping(
      method = RequestMethod.GET,
      value = "/user/login",
      produces = {
          "application/json", "application/xml"
      })
  default ResponseEntity<String> loginUser(
      @NotNull
      @Parameter(
          name = "username",
          description = "The user name for login",
          required = true)
      @Valid
      @RequestParam(
          value = "username",
          required = true)
      String username,
      @NotNull
      @Parameter(
          name = "password",
          description = "The password for login in clear text",
          required = true)
      @Valid
      @RequestParam(
          value = "password",
          required = true)
      String password) {
    return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
  }

  /**
   * GET /user/logout : Logs out current logged in user session
   *
   * @return successful operation (status code 200)
   */
  @Operation(
      operationId = "logoutUser",
      summary = "Logs out current logged in user session",
      tags = {
          "user"
      },
      responses = {
          @ApiResponse(
              responseCode = "200",
              description = "successful operation")
      })
  @RequestMapping(
      method = RequestMethod.GET,
      value = "/user/logout")
  default ResponseEntity<Void> logoutUser() {
    return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
  }

  /**
   * PUT /user/{username} : Updated user This can only be done by the logged in user.
   *
   * @param username name that need to be updated (required)
   * @param body Updated user object (required)
   * @return Invalid user supplied (status code 400) or User not found (status code 404)
   */
  @Operation(
      operationId = "updateUser",
      summary = "Updated user",
      tags = {
          "user"
      },
      responses = {
          @ApiResponse(
              responseCode = "400",
              description = "Invalid user supplied"),
          @ApiResponse(
              responseCode = "404",
              description = "User not found")
      })
  @RequestMapping(
      method = RequestMethod.PUT,
      value = "/user/{username}",
      consumes = {
          "application/json"
      })
  default ResponseEntity<Void> updateUser(
      @Parameter(
          name = "username",
          description = "name that need to be updated",
          required = true)
      @PathVariable("username")
      String username,
      @Parameter(
          name = "body",
          description = "Updated user object",
          required = true)
      @Valid
      @RequestBody
      User body) {
    return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
  }
}

package br.com.fossi.tryout.transactioncontrol.api;

import java.util.List;
import java.util.Optional;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;
import br.com.fossi.tryout.transactioncontrol.model.Pet;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;

@Validated
@Tag(
    name = "pet",
    description = "Everything about your Pets")
public interface PetApi {
  public Optional<NativeWebRequest> getRequest();

  /**
   * POST /pet : Add a new pet to the store
   *
   * @param body Pet object that needs to be added to the store (required)
   * @return Invalid input (status code 405)
   */
  @Operation(
      operationId = "addPet",
      summary = "Add a new pet to the store",
      tags = {
          "pet"
      },
      responses = {
          @ApiResponse(
              responseCode = "405",
              description = "Invalid input")
      })
  @RequestMapping(
      method = RequestMethod.POST,
      value = "/pet",
      consumes = {
          "application/json", "application/xml"
      })
  default ResponseEntity<Void> addPet(
      @Parameter(
          name = "body",
          description = "Pet object that needs to be added to the store",
          required = true)
      @Valid
      @RequestBody
      Pet body) {
    return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
  }

  /**
   * DELETE /pet/{petId} : Deletes a pet
   *
   * @param petId Pet id to delete (required)
   * @param apiKey (optional)
   * @return Invalid ID supplied (status code 400) or Pet not found (status code 404)
   */
  @Operation(
      operationId = "deletePet",
      summary = "Deletes a pet",
      tags = {
          "pet"
      },
      responses = {
          @ApiResponse(
              responseCode = "400",
              description = "Invalid ID supplied"),
          @ApiResponse(
              responseCode = "404",
              description = "Pet not found")
      })
  @RequestMapping(
      method = RequestMethod.DELETE,
      value = "/pet/{petId}")
  default ResponseEntity<Void> deletePet(
      @Parameter(
          name = "petId",
          description = "Pet id to delete",
          required = true)
      @PathVariable("petId")
      Long petId,
      @Parameter(
          name = "api_key",
          description = "")
      @RequestHeader(
          value = "api_key",
          required = false)
      String apiKey) {
    return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
  }

  /**
   * GET /pet/findByStatus : Finds Pets by status Multiple status values can be provided with comma
   * separated strings
   *
   * @param status Status values that need to be considered for filter (required)
   * @return successful operation (status code 200) or Invalid status value (status code 400)
   */
  @Operation(
      operationId = "findPetsByStatus",
      summary = "Finds Pets by status",
      tags = {
          "pet"
      },
      responses = {
          @ApiResponse(
              responseCode = "200",
              description = "successful operation",
              content = {
                  @Content(
                      mediaType = "application/json",
                      schema = @Schema(
                          implementation = Pet.class)),
                  @Content(
                      mediaType = "application/xml",
                      schema = @Schema(
                          implementation = Pet.class))
              }),
          @ApiResponse(
              responseCode = "400",
              description = "Invalid status value")
      })
  @RequestMapping(
      method = RequestMethod.GET,
      value = "/pet/findByStatus",
      produces = {
          "application/json", "application/xml"
      })
  default ResponseEntity<List<Pet>> findPetsByStatus(
      @NotNull
      @Parameter(
          name = "status",
          description = "Status values that need to be considered for filter",
          required = true)
      @Valid
      @RequestParam(
          value = "status",
          required = true)
      List<String> status) {
    return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
  }

  /**
   * GET /pet/findByTags : Finds Pets by tags Multiple tags can be provided with comma separated
   * strings. Use tag1, tag2, tag3 for testing.
   *
   * @param tags Tags to filter by (required)
   * @return successful operation (status code 200) or Invalid tag value (status code 400)
   * @deprecated
   */
  @Operation(
      operationId = "findPetsByTags",
      summary = "Finds Pets by tags",
      tags = {
          "pet"
      },
      responses = {
          @ApiResponse(
              responseCode = "200",
              description = "successful operation",
              content = {
                  @Content(
                      mediaType = "application/json",
                      schema = @Schema(
                          implementation = Pet.class)),
                  @Content(
                      mediaType = "application/xml",
                      schema = @Schema(
                          implementation = Pet.class))
              }),
          @ApiResponse(
              responseCode = "400",
              description = "Invalid tag value")
      })
  @RequestMapping(
      method = RequestMethod.GET,
      value = "/pet/findByTags",
      produces = {
          "application/json", "application/xml"
      })
  default ResponseEntity<List<Pet>> findPetsByTags(
      @NotNull
      @Parameter(
          name = "tags",
          description = "Tags to filter by",
          required = true)
      @Valid
      @RequestParam(
          value = "tags",
          required = true)
      List<String> tags) {
    return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
  }

  /**
   * GET /pet/{petId} : Find pet by ID Returns a single pet
   *
   * @param petId ID of pet to return (required)
   * @return successful operation (status code 200) or Invalid ID supplied (status code 400) or Pet
   *         not found (status code 404)
   */
  @Operation(
      operationId = "getPetById",
      summary = "Find pet by ID",
      tags = {
          "pet"
      },
      responses = {
          @ApiResponse(
              responseCode = "200",
              description = "successful operation",
              content = {
                  @Content(
                      mediaType = "application/json",
                      schema = @Schema(
                          implementation = Pet.class)),
                  @Content(
                      mediaType = "application/xml",
                      schema = @Schema(
                          implementation = Pet.class))
              }),
          @ApiResponse(
              responseCode = "400",
              description = "Invalid ID supplied"),
          @ApiResponse(
              responseCode = "404",
              description = "Pet not found")
      })
  @RequestMapping(
      method = RequestMethod.GET,
      value = "/pet/{petId}",
      produces = {
          "application/json", "application/xml"
      })
  default ResponseEntity<Pet> getPetById(
      @Parameter(
          name = "petId",
          description = "ID of pet to return",
          required = true)
      @PathVariable("petId")
      Long petId) {
    return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
  }

  /**
   * PUT /pet : Update an existing pet
   *
   * @param body Pet object that needs to be added to the store (required)
   * @return Invalid ID supplied (status code 400) or Pet not found (status code 404) or Validation
   *         exception (status code 405)
   */
  @Operation(
      operationId = "updatePet",
      summary = "Update an existing pet",
      tags = {
          "pet"
      },
      responses = {
          @ApiResponse(
              responseCode = "400",
              description = "Invalid ID supplied"),
          @ApiResponse(
              responseCode = "404",
              description = "Pet not found"),
          @ApiResponse(
              responseCode = "405",
              description = "Validation exception")
      })
  @RequestMapping(
      method = RequestMethod.PUT,
      value = "/pet",
      consumes = {
          "application/json", "application/xml"
      })
  default ResponseEntity<Void> updatePet(
      @Parameter(
          name = "body",
          description = "Pet object that needs to be added to the store",
          required = true)
      @Valid
      @RequestBody
      Pet body) {
    return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
  }

  /**
   * POST /pet/{petId} : Updates a pet in the store with form data
   *
   * @param petId ID of pet that needs to be updated (required)
   * @param name Updated name of the pet (optional)
   * @param status Updated status of the pet (optional)
   * @return Invalid input (status code 405)
   */
  @Operation(
      operationId = "updatePetWithForm",
      summary = "Updates a pet in the store with form data",
      tags = {
          "pet"
      },
      responses = {
          @ApiResponse(
              responseCode = "405",
              description = "Invalid input")
      })
  @RequestMapping(
      method = RequestMethod.POST,
      value = "/pet/{petId}",
      consumes = {
          "application/x-www-form-urlencoded"
      })
  default ResponseEntity<Void> updatePetWithForm(
      @Parameter(
          name = "petId",
          description = "ID of pet that needs to be updated",
          required = true)
      @PathVariable("petId")
      Long petId,
      @Parameter(
          name = "name",
          description = "Updated name of the pet")
      @Valid
      @RequestParam(
          value = "name",
          required = false)
      String name,
      @Parameter(
          name = "status",
          description = "Updated status of the pet")
      @Valid
      @RequestParam(
          value = "status",
          required = false)
      String status) {
    return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
  }

  /**
   * POST /pet/{petId}/uploadImage : uploads an image
   *
   * @param petId ID of pet to update (required)
   * @param additionalMetadata Additional data to pass to server (optional)
   * @param file file to upload (optional)
   * @return successful operation (status code 200)
   */
  @Operation(
      operationId = "uploadFile",
      summary = "uploads an image",
      tags = {
          "pet"
      },
      responses = {
          @ApiResponse(
              responseCode = "200",
              description = "successful operation",
              content = {
                  @Content(
                      mediaType = "application/json",
                      schema = @Schema(
                          implementation = ApiResponse.class))
              })
      })
  @RequestMapping(
      method = RequestMethod.POST,
      value = "/pet/{petId}/uploadImage",
      produces = {
          "application/json"
      },
      consumes = {
          "multipart/form-data"
      })
  default ResponseEntity<ApiResponse> uploadFile(
      @Parameter(
          name = "petId",
          description = "ID of pet to update",
          required = true)
      @PathVariable("petId")
      Long petId,
      @Parameter(
          name = "additionalMetadata",
          description = "Additional data to pass to server")
      @Valid
      @RequestParam(
          value = "additionalMetadata",
          required = false)
      String additionalMetadata,
      @Parameter(
          name = "file",
          description = "file to upload")
      @RequestPart(
          value = "file",
          required = false)
      MultipartFile file) {
    return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
  }
}

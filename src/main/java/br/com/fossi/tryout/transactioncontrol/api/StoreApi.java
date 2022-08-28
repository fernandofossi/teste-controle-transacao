package br.com.fossi.tryout.transactioncontrol.api;

import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.NativeWebRequest;
import br.com.fossi.tryout.transactioncontrol.model.Order;
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
    name = "store",
    description = "Access to Petstore orders")
public interface StoreApi {
  public Optional<NativeWebRequest> getRequest();

  /**
   * DELETE /store/order/{orderId} : Delete purchase order by ID For valid response try integer IDs
   * with positive integer value. Negative or non-integer values will generate API errors
   *
   * @param orderId ID of the order that needs to be deleted (required)
   * @return Invalid ID supplied (status code 400) or Order not found (status code 404)
   */
  @Operation(
      operationId = "deleteOrder",
      summary = "Delete purchase order by ID",
      tags = {
          "store"
      },
      responses = {
          @ApiResponse(
              responseCode = "400",
              description = "Invalid ID supplied"),
          @ApiResponse(
              responseCode = "404",
              description = "Order not found")
      })
  @RequestMapping(
      method = RequestMethod.DELETE,
      value = "/store/order/{orderId}")
  default ResponseEntity<Void> deleteOrder(
      @Min(1L)
      @Parameter(
          name = "orderId",
          description = "ID of the order that needs to be deleted",
          required = true)
      @PathVariable("orderId")
      Long orderId) {
    return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
  }

  /**
   * GET /store/inventory : Returns pet inventories by status Returns a map of status codes to
   * quantities
   *
   * @return successful operation (status code 200)
   */
  @Operation(
      operationId = "getInventory",
      summary = "Returns pet inventories by status",
      tags = {
          "store"
      },
      responses = {
          @ApiResponse(
              responseCode = "200",
              description = "successful operation",
              content = {
                  @Content(
                      mediaType = "application/json",
                      schema = @Schema(
                          implementation = Map.class))
              })
      })
  @RequestMapping(
      method = RequestMethod.GET,
      value = "/store/inventory",
      produces = {
          "application/json"
      })
  default ResponseEntity<Map<String, Integer>> getInventory() {
    return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
  }

  /**
   * GET /store/order/{orderId} : Find purchase order by ID For valid response try integer IDs with
   * value &gt;&#x3D; 1 and &lt;&#x3D; 10. Other values will generated exceptions
   *
   * @param orderId ID of pet that needs to be fetched (required)
   * @return successful operation (status code 200) or Invalid ID supplied (status code 400) or
   *         Order not found (status code 404)
   */
  @Operation(
      operationId = "getOrderById",
      summary = "Find purchase order by ID",
      tags = {
          "store"
      },
      responses = {
          @ApiResponse(
              responseCode = "200",
              description = "successful operation",
              content = {
                  @Content(
                      mediaType = "application/json",
                      schema = @Schema(
                          implementation = Order.class)),
                  @Content(
                      mediaType = "application/xml",
                      schema = @Schema(
                          implementation = Order.class))
              }),
          @ApiResponse(
              responseCode = "400",
              description = "Invalid ID supplied"),
          @ApiResponse(
              responseCode = "404",
              description = "Order not found")
      })
  @RequestMapping(
      method = RequestMethod.GET,
      value = "/store/order/{orderId}",
      produces = {
          "application/json", "application/xml"
      })
  default ResponseEntity<Order> getOrderById(
      @Min(1L)
      @Max(10L)
      @Parameter(
          name = "orderId",
          description = "ID of pet that needs to be fetched",
          required = true)
      @PathVariable("orderId")
      Long orderId) {
    return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
  }

  /**
   * POST /store/order : Place an order for a pet
   *
   * @param body order placed for purchasing the pet (required)
   * @return successful operation (status code 200) or Invalid Order (status code 400)
   */
  @Operation(
      operationId = "placeOrder",
      summary = "Place an order for a pet",
      tags = {
          "store"
      },
      responses = {
          @ApiResponse(
              responseCode = "200",
              description = "successful operation",
              content = {
                  @Content(
                      mediaType = "application/json",
                      schema = @Schema(
                          implementation = Order.class)),
                  @Content(
                      mediaType = "application/xml",
                      schema = @Schema(
                          implementation = Order.class))
              }),
          @ApiResponse(
              responseCode = "400",
              description = "Invalid Order")
      })
  @RequestMapping(
      method = RequestMethod.POST,
      value = "/store/order",
      produces = {
          "application/json", "application/xml"
      },
      consumes = {
          "application/json"
      })
  default ResponseEntity<Order> placeOrder(
      @Parameter(
          name = "body",
          description = "order placed for purchasing the pet",
          required = true)
      @Valid
      @RequestBody
      Order body) {
    return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
  }
}

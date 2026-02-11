package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * TicketOfferResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-11T19:32:41.765375324Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class TicketOfferResponse {

  private @Nullable Long id;

  private @Nullable String title;

  private @Nullable String description;

  private @Nullable String imageURL;

  private @Nullable String retailer;

  public TicketOfferResponse id(@Nullable Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public @Nullable Long getId() {
    return id;
  }

  public void setId(@Nullable Long id) {
    this.id = id;
  }

  public TicketOfferResponse title(@Nullable String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
   */
  
  @Schema(name = "title", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("title")
  public @Nullable String getTitle() {
    return title;
  }

  public void setTitle(@Nullable String title) {
    this.title = title;
  }

  public TicketOfferResponse description(@Nullable String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   */
  
  @Schema(name = "description", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public @Nullable String getDescription() {
    return description;
  }

  public void setDescription(@Nullable String description) {
    this.description = description;
  }

  public TicketOfferResponse imageURL(@Nullable String imageURL) {
    this.imageURL = imageURL;
    return this;
  }

  /**
   * Get imageURL
   * @return imageURL
   */
  
  @Schema(name = "imageURL", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("imageURL")
  public @Nullable String getImageURL() {
    return imageURL;
  }

  public void setImageURL(@Nullable String imageURL) {
    this.imageURL = imageURL;
  }

  public TicketOfferResponse retailer(@Nullable String retailer) {
    this.retailer = retailer;
    return this;
  }

  /**
   * Get retailer
   * @return retailer
   */
  
  @Schema(name = "retailer", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("retailer")
  public @Nullable String getRetailer() {
    return retailer;
  }

  public void setRetailer(@Nullable String retailer) {
    this.retailer = retailer;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TicketOfferResponse ticketOfferResponse = (TicketOfferResponse) o;
    return Objects.equals(this.id, ticketOfferResponse.id) &&
        Objects.equals(this.title, ticketOfferResponse.title) &&
        Objects.equals(this.description, ticketOfferResponse.description) &&
        Objects.equals(this.imageURL, ticketOfferResponse.imageURL) &&
        Objects.equals(this.retailer, ticketOfferResponse.retailer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, description, imageURL, retailer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TicketOfferResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    imageURL: ").append(toIndentedString(imageURL)).append("\n");
    sb.append("    retailer: ").append(toIndentedString(retailer)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(@Nullable Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


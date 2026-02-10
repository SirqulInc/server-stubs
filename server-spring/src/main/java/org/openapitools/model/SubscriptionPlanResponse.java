package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AssetShortResponse;
import org.openapitools.model.SubscriptionOptionResponse;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * SubscriptionPlanResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-09T20:58:37.853899731Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class SubscriptionPlanResponse {

  private @Nullable Long id;

  private @Nullable String name;

  private @Nullable String description;

  @Valid
  private List<@Valid SubscriptionOptionResponse> options = new ArrayList<>();

  private @Nullable Double price;

  private @Nullable Double promo;

  private @Nullable Double transactionFee;

  private @Nullable String role;

  private @Nullable Boolean defaultPlan;

  private @Nullable Boolean visible;

  private @Nullable AssetShortResponse image;

  public SubscriptionPlanResponse id(@Nullable Long id) {
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

  public SubscriptionPlanResponse name(@Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  
  @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public @Nullable String getName() {
    return name;
  }

  public void setName(@Nullable String name) {
    this.name = name;
  }

  public SubscriptionPlanResponse description(@Nullable String description) {
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

  public SubscriptionPlanResponse options(List<@Valid SubscriptionOptionResponse> options) {
    this.options = options;
    return this;
  }

  public SubscriptionPlanResponse addOptionsItem(SubscriptionOptionResponse optionsItem) {
    if (this.options == null) {
      this.options = new ArrayList<>();
    }
    this.options.add(optionsItem);
    return this;
  }

  /**
   * Get options
   * @return options
   */
  @Valid 
  @Schema(name = "options", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("options")
  public List<@Valid SubscriptionOptionResponse> getOptions() {
    return options;
  }

  public void setOptions(List<@Valid SubscriptionOptionResponse> options) {
    this.options = options;
  }

  public SubscriptionPlanResponse price(@Nullable Double price) {
    this.price = price;
    return this;
  }

  /**
   * Get price
   * @return price
   */
  
  @Schema(name = "price", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("price")
  public @Nullable Double getPrice() {
    return price;
  }

  public void setPrice(@Nullable Double price) {
    this.price = price;
  }

  public SubscriptionPlanResponse promo(@Nullable Double promo) {
    this.promo = promo;
    return this;
  }

  /**
   * Get promo
   * @return promo
   */
  
  @Schema(name = "promo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("promo")
  public @Nullable Double getPromo() {
    return promo;
  }

  public void setPromo(@Nullable Double promo) {
    this.promo = promo;
  }

  public SubscriptionPlanResponse transactionFee(@Nullable Double transactionFee) {
    this.transactionFee = transactionFee;
    return this;
  }

  /**
   * Get transactionFee
   * @return transactionFee
   */
  
  @Schema(name = "transactionFee", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("transactionFee")
  public @Nullable Double getTransactionFee() {
    return transactionFee;
  }

  public void setTransactionFee(@Nullable Double transactionFee) {
    this.transactionFee = transactionFee;
  }

  public SubscriptionPlanResponse role(@Nullable String role) {
    this.role = role;
    return this;
  }

  /**
   * Get role
   * @return role
   */
  
  @Schema(name = "role", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("role")
  public @Nullable String getRole() {
    return role;
  }

  public void setRole(@Nullable String role) {
    this.role = role;
  }

  public SubscriptionPlanResponse defaultPlan(@Nullable Boolean defaultPlan) {
    this.defaultPlan = defaultPlan;
    return this;
  }

  /**
   * Get defaultPlan
   * @return defaultPlan
   */
  
  @Schema(name = "defaultPlan", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("defaultPlan")
  public @Nullable Boolean getDefaultPlan() {
    return defaultPlan;
  }

  public void setDefaultPlan(@Nullable Boolean defaultPlan) {
    this.defaultPlan = defaultPlan;
  }

  public SubscriptionPlanResponse visible(@Nullable Boolean visible) {
    this.visible = visible;
    return this;
  }

  /**
   * Get visible
   * @return visible
   */
  
  @Schema(name = "visible", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("visible")
  public @Nullable Boolean getVisible() {
    return visible;
  }

  public void setVisible(@Nullable Boolean visible) {
    this.visible = visible;
  }

  public SubscriptionPlanResponse image(@Nullable AssetShortResponse image) {
    this.image = image;
    return this;
  }

  /**
   * Get image
   * @return image
   */
  @Valid 
  @Schema(name = "image", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("image")
  public @Nullable AssetShortResponse getImage() {
    return image;
  }

  public void setImage(@Nullable AssetShortResponse image) {
    this.image = image;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionPlanResponse subscriptionPlanResponse = (SubscriptionPlanResponse) o;
    return Objects.equals(this.id, subscriptionPlanResponse.id) &&
        Objects.equals(this.name, subscriptionPlanResponse.name) &&
        Objects.equals(this.description, subscriptionPlanResponse.description) &&
        Objects.equals(this.options, subscriptionPlanResponse.options) &&
        Objects.equals(this.price, subscriptionPlanResponse.price) &&
        Objects.equals(this.promo, subscriptionPlanResponse.promo) &&
        Objects.equals(this.transactionFee, subscriptionPlanResponse.transactionFee) &&
        Objects.equals(this.role, subscriptionPlanResponse.role) &&
        Objects.equals(this.defaultPlan, subscriptionPlanResponse.defaultPlan) &&
        Objects.equals(this.visible, subscriptionPlanResponse.visible) &&
        Objects.equals(this.image, subscriptionPlanResponse.image);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, options, price, promo, transactionFee, role, defaultPlan, visible, image);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionPlanResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    promo: ").append(toIndentedString(promo)).append("\n");
    sb.append("    transactionFee: ").append(toIndentedString(transactionFee)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    defaultPlan: ").append(toIndentedString(defaultPlan)).append("\n");
    sb.append("    visible: ").append(toIndentedString(visible)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
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


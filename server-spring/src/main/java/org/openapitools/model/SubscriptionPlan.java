package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Asset;
import org.openapitools.model.SubscriptionOption;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * SubscriptionPlan
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-09T20:58:37.853899731Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class SubscriptionPlan {

  private @Nullable Long id;

  private @Nullable Boolean active;

  private @Nullable Boolean valid;

  private @Nullable String name;

  private @Nullable String description;

  @Valid
  private List<@Valid SubscriptionOption> options = new ArrayList<>();

  private @Nullable Double price;

  private @Nullable Double promo;

  private @Nullable Double transactionFee;

  private @Nullable String role;

  private @Nullable Boolean defaultPlan;

  private @Nullable Boolean visible;

  private @Nullable Asset image;

  public SubscriptionPlan id(@Nullable Long id) {
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

  public SubscriptionPlan active(@Nullable Boolean active) {
    this.active = active;
    return this;
  }

  /**
   * Get active
   * @return active
   */
  
  @Schema(name = "active", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("active")
  public @Nullable Boolean getActive() {
    return active;
  }

  public void setActive(@Nullable Boolean active) {
    this.active = active;
  }

  public SubscriptionPlan valid(@Nullable Boolean valid) {
    this.valid = valid;
    return this;
  }

  /**
   * Get valid
   * @return valid
   */
  
  @Schema(name = "valid", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("valid")
  public @Nullable Boolean getValid() {
    return valid;
  }

  public void setValid(@Nullable Boolean valid) {
    this.valid = valid;
  }

  public SubscriptionPlan name(@Nullable String name) {
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

  public SubscriptionPlan description(@Nullable String description) {
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

  public SubscriptionPlan options(List<@Valid SubscriptionOption> options) {
    this.options = options;
    return this;
  }

  public SubscriptionPlan addOptionsItem(SubscriptionOption optionsItem) {
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
  public List<@Valid SubscriptionOption> getOptions() {
    return options;
  }

  public void setOptions(List<@Valid SubscriptionOption> options) {
    this.options = options;
  }

  public SubscriptionPlan price(@Nullable Double price) {
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

  public SubscriptionPlan promo(@Nullable Double promo) {
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

  public SubscriptionPlan transactionFee(@Nullable Double transactionFee) {
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

  public SubscriptionPlan role(@Nullable String role) {
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

  public SubscriptionPlan defaultPlan(@Nullable Boolean defaultPlan) {
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

  public SubscriptionPlan visible(@Nullable Boolean visible) {
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

  public SubscriptionPlan image(@Nullable Asset image) {
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
  public @Nullable Asset getImage() {
    return image;
  }

  public void setImage(@Nullable Asset image) {
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
    SubscriptionPlan subscriptionPlan = (SubscriptionPlan) o;
    return Objects.equals(this.id, subscriptionPlan.id) &&
        Objects.equals(this.active, subscriptionPlan.active) &&
        Objects.equals(this.valid, subscriptionPlan.valid) &&
        Objects.equals(this.name, subscriptionPlan.name) &&
        Objects.equals(this.description, subscriptionPlan.description) &&
        Objects.equals(this.options, subscriptionPlan.options) &&
        Objects.equals(this.price, subscriptionPlan.price) &&
        Objects.equals(this.promo, subscriptionPlan.promo) &&
        Objects.equals(this.transactionFee, subscriptionPlan.transactionFee) &&
        Objects.equals(this.role, subscriptionPlan.role) &&
        Objects.equals(this.defaultPlan, subscriptionPlan.defaultPlan) &&
        Objects.equals(this.visible, subscriptionPlan.visible) &&
        Objects.equals(this.image, subscriptionPlan.image);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, active, valid, name, description, options, price, promo, transactionFee, role, defaultPlan, visible, image);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionPlan {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
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


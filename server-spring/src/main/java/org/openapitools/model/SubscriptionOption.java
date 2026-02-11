package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * SubscriptionOption
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-11T19:32:41.765375324Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class SubscriptionOption {

  private @Nullable Long id;

  private @Nullable Boolean active;

  private @Nullable Boolean valid;

  private @Nullable String name;

  private @Nullable Double price;

  private @Nullable Integer quantity;

  private @Nullable Integer threshold;

  private @Nullable Boolean visible;

  /**
   * Gets or Sets optionType
   */
  public enum OptionTypeEnum {
    MISSION("MISSION"),
    
    LOCATION("LOCATION"),
    
    OFFER("OFFER"),
    
    NOTIFICATION("NOTIFICATION"),
    
    REQUEST("REQUEST"),
    
    STORAGE_S3("STORAGE_S3"),
    
    STORAGE_DB("STORAGE_DB");

    private final String value;

    OptionTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static OptionTypeEnum fromValue(String value) {
      for (OptionTypeEnum b : OptionTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable OptionTypeEnum optionType;

  /**
   * Gets or Sets offerType
   */
  public enum OfferTypeEnum {
    VOUCHER("VOUCHER"),
    
    COUPON("COUPON"),
    
    PRODUCT("PRODUCT"),
    
    MEDIA("MEDIA"),
    
    EVENT("EVENT"),
    
    DEVICE("DEVICE");

    private final String value;

    OfferTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static OfferTypeEnum fromValue(String value) {
      for (OfferTypeEnum b : OfferTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable OfferTypeEnum offerType;

  public SubscriptionOption id(@Nullable Long id) {
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

  public SubscriptionOption active(@Nullable Boolean active) {
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

  public SubscriptionOption valid(@Nullable Boolean valid) {
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

  public SubscriptionOption name(@Nullable String name) {
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

  public SubscriptionOption price(@Nullable Double price) {
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

  public SubscriptionOption quantity(@Nullable Integer quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * Get quantity
   * @return quantity
   */
  
  @Schema(name = "quantity", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("quantity")
  public @Nullable Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(@Nullable Integer quantity) {
    this.quantity = quantity;
  }

  public SubscriptionOption threshold(@Nullable Integer threshold) {
    this.threshold = threshold;
    return this;
  }

  /**
   * Get threshold
   * @return threshold
   */
  
  @Schema(name = "threshold", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("threshold")
  public @Nullable Integer getThreshold() {
    return threshold;
  }

  public void setThreshold(@Nullable Integer threshold) {
    this.threshold = threshold;
  }

  public SubscriptionOption visible(@Nullable Boolean visible) {
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

  public SubscriptionOption optionType(@Nullable OptionTypeEnum optionType) {
    this.optionType = optionType;
    return this;
  }

  /**
   * Get optionType
   * @return optionType
   */
  
  @Schema(name = "optionType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("optionType")
  public @Nullable OptionTypeEnum getOptionType() {
    return optionType;
  }

  public void setOptionType(@Nullable OptionTypeEnum optionType) {
    this.optionType = optionType;
  }

  public SubscriptionOption offerType(@Nullable OfferTypeEnum offerType) {
    this.offerType = offerType;
    return this;
  }

  /**
   * Get offerType
   * @return offerType
   */
  
  @Schema(name = "offerType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("offerType")
  public @Nullable OfferTypeEnum getOfferType() {
    return offerType;
  }

  public void setOfferType(@Nullable OfferTypeEnum offerType) {
    this.offerType = offerType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionOption subscriptionOption = (SubscriptionOption) o;
    return Objects.equals(this.id, subscriptionOption.id) &&
        Objects.equals(this.active, subscriptionOption.active) &&
        Objects.equals(this.valid, subscriptionOption.valid) &&
        Objects.equals(this.name, subscriptionOption.name) &&
        Objects.equals(this.price, subscriptionOption.price) &&
        Objects.equals(this.quantity, subscriptionOption.quantity) &&
        Objects.equals(this.threshold, subscriptionOption.threshold) &&
        Objects.equals(this.visible, subscriptionOption.visible) &&
        Objects.equals(this.optionType, subscriptionOption.optionType) &&
        Objects.equals(this.offerType, subscriptionOption.offerType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, active, valid, name, price, quantity, threshold, visible, optionType, offerType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionOption {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    threshold: ").append(toIndentedString(threshold)).append("\n");
    sb.append("    visible: ").append(toIndentedString(visible)).append("\n");
    sb.append("    optionType: ").append(toIndentedString(optionType)).append("\n");
    sb.append("    offerType: ").append(toIndentedString(offerType)).append("\n");
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


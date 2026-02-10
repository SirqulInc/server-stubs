package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class SubscriptionOption  {
  
  @ApiModelProperty(value = "")

  private Long id;

  @ApiModelProperty(value = "")

  private Boolean active;

  @ApiModelProperty(value = "")

  private Boolean valid;

  @ApiModelProperty(value = "")

  private String name;

  @ApiModelProperty(value = "")

  private Double price;

  @ApiModelProperty(value = "")

  private Integer quantity;

  @ApiModelProperty(value = "")

  private Integer threshold;

  @ApiModelProperty(value = "")

  private Boolean visible;

public enum OptionTypeEnum {

MISSION(String.valueOf("MISSION")), LOCATION(String.valueOf("LOCATION")), OFFER(String.valueOf("OFFER")), NOTIFICATION(String.valueOf("NOTIFICATION")), REQUEST(String.valueOf("REQUEST")), STORAGE_S3(String.valueOf("STORAGE_S3")), STORAGE_DB(String.valueOf("STORAGE_DB"));


    private String value;

    OptionTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
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

  @ApiModelProperty(value = "")

  private OptionTypeEnum optionType;

public enum OfferTypeEnum {

VOUCHER(String.valueOf("VOUCHER")), COUPON(String.valueOf("COUPON")), PRODUCT(String.valueOf("PRODUCT")), MEDIA(String.valueOf("MEDIA")), EVENT(String.valueOf("EVENT")), DEVICE(String.valueOf("DEVICE"));


    private String value;

    OfferTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
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

  @ApiModelProperty(value = "")

  private OfferTypeEnum offerType;
 /**
   * Get id
   * @return id
  **/
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public SubscriptionOption id(Long id) {
    this.id = id;
    return this;
  }

 /**
   * Get active
   * @return active
  **/
  @JsonProperty("active")
  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public SubscriptionOption active(Boolean active) {
    this.active = active;
    return this;
  }

 /**
   * Get valid
   * @return valid
  **/
  @JsonProperty("valid")
  public Boolean getValid() {
    return valid;
  }

  public void setValid(Boolean valid) {
    this.valid = valid;
  }

  public SubscriptionOption valid(Boolean valid) {
    this.valid = valid;
    return this;
  }

 /**
   * Get name
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SubscriptionOption name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get price
   * @return price
  **/
  @JsonProperty("price")
  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public SubscriptionOption price(Double price) {
    this.price = price;
    return this;
  }

 /**
   * Get quantity
   * @return quantity
  **/
  @JsonProperty("quantity")
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public SubscriptionOption quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

 /**
   * Get threshold
   * @return threshold
  **/
  @JsonProperty("threshold")
  public Integer getThreshold() {
    return threshold;
  }

  public void setThreshold(Integer threshold) {
    this.threshold = threshold;
  }

  public SubscriptionOption threshold(Integer threshold) {
    this.threshold = threshold;
    return this;
  }

 /**
   * Get visible
   * @return visible
  **/
  @JsonProperty("visible")
  public Boolean getVisible() {
    return visible;
  }

  public void setVisible(Boolean visible) {
    this.visible = visible;
  }

  public SubscriptionOption visible(Boolean visible) {
    this.visible = visible;
    return this;
  }

 /**
   * Get optionType
   * @return optionType
  **/
  @JsonProperty("optionType")
  public String getOptionType() {
    if (optionType == null) {
      return null;
    }
    return optionType.value();
  }

  public void setOptionType(OptionTypeEnum optionType) {
    this.optionType = optionType;
  }

  public SubscriptionOption optionType(OptionTypeEnum optionType) {
    this.optionType = optionType;
    return this;
  }

 /**
   * Get offerType
   * @return offerType
  **/
  @JsonProperty("offerType")
  public String getOfferType() {
    if (offerType == null) {
      return null;
    }
    return offerType.value();
  }

  public void setOfferType(OfferTypeEnum offerType) {
    this.offerType = offerType;
  }

  public SubscriptionOption offerType(OfferTypeEnum offerType) {
    this.offerType = offerType;
    return this;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


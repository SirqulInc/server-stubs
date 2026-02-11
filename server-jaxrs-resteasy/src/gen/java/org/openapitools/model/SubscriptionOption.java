package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class SubscriptionOption   {
  
  private Long id;
  private Boolean active;
  private Boolean valid;
  private String name;
  private Double price;
  private Integer quantity;
  private Integer threshold;
  private Boolean visible;

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
    private String value;

    OptionTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private OptionTypeEnum optionType;

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
    private String value;

    OfferTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private OfferTypeEnum offerType;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("active")
  public Boolean getActive() {
    return active;
  }
  public void setActive(Boolean active) {
    this.active = active;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("valid")
  public Boolean getValid() {
    return valid;
  }
  public void setValid(Boolean valid) {
    this.valid = valid;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("price")
  public Double getPrice() {
    return price;
  }
  public void setPrice(Double price) {
    this.price = price;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("quantity")
  public Integer getQuantity() {
    return quantity;
  }
  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("threshold")
  public Integer getThreshold() {
    return threshold;
  }
  public void setThreshold(Integer threshold) {
    this.threshold = threshold;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("visible")
  public Boolean getVisible() {
    return visible;
  }
  public void setVisible(Boolean visible) {
    this.visible = visible;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("optionType")
  public OptionTypeEnum getOptionType() {
    return optionType;
  }
  public void setOptionType(OptionTypeEnum optionType) {
    this.optionType = optionType;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("offerType")
  public OfferTypeEnum getOfferType() {
    return offerType;
  }
  public void setOfferType(OfferTypeEnum offerType) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


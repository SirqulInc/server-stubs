package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class SubscriptionOptionResponse  {
  
  @ApiModelProperty(value = "")

  private Long id;

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

  @ApiModelProperty(value = "")

  private String optionType;
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

  public SubscriptionOptionResponse id(Long id) {
    this.id = id;
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

  public SubscriptionOptionResponse name(String name) {
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

  public SubscriptionOptionResponse price(Double price) {
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

  public SubscriptionOptionResponse quantity(Integer quantity) {
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

  public SubscriptionOptionResponse threshold(Integer threshold) {
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

  public SubscriptionOptionResponse visible(Boolean visible) {
    this.visible = visible;
    return this;
  }

 /**
   * Get optionType
   * @return optionType
  **/
  @JsonProperty("optionType")
  public String getOptionType() {
    return optionType;
  }

  public void setOptionType(String optionType) {
    this.optionType = optionType;
  }

  public SubscriptionOptionResponse optionType(String optionType) {
    this.optionType = optionType;
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
    SubscriptionOptionResponse subscriptionOptionResponse = (SubscriptionOptionResponse) o;
    return Objects.equals(this.id, subscriptionOptionResponse.id) &&
        Objects.equals(this.name, subscriptionOptionResponse.name) &&
        Objects.equals(this.price, subscriptionOptionResponse.price) &&
        Objects.equals(this.quantity, subscriptionOptionResponse.quantity) &&
        Objects.equals(this.threshold, subscriptionOptionResponse.threshold) &&
        Objects.equals(this.visible, subscriptionOptionResponse.visible) &&
        Objects.equals(this.optionType, subscriptionOptionResponse.optionType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, price, quantity, threshold, visible, optionType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionOptionResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    threshold: ").append(toIndentedString(threshold)).append("\n");
    sb.append("    visible: ").append(toIndentedString(visible)).append("\n");
    sb.append("    optionType: ").append(toIndentedString(optionType)).append("\n");
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


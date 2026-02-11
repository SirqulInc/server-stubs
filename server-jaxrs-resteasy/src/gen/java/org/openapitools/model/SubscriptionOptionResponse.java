package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class SubscriptionOptionResponse   {
  
  private Long id;
  private String name;
  private Double price;
  private Integer quantity;
  private Integer threshold;
  private Boolean visible;
  private String optionType;

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
  public String getOptionType() {
    return optionType;
  }
  public void setOptionType(String optionType) {
    this.optionType = optionType;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


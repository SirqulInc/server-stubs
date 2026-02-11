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
public class LineItem   {
  
  private String description;
  private String item;
  private Integer pricePerItem;
  private Integer total;
  private Integer tax;
  private Integer quantity;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("item")
  public String getItem() {
    return item;
  }
  public void setItem(String item) {
    this.item = item;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("pricePerItem")
  public Integer getPricePerItem() {
    return pricePerItem;
  }
  public void setPricePerItem(Integer pricePerItem) {
    this.pricePerItem = pricePerItem;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("total")
  public Integer getTotal() {
    return total;
  }
  public void setTotal(Integer total) {
    this.total = total;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("tax")
  public Integer getTax() {
    return tax;
  }
  public void setTax(Integer tax) {
    this.tax = tax;
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LineItem lineItem = (LineItem) o;
    return Objects.equals(this.description, lineItem.description) &&
        Objects.equals(this.item, lineItem.item) &&
        Objects.equals(this.pricePerItem, lineItem.pricePerItem) &&
        Objects.equals(this.total, lineItem.total) &&
        Objects.equals(this.tax, lineItem.tax) &&
        Objects.equals(this.quantity, lineItem.quantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, item, pricePerItem, total, tax, quantity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LineItem {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    item: ").append(toIndentedString(item)).append("\n");
    sb.append("    pricePerItem: ").append(toIndentedString(pricePerItem)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    tax: ").append(toIndentedString(tax)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
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


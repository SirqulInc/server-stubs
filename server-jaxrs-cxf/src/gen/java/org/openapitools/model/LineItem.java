package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class LineItem  {
  
  @ApiModelProperty(value = "")

  private String description;

  @ApiModelProperty(value = "")

  private String item;

  @ApiModelProperty(value = "")

  private Integer pricePerItem;

  @ApiModelProperty(value = "")

  private Integer total;

  @ApiModelProperty(value = "")

  private Integer tax;

  @ApiModelProperty(value = "")

  private Integer quantity;
 /**
   * Get description
   * @return description
  **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public LineItem description(String description) {
    this.description = description;
    return this;
  }

 /**
   * Get item
   * @return item
  **/
  @JsonProperty("item")
  public String getItem() {
    return item;
  }

  public void setItem(String item) {
    this.item = item;
  }

  public LineItem item(String item) {
    this.item = item;
    return this;
  }

 /**
   * Get pricePerItem
   * @return pricePerItem
  **/
  @JsonProperty("pricePerItem")
  public Integer getPricePerItem() {
    return pricePerItem;
  }

  public void setPricePerItem(Integer pricePerItem) {
    this.pricePerItem = pricePerItem;
  }

  public LineItem pricePerItem(Integer pricePerItem) {
    this.pricePerItem = pricePerItem;
    return this;
  }

 /**
   * Get total
   * @return total
  **/
  @JsonProperty("total")
  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }

  public LineItem total(Integer total) {
    this.total = total;
    return this;
  }

 /**
   * Get tax
   * @return tax
  **/
  @JsonProperty("tax")
  public Integer getTax() {
    return tax;
  }

  public void setTax(Integer tax) {
    this.tax = tax;
  }

  public LineItem tax(Integer tax) {
    this.tax = tax;
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

  public LineItem quantity(Integer quantity) {
    this.quantity = quantity;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


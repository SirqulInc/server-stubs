package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.LineItem;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Invoice  {
  
  @ApiModelProperty(value = "")

  private String location;

  @ApiModelProperty(value = "")

  private Integer tax;

  @ApiModelProperty(value = "")

  private Integer total;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid LineItem> lineItems = new ArrayList<>();
 /**
   * Get location
   * @return location
  **/
  @JsonProperty("location")
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public Invoice location(String location) {
    this.location = location;
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

  public Invoice tax(Integer tax) {
    this.tax = tax;
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

  public Invoice total(Integer total) {
    this.total = total;
    return this;
  }

 /**
   * Get lineItems
   * @return lineItems
  **/
  @JsonProperty("lineItems")
  public List<@Valid LineItem> getLineItems() {
    return lineItems;
  }

  public void setLineItems(List<@Valid LineItem> lineItems) {
    this.lineItems = lineItems;
  }

  public Invoice lineItems(List<@Valid LineItem> lineItems) {
    this.lineItems = lineItems;
    return this;
  }

  public Invoice addLineItemsItem(LineItem lineItemsItem) {
    this.lineItems.add(lineItemsItem);
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
    Invoice invoice = (Invoice) o;
    return Objects.equals(this.location, invoice.location) &&
        Objects.equals(this.tax, invoice.tax) &&
        Objects.equals(this.total, invoice.total) &&
        Objects.equals(this.lineItems, invoice.lineItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(location, tax, total, lineItems);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Invoice {\n");
    
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    tax: ").append(toIndentedString(tax)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    lineItems: ").append(toIndentedString(lineItems)).append("\n");
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


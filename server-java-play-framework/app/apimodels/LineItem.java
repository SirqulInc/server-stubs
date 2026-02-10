package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * LineItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class LineItem   {
  @JsonProperty("description")
  
  private String description;

  @JsonProperty("item")
  
  private String item;

  @JsonProperty("pricePerItem")
  
  private Integer pricePerItem;

  @JsonProperty("total")
  
  private Integer total;

  @JsonProperty("tax")
  
  private Integer tax;

  @JsonProperty("quantity")
  
  private Integer quantity;

  public LineItem description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public LineItem item(String item) {
    this.item = item;
    return this;
  }

   /**
   * Get item
   * @return item
  **/
  public String getItem() {
    return item;
  }

  public void setItem(String item) {
    this.item = item;
  }

  public LineItem pricePerItem(Integer pricePerItem) {
    this.pricePerItem = pricePerItem;
    return this;
  }

   /**
   * Get pricePerItem
   * @return pricePerItem
  **/
  public Integer getPricePerItem() {
    return pricePerItem;
  }

  public void setPricePerItem(Integer pricePerItem) {
    this.pricePerItem = pricePerItem;
  }

  public LineItem total(Integer total) {
    this.total = total;
    return this;
  }

   /**
   * Get total
   * @return total
  **/
  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }

  public LineItem tax(Integer tax) {
    this.tax = tax;
    return this;
  }

   /**
   * Get tax
   * @return tax
  **/
  public Integer getTax() {
    return tax;
  }

  public void setTax(Integer tax) {
    this.tax = tax;
  }

  public LineItem quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * Get quantity
   * @return quantity
  **/
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
    return Objects.equals(description, lineItem.description) &&
        Objects.equals(item, lineItem.item) &&
        Objects.equals(pricePerItem, lineItem.pricePerItem) &&
        Objects.equals(total, lineItem.total) &&
        Objects.equals(tax, lineItem.tax) &&
        Objects.equals(quantity, lineItem.quantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, item, pricePerItem, total, tax, quantity);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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


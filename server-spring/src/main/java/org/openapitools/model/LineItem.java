package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * LineItem
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-11T19:32:41.765375324Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class LineItem {

  private @Nullable String description;

  private @Nullable String item;

  private @Nullable Integer pricePerItem;

  private @Nullable Integer total;

  private @Nullable Integer tax;

  private @Nullable Integer quantity;

  public LineItem description(@Nullable String description) {
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

  public LineItem item(@Nullable String item) {
    this.item = item;
    return this;
  }

  /**
   * Get item
   * @return item
   */
  
  @Schema(name = "item", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("item")
  public @Nullable String getItem() {
    return item;
  }

  public void setItem(@Nullable String item) {
    this.item = item;
  }

  public LineItem pricePerItem(@Nullable Integer pricePerItem) {
    this.pricePerItem = pricePerItem;
    return this;
  }

  /**
   * Get pricePerItem
   * @return pricePerItem
   */
  
  @Schema(name = "pricePerItem", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pricePerItem")
  public @Nullable Integer getPricePerItem() {
    return pricePerItem;
  }

  public void setPricePerItem(@Nullable Integer pricePerItem) {
    this.pricePerItem = pricePerItem;
  }

  public LineItem total(@Nullable Integer total) {
    this.total = total;
    return this;
  }

  /**
   * Get total
   * @return total
   */
  
  @Schema(name = "total", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("total")
  public @Nullable Integer getTotal() {
    return total;
  }

  public void setTotal(@Nullable Integer total) {
    this.total = total;
  }

  public LineItem tax(@Nullable Integer tax) {
    this.tax = tax;
    return this;
  }

  /**
   * Get tax
   * @return tax
   */
  
  @Schema(name = "tax", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tax")
  public @Nullable Integer getTax() {
    return tax;
  }

  public void setTax(@Nullable Integer tax) {
    this.tax = tax;
  }

  public LineItem quantity(@Nullable Integer quantity) {
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
  private String toIndentedString(@Nullable Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


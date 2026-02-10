package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ShipmentOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Orders  {
  
  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid ShipmentOrder> orders = new ArrayList<>();
 /**
   * Get orders
   * @return orders
  **/
  @JsonProperty("Orders")
  public List<@Valid ShipmentOrder> getOrders() {
    return orders;
  }

  public void setOrders(List<@Valid ShipmentOrder> orders) {
    this.orders = orders;
  }

  public Orders orders(List<@Valid ShipmentOrder> orders) {
    this.orders = orders;
    return this;
  }

  public Orders addOrdersItem(ShipmentOrder ordersItem) {
    this.orders.add(ordersItem);
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
    Orders orders = (Orders) o;
    return Objects.equals(this.orders, orders.orders);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orders);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Orders {\n");
    
    sb.append("    orders: ").append(toIndentedString(orders)).append("\n");
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


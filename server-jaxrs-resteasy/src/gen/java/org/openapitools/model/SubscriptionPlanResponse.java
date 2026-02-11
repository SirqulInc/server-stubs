package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AssetShortResponse;
import org.openapitools.model.SubscriptionOptionResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class SubscriptionPlanResponse   {
  
  private Long id;
  private String name;
  private String description;
  private List<@Valid SubscriptionOptionResponse> options = new ArrayList<>();
  private Double price;
  private Double promo;
  private Double transactionFee;
  private String role;
  private Boolean defaultPlan;
  private Boolean visible;
  private AssetShortResponse image;

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
  @JsonProperty("options")
  @Valid
  public List<@Valid SubscriptionOptionResponse> getOptions() {
    return options;
  }
  public void setOptions(List<@Valid SubscriptionOptionResponse> options) {
    this.options = options;
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
  @JsonProperty("promo")
  public Double getPromo() {
    return promo;
  }
  public void setPromo(Double promo) {
    this.promo = promo;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("transactionFee")
  public Double getTransactionFee() {
    return transactionFee;
  }
  public void setTransactionFee(Double transactionFee) {
    this.transactionFee = transactionFee;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("role")
  public String getRole() {
    return role;
  }
  public void setRole(String role) {
    this.role = role;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("defaultPlan")
  public Boolean getDefaultPlan() {
    return defaultPlan;
  }
  public void setDefaultPlan(Boolean defaultPlan) {
    this.defaultPlan = defaultPlan;
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
  @JsonProperty("image")
  @Valid
  public AssetShortResponse getImage() {
    return image;
  }
  public void setImage(AssetShortResponse image) {
    this.image = image;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionPlanResponse subscriptionPlanResponse = (SubscriptionPlanResponse) o;
    return Objects.equals(this.id, subscriptionPlanResponse.id) &&
        Objects.equals(this.name, subscriptionPlanResponse.name) &&
        Objects.equals(this.description, subscriptionPlanResponse.description) &&
        Objects.equals(this.options, subscriptionPlanResponse.options) &&
        Objects.equals(this.price, subscriptionPlanResponse.price) &&
        Objects.equals(this.promo, subscriptionPlanResponse.promo) &&
        Objects.equals(this.transactionFee, subscriptionPlanResponse.transactionFee) &&
        Objects.equals(this.role, subscriptionPlanResponse.role) &&
        Objects.equals(this.defaultPlan, subscriptionPlanResponse.defaultPlan) &&
        Objects.equals(this.visible, subscriptionPlanResponse.visible) &&
        Objects.equals(this.image, subscriptionPlanResponse.image);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, options, price, promo, transactionFee, role, defaultPlan, visible, image);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionPlanResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    promo: ").append(toIndentedString(promo)).append("\n");
    sb.append("    transactionFee: ").append(toIndentedString(transactionFee)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    defaultPlan: ").append(toIndentedString(defaultPlan)).append("\n");
    sb.append("    visible: ").append(toIndentedString(visible)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
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


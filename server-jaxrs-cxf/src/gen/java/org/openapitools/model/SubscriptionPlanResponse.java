package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AssetShortResponse;
import org.openapitools.model.SubscriptionOptionResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class SubscriptionPlanResponse  {
  
  @ApiModelProperty(value = "")

  private Long id;

  @ApiModelProperty(value = "")

  private String name;

  @ApiModelProperty(value = "")

  private String description;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid SubscriptionOptionResponse> options = new ArrayList<>();

  @ApiModelProperty(value = "")

  private Double price;

  @ApiModelProperty(value = "")

  private Double promo;

  @ApiModelProperty(value = "")

  private Double transactionFee;

  @ApiModelProperty(value = "")

  private String role;

  @ApiModelProperty(value = "")

  private Boolean defaultPlan;

  @ApiModelProperty(value = "")

  private Boolean visible;

  @ApiModelProperty(value = "")

  @Valid

  private AssetShortResponse image;
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

  public SubscriptionPlanResponse id(Long id) {
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

  public SubscriptionPlanResponse name(String name) {
    this.name = name;
    return this;
  }

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

  public SubscriptionPlanResponse description(String description) {
    this.description = description;
    return this;
  }

 /**
   * Get options
   * @return options
  **/
  @JsonProperty("options")
  public List<@Valid SubscriptionOptionResponse> getOptions() {
    return options;
  }

  public void setOptions(List<@Valid SubscriptionOptionResponse> options) {
    this.options = options;
  }

  public SubscriptionPlanResponse options(List<@Valid SubscriptionOptionResponse> options) {
    this.options = options;
    return this;
  }

  public SubscriptionPlanResponse addOptionsItem(SubscriptionOptionResponse optionsItem) {
    this.options.add(optionsItem);
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

  public SubscriptionPlanResponse price(Double price) {
    this.price = price;
    return this;
  }

 /**
   * Get promo
   * @return promo
  **/
  @JsonProperty("promo")
  public Double getPromo() {
    return promo;
  }

  public void setPromo(Double promo) {
    this.promo = promo;
  }

  public SubscriptionPlanResponse promo(Double promo) {
    this.promo = promo;
    return this;
  }

 /**
   * Get transactionFee
   * @return transactionFee
  **/
  @JsonProperty("transactionFee")
  public Double getTransactionFee() {
    return transactionFee;
  }

  public void setTransactionFee(Double transactionFee) {
    this.transactionFee = transactionFee;
  }

  public SubscriptionPlanResponse transactionFee(Double transactionFee) {
    this.transactionFee = transactionFee;
    return this;
  }

 /**
   * Get role
   * @return role
  **/
  @JsonProperty("role")
  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public SubscriptionPlanResponse role(String role) {
    this.role = role;
    return this;
  }

 /**
   * Get defaultPlan
   * @return defaultPlan
  **/
  @JsonProperty("defaultPlan")
  public Boolean getDefaultPlan() {
    return defaultPlan;
  }

  public void setDefaultPlan(Boolean defaultPlan) {
    this.defaultPlan = defaultPlan;
  }

  public SubscriptionPlanResponse defaultPlan(Boolean defaultPlan) {
    this.defaultPlan = defaultPlan;
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

  public SubscriptionPlanResponse visible(Boolean visible) {
    this.visible = visible;
    return this;
  }

 /**
   * Get image
   * @return image
  **/
  @JsonProperty("image")
  public AssetShortResponse getImage() {
    return image;
  }

  public void setImage(AssetShortResponse image) {
    this.image = image;
  }

  public SubscriptionPlanResponse image(AssetShortResponse image) {
    this.image = image;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


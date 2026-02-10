package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Asset;
import org.openapitools.model.SubscriptionOption;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class SubscriptionPlan  {
  
  @ApiModelProperty(value = "")

  private Long id;

  @ApiModelProperty(value = "")

  private Boolean active;

  @ApiModelProperty(value = "")

  private Boolean valid;

  @ApiModelProperty(value = "")

  private String name;

  @ApiModelProperty(value = "")

  private String description;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid SubscriptionOption> options = new ArrayList<>();

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

  private Asset image;
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

  public SubscriptionPlan id(Long id) {
    this.id = id;
    return this;
  }

 /**
   * Get active
   * @return active
  **/
  @JsonProperty("active")
  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public SubscriptionPlan active(Boolean active) {
    this.active = active;
    return this;
  }

 /**
   * Get valid
   * @return valid
  **/
  @JsonProperty("valid")
  public Boolean getValid() {
    return valid;
  }

  public void setValid(Boolean valid) {
    this.valid = valid;
  }

  public SubscriptionPlan valid(Boolean valid) {
    this.valid = valid;
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

  public SubscriptionPlan name(String name) {
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

  public SubscriptionPlan description(String description) {
    this.description = description;
    return this;
  }

 /**
   * Get options
   * @return options
  **/
  @JsonProperty("options")
  public List<@Valid SubscriptionOption> getOptions() {
    return options;
  }

  public void setOptions(List<@Valid SubscriptionOption> options) {
    this.options = options;
  }

  public SubscriptionPlan options(List<@Valid SubscriptionOption> options) {
    this.options = options;
    return this;
  }

  public SubscriptionPlan addOptionsItem(SubscriptionOption optionsItem) {
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

  public SubscriptionPlan price(Double price) {
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

  public SubscriptionPlan promo(Double promo) {
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

  public SubscriptionPlan transactionFee(Double transactionFee) {
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

  public SubscriptionPlan role(String role) {
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

  public SubscriptionPlan defaultPlan(Boolean defaultPlan) {
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

  public SubscriptionPlan visible(Boolean visible) {
    this.visible = visible;
    return this;
  }

 /**
   * Get image
   * @return image
  **/
  @JsonProperty("image")
  public Asset getImage() {
    return image;
  }

  public void setImage(Asset image) {
    this.image = image;
  }

  public SubscriptionPlan image(Asset image) {
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
    SubscriptionPlan subscriptionPlan = (SubscriptionPlan) o;
    return Objects.equals(this.id, subscriptionPlan.id) &&
        Objects.equals(this.active, subscriptionPlan.active) &&
        Objects.equals(this.valid, subscriptionPlan.valid) &&
        Objects.equals(this.name, subscriptionPlan.name) &&
        Objects.equals(this.description, subscriptionPlan.description) &&
        Objects.equals(this.options, subscriptionPlan.options) &&
        Objects.equals(this.price, subscriptionPlan.price) &&
        Objects.equals(this.promo, subscriptionPlan.promo) &&
        Objects.equals(this.transactionFee, subscriptionPlan.transactionFee) &&
        Objects.equals(this.role, subscriptionPlan.role) &&
        Objects.equals(this.defaultPlan, subscriptionPlan.defaultPlan) &&
        Objects.equals(this.visible, subscriptionPlan.visible) &&
        Objects.equals(this.image, subscriptionPlan.image);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, active, valid, name, description, options, price, promo, transactionFee, role, defaultPlan, visible, image);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionPlan {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
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


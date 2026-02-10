package apimodels;

import apimodels.AssetShortResponse;
import apimodels.SubscriptionOptionResponse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * SubscriptionPlanResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class SubscriptionPlanResponse   {
  @JsonProperty("id")
  
  private Long id;

  @JsonProperty("name")
  
  private String name;

  @JsonProperty("description")
  
  private String description;

  @JsonProperty("options")
  @Valid

  private List<@Valid SubscriptionOptionResponse> options = null;

  @JsonProperty("price")
  
  private Double price;

  @JsonProperty("promo")
  
  private Double promo;

  @JsonProperty("transactionFee")
  
  private Double transactionFee;

  @JsonProperty("role")
  
  private String role;

  @JsonProperty("defaultPlan")
  
  private Boolean defaultPlan;

  @JsonProperty("visible")
  
  private Boolean visible;

  @JsonProperty("image")
  @Valid

  private AssetShortResponse image;

  public SubscriptionPlanResponse id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public SubscriptionPlanResponse name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SubscriptionPlanResponse description(String description) {
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

  public SubscriptionPlanResponse options(List<@Valid SubscriptionOptionResponse> options) {
    this.options = options;
    return this;
  }

  public SubscriptionPlanResponse addOptionsItem(SubscriptionOptionResponse optionsItem) {
    if (this.options == null) {
      this.options = new ArrayList<>();
    }
    this.options.add(optionsItem);
    return this;
  }

   /**
   * Get options
   * @return options
  **/
  public List<@Valid SubscriptionOptionResponse> getOptions() {
    return options;
  }

  public void setOptions(List<@Valid SubscriptionOptionResponse> options) {
    this.options = options;
  }

  public SubscriptionPlanResponse price(Double price) {
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public SubscriptionPlanResponse promo(Double promo) {
    this.promo = promo;
    return this;
  }

   /**
   * Get promo
   * @return promo
  **/
  public Double getPromo() {
    return promo;
  }

  public void setPromo(Double promo) {
    this.promo = promo;
  }

  public SubscriptionPlanResponse transactionFee(Double transactionFee) {
    this.transactionFee = transactionFee;
    return this;
  }

   /**
   * Get transactionFee
   * @return transactionFee
  **/
  public Double getTransactionFee() {
    return transactionFee;
  }

  public void setTransactionFee(Double transactionFee) {
    this.transactionFee = transactionFee;
  }

  public SubscriptionPlanResponse role(String role) {
    this.role = role;
    return this;
  }

   /**
   * Get role
   * @return role
  **/
  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public SubscriptionPlanResponse defaultPlan(Boolean defaultPlan) {
    this.defaultPlan = defaultPlan;
    return this;
  }

   /**
   * Get defaultPlan
   * @return defaultPlan
  **/
  public Boolean getDefaultPlan() {
    return defaultPlan;
  }

  public void setDefaultPlan(Boolean defaultPlan) {
    this.defaultPlan = defaultPlan;
  }

  public SubscriptionPlanResponse visible(Boolean visible) {
    this.visible = visible;
    return this;
  }

   /**
   * Get visible
   * @return visible
  **/
  public Boolean getVisible() {
    return visible;
  }

  public void setVisible(Boolean visible) {
    this.visible = visible;
  }

  public SubscriptionPlanResponse image(AssetShortResponse image) {
    this.image = image;
    return this;
  }

   /**
   * Get image
   * @return image
  **/
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
    return Objects.equals(id, subscriptionPlanResponse.id) &&
        Objects.equals(name, subscriptionPlanResponse.name) &&
        Objects.equals(description, subscriptionPlanResponse.description) &&
        Objects.equals(options, subscriptionPlanResponse.options) &&
        Objects.equals(price, subscriptionPlanResponse.price) &&
        Objects.equals(promo, subscriptionPlanResponse.promo) &&
        Objects.equals(transactionFee, subscriptionPlanResponse.transactionFee) &&
        Objects.equals(role, subscriptionPlanResponse.role) &&
        Objects.equals(defaultPlan, subscriptionPlanResponse.defaultPlan) &&
        Objects.equals(visible, subscriptionPlanResponse.visible) &&
        Objects.equals(image, subscriptionPlanResponse.image);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, options, price, promo, transactionFee, role, defaultPlan, visible, image);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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


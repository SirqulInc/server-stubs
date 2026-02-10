package org.openapitools.model;

import org.openapitools.model.SubscriptionPlanResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class SubscriptionResponse  {
  
  @ApiModelProperty(value = "")

  private Long id;

  @ApiModelProperty(value = "")

  @Valid

  private SubscriptionPlanResponse subscriptionPlan;

  @ApiModelProperty(value = "")

  private String promoCode;

  @ApiModelProperty(value = "")

  private Boolean active;
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

  public SubscriptionResponse id(Long id) {
    this.id = id;
    return this;
  }

 /**
   * Get subscriptionPlan
   * @return subscriptionPlan
  **/
  @JsonProperty("subscriptionPlan")
  public SubscriptionPlanResponse getSubscriptionPlan() {
    return subscriptionPlan;
  }

  public void setSubscriptionPlan(SubscriptionPlanResponse subscriptionPlan) {
    this.subscriptionPlan = subscriptionPlan;
  }

  public SubscriptionResponse subscriptionPlan(SubscriptionPlanResponse subscriptionPlan) {
    this.subscriptionPlan = subscriptionPlan;
    return this;
  }

 /**
   * Get promoCode
   * @return promoCode
  **/
  @JsonProperty("promoCode")
  public String getPromoCode() {
    return promoCode;
  }

  public void setPromoCode(String promoCode) {
    this.promoCode = promoCode;
  }

  public SubscriptionResponse promoCode(String promoCode) {
    this.promoCode = promoCode;
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

  public SubscriptionResponse active(Boolean active) {
    this.active = active;
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
    SubscriptionResponse subscriptionResponse = (SubscriptionResponse) o;
    return Objects.equals(this.id, subscriptionResponse.id) &&
        Objects.equals(this.subscriptionPlan, subscriptionResponse.subscriptionPlan) &&
        Objects.equals(this.promoCode, subscriptionResponse.promoCode) &&
        Objects.equals(this.active, subscriptionResponse.active);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, subscriptionPlan, promoCode, active);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    subscriptionPlan: ").append(toIndentedString(subscriptionPlan)).append("\n");
    sb.append("    promoCode: ").append(toIndentedString(promoCode)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
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


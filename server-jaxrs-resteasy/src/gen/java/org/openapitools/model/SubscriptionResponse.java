package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.SubscriptionPlanResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class SubscriptionResponse   {
  
  private Long id;
  private SubscriptionPlanResponse subscriptionPlan;
  private String promoCode;
  private Boolean active;

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
  @JsonProperty("subscriptionPlan")
  @Valid
  public SubscriptionPlanResponse getSubscriptionPlan() {
    return subscriptionPlan;
  }
  public void setSubscriptionPlan(SubscriptionPlanResponse subscriptionPlan) {
    this.subscriptionPlan = subscriptionPlan;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("promoCode")
  public String getPromoCode() {
    return promoCode;
  }
  public void setPromoCode(String promoCode) {
    this.promoCode = promoCode;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("active")
  public Boolean getActive() {
    return active;
  }
  public void setActive(Boolean active) {
    this.active = active;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


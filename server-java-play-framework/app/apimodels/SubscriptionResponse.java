package apimodels;

import apimodels.SubscriptionPlanResponse;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * SubscriptionResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class SubscriptionResponse   {
  @JsonProperty("id")
  
  private Long id;

  @JsonProperty("subscriptionPlan")
  @Valid

  private SubscriptionPlanResponse subscriptionPlan;

  @JsonProperty("promoCode")
  
  private String promoCode;

  @JsonProperty("active")
  
  private Boolean active;

  public SubscriptionResponse id(Long id) {
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

  public SubscriptionResponse subscriptionPlan(SubscriptionPlanResponse subscriptionPlan) {
    this.subscriptionPlan = subscriptionPlan;
    return this;
  }

   /**
   * Get subscriptionPlan
   * @return subscriptionPlan
  **/
  public SubscriptionPlanResponse getSubscriptionPlan() {
    return subscriptionPlan;
  }

  public void setSubscriptionPlan(SubscriptionPlanResponse subscriptionPlan) {
    this.subscriptionPlan = subscriptionPlan;
  }

  public SubscriptionResponse promoCode(String promoCode) {
    this.promoCode = promoCode;
    return this;
  }

   /**
   * Get promoCode
   * @return promoCode
  **/
  public String getPromoCode() {
    return promoCode;
  }

  public void setPromoCode(String promoCode) {
    this.promoCode = promoCode;
  }

  public SubscriptionResponse active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
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
    return Objects.equals(id, subscriptionResponse.id) &&
        Objects.equals(subscriptionPlan, subscriptionResponse.subscriptionPlan) &&
        Objects.equals(promoCode, subscriptionResponse.promoCode) &&
        Objects.equals(active, subscriptionResponse.active);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, subscriptionPlan, promoCode, active);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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


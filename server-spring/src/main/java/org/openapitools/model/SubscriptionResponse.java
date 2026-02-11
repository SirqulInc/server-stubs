package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.SubscriptionPlanResponse;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * SubscriptionResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-11T19:32:41.765375324Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class SubscriptionResponse {

  private @Nullable Long id;

  private @Nullable SubscriptionPlanResponse subscriptionPlan;

  private @Nullable String promoCode;

  private @Nullable Boolean active;

  public SubscriptionResponse id(@Nullable Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public @Nullable Long getId() {
    return id;
  }

  public void setId(@Nullable Long id) {
    this.id = id;
  }

  public SubscriptionResponse subscriptionPlan(@Nullable SubscriptionPlanResponse subscriptionPlan) {
    this.subscriptionPlan = subscriptionPlan;
    return this;
  }

  /**
   * Get subscriptionPlan
   * @return subscriptionPlan
   */
  @Valid 
  @Schema(name = "subscriptionPlan", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("subscriptionPlan")
  public @Nullable SubscriptionPlanResponse getSubscriptionPlan() {
    return subscriptionPlan;
  }

  public void setSubscriptionPlan(@Nullable SubscriptionPlanResponse subscriptionPlan) {
    this.subscriptionPlan = subscriptionPlan;
  }

  public SubscriptionResponse promoCode(@Nullable String promoCode) {
    this.promoCode = promoCode;
    return this;
  }

  /**
   * Get promoCode
   * @return promoCode
   */
  
  @Schema(name = "promoCode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("promoCode")
  public @Nullable String getPromoCode() {
    return promoCode;
  }

  public void setPromoCode(@Nullable String promoCode) {
    this.promoCode = promoCode;
  }

  public SubscriptionResponse active(@Nullable Boolean active) {
    this.active = active;
    return this;
  }

  /**
   * Get active
   * @return active
   */
  
  @Schema(name = "active", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("active")
  public @Nullable Boolean getActive() {
    return active;
  }

  public void setActive(@Nullable Boolean active) {
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
  private String toIndentedString(@Nullable Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


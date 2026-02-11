package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ContactInfoResponse;
import org.openapitools.model.PaymentTypesResponse;
import org.openapitools.model.ProfileShortResponse;
import org.openapitools.model.SubscriptionResponse;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * BillableEntityResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-11T19:32:41.765375324Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class BillableEntityResponse {

  private @Nullable Long billableEntityId;

  private @Nullable String name;

  private @Nullable ProfileShortResponse responsible;

  private @Nullable ContactInfoResponse contact;

  private @Nullable SubscriptionResponse subscription;

  private @Nullable PaymentTypesResponse payment;

  public BillableEntityResponse billableEntityId(@Nullable Long billableEntityId) {
    this.billableEntityId = billableEntityId;
    return this;
  }

  /**
   * Get billableEntityId
   * @return billableEntityId
   */
  
  @Schema(name = "billableEntityId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("billableEntityId")
  public @Nullable Long getBillableEntityId() {
    return billableEntityId;
  }

  public void setBillableEntityId(@Nullable Long billableEntityId) {
    this.billableEntityId = billableEntityId;
  }

  public BillableEntityResponse name(@Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  
  @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public @Nullable String getName() {
    return name;
  }

  public void setName(@Nullable String name) {
    this.name = name;
  }

  public BillableEntityResponse responsible(@Nullable ProfileShortResponse responsible) {
    this.responsible = responsible;
    return this;
  }

  /**
   * Get responsible
   * @return responsible
   */
  @Valid 
  @Schema(name = "responsible", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("responsible")
  public @Nullable ProfileShortResponse getResponsible() {
    return responsible;
  }

  public void setResponsible(@Nullable ProfileShortResponse responsible) {
    this.responsible = responsible;
  }

  public BillableEntityResponse contact(@Nullable ContactInfoResponse contact) {
    this.contact = contact;
    return this;
  }

  /**
   * Get contact
   * @return contact
   */
  @Valid 
  @Schema(name = "contact", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("contact")
  public @Nullable ContactInfoResponse getContact() {
    return contact;
  }

  public void setContact(@Nullable ContactInfoResponse contact) {
    this.contact = contact;
  }

  public BillableEntityResponse subscription(@Nullable SubscriptionResponse subscription) {
    this.subscription = subscription;
    return this;
  }

  /**
   * Get subscription
   * @return subscription
   */
  @Valid 
  @Schema(name = "subscription", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("subscription")
  public @Nullable SubscriptionResponse getSubscription() {
    return subscription;
  }

  public void setSubscription(@Nullable SubscriptionResponse subscription) {
    this.subscription = subscription;
  }

  public BillableEntityResponse payment(@Nullable PaymentTypesResponse payment) {
    this.payment = payment;
    return this;
  }

  /**
   * Get payment
   * @return payment
   */
  @Valid 
  @Schema(name = "payment", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("payment")
  public @Nullable PaymentTypesResponse getPayment() {
    return payment;
  }

  public void setPayment(@Nullable PaymentTypesResponse payment) {
    this.payment = payment;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BillableEntityResponse billableEntityResponse = (BillableEntityResponse) o;
    return Objects.equals(this.billableEntityId, billableEntityResponse.billableEntityId) &&
        Objects.equals(this.name, billableEntityResponse.name) &&
        Objects.equals(this.responsible, billableEntityResponse.responsible) &&
        Objects.equals(this.contact, billableEntityResponse.contact) &&
        Objects.equals(this.subscription, billableEntityResponse.subscription) &&
        Objects.equals(this.payment, billableEntityResponse.payment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billableEntityId, name, responsible, contact, subscription, payment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillableEntityResponse {\n");
    sb.append("    billableEntityId: ").append(toIndentedString(billableEntityId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    responsible: ").append(toIndentedString(responsible)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    subscription: ").append(toIndentedString(subscription)).append("\n");
    sb.append("    payment: ").append(toIndentedString(payment)).append("\n");
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


package org.openapitools.model;

import org.openapitools.model.ContactInfoResponse;
import org.openapitools.model.PaymentTypesResponse;
import org.openapitools.model.ProfileShortResponse;
import org.openapitools.model.SubscriptionResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class BillableEntityResponse  {
  
  @ApiModelProperty(value = "")

  private Long billableEntityId;

  @ApiModelProperty(value = "")

  private String name;

  @ApiModelProperty(value = "")

  @Valid

  private ProfileShortResponse responsible;

  @ApiModelProperty(value = "")

  @Valid

  private ContactInfoResponse contact;

  @ApiModelProperty(value = "")

  @Valid

  private SubscriptionResponse subscription;

  @ApiModelProperty(value = "")

  @Valid

  private PaymentTypesResponse payment;
 /**
   * Get billableEntityId
   * @return billableEntityId
  **/
  @JsonProperty("billableEntityId")
  public Long getBillableEntityId() {
    return billableEntityId;
  }

  public void setBillableEntityId(Long billableEntityId) {
    this.billableEntityId = billableEntityId;
  }

  public BillableEntityResponse billableEntityId(Long billableEntityId) {
    this.billableEntityId = billableEntityId;
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

  public BillableEntityResponse name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get responsible
   * @return responsible
  **/
  @JsonProperty("responsible")
  public ProfileShortResponse getResponsible() {
    return responsible;
  }

  public void setResponsible(ProfileShortResponse responsible) {
    this.responsible = responsible;
  }

  public BillableEntityResponse responsible(ProfileShortResponse responsible) {
    this.responsible = responsible;
    return this;
  }

 /**
   * Get contact
   * @return contact
  **/
  @JsonProperty("contact")
  public ContactInfoResponse getContact() {
    return contact;
  }

  public void setContact(ContactInfoResponse contact) {
    this.contact = contact;
  }

  public BillableEntityResponse contact(ContactInfoResponse contact) {
    this.contact = contact;
    return this;
  }

 /**
   * Get subscription
   * @return subscription
  **/
  @JsonProperty("subscription")
  public SubscriptionResponse getSubscription() {
    return subscription;
  }

  public void setSubscription(SubscriptionResponse subscription) {
    this.subscription = subscription;
  }

  public BillableEntityResponse subscription(SubscriptionResponse subscription) {
    this.subscription = subscription;
    return this;
  }

 /**
   * Get payment
   * @return payment
  **/
  @JsonProperty("payment")
  public PaymentTypesResponse getPayment() {
    return payment;
  }

  public void setPayment(PaymentTypesResponse payment) {
    this.payment = payment;
  }

  public BillableEntityResponse payment(PaymentTypesResponse payment) {
    this.payment = payment;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


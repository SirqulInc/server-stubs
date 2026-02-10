package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ContactInfoResponse;
import org.openapitools.model.PaymentTypesResponse;
import org.openapitools.model.ProfileShortResponse;
import org.openapitools.model.SubscriptionResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-09T20:51:23.077809933Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class BillableEntityResponse   {
  
  private Long billableEntityId;
  private String name;
  private ProfileShortResponse responsible;
  private ContactInfoResponse contact;
  private SubscriptionResponse subscription;
  private PaymentTypesResponse payment;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("billableEntityId")
  public Long getBillableEntityId() {
    return billableEntityId;
  }
  public void setBillableEntityId(Long billableEntityId) {
    this.billableEntityId = billableEntityId;
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
  @JsonProperty("responsible")
  @Valid
  public ProfileShortResponse getResponsible() {
    return responsible;
  }
  public void setResponsible(ProfileShortResponse responsible) {
    this.responsible = responsible;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("contact")
  @Valid
  public ContactInfoResponse getContact() {
    return contact;
  }
  public void setContact(ContactInfoResponse contact) {
    this.contact = contact;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("subscription")
  @Valid
  public SubscriptionResponse getSubscription() {
    return subscription;
  }
  public void setSubscription(SubscriptionResponse subscription) {
    this.subscription = subscription;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("payment")
  @Valid
  public PaymentTypesResponse getPayment() {
    return payment;
  }
  public void setPayment(PaymentTypesResponse payment) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


package apimodels;

import apimodels.ContactInfoResponse;
import apimodels.PaymentTypesResponse;
import apimodels.ProfileShortResponse;
import apimodels.SubscriptionResponse;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * BillableEntityResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class BillableEntityResponse   {
  @JsonProperty("billableEntityId")
  
  private Long billableEntityId;

  @JsonProperty("name")
  
  private String name;

  @JsonProperty("responsible")
  @Valid

  private ProfileShortResponse responsible;

  @JsonProperty("contact")
  @Valid

  private ContactInfoResponse contact;

  @JsonProperty("subscription")
  @Valid

  private SubscriptionResponse subscription;

  @JsonProperty("payment")
  @Valid

  private PaymentTypesResponse payment;

  public BillableEntityResponse billableEntityId(Long billableEntityId) {
    this.billableEntityId = billableEntityId;
    return this;
  }

   /**
   * Get billableEntityId
   * @return billableEntityId
  **/
  public Long getBillableEntityId() {
    return billableEntityId;
  }

  public void setBillableEntityId(Long billableEntityId) {
    this.billableEntityId = billableEntityId;
  }

  public BillableEntityResponse name(String name) {
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

  public BillableEntityResponse responsible(ProfileShortResponse responsible) {
    this.responsible = responsible;
    return this;
  }

   /**
   * Get responsible
   * @return responsible
  **/
  public ProfileShortResponse getResponsible() {
    return responsible;
  }

  public void setResponsible(ProfileShortResponse responsible) {
    this.responsible = responsible;
  }

  public BillableEntityResponse contact(ContactInfoResponse contact) {
    this.contact = contact;
    return this;
  }

   /**
   * Get contact
   * @return contact
  **/
  public ContactInfoResponse getContact() {
    return contact;
  }

  public void setContact(ContactInfoResponse contact) {
    this.contact = contact;
  }

  public BillableEntityResponse subscription(SubscriptionResponse subscription) {
    this.subscription = subscription;
    return this;
  }

   /**
   * Get subscription
   * @return subscription
  **/
  public SubscriptionResponse getSubscription() {
    return subscription;
  }

  public void setSubscription(SubscriptionResponse subscription) {
    this.subscription = subscription;
  }

  public BillableEntityResponse payment(PaymentTypesResponse payment) {
    this.payment = payment;
    return this;
  }

   /**
   * Get payment
   * @return payment
  **/
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
    return Objects.equals(billableEntityId, billableEntityResponse.billableEntityId) &&
        Objects.equals(name, billableEntityResponse.name) &&
        Objects.equals(responsible, billableEntityResponse.responsible) &&
        Objects.equals(contact, billableEntityResponse.contact) &&
        Objects.equals(subscription, billableEntityResponse.subscription) &&
        Objects.equals(payment, billableEntityResponse.payment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billableEntityId, name, responsible, contact, subscription, payment);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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


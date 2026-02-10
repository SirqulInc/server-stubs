package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import org.openapitools.model.BillableEntityShortResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class DisbursementResponse  {
  
  @ApiModelProperty(value = "")

  private Long disbursementId;

  @ApiModelProperty(value = "")

  private String title;

  @ApiModelProperty(value = "")

  private String comment;

  @ApiModelProperty(value = "")

  private String externalId;

  @ApiModelProperty(value = "")

  private String introspectionParams;

  @ApiModelProperty(value = "")

  @Valid

  private BigDecimal amount;

  @ApiModelProperty(value = "")

  private Long scheduledDate;

  @ApiModelProperty(value = "")

  private Long captureDate;

  @ApiModelProperty(value = "")

  private Long estimatedDate;

  @ApiModelProperty(value = "")

  private Long settledDate;

public enum StatusEnum {

NEW(String.valueOf("NEW")), APPROVED(String.valueOf("APPROVED")), VALIDATING(String.valueOf("VALIDATING")), ERROR(String.valueOf("ERROR")), AUTHORIZED(String.valueOf("AUTHORIZED")), CAPTURED(String.valueOf("CAPTURED")), SETTLED(String.valueOf("SETTLED"));


    private String value;

    StatusEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String value) {
        for (StatusEnum b : StatusEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(value = "")

  private StatusEnum status;

public enum ProviderEnum {

AUTHORIZE_NET(String.valueOf("AUTHORIZE_NET")), AMAZON_FPS(String.valueOf("AMAZON_FPS")), BILL_COM(String.valueOf("BILL_COM"));


    private String value;

    ProviderEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static ProviderEnum fromValue(String value) {
        for (ProviderEnum b : ProviderEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(value = "")

  private ProviderEnum provider;

  @ApiModelProperty(value = "")

  @Valid

  private BillableEntityShortResponse senderBillable;

  @ApiModelProperty(value = "")

  @Valid

  private BillableEntityShortResponse receiverBillable;

  @ApiModelProperty(value = "")

  private String errorCode;

  @ApiModelProperty(value = "")

  private String errorMessage;
 /**
   * Get disbursementId
   * @return disbursementId
  **/
  @JsonProperty("disbursementId")
  public Long getDisbursementId() {
    return disbursementId;
  }

  public void setDisbursementId(Long disbursementId) {
    this.disbursementId = disbursementId;
  }

  public DisbursementResponse disbursementId(Long disbursementId) {
    this.disbursementId = disbursementId;
    return this;
  }

 /**
   * Get title
   * @return title
  **/
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public DisbursementResponse title(String title) {
    this.title = title;
    return this;
  }

 /**
   * Get comment
   * @return comment
  **/
  @JsonProperty("comment")
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public DisbursementResponse comment(String comment) {
    this.comment = comment;
    return this;
  }

 /**
   * Get externalId
   * @return externalId
  **/
  @JsonProperty("externalId")
  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  public DisbursementResponse externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

 /**
   * Get introspectionParams
   * @return introspectionParams
  **/
  @JsonProperty("introspectionParams")
  public String getIntrospectionParams() {
    return introspectionParams;
  }

  public void setIntrospectionParams(String introspectionParams) {
    this.introspectionParams = introspectionParams;
  }

  public DisbursementResponse introspectionParams(String introspectionParams) {
    this.introspectionParams = introspectionParams;
    return this;
  }

 /**
   * Get amount
   * @return amount
  **/
  @JsonProperty("amount")
  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public DisbursementResponse amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

 /**
   * Get scheduledDate
   * @return scheduledDate
  **/
  @JsonProperty("scheduledDate")
  public Long getScheduledDate() {
    return scheduledDate;
  }

  public void setScheduledDate(Long scheduledDate) {
    this.scheduledDate = scheduledDate;
  }

  public DisbursementResponse scheduledDate(Long scheduledDate) {
    this.scheduledDate = scheduledDate;
    return this;
  }

 /**
   * Get captureDate
   * @return captureDate
  **/
  @JsonProperty("captureDate")
  public Long getCaptureDate() {
    return captureDate;
  }

  public void setCaptureDate(Long captureDate) {
    this.captureDate = captureDate;
  }

  public DisbursementResponse captureDate(Long captureDate) {
    this.captureDate = captureDate;
    return this;
  }

 /**
   * Get estimatedDate
   * @return estimatedDate
  **/
  @JsonProperty("estimatedDate")
  public Long getEstimatedDate() {
    return estimatedDate;
  }

  public void setEstimatedDate(Long estimatedDate) {
    this.estimatedDate = estimatedDate;
  }

  public DisbursementResponse estimatedDate(Long estimatedDate) {
    this.estimatedDate = estimatedDate;
    return this;
  }

 /**
   * Get settledDate
   * @return settledDate
  **/
  @JsonProperty("settledDate")
  public Long getSettledDate() {
    return settledDate;
  }

  public void setSettledDate(Long settledDate) {
    this.settledDate = settledDate;
  }

  public DisbursementResponse settledDate(Long settledDate) {
    this.settledDate = settledDate;
    return this;
  }

 /**
   * Get status
   * @return status
  **/
  @JsonProperty("status")
  public String getStatus() {
    if (status == null) {
      return null;
    }
    return status.value();
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public DisbursementResponse status(StatusEnum status) {
    this.status = status;
    return this;
  }

 /**
   * Get provider
   * @return provider
  **/
  @JsonProperty("provider")
  public String getProvider() {
    if (provider == null) {
      return null;
    }
    return provider.value();
  }

  public void setProvider(ProviderEnum provider) {
    this.provider = provider;
  }

  public DisbursementResponse provider(ProviderEnum provider) {
    this.provider = provider;
    return this;
  }

 /**
   * Get senderBillable
   * @return senderBillable
  **/
  @JsonProperty("senderBillable")
  public BillableEntityShortResponse getSenderBillable() {
    return senderBillable;
  }

  public void setSenderBillable(BillableEntityShortResponse senderBillable) {
    this.senderBillable = senderBillable;
  }

  public DisbursementResponse senderBillable(BillableEntityShortResponse senderBillable) {
    this.senderBillable = senderBillable;
    return this;
  }

 /**
   * Get receiverBillable
   * @return receiverBillable
  **/
  @JsonProperty("receiverBillable")
  public BillableEntityShortResponse getReceiverBillable() {
    return receiverBillable;
  }

  public void setReceiverBillable(BillableEntityShortResponse receiverBillable) {
    this.receiverBillable = receiverBillable;
  }

  public DisbursementResponse receiverBillable(BillableEntityShortResponse receiverBillable) {
    this.receiverBillable = receiverBillable;
    return this;
  }

 /**
   * Get errorCode
   * @return errorCode
  **/
  @JsonProperty("errorCode")
  public String getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  public DisbursementResponse errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

 /**
   * Get errorMessage
   * @return errorMessage
  **/
  @JsonProperty("errorMessage")
  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  public DisbursementResponse errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
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
    DisbursementResponse disbursementResponse = (DisbursementResponse) o;
    return Objects.equals(this.disbursementId, disbursementResponse.disbursementId) &&
        Objects.equals(this.title, disbursementResponse.title) &&
        Objects.equals(this.comment, disbursementResponse.comment) &&
        Objects.equals(this.externalId, disbursementResponse.externalId) &&
        Objects.equals(this.introspectionParams, disbursementResponse.introspectionParams) &&
        Objects.equals(this.amount, disbursementResponse.amount) &&
        Objects.equals(this.scheduledDate, disbursementResponse.scheduledDate) &&
        Objects.equals(this.captureDate, disbursementResponse.captureDate) &&
        Objects.equals(this.estimatedDate, disbursementResponse.estimatedDate) &&
        Objects.equals(this.settledDate, disbursementResponse.settledDate) &&
        Objects.equals(this.status, disbursementResponse.status) &&
        Objects.equals(this.provider, disbursementResponse.provider) &&
        Objects.equals(this.senderBillable, disbursementResponse.senderBillable) &&
        Objects.equals(this.receiverBillable, disbursementResponse.receiverBillable) &&
        Objects.equals(this.errorCode, disbursementResponse.errorCode) &&
        Objects.equals(this.errorMessage, disbursementResponse.errorMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(disbursementId, title, comment, externalId, introspectionParams, amount, scheduledDate, captureDate, estimatedDate, settledDate, status, provider, senderBillable, receiverBillable, errorCode, errorMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DisbursementResponse {\n");
    
    sb.append("    disbursementId: ").append(toIndentedString(disbursementId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    introspectionParams: ").append(toIndentedString(introspectionParams)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    scheduledDate: ").append(toIndentedString(scheduledDate)).append("\n");
    sb.append("    captureDate: ").append(toIndentedString(captureDate)).append("\n");
    sb.append("    estimatedDate: ").append(toIndentedString(estimatedDate)).append("\n");
    sb.append("    settledDate: ").append(toIndentedString(settledDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    senderBillable: ").append(toIndentedString(senderBillable)).append("\n");
    sb.append("    receiverBillable: ").append(toIndentedString(receiverBillable)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
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


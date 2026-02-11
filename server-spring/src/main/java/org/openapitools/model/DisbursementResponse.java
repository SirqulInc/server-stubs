package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import org.openapitools.model.BillableEntityShortResponse;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * DisbursementResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-11T19:32:41.765375324Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class DisbursementResponse {

  private @Nullable Long disbursementId;

  private @Nullable String title;

  private @Nullable String comment;

  private @Nullable String externalId;

  private @Nullable String introspectionParams;

  private @Nullable BigDecimal amount;

  private @Nullable Long scheduledDate;

  private @Nullable Long captureDate;

  private @Nullable Long estimatedDate;

  private @Nullable Long settledDate;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    NEW("NEW"),
    
    APPROVED("APPROVED"),
    
    VALIDATING("VALIDATING"),
    
    ERROR("ERROR"),
    
    AUTHORIZED("AUTHORIZED"),
    
    CAPTURED("CAPTURED"),
    
    SETTLED("SETTLED");

    private final String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
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

  private @Nullable StatusEnum status;

  /**
   * Gets or Sets provider
   */
  public enum ProviderEnum {
    AUTHORIZE_NET("AUTHORIZE_NET"),
    
    AMAZON_FPS("AMAZON_FPS"),
    
    BILL_COM("BILL_COM");

    private final String value;

    ProviderEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
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

  private @Nullable ProviderEnum provider;

  private @Nullable BillableEntityShortResponse senderBillable;

  private @Nullable BillableEntityShortResponse receiverBillable;

  private @Nullable String errorCode;

  private @Nullable String errorMessage;

  public DisbursementResponse disbursementId(@Nullable Long disbursementId) {
    this.disbursementId = disbursementId;
    return this;
  }

  /**
   * Get disbursementId
   * @return disbursementId
   */
  
  @Schema(name = "disbursementId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("disbursementId")
  public @Nullable Long getDisbursementId() {
    return disbursementId;
  }

  public void setDisbursementId(@Nullable Long disbursementId) {
    this.disbursementId = disbursementId;
  }

  public DisbursementResponse title(@Nullable String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
   */
  
  @Schema(name = "title", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("title")
  public @Nullable String getTitle() {
    return title;
  }

  public void setTitle(@Nullable String title) {
    this.title = title;
  }

  public DisbursementResponse comment(@Nullable String comment) {
    this.comment = comment;
    return this;
  }

  /**
   * Get comment
   * @return comment
   */
  
  @Schema(name = "comment", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("comment")
  public @Nullable String getComment() {
    return comment;
  }

  public void setComment(@Nullable String comment) {
    this.comment = comment;
  }

  public DisbursementResponse externalId(@Nullable String externalId) {
    this.externalId = externalId;
    return this;
  }

  /**
   * Get externalId
   * @return externalId
   */
  
  @Schema(name = "externalId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("externalId")
  public @Nullable String getExternalId() {
    return externalId;
  }

  public void setExternalId(@Nullable String externalId) {
    this.externalId = externalId;
  }

  public DisbursementResponse introspectionParams(@Nullable String introspectionParams) {
    this.introspectionParams = introspectionParams;
    return this;
  }

  /**
   * Get introspectionParams
   * @return introspectionParams
   */
  
  @Schema(name = "introspectionParams", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("introspectionParams")
  public @Nullable String getIntrospectionParams() {
    return introspectionParams;
  }

  public void setIntrospectionParams(@Nullable String introspectionParams) {
    this.introspectionParams = introspectionParams;
  }

  public DisbursementResponse amount(@Nullable BigDecimal amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
   */
  @Valid 
  @Schema(name = "amount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("amount")
  public @Nullable BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(@Nullable BigDecimal amount) {
    this.amount = amount;
  }

  public DisbursementResponse scheduledDate(@Nullable Long scheduledDate) {
    this.scheduledDate = scheduledDate;
    return this;
  }

  /**
   * Get scheduledDate
   * @return scheduledDate
   */
  
  @Schema(name = "scheduledDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("scheduledDate")
  public @Nullable Long getScheduledDate() {
    return scheduledDate;
  }

  public void setScheduledDate(@Nullable Long scheduledDate) {
    this.scheduledDate = scheduledDate;
  }

  public DisbursementResponse captureDate(@Nullable Long captureDate) {
    this.captureDate = captureDate;
    return this;
  }

  /**
   * Get captureDate
   * @return captureDate
   */
  
  @Schema(name = "captureDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("captureDate")
  public @Nullable Long getCaptureDate() {
    return captureDate;
  }

  public void setCaptureDate(@Nullable Long captureDate) {
    this.captureDate = captureDate;
  }

  public DisbursementResponse estimatedDate(@Nullable Long estimatedDate) {
    this.estimatedDate = estimatedDate;
    return this;
  }

  /**
   * Get estimatedDate
   * @return estimatedDate
   */
  
  @Schema(name = "estimatedDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("estimatedDate")
  public @Nullable Long getEstimatedDate() {
    return estimatedDate;
  }

  public void setEstimatedDate(@Nullable Long estimatedDate) {
    this.estimatedDate = estimatedDate;
  }

  public DisbursementResponse settledDate(@Nullable Long settledDate) {
    this.settledDate = settledDate;
    return this;
  }

  /**
   * Get settledDate
   * @return settledDate
   */
  
  @Schema(name = "settledDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("settledDate")
  public @Nullable Long getSettledDate() {
    return settledDate;
  }

  public void setSettledDate(@Nullable Long settledDate) {
    this.settledDate = settledDate;
  }

  public DisbursementResponse status(@Nullable StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  
  @Schema(name = "status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public @Nullable StatusEnum getStatus() {
    return status;
  }

  public void setStatus(@Nullable StatusEnum status) {
    this.status = status;
  }

  public DisbursementResponse provider(@Nullable ProviderEnum provider) {
    this.provider = provider;
    return this;
  }

  /**
   * Get provider
   * @return provider
   */
  
  @Schema(name = "provider", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("provider")
  public @Nullable ProviderEnum getProvider() {
    return provider;
  }

  public void setProvider(@Nullable ProviderEnum provider) {
    this.provider = provider;
  }

  public DisbursementResponse senderBillable(@Nullable BillableEntityShortResponse senderBillable) {
    this.senderBillable = senderBillable;
    return this;
  }

  /**
   * Get senderBillable
   * @return senderBillable
   */
  @Valid 
  @Schema(name = "senderBillable", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("senderBillable")
  public @Nullable BillableEntityShortResponse getSenderBillable() {
    return senderBillable;
  }

  public void setSenderBillable(@Nullable BillableEntityShortResponse senderBillable) {
    this.senderBillable = senderBillable;
  }

  public DisbursementResponse receiverBillable(@Nullable BillableEntityShortResponse receiverBillable) {
    this.receiverBillable = receiverBillable;
    return this;
  }

  /**
   * Get receiverBillable
   * @return receiverBillable
   */
  @Valid 
  @Schema(name = "receiverBillable", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("receiverBillable")
  public @Nullable BillableEntityShortResponse getReceiverBillable() {
    return receiverBillable;
  }

  public void setReceiverBillable(@Nullable BillableEntityShortResponse receiverBillable) {
    this.receiverBillable = receiverBillable;
  }

  public DisbursementResponse errorCode(@Nullable String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

  /**
   * Get errorCode
   * @return errorCode
   */
  
  @Schema(name = "errorCode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("errorCode")
  public @Nullable String getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(@Nullable String errorCode) {
    this.errorCode = errorCode;
  }

  public DisbursementResponse errorMessage(@Nullable String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

  /**
   * Get errorMessage
   * @return errorMessage
   */
  
  @Schema(name = "errorMessage", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("errorMessage")
  public @Nullable String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(@Nullable String errorMessage) {
    this.errorMessage = errorMessage;
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
  private String toIndentedString(@Nullable Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


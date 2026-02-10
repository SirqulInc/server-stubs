package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.model.BillableEntityShortResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-09T20:51:23.077809933Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class DisbursementResponse   {
  
  private Long disbursementId;
  private String title;
  private String comment;
  private String externalId;
  private String introspectionParams;
  private BigDecimal amount;
  private Long scheduledDate;
  private Long captureDate;
  private Long estimatedDate;
  private Long settledDate;

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
    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private StatusEnum status;

  /**
   * Gets or Sets provider
   */
  public enum ProviderEnum {
    AUTHORIZE_NET("AUTHORIZE_NET"),

        AMAZON_FPS("AMAZON_FPS"),

        BILL_COM("BILL_COM");
    private String value;

    ProviderEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private ProviderEnum provider;
  private BillableEntityShortResponse senderBillable;
  private BillableEntityShortResponse receiverBillable;
  private String errorCode;
  private String errorMessage;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("disbursementId")
  public Long getDisbursementId() {
    return disbursementId;
  }
  public void setDisbursementId(Long disbursementId) {
    this.disbursementId = disbursementId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("comment")
  public String getComment() {
    return comment;
  }
  public void setComment(String comment) {
    this.comment = comment;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("externalId")
  public String getExternalId() {
    return externalId;
  }
  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("introspectionParams")
  public String getIntrospectionParams() {
    return introspectionParams;
  }
  public void setIntrospectionParams(String introspectionParams) {
    this.introspectionParams = introspectionParams;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("amount")
  @Valid
  public BigDecimal getAmount() {
    return amount;
  }
  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("scheduledDate")
  public Long getScheduledDate() {
    return scheduledDate;
  }
  public void setScheduledDate(Long scheduledDate) {
    this.scheduledDate = scheduledDate;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("captureDate")
  public Long getCaptureDate() {
    return captureDate;
  }
  public void setCaptureDate(Long captureDate) {
    this.captureDate = captureDate;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("estimatedDate")
  public Long getEstimatedDate() {
    return estimatedDate;
  }
  public void setEstimatedDate(Long estimatedDate) {
    this.estimatedDate = estimatedDate;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("settledDate")
  public Long getSettledDate() {
    return settledDate;
  }
  public void setSettledDate(Long settledDate) {
    this.settledDate = settledDate;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("provider")
  public ProviderEnum getProvider() {
    return provider;
  }
  public void setProvider(ProviderEnum provider) {
    this.provider = provider;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("senderBillable")
  @Valid
  public BillableEntityShortResponse getSenderBillable() {
    return senderBillable;
  }
  public void setSenderBillable(BillableEntityShortResponse senderBillable) {
    this.senderBillable = senderBillable;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("receiverBillable")
  @Valid
  public BillableEntityShortResponse getReceiverBillable() {
    return receiverBillable;
  }
  public void setReceiverBillable(BillableEntityShortResponse receiverBillable) {
    this.receiverBillable = receiverBillable;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("errorCode")
  public String getErrorCode() {
    return errorCode;
  }
  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("errorMessage")
  public String getErrorMessage() {
    return errorMessage;
  }
  public void setErrorMessage(String errorMessage) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


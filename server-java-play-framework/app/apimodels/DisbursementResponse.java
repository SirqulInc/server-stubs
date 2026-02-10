package apimodels;

import apimodels.BillableEntityShortResponse;
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DisbursementResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class DisbursementResponse   {
  @JsonProperty("disbursementId")
  
  private Long disbursementId;

  @JsonProperty("title")
  
  private String title;

  @JsonProperty("comment")
  
  private String comment;

  @JsonProperty("externalId")
  
  private String externalId;

  @JsonProperty("introspectionParams")
  
  private String introspectionParams;

  @JsonProperty("amount")
  @Valid

  private BigDecimal amount;

  @JsonProperty("scheduledDate")
  
  private Long scheduledDate;

  @JsonProperty("captureDate")
  
  private Long captureDate;

  @JsonProperty("estimatedDate")
  
  private Long estimatedDate;

  @JsonProperty("settledDate")
  
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

    private final String value;

    StatusEnum(String value) {
      this.value = value;
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

  @JsonProperty("status")
  
  private StatusEnum status;

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

  @JsonProperty("provider")
  
  private ProviderEnum provider;

  @JsonProperty("senderBillable")
  @Valid

  private BillableEntityShortResponse senderBillable;

  @JsonProperty("receiverBillable")
  @Valid

  private BillableEntityShortResponse receiverBillable;

  @JsonProperty("errorCode")
  
  private String errorCode;

  @JsonProperty("errorMessage")
  
  private String errorMessage;

  public DisbursementResponse disbursementId(Long disbursementId) {
    this.disbursementId = disbursementId;
    return this;
  }

   /**
   * Get disbursementId
   * @return disbursementId
  **/
  public Long getDisbursementId() {
    return disbursementId;
  }

  public void setDisbursementId(Long disbursementId) {
    this.disbursementId = disbursementId;
  }

  public DisbursementResponse title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public DisbursementResponse comment(String comment) {
    this.comment = comment;
    return this;
  }

   /**
   * Get comment
   * @return comment
  **/
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public DisbursementResponse externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

   /**
   * Get externalId
   * @return externalId
  **/
  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  public DisbursementResponse introspectionParams(String introspectionParams) {
    this.introspectionParams = introspectionParams;
    return this;
  }

   /**
   * Get introspectionParams
   * @return introspectionParams
  **/
  public String getIntrospectionParams() {
    return introspectionParams;
  }

  public void setIntrospectionParams(String introspectionParams) {
    this.introspectionParams = introspectionParams;
  }

  public DisbursementResponse amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public DisbursementResponse scheduledDate(Long scheduledDate) {
    this.scheduledDate = scheduledDate;
    return this;
  }

   /**
   * Get scheduledDate
   * @return scheduledDate
  **/
  public Long getScheduledDate() {
    return scheduledDate;
  }

  public void setScheduledDate(Long scheduledDate) {
    this.scheduledDate = scheduledDate;
  }

  public DisbursementResponse captureDate(Long captureDate) {
    this.captureDate = captureDate;
    return this;
  }

   /**
   * Get captureDate
   * @return captureDate
  **/
  public Long getCaptureDate() {
    return captureDate;
  }

  public void setCaptureDate(Long captureDate) {
    this.captureDate = captureDate;
  }

  public DisbursementResponse estimatedDate(Long estimatedDate) {
    this.estimatedDate = estimatedDate;
    return this;
  }

   /**
   * Get estimatedDate
   * @return estimatedDate
  **/
  public Long getEstimatedDate() {
    return estimatedDate;
  }

  public void setEstimatedDate(Long estimatedDate) {
    this.estimatedDate = estimatedDate;
  }

  public DisbursementResponse settledDate(Long settledDate) {
    this.settledDate = settledDate;
    return this;
  }

   /**
   * Get settledDate
   * @return settledDate
  **/
  public Long getSettledDate() {
    return settledDate;
  }

  public void setSettledDate(Long settledDate) {
    this.settledDate = settledDate;
  }

  public DisbursementResponse status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public DisbursementResponse provider(ProviderEnum provider) {
    this.provider = provider;
    return this;
  }

   /**
   * Get provider
   * @return provider
  **/
  public ProviderEnum getProvider() {
    return provider;
  }

  public void setProvider(ProviderEnum provider) {
    this.provider = provider;
  }

  public DisbursementResponse senderBillable(BillableEntityShortResponse senderBillable) {
    this.senderBillable = senderBillable;
    return this;
  }

   /**
   * Get senderBillable
   * @return senderBillable
  **/
  public BillableEntityShortResponse getSenderBillable() {
    return senderBillable;
  }

  public void setSenderBillable(BillableEntityShortResponse senderBillable) {
    this.senderBillable = senderBillable;
  }

  public DisbursementResponse receiverBillable(BillableEntityShortResponse receiverBillable) {
    this.receiverBillable = receiverBillable;
    return this;
  }

   /**
   * Get receiverBillable
   * @return receiverBillable
  **/
  public BillableEntityShortResponse getReceiverBillable() {
    return receiverBillable;
  }

  public void setReceiverBillable(BillableEntityShortResponse receiverBillable) {
    this.receiverBillable = receiverBillable;
  }

  public DisbursementResponse errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

   /**
   * Get errorCode
   * @return errorCode
  **/
  public String getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  public DisbursementResponse errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

   /**
   * Get errorMessage
   * @return errorMessage
  **/
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
    return Objects.equals(disbursementId, disbursementResponse.disbursementId) &&
        Objects.equals(title, disbursementResponse.title) &&
        Objects.equals(comment, disbursementResponse.comment) &&
        Objects.equals(externalId, disbursementResponse.externalId) &&
        Objects.equals(introspectionParams, disbursementResponse.introspectionParams) &&
        Objects.equals(amount, disbursementResponse.amount) &&
        Objects.equals(scheduledDate, disbursementResponse.scheduledDate) &&
        Objects.equals(captureDate, disbursementResponse.captureDate) &&
        Objects.equals(estimatedDate, disbursementResponse.estimatedDate) &&
        Objects.equals(settledDate, disbursementResponse.settledDate) &&
        Objects.equals(status, disbursementResponse.status) &&
        Objects.equals(provider, disbursementResponse.provider) &&
        Objects.equals(senderBillable, disbursementResponse.senderBillable) &&
        Objects.equals(receiverBillable, disbursementResponse.receiverBillable) &&
        Objects.equals(errorCode, disbursementResponse.errorCode) &&
        Objects.equals(errorMessage, disbursementResponse.errorMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(disbursementId, title, comment, externalId, introspectionParams, amount, scheduledDate, captureDate, estimatedDate, settledDate, status, provider, senderBillable, receiverBillable, errorCode, errorMessage);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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


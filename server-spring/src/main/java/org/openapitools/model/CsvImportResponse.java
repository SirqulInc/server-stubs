package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.NameStringValueResponse;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * CsvImportResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-09T20:58:37.853899731Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class CsvImportResponse {

  private @Nullable Boolean valid;

  private @Nullable String message;

  private @Nullable Double version;

  private @Nullable Boolean serializeNulls;

  private @Nullable Long startTimeLog;

  private @Nullable String errorCode;

  @Valid
  private List<@Valid NameStringValueResponse> request = new ArrayList<>();

  private @Nullable Long batchId;

  /**
   * Gets or Sets csvImportBatchStatus
   */
  public enum CsvImportBatchStatusEnum {
    NEW("NEW"),
    
    ERROR("ERROR"),
    
    COMPLETE("COMPLETE"),
    
    PARSE_ERROR("PARSE_ERROR"),
    
    PROCESSING("PROCESSING"),
    
    DUPLICATE("DUPLICATE");

    private final String value;

    CsvImportBatchStatusEnum(String value) {
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
    public static CsvImportBatchStatusEnum fromValue(String value) {
      for (CsvImportBatchStatusEnum b : CsvImportBatchStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable CsvImportBatchStatusEnum csvImportBatchStatus;

  private @Nullable String errorMessage;

  /**
   * Gets or Sets objectType
   */
  public enum ObjectTypeEnum {
    OFFERS("OFFERS"),
    
    RETAILERS("RETAILERS"),
    
    RETAILERLOCATIONS("RETAILERLOCATIONS"),
    
    CATEGORIES("CATEGORIES"),
    
    FILTERS("FILTERS");

    private final String value;

    ObjectTypeEnum(String value) {
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
    public static ObjectTypeEnum fromValue(String value) {
      for (ObjectTypeEnum b : ObjectTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable ObjectTypeEnum objectType;

  private @Nullable String returning;

  public CsvImportResponse valid(@Nullable Boolean valid) {
    this.valid = valid;
    return this;
  }

  /**
   * Get valid
   * @return valid
   */
  
  @Schema(name = "valid", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("valid")
  public @Nullable Boolean getValid() {
    return valid;
  }

  public void setValid(@Nullable Boolean valid) {
    this.valid = valid;
  }

  public CsvImportResponse message(@Nullable String message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
   */
  
  @Schema(name = "message", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("message")
  public @Nullable String getMessage() {
    return message;
  }

  public void setMessage(@Nullable String message) {
    this.message = message;
  }

  public CsvImportResponse version(@Nullable Double version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
   */
  
  @Schema(name = "version", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("version")
  public @Nullable Double getVersion() {
    return version;
  }

  public void setVersion(@Nullable Double version) {
    this.version = version;
  }

  public CsvImportResponse serializeNulls(@Nullable Boolean serializeNulls) {
    this.serializeNulls = serializeNulls;
    return this;
  }

  /**
   * Get serializeNulls
   * @return serializeNulls
   */
  
  @Schema(name = "serializeNulls", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("serializeNulls")
  public @Nullable Boolean getSerializeNulls() {
    return serializeNulls;
  }

  public void setSerializeNulls(@Nullable Boolean serializeNulls) {
    this.serializeNulls = serializeNulls;
  }

  public CsvImportResponse startTimeLog(@Nullable Long startTimeLog) {
    this.startTimeLog = startTimeLog;
    return this;
  }

  /**
   * Get startTimeLog
   * @return startTimeLog
   */
  
  @Schema(name = "startTimeLog", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("startTimeLog")
  public @Nullable Long getStartTimeLog() {
    return startTimeLog;
  }

  public void setStartTimeLog(@Nullable Long startTimeLog) {
    this.startTimeLog = startTimeLog;
  }

  public CsvImportResponse errorCode(@Nullable String errorCode) {
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

  public CsvImportResponse request(List<@Valid NameStringValueResponse> request) {
    this.request = request;
    return this;
  }

  public CsvImportResponse addRequestItem(NameStringValueResponse requestItem) {
    if (this.request == null) {
      this.request = new ArrayList<>();
    }
    this.request.add(requestItem);
    return this;
  }

  /**
   * Get request
   * @return request
   */
  @Valid 
  @Schema(name = "request", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("request")
  public List<@Valid NameStringValueResponse> getRequest() {
    return request;
  }

  public void setRequest(List<@Valid NameStringValueResponse> request) {
    this.request = request;
  }

  public CsvImportResponse batchId(@Nullable Long batchId) {
    this.batchId = batchId;
    return this;
  }

  /**
   * Get batchId
   * @return batchId
   */
  
  @Schema(name = "batchId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("batchId")
  public @Nullable Long getBatchId() {
    return batchId;
  }

  public void setBatchId(@Nullable Long batchId) {
    this.batchId = batchId;
  }

  public CsvImportResponse csvImportBatchStatus(@Nullable CsvImportBatchStatusEnum csvImportBatchStatus) {
    this.csvImportBatchStatus = csvImportBatchStatus;
    return this;
  }

  /**
   * Get csvImportBatchStatus
   * @return csvImportBatchStatus
   */
  
  @Schema(name = "csvImportBatchStatus", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("csvImportBatchStatus")
  public @Nullable CsvImportBatchStatusEnum getCsvImportBatchStatus() {
    return csvImportBatchStatus;
  }

  public void setCsvImportBatchStatus(@Nullable CsvImportBatchStatusEnum csvImportBatchStatus) {
    this.csvImportBatchStatus = csvImportBatchStatus;
  }

  public CsvImportResponse errorMessage(@Nullable String errorMessage) {
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

  public CsvImportResponse objectType(@Nullable ObjectTypeEnum objectType) {
    this.objectType = objectType;
    return this;
  }

  /**
   * Get objectType
   * @return objectType
   */
  
  @Schema(name = "objectType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("objectType")
  public @Nullable ObjectTypeEnum getObjectType() {
    return objectType;
  }

  public void setObjectType(@Nullable ObjectTypeEnum objectType) {
    this.objectType = objectType;
  }

  public CsvImportResponse returning(@Nullable String returning) {
    this.returning = returning;
    return this;
  }

  /**
   * Get returning
   * @return returning
   */
  
  @Schema(name = "returning", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("returning")
  public @Nullable String getReturning() {
    return returning;
  }

  public void setReturning(@Nullable String returning) {
    this.returning = returning;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CsvImportResponse csvImportResponse = (CsvImportResponse) o;
    return Objects.equals(this.valid, csvImportResponse.valid) &&
        Objects.equals(this.message, csvImportResponse.message) &&
        Objects.equals(this.version, csvImportResponse.version) &&
        Objects.equals(this.serializeNulls, csvImportResponse.serializeNulls) &&
        Objects.equals(this.startTimeLog, csvImportResponse.startTimeLog) &&
        Objects.equals(this.errorCode, csvImportResponse.errorCode) &&
        Objects.equals(this.request, csvImportResponse.request) &&
        Objects.equals(this.batchId, csvImportResponse.batchId) &&
        Objects.equals(this.csvImportBatchStatus, csvImportResponse.csvImportBatchStatus) &&
        Objects.equals(this.errorMessage, csvImportResponse.errorMessage) &&
        Objects.equals(this.objectType, csvImportResponse.objectType) &&
        Objects.equals(this.returning, csvImportResponse.returning);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valid, message, version, serializeNulls, startTimeLog, errorCode, request, batchId, csvImportBatchStatus, errorMessage, objectType, returning);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CsvImportResponse {\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    serializeNulls: ").append(toIndentedString(serializeNulls)).append("\n");
    sb.append("    startTimeLog: ").append(toIndentedString(startTimeLog)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
    sb.append("    batchId: ").append(toIndentedString(batchId)).append("\n");
    sb.append("    csvImportBatchStatus: ").append(toIndentedString(csvImportBatchStatus)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    objectType: ").append(toIndentedString(objectType)).append("\n");
    sb.append("    returning: ").append(toIndentedString(returning)).append("\n");
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


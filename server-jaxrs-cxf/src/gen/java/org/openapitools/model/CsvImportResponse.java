package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.NameStringValueResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CsvImportResponse  {
  
  @ApiModelProperty(value = "")

  private Boolean valid;

  @ApiModelProperty(value = "")

  private String message;

  @ApiModelProperty(value = "")

  private Double version;

  @ApiModelProperty(value = "")

  private Boolean serializeNulls;

  @ApiModelProperty(value = "")

  private Long startTimeLog;

  @ApiModelProperty(value = "")

  private String errorCode;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid NameStringValueResponse> request = new ArrayList<>();

  @ApiModelProperty(value = "")

  private Long batchId;

public enum CsvImportBatchStatusEnum {

NEW(String.valueOf("NEW")), ERROR(String.valueOf("ERROR")), COMPLETE(String.valueOf("COMPLETE")), PARSE_ERROR(String.valueOf("PARSE_ERROR")), PROCESSING(String.valueOf("PROCESSING")), DUPLICATE(String.valueOf("DUPLICATE"));


    private String value;

    CsvImportBatchStatusEnum (String v) {
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
    public static CsvImportBatchStatusEnum fromValue(String value) {
        for (CsvImportBatchStatusEnum b : CsvImportBatchStatusEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(value = "")

  private CsvImportBatchStatusEnum csvImportBatchStatus;

  @ApiModelProperty(value = "")

  private String errorMessage;

public enum ObjectTypeEnum {

OFFERS(String.valueOf("OFFERS")), RETAILERS(String.valueOf("RETAILERS")), RETAILERLOCATIONS(String.valueOf("RETAILERLOCATIONS")), CATEGORIES(String.valueOf("CATEGORIES")), FILTERS(String.valueOf("FILTERS"));


    private String value;

    ObjectTypeEnum (String v) {
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
    public static ObjectTypeEnum fromValue(String value) {
        for (ObjectTypeEnum b : ObjectTypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(value = "")

  private ObjectTypeEnum objectType;

  @ApiModelProperty(value = "")

  private String returning;
 /**
   * Get valid
   * @return valid
  **/
  @JsonProperty("valid")
  public Boolean getValid() {
    return valid;
  }

  public void setValid(Boolean valid) {
    this.valid = valid;
  }

  public CsvImportResponse valid(Boolean valid) {
    this.valid = valid;
    return this;
  }

 /**
   * Get message
   * @return message
  **/
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public CsvImportResponse message(String message) {
    this.message = message;
    return this;
  }

 /**
   * Get version
   * @return version
  **/
  @JsonProperty("version")
  public Double getVersion() {
    return version;
  }

  public void setVersion(Double version) {
    this.version = version;
  }

  public CsvImportResponse version(Double version) {
    this.version = version;
    return this;
  }

 /**
   * Get serializeNulls
   * @return serializeNulls
  **/
  @JsonProperty("serializeNulls")
  public Boolean getSerializeNulls() {
    return serializeNulls;
  }

  public void setSerializeNulls(Boolean serializeNulls) {
    this.serializeNulls = serializeNulls;
  }

  public CsvImportResponse serializeNulls(Boolean serializeNulls) {
    this.serializeNulls = serializeNulls;
    return this;
  }

 /**
   * Get startTimeLog
   * @return startTimeLog
  **/
  @JsonProperty("startTimeLog")
  public Long getStartTimeLog() {
    return startTimeLog;
  }

  public void setStartTimeLog(Long startTimeLog) {
    this.startTimeLog = startTimeLog;
  }

  public CsvImportResponse startTimeLog(Long startTimeLog) {
    this.startTimeLog = startTimeLog;
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

  public CsvImportResponse errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

 /**
   * Get request
   * @return request
  **/
  @JsonProperty("request")
  public List<@Valid NameStringValueResponse> getRequest() {
    return request;
  }

  public void setRequest(List<@Valid NameStringValueResponse> request) {
    this.request = request;
  }

  public CsvImportResponse request(List<@Valid NameStringValueResponse> request) {
    this.request = request;
    return this;
  }

  public CsvImportResponse addRequestItem(NameStringValueResponse requestItem) {
    this.request.add(requestItem);
    return this;
  }

 /**
   * Get batchId
   * @return batchId
  **/
  @JsonProperty("batchId")
  public Long getBatchId() {
    return batchId;
  }

  public void setBatchId(Long batchId) {
    this.batchId = batchId;
  }

  public CsvImportResponse batchId(Long batchId) {
    this.batchId = batchId;
    return this;
  }

 /**
   * Get csvImportBatchStatus
   * @return csvImportBatchStatus
  **/
  @JsonProperty("csvImportBatchStatus")
  public String getCsvImportBatchStatus() {
    if (csvImportBatchStatus == null) {
      return null;
    }
    return csvImportBatchStatus.value();
  }

  public void setCsvImportBatchStatus(CsvImportBatchStatusEnum csvImportBatchStatus) {
    this.csvImportBatchStatus = csvImportBatchStatus;
  }

  public CsvImportResponse csvImportBatchStatus(CsvImportBatchStatusEnum csvImportBatchStatus) {
    this.csvImportBatchStatus = csvImportBatchStatus;
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

  public CsvImportResponse errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

 /**
   * Get objectType
   * @return objectType
  **/
  @JsonProperty("objectType")
  public String getObjectType() {
    if (objectType == null) {
      return null;
    }
    return objectType.value();
  }

  public void setObjectType(ObjectTypeEnum objectType) {
    this.objectType = objectType;
  }

  public CsvImportResponse objectType(ObjectTypeEnum objectType) {
    this.objectType = objectType;
    return this;
  }

 /**
   * Get returning
   * @return returning
  **/
  @JsonProperty("returning")
  public String getReturning() {
    return returning;
  }

  public void setReturning(String returning) {
    this.returning = returning;
  }

  public CsvImportResponse returning(String returning) {
    this.returning = returning;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


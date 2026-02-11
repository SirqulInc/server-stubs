package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.NameStringValueResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class CsvImportResponse   {
  
  private Boolean valid;
  private String message;
  private Double version;
  private Boolean serializeNulls;
  private Long startTimeLog;
  private String errorCode;
  private List<@Valid NameStringValueResponse> request = new ArrayList<>();
  private Long batchId;

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
    private String value;

    CsvImportBatchStatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private CsvImportBatchStatusEnum csvImportBatchStatus;
  private String errorMessage;

  /**
   * Gets or Sets objectType
   */
  public enum ObjectTypeEnum {
    OFFERS("OFFERS"),

        RETAILERS("RETAILERS"),

        RETAILERLOCATIONS("RETAILERLOCATIONS"),

        CATEGORIES("CATEGORIES"),

        FILTERS("FILTERS");
    private String value;

    ObjectTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private ObjectTypeEnum objectType;
  private String returning;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("valid")
  public Boolean getValid() {
    return valid;
  }
  public void setValid(Boolean valid) {
    this.valid = valid;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("version")
  public Double getVersion() {
    return version;
  }
  public void setVersion(Double version) {
    this.version = version;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("serializeNulls")
  public Boolean getSerializeNulls() {
    return serializeNulls;
  }
  public void setSerializeNulls(Boolean serializeNulls) {
    this.serializeNulls = serializeNulls;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("startTimeLog")
  public Long getStartTimeLog() {
    return startTimeLog;
  }
  public void setStartTimeLog(Long startTimeLog) {
    this.startTimeLog = startTimeLog;
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
  @JsonProperty("request")
  @Valid
  public List<@Valid NameStringValueResponse> getRequest() {
    return request;
  }
  public void setRequest(List<@Valid NameStringValueResponse> request) {
    this.request = request;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("batchId")
  public Long getBatchId() {
    return batchId;
  }
  public void setBatchId(Long batchId) {
    this.batchId = batchId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("csvImportBatchStatus")
  public CsvImportBatchStatusEnum getCsvImportBatchStatus() {
    return csvImportBatchStatus;
  }
  public void setCsvImportBatchStatus(CsvImportBatchStatusEnum csvImportBatchStatus) {
    this.csvImportBatchStatus = csvImportBatchStatus;
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

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("objectType")
  public ObjectTypeEnum getObjectType() {
    return objectType;
  }
  public void setObjectType(ObjectTypeEnum objectType) {
    this.objectType = objectType;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("returning")
  public String getReturning() {
    return returning;
  }
  public void setReturning(String returning) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


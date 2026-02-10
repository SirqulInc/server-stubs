package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.NameStringValueResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ListCountResponse  {
  
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

  private Long locationOffersCount;

  @ApiModelProperty(value = "")

  private Long instantOffersCount;

  @ApiModelProperty(value = "")

  private Long allOffersCount;

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

  public ListCountResponse valid(Boolean valid) {
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

  public ListCountResponse message(String message) {
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

  public ListCountResponse version(Double version) {
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

  public ListCountResponse serializeNulls(Boolean serializeNulls) {
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

  public ListCountResponse startTimeLog(Long startTimeLog) {
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

  public ListCountResponse errorCode(String errorCode) {
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

  public ListCountResponse request(List<@Valid NameStringValueResponse> request) {
    this.request = request;
    return this;
  }

  public ListCountResponse addRequestItem(NameStringValueResponse requestItem) {
    this.request.add(requestItem);
    return this;
  }

 /**
   * Get locationOffersCount
   * @return locationOffersCount
  **/
  @JsonProperty("locationOffersCount")
  public Long getLocationOffersCount() {
    return locationOffersCount;
  }

  public void setLocationOffersCount(Long locationOffersCount) {
    this.locationOffersCount = locationOffersCount;
  }

  public ListCountResponse locationOffersCount(Long locationOffersCount) {
    this.locationOffersCount = locationOffersCount;
    return this;
  }

 /**
   * Get instantOffersCount
   * @return instantOffersCount
  **/
  @JsonProperty("instantOffersCount")
  public Long getInstantOffersCount() {
    return instantOffersCount;
  }

  public void setInstantOffersCount(Long instantOffersCount) {
    this.instantOffersCount = instantOffersCount;
  }

  public ListCountResponse instantOffersCount(Long instantOffersCount) {
    this.instantOffersCount = instantOffersCount;
    return this;
  }

 /**
   * Get allOffersCount
   * @return allOffersCount
  **/
  @JsonProperty("allOffersCount")
  public Long getAllOffersCount() {
    return allOffersCount;
  }

  public void setAllOffersCount(Long allOffersCount) {
    this.allOffersCount = allOffersCount;
  }

  public ListCountResponse allOffersCount(Long allOffersCount) {
    this.allOffersCount = allOffersCount;
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

  public ListCountResponse returning(String returning) {
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
    ListCountResponse listCountResponse = (ListCountResponse) o;
    return Objects.equals(this.valid, listCountResponse.valid) &&
        Objects.equals(this.message, listCountResponse.message) &&
        Objects.equals(this.version, listCountResponse.version) &&
        Objects.equals(this.serializeNulls, listCountResponse.serializeNulls) &&
        Objects.equals(this.startTimeLog, listCountResponse.startTimeLog) &&
        Objects.equals(this.errorCode, listCountResponse.errorCode) &&
        Objects.equals(this.request, listCountResponse.request) &&
        Objects.equals(this.locationOffersCount, listCountResponse.locationOffersCount) &&
        Objects.equals(this.instantOffersCount, listCountResponse.instantOffersCount) &&
        Objects.equals(this.allOffersCount, listCountResponse.allOffersCount) &&
        Objects.equals(this.returning, listCountResponse.returning);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valid, message, version, serializeNulls, startTimeLog, errorCode, request, locationOffersCount, instantOffersCount, allOffersCount, returning);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListCountResponse {\n");
    
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    serializeNulls: ").append(toIndentedString(serializeNulls)).append("\n");
    sb.append("    startTimeLog: ").append(toIndentedString(startTimeLog)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
    sb.append("    locationOffersCount: ").append(toIndentedString(locationOffersCount)).append("\n");
    sb.append("    instantOffersCount: ").append(toIndentedString(instantOffersCount)).append("\n");
    sb.append("    allOffersCount: ").append(toIndentedString(allOffersCount)).append("\n");
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


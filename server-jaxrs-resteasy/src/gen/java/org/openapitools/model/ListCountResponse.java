package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
public class ListCountResponse   {
  
  private Boolean valid;
  private String message;
  private Double version;
  private Boolean serializeNulls;
  private Long startTimeLog;
  private String errorCode;
  private List<@Valid NameStringValueResponse> request = new ArrayList<>();
  private Long locationOffersCount;
  private Long instantOffersCount;
  private Long allOffersCount;
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
  @JsonProperty("locationOffersCount")
  public Long getLocationOffersCount() {
    return locationOffersCount;
  }
  public void setLocationOffersCount(Long locationOffersCount) {
    this.locationOffersCount = locationOffersCount;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("instantOffersCount")
  public Long getInstantOffersCount() {
    return instantOffersCount;
  }
  public void setInstantOffersCount(Long instantOffersCount) {
    this.instantOffersCount = instantOffersCount;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("allOffersCount")
  public Long getAllOffersCount() {
    return allOffersCount;
  }
  public void setAllOffersCount(Long allOffersCount) {
    this.allOffersCount = allOffersCount;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


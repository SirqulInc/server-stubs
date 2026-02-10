package apimodels;

import apimodels.NameStringValueResponse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ListCountResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ListCountResponse   {
  @JsonProperty("valid")
  
  private Boolean valid;

  @JsonProperty("message")
  
  private String message;

  @JsonProperty("version")
  
  private Double version;

  @JsonProperty("serializeNulls")
  
  private Boolean serializeNulls;

  @JsonProperty("startTimeLog")
  
  private Long startTimeLog;

  @JsonProperty("errorCode")
  
  private String errorCode;

  @JsonProperty("request")
  @Valid

  private List<@Valid NameStringValueResponse> request = null;

  @JsonProperty("locationOffersCount")
  
  private Long locationOffersCount;

  @JsonProperty("instantOffersCount")
  
  private Long instantOffersCount;

  @JsonProperty("allOffersCount")
  
  private Long allOffersCount;

  @JsonProperty("returning")
  
  private String returning;

  public ListCountResponse valid(Boolean valid) {
    this.valid = valid;
    return this;
  }

   /**
   * Get valid
   * @return valid
  **/
  public Boolean getValid() {
    return valid;
  }

  public void setValid(Boolean valid) {
    this.valid = valid;
  }

  public ListCountResponse message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public ListCountResponse version(Double version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  public Double getVersion() {
    return version;
  }

  public void setVersion(Double version) {
    this.version = version;
  }

  public ListCountResponse serializeNulls(Boolean serializeNulls) {
    this.serializeNulls = serializeNulls;
    return this;
  }

   /**
   * Get serializeNulls
   * @return serializeNulls
  **/
  public Boolean getSerializeNulls() {
    return serializeNulls;
  }

  public void setSerializeNulls(Boolean serializeNulls) {
    this.serializeNulls = serializeNulls;
  }

  public ListCountResponse startTimeLog(Long startTimeLog) {
    this.startTimeLog = startTimeLog;
    return this;
  }

   /**
   * Get startTimeLog
   * @return startTimeLog
  **/
  public Long getStartTimeLog() {
    return startTimeLog;
  }

  public void setStartTimeLog(Long startTimeLog) {
    this.startTimeLog = startTimeLog;
  }

  public ListCountResponse errorCode(String errorCode) {
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

  public ListCountResponse request(List<@Valid NameStringValueResponse> request) {
    this.request = request;
    return this;
  }

  public ListCountResponse addRequestItem(NameStringValueResponse requestItem) {
    if (this.request == null) {
      this.request = new ArrayList<>();
    }
    this.request.add(requestItem);
    return this;
  }

   /**
   * Get request
   * @return request
  **/
  public List<@Valid NameStringValueResponse> getRequest() {
    return request;
  }

  public void setRequest(List<@Valid NameStringValueResponse> request) {
    this.request = request;
  }

  public ListCountResponse locationOffersCount(Long locationOffersCount) {
    this.locationOffersCount = locationOffersCount;
    return this;
  }

   /**
   * Get locationOffersCount
   * @return locationOffersCount
  **/
  public Long getLocationOffersCount() {
    return locationOffersCount;
  }

  public void setLocationOffersCount(Long locationOffersCount) {
    this.locationOffersCount = locationOffersCount;
  }

  public ListCountResponse instantOffersCount(Long instantOffersCount) {
    this.instantOffersCount = instantOffersCount;
    return this;
  }

   /**
   * Get instantOffersCount
   * @return instantOffersCount
  **/
  public Long getInstantOffersCount() {
    return instantOffersCount;
  }

  public void setInstantOffersCount(Long instantOffersCount) {
    this.instantOffersCount = instantOffersCount;
  }

  public ListCountResponse allOffersCount(Long allOffersCount) {
    this.allOffersCount = allOffersCount;
    return this;
  }

   /**
   * Get allOffersCount
   * @return allOffersCount
  **/
  public Long getAllOffersCount() {
    return allOffersCount;
  }

  public void setAllOffersCount(Long allOffersCount) {
    this.allOffersCount = allOffersCount;
  }

  public ListCountResponse returning(String returning) {
    this.returning = returning;
    return this;
  }

   /**
   * Get returning
   * @return returning
  **/
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
    return Objects.equals(valid, listCountResponse.valid) &&
        Objects.equals(message, listCountResponse.message) &&
        Objects.equals(version, listCountResponse.version) &&
        Objects.equals(serializeNulls, listCountResponse.serializeNulls) &&
        Objects.equals(startTimeLog, listCountResponse.startTimeLog) &&
        Objects.equals(errorCode, listCountResponse.errorCode) &&
        Objects.equals(request, listCountResponse.request) &&
        Objects.equals(locationOffersCount, listCountResponse.locationOffersCount) &&
        Objects.equals(instantOffersCount, listCountResponse.instantOffersCount) &&
        Objects.equals(allOffersCount, listCountResponse.allOffersCount) &&
        Objects.equals(returning, listCountResponse.returning);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valid, message, version, serializeNulls, startTimeLog, errorCode, request, locationOffersCount, instantOffersCount, allOffersCount, returning);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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


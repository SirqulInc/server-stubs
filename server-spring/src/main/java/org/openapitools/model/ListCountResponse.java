package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * ListCountResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-11T19:32:41.765375324Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class ListCountResponse {

  private @Nullable Boolean valid;

  private @Nullable String message;

  private @Nullable Double version;

  private @Nullable Boolean serializeNulls;

  private @Nullable Long startTimeLog;

  private @Nullable String errorCode;

  @Valid
  private List<@Valid NameStringValueResponse> request = new ArrayList<>();

  private @Nullable Long locationOffersCount;

  private @Nullable Long instantOffersCount;

  private @Nullable Long allOffersCount;

  private @Nullable String returning;

  public ListCountResponse valid(@Nullable Boolean valid) {
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

  public ListCountResponse message(@Nullable String message) {
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

  public ListCountResponse version(@Nullable Double version) {
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

  public ListCountResponse serializeNulls(@Nullable Boolean serializeNulls) {
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

  public ListCountResponse startTimeLog(@Nullable Long startTimeLog) {
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

  public ListCountResponse errorCode(@Nullable String errorCode) {
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

  public ListCountResponse locationOffersCount(@Nullable Long locationOffersCount) {
    this.locationOffersCount = locationOffersCount;
    return this;
  }

  /**
   * Get locationOffersCount
   * @return locationOffersCount
   */
  
  @Schema(name = "locationOffersCount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("locationOffersCount")
  public @Nullable Long getLocationOffersCount() {
    return locationOffersCount;
  }

  public void setLocationOffersCount(@Nullable Long locationOffersCount) {
    this.locationOffersCount = locationOffersCount;
  }

  public ListCountResponse instantOffersCount(@Nullable Long instantOffersCount) {
    this.instantOffersCount = instantOffersCount;
    return this;
  }

  /**
   * Get instantOffersCount
   * @return instantOffersCount
   */
  
  @Schema(name = "instantOffersCount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("instantOffersCount")
  public @Nullable Long getInstantOffersCount() {
    return instantOffersCount;
  }

  public void setInstantOffersCount(@Nullable Long instantOffersCount) {
    this.instantOffersCount = instantOffersCount;
  }

  public ListCountResponse allOffersCount(@Nullable Long allOffersCount) {
    this.allOffersCount = allOffersCount;
    return this;
  }

  /**
   * Get allOffersCount
   * @return allOffersCount
   */
  
  @Schema(name = "allOffersCount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("allOffersCount")
  public @Nullable Long getAllOffersCount() {
    return allOffersCount;
  }

  public void setAllOffersCount(@Nullable Long allOffersCount) {
    this.allOffersCount = allOffersCount;
  }

  public ListCountResponse returning(@Nullable String returning) {
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
  private String toIndentedString(@Nullable Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


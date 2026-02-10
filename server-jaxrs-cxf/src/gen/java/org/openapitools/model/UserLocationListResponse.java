package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.NameStringValueResponse;
import org.openapitools.model.UserLocationResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class UserLocationListResponse  {
  
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

  @Valid

  private List<@Valid UserLocationResponse> items = new ArrayList<>();

public enum UserLocationTypeEnum {

POSTALCODE(String.valueOf("POSTALCODE")), EXACT(String.valueOf("EXACT"));


    private String value;

    UserLocationTypeEnum (String v) {
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
    public static UserLocationTypeEnum fromValue(String value) {
        for (UserLocationTypeEnum b : UserLocationTypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(value = "")

  private UserLocationTypeEnum userLocationType;

  @ApiModelProperty(value = "")

  private Double latitude;

  @ApiModelProperty(value = "")

  private Double longitude;

  @ApiModelProperty(value = "")

  private String postalCode;

  @ApiModelProperty(value = "")

  private Integer count;

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

  public UserLocationListResponse valid(Boolean valid) {
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

  public UserLocationListResponse message(String message) {
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

  public UserLocationListResponse version(Double version) {
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

  public UserLocationListResponse serializeNulls(Boolean serializeNulls) {
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

  public UserLocationListResponse startTimeLog(Long startTimeLog) {
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

  public UserLocationListResponse errorCode(String errorCode) {
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

  public UserLocationListResponse request(List<@Valid NameStringValueResponse> request) {
    this.request = request;
    return this;
  }

  public UserLocationListResponse addRequestItem(NameStringValueResponse requestItem) {
    this.request.add(requestItem);
    return this;
  }

 /**
   * Get items
   * @return items
  **/
  @JsonProperty("items")
  public List<@Valid UserLocationResponse> getItems() {
    return items;
  }

  public void setItems(List<@Valid UserLocationResponse> items) {
    this.items = items;
  }

  public UserLocationListResponse items(List<@Valid UserLocationResponse> items) {
    this.items = items;
    return this;
  }

  public UserLocationListResponse addItemsItem(UserLocationResponse itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

 /**
   * Get userLocationType
   * @return userLocationType
  **/
  @JsonProperty("userLocationType")
  public String getUserLocationType() {
    if (userLocationType == null) {
      return null;
    }
    return userLocationType.value();
  }

  public void setUserLocationType(UserLocationTypeEnum userLocationType) {
    this.userLocationType = userLocationType;
  }

  public UserLocationListResponse userLocationType(UserLocationTypeEnum userLocationType) {
    this.userLocationType = userLocationType;
    return this;
  }

 /**
   * Get latitude
   * @return latitude
  **/
  @JsonProperty("latitude")
  public Double getLatitude() {
    return latitude;
  }

  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  public UserLocationListResponse latitude(Double latitude) {
    this.latitude = latitude;
    return this;
  }

 /**
   * Get longitude
   * @return longitude
  **/
  @JsonProperty("longitude")
  public Double getLongitude() {
    return longitude;
  }

  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }

  public UserLocationListResponse longitude(Double longitude) {
    this.longitude = longitude;
    return this;
  }

 /**
   * Get postalCode
   * @return postalCode
  **/
  @JsonProperty("postalCode")
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public UserLocationListResponse postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

 /**
   * Get count
   * @return count
  **/
  @JsonProperty("count")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public UserLocationListResponse count(Integer count) {
    this.count = count;
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

  public UserLocationListResponse returning(String returning) {
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
    UserLocationListResponse userLocationListResponse = (UserLocationListResponse) o;
    return Objects.equals(this.valid, userLocationListResponse.valid) &&
        Objects.equals(this.message, userLocationListResponse.message) &&
        Objects.equals(this.version, userLocationListResponse.version) &&
        Objects.equals(this.serializeNulls, userLocationListResponse.serializeNulls) &&
        Objects.equals(this.startTimeLog, userLocationListResponse.startTimeLog) &&
        Objects.equals(this.errorCode, userLocationListResponse.errorCode) &&
        Objects.equals(this.request, userLocationListResponse.request) &&
        Objects.equals(this.items, userLocationListResponse.items) &&
        Objects.equals(this.userLocationType, userLocationListResponse.userLocationType) &&
        Objects.equals(this.latitude, userLocationListResponse.latitude) &&
        Objects.equals(this.longitude, userLocationListResponse.longitude) &&
        Objects.equals(this.postalCode, userLocationListResponse.postalCode) &&
        Objects.equals(this.count, userLocationListResponse.count) &&
        Objects.equals(this.returning, userLocationListResponse.returning);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valid, message, version, serializeNulls, startTimeLog, errorCode, request, items, userLocationType, latitude, longitude, postalCode, count, returning);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserLocationListResponse {\n");
    
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    serializeNulls: ").append(toIndentedString(serializeNulls)).append("\n");
    sb.append("    startTimeLog: ").append(toIndentedString(startTimeLog)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    userLocationType: ").append(toIndentedString(userLocationType)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
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


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


public class LocationResponse  {
  
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

  private Long id;

  @ApiModelProperty(value = "")

  private String getDistanceMiles;

  @ApiModelProperty(value = "")

  private String zip;

  @ApiModelProperty(value = "")

  private String name;

  @ApiModelProperty(value = "")

  private String latitude;

  @ApiModelProperty(value = "")

  private String longitude;

  @ApiModelProperty(value = "")

  private String getSource;

  @ApiModelProperty(value = "")

  private String type;

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

  public LocationResponse valid(Boolean valid) {
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

  public LocationResponse message(String message) {
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

  public LocationResponse version(Double version) {
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

  public LocationResponse serializeNulls(Boolean serializeNulls) {
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

  public LocationResponse startTimeLog(Long startTimeLog) {
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

  public LocationResponse errorCode(String errorCode) {
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

  public LocationResponse request(List<@Valid NameStringValueResponse> request) {
    this.request = request;
    return this;
  }

  public LocationResponse addRequestItem(NameStringValueResponse requestItem) {
    this.request.add(requestItem);
    return this;
  }

 /**
   * Get id
   * @return id
  **/
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public LocationResponse id(Long id) {
    this.id = id;
    return this;
  }

 /**
   * Get getDistanceMiles
   * @return getDistanceMiles
  **/
  @JsonProperty("get_distance_miles")
  public String getGetDistanceMiles() {
    return getDistanceMiles;
  }

  public void setGetDistanceMiles(String getDistanceMiles) {
    this.getDistanceMiles = getDistanceMiles;
  }

  public LocationResponse getDistanceMiles(String getDistanceMiles) {
    this.getDistanceMiles = getDistanceMiles;
    return this;
  }

 /**
   * Get zip
   * @return zip
  **/
  @JsonProperty("zip")
  public String getZip() {
    return zip;
  }

  public void setZip(String zip) {
    this.zip = zip;
  }

  public LocationResponse zip(String zip) {
    this.zip = zip;
    return this;
  }

 /**
   * Get name
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LocationResponse name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get latitude
   * @return latitude
  **/
  @JsonProperty("latitude")
  public String getLatitude() {
    return latitude;
  }

  public void setLatitude(String latitude) {
    this.latitude = latitude;
  }

  public LocationResponse latitude(String latitude) {
    this.latitude = latitude;
    return this;
  }

 /**
   * Get longitude
   * @return longitude
  **/
  @JsonProperty("longitude")
  public String getLongitude() {
    return longitude;
  }

  public void setLongitude(String longitude) {
    this.longitude = longitude;
  }

  public LocationResponse longitude(String longitude) {
    this.longitude = longitude;
    return this;
  }

 /**
   * Get getSource
   * @return getSource
  **/
  @JsonProperty("get_source")
  public String getGetSource() {
    return getSource;
  }

  public void setGetSource(String getSource) {
    this.getSource = getSource;
  }

  public LocationResponse getSource(String getSource) {
    this.getSource = getSource;
    return this;
  }

 /**
   * Get type
   * @return type
  **/
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public LocationResponse type(String type) {
    this.type = type;
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

  public LocationResponse returning(String returning) {
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
    LocationResponse locationResponse = (LocationResponse) o;
    return Objects.equals(this.valid, locationResponse.valid) &&
        Objects.equals(this.message, locationResponse.message) &&
        Objects.equals(this.version, locationResponse.version) &&
        Objects.equals(this.serializeNulls, locationResponse.serializeNulls) &&
        Objects.equals(this.startTimeLog, locationResponse.startTimeLog) &&
        Objects.equals(this.errorCode, locationResponse.errorCode) &&
        Objects.equals(this.request, locationResponse.request) &&
        Objects.equals(this.id, locationResponse.id) &&
        Objects.equals(this.getDistanceMiles, locationResponse.getDistanceMiles) &&
        Objects.equals(this.zip, locationResponse.zip) &&
        Objects.equals(this.name, locationResponse.name) &&
        Objects.equals(this.latitude, locationResponse.latitude) &&
        Objects.equals(this.longitude, locationResponse.longitude) &&
        Objects.equals(this.getSource, locationResponse.getSource) &&
        Objects.equals(this.type, locationResponse.type) &&
        Objects.equals(this.returning, locationResponse.returning);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valid, message, version, serializeNulls, startTimeLog, errorCode, request, id, getDistanceMiles, zip, name, latitude, longitude, getSource, type, returning);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocationResponse {\n");
    
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    serializeNulls: ").append(toIndentedString(serializeNulls)).append("\n");
    sb.append("    startTimeLog: ").append(toIndentedString(startTimeLog)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    getDistanceMiles: ").append(toIndentedString(getDistanceMiles)).append("\n");
    sb.append("    zip: ").append(toIndentedString(zip)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    getSource: ").append(toIndentedString(getSource)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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


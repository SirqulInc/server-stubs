package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PostalCodeResponse  {
  
  @ApiModelProperty(value = "")

  private String city;

  @ApiModelProperty(value = "")

  private String stateCode;

  @ApiModelProperty(value = "")

  private String code;

  @ApiModelProperty(value = "")

  private Double latitude;

  @ApiModelProperty(value = "")

  private Double longitude;

  @ApiModelProperty(value = "")

  private String timezone;

  @ApiModelProperty(value = "")

  private Integer utcOffset;
 /**
   * Get city
   * @return city
  **/
  @JsonProperty("city")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public PostalCodeResponse city(String city) {
    this.city = city;
    return this;
  }

 /**
   * Get stateCode
   * @return stateCode
  **/
  @JsonProperty("stateCode")
  public String getStateCode() {
    return stateCode;
  }

  public void setStateCode(String stateCode) {
    this.stateCode = stateCode;
  }

  public PostalCodeResponse stateCode(String stateCode) {
    this.stateCode = stateCode;
    return this;
  }

 /**
   * Get code
   * @return code
  **/
  @JsonProperty("code")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public PostalCodeResponse code(String code) {
    this.code = code;
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

  public PostalCodeResponse latitude(Double latitude) {
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

  public PostalCodeResponse longitude(Double longitude) {
    this.longitude = longitude;
    return this;
  }

 /**
   * Get timezone
   * @return timezone
  **/
  @JsonProperty("timezone")
  public String getTimezone() {
    return timezone;
  }

  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }

  public PostalCodeResponse timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

 /**
   * Get utcOffset
   * @return utcOffset
  **/
  @JsonProperty("utcOffset")
  public Integer getUtcOffset() {
    return utcOffset;
  }

  public void setUtcOffset(Integer utcOffset) {
    this.utcOffset = utcOffset;
  }

  public PostalCodeResponse utcOffset(Integer utcOffset) {
    this.utcOffset = utcOffset;
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
    PostalCodeResponse postalCodeResponse = (PostalCodeResponse) o;
    return Objects.equals(this.city, postalCodeResponse.city) &&
        Objects.equals(this.stateCode, postalCodeResponse.stateCode) &&
        Objects.equals(this.code, postalCodeResponse.code) &&
        Objects.equals(this.latitude, postalCodeResponse.latitude) &&
        Objects.equals(this.longitude, postalCodeResponse.longitude) &&
        Objects.equals(this.timezone, postalCodeResponse.timezone) &&
        Objects.equals(this.utcOffset, postalCodeResponse.utcOffset);
  }

  @Override
  public int hashCode() {
    return Objects.hash(city, stateCode, code, latitude, longitude, timezone, utcOffset);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostalCodeResponse {\n");
    
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    stateCode: ").append(toIndentedString(stateCode)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    utcOffset: ").append(toIndentedString(utcOffset)).append("\n");
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


package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class PostalCodeResponse   {
  
  private String city;
  private String stateCode;
  private String code;
  private Double latitude;
  private Double longitude;
  private String timezone;
  private Integer utcOffset;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("city")
  public String getCity() {
    return city;
  }
  public void setCity(String city) {
    this.city = city;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("stateCode")
  public String getStateCode() {
    return stateCode;
  }
  public void setStateCode(String stateCode) {
    this.stateCode = stateCode;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("code")
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("latitude")
  public Double getLatitude() {
    return latitude;
  }
  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("longitude")
  public Double getLongitude() {
    return longitude;
  }
  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("timezone")
  public String getTimezone() {
    return timezone;
  }
  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("utcOffset")
  public Integer getUtcOffset() {
    return utcOffset;
  }
  public void setUtcOffset(Integer utcOffset) {
    this.utcOffset = utcOffset;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


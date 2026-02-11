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
public class AudienceDeviceResponse   {
  
  private Long deviceId;
  private Boolean active;
  private String name;
  private String display;
  private Long minimum;
  private Long maximum;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("deviceId")
  public Long getDeviceId() {
    return deviceId;
  }
  public void setDeviceId(Long deviceId) {
    this.deviceId = deviceId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("active")
  public Boolean getActive() {
    return active;
  }
  public void setActive(Boolean active) {
    this.active = active;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("display")
  public String getDisplay() {
    return display;
  }
  public void setDisplay(String display) {
    this.display = display;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("minimum")
  public Long getMinimum() {
    return minimum;
  }
  public void setMinimum(Long minimum) {
    this.minimum = minimum;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("maximum")
  public Long getMaximum() {
    return maximum;
  }
  public void setMaximum(Long maximum) {
    this.maximum = maximum;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AudienceDeviceResponse audienceDeviceResponse = (AudienceDeviceResponse) o;
    return Objects.equals(this.deviceId, audienceDeviceResponse.deviceId) &&
        Objects.equals(this.active, audienceDeviceResponse.active) &&
        Objects.equals(this.name, audienceDeviceResponse.name) &&
        Objects.equals(this.display, audienceDeviceResponse.display) &&
        Objects.equals(this.minimum, audienceDeviceResponse.minimum) &&
        Objects.equals(this.maximum, audienceDeviceResponse.maximum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deviceId, active, name, display, minimum, maximum);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AudienceDeviceResponse {\n");
    
    sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    display: ").append(toIndentedString(display)).append("\n");
    sb.append("    minimum: ").append(toIndentedString(minimum)).append("\n");
    sb.append("    maximum: ").append(toIndentedString(maximum)).append("\n");
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


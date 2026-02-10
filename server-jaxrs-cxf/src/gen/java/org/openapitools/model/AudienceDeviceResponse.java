package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AudienceDeviceResponse  {
  
  @ApiModelProperty(value = "")

  private Long deviceId;

  @ApiModelProperty(value = "")

  private Boolean active;

  @ApiModelProperty(value = "")

  private String name;

  @ApiModelProperty(value = "")

  private String display;

  @ApiModelProperty(value = "")

  private Long minimum;

  @ApiModelProperty(value = "")

  private Long maximum;
 /**
   * Get deviceId
   * @return deviceId
  **/
  @JsonProperty("deviceId")
  public Long getDeviceId() {
    return deviceId;
  }

  public void setDeviceId(Long deviceId) {
    this.deviceId = deviceId;
  }

  public AudienceDeviceResponse deviceId(Long deviceId) {
    this.deviceId = deviceId;
    return this;
  }

 /**
   * Get active
   * @return active
  **/
  @JsonProperty("active")
  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public AudienceDeviceResponse active(Boolean active) {
    this.active = active;
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

  public AudienceDeviceResponse name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get display
   * @return display
  **/
  @JsonProperty("display")
  public String getDisplay() {
    return display;
  }

  public void setDisplay(String display) {
    this.display = display;
  }

  public AudienceDeviceResponse display(String display) {
    this.display = display;
    return this;
  }

 /**
   * Get minimum
   * @return minimum
  **/
  @JsonProperty("minimum")
  public Long getMinimum() {
    return minimum;
  }

  public void setMinimum(Long minimum) {
    this.minimum = minimum;
  }

  public AudienceDeviceResponse minimum(Long minimum) {
    this.minimum = minimum;
    return this;
  }

 /**
   * Get maximum
   * @return maximum
  **/
  @JsonProperty("maximum")
  public Long getMaximum() {
    return maximum;
  }

  public void setMaximum(Long maximum) {
    this.maximum = maximum;
  }

  public AudienceDeviceResponse maximum(Long maximum) {
    this.maximum = maximum;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


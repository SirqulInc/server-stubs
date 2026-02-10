package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * AudienceDeviceResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class AudienceDeviceResponse   {
  @JsonProperty("deviceId")
  
  private Long deviceId;

  @JsonProperty("active")
  
  private Boolean active;

  @JsonProperty("name")
  
  private String name;

  @JsonProperty("display")
  
  private String display;

  @JsonProperty("minimum")
  
  private Long minimum;

  @JsonProperty("maximum")
  
  private Long maximum;

  public AudienceDeviceResponse deviceId(Long deviceId) {
    this.deviceId = deviceId;
    return this;
  }

   /**
   * Get deviceId
   * @return deviceId
  **/
  public Long getDeviceId() {
    return deviceId;
  }

  public void setDeviceId(Long deviceId) {
    this.deviceId = deviceId;
  }

  public AudienceDeviceResponse active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public AudienceDeviceResponse name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AudienceDeviceResponse display(String display) {
    this.display = display;
    return this;
  }

   /**
   * Get display
   * @return display
  **/
  public String getDisplay() {
    return display;
  }

  public void setDisplay(String display) {
    this.display = display;
  }

  public AudienceDeviceResponse minimum(Long minimum) {
    this.minimum = minimum;
    return this;
  }

   /**
   * Get minimum
   * @return minimum
  **/
  public Long getMinimum() {
    return minimum;
  }

  public void setMinimum(Long minimum) {
    this.minimum = minimum;
  }

  public AudienceDeviceResponse maximum(Long maximum) {
    this.maximum = maximum;
    return this;
  }

   /**
   * Get maximum
   * @return maximum
  **/
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
    return Objects.equals(deviceId, audienceDeviceResponse.deviceId) &&
        Objects.equals(active, audienceDeviceResponse.active) &&
        Objects.equals(name, audienceDeviceResponse.name) &&
        Objects.equals(display, audienceDeviceResponse.display) &&
        Objects.equals(minimum, audienceDeviceResponse.minimum) &&
        Objects.equals(maximum, audienceDeviceResponse.maximum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deviceId, active, name, display, minimum, maximum);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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


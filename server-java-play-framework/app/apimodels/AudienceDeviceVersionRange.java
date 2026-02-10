package apimodels;

import apimodels.AudienceDevice;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * AudienceDeviceVersionRange
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class AudienceDeviceVersionRange   {
  @JsonProperty("id")
  
  private Long id;

  @JsonProperty("active")
  
  private Boolean active;

  @JsonProperty("valid")
  
  private Boolean valid;

  @JsonProperty("device")
  @Valid

  private AudienceDevice device;

  @JsonProperty("minimum")
  
  private Long minimum;

  @JsonProperty("maximum")
  
  private Long maximum;

  public AudienceDeviceVersionRange id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public AudienceDeviceVersionRange active(Boolean active) {
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

  public AudienceDeviceVersionRange valid(Boolean valid) {
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

  public AudienceDeviceVersionRange device(AudienceDevice device) {
    this.device = device;
    return this;
  }

   /**
   * Get device
   * @return device
  **/
  public AudienceDevice getDevice() {
    return device;
  }

  public void setDevice(AudienceDevice device) {
    this.device = device;
  }

  public AudienceDeviceVersionRange minimum(Long minimum) {
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

  public AudienceDeviceVersionRange maximum(Long maximum) {
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
    AudienceDeviceVersionRange audienceDeviceVersionRange = (AudienceDeviceVersionRange) o;
    return Objects.equals(id, audienceDeviceVersionRange.id) &&
        Objects.equals(active, audienceDeviceVersionRange.active) &&
        Objects.equals(valid, audienceDeviceVersionRange.valid) &&
        Objects.equals(device, audienceDeviceVersionRange.device) &&
        Objects.equals(minimum, audienceDeviceVersionRange.minimum) &&
        Objects.equals(maximum, audienceDeviceVersionRange.maximum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, active, valid, device, minimum, maximum);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AudienceDeviceVersionRange {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
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


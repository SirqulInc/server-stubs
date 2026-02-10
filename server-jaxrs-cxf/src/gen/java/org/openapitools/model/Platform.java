package org.openapitools.model;

import org.openapitools.model.AudienceDevice;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Platform  {
  
  @ApiModelProperty(value = "")

  private Long id;

  @ApiModelProperty(value = "")

  private Boolean active;

  @ApiModelProperty(value = "")

  private Boolean valid;

  @ApiModelProperty(value = "")

  @Valid

  private AudienceDevice device;

  @ApiModelProperty(value = "")

  private Long minimum;

  @ApiModelProperty(value = "")

  private Long maximum;

  @ApiModelProperty(value = "")

  private String downloadUrl;

  @ApiModelProperty(value = "")

  private String description;
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

  public Platform id(Long id) {
    this.id = id;
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

  public Platform active(Boolean active) {
    this.active = active;
    return this;
  }

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

  public Platform valid(Boolean valid) {
    this.valid = valid;
    return this;
  }

 /**
   * Get device
   * @return device
  **/
  @JsonProperty("device")
  public AudienceDevice getDevice() {
    return device;
  }

  public void setDevice(AudienceDevice device) {
    this.device = device;
  }

  public Platform device(AudienceDevice device) {
    this.device = device;
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

  public Platform minimum(Long minimum) {
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

  public Platform maximum(Long maximum) {
    this.maximum = maximum;
    return this;
  }

 /**
   * Get downloadUrl
   * @return downloadUrl
  **/
  @JsonProperty("downloadUrl")
  public String getDownloadUrl() {
    return downloadUrl;
  }

  public void setDownloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
  }

  public Platform downloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
    return this;
  }

 /**
   * Get description
   * @return description
  **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Platform description(String description) {
    this.description = description;
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
    Platform platform = (Platform) o;
    return Objects.equals(this.id, platform.id) &&
        Objects.equals(this.active, platform.active) &&
        Objects.equals(this.valid, platform.valid) &&
        Objects.equals(this.device, platform.device) &&
        Objects.equals(this.minimum, platform.minimum) &&
        Objects.equals(this.maximum, platform.maximum) &&
        Objects.equals(this.downloadUrl, platform.downloadUrl) &&
        Objects.equals(this.description, platform.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, active, valid, device, minimum, maximum, downloadUrl, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Platform {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
    sb.append("    minimum: ").append(toIndentedString(minimum)).append("\n");
    sb.append("    maximum: ").append(toIndentedString(maximum)).append("\n");
    sb.append("    downloadUrl: ").append(toIndentedString(downloadUrl)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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


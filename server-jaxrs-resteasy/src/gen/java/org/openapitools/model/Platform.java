package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AudienceDevice;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-09T20:51:23.077809933Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class Platform   {
  
  private Long id;
  private Boolean active;
  private Boolean valid;
  private AudienceDevice device;
  private Long minimum;
  private Long maximum;
  private String downloadUrl;
  private String description;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
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
  @JsonProperty("valid")
  public Boolean getValid() {
    return valid;
  }
  public void setValid(Boolean valid) {
    this.valid = valid;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("device")
  @Valid
  public AudienceDevice getDevice() {
    return device;
  }
  public void setDevice(AudienceDevice device) {
    this.device = device;
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

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("downloadUrl")
  public String getDownloadUrl() {
    return downloadUrl;
  }
  public void setDownloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


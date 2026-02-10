package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * PlatformResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class PlatformResponse   {
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

  @JsonProperty("downloadUrl")
  
  private String downloadUrl;

  @JsonProperty("description")
  
  private String description;

  public PlatformResponse deviceId(Long deviceId) {
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

  public PlatformResponse active(Boolean active) {
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

  public PlatformResponse name(String name) {
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

  public PlatformResponse display(String display) {
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

  public PlatformResponse minimum(Long minimum) {
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

  public PlatformResponse maximum(Long maximum) {
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

  public PlatformResponse downloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
    return this;
  }

   /**
   * Get downloadUrl
   * @return downloadUrl
  **/
  public String getDownloadUrl() {
    return downloadUrl;
  }

  public void setDownloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
  }

  public PlatformResponse description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
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
    PlatformResponse platformResponse = (PlatformResponse) o;
    return Objects.equals(deviceId, platformResponse.deviceId) &&
        Objects.equals(active, platformResponse.active) &&
        Objects.equals(name, platformResponse.name) &&
        Objects.equals(display, platformResponse.display) &&
        Objects.equals(minimum, platformResponse.minimum) &&
        Objects.equals(maximum, platformResponse.maximum) &&
        Objects.equals(downloadUrl, platformResponse.downloadUrl) &&
        Objects.equals(description, platformResponse.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deviceId, active, name, display, minimum, maximum, downloadUrl, description);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlatformResponse {\n");
    
    sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    display: ").append(toIndentedString(display)).append("\n");
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


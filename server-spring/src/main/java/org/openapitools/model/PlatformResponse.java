package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PlatformResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-09T20:58:37.853899731Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class PlatformResponse {

  private @Nullable Long deviceId;

  private @Nullable Boolean active;

  private @Nullable String name;

  private @Nullable String display;

  private @Nullable Long minimum;

  private @Nullable Long maximum;

  private @Nullable String downloadUrl;

  private @Nullable String description;

  public PlatformResponse deviceId(@Nullable Long deviceId) {
    this.deviceId = deviceId;
    return this;
  }

  /**
   * Get deviceId
   * @return deviceId
   */
  
  @Schema(name = "deviceId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deviceId")
  public @Nullable Long getDeviceId() {
    return deviceId;
  }

  public void setDeviceId(@Nullable Long deviceId) {
    this.deviceId = deviceId;
  }

  public PlatformResponse active(@Nullable Boolean active) {
    this.active = active;
    return this;
  }

  /**
   * Get active
   * @return active
   */
  
  @Schema(name = "active", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("active")
  public @Nullable Boolean getActive() {
    return active;
  }

  public void setActive(@Nullable Boolean active) {
    this.active = active;
  }

  public PlatformResponse name(@Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  
  @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public @Nullable String getName() {
    return name;
  }

  public void setName(@Nullable String name) {
    this.name = name;
  }

  public PlatformResponse display(@Nullable String display) {
    this.display = display;
    return this;
  }

  /**
   * Get display
   * @return display
   */
  
  @Schema(name = "display", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("display")
  public @Nullable String getDisplay() {
    return display;
  }

  public void setDisplay(@Nullable String display) {
    this.display = display;
  }

  public PlatformResponse minimum(@Nullable Long minimum) {
    this.minimum = minimum;
    return this;
  }

  /**
   * Get minimum
   * @return minimum
   */
  
  @Schema(name = "minimum", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("minimum")
  public @Nullable Long getMinimum() {
    return minimum;
  }

  public void setMinimum(@Nullable Long minimum) {
    this.minimum = minimum;
  }

  public PlatformResponse maximum(@Nullable Long maximum) {
    this.maximum = maximum;
    return this;
  }

  /**
   * Get maximum
   * @return maximum
   */
  
  @Schema(name = "maximum", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("maximum")
  public @Nullable Long getMaximum() {
    return maximum;
  }

  public void setMaximum(@Nullable Long maximum) {
    this.maximum = maximum;
  }

  public PlatformResponse downloadUrl(@Nullable String downloadUrl) {
    this.downloadUrl = downloadUrl;
    return this;
  }

  /**
   * Get downloadUrl
   * @return downloadUrl
   */
  
  @Schema(name = "downloadUrl", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("downloadUrl")
  public @Nullable String getDownloadUrl() {
    return downloadUrl;
  }

  public void setDownloadUrl(@Nullable String downloadUrl) {
    this.downloadUrl = downloadUrl;
  }

  public PlatformResponse description(@Nullable String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   */
  
  @Schema(name = "description", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public @Nullable String getDescription() {
    return description;
  }

  public void setDescription(@Nullable String description) {
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
    return Objects.equals(this.deviceId, platformResponse.deviceId) &&
        Objects.equals(this.active, platformResponse.active) &&
        Objects.equals(this.name, platformResponse.name) &&
        Objects.equals(this.display, platformResponse.display) &&
        Objects.equals(this.minimum, platformResponse.minimum) &&
        Objects.equals(this.maximum, platformResponse.maximum) &&
        Objects.equals(this.downloadUrl, platformResponse.downloadUrl) &&
        Objects.equals(this.description, platformResponse.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deviceId, active, name, display, minimum, maximum, downloadUrl, description);
  }

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
  private String toIndentedString(@Nullable Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


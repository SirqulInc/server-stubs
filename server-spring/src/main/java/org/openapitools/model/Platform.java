package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.AudienceDevice;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Platform
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-09T20:58:37.853899731Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class Platform {

  private @Nullable Long id;

  private @Nullable Boolean active;

  private @Nullable Boolean valid;

  private @Nullable AudienceDevice device;

  private @Nullable Long minimum;

  private @Nullable Long maximum;

  private @Nullable String downloadUrl;

  private @Nullable String description;

  public Platform id(@Nullable Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public @Nullable Long getId() {
    return id;
  }

  public void setId(@Nullable Long id) {
    this.id = id;
  }

  public Platform active(@Nullable Boolean active) {
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

  public Platform valid(@Nullable Boolean valid) {
    this.valid = valid;
    return this;
  }

  /**
   * Get valid
   * @return valid
   */
  
  @Schema(name = "valid", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("valid")
  public @Nullable Boolean getValid() {
    return valid;
  }

  public void setValid(@Nullable Boolean valid) {
    this.valid = valid;
  }

  public Platform device(@Nullable AudienceDevice device) {
    this.device = device;
    return this;
  }

  /**
   * Get device
   * @return device
   */
  @Valid 
  @Schema(name = "device", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("device")
  public @Nullable AudienceDevice getDevice() {
    return device;
  }

  public void setDevice(@Nullable AudienceDevice device) {
    this.device = device;
  }

  public Platform minimum(@Nullable Long minimum) {
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

  public Platform maximum(@Nullable Long maximum) {
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

  public Platform downloadUrl(@Nullable String downloadUrl) {
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

  public Platform description(@Nullable String description) {
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
  private String toIndentedString(@Nullable Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


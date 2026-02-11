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
 * AudienceDeviceVersionRange
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-11T19:32:41.765375324Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class AudienceDeviceVersionRange {

  private @Nullable Long id;

  private @Nullable Boolean active;

  private @Nullable Boolean valid;

  private @Nullable AudienceDevice device;

  private @Nullable Long minimum;

  private @Nullable Long maximum;

  public AudienceDeviceVersionRange id(@Nullable Long id) {
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

  public AudienceDeviceVersionRange active(@Nullable Boolean active) {
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

  public AudienceDeviceVersionRange valid(@Nullable Boolean valid) {
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

  public AudienceDeviceVersionRange device(@Nullable AudienceDevice device) {
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

  public AudienceDeviceVersionRange minimum(@Nullable Long minimum) {
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

  public AudienceDeviceVersionRange maximum(@Nullable Long maximum) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AudienceDeviceVersionRange audienceDeviceVersionRange = (AudienceDeviceVersionRange) o;
    return Objects.equals(this.id, audienceDeviceVersionRange.id) &&
        Objects.equals(this.active, audienceDeviceVersionRange.active) &&
        Objects.equals(this.valid, audienceDeviceVersionRange.valid) &&
        Objects.equals(this.device, audienceDeviceVersionRange.device) &&
        Objects.equals(this.minimum, audienceDeviceVersionRange.minimum) &&
        Objects.equals(this.maximum, audienceDeviceVersionRange.maximum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, active, valid, device, minimum, maximum);
  }

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
  private String toIndentedString(@Nullable Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


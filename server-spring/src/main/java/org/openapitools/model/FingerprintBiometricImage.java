package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * FingerprintBiometricImage
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-09T20:58:37.853899731Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class FingerprintBiometricImage {

  /**
   * Gets or Sets position
   */
  public enum PositionEnum {
    UNKNOWN("UNKNOWN"),
    
    LEFT_INDEX("LEFT_INDEX"),
    
    LEFT_MIDDLE("LEFT_MIDDLE"),
    
    LEFT_RING("LEFT_RING"),
    
    LEFT_LITTLE("LEFT_LITTLE"),
    
    LEFT_THUMB("LEFT_THUMB"),
    
    RIGHT_INDEX("RIGHT_INDEX"),
    
    RIGHT_MIDDLE("RIGHT_MIDDLE"),
    
    RIGHT_RING("RIGHT_RING"),
    
    RIGHT_LITTLE("RIGHT_LITTLE"),
    
    RIGHT_THUMB("RIGHT_THUMB"),
    
    LEFT("LEFT"),
    
    RIGHT("RIGHT");

    private final String value;

    PositionEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static PositionEnum fromValue(String value) {
      for (PositionEnum b : PositionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable PositionEnum position;

  private @Nullable String data;

  private @Nullable String imageFormat;

  public FingerprintBiometricImage position(@Nullable PositionEnum position) {
    this.position = position;
    return this;
  }

  /**
   * Get position
   * @return position
   */
  
  @Schema(name = "position", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("position")
  public @Nullable PositionEnum getPosition() {
    return position;
  }

  public void setPosition(@Nullable PositionEnum position) {
    this.position = position;
  }

  public FingerprintBiometricImage data(@Nullable String data) {
    this.data = data;
    return this;
  }

  /**
   * Get data
   * @return data
   */
  
  @Schema(name = "data", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("data")
  public @Nullable String getData() {
    return data;
  }

  public void setData(@Nullable String data) {
    this.data = data;
  }

  public FingerprintBiometricImage imageFormat(@Nullable String imageFormat) {
    this.imageFormat = imageFormat;
    return this;
  }

  /**
   * Get imageFormat
   * @return imageFormat
   */
  
  @Schema(name = "imageFormat", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("imageFormat")
  public @Nullable String getImageFormat() {
    return imageFormat;
  }

  public void setImageFormat(@Nullable String imageFormat) {
    this.imageFormat = imageFormat;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FingerprintBiometricImage fingerprintBiometricImage = (FingerprintBiometricImage) o;
    return Objects.equals(this.position, fingerprintBiometricImage.position) &&
        Objects.equals(this.data, fingerprintBiometricImage.data) &&
        Objects.equals(this.imageFormat, fingerprintBiometricImage.imageFormat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(position, data, imageFormat);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FingerprintBiometricImage {\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    imageFormat: ").append(toIndentedString(imageFormat)).append("\n");
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


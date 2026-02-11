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
 * BiometricImage
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-11T19:32:41.765375324Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class BiometricImage {

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

  public BiometricImage position(@Nullable PositionEnum position) {
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

  public BiometricImage data(@Nullable String data) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BiometricImage biometricImage = (BiometricImage) o;
    return Objects.equals(this.position, biometricImage.position) &&
        Objects.equals(this.data, biometricImage.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(position, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BiometricImage {\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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


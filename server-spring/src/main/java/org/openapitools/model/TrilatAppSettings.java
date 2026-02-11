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
 * TrilatAppSettings
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-11T19:32:41.765375324Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class TrilatAppSettings {

  /**
   * Gets or Sets processingType
   */
  public enum ProcessingTypeEnum {
    DEFAULT("DEFAULT"),
    
    FINGERPRINT("FINGERPRINT"),
    
    FINGERPRINT_V2("FINGERPRINT_V2");

    private final String value;

    ProcessingTypeEnum(String value) {
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
    public static ProcessingTypeEnum fromValue(String value) {
      for (ProcessingTypeEnum b : ProcessingTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable ProcessingTypeEnum processingType;

  private @Nullable Integer maxSampleSize;

  private @Nullable Double minRSSI;

  public TrilatAppSettings processingType(@Nullable ProcessingTypeEnum processingType) {
    this.processingType = processingType;
    return this;
  }

  /**
   * Get processingType
   * @return processingType
   */
  
  @Schema(name = "processingType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processingType")
  public @Nullable ProcessingTypeEnum getProcessingType() {
    return processingType;
  }

  public void setProcessingType(@Nullable ProcessingTypeEnum processingType) {
    this.processingType = processingType;
  }

  public TrilatAppSettings maxSampleSize(@Nullable Integer maxSampleSize) {
    this.maxSampleSize = maxSampleSize;
    return this;
  }

  /**
   * Get maxSampleSize
   * @return maxSampleSize
   */
  
  @Schema(name = "maxSampleSize", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("maxSampleSize")
  public @Nullable Integer getMaxSampleSize() {
    return maxSampleSize;
  }

  public void setMaxSampleSize(@Nullable Integer maxSampleSize) {
    this.maxSampleSize = maxSampleSize;
  }

  public TrilatAppSettings minRSSI(@Nullable Double minRSSI) {
    this.minRSSI = minRSSI;
    return this;
  }

  /**
   * Get minRSSI
   * @return minRSSI
   */
  
  @Schema(name = "minRSSI", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("minRSSI")
  public @Nullable Double getMinRSSI() {
    return minRSSI;
  }

  public void setMinRSSI(@Nullable Double minRSSI) {
    this.minRSSI = minRSSI;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrilatAppSettings trilatAppSettings = (TrilatAppSettings) o;
    return Objects.equals(this.processingType, trilatAppSettings.processingType) &&
        Objects.equals(this.maxSampleSize, trilatAppSettings.maxSampleSize) &&
        Objects.equals(this.minRSSI, trilatAppSettings.minRSSI);
  }

  @Override
  public int hashCode() {
    return Objects.hash(processingType, maxSampleSize, minRSSI);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrilatAppSettings {\n");
    sb.append("    processingType: ").append(toIndentedString(processingType)).append("\n");
    sb.append("    maxSampleSize: ").append(toIndentedString(maxSampleSize)).append("\n");
    sb.append("    minRSSI: ").append(toIndentedString(minRSSI)).append("\n");
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


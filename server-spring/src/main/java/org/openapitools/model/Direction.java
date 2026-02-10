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
 * Direction
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-09T20:58:37.853899731Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class Direction {

  private @Nullable Long id;

  private @Nullable Boolean active;

  private @Nullable Boolean valid;

  private @Nullable String distance;

  private @Nullable String duration;

  private @Nullable Double endLatitude;

  private @Nullable Double endLongitude;

  private @Nullable Double startLatitude;

  private @Nullable Double startLongitude;

  private @Nullable String instruction;

  private @Nullable String polyline;

  /**
   * Gets or Sets progressStatus
   */
  public enum ProgressStatusEnum {
    PENDING("PENDING"),
    
    COMPLETE("COMPLETE"),
    
    INVALID("INVALID");

    private final String value;

    ProgressStatusEnum(String value) {
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
    public static ProgressStatusEnum fromValue(String value) {
      for (ProgressStatusEnum b : ProgressStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable ProgressStatusEnum progressStatus;

  private @Nullable Boolean highlight;

  public Direction id(@Nullable Long id) {
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

  public Direction active(@Nullable Boolean active) {
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

  public Direction valid(@Nullable Boolean valid) {
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

  public Direction distance(@Nullable String distance) {
    this.distance = distance;
    return this;
  }

  /**
   * Get distance
   * @return distance
   */
  
  @Schema(name = "distance", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("distance")
  public @Nullable String getDistance() {
    return distance;
  }

  public void setDistance(@Nullable String distance) {
    this.distance = distance;
  }

  public Direction duration(@Nullable String duration) {
    this.duration = duration;
    return this;
  }

  /**
   * Get duration
   * @return duration
   */
  
  @Schema(name = "duration", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("duration")
  public @Nullable String getDuration() {
    return duration;
  }

  public void setDuration(@Nullable String duration) {
    this.duration = duration;
  }

  public Direction endLatitude(@Nullable Double endLatitude) {
    this.endLatitude = endLatitude;
    return this;
  }

  /**
   * Get endLatitude
   * @return endLatitude
   */
  
  @Schema(name = "endLatitude", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("endLatitude")
  public @Nullable Double getEndLatitude() {
    return endLatitude;
  }

  public void setEndLatitude(@Nullable Double endLatitude) {
    this.endLatitude = endLatitude;
  }

  public Direction endLongitude(@Nullable Double endLongitude) {
    this.endLongitude = endLongitude;
    return this;
  }

  /**
   * Get endLongitude
   * @return endLongitude
   */
  
  @Schema(name = "endLongitude", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("endLongitude")
  public @Nullable Double getEndLongitude() {
    return endLongitude;
  }

  public void setEndLongitude(@Nullable Double endLongitude) {
    this.endLongitude = endLongitude;
  }

  public Direction startLatitude(@Nullable Double startLatitude) {
    this.startLatitude = startLatitude;
    return this;
  }

  /**
   * Get startLatitude
   * @return startLatitude
   */
  
  @Schema(name = "startLatitude", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("startLatitude")
  public @Nullable Double getStartLatitude() {
    return startLatitude;
  }

  public void setStartLatitude(@Nullable Double startLatitude) {
    this.startLatitude = startLatitude;
  }

  public Direction startLongitude(@Nullable Double startLongitude) {
    this.startLongitude = startLongitude;
    return this;
  }

  /**
   * Get startLongitude
   * @return startLongitude
   */
  
  @Schema(name = "startLongitude", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("startLongitude")
  public @Nullable Double getStartLongitude() {
    return startLongitude;
  }

  public void setStartLongitude(@Nullable Double startLongitude) {
    this.startLongitude = startLongitude;
  }

  public Direction instruction(@Nullable String instruction) {
    this.instruction = instruction;
    return this;
  }

  /**
   * Get instruction
   * @return instruction
   */
  
  @Schema(name = "instruction", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("instruction")
  public @Nullable String getInstruction() {
    return instruction;
  }

  public void setInstruction(@Nullable String instruction) {
    this.instruction = instruction;
  }

  public Direction polyline(@Nullable String polyline) {
    this.polyline = polyline;
    return this;
  }

  /**
   * Get polyline
   * @return polyline
   */
  
  @Schema(name = "polyline", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("polyline")
  public @Nullable String getPolyline() {
    return polyline;
  }

  public void setPolyline(@Nullable String polyline) {
    this.polyline = polyline;
  }

  public Direction progressStatus(@Nullable ProgressStatusEnum progressStatus) {
    this.progressStatus = progressStatus;
    return this;
  }

  /**
   * Get progressStatus
   * @return progressStatus
   */
  
  @Schema(name = "progressStatus", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("progressStatus")
  public @Nullable ProgressStatusEnum getProgressStatus() {
    return progressStatus;
  }

  public void setProgressStatus(@Nullable ProgressStatusEnum progressStatus) {
    this.progressStatus = progressStatus;
  }

  public Direction highlight(@Nullable Boolean highlight) {
    this.highlight = highlight;
    return this;
  }

  /**
   * Get highlight
   * @return highlight
   */
  
  @Schema(name = "highlight", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("highlight")
  public @Nullable Boolean getHighlight() {
    return highlight;
  }

  public void setHighlight(@Nullable Boolean highlight) {
    this.highlight = highlight;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Direction direction = (Direction) o;
    return Objects.equals(this.id, direction.id) &&
        Objects.equals(this.active, direction.active) &&
        Objects.equals(this.valid, direction.valid) &&
        Objects.equals(this.distance, direction.distance) &&
        Objects.equals(this.duration, direction.duration) &&
        Objects.equals(this.endLatitude, direction.endLatitude) &&
        Objects.equals(this.endLongitude, direction.endLongitude) &&
        Objects.equals(this.startLatitude, direction.startLatitude) &&
        Objects.equals(this.startLongitude, direction.startLongitude) &&
        Objects.equals(this.instruction, direction.instruction) &&
        Objects.equals(this.polyline, direction.polyline) &&
        Objects.equals(this.progressStatus, direction.progressStatus) &&
        Objects.equals(this.highlight, direction.highlight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, active, valid, distance, duration, endLatitude, endLongitude, startLatitude, startLongitude, instruction, polyline, progressStatus, highlight);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Direction {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    endLatitude: ").append(toIndentedString(endLatitude)).append("\n");
    sb.append("    endLongitude: ").append(toIndentedString(endLongitude)).append("\n");
    sb.append("    startLatitude: ").append(toIndentedString(startLatitude)).append("\n");
    sb.append("    startLongitude: ").append(toIndentedString(startLongitude)).append("\n");
    sb.append("    instruction: ").append(toIndentedString(instruction)).append("\n");
    sb.append("    polyline: ").append(toIndentedString(polyline)).append("\n");
    sb.append("    progressStatus: ").append(toIndentedString(progressStatus)).append("\n");
    sb.append("    highlight: ").append(toIndentedString(highlight)).append("\n");
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


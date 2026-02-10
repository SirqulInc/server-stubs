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
 * MissionFormatResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-09T20:58:37.853899731Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class MissionFormatResponse {

  private @Nullable Long missionFormatId;

  private @Nullable String formatType;

  private @Nullable Boolean active;

  private @Nullable String name;

  private @Nullable String description;

  private @Nullable String format;

  private @Nullable String suffix;

  public MissionFormatResponse missionFormatId(@Nullable Long missionFormatId) {
    this.missionFormatId = missionFormatId;
    return this;
  }

  /**
   * Get missionFormatId
   * @return missionFormatId
   */
  
  @Schema(name = "missionFormatId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("missionFormatId")
  public @Nullable Long getMissionFormatId() {
    return missionFormatId;
  }

  public void setMissionFormatId(@Nullable Long missionFormatId) {
    this.missionFormatId = missionFormatId;
  }

  public MissionFormatResponse formatType(@Nullable String formatType) {
    this.formatType = formatType;
    return this;
  }

  /**
   * Get formatType
   * @return formatType
   */
  
  @Schema(name = "formatType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("formatType")
  public @Nullable String getFormatType() {
    return formatType;
  }

  public void setFormatType(@Nullable String formatType) {
    this.formatType = formatType;
  }

  public MissionFormatResponse active(@Nullable Boolean active) {
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

  public MissionFormatResponse name(@Nullable String name) {
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

  public MissionFormatResponse description(@Nullable String description) {
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

  public MissionFormatResponse format(@Nullable String format) {
    this.format = format;
    return this;
  }

  /**
   * Get format
   * @return format
   */
  
  @Schema(name = "format", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("format")
  public @Nullable String getFormat() {
    return format;
  }

  public void setFormat(@Nullable String format) {
    this.format = format;
  }

  public MissionFormatResponse suffix(@Nullable String suffix) {
    this.suffix = suffix;
    return this;
  }

  /**
   * Get suffix
   * @return suffix
   */
  
  @Schema(name = "suffix", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("suffix")
  public @Nullable String getSuffix() {
    return suffix;
  }

  public void setSuffix(@Nullable String suffix) {
    this.suffix = suffix;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MissionFormatResponse missionFormatResponse = (MissionFormatResponse) o;
    return Objects.equals(this.missionFormatId, missionFormatResponse.missionFormatId) &&
        Objects.equals(this.formatType, missionFormatResponse.formatType) &&
        Objects.equals(this.active, missionFormatResponse.active) &&
        Objects.equals(this.name, missionFormatResponse.name) &&
        Objects.equals(this.description, missionFormatResponse.description) &&
        Objects.equals(this.format, missionFormatResponse.format) &&
        Objects.equals(this.suffix, missionFormatResponse.suffix);
  }

  @Override
  public int hashCode() {
    return Objects.hash(missionFormatId, formatType, active, name, description, format, suffix);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MissionFormatResponse {\n");
    sb.append("    missionFormatId: ").append(toIndentedString(missionFormatId)).append("\n");
    sb.append("    formatType: ").append(toIndentedString(formatType)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    suffix: ").append(toIndentedString(suffix)).append("\n");
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


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
 * MissionTask
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-09T20:58:37.853899731Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class MissionTask {

  private @Nullable Long id;

  private @Nullable Boolean active;

  private @Nullable Boolean valid;

  private @Nullable String name;

  private @Nullable String description;

  private @Nullable String format;

  private @Nullable String suffix;

  /**
   * Gets or Sets taskType
   */
  public enum TaskTypeEnum {
    PHOTO("PHOTO"),
    
    VOTE("VOTE"),
    
    ASK("ASK"),
    
    ANSWER("ANSWER"),
    
    GROUP("GROUP"),
    
    INVITE("INVITE"),
    
    OFFER("OFFER"),
    
    AD("AD"),
    
    CUSTOM("CUSTOM"),
    
    GAME("GAME");

    private final String value;

    TaskTypeEnum(String value) {
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
    public static TaskTypeEnum fromValue(String value) {
      for (TaskTypeEnum b : TaskTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable TaskTypeEnum taskType;

  public MissionTask id(@Nullable Long id) {
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

  public MissionTask active(@Nullable Boolean active) {
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

  public MissionTask valid(@Nullable Boolean valid) {
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

  public MissionTask name(@Nullable String name) {
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

  public MissionTask description(@Nullable String description) {
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

  public MissionTask format(@Nullable String format) {
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

  public MissionTask suffix(@Nullable String suffix) {
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

  public MissionTask taskType(@Nullable TaskTypeEnum taskType) {
    this.taskType = taskType;
    return this;
  }

  /**
   * Get taskType
   * @return taskType
   */
  
  @Schema(name = "taskType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("taskType")
  public @Nullable TaskTypeEnum getTaskType() {
    return taskType;
  }

  public void setTaskType(@Nullable TaskTypeEnum taskType) {
    this.taskType = taskType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MissionTask missionTask = (MissionTask) o;
    return Objects.equals(this.id, missionTask.id) &&
        Objects.equals(this.active, missionTask.active) &&
        Objects.equals(this.valid, missionTask.valid) &&
        Objects.equals(this.name, missionTask.name) &&
        Objects.equals(this.description, missionTask.description) &&
        Objects.equals(this.format, missionTask.format) &&
        Objects.equals(this.suffix, missionTask.suffix) &&
        Objects.equals(this.taskType, missionTask.taskType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, active, valid, name, description, format, suffix, taskType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MissionTask {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    suffix: ").append(toIndentedString(suffix)).append("\n");
    sb.append("    taskType: ").append(toIndentedString(taskType)).append("\n");
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


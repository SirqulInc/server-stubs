package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-09T20:51:23.077809933Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class MissionTask   {
  
  private Long id;
  private Boolean active;
  private Boolean valid;
  private String name;
  private String description;
  private String format;
  private String suffix;

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
    private String value;

    TaskTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private TaskTypeEnum taskType;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("active")
  public Boolean getActive() {
    return active;
  }
  public void setActive(Boolean active) {
    this.active = active;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("valid")
  public Boolean getValid() {
    return valid;
  }
  public void setValid(Boolean valid) {
    this.valid = valid;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("format")
  public String getFormat() {
    return format;
  }
  public void setFormat(String format) {
    this.format = format;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("suffix")
  public String getSuffix() {
    return suffix;
  }
  public void setSuffix(String suffix) {
    this.suffix = suffix;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("taskType")
  public TaskTypeEnum getTaskType() {
    return taskType;
  }
  public void setTaskType(TaskTypeEnum taskType) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


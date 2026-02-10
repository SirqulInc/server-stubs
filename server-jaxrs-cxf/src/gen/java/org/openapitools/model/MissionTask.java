package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class MissionTask  {
  
  @ApiModelProperty(value = "")

  private Long id;

  @ApiModelProperty(value = "")

  private Boolean active;

  @ApiModelProperty(value = "")

  private Boolean valid;

  @ApiModelProperty(value = "")

  private String name;

  @ApiModelProperty(value = "")

  private String description;

  @ApiModelProperty(value = "")

  private String format;

  @ApiModelProperty(value = "")

  private String suffix;

public enum TaskTypeEnum {

PHOTO(String.valueOf("PHOTO")), VOTE(String.valueOf("VOTE")), ASK(String.valueOf("ASK")), ANSWER(String.valueOf("ANSWER")), GROUP(String.valueOf("GROUP")), INVITE(String.valueOf("INVITE")), OFFER(String.valueOf("OFFER")), AD(String.valueOf("AD")), CUSTOM(String.valueOf("CUSTOM")), GAME(String.valueOf("GAME"));


    private String value;

    TaskTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
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

  @ApiModelProperty(value = "")

  private TaskTypeEnum taskType;
 /**
   * Get id
   * @return id
  **/
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public MissionTask id(Long id) {
    this.id = id;
    return this;
  }

 /**
   * Get active
   * @return active
  **/
  @JsonProperty("active")
  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public MissionTask active(Boolean active) {
    this.active = active;
    return this;
  }

 /**
   * Get valid
   * @return valid
  **/
  @JsonProperty("valid")
  public Boolean getValid() {
    return valid;
  }

  public void setValid(Boolean valid) {
    this.valid = valid;
  }

  public MissionTask valid(Boolean valid) {
    this.valid = valid;
    return this;
  }

 /**
   * Get name
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public MissionTask name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get description
   * @return description
  **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public MissionTask description(String description) {
    this.description = description;
    return this;
  }

 /**
   * Get format
   * @return format
  **/
  @JsonProperty("format")
  public String getFormat() {
    return format;
  }

  public void setFormat(String format) {
    this.format = format;
  }

  public MissionTask format(String format) {
    this.format = format;
    return this;
  }

 /**
   * Get suffix
   * @return suffix
  **/
  @JsonProperty("suffix")
  public String getSuffix() {
    return suffix;
  }

  public void setSuffix(String suffix) {
    this.suffix = suffix;
  }

  public MissionTask suffix(String suffix) {
    this.suffix = suffix;
    return this;
  }

 /**
   * Get taskType
   * @return taskType
  **/
  @JsonProperty("taskType")
  public String getTaskType() {
    if (taskType == null) {
      return null;
    }
    return taskType.value();
  }

  public void setTaskType(TaskTypeEnum taskType) {
    this.taskType = taskType;
  }

  public MissionTask taskType(TaskTypeEnum taskType) {
    this.taskType = taskType;
    return this;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


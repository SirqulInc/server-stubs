package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class MissionFormatResponse  {
  
  @ApiModelProperty(value = "")

  private Long missionFormatId;

  @ApiModelProperty(value = "")

  private String formatType;

  @ApiModelProperty(value = "")

  private Boolean active;

  @ApiModelProperty(value = "")

  private String name;

  @ApiModelProperty(value = "")

  private String description;

  @ApiModelProperty(value = "")

  private String format;

  @ApiModelProperty(value = "")

  private String suffix;
 /**
   * Get missionFormatId
   * @return missionFormatId
  **/
  @JsonProperty("missionFormatId")
  public Long getMissionFormatId() {
    return missionFormatId;
  }

  public void setMissionFormatId(Long missionFormatId) {
    this.missionFormatId = missionFormatId;
  }

  public MissionFormatResponse missionFormatId(Long missionFormatId) {
    this.missionFormatId = missionFormatId;
    return this;
  }

 /**
   * Get formatType
   * @return formatType
  **/
  @JsonProperty("formatType")
  public String getFormatType() {
    return formatType;
  }

  public void setFormatType(String formatType) {
    this.formatType = formatType;
  }

  public MissionFormatResponse formatType(String formatType) {
    this.formatType = formatType;
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

  public MissionFormatResponse active(Boolean active) {
    this.active = active;
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

  public MissionFormatResponse name(String name) {
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

  public MissionFormatResponse description(String description) {
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

  public MissionFormatResponse format(String format) {
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

  public MissionFormatResponse suffix(String suffix) {
    this.suffix = suffix;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


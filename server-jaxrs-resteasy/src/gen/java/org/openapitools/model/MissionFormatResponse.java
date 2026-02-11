package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class MissionFormatResponse   {
  
  private Long missionFormatId;
  private String formatType;
  private Boolean active;
  private String name;
  private String description;
  private String format;
  private String suffix;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("missionFormatId")
  public Long getMissionFormatId() {
    return missionFormatId;
  }
  public void setMissionFormatId(Long missionFormatId) {
    this.missionFormatId = missionFormatId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("formatType")
  public String getFormatType() {
    return formatType;
  }
  public void setFormatType(String formatType) {
    this.formatType = formatType;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


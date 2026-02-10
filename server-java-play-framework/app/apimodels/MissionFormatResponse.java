package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * MissionFormatResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class MissionFormatResponse   {
  @JsonProperty("missionFormatId")
  
  private Long missionFormatId;

  @JsonProperty("formatType")
  
  private String formatType;

  @JsonProperty("active")
  
  private Boolean active;

  @JsonProperty("name")
  
  private String name;

  @JsonProperty("description")
  
  private String description;

  @JsonProperty("format")
  
  private String format;

  @JsonProperty("suffix")
  
  private String suffix;

  public MissionFormatResponse missionFormatId(Long missionFormatId) {
    this.missionFormatId = missionFormatId;
    return this;
  }

   /**
   * Get missionFormatId
   * @return missionFormatId
  **/
  public Long getMissionFormatId() {
    return missionFormatId;
  }

  public void setMissionFormatId(Long missionFormatId) {
    this.missionFormatId = missionFormatId;
  }

  public MissionFormatResponse formatType(String formatType) {
    this.formatType = formatType;
    return this;
  }

   /**
   * Get formatType
   * @return formatType
  **/
  public String getFormatType() {
    return formatType;
  }

  public void setFormatType(String formatType) {
    this.formatType = formatType;
  }

  public MissionFormatResponse active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public MissionFormatResponse name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public MissionFormatResponse description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public MissionFormatResponse format(String format) {
    this.format = format;
    return this;
  }

   /**
   * Get format
   * @return format
  **/
  public String getFormat() {
    return format;
  }

  public void setFormat(String format) {
    this.format = format;
  }

  public MissionFormatResponse suffix(String suffix) {
    this.suffix = suffix;
    return this;
  }

   /**
   * Get suffix
   * @return suffix
  **/
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
    return Objects.equals(missionFormatId, missionFormatResponse.missionFormatId) &&
        Objects.equals(formatType, missionFormatResponse.formatType) &&
        Objects.equals(active, missionFormatResponse.active) &&
        Objects.equals(name, missionFormatResponse.name) &&
        Objects.equals(description, missionFormatResponse.description) &&
        Objects.equals(format, missionFormatResponse.format) &&
        Objects.equals(suffix, missionFormatResponse.suffix);
  }

  @Override
  public int hashCode() {
    return Objects.hash(missionFormatId, formatType, active, name, description, format, suffix);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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


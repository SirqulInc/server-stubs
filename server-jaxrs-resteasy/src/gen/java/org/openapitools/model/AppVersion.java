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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-09T20:51:23.077809933Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class AppVersion   {
  
  private Integer minorVersion;
  private Integer majorVersion;
  private Integer versionIndex;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("minorVersion")
  public Integer getMinorVersion() {
    return minorVersion;
  }
  public void setMinorVersion(Integer minorVersion) {
    this.minorVersion = minorVersion;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("majorVersion")
  public Integer getMajorVersion() {
    return majorVersion;
  }
  public void setMajorVersion(Integer majorVersion) {
    this.majorVersion = majorVersion;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("versionIndex")
  public Integer getVersionIndex() {
    return versionIndex;
  }
  public void setVersionIndex(Integer versionIndex) {
    this.versionIndex = versionIndex;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppVersion appVersion = (AppVersion) o;
    return Objects.equals(this.minorVersion, appVersion.minorVersion) &&
        Objects.equals(this.majorVersion, appVersion.majorVersion) &&
        Objects.equals(this.versionIndex, appVersion.versionIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minorVersion, majorVersion, versionIndex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppVersion {\n");
    
    sb.append("    minorVersion: ").append(toIndentedString(minorVersion)).append("\n");
    sb.append("    majorVersion: ").append(toIndentedString(majorVersion)).append("\n");
    sb.append("    versionIndex: ").append(toIndentedString(versionIndex)).append("\n");
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


package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AppVersion  {
  
  @ApiModelProperty(value = "")

  private Integer minorVersion;

  @ApiModelProperty(value = "")

  private Integer majorVersion;

  @ApiModelProperty(value = "")

  private Integer versionIndex;
 /**
   * Get minorVersion
   * @return minorVersion
  **/
  @JsonProperty("minorVersion")
  public Integer getMinorVersion() {
    return minorVersion;
  }

  public void setMinorVersion(Integer minorVersion) {
    this.minorVersion = minorVersion;
  }

  public AppVersion minorVersion(Integer minorVersion) {
    this.minorVersion = minorVersion;
    return this;
  }

 /**
   * Get majorVersion
   * @return majorVersion
  **/
  @JsonProperty("majorVersion")
  public Integer getMajorVersion() {
    return majorVersion;
  }

  public void setMajorVersion(Integer majorVersion) {
    this.majorVersion = majorVersion;
  }

  public AppVersion majorVersion(Integer majorVersion) {
    this.majorVersion = majorVersion;
    return this;
  }

 /**
   * Get versionIndex
   * @return versionIndex
  **/
  @JsonProperty("versionIndex")
  public Integer getVersionIndex() {
    return versionIndex;
  }

  public void setVersionIndex(Integer versionIndex) {
    this.versionIndex = versionIndex;
  }

  public AppVersion versionIndex(Integer versionIndex) {
    this.versionIndex = versionIndex;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


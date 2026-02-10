package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * AppVersion
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class AppVersion   {
  @JsonProperty("minorVersion")
  
  private Integer minorVersion;

  @JsonProperty("majorVersion")
  
  private Integer majorVersion;

  @JsonProperty("versionIndex")
  
  private Integer versionIndex;

  public AppVersion minorVersion(Integer minorVersion) {
    this.minorVersion = minorVersion;
    return this;
  }

   /**
   * Get minorVersion
   * @return minorVersion
  **/
  public Integer getMinorVersion() {
    return minorVersion;
  }

  public void setMinorVersion(Integer minorVersion) {
    this.minorVersion = minorVersion;
  }

  public AppVersion majorVersion(Integer majorVersion) {
    this.majorVersion = majorVersion;
    return this;
  }

   /**
   * Get majorVersion
   * @return majorVersion
  **/
  public Integer getMajorVersion() {
    return majorVersion;
  }

  public void setMajorVersion(Integer majorVersion) {
    this.majorVersion = majorVersion;
  }

  public AppVersion versionIndex(Integer versionIndex) {
    this.versionIndex = versionIndex;
    return this;
  }

   /**
   * Get versionIndex
   * @return versionIndex
  **/
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
    return Objects.equals(minorVersion, appVersion.minorVersion) &&
        Objects.equals(majorVersion, appVersion.majorVersion) &&
        Objects.equals(versionIndex, appVersion.versionIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minorVersion, majorVersion, versionIndex);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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


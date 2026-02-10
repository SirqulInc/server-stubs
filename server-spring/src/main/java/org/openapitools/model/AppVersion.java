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
 * AppVersion
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-09T20:58:37.853899731Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class AppVersion {

  private @Nullable Integer minorVersion;

  private @Nullable Integer majorVersion;

  private @Nullable Integer versionIndex;

  public AppVersion minorVersion(@Nullable Integer minorVersion) {
    this.minorVersion = minorVersion;
    return this;
  }

  /**
   * Get minorVersion
   * @return minorVersion
   */
  
  @Schema(name = "minorVersion", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("minorVersion")
  public @Nullable Integer getMinorVersion() {
    return minorVersion;
  }

  public void setMinorVersion(@Nullable Integer minorVersion) {
    this.minorVersion = minorVersion;
  }

  public AppVersion majorVersion(@Nullable Integer majorVersion) {
    this.majorVersion = majorVersion;
    return this;
  }

  /**
   * Get majorVersion
   * @return majorVersion
   */
  
  @Schema(name = "majorVersion", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("majorVersion")
  public @Nullable Integer getMajorVersion() {
    return majorVersion;
  }

  public void setMajorVersion(@Nullable Integer majorVersion) {
    this.majorVersion = majorVersion;
  }

  public AppVersion versionIndex(@Nullable Integer versionIndex) {
    this.versionIndex = versionIndex;
    return this;
  }

  /**
   * Get versionIndex
   * @return versionIndex
   */
  
  @Schema(name = "versionIndex", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("versionIndex")
  public @Nullable Integer getVersionIndex() {
    return versionIndex;
  }

  public void setVersionIndex(@Nullable Integer versionIndex) {
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
  private String toIndentedString(@Nullable Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


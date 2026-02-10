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
 * AgeGroupResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-09T20:58:37.853899731Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class AgeGroupResponse {

  private @Nullable String key;

  private @Nullable String toString;

  public AgeGroupResponse key(@Nullable String key) {
    this.key = key;
    return this;
  }

  /**
   * Get key
   * @return key
   */
  
  @Schema(name = "key", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("key")
  public @Nullable String getKey() {
    return key;
  }

  public void setKey(@Nullable String key) {
    this.key = key;
  }

  public AgeGroupResponse toString(@Nullable String toString) {
    this.toString = toString;
    return this;
  }

  /**
   * Get toString
   * @return toString
   */
  
  @Schema(name = "toString", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("toString")
  public @Nullable String getToString() {
    return toString;
  }

  public void setToString(@Nullable String toString) {
    this.toString = toString;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgeGroupResponse ageGroupResponse = (AgeGroupResponse) o;
    return Objects.equals(this.key, ageGroupResponse.key) &&
        Objects.equals(this.toString, ageGroupResponse.toString);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, toString);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgeGroupResponse {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    toString: ").append(toIndentedString(toString)).append("\n");
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


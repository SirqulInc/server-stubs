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
 * DateTimeZone
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-11T19:32:41.765375324Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class DateTimeZone {

  private @Nullable String id;

  private @Nullable Boolean fixed;

  public DateTimeZone id(@Nullable String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public @Nullable String getId() {
    return id;
  }

  public void setId(@Nullable String id) {
    this.id = id;
  }

  public DateTimeZone fixed(@Nullable Boolean fixed) {
    this.fixed = fixed;
    return this;
  }

  /**
   * Get fixed
   * @return fixed
   */
  
  @Schema(name = "fixed", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fixed")
  public @Nullable Boolean getFixed() {
    return fixed;
  }

  public void setFixed(@Nullable Boolean fixed) {
    this.fixed = fixed;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DateTimeZone dateTimeZone = (DateTimeZone) o;
    return Objects.equals(this.id, dateTimeZone.id) &&
        Objects.equals(this.fixed, dateTimeZone.fixed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, fixed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DateTimeZone {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    fixed: ").append(toIndentedString(fixed)).append("\n");
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


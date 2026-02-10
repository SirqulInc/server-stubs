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
 * Permissions
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-09T20:58:37.853899731Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class Permissions {

  private @Nullable Boolean read;

  private @Nullable Boolean write;

  private @Nullable Boolean delete;

  private @Nullable Boolean add;

  public Permissions read(@Nullable Boolean read) {
    this.read = read;
    return this;
  }

  /**
   * Get read
   * @return read
   */
  
  @Schema(name = "read", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("read")
  public @Nullable Boolean getRead() {
    return read;
  }

  public void setRead(@Nullable Boolean read) {
    this.read = read;
  }

  public Permissions write(@Nullable Boolean write) {
    this.write = write;
    return this;
  }

  /**
   * Get write
   * @return write
   */
  
  @Schema(name = "write", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("write")
  public @Nullable Boolean getWrite() {
    return write;
  }

  public void setWrite(@Nullable Boolean write) {
    this.write = write;
  }

  public Permissions delete(@Nullable Boolean delete) {
    this.delete = delete;
    return this;
  }

  /**
   * Get delete
   * @return delete
   */
  
  @Schema(name = "delete", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("delete")
  public @Nullable Boolean getDelete() {
    return delete;
  }

  public void setDelete(@Nullable Boolean delete) {
    this.delete = delete;
  }

  public Permissions add(@Nullable Boolean add) {
    this.add = add;
    return this;
  }

  /**
   * Get add
   * @return add
   */
  
  @Schema(name = "add", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("add")
  public @Nullable Boolean getAdd() {
    return add;
  }

  public void setAdd(@Nullable Boolean add) {
    this.add = add;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Permissions permissions = (Permissions) o;
    return Objects.equals(this.read, permissions.read) &&
        Objects.equals(this.write, permissions.write) &&
        Objects.equals(this.delete, permissions.delete) &&
        Objects.equals(this.add, permissions.add);
  }

  @Override
  public int hashCode() {
    return Objects.hash(read, write, delete, add);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Permissions {\n");
    sb.append("    read: ").append(toIndentedString(read)).append("\n");
    sb.append("    write: ").append(toIndentedString(write)).append("\n");
    sb.append("    delete: ").append(toIndentedString(delete)).append("\n");
    sb.append("    add: ").append(toIndentedString(add)).append("\n");
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


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
 * MessageResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-09T20:58:37.853899731Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class MessageResponse {

  private @Nullable String message;

  private @Nullable Integer code;

  private @Nullable String ids;

  private @Nullable String updateValue;

  public MessageResponse message(@Nullable String message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
   */
  
  @Schema(name = "message", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("message")
  public @Nullable String getMessage() {
    return message;
  }

  public void setMessage(@Nullable String message) {
    this.message = message;
  }

  public MessageResponse code(@Nullable Integer code) {
    this.code = code;
    return this;
  }

  /**
   * Get code
   * @return code
   */
  
  @Schema(name = "code", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("code")
  public @Nullable Integer getCode() {
    return code;
  }

  public void setCode(@Nullable Integer code) {
    this.code = code;
  }

  public MessageResponse ids(@Nullable String ids) {
    this.ids = ids;
    return this;
  }

  /**
   * Get ids
   * @return ids
   */
  
  @Schema(name = "ids", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ids")
  public @Nullable String getIds() {
    return ids;
  }

  public void setIds(@Nullable String ids) {
    this.ids = ids;
  }

  public MessageResponse updateValue(@Nullable String updateValue) {
    this.updateValue = updateValue;
    return this;
  }

  /**
   * Get updateValue
   * @return updateValue
   */
  
  @Schema(name = "updateValue", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("updateValue")
  public @Nullable String getUpdateValue() {
    return updateValue;
  }

  public void setUpdateValue(@Nullable String updateValue) {
    this.updateValue = updateValue;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageResponse messageResponse = (MessageResponse) o;
    return Objects.equals(this.message, messageResponse.message) &&
        Objects.equals(this.code, messageResponse.code) &&
        Objects.equals(this.ids, messageResponse.ids) &&
        Objects.equals(this.updateValue, messageResponse.updateValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, code, ids, updateValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageResponse {\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
    sb.append("    updateValue: ").append(toIndentedString(updateValue)).append("\n");
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


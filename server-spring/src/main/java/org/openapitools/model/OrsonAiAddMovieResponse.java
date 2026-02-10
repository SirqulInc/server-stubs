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
 * OrsonAiAddMovieResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-09T20:58:37.853899731Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class OrsonAiAddMovieResponse {

  private @Nullable String requestId;

  private @Nullable Integer responseCode;

  private @Nullable String responseRaw;

  private @Nullable String id;

  private @Nullable Boolean hasBeenIndexed;

  public OrsonAiAddMovieResponse requestId(@Nullable String requestId) {
    this.requestId = requestId;
    return this;
  }

  /**
   * Get requestId
   * @return requestId
   */
  
  @Schema(name = "requestId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("requestId")
  public @Nullable String getRequestId() {
    return requestId;
  }

  public void setRequestId(@Nullable String requestId) {
    this.requestId = requestId;
  }

  public OrsonAiAddMovieResponse responseCode(@Nullable Integer responseCode) {
    this.responseCode = responseCode;
    return this;
  }

  /**
   * Get responseCode
   * @return responseCode
   */
  
  @Schema(name = "responseCode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("responseCode")
  public @Nullable Integer getResponseCode() {
    return responseCode;
  }

  public void setResponseCode(@Nullable Integer responseCode) {
    this.responseCode = responseCode;
  }

  public OrsonAiAddMovieResponse responseRaw(@Nullable String responseRaw) {
    this.responseRaw = responseRaw;
    return this;
  }

  /**
   * Get responseRaw
   * @return responseRaw
   */
  
  @Schema(name = "responseRaw", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("responseRaw")
  public @Nullable String getResponseRaw() {
    return responseRaw;
  }

  public void setResponseRaw(@Nullable String responseRaw) {
    this.responseRaw = responseRaw;
  }

  public OrsonAiAddMovieResponse id(@Nullable String id) {
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

  public OrsonAiAddMovieResponse hasBeenIndexed(@Nullable Boolean hasBeenIndexed) {
    this.hasBeenIndexed = hasBeenIndexed;
    return this;
  }

  /**
   * Get hasBeenIndexed
   * @return hasBeenIndexed
   */
  
  @Schema(name = "hasBeenIndexed", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hasBeenIndexed")
  public @Nullable Boolean getHasBeenIndexed() {
    return hasBeenIndexed;
  }

  public void setHasBeenIndexed(@Nullable Boolean hasBeenIndexed) {
    this.hasBeenIndexed = hasBeenIndexed;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrsonAiAddMovieResponse orsonAiAddMovieResponse = (OrsonAiAddMovieResponse) o;
    return Objects.equals(this.requestId, orsonAiAddMovieResponse.requestId) &&
        Objects.equals(this.responseCode, orsonAiAddMovieResponse.responseCode) &&
        Objects.equals(this.responseRaw, orsonAiAddMovieResponse.responseRaw) &&
        Objects.equals(this.id, orsonAiAddMovieResponse.id) &&
        Objects.equals(this.hasBeenIndexed, orsonAiAddMovieResponse.hasBeenIndexed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId, responseCode, responseRaw, id, hasBeenIndexed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrsonAiAddMovieResponse {\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    responseCode: ").append(toIndentedString(responseCode)).append("\n");
    sb.append("    responseRaw: ").append(toIndentedString(responseRaw)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    hasBeenIndexed: ").append(toIndentedString(hasBeenIndexed)).append("\n");
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


package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * OrsonAiVoiceCanvasResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-09T20:58:37.853899731Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class OrsonAiVoiceCanvasResponse {

  private @Nullable String requestId;

  private @Nullable Integer responseCode;

  private @Nullable String responseRaw;

  @Valid
  private List<String> filenames = new ArrayList<>();

  public OrsonAiVoiceCanvasResponse requestId(@Nullable String requestId) {
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

  public OrsonAiVoiceCanvasResponse responseCode(@Nullable Integer responseCode) {
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

  public OrsonAiVoiceCanvasResponse responseRaw(@Nullable String responseRaw) {
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

  public OrsonAiVoiceCanvasResponse filenames(List<String> filenames) {
    this.filenames = filenames;
    return this;
  }

  public OrsonAiVoiceCanvasResponse addFilenamesItem(String filenamesItem) {
    if (this.filenames == null) {
      this.filenames = new ArrayList<>();
    }
    this.filenames.add(filenamesItem);
    return this;
  }

  /**
   * Get filenames
   * @return filenames
   */
  
  @Schema(name = "filenames", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("filenames")
  public List<String> getFilenames() {
    return filenames;
  }

  public void setFilenames(List<String> filenames) {
    this.filenames = filenames;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrsonAiVoiceCanvasResponse orsonAiVoiceCanvasResponse = (OrsonAiVoiceCanvasResponse) o;
    return Objects.equals(this.requestId, orsonAiVoiceCanvasResponse.requestId) &&
        Objects.equals(this.responseCode, orsonAiVoiceCanvasResponse.responseCode) &&
        Objects.equals(this.responseRaw, orsonAiVoiceCanvasResponse.responseRaw) &&
        Objects.equals(this.filenames, orsonAiVoiceCanvasResponse.filenames);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId, responseCode, responseRaw, filenames);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrsonAiVoiceCanvasResponse {\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    responseCode: ").append(toIndentedString(responseCode)).append("\n");
    sb.append("    responseRaw: ").append(toIndentedString(responseRaw)).append("\n");
    sb.append("    filenames: ").append(toIndentedString(filenames)).append("\n");
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


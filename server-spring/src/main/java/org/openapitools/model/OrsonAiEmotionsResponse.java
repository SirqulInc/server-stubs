package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.OrsonAiVisualEmotionResponse;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * OrsonAiEmotionsResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-11T19:32:41.765375324Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class OrsonAiEmotionsResponse {

  private @Nullable String requestId;

  private @Nullable Integer responseCode;

  private @Nullable String responseRaw;

  private @Nullable String status;

  private @Nullable String error;

  @Valid
  private List<String> audioEmotions = new ArrayList<>();

  @Valid
  private List<OrsonAiVisualEmotionResponse> visualEmotions = new ArrayList<>();

  public OrsonAiEmotionsResponse requestId(@Nullable String requestId) {
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

  public OrsonAiEmotionsResponse responseCode(@Nullable Integer responseCode) {
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

  public OrsonAiEmotionsResponse responseRaw(@Nullable String responseRaw) {
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

  public OrsonAiEmotionsResponse status(@Nullable String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  
  @Schema(name = "status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public @Nullable String getStatus() {
    return status;
  }

  public void setStatus(@Nullable String status) {
    this.status = status;
  }

  public OrsonAiEmotionsResponse error(@Nullable String error) {
    this.error = error;
    return this;
  }

  /**
   * Get error
   * @return error
   */
  
  @Schema(name = "error", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("error")
  public @Nullable String getError() {
    return error;
  }

  public void setError(@Nullable String error) {
    this.error = error;
  }

  public OrsonAiEmotionsResponse audioEmotions(List<String> audioEmotions) {
    this.audioEmotions = audioEmotions;
    return this;
  }

  public OrsonAiEmotionsResponse addAudioEmotionsItem(String audioEmotionsItem) {
    if (this.audioEmotions == null) {
      this.audioEmotions = new ArrayList<>();
    }
    this.audioEmotions.add(audioEmotionsItem);
    return this;
  }

  /**
   * Get audioEmotions
   * @return audioEmotions
   */
  
  @Schema(name = "audioEmotions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("audioEmotions")
  public List<String> getAudioEmotions() {
    return audioEmotions;
  }

  public void setAudioEmotions(List<String> audioEmotions) {
    this.audioEmotions = audioEmotions;
  }

  public OrsonAiEmotionsResponse visualEmotions(List<OrsonAiVisualEmotionResponse> visualEmotions) {
    this.visualEmotions = visualEmotions;
    return this;
  }

  public OrsonAiEmotionsResponse addVisualEmotionsItem(OrsonAiVisualEmotionResponse visualEmotionsItem) {
    if (this.visualEmotions == null) {
      this.visualEmotions = new ArrayList<>();
    }
    this.visualEmotions.add(visualEmotionsItem);
    return this;
  }

  /**
   * Get visualEmotions
   * @return visualEmotions
   */
  @Valid 
  @Schema(name = "visualEmotions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("visualEmotions")
  public List<OrsonAiVisualEmotionResponse> getVisualEmotions() {
    return visualEmotions;
  }

  public void setVisualEmotions(List<OrsonAiVisualEmotionResponse> visualEmotions) {
    this.visualEmotions = visualEmotions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrsonAiEmotionsResponse orsonAiEmotionsResponse = (OrsonAiEmotionsResponse) o;
    return Objects.equals(this.requestId, orsonAiEmotionsResponse.requestId) &&
        Objects.equals(this.responseCode, orsonAiEmotionsResponse.responseCode) &&
        Objects.equals(this.responseRaw, orsonAiEmotionsResponse.responseRaw) &&
        Objects.equals(this.status, orsonAiEmotionsResponse.status) &&
        Objects.equals(this.error, orsonAiEmotionsResponse.error) &&
        Objects.equals(this.audioEmotions, orsonAiEmotionsResponse.audioEmotions) &&
        Objects.equals(this.visualEmotions, orsonAiEmotionsResponse.visualEmotions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId, responseCode, responseRaw, status, error, audioEmotions, visualEmotions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrsonAiEmotionsResponse {\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    responseCode: ").append(toIndentedString(responseCode)).append("\n");
    sb.append("    responseRaw: ").append(toIndentedString(responseRaw)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    audioEmotions: ").append(toIndentedString(audioEmotions)).append("\n");
    sb.append("    visualEmotions: ").append(toIndentedString(visualEmotions)).append("\n");
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


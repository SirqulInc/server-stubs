package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.OrsonAiBatchEmotionsResponse;
import org.openapitools.model.OrsonAiBatchTopicsResponse;
import org.openapitools.model.OrsonAiBatchTranscriptResponse;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * OrsonAiBatchResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-09T20:58:37.853899731Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class OrsonAiBatchResponse {

  private @Nullable String requestId;

  private @Nullable Integer responseCode;

  private @Nullable String responseRaw;

  private @Nullable OrsonAiBatchTranscriptResponse transcript;

  private @Nullable OrsonAiBatchTopicsResponse topics;

  private @Nullable OrsonAiBatchEmotionsResponse emotions;

  public OrsonAiBatchResponse requestId(@Nullable String requestId) {
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

  public OrsonAiBatchResponse responseCode(@Nullable Integer responseCode) {
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

  public OrsonAiBatchResponse responseRaw(@Nullable String responseRaw) {
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

  public OrsonAiBatchResponse transcript(@Nullable OrsonAiBatchTranscriptResponse transcript) {
    this.transcript = transcript;
    return this;
  }

  /**
   * Get transcript
   * @return transcript
   */
  @Valid 
  @Schema(name = "transcript", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("transcript")
  public @Nullable OrsonAiBatchTranscriptResponse getTranscript() {
    return transcript;
  }

  public void setTranscript(@Nullable OrsonAiBatchTranscriptResponse transcript) {
    this.transcript = transcript;
  }

  public OrsonAiBatchResponse topics(@Nullable OrsonAiBatchTopicsResponse topics) {
    this.topics = topics;
    return this;
  }

  /**
   * Get topics
   * @return topics
   */
  @Valid 
  @Schema(name = "topics", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("topics")
  public @Nullable OrsonAiBatchTopicsResponse getTopics() {
    return topics;
  }

  public void setTopics(@Nullable OrsonAiBatchTopicsResponse topics) {
    this.topics = topics;
  }

  public OrsonAiBatchResponse emotions(@Nullable OrsonAiBatchEmotionsResponse emotions) {
    this.emotions = emotions;
    return this;
  }

  /**
   * Get emotions
   * @return emotions
   */
  @Valid 
  @Schema(name = "emotions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("emotions")
  public @Nullable OrsonAiBatchEmotionsResponse getEmotions() {
    return emotions;
  }

  public void setEmotions(@Nullable OrsonAiBatchEmotionsResponse emotions) {
    this.emotions = emotions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrsonAiBatchResponse orsonAiBatchResponse = (OrsonAiBatchResponse) o;
    return Objects.equals(this.requestId, orsonAiBatchResponse.requestId) &&
        Objects.equals(this.responseCode, orsonAiBatchResponse.responseCode) &&
        Objects.equals(this.responseRaw, orsonAiBatchResponse.responseRaw) &&
        Objects.equals(this.transcript, orsonAiBatchResponse.transcript) &&
        Objects.equals(this.topics, orsonAiBatchResponse.topics) &&
        Objects.equals(this.emotions, orsonAiBatchResponse.emotions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId, responseCode, responseRaw, transcript, topics, emotions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrsonAiBatchResponse {\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    responseCode: ").append(toIndentedString(responseCode)).append("\n");
    sb.append("    responseRaw: ").append(toIndentedString(responseRaw)).append("\n");
    sb.append("    transcript: ").append(toIndentedString(transcript)).append("\n");
    sb.append("    topics: ").append(toIndentedString(topics)).append("\n");
    sb.append("    emotions: ").append(toIndentedString(emotions)).append("\n");
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


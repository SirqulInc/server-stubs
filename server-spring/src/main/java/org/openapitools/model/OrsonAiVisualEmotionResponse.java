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
 * OrsonAiVisualEmotionResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-09T20:58:37.853899731Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class OrsonAiVisualEmotionResponse {

  private @Nullable String requestId;

  private @Nullable Integer responseCode;

  private @Nullable String responseRaw;

  private @Nullable Long userIndex;

  private @Nullable String emotion;

  private @Nullable Double probability;

  public OrsonAiVisualEmotionResponse requestId(@Nullable String requestId) {
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

  public OrsonAiVisualEmotionResponse responseCode(@Nullable Integer responseCode) {
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

  public OrsonAiVisualEmotionResponse responseRaw(@Nullable String responseRaw) {
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

  public OrsonAiVisualEmotionResponse userIndex(@Nullable Long userIndex) {
    this.userIndex = userIndex;
    return this;
  }

  /**
   * Get userIndex
   * @return userIndex
   */
  
  @Schema(name = "userIndex", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("userIndex")
  public @Nullable Long getUserIndex() {
    return userIndex;
  }

  public void setUserIndex(@Nullable Long userIndex) {
    this.userIndex = userIndex;
  }

  public OrsonAiVisualEmotionResponse emotion(@Nullable String emotion) {
    this.emotion = emotion;
    return this;
  }

  /**
   * Get emotion
   * @return emotion
   */
  
  @Schema(name = "emotion", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("emotion")
  public @Nullable String getEmotion() {
    return emotion;
  }

  public void setEmotion(@Nullable String emotion) {
    this.emotion = emotion;
  }

  public OrsonAiVisualEmotionResponse probability(@Nullable Double probability) {
    this.probability = probability;
    return this;
  }

  /**
   * Get probability
   * @return probability
   */
  
  @Schema(name = "probability", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("probability")
  public @Nullable Double getProbability() {
    return probability;
  }

  public void setProbability(@Nullable Double probability) {
    this.probability = probability;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrsonAiVisualEmotionResponse orsonAiVisualEmotionResponse = (OrsonAiVisualEmotionResponse) o;
    return Objects.equals(this.requestId, orsonAiVisualEmotionResponse.requestId) &&
        Objects.equals(this.responseCode, orsonAiVisualEmotionResponse.responseCode) &&
        Objects.equals(this.responseRaw, orsonAiVisualEmotionResponse.responseRaw) &&
        Objects.equals(this.userIndex, orsonAiVisualEmotionResponse.userIndex) &&
        Objects.equals(this.emotion, orsonAiVisualEmotionResponse.emotion) &&
        Objects.equals(this.probability, orsonAiVisualEmotionResponse.probability);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId, responseCode, responseRaw, userIndex, emotion, probability);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrsonAiVisualEmotionResponse {\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    responseCode: ").append(toIndentedString(responseCode)).append("\n");
    sb.append("    responseRaw: ").append(toIndentedString(responseRaw)).append("\n");
    sb.append("    userIndex: ").append(toIndentedString(userIndex)).append("\n");
    sb.append("    emotion: ").append(toIndentedString(emotion)).append("\n");
    sb.append("    probability: ").append(toIndentedString(probability)).append("\n");
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


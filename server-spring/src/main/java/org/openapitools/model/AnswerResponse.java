package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.AssetShortResponse;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AnswerResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-11T19:32:41.765375324Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class AnswerResponse {

  private @Nullable Long answerId;

  private @Nullable String answer;

  private @Nullable Boolean correct;

  private @Nullable AssetShortResponse image;

  private @Nullable String videoURL;

  public AnswerResponse answerId(@Nullable Long answerId) {
    this.answerId = answerId;
    return this;
  }

  /**
   * Get answerId
   * @return answerId
   */
  
  @Schema(name = "answerId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("answerId")
  public @Nullable Long getAnswerId() {
    return answerId;
  }

  public void setAnswerId(@Nullable Long answerId) {
    this.answerId = answerId;
  }

  public AnswerResponse answer(@Nullable String answer) {
    this.answer = answer;
    return this;
  }

  /**
   * Get answer
   * @return answer
   */
  
  @Schema(name = "answer", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("answer")
  public @Nullable String getAnswer() {
    return answer;
  }

  public void setAnswer(@Nullable String answer) {
    this.answer = answer;
  }

  public AnswerResponse correct(@Nullable Boolean correct) {
    this.correct = correct;
    return this;
  }

  /**
   * Get correct
   * @return correct
   */
  
  @Schema(name = "correct", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("correct")
  public @Nullable Boolean getCorrect() {
    return correct;
  }

  public void setCorrect(@Nullable Boolean correct) {
    this.correct = correct;
  }

  public AnswerResponse image(@Nullable AssetShortResponse image) {
    this.image = image;
    return this;
  }

  /**
   * Get image
   * @return image
   */
  @Valid 
  @Schema(name = "image", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("image")
  public @Nullable AssetShortResponse getImage() {
    return image;
  }

  public void setImage(@Nullable AssetShortResponse image) {
    this.image = image;
  }

  public AnswerResponse videoURL(@Nullable String videoURL) {
    this.videoURL = videoURL;
    return this;
  }

  /**
   * Get videoURL
   * @return videoURL
   */
  
  @Schema(name = "videoURL", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("videoURL")
  public @Nullable String getVideoURL() {
    return videoURL;
  }

  public void setVideoURL(@Nullable String videoURL) {
    this.videoURL = videoURL;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnswerResponse answerResponse = (AnswerResponse) o;
    return Objects.equals(this.answerId, answerResponse.answerId) &&
        Objects.equals(this.answer, answerResponse.answer) &&
        Objects.equals(this.correct, answerResponse.correct) &&
        Objects.equals(this.image, answerResponse.image) &&
        Objects.equals(this.videoURL, answerResponse.videoURL);
  }

  @Override
  public int hashCode() {
    return Objects.hash(answerId, answer, correct, image, videoURL);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnswerResponse {\n");
    sb.append("    answerId: ").append(toIndentedString(answerId)).append("\n");
    sb.append("    answer: ").append(toIndentedString(answer)).append("\n");
    sb.append("    correct: ").append(toIndentedString(correct)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    videoURL: ").append(toIndentedString(videoURL)).append("\n");
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


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
 * OrsonAiTopicResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-11T19:32:41.765375324Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class OrsonAiTopicResponse {

  private @Nullable String word;

  private @Nullable Double score;

  public OrsonAiTopicResponse word(@Nullable String word) {
    this.word = word;
    return this;
  }

  /**
   * Get word
   * @return word
   */
  
  @Schema(name = "word", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("word")
  public @Nullable String getWord() {
    return word;
  }

  public void setWord(@Nullable String word) {
    this.word = word;
  }

  public OrsonAiTopicResponse score(@Nullable Double score) {
    this.score = score;
    return this;
  }

  /**
   * Get score
   * @return score
   */
  
  @Schema(name = "score", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("score")
  public @Nullable Double getScore() {
    return score;
  }

  public void setScore(@Nullable Double score) {
    this.score = score;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrsonAiTopicResponse orsonAiTopicResponse = (OrsonAiTopicResponse) o;
    return Objects.equals(this.word, orsonAiTopicResponse.word) &&
        Objects.equals(this.score, orsonAiTopicResponse.score);
  }

  @Override
  public int hashCode() {
    return Objects.hash(word, score);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrsonAiTopicResponse {\n");
    sb.append("    word: ").append(toIndentedString(word)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
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


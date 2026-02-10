package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OrsonAiTopicResponse  {
  
  @ApiModelProperty(value = "")

  private String word;

  @ApiModelProperty(value = "")

  private Double score;
 /**
   * Get word
   * @return word
  **/
  @JsonProperty("word")
  public String getWord() {
    return word;
  }

  public void setWord(String word) {
    this.word = word;
  }

  public OrsonAiTopicResponse word(String word) {
    this.word = word;
    return this;
  }

 /**
   * Get score
   * @return score
  **/
  @JsonProperty("score")
  public Double getScore() {
    return score;
  }

  public void setScore(Double score) {
    this.score = score;
  }

  public OrsonAiTopicResponse score(Double score) {
    this.score = score;
    return this;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


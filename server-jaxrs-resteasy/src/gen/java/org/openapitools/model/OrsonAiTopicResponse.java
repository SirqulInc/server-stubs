package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class OrsonAiTopicResponse   {
  
  private String word;
  private Double score;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("word")
  public String getWord() {
    return word;
  }
  public void setWord(String word) {
    this.word = word;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("score")
  public Double getScore() {
    return score;
  }
  public void setScore(Double score) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


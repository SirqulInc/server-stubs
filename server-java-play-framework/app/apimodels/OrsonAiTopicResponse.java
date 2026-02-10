package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * OrsonAiTopicResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OrsonAiTopicResponse   {
  @JsonProperty("word")
  
  private String word;

  @JsonProperty("score")
  
  private Double score;

  public OrsonAiTopicResponse word(String word) {
    this.word = word;
    return this;
  }

   /**
   * Get word
   * @return word
  **/
  public String getWord() {
    return word;
  }

  public void setWord(String word) {
    this.word = word;
  }

  public OrsonAiTopicResponse score(Double score) {
    this.score = score;
    return this;
  }

   /**
   * Get score
   * @return score
  **/
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
    return Objects.equals(word, orsonAiTopicResponse.word) &&
        Objects.equals(score, orsonAiTopicResponse.score);
  }

  @Override
  public int hashCode() {
    return Objects.hash(word, score);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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


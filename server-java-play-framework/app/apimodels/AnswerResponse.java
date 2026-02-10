package apimodels;

import apimodels.AssetShortResponse;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * AnswerResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class AnswerResponse   {
  @JsonProperty("answerId")
  
  private Long answerId;

  @JsonProperty("answer")
  
  private String answer;

  @JsonProperty("correct")
  
  private Boolean correct;

  @JsonProperty("image")
  @Valid

  private AssetShortResponse image;

  @JsonProperty("videoURL")
  
  private String videoURL;

  public AnswerResponse answerId(Long answerId) {
    this.answerId = answerId;
    return this;
  }

   /**
   * Get answerId
   * @return answerId
  **/
  public Long getAnswerId() {
    return answerId;
  }

  public void setAnswerId(Long answerId) {
    this.answerId = answerId;
  }

  public AnswerResponse answer(String answer) {
    this.answer = answer;
    return this;
  }

   /**
   * Get answer
   * @return answer
  **/
  public String getAnswer() {
    return answer;
  }

  public void setAnswer(String answer) {
    this.answer = answer;
  }

  public AnswerResponse correct(Boolean correct) {
    this.correct = correct;
    return this;
  }

   /**
   * Get correct
   * @return correct
  **/
  public Boolean getCorrect() {
    return correct;
  }

  public void setCorrect(Boolean correct) {
    this.correct = correct;
  }

  public AnswerResponse image(AssetShortResponse image) {
    this.image = image;
    return this;
  }

   /**
   * Get image
   * @return image
  **/
  public AssetShortResponse getImage() {
    return image;
  }

  public void setImage(AssetShortResponse image) {
    this.image = image;
  }

  public AnswerResponse videoURL(String videoURL) {
    this.videoURL = videoURL;
    return this;
  }

   /**
   * Get videoURL
   * @return videoURL
  **/
  public String getVideoURL() {
    return videoURL;
  }

  public void setVideoURL(String videoURL) {
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
    return Objects.equals(answerId, answerResponse.answerId) &&
        Objects.equals(answer, answerResponse.answer) &&
        Objects.equals(correct, answerResponse.correct) &&
        Objects.equals(image, answerResponse.image) &&
        Objects.equals(videoURL, answerResponse.videoURL);
  }

  @Override
  public int hashCode() {
    return Objects.hash(answerId, answer, correct, image, videoURL);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


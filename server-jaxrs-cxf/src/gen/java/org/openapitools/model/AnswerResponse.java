package org.openapitools.model;

import org.openapitools.model.AssetShortResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AnswerResponse  {
  
  @ApiModelProperty(value = "")

  private Long answerId;

  @ApiModelProperty(value = "")

  private String answer;

  @ApiModelProperty(value = "")

  private Boolean correct;

  @ApiModelProperty(value = "")

  @Valid

  private AssetShortResponse image;

  @ApiModelProperty(value = "")

  private String videoURL;
 /**
   * Get answerId
   * @return answerId
  **/
  @JsonProperty("answerId")
  public Long getAnswerId() {
    return answerId;
  }

  public void setAnswerId(Long answerId) {
    this.answerId = answerId;
  }

  public AnswerResponse answerId(Long answerId) {
    this.answerId = answerId;
    return this;
  }

 /**
   * Get answer
   * @return answer
  **/
  @JsonProperty("answer")
  public String getAnswer() {
    return answer;
  }

  public void setAnswer(String answer) {
    this.answer = answer;
  }

  public AnswerResponse answer(String answer) {
    this.answer = answer;
    return this;
  }

 /**
   * Get correct
   * @return correct
  **/
  @JsonProperty("correct")
  public Boolean getCorrect() {
    return correct;
  }

  public void setCorrect(Boolean correct) {
    this.correct = correct;
  }

  public AnswerResponse correct(Boolean correct) {
    this.correct = correct;
    return this;
  }

 /**
   * Get image
   * @return image
  **/
  @JsonProperty("image")
  public AssetShortResponse getImage() {
    return image;
  }

  public void setImage(AssetShortResponse image) {
    this.image = image;
  }

  public AnswerResponse image(AssetShortResponse image) {
    this.image = image;
    return this;
  }

 /**
   * Get videoURL
   * @return videoURL
  **/
  @JsonProperty("videoURL")
  public String getVideoURL() {
    return videoURL;
  }

  public void setVideoURL(String videoURL) {
    this.videoURL = videoURL;
  }

  public AnswerResponse videoURL(String videoURL) {
    this.videoURL = videoURL;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


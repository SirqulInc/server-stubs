package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AssetShortResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-09T20:51:23.077809933Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class AnswerResponse   {
  
  private Long answerId;
  private String answer;
  private Boolean correct;
  private AssetShortResponse image;
  private String videoURL;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("answerId")
  public Long getAnswerId() {
    return answerId;
  }
  public void setAnswerId(Long answerId) {
    this.answerId = answerId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("answer")
  public String getAnswer() {
    return answer;
  }
  public void setAnswer(String answer) {
    this.answer = answer;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("correct")
  public Boolean getCorrect() {
    return correct;
  }
  public void setCorrect(Boolean correct) {
    this.correct = correct;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("image")
  @Valid
  public AssetShortResponse getImage() {
    return image;
  }
  public void setImage(AssetShortResponse image) {
    this.image = image;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("videoURL")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


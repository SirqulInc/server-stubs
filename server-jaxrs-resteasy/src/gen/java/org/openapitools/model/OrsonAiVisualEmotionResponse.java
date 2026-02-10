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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-09T20:51:23.077809933Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class OrsonAiVisualEmotionResponse   {
  
  private String requestId;
  private Integer responseCode;
  private String responseRaw;
  private Long userIndex;
  private String emotion;
  private Double probability;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("requestId")
  public String getRequestId() {
    return requestId;
  }
  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("responseCode")
  public Integer getResponseCode() {
    return responseCode;
  }
  public void setResponseCode(Integer responseCode) {
    this.responseCode = responseCode;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("responseRaw")
  public String getResponseRaw() {
    return responseRaw;
  }
  public void setResponseRaw(String responseRaw) {
    this.responseRaw = responseRaw;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("userIndex")
  public Long getUserIndex() {
    return userIndex;
  }
  public void setUserIndex(Long userIndex) {
    this.userIndex = userIndex;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("emotion")
  public String getEmotion() {
    return emotion;
  }
  public void setEmotion(String emotion) {
    this.emotion = emotion;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("probability")
  public Double getProbability() {
    return probability;
  }
  public void setProbability(Double probability) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


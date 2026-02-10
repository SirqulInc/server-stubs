package org.openapitools.model;

import org.openapitools.model.OrsonAiBatchEmotionsResponse;
import org.openapitools.model.OrsonAiBatchTopicsResponse;
import org.openapitools.model.OrsonAiBatchTranscriptResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OrsonAiBatchResponse  {
  
  @ApiModelProperty(value = "")

  private String requestId;

  @ApiModelProperty(value = "")

  private Integer responseCode;

  @ApiModelProperty(value = "")

  private String responseRaw;

  @ApiModelProperty(value = "")

  @Valid

  private OrsonAiBatchTranscriptResponse transcript;

  @ApiModelProperty(value = "")

  @Valid

  private OrsonAiBatchTopicsResponse topics;

  @ApiModelProperty(value = "")

  @Valid

  private OrsonAiBatchEmotionsResponse emotions;
 /**
   * Get requestId
   * @return requestId
  **/
  @JsonProperty("requestId")
  public String getRequestId() {
    return requestId;
  }

  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  public OrsonAiBatchResponse requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

 /**
   * Get responseCode
   * @return responseCode
  **/
  @JsonProperty("responseCode")
  public Integer getResponseCode() {
    return responseCode;
  }

  public void setResponseCode(Integer responseCode) {
    this.responseCode = responseCode;
  }

  public OrsonAiBatchResponse responseCode(Integer responseCode) {
    this.responseCode = responseCode;
    return this;
  }

 /**
   * Get responseRaw
   * @return responseRaw
  **/
  @JsonProperty("responseRaw")
  public String getResponseRaw() {
    return responseRaw;
  }

  public void setResponseRaw(String responseRaw) {
    this.responseRaw = responseRaw;
  }

  public OrsonAiBatchResponse responseRaw(String responseRaw) {
    this.responseRaw = responseRaw;
    return this;
  }

 /**
   * Get transcript
   * @return transcript
  **/
  @JsonProperty("transcript")
  public OrsonAiBatchTranscriptResponse getTranscript() {
    return transcript;
  }

  public void setTranscript(OrsonAiBatchTranscriptResponse transcript) {
    this.transcript = transcript;
  }

  public OrsonAiBatchResponse transcript(OrsonAiBatchTranscriptResponse transcript) {
    this.transcript = transcript;
    return this;
  }

 /**
   * Get topics
   * @return topics
  **/
  @JsonProperty("topics")
  public OrsonAiBatchTopicsResponse getTopics() {
    return topics;
  }

  public void setTopics(OrsonAiBatchTopicsResponse topics) {
    this.topics = topics;
  }

  public OrsonAiBatchResponse topics(OrsonAiBatchTopicsResponse topics) {
    this.topics = topics;
    return this;
  }

 /**
   * Get emotions
   * @return emotions
  **/
  @JsonProperty("emotions")
  public OrsonAiBatchEmotionsResponse getEmotions() {
    return emotions;
  }

  public void setEmotions(OrsonAiBatchEmotionsResponse emotions) {
    this.emotions = emotions;
  }

  public OrsonAiBatchResponse emotions(OrsonAiBatchEmotionsResponse emotions) {
    this.emotions = emotions;
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
    OrsonAiBatchResponse orsonAiBatchResponse = (OrsonAiBatchResponse) o;
    return Objects.equals(this.requestId, orsonAiBatchResponse.requestId) &&
        Objects.equals(this.responseCode, orsonAiBatchResponse.responseCode) &&
        Objects.equals(this.responseRaw, orsonAiBatchResponse.responseRaw) &&
        Objects.equals(this.transcript, orsonAiBatchResponse.transcript) &&
        Objects.equals(this.topics, orsonAiBatchResponse.topics) &&
        Objects.equals(this.emotions, orsonAiBatchResponse.emotions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId, responseCode, responseRaw, transcript, topics, emotions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrsonAiBatchResponse {\n");
    
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    responseCode: ").append(toIndentedString(responseCode)).append("\n");
    sb.append("    responseRaw: ").append(toIndentedString(responseRaw)).append("\n");
    sb.append("    transcript: ").append(toIndentedString(transcript)).append("\n");
    sb.append("    topics: ").append(toIndentedString(topics)).append("\n");
    sb.append("    emotions: ").append(toIndentedString(emotions)).append("\n");
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


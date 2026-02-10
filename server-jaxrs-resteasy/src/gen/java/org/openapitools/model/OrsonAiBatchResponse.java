package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.OrsonAiBatchEmotionsResponse;
import org.openapitools.model.OrsonAiBatchTopicsResponse;
import org.openapitools.model.OrsonAiBatchTranscriptResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-09T20:51:23.077809933Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class OrsonAiBatchResponse   {
  
  private String requestId;
  private Integer responseCode;
  private String responseRaw;
  private OrsonAiBatchTranscriptResponse transcript;
  private OrsonAiBatchTopicsResponse topics;
  private OrsonAiBatchEmotionsResponse emotions;

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
  @JsonProperty("transcript")
  @Valid
  public OrsonAiBatchTranscriptResponse getTranscript() {
    return transcript;
  }
  public void setTranscript(OrsonAiBatchTranscriptResponse transcript) {
    this.transcript = transcript;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("topics")
  @Valid
  public OrsonAiBatchTopicsResponse getTopics() {
    return topics;
  }
  public void setTopics(OrsonAiBatchTopicsResponse topics) {
    this.topics = topics;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("emotions")
  @Valid
  public OrsonAiBatchEmotionsResponse getEmotions() {
    return emotions;
  }
  public void setEmotions(OrsonAiBatchEmotionsResponse emotions) {
    this.emotions = emotions;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


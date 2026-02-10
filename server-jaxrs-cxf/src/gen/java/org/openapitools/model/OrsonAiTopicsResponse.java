package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.OrsonAiTopicResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OrsonAiTopicsResponse  {
  
  @ApiModelProperty(value = "")

  private String requestId;

  @ApiModelProperty(value = "")

  private Integer responseCode;

  @ApiModelProperty(value = "")

  private String responseRaw;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid OrsonAiTopicResponse> topics = new ArrayList<>();
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

  public OrsonAiTopicsResponse requestId(String requestId) {
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

  public OrsonAiTopicsResponse responseCode(Integer responseCode) {
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

  public OrsonAiTopicsResponse responseRaw(String responseRaw) {
    this.responseRaw = responseRaw;
    return this;
  }

 /**
   * Get topics
   * @return topics
  **/
  @JsonProperty("topics")
  public List<@Valid OrsonAiTopicResponse> getTopics() {
    return topics;
  }

  public void setTopics(List<@Valid OrsonAiTopicResponse> topics) {
    this.topics = topics;
  }

  public OrsonAiTopicsResponse topics(List<@Valid OrsonAiTopicResponse> topics) {
    this.topics = topics;
    return this;
  }

  public OrsonAiTopicsResponse addTopicsItem(OrsonAiTopicResponse topicsItem) {
    this.topics.add(topicsItem);
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
    OrsonAiTopicsResponse orsonAiTopicsResponse = (OrsonAiTopicsResponse) o;
    return Objects.equals(this.requestId, orsonAiTopicsResponse.requestId) &&
        Objects.equals(this.responseCode, orsonAiTopicsResponse.responseCode) &&
        Objects.equals(this.responseRaw, orsonAiTopicsResponse.responseRaw) &&
        Objects.equals(this.topics, orsonAiTopicsResponse.topics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId, responseCode, responseRaw, topics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrsonAiTopicsResponse {\n");
    
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    responseCode: ").append(toIndentedString(responseCode)).append("\n");
    sb.append("    responseRaw: ").append(toIndentedString(responseRaw)).append("\n");
    sb.append("    topics: ").append(toIndentedString(topics)).append("\n");
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


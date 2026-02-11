package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.OrsonAiTopicResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class OrsonAiTopicsResponse   {
  
  private String requestId;
  private Integer responseCode;
  private String responseRaw;
  private List<@Valid OrsonAiTopicResponse> topics = new ArrayList<>();

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
  @JsonProperty("topics")
  @Valid
  public List<@Valid OrsonAiTopicResponse> getTopics() {
    return topics;
  }
  public void setTopics(List<@Valid OrsonAiTopicResponse> topics) {
    this.topics = topics;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


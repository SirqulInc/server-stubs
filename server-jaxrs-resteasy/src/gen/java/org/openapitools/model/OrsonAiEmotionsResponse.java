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
import org.openapitools.model.OrsonAiVisualEmotionResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class OrsonAiEmotionsResponse   {
  
  private String requestId;
  private Integer responseCode;
  private String responseRaw;
  private String status;
  private String error;
  private List<String> audioEmotions = new ArrayList<>();
  private List<OrsonAiVisualEmotionResponse> visualEmotions = new ArrayList<>();

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
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("error")
  public String getError() {
    return error;
  }
  public void setError(String error) {
    this.error = error;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("audioEmotions")
  public List<String> getAudioEmotions() {
    return audioEmotions;
  }
  public void setAudioEmotions(List<String> audioEmotions) {
    this.audioEmotions = audioEmotions;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("visualEmotions")
  @Valid
  public List<OrsonAiVisualEmotionResponse> getVisualEmotions() {
    return visualEmotions;
  }
  public void setVisualEmotions(List<OrsonAiVisualEmotionResponse> visualEmotions) {
    this.visualEmotions = visualEmotions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrsonAiEmotionsResponse orsonAiEmotionsResponse = (OrsonAiEmotionsResponse) o;
    return Objects.equals(this.requestId, orsonAiEmotionsResponse.requestId) &&
        Objects.equals(this.responseCode, orsonAiEmotionsResponse.responseCode) &&
        Objects.equals(this.responseRaw, orsonAiEmotionsResponse.responseRaw) &&
        Objects.equals(this.status, orsonAiEmotionsResponse.status) &&
        Objects.equals(this.error, orsonAiEmotionsResponse.error) &&
        Objects.equals(this.audioEmotions, orsonAiEmotionsResponse.audioEmotions) &&
        Objects.equals(this.visualEmotions, orsonAiEmotionsResponse.visualEmotions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId, responseCode, responseRaw, status, error, audioEmotions, visualEmotions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrsonAiEmotionsResponse {\n");
    
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    responseCode: ").append(toIndentedString(responseCode)).append("\n");
    sb.append("    responseRaw: ").append(toIndentedString(responseRaw)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    audioEmotions: ").append(toIndentedString(audioEmotions)).append("\n");
    sb.append("    visualEmotions: ").append(toIndentedString(visualEmotions)).append("\n");
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


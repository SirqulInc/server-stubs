package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.OrsonAiVisualEmotionResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OrsonAiEmotionsResponse  {
  
  @ApiModelProperty(value = "")

  private String requestId;

  @ApiModelProperty(value = "")

  private Integer responseCode;

  @ApiModelProperty(value = "")

  private String responseRaw;

  @ApiModelProperty(value = "")

  private String status;

  @ApiModelProperty(value = "")

  private String error;

  @ApiModelProperty(value = "")

  private List<String> audioEmotions = new ArrayList<>();

  @ApiModelProperty(value = "")

  @Valid

  private List<OrsonAiVisualEmotionResponse> visualEmotions = new ArrayList<>();
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

  public OrsonAiEmotionsResponse requestId(String requestId) {
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

  public OrsonAiEmotionsResponse responseCode(Integer responseCode) {
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

  public OrsonAiEmotionsResponse responseRaw(String responseRaw) {
    this.responseRaw = responseRaw;
    return this;
  }

 /**
   * Get status
   * @return status
  **/
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public OrsonAiEmotionsResponse status(String status) {
    this.status = status;
    return this;
  }

 /**
   * Get error
   * @return error
  **/
  @JsonProperty("error")
  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

  public OrsonAiEmotionsResponse error(String error) {
    this.error = error;
    return this;
  }

 /**
   * Get audioEmotions
   * @return audioEmotions
  **/
  @JsonProperty("audioEmotions")
  public List<String> getAudioEmotions() {
    return audioEmotions;
  }

  public void setAudioEmotions(List<String> audioEmotions) {
    this.audioEmotions = audioEmotions;
  }

  public OrsonAiEmotionsResponse audioEmotions(List<String> audioEmotions) {
    this.audioEmotions = audioEmotions;
    return this;
  }

  public OrsonAiEmotionsResponse addAudioEmotionsItem(String audioEmotionsItem) {
    this.audioEmotions.add(audioEmotionsItem);
    return this;
  }

 /**
   * Get visualEmotions
   * @return visualEmotions
  **/
  @JsonProperty("visualEmotions")
  public List<OrsonAiVisualEmotionResponse> getVisualEmotions() {
    return visualEmotions;
  }

  public void setVisualEmotions(List<OrsonAiVisualEmotionResponse> visualEmotions) {
    this.visualEmotions = visualEmotions;
  }

  public OrsonAiEmotionsResponse visualEmotions(List<OrsonAiVisualEmotionResponse> visualEmotions) {
    this.visualEmotions = visualEmotions;
    return this;
  }

  public OrsonAiEmotionsResponse addVisualEmotionsItem(OrsonAiVisualEmotionResponse visualEmotionsItem) {
    this.visualEmotions.add(visualEmotionsItem);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


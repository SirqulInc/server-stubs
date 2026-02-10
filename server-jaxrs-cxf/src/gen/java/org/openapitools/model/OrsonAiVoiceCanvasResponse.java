package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OrsonAiVoiceCanvasResponse  {
  
  @ApiModelProperty(value = "")

  private String requestId;

  @ApiModelProperty(value = "")

  private Integer responseCode;

  @ApiModelProperty(value = "")

  private String responseRaw;

  @ApiModelProperty(value = "")

  private List<String> filenames = new ArrayList<>();
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

  public OrsonAiVoiceCanvasResponse requestId(String requestId) {
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

  public OrsonAiVoiceCanvasResponse responseCode(Integer responseCode) {
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

  public OrsonAiVoiceCanvasResponse responseRaw(String responseRaw) {
    this.responseRaw = responseRaw;
    return this;
  }

 /**
   * Get filenames
   * @return filenames
  **/
  @JsonProperty("filenames")
  public List<String> getFilenames() {
    return filenames;
  }

  public void setFilenames(List<String> filenames) {
    this.filenames = filenames;
  }

  public OrsonAiVoiceCanvasResponse filenames(List<String> filenames) {
    this.filenames = filenames;
    return this;
  }

  public OrsonAiVoiceCanvasResponse addFilenamesItem(String filenamesItem) {
    this.filenames.add(filenamesItem);
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
    OrsonAiVoiceCanvasResponse orsonAiVoiceCanvasResponse = (OrsonAiVoiceCanvasResponse) o;
    return Objects.equals(this.requestId, orsonAiVoiceCanvasResponse.requestId) &&
        Objects.equals(this.responseCode, orsonAiVoiceCanvasResponse.responseCode) &&
        Objects.equals(this.responseRaw, orsonAiVoiceCanvasResponse.responseRaw) &&
        Objects.equals(this.filenames, orsonAiVoiceCanvasResponse.filenames);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId, responseCode, responseRaw, filenames);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrsonAiVoiceCanvasResponse {\n");
    
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    responseCode: ").append(toIndentedString(responseCode)).append("\n");
    sb.append("    responseRaw: ").append(toIndentedString(responseRaw)).append("\n");
    sb.append("    filenames: ").append(toIndentedString(filenames)).append("\n");
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


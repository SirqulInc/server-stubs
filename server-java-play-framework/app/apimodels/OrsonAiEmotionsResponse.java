package apimodels;

import apimodels.OrsonAiVisualEmotionResponse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * OrsonAiEmotionsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OrsonAiEmotionsResponse   {
  @JsonProperty("requestId")
  
  private String requestId;

  @JsonProperty("responseCode")
  
  private Integer responseCode;

  @JsonProperty("responseRaw")
  
  private String responseRaw;

  @JsonProperty("status")
  
  private String status;

  @JsonProperty("error")
  
  private String error;

  @JsonProperty("audioEmotions")
  
  private List<String> audioEmotions = null;

  @JsonProperty("visualEmotions")
  @Valid

  private List<OrsonAiVisualEmotionResponse> visualEmotions = null;

  public OrsonAiEmotionsResponse requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

   /**
   * Get requestId
   * @return requestId
  **/
  public String getRequestId() {
    return requestId;
  }

  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  public OrsonAiEmotionsResponse responseCode(Integer responseCode) {
    this.responseCode = responseCode;
    return this;
  }

   /**
   * Get responseCode
   * @return responseCode
  **/
  public Integer getResponseCode() {
    return responseCode;
  }

  public void setResponseCode(Integer responseCode) {
    this.responseCode = responseCode;
  }

  public OrsonAiEmotionsResponse responseRaw(String responseRaw) {
    this.responseRaw = responseRaw;
    return this;
  }

   /**
   * Get responseRaw
   * @return responseRaw
  **/
  public String getResponseRaw() {
    return responseRaw;
  }

  public void setResponseRaw(String responseRaw) {
    this.responseRaw = responseRaw;
  }

  public OrsonAiEmotionsResponse status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public OrsonAiEmotionsResponse error(String error) {
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

  public OrsonAiEmotionsResponse audioEmotions(List<String> audioEmotions) {
    this.audioEmotions = audioEmotions;
    return this;
  }

  public OrsonAiEmotionsResponse addAudioEmotionsItem(String audioEmotionsItem) {
    if (this.audioEmotions == null) {
      this.audioEmotions = new ArrayList<>();
    }
    this.audioEmotions.add(audioEmotionsItem);
    return this;
  }

   /**
   * Get audioEmotions
   * @return audioEmotions
  **/
  public List<String> getAudioEmotions() {
    return audioEmotions;
  }

  public void setAudioEmotions(List<String> audioEmotions) {
    this.audioEmotions = audioEmotions;
  }

  public OrsonAiEmotionsResponse visualEmotions(List<OrsonAiVisualEmotionResponse> visualEmotions) {
    this.visualEmotions = visualEmotions;
    return this;
  }

  public OrsonAiEmotionsResponse addVisualEmotionsItem(OrsonAiVisualEmotionResponse visualEmotionsItem) {
    if (this.visualEmotions == null) {
      this.visualEmotions = new ArrayList<>();
    }
    this.visualEmotions.add(visualEmotionsItem);
    return this;
  }

   /**
   * Get visualEmotions
   * @return visualEmotions
  **/
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
    return Objects.equals(requestId, orsonAiEmotionsResponse.requestId) &&
        Objects.equals(responseCode, orsonAiEmotionsResponse.responseCode) &&
        Objects.equals(responseRaw, orsonAiEmotionsResponse.responseRaw) &&
        Objects.equals(status, orsonAiEmotionsResponse.status) &&
        Objects.equals(error, orsonAiEmotionsResponse.error) &&
        Objects.equals(audioEmotions, orsonAiEmotionsResponse.audioEmotions) &&
        Objects.equals(visualEmotions, orsonAiEmotionsResponse.visualEmotions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId, responseCode, responseRaw, status, error, audioEmotions, visualEmotions);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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


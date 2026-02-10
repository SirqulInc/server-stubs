package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * OrsonAiVisualEmotionResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OrsonAiVisualEmotionResponse   {
  @JsonProperty("requestId")
  
  private String requestId;

  @JsonProperty("responseCode")
  
  private Integer responseCode;

  @JsonProperty("responseRaw")
  
  private String responseRaw;

  @JsonProperty("userIndex")
  
  private Long userIndex;

  @JsonProperty("emotion")
  
  private String emotion;

  @JsonProperty("probability")
  
  private Double probability;

  public OrsonAiVisualEmotionResponse requestId(String requestId) {
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

  public OrsonAiVisualEmotionResponse responseCode(Integer responseCode) {
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

  public OrsonAiVisualEmotionResponse responseRaw(String responseRaw) {
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

  public OrsonAiVisualEmotionResponse userIndex(Long userIndex) {
    this.userIndex = userIndex;
    return this;
  }

   /**
   * Get userIndex
   * @return userIndex
  **/
  public Long getUserIndex() {
    return userIndex;
  }

  public void setUserIndex(Long userIndex) {
    this.userIndex = userIndex;
  }

  public OrsonAiVisualEmotionResponse emotion(String emotion) {
    this.emotion = emotion;
    return this;
  }

   /**
   * Get emotion
   * @return emotion
  **/
  public String getEmotion() {
    return emotion;
  }

  public void setEmotion(String emotion) {
    this.emotion = emotion;
  }

  public OrsonAiVisualEmotionResponse probability(Double probability) {
    this.probability = probability;
    return this;
  }

   /**
   * Get probability
   * @return probability
  **/
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
    return Objects.equals(requestId, orsonAiVisualEmotionResponse.requestId) &&
        Objects.equals(responseCode, orsonAiVisualEmotionResponse.responseCode) &&
        Objects.equals(responseRaw, orsonAiVisualEmotionResponse.responseRaw) &&
        Objects.equals(userIndex, orsonAiVisualEmotionResponse.userIndex) &&
        Objects.equals(emotion, orsonAiVisualEmotionResponse.emotion) &&
        Objects.equals(probability, orsonAiVisualEmotionResponse.probability);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId, responseCode, responseRaw, userIndex, emotion, probability);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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


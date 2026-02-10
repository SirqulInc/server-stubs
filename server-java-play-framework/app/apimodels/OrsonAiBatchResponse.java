package apimodels;

import apimodels.OrsonAiBatchEmotionsResponse;
import apimodels.OrsonAiBatchTopicsResponse;
import apimodels.OrsonAiBatchTranscriptResponse;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * OrsonAiBatchResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OrsonAiBatchResponse   {
  @JsonProperty("requestId")
  
  private String requestId;

  @JsonProperty("responseCode")
  
  private Integer responseCode;

  @JsonProperty("responseRaw")
  
  private String responseRaw;

  @JsonProperty("transcript")
  @Valid

  private OrsonAiBatchTranscriptResponse transcript;

  @JsonProperty("topics")
  @Valid

  private OrsonAiBatchTopicsResponse topics;

  @JsonProperty("emotions")
  @Valid

  private OrsonAiBatchEmotionsResponse emotions;

  public OrsonAiBatchResponse requestId(String requestId) {
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

  public OrsonAiBatchResponse responseCode(Integer responseCode) {
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

  public OrsonAiBatchResponse responseRaw(String responseRaw) {
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

  public OrsonAiBatchResponse transcript(OrsonAiBatchTranscriptResponse transcript) {
    this.transcript = transcript;
    return this;
  }

   /**
   * Get transcript
   * @return transcript
  **/
  public OrsonAiBatchTranscriptResponse getTranscript() {
    return transcript;
  }

  public void setTranscript(OrsonAiBatchTranscriptResponse transcript) {
    this.transcript = transcript;
  }

  public OrsonAiBatchResponse topics(OrsonAiBatchTopicsResponse topics) {
    this.topics = topics;
    return this;
  }

   /**
   * Get topics
   * @return topics
  **/
  public OrsonAiBatchTopicsResponse getTopics() {
    return topics;
  }

  public void setTopics(OrsonAiBatchTopicsResponse topics) {
    this.topics = topics;
  }

  public OrsonAiBatchResponse emotions(OrsonAiBatchEmotionsResponse emotions) {
    this.emotions = emotions;
    return this;
  }

   /**
   * Get emotions
   * @return emotions
  **/
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
    return Objects.equals(requestId, orsonAiBatchResponse.requestId) &&
        Objects.equals(responseCode, orsonAiBatchResponse.responseCode) &&
        Objects.equals(responseRaw, orsonAiBatchResponse.responseRaw) &&
        Objects.equals(transcript, orsonAiBatchResponse.transcript) &&
        Objects.equals(topics, orsonAiBatchResponse.topics) &&
        Objects.equals(emotions, orsonAiBatchResponse.emotions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId, responseCode, responseRaw, transcript, topics, emotions);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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


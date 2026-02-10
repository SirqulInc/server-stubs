package apimodels;

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
 * OrsonAiVoiceCanvasResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OrsonAiVoiceCanvasResponse   {
  @JsonProperty("requestId")
  
  private String requestId;

  @JsonProperty("responseCode")
  
  private Integer responseCode;

  @JsonProperty("responseRaw")
  
  private String responseRaw;

  @JsonProperty("filenames")
  
  private List<String> filenames = null;

  public OrsonAiVoiceCanvasResponse requestId(String requestId) {
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

  public OrsonAiVoiceCanvasResponse responseCode(Integer responseCode) {
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

  public OrsonAiVoiceCanvasResponse responseRaw(String responseRaw) {
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

  public OrsonAiVoiceCanvasResponse filenames(List<String> filenames) {
    this.filenames = filenames;
    return this;
  }

  public OrsonAiVoiceCanvasResponse addFilenamesItem(String filenamesItem) {
    if (this.filenames == null) {
      this.filenames = new ArrayList<>();
    }
    this.filenames.add(filenamesItem);
    return this;
  }

   /**
   * Get filenames
   * @return filenames
  **/
  public List<String> getFilenames() {
    return filenames;
  }

  public void setFilenames(List<String> filenames) {
    this.filenames = filenames;
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
    return Objects.equals(requestId, orsonAiVoiceCanvasResponse.requestId) &&
        Objects.equals(responseCode, orsonAiVoiceCanvasResponse.responseCode) &&
        Objects.equals(responseRaw, orsonAiVoiceCanvasResponse.responseRaw) &&
        Objects.equals(filenames, orsonAiVoiceCanvasResponse.filenames);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId, responseCode, responseRaw, filenames);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


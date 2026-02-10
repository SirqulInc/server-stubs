package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * OrsonAiAddMovieResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OrsonAiAddMovieResponse   {
  @JsonProperty("requestId")
  
  private String requestId;

  @JsonProperty("responseCode")
  
  private Integer responseCode;

  @JsonProperty("responseRaw")
  
  private String responseRaw;

  @JsonProperty("id")
  
  private String id;

  @JsonProperty("hasBeenIndexed")
  
  private Boolean hasBeenIndexed;

  public OrsonAiAddMovieResponse requestId(String requestId) {
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

  public OrsonAiAddMovieResponse responseCode(Integer responseCode) {
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

  public OrsonAiAddMovieResponse responseRaw(String responseRaw) {
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

  public OrsonAiAddMovieResponse id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public OrsonAiAddMovieResponse hasBeenIndexed(Boolean hasBeenIndexed) {
    this.hasBeenIndexed = hasBeenIndexed;
    return this;
  }

   /**
   * Get hasBeenIndexed
   * @return hasBeenIndexed
  **/
  public Boolean getHasBeenIndexed() {
    return hasBeenIndexed;
  }

  public void setHasBeenIndexed(Boolean hasBeenIndexed) {
    this.hasBeenIndexed = hasBeenIndexed;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrsonAiAddMovieResponse orsonAiAddMovieResponse = (OrsonAiAddMovieResponse) o;
    return Objects.equals(requestId, orsonAiAddMovieResponse.requestId) &&
        Objects.equals(responseCode, orsonAiAddMovieResponse.responseCode) &&
        Objects.equals(responseRaw, orsonAiAddMovieResponse.responseRaw) &&
        Objects.equals(id, orsonAiAddMovieResponse.id) &&
        Objects.equals(hasBeenIndexed, orsonAiAddMovieResponse.hasBeenIndexed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId, responseCode, responseRaw, id, hasBeenIndexed);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrsonAiAddMovieResponse {\n");
    
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    responseCode: ").append(toIndentedString(responseCode)).append("\n");
    sb.append("    responseRaw: ").append(toIndentedString(responseRaw)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    hasBeenIndexed: ").append(toIndentedString(hasBeenIndexed)).append("\n");
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


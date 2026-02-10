package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OrsonAiAddMovieResponse  {
  
  @ApiModelProperty(value = "")

  private String requestId;

  @ApiModelProperty(value = "")

  private Integer responseCode;

  @ApiModelProperty(value = "")

  private String responseRaw;

  @ApiModelProperty(value = "")

  private String id;

  @ApiModelProperty(value = "")

  private Boolean hasBeenIndexed;
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

  public OrsonAiAddMovieResponse requestId(String requestId) {
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

  public OrsonAiAddMovieResponse responseCode(Integer responseCode) {
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

  public OrsonAiAddMovieResponse responseRaw(String responseRaw) {
    this.responseRaw = responseRaw;
    return this;
  }

 /**
   * Get id
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public OrsonAiAddMovieResponse id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Get hasBeenIndexed
   * @return hasBeenIndexed
  **/
  @JsonProperty("hasBeenIndexed")
  public Boolean getHasBeenIndexed() {
    return hasBeenIndexed;
  }

  public void setHasBeenIndexed(Boolean hasBeenIndexed) {
    this.hasBeenIndexed = hasBeenIndexed;
  }

  public OrsonAiAddMovieResponse hasBeenIndexed(Boolean hasBeenIndexed) {
    this.hasBeenIndexed = hasBeenIndexed;
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
    OrsonAiAddMovieResponse orsonAiAddMovieResponse = (OrsonAiAddMovieResponse) o;
    return Objects.equals(this.requestId, orsonAiAddMovieResponse.requestId) &&
        Objects.equals(this.responseCode, orsonAiAddMovieResponse.responseCode) &&
        Objects.equals(this.responseRaw, orsonAiAddMovieResponse.responseRaw) &&
        Objects.equals(this.id, orsonAiAddMovieResponse.id) &&
        Objects.equals(this.hasBeenIndexed, orsonAiAddMovieResponse.hasBeenIndexed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId, responseCode, responseRaw, id, hasBeenIndexed);
  }

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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


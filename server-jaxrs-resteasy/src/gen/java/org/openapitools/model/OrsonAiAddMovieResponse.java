package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-09T20:51:23.077809933Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class OrsonAiAddMovieResponse   {
  
  private String requestId;
  private Integer responseCode;
  private String responseRaw;
  private String id;
  private Boolean hasBeenIndexed;

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
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("hasBeenIndexed")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


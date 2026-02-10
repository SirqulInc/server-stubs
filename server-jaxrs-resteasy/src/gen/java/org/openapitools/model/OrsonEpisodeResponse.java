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
import org.openapitools.model.OrsonRenderResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-09T20:51:23.077809933Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class OrsonEpisodeResponse   {
  
  private String id;
  private String status;
  private String statusDescription;
  private Integer responseCode;
  private String responseRaw;
  private List<@Valid OrsonRenderResponse> renders = new ArrayList<>();

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
  @JsonProperty("statusDescription")
  public String getStatusDescription() {
    return statusDescription;
  }
  public void setStatusDescription(String statusDescription) {
    this.statusDescription = statusDescription;
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
  @JsonProperty("renders")
  @Valid
  public List<@Valid OrsonRenderResponse> getRenders() {
    return renders;
  }
  public void setRenders(List<@Valid OrsonRenderResponse> renders) {
    this.renders = renders;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrsonEpisodeResponse orsonEpisodeResponse = (OrsonEpisodeResponse) o;
    return Objects.equals(this.id, orsonEpisodeResponse.id) &&
        Objects.equals(this.status, orsonEpisodeResponse.status) &&
        Objects.equals(this.statusDescription, orsonEpisodeResponse.statusDescription) &&
        Objects.equals(this.responseCode, orsonEpisodeResponse.responseCode) &&
        Objects.equals(this.responseRaw, orsonEpisodeResponse.responseRaw) &&
        Objects.equals(this.renders, orsonEpisodeResponse.renders);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, status, statusDescription, responseCode, responseRaw, renders);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrsonEpisodeResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusDescription: ").append(toIndentedString(statusDescription)).append("\n");
    sb.append("    responseCode: ").append(toIndentedString(responseCode)).append("\n");
    sb.append("    responseRaw: ").append(toIndentedString(responseRaw)).append("\n");
    sb.append("    renders: ").append(toIndentedString(renders)).append("\n");
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


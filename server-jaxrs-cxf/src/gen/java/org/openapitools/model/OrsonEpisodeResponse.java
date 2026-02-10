package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.OrsonRenderResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OrsonEpisodeResponse  {
  
  @ApiModelProperty(value = "")

  private String id;

  @ApiModelProperty(value = "")

  private String status;

  @ApiModelProperty(value = "")

  private String statusDescription;

  @ApiModelProperty(value = "")

  private Integer responseCode;

  @ApiModelProperty(value = "")

  private String responseRaw;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid OrsonRenderResponse> renders = new ArrayList<>();
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

  public OrsonEpisodeResponse id(String id) {
    this.id = id;
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

  public OrsonEpisodeResponse status(String status) {
    this.status = status;
    return this;
  }

 /**
   * Get statusDescription
   * @return statusDescription
  **/
  @JsonProperty("statusDescription")
  public String getStatusDescription() {
    return statusDescription;
  }

  public void setStatusDescription(String statusDescription) {
    this.statusDescription = statusDescription;
  }

  public OrsonEpisodeResponse statusDescription(String statusDescription) {
    this.statusDescription = statusDescription;
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

  public OrsonEpisodeResponse responseCode(Integer responseCode) {
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

  public OrsonEpisodeResponse responseRaw(String responseRaw) {
    this.responseRaw = responseRaw;
    return this;
  }

 /**
   * Get renders
   * @return renders
  **/
  @JsonProperty("renders")
  public List<@Valid OrsonRenderResponse> getRenders() {
    return renders;
  }

  public void setRenders(List<@Valid OrsonRenderResponse> renders) {
    this.renders = renders;
  }

  public OrsonEpisodeResponse renders(List<@Valid OrsonRenderResponse> renders) {
    this.renders = renders;
    return this;
  }

  public OrsonEpisodeResponse addRendersItem(OrsonRenderResponse rendersItem) {
    this.renders.add(rendersItem);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


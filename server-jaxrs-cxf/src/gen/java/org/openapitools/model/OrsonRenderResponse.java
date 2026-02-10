package org.openapitools.model;

import org.openapitools.model.OrsonVideoResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OrsonRenderResponse  {
  
  @ApiModelProperty(value = "")

  private String id;

  @ApiModelProperty(value = "")

  private String thirdPartyAccountId;

  @ApiModelProperty(value = "")

  private String status;

  @ApiModelProperty(value = "")

  private String statusDescription;

  @ApiModelProperty(value = "")

  private String completedOn;

  @ApiModelProperty(value = "")

  private Integer responseCode;

  @ApiModelProperty(value = "")

  private String responseRaw;

  @ApiModelProperty(value = "")

  @Valid

  private OrsonVideoResponse video;
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

  public OrsonRenderResponse id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Get thirdPartyAccountId
   * @return thirdPartyAccountId
  **/
  @JsonProperty("thirdPartyAccountId")
  public String getThirdPartyAccountId() {
    return thirdPartyAccountId;
  }

  public void setThirdPartyAccountId(String thirdPartyAccountId) {
    this.thirdPartyAccountId = thirdPartyAccountId;
  }

  public OrsonRenderResponse thirdPartyAccountId(String thirdPartyAccountId) {
    this.thirdPartyAccountId = thirdPartyAccountId;
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

  public OrsonRenderResponse status(String status) {
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

  public OrsonRenderResponse statusDescription(String statusDescription) {
    this.statusDescription = statusDescription;
    return this;
  }

 /**
   * Get completedOn
   * @return completedOn
  **/
  @JsonProperty("completedOn")
  public String getCompletedOn() {
    return completedOn;
  }

  public void setCompletedOn(String completedOn) {
    this.completedOn = completedOn;
  }

  public OrsonRenderResponse completedOn(String completedOn) {
    this.completedOn = completedOn;
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

  public OrsonRenderResponse responseCode(Integer responseCode) {
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

  public OrsonRenderResponse responseRaw(String responseRaw) {
    this.responseRaw = responseRaw;
    return this;
  }

 /**
   * Get video
   * @return video
  **/
  @JsonProperty("video")
  public OrsonVideoResponse getVideo() {
    return video;
  }

  public void setVideo(OrsonVideoResponse video) {
    this.video = video;
  }

  public OrsonRenderResponse video(OrsonVideoResponse video) {
    this.video = video;
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
    OrsonRenderResponse orsonRenderResponse = (OrsonRenderResponse) o;
    return Objects.equals(this.id, orsonRenderResponse.id) &&
        Objects.equals(this.thirdPartyAccountId, orsonRenderResponse.thirdPartyAccountId) &&
        Objects.equals(this.status, orsonRenderResponse.status) &&
        Objects.equals(this.statusDescription, orsonRenderResponse.statusDescription) &&
        Objects.equals(this.completedOn, orsonRenderResponse.completedOn) &&
        Objects.equals(this.responseCode, orsonRenderResponse.responseCode) &&
        Objects.equals(this.responseRaw, orsonRenderResponse.responseRaw) &&
        Objects.equals(this.video, orsonRenderResponse.video);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, thirdPartyAccountId, status, statusDescription, completedOn, responseCode, responseRaw, video);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrsonRenderResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    thirdPartyAccountId: ").append(toIndentedString(thirdPartyAccountId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusDescription: ").append(toIndentedString(statusDescription)).append("\n");
    sb.append("    completedOn: ").append(toIndentedString(completedOn)).append("\n");
    sb.append("    responseCode: ").append(toIndentedString(responseCode)).append("\n");
    sb.append("    responseRaw: ").append(toIndentedString(responseRaw)).append("\n");
    sb.append("    video: ").append(toIndentedString(video)).append("\n");
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


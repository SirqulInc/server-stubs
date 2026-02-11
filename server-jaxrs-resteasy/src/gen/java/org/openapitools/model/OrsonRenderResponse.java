package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.OrsonVideoResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class OrsonRenderResponse   {
  
  private String id;
  private String thirdPartyAccountId;
  private String status;
  private String statusDescription;
  private String completedOn;
  private Integer responseCode;
  private String responseRaw;
  private OrsonVideoResponse video;

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
  @JsonProperty("thirdPartyAccountId")
  public String getThirdPartyAccountId() {
    return thirdPartyAccountId;
  }
  public void setThirdPartyAccountId(String thirdPartyAccountId) {
    this.thirdPartyAccountId = thirdPartyAccountId;
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
  @JsonProperty("completedOn")
  public String getCompletedOn() {
    return completedOn;
  }
  public void setCompletedOn(String completedOn) {
    this.completedOn = completedOn;
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
  @JsonProperty("video")
  @Valid
  public OrsonVideoResponse getVideo() {
    return video;
  }
  public void setVideo(OrsonVideoResponse video) {
    this.video = video;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


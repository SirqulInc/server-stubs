package apimodels;

import apimodels.OrsonVideoResponse;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * OrsonRenderResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OrsonRenderResponse   {
  @JsonProperty("id")
  
  private String id;

  @JsonProperty("thirdPartyAccountId")
  
  private String thirdPartyAccountId;

  @JsonProperty("status")
  
  private String status;

  @JsonProperty("statusDescription")
  
  private String statusDescription;

  @JsonProperty("completedOn")
  
  private String completedOn;

  @JsonProperty("responseCode")
  
  private Integer responseCode;

  @JsonProperty("responseRaw")
  
  private String responseRaw;

  @JsonProperty("video")
  @Valid

  private OrsonVideoResponse video;

  public OrsonRenderResponse id(String id) {
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

  public OrsonRenderResponse thirdPartyAccountId(String thirdPartyAccountId) {
    this.thirdPartyAccountId = thirdPartyAccountId;
    return this;
  }

   /**
   * Get thirdPartyAccountId
   * @return thirdPartyAccountId
  **/
  public String getThirdPartyAccountId() {
    return thirdPartyAccountId;
  }

  public void setThirdPartyAccountId(String thirdPartyAccountId) {
    this.thirdPartyAccountId = thirdPartyAccountId;
  }

  public OrsonRenderResponse status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public OrsonRenderResponse statusDescription(String statusDescription) {
    this.statusDescription = statusDescription;
    return this;
  }

   /**
   * Get statusDescription
   * @return statusDescription
  **/
  public String getStatusDescription() {
    return statusDescription;
  }

  public void setStatusDescription(String statusDescription) {
    this.statusDescription = statusDescription;
  }

  public OrsonRenderResponse completedOn(String completedOn) {
    this.completedOn = completedOn;
    return this;
  }

   /**
   * Get completedOn
   * @return completedOn
  **/
  public String getCompletedOn() {
    return completedOn;
  }

  public void setCompletedOn(String completedOn) {
    this.completedOn = completedOn;
  }

  public OrsonRenderResponse responseCode(Integer responseCode) {
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

  public OrsonRenderResponse responseRaw(String responseRaw) {
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

  public OrsonRenderResponse video(OrsonVideoResponse video) {
    this.video = video;
    return this;
  }

   /**
   * Get video
   * @return video
  **/
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
    return Objects.equals(id, orsonRenderResponse.id) &&
        Objects.equals(thirdPartyAccountId, orsonRenderResponse.thirdPartyAccountId) &&
        Objects.equals(status, orsonRenderResponse.status) &&
        Objects.equals(statusDescription, orsonRenderResponse.statusDescription) &&
        Objects.equals(completedOn, orsonRenderResponse.completedOn) &&
        Objects.equals(responseCode, orsonRenderResponse.responseCode) &&
        Objects.equals(responseRaw, orsonRenderResponse.responseRaw) &&
        Objects.equals(video, orsonRenderResponse.video);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, thirdPartyAccountId, status, statusDescription, completedOn, responseCode, responseRaw, video);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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


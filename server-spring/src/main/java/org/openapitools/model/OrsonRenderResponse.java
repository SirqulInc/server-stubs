package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.OrsonVideoResponse;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * OrsonRenderResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-09T20:58:37.853899731Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class OrsonRenderResponse {

  private @Nullable String id;

  private @Nullable String thirdPartyAccountId;

  private @Nullable String status;

  private @Nullable String statusDescription;

  private @Nullable String completedOn;

  private @Nullable Integer responseCode;

  private @Nullable String responseRaw;

  private @Nullable OrsonVideoResponse video;

  public OrsonRenderResponse id(@Nullable String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public @Nullable String getId() {
    return id;
  }

  public void setId(@Nullable String id) {
    this.id = id;
  }

  public OrsonRenderResponse thirdPartyAccountId(@Nullable String thirdPartyAccountId) {
    this.thirdPartyAccountId = thirdPartyAccountId;
    return this;
  }

  /**
   * Get thirdPartyAccountId
   * @return thirdPartyAccountId
   */
  
  @Schema(name = "thirdPartyAccountId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("thirdPartyAccountId")
  public @Nullable String getThirdPartyAccountId() {
    return thirdPartyAccountId;
  }

  public void setThirdPartyAccountId(@Nullable String thirdPartyAccountId) {
    this.thirdPartyAccountId = thirdPartyAccountId;
  }

  public OrsonRenderResponse status(@Nullable String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  
  @Schema(name = "status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public @Nullable String getStatus() {
    return status;
  }

  public void setStatus(@Nullable String status) {
    this.status = status;
  }

  public OrsonRenderResponse statusDescription(@Nullable String statusDescription) {
    this.statusDescription = statusDescription;
    return this;
  }

  /**
   * Get statusDescription
   * @return statusDescription
   */
  
  @Schema(name = "statusDescription", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("statusDescription")
  public @Nullable String getStatusDescription() {
    return statusDescription;
  }

  public void setStatusDescription(@Nullable String statusDescription) {
    this.statusDescription = statusDescription;
  }

  public OrsonRenderResponse completedOn(@Nullable String completedOn) {
    this.completedOn = completedOn;
    return this;
  }

  /**
   * Get completedOn
   * @return completedOn
   */
  
  @Schema(name = "completedOn", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("completedOn")
  public @Nullable String getCompletedOn() {
    return completedOn;
  }

  public void setCompletedOn(@Nullable String completedOn) {
    this.completedOn = completedOn;
  }

  public OrsonRenderResponse responseCode(@Nullable Integer responseCode) {
    this.responseCode = responseCode;
    return this;
  }

  /**
   * Get responseCode
   * @return responseCode
   */
  
  @Schema(name = "responseCode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("responseCode")
  public @Nullable Integer getResponseCode() {
    return responseCode;
  }

  public void setResponseCode(@Nullable Integer responseCode) {
    this.responseCode = responseCode;
  }

  public OrsonRenderResponse responseRaw(@Nullable String responseRaw) {
    this.responseRaw = responseRaw;
    return this;
  }

  /**
   * Get responseRaw
   * @return responseRaw
   */
  
  @Schema(name = "responseRaw", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("responseRaw")
  public @Nullable String getResponseRaw() {
    return responseRaw;
  }

  public void setResponseRaw(@Nullable String responseRaw) {
    this.responseRaw = responseRaw;
  }

  public OrsonRenderResponse video(@Nullable OrsonVideoResponse video) {
    this.video = video;
    return this;
  }

  /**
   * Get video
   * @return video
   */
  @Valid 
  @Schema(name = "video", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("video")
  public @Nullable OrsonVideoResponse getVideo() {
    return video;
  }

  public void setVideo(@Nullable OrsonVideoResponse video) {
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
  private String toIndentedString(@Nullable Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.OrsonRenderResponse;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * OrsonEpisodeResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-09T20:58:37.853899731Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class OrsonEpisodeResponse {

  private @Nullable String id;

  private @Nullable String status;

  private @Nullable String statusDescription;

  private @Nullable Integer responseCode;

  private @Nullable String responseRaw;

  @Valid
  private List<@Valid OrsonRenderResponse> renders = new ArrayList<>();

  public OrsonEpisodeResponse id(@Nullable String id) {
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

  public OrsonEpisodeResponse status(@Nullable String status) {
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

  public OrsonEpisodeResponse statusDescription(@Nullable String statusDescription) {
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

  public OrsonEpisodeResponse responseCode(@Nullable Integer responseCode) {
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

  public OrsonEpisodeResponse responseRaw(@Nullable String responseRaw) {
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

  public OrsonEpisodeResponse renders(List<@Valid OrsonRenderResponse> renders) {
    this.renders = renders;
    return this;
  }

  public OrsonEpisodeResponse addRendersItem(OrsonRenderResponse rendersItem) {
    if (this.renders == null) {
      this.renders = new ArrayList<>();
    }
    this.renders.add(rendersItem);
    return this;
  }

  /**
   * Get renders
   * @return renders
   */
  @Valid 
  @Schema(name = "renders", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("renders")
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
  private String toIndentedString(@Nullable Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


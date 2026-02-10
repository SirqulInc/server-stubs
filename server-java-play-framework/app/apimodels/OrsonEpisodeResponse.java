package apimodels;

import apimodels.OrsonRenderResponse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * OrsonEpisodeResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OrsonEpisodeResponse   {
  @JsonProperty("id")
  
  private String id;

  @JsonProperty("status")
  
  private String status;

  @JsonProperty("statusDescription")
  
  private String statusDescription;

  @JsonProperty("responseCode")
  
  private Integer responseCode;

  @JsonProperty("responseRaw")
  
  private String responseRaw;

  @JsonProperty("renders")
  @Valid

  private List<@Valid OrsonRenderResponse> renders = null;

  public OrsonEpisodeResponse id(String id) {
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

  public OrsonEpisodeResponse status(String status) {
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

  public OrsonEpisodeResponse statusDescription(String statusDescription) {
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

  public OrsonEpisodeResponse responseCode(Integer responseCode) {
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

  public OrsonEpisodeResponse responseRaw(String responseRaw) {
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
  **/
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
    return Objects.equals(id, orsonEpisodeResponse.id) &&
        Objects.equals(status, orsonEpisodeResponse.status) &&
        Objects.equals(statusDescription, orsonEpisodeResponse.statusDescription) &&
        Objects.equals(responseCode, orsonEpisodeResponse.responseCode) &&
        Objects.equals(responseRaw, orsonEpisodeResponse.responseRaw) &&
        Objects.equals(renders, orsonEpisodeResponse.renders);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, status, statusDescription, responseCode, responseRaw, renders);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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


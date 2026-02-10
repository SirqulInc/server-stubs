package org.openapitools.model;

import org.openapitools.model.ApplicationMiniResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ApplicationSettingsResponse  {
  
  @ApiModelProperty(value = "")

  @Valid

  private ApplicationMiniResponse application;

  @ApiModelProperty(value = "")

  private Long termsAcceptedDate;

  @ApiModelProperty(value = "")

  private Long updated;

  @ApiModelProperty(value = "")

  private Long created;
 /**
   * Get application
   * @return application
  **/
  @JsonProperty("application")
  public ApplicationMiniResponse getApplication() {
    return application;
  }

  public void setApplication(ApplicationMiniResponse application) {
    this.application = application;
  }

  public ApplicationSettingsResponse application(ApplicationMiniResponse application) {
    this.application = application;
    return this;
  }

 /**
   * Get termsAcceptedDate
   * @return termsAcceptedDate
  **/
  @JsonProperty("termsAcceptedDate")
  public Long getTermsAcceptedDate() {
    return termsAcceptedDate;
  }

  public void setTermsAcceptedDate(Long termsAcceptedDate) {
    this.termsAcceptedDate = termsAcceptedDate;
  }

  public ApplicationSettingsResponse termsAcceptedDate(Long termsAcceptedDate) {
    this.termsAcceptedDate = termsAcceptedDate;
    return this;
  }

 /**
   * Get updated
   * @return updated
  **/
  @JsonProperty("updated")
  public Long getUpdated() {
    return updated;
  }

  public void setUpdated(Long updated) {
    this.updated = updated;
  }

  public ApplicationSettingsResponse updated(Long updated) {
    this.updated = updated;
    return this;
  }

 /**
   * Get created
   * @return created
  **/
  @JsonProperty("created")
  public Long getCreated() {
    return created;
  }

  public void setCreated(Long created) {
    this.created = created;
  }

  public ApplicationSettingsResponse created(Long created) {
    this.created = created;
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
    ApplicationSettingsResponse applicationSettingsResponse = (ApplicationSettingsResponse) o;
    return Objects.equals(this.application, applicationSettingsResponse.application) &&
        Objects.equals(this.termsAcceptedDate, applicationSettingsResponse.termsAcceptedDate) &&
        Objects.equals(this.updated, applicationSettingsResponse.updated) &&
        Objects.equals(this.created, applicationSettingsResponse.created);
  }

  @Override
  public int hashCode() {
    return Objects.hash(application, termsAcceptedDate, updated, created);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationSettingsResponse {\n");
    
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
    sb.append("    termsAcceptedDate: ").append(toIndentedString(termsAcceptedDate)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
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


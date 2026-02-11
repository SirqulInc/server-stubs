package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ApplicationMiniResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class ApplicationSettingsResponse   {
  
  private ApplicationMiniResponse application;
  private Long termsAcceptedDate;
  private Long updated;
  private Long created;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("application")
  @Valid
  public ApplicationMiniResponse getApplication() {
    return application;
  }
  public void setApplication(ApplicationMiniResponse application) {
    this.application = application;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("termsAcceptedDate")
  public Long getTermsAcceptedDate() {
    return termsAcceptedDate;
  }
  public void setTermsAcceptedDate(Long termsAcceptedDate) {
    this.termsAcceptedDate = termsAcceptedDate;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("updated")
  public Long getUpdated() {
    return updated;
  }
  public void setUpdated(Long updated) {
    this.updated = updated;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("created")
  public Long getCreated() {
    return created;
  }
  public void setCreated(Long created) {
    this.created = created;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


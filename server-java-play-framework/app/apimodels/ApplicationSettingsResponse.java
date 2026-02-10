package apimodels;

import apimodels.ApplicationMiniResponse;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ApplicationSettingsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ApplicationSettingsResponse   {
  @JsonProperty("application")
  @Valid

  private ApplicationMiniResponse application;

  @JsonProperty("termsAcceptedDate")
  
  private Long termsAcceptedDate;

  @JsonProperty("updated")
  
  private Long updated;

  @JsonProperty("created")
  
  private Long created;

  public ApplicationSettingsResponse application(ApplicationMiniResponse application) {
    this.application = application;
    return this;
  }

   /**
   * Get application
   * @return application
  **/
  public ApplicationMiniResponse getApplication() {
    return application;
  }

  public void setApplication(ApplicationMiniResponse application) {
    this.application = application;
  }

  public ApplicationSettingsResponse termsAcceptedDate(Long termsAcceptedDate) {
    this.termsAcceptedDate = termsAcceptedDate;
    return this;
  }

   /**
   * Get termsAcceptedDate
   * @return termsAcceptedDate
  **/
  public Long getTermsAcceptedDate() {
    return termsAcceptedDate;
  }

  public void setTermsAcceptedDate(Long termsAcceptedDate) {
    this.termsAcceptedDate = termsAcceptedDate;
  }

  public ApplicationSettingsResponse updated(Long updated) {
    this.updated = updated;
    return this;
  }

   /**
   * Get updated
   * @return updated
  **/
  public Long getUpdated() {
    return updated;
  }

  public void setUpdated(Long updated) {
    this.updated = updated;
  }

  public ApplicationSettingsResponse created(Long created) {
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
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
    return Objects.equals(application, applicationSettingsResponse.application) &&
        Objects.equals(termsAcceptedDate, applicationSettingsResponse.termsAcceptedDate) &&
        Objects.equals(updated, applicationSettingsResponse.updated) &&
        Objects.equals(created, applicationSettingsResponse.created);
  }

  @Override
  public int hashCode() {
    return Objects.hash(application, termsAcceptedDate, updated, created);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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


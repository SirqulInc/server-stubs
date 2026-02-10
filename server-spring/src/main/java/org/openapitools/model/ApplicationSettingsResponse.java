package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ApplicationMiniResponse;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ApplicationSettingsResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-09T20:58:37.853899731Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class ApplicationSettingsResponse {

  private @Nullable ApplicationMiniResponse application;

  private @Nullable Long termsAcceptedDate;

  private @Nullable Long updated;

  private @Nullable Long created;

  public ApplicationSettingsResponse application(@Nullable ApplicationMiniResponse application) {
    this.application = application;
    return this;
  }

  /**
   * Get application
   * @return application
   */
  @Valid 
  @Schema(name = "application", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("application")
  public @Nullable ApplicationMiniResponse getApplication() {
    return application;
  }

  public void setApplication(@Nullable ApplicationMiniResponse application) {
    this.application = application;
  }

  public ApplicationSettingsResponse termsAcceptedDate(@Nullable Long termsAcceptedDate) {
    this.termsAcceptedDate = termsAcceptedDate;
    return this;
  }

  /**
   * Get termsAcceptedDate
   * @return termsAcceptedDate
   */
  
  @Schema(name = "termsAcceptedDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("termsAcceptedDate")
  public @Nullable Long getTermsAcceptedDate() {
    return termsAcceptedDate;
  }

  public void setTermsAcceptedDate(@Nullable Long termsAcceptedDate) {
    this.termsAcceptedDate = termsAcceptedDate;
  }

  public ApplicationSettingsResponse updated(@Nullable Long updated) {
    this.updated = updated;
    return this;
  }

  /**
   * Get updated
   * @return updated
   */
  
  @Schema(name = "updated", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("updated")
  public @Nullable Long getUpdated() {
    return updated;
  }

  public void setUpdated(@Nullable Long updated) {
    this.updated = updated;
  }

  public ApplicationSettingsResponse created(@Nullable Long created) {
    this.created = created;
    return this;
  }

  /**
   * Get created
   * @return created
   */
  
  @Schema(name = "created", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("created")
  public @Nullable Long getCreated() {
    return created;
  }

  public void setCreated(@Nullable Long created) {
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
  private String toIndentedString(@Nullable Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


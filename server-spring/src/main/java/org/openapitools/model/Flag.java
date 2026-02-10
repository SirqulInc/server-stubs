package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.Account;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Flag
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-09T20:58:37.853899731Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class Flag {

  private @Nullable Long id;

  private @Nullable Boolean active;

  private @Nullable Boolean valid;

  private @Nullable Account owner;

  private @Nullable String flagableObjectType;

  private @Nullable Long flagableObjectId;

  private @Nullable String flagDescription;

  private @Nullable String app;

  public Flag id(@Nullable Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public @Nullable Long getId() {
    return id;
  }

  public void setId(@Nullable Long id) {
    this.id = id;
  }

  public Flag active(@Nullable Boolean active) {
    this.active = active;
    return this;
  }

  /**
   * Get active
   * @return active
   */
  
  @Schema(name = "active", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("active")
  public @Nullable Boolean getActive() {
    return active;
  }

  public void setActive(@Nullable Boolean active) {
    this.active = active;
  }

  public Flag valid(@Nullable Boolean valid) {
    this.valid = valid;
    return this;
  }

  /**
   * Get valid
   * @return valid
   */
  
  @Schema(name = "valid", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("valid")
  public @Nullable Boolean getValid() {
    return valid;
  }

  public void setValid(@Nullable Boolean valid) {
    this.valid = valid;
  }

  public Flag owner(@Nullable Account owner) {
    this.owner = owner;
    return this;
  }

  /**
   * Get owner
   * @return owner
   */
  @Valid 
  @Schema(name = "owner", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("owner")
  public @Nullable Account getOwner() {
    return owner;
  }

  public void setOwner(@Nullable Account owner) {
    this.owner = owner;
  }

  public Flag flagableObjectType(@Nullable String flagableObjectType) {
    this.flagableObjectType = flagableObjectType;
    return this;
  }

  /**
   * Get flagableObjectType
   * @return flagableObjectType
   */
  
  @Schema(name = "flagableObjectType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("flagableObjectType")
  public @Nullable String getFlagableObjectType() {
    return flagableObjectType;
  }

  public void setFlagableObjectType(@Nullable String flagableObjectType) {
    this.flagableObjectType = flagableObjectType;
  }

  public Flag flagableObjectId(@Nullable Long flagableObjectId) {
    this.flagableObjectId = flagableObjectId;
    return this;
  }

  /**
   * Get flagableObjectId
   * @return flagableObjectId
   */
  
  @Schema(name = "flagableObjectId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("flagableObjectId")
  public @Nullable Long getFlagableObjectId() {
    return flagableObjectId;
  }

  public void setFlagableObjectId(@Nullable Long flagableObjectId) {
    this.flagableObjectId = flagableObjectId;
  }

  public Flag flagDescription(@Nullable String flagDescription) {
    this.flagDescription = flagDescription;
    return this;
  }

  /**
   * Get flagDescription
   * @return flagDescription
   */
  
  @Schema(name = "flagDescription", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("flagDescription")
  public @Nullable String getFlagDescription() {
    return flagDescription;
  }

  public void setFlagDescription(@Nullable String flagDescription) {
    this.flagDescription = flagDescription;
  }

  public Flag app(@Nullable String app) {
    this.app = app;
    return this;
  }

  /**
   * Get app
   * @return app
   */
  
  @Schema(name = "app", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("app")
  public @Nullable String getApp() {
    return app;
  }

  public void setApp(@Nullable String app) {
    this.app = app;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Flag flag = (Flag) o;
    return Objects.equals(this.id, flag.id) &&
        Objects.equals(this.active, flag.active) &&
        Objects.equals(this.valid, flag.valid) &&
        Objects.equals(this.owner, flag.owner) &&
        Objects.equals(this.flagableObjectType, flag.flagableObjectType) &&
        Objects.equals(this.flagableObjectId, flag.flagableObjectId) &&
        Objects.equals(this.flagDescription, flag.flagDescription) &&
        Objects.equals(this.app, flag.app);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, active, valid, owner, flagableObjectType, flagableObjectId, flagDescription, app);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Flag {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    flagableObjectType: ").append(toIndentedString(flagableObjectType)).append("\n");
    sb.append("    flagableObjectId: ").append(toIndentedString(flagableObjectId)).append("\n");
    sb.append("    flagDescription: ").append(toIndentedString(flagDescription)).append("\n");
    sb.append("    app: ").append(toIndentedString(app)).append("\n");
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


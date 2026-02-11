package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * FlagResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-11T19:32:41.765375324Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class FlagResponse {

  private @Nullable Long flagId;

  private @Nullable Long flagableId;

  private @Nullable String flagableType;

  private @Nullable String flagDescription;

  private @Nullable Long createdDate;

  private @Nullable Long updatedDate;

  public FlagResponse flagId(@Nullable Long flagId) {
    this.flagId = flagId;
    return this;
  }

  /**
   * Get flagId
   * @return flagId
   */
  
  @Schema(name = "flagId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("flagId")
  public @Nullable Long getFlagId() {
    return flagId;
  }

  public void setFlagId(@Nullable Long flagId) {
    this.flagId = flagId;
  }

  public FlagResponse flagableId(@Nullable Long flagableId) {
    this.flagableId = flagableId;
    return this;
  }

  /**
   * Get flagableId
   * @return flagableId
   */
  
  @Schema(name = "flagableId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("flagableId")
  public @Nullable Long getFlagableId() {
    return flagableId;
  }

  public void setFlagableId(@Nullable Long flagableId) {
    this.flagableId = flagableId;
  }

  public FlagResponse flagableType(@Nullable String flagableType) {
    this.flagableType = flagableType;
    return this;
  }

  /**
   * Get flagableType
   * @return flagableType
   */
  
  @Schema(name = "flagableType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("flagableType")
  public @Nullable String getFlagableType() {
    return flagableType;
  }

  public void setFlagableType(@Nullable String flagableType) {
    this.flagableType = flagableType;
  }

  public FlagResponse flagDescription(@Nullable String flagDescription) {
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

  public FlagResponse createdDate(@Nullable Long createdDate) {
    this.createdDate = createdDate;
    return this;
  }

  /**
   * Get createdDate
   * @return createdDate
   */
  
  @Schema(name = "createdDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("createdDate")
  public @Nullable Long getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(@Nullable Long createdDate) {
    this.createdDate = createdDate;
  }

  public FlagResponse updatedDate(@Nullable Long updatedDate) {
    this.updatedDate = updatedDate;
    return this;
  }

  /**
   * Get updatedDate
   * @return updatedDate
   */
  
  @Schema(name = "updatedDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("updatedDate")
  public @Nullable Long getUpdatedDate() {
    return updatedDate;
  }

  public void setUpdatedDate(@Nullable Long updatedDate) {
    this.updatedDate = updatedDate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlagResponse flagResponse = (FlagResponse) o;
    return Objects.equals(this.flagId, flagResponse.flagId) &&
        Objects.equals(this.flagableId, flagResponse.flagableId) &&
        Objects.equals(this.flagableType, flagResponse.flagableType) &&
        Objects.equals(this.flagDescription, flagResponse.flagDescription) &&
        Objects.equals(this.createdDate, flagResponse.createdDate) &&
        Objects.equals(this.updatedDate, flagResponse.updatedDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flagId, flagableId, flagableType, flagDescription, createdDate, updatedDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlagResponse {\n");
    sb.append("    flagId: ").append(toIndentedString(flagId)).append("\n");
    sb.append("    flagableId: ").append(toIndentedString(flagableId)).append("\n");
    sb.append("    flagableType: ").append(toIndentedString(flagableType)).append("\n");
    sb.append("    flagDescription: ").append(toIndentedString(flagDescription)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    updatedDate: ").append(toIndentedString(updatedDate)).append("\n");
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


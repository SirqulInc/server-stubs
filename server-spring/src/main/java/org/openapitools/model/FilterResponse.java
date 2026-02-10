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
 * FilterResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-09T20:58:37.853899731Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class FilterResponse {

  private @Nullable Long filterId;

  private @Nullable String name;

  private @Nullable String display;

  private @Nullable Integer subFilterCount;

  private @Nullable Long parentId;

  private @Nullable String description;

  private @Nullable Boolean active;

  private @Nullable String externalId;

  private @Nullable String externalType;

  public FilterResponse filterId(@Nullable Long filterId) {
    this.filterId = filterId;
    return this;
  }

  /**
   * Get filterId
   * @return filterId
   */
  
  @Schema(name = "filterId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("filterId")
  public @Nullable Long getFilterId() {
    return filterId;
  }

  public void setFilterId(@Nullable Long filterId) {
    this.filterId = filterId;
  }

  public FilterResponse name(@Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  
  @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public @Nullable String getName() {
    return name;
  }

  public void setName(@Nullable String name) {
    this.name = name;
  }

  public FilterResponse display(@Nullable String display) {
    this.display = display;
    return this;
  }

  /**
   * Get display
   * @return display
   */
  
  @Schema(name = "display", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("display")
  public @Nullable String getDisplay() {
    return display;
  }

  public void setDisplay(@Nullable String display) {
    this.display = display;
  }

  public FilterResponse subFilterCount(@Nullable Integer subFilterCount) {
    this.subFilterCount = subFilterCount;
    return this;
  }

  /**
   * Get subFilterCount
   * @return subFilterCount
   */
  
  @Schema(name = "subFilterCount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("subFilterCount")
  public @Nullable Integer getSubFilterCount() {
    return subFilterCount;
  }

  public void setSubFilterCount(@Nullable Integer subFilterCount) {
    this.subFilterCount = subFilterCount;
  }

  public FilterResponse parentId(@Nullable Long parentId) {
    this.parentId = parentId;
    return this;
  }

  /**
   * Get parentId
   * @return parentId
   */
  
  @Schema(name = "parentId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("parentId")
  public @Nullable Long getParentId() {
    return parentId;
  }

  public void setParentId(@Nullable Long parentId) {
    this.parentId = parentId;
  }

  public FilterResponse description(@Nullable String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   */
  
  @Schema(name = "description", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public @Nullable String getDescription() {
    return description;
  }

  public void setDescription(@Nullable String description) {
    this.description = description;
  }

  public FilterResponse active(@Nullable Boolean active) {
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

  public FilterResponse externalId(@Nullable String externalId) {
    this.externalId = externalId;
    return this;
  }

  /**
   * Get externalId
   * @return externalId
   */
  
  @Schema(name = "externalId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("externalId")
  public @Nullable String getExternalId() {
    return externalId;
  }

  public void setExternalId(@Nullable String externalId) {
    this.externalId = externalId;
  }

  public FilterResponse externalType(@Nullable String externalType) {
    this.externalType = externalType;
    return this;
  }

  /**
   * Get externalType
   * @return externalType
   */
  
  @Schema(name = "externalType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("externalType")
  public @Nullable String getExternalType() {
    return externalType;
  }

  public void setExternalType(@Nullable String externalType) {
    this.externalType = externalType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FilterResponse filterResponse = (FilterResponse) o;
    return Objects.equals(this.filterId, filterResponse.filterId) &&
        Objects.equals(this.name, filterResponse.name) &&
        Objects.equals(this.display, filterResponse.display) &&
        Objects.equals(this.subFilterCount, filterResponse.subFilterCount) &&
        Objects.equals(this.parentId, filterResponse.parentId) &&
        Objects.equals(this.description, filterResponse.description) &&
        Objects.equals(this.active, filterResponse.active) &&
        Objects.equals(this.externalId, filterResponse.externalId) &&
        Objects.equals(this.externalType, filterResponse.externalType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filterId, name, display, subFilterCount, parentId, description, active, externalId, externalType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FilterResponse {\n");
    sb.append("    filterId: ").append(toIndentedString(filterId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    display: ").append(toIndentedString(display)).append("\n");
    sb.append("    subFilterCount: ").append(toIndentedString(subFilterCount)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    externalType: ").append(toIndentedString(externalType)).append("\n");
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


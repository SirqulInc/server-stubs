package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.AccountShortResponse;
import org.openapitools.model.AssignmentStatusResponse;
import org.openapitools.model.RetailerLocationShortResponse;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AssignmentResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-11T19:32:41.765375324Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class AssignmentResponse {

  private @Nullable Long assignmentId;

  private @Nullable String name;

  private @Nullable String description;

  private @Nullable Boolean active;

  private @Nullable Long created;

  private @Nullable Long updated;

  private @Nullable AccountShortResponse assignee;

  private @Nullable AccountShortResponse creator;

  private @Nullable AccountShortResponse lastReportedBy;

  private @Nullable RetailerLocationShortResponse location;

  private @Nullable AssignmentStatusResponse currentStatus;

  /**
   * Gets or Sets currentStatusType
   */
  public enum CurrentStatusTypeEnum {
    NEW("NEW"),
    
    IN_PROGRESS("IN_PROGRESS"),
    
    SUBSCRIBED("SUBSCRIBED"),
    
    ARCHIVED("ARCHIVED");

    private final String value;

    CurrentStatusTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CurrentStatusTypeEnum fromValue(String value) {
      for (CurrentStatusTypeEnum b : CurrentStatusTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable CurrentStatusTypeEnum currentStatusType;

  public AssignmentResponse assignmentId(@Nullable Long assignmentId) {
    this.assignmentId = assignmentId;
    return this;
  }

  /**
   * Get assignmentId
   * @return assignmentId
   */
  
  @Schema(name = "assignmentId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("assignmentId")
  public @Nullable Long getAssignmentId() {
    return assignmentId;
  }

  public void setAssignmentId(@Nullable Long assignmentId) {
    this.assignmentId = assignmentId;
  }

  public AssignmentResponse name(@Nullable String name) {
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

  public AssignmentResponse description(@Nullable String description) {
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

  public AssignmentResponse active(@Nullable Boolean active) {
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

  public AssignmentResponse created(@Nullable Long created) {
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

  public AssignmentResponse updated(@Nullable Long updated) {
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

  public AssignmentResponse assignee(@Nullable AccountShortResponse assignee) {
    this.assignee = assignee;
    return this;
  }

  /**
   * Get assignee
   * @return assignee
   */
  @Valid 
  @Schema(name = "assignee", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("assignee")
  public @Nullable AccountShortResponse getAssignee() {
    return assignee;
  }

  public void setAssignee(@Nullable AccountShortResponse assignee) {
    this.assignee = assignee;
  }

  public AssignmentResponse creator(@Nullable AccountShortResponse creator) {
    this.creator = creator;
    return this;
  }

  /**
   * Get creator
   * @return creator
   */
  @Valid 
  @Schema(name = "creator", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("creator")
  public @Nullable AccountShortResponse getCreator() {
    return creator;
  }

  public void setCreator(@Nullable AccountShortResponse creator) {
    this.creator = creator;
  }

  public AssignmentResponse lastReportedBy(@Nullable AccountShortResponse lastReportedBy) {
    this.lastReportedBy = lastReportedBy;
    return this;
  }

  /**
   * Get lastReportedBy
   * @return lastReportedBy
   */
  @Valid 
  @Schema(name = "lastReportedBy", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lastReportedBy")
  public @Nullable AccountShortResponse getLastReportedBy() {
    return lastReportedBy;
  }

  public void setLastReportedBy(@Nullable AccountShortResponse lastReportedBy) {
    this.lastReportedBy = lastReportedBy;
  }

  public AssignmentResponse location(@Nullable RetailerLocationShortResponse location) {
    this.location = location;
    return this;
  }

  /**
   * Get location
   * @return location
   */
  @Valid 
  @Schema(name = "location", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("location")
  public @Nullable RetailerLocationShortResponse getLocation() {
    return location;
  }

  public void setLocation(@Nullable RetailerLocationShortResponse location) {
    this.location = location;
  }

  public AssignmentResponse currentStatus(@Nullable AssignmentStatusResponse currentStatus) {
    this.currentStatus = currentStatus;
    return this;
  }

  /**
   * Get currentStatus
   * @return currentStatus
   */
  @Valid 
  @Schema(name = "currentStatus", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("currentStatus")
  public @Nullable AssignmentStatusResponse getCurrentStatus() {
    return currentStatus;
  }

  public void setCurrentStatus(@Nullable AssignmentStatusResponse currentStatus) {
    this.currentStatus = currentStatus;
  }

  public AssignmentResponse currentStatusType(@Nullable CurrentStatusTypeEnum currentStatusType) {
    this.currentStatusType = currentStatusType;
    return this;
  }

  /**
   * Get currentStatusType
   * @return currentStatusType
   */
  
  @Schema(name = "currentStatusType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("currentStatusType")
  public @Nullable CurrentStatusTypeEnum getCurrentStatusType() {
    return currentStatusType;
  }

  public void setCurrentStatusType(@Nullable CurrentStatusTypeEnum currentStatusType) {
    this.currentStatusType = currentStatusType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssignmentResponse assignmentResponse = (AssignmentResponse) o;
    return Objects.equals(this.assignmentId, assignmentResponse.assignmentId) &&
        Objects.equals(this.name, assignmentResponse.name) &&
        Objects.equals(this.description, assignmentResponse.description) &&
        Objects.equals(this.active, assignmentResponse.active) &&
        Objects.equals(this.created, assignmentResponse.created) &&
        Objects.equals(this.updated, assignmentResponse.updated) &&
        Objects.equals(this.assignee, assignmentResponse.assignee) &&
        Objects.equals(this.creator, assignmentResponse.creator) &&
        Objects.equals(this.lastReportedBy, assignmentResponse.lastReportedBy) &&
        Objects.equals(this.location, assignmentResponse.location) &&
        Objects.equals(this.currentStatus, assignmentResponse.currentStatus) &&
        Objects.equals(this.currentStatusType, assignmentResponse.currentStatusType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assignmentId, name, description, active, created, updated, assignee, creator, lastReportedBy, location, currentStatus, currentStatusType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssignmentResponse {\n");
    sb.append("    assignmentId: ").append(toIndentedString(assignmentId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    assignee: ").append(toIndentedString(assignee)).append("\n");
    sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
    sb.append("    lastReportedBy: ").append(toIndentedString(lastReportedBy)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    currentStatus: ").append(toIndentedString(currentStatus)).append("\n");
    sb.append("    currentStatusType: ").append(toIndentedString(currentStatusType)).append("\n");
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


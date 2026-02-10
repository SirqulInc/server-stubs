package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.AccountShortResponse;
import org.openapitools.model.AssignmentStatusResponse;
import org.openapitools.model.RetailerLocationShortResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AssignmentResponse  {
  
  @ApiModelProperty(value = "")

  private Long assignmentId;

  @ApiModelProperty(value = "")

  private String name;

  @ApiModelProperty(value = "")

  private String description;

  @ApiModelProperty(value = "")

  private Boolean active;

  @ApiModelProperty(value = "")

  private Long created;

  @ApiModelProperty(value = "")

  private Long updated;

  @ApiModelProperty(value = "")

  @Valid

  private AccountShortResponse assignee;

  @ApiModelProperty(value = "")

  @Valid

  private AccountShortResponse creator;

  @ApiModelProperty(value = "")

  @Valid

  private AccountShortResponse lastReportedBy;

  @ApiModelProperty(value = "")

  @Valid

  private RetailerLocationShortResponse location;

  @ApiModelProperty(value = "")

  @Valid

  private AssignmentStatusResponse currentStatus;

public enum CurrentStatusTypeEnum {

NEW(String.valueOf("NEW")), IN_PROGRESS(String.valueOf("IN_PROGRESS")), SUBSCRIBED(String.valueOf("SUBSCRIBED")), ARCHIVED(String.valueOf("ARCHIVED"));


    private String value;

    CurrentStatusTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
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

  @ApiModelProperty(value = "")

  private CurrentStatusTypeEnum currentStatusType;
 /**
   * Get assignmentId
   * @return assignmentId
  **/
  @JsonProperty("assignmentId")
  public Long getAssignmentId() {
    return assignmentId;
  }

  public void setAssignmentId(Long assignmentId) {
    this.assignmentId = assignmentId;
  }

  public AssignmentResponse assignmentId(Long assignmentId) {
    this.assignmentId = assignmentId;
    return this;
  }

 /**
   * Get name
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AssignmentResponse name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get description
   * @return description
  **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public AssignmentResponse description(String description) {
    this.description = description;
    return this;
  }

 /**
   * Get active
   * @return active
  **/
  @JsonProperty("active")
  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public AssignmentResponse active(Boolean active) {
    this.active = active;
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

  public AssignmentResponse created(Long created) {
    this.created = created;
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

  public AssignmentResponse updated(Long updated) {
    this.updated = updated;
    return this;
  }

 /**
   * Get assignee
   * @return assignee
  **/
  @JsonProperty("assignee")
  public AccountShortResponse getAssignee() {
    return assignee;
  }

  public void setAssignee(AccountShortResponse assignee) {
    this.assignee = assignee;
  }

  public AssignmentResponse assignee(AccountShortResponse assignee) {
    this.assignee = assignee;
    return this;
  }

 /**
   * Get creator
   * @return creator
  **/
  @JsonProperty("creator")
  public AccountShortResponse getCreator() {
    return creator;
  }

  public void setCreator(AccountShortResponse creator) {
    this.creator = creator;
  }

  public AssignmentResponse creator(AccountShortResponse creator) {
    this.creator = creator;
    return this;
  }

 /**
   * Get lastReportedBy
   * @return lastReportedBy
  **/
  @JsonProperty("lastReportedBy")
  public AccountShortResponse getLastReportedBy() {
    return lastReportedBy;
  }

  public void setLastReportedBy(AccountShortResponse lastReportedBy) {
    this.lastReportedBy = lastReportedBy;
  }

  public AssignmentResponse lastReportedBy(AccountShortResponse lastReportedBy) {
    this.lastReportedBy = lastReportedBy;
    return this;
  }

 /**
   * Get location
   * @return location
  **/
  @JsonProperty("location")
  public RetailerLocationShortResponse getLocation() {
    return location;
  }

  public void setLocation(RetailerLocationShortResponse location) {
    this.location = location;
  }

  public AssignmentResponse location(RetailerLocationShortResponse location) {
    this.location = location;
    return this;
  }

 /**
   * Get currentStatus
   * @return currentStatus
  **/
  @JsonProperty("currentStatus")
  public AssignmentStatusResponse getCurrentStatus() {
    return currentStatus;
  }

  public void setCurrentStatus(AssignmentStatusResponse currentStatus) {
    this.currentStatus = currentStatus;
  }

  public AssignmentResponse currentStatus(AssignmentStatusResponse currentStatus) {
    this.currentStatus = currentStatus;
    return this;
  }

 /**
   * Get currentStatusType
   * @return currentStatusType
  **/
  @JsonProperty("currentStatusType")
  public String getCurrentStatusType() {
    if (currentStatusType == null) {
      return null;
    }
    return currentStatusType.value();
  }

  public void setCurrentStatusType(CurrentStatusTypeEnum currentStatusType) {
    this.currentStatusType = currentStatusType;
  }

  public AssignmentResponse currentStatusType(CurrentStatusTypeEnum currentStatusType) {
    this.currentStatusType = currentStatusType;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


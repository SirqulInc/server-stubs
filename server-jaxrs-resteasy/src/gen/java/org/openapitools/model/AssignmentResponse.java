package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AccountShortResponse;
import org.openapitools.model.AssignmentStatusResponse;
import org.openapitools.model.RetailerLocationShortResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class AssignmentResponse   {
  
  private Long assignmentId;
  private String name;
  private String description;
  private Boolean active;
  private Long created;
  private Long updated;
  private AccountShortResponse assignee;
  private AccountShortResponse creator;
  private AccountShortResponse lastReportedBy;
  private RetailerLocationShortResponse location;
  private AssignmentStatusResponse currentStatus;

  /**
   * Gets or Sets currentStatusType
   */
  public enum CurrentStatusTypeEnum {
    NEW("NEW"),

        IN_PROGRESS("IN_PROGRESS"),

        SUBSCRIBED("SUBSCRIBED"),

        ARCHIVED("ARCHIVED");
    private String value;

    CurrentStatusTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private CurrentStatusTypeEnum currentStatusType;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("assignmentId")
  public Long getAssignmentId() {
    return assignmentId;
  }
  public void setAssignmentId(Long assignmentId) {
    this.assignmentId = assignmentId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("active")
  public Boolean getActive() {
    return active;
  }
  public void setActive(Boolean active) {
    this.active = active;
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
  @JsonProperty("assignee")
  @Valid
  public AccountShortResponse getAssignee() {
    return assignee;
  }
  public void setAssignee(AccountShortResponse assignee) {
    this.assignee = assignee;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("creator")
  @Valid
  public AccountShortResponse getCreator() {
    return creator;
  }
  public void setCreator(AccountShortResponse creator) {
    this.creator = creator;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("lastReportedBy")
  @Valid
  public AccountShortResponse getLastReportedBy() {
    return lastReportedBy;
  }
  public void setLastReportedBy(AccountShortResponse lastReportedBy) {
    this.lastReportedBy = lastReportedBy;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("location")
  @Valid
  public RetailerLocationShortResponse getLocation() {
    return location;
  }
  public void setLocation(RetailerLocationShortResponse location) {
    this.location = location;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("currentStatus")
  @Valid
  public AssignmentStatusResponse getCurrentStatus() {
    return currentStatus;
  }
  public void setCurrentStatus(AssignmentStatusResponse currentStatus) {
    this.currentStatus = currentStatus;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("currentStatusType")
  public CurrentStatusTypeEnum getCurrentStatusType() {
    return currentStatusType;
  }
  public void setCurrentStatusType(CurrentStatusTypeEnum currentStatusType) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


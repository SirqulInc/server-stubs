package apimodels;

import apimodels.AccountShortResponse;
import apimodels.AssignmentStatusResponse;
import apimodels.RetailerLocationShortResponse;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * AssignmentResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class AssignmentResponse   {
  @JsonProperty("assignmentId")
  
  private Long assignmentId;

  @JsonProperty("name")
  
  private String name;

  @JsonProperty("description")
  
  private String description;

  @JsonProperty("active")
  
  private Boolean active;

  @JsonProperty("created")
  
  private Long created;

  @JsonProperty("updated")
  
  private Long updated;

  @JsonProperty("assignee")
  @Valid

  private AccountShortResponse assignee;

  @JsonProperty("creator")
  @Valid

  private AccountShortResponse creator;

  @JsonProperty("lastReportedBy")
  @Valid

  private AccountShortResponse lastReportedBy;

  @JsonProperty("location")
  @Valid

  private RetailerLocationShortResponse location;

  @JsonProperty("currentStatus")
  @Valid

  private AssignmentStatusResponse currentStatus;

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

  @JsonProperty("currentStatusType")
  
  private CurrentStatusTypeEnum currentStatusType;

  public AssignmentResponse assignmentId(Long assignmentId) {
    this.assignmentId = assignmentId;
    return this;
  }

   /**
   * Get assignmentId
   * @return assignmentId
  **/
  public Long getAssignmentId() {
    return assignmentId;
  }

  public void setAssignmentId(Long assignmentId) {
    this.assignmentId = assignmentId;
  }

  public AssignmentResponse name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AssignmentResponse description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public AssignmentResponse active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public AssignmentResponse created(Long created) {
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

  public AssignmentResponse updated(Long updated) {
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

  public AssignmentResponse assignee(AccountShortResponse assignee) {
    this.assignee = assignee;
    return this;
  }

   /**
   * Get assignee
   * @return assignee
  **/
  public AccountShortResponse getAssignee() {
    return assignee;
  }

  public void setAssignee(AccountShortResponse assignee) {
    this.assignee = assignee;
  }

  public AssignmentResponse creator(AccountShortResponse creator) {
    this.creator = creator;
    return this;
  }

   /**
   * Get creator
   * @return creator
  **/
  public AccountShortResponse getCreator() {
    return creator;
  }

  public void setCreator(AccountShortResponse creator) {
    this.creator = creator;
  }

  public AssignmentResponse lastReportedBy(AccountShortResponse lastReportedBy) {
    this.lastReportedBy = lastReportedBy;
    return this;
  }

   /**
   * Get lastReportedBy
   * @return lastReportedBy
  **/
  public AccountShortResponse getLastReportedBy() {
    return lastReportedBy;
  }

  public void setLastReportedBy(AccountShortResponse lastReportedBy) {
    this.lastReportedBy = lastReportedBy;
  }

  public AssignmentResponse location(RetailerLocationShortResponse location) {
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  public RetailerLocationShortResponse getLocation() {
    return location;
  }

  public void setLocation(RetailerLocationShortResponse location) {
    this.location = location;
  }

  public AssignmentResponse currentStatus(AssignmentStatusResponse currentStatus) {
    this.currentStatus = currentStatus;
    return this;
  }

   /**
   * Get currentStatus
   * @return currentStatus
  **/
  public AssignmentStatusResponse getCurrentStatus() {
    return currentStatus;
  }

  public void setCurrentStatus(AssignmentStatusResponse currentStatus) {
    this.currentStatus = currentStatus;
  }

  public AssignmentResponse currentStatusType(CurrentStatusTypeEnum currentStatusType) {
    this.currentStatusType = currentStatusType;
    return this;
  }

   /**
   * Get currentStatusType
   * @return currentStatusType
  **/
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
    return Objects.equals(assignmentId, assignmentResponse.assignmentId) &&
        Objects.equals(name, assignmentResponse.name) &&
        Objects.equals(description, assignmentResponse.description) &&
        Objects.equals(active, assignmentResponse.active) &&
        Objects.equals(created, assignmentResponse.created) &&
        Objects.equals(updated, assignmentResponse.updated) &&
        Objects.equals(assignee, assignmentResponse.assignee) &&
        Objects.equals(creator, assignmentResponse.creator) &&
        Objects.equals(lastReportedBy, assignmentResponse.lastReportedBy) &&
        Objects.equals(location, assignmentResponse.location) &&
        Objects.equals(currentStatus, assignmentResponse.currentStatus) &&
        Objects.equals(currentStatusType, assignmentResponse.currentStatusType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assignmentId, name, description, active, created, updated, assignee, creator, lastReportedBy, location, currentStatus, currentStatusType);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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


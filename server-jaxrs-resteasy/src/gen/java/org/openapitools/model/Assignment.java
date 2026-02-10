package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Account;
import org.openapitools.model.Application;
import org.openapitools.model.Asset;
import org.openapitools.model.AssignmentStatus;
import org.openapitools.model.Note;
import org.openapitools.model.Permissions;
import org.openapitools.model.RetailerLocation;
import org.openapitools.model.UserPermissions;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-09T20:51:23.077809933Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class Assignment   {
  
  private Long id;
  private Boolean active;
  private Boolean valid;
  private String name;
  private String description;
  private Account assignee;
  private RetailerLocation retailerLocation;
  private Account creator;
  private Account lastUpdatedBy;
  private AssignmentStatus currentStatus;

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
  private List<@Valid Asset> assets = new ArrayList<>();
  private List<@Valid Note> notes = new ArrayList<>();
  private Permissions publicPermissions;
  private List<@Valid UserPermissions> userPermissions = new ArrayList<>();

  /**
   * Gets or Sets visibility
   */
  public enum VisibilityEnum {
    PUBLIC("PUBLIC"),

        PRIVATE("PRIVATE"),

        FRIENDS("FRIENDS");
    private String value;

    VisibilityEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private VisibilityEnum visibility;
  private List<@Valid AssignmentStatus> statuses = new ArrayList<>();
  private Application application;

  /**
   * Gets or Sets approvalStatus
   */
  public enum ApprovalStatusEnum {
    PENDING("PENDING"),

        REJECTED("REJECTED"),

        APPROVED("APPROVED"),

        FEATURED("FEATURED");
    private String value;

    ApprovalStatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private ApprovalStatusEnum approvalStatus;
  private String contentName;
  private Asset contentAsset;
  private Account owner;
  private Long noteCount;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
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
  @JsonProperty("valid")
  public Boolean getValid() {
    return valid;
  }
  public void setValid(Boolean valid) {
    this.valid = valid;
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
  @JsonProperty("assignee")
  @Valid
  public Account getAssignee() {
    return assignee;
  }
  public void setAssignee(Account assignee) {
    this.assignee = assignee;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("retailerLocation")
  @Valid
  public RetailerLocation getRetailerLocation() {
    return retailerLocation;
  }
  public void setRetailerLocation(RetailerLocation retailerLocation) {
    this.retailerLocation = retailerLocation;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("creator")
  @Valid
  public Account getCreator() {
    return creator;
  }
  public void setCreator(Account creator) {
    this.creator = creator;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("lastUpdatedBy")
  @Valid
  public Account getLastUpdatedBy() {
    return lastUpdatedBy;
  }
  public void setLastUpdatedBy(Account lastUpdatedBy) {
    this.lastUpdatedBy = lastUpdatedBy;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("currentStatus")
  @Valid
  public AssignmentStatus getCurrentStatus() {
    return currentStatus;
  }
  public void setCurrentStatus(AssignmentStatus currentStatus) {
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

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("assets")
  @Valid
  public List<@Valid Asset> getAssets() {
    return assets;
  }
  public void setAssets(List<@Valid Asset> assets) {
    this.assets = assets;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("notes")
  @Valid
  public List<@Valid Note> getNotes() {
    return notes;
  }
  public void setNotes(List<@Valid Note> notes) {
    this.notes = notes;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("publicPermissions")
  @Valid
  public Permissions getPublicPermissions() {
    return publicPermissions;
  }
  public void setPublicPermissions(Permissions publicPermissions) {
    this.publicPermissions = publicPermissions;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("userPermissions")
  @Valid
  public List<@Valid UserPermissions> getUserPermissions() {
    return userPermissions;
  }
  public void setUserPermissions(List<@Valid UserPermissions> userPermissions) {
    this.userPermissions = userPermissions;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("visibility")
  public VisibilityEnum getVisibility() {
    return visibility;
  }
  public void setVisibility(VisibilityEnum visibility) {
    this.visibility = visibility;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("statuses")
  @Valid
  public List<@Valid AssignmentStatus> getStatuses() {
    return statuses;
  }
  public void setStatuses(List<@Valid AssignmentStatus> statuses) {
    this.statuses = statuses;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("application")
  @Valid
  public Application getApplication() {
    return application;
  }
  public void setApplication(Application application) {
    this.application = application;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("approvalStatus")
  public ApprovalStatusEnum getApprovalStatus() {
    return approvalStatus;
  }
  public void setApprovalStatus(ApprovalStatusEnum approvalStatus) {
    this.approvalStatus = approvalStatus;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("contentName")
  public String getContentName() {
    return contentName;
  }
  public void setContentName(String contentName) {
    this.contentName = contentName;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("contentAsset")
  @Valid
  public Asset getContentAsset() {
    return contentAsset;
  }
  public void setContentAsset(Asset contentAsset) {
    this.contentAsset = contentAsset;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("owner")
  @Valid
  public Account getOwner() {
    return owner;
  }
  public void setOwner(Account owner) {
    this.owner = owner;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("noteCount")
  public Long getNoteCount() {
    return noteCount;
  }
  public void setNoteCount(Long noteCount) {
    this.noteCount = noteCount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Assignment assignment = (Assignment) o;
    return Objects.equals(this.id, assignment.id) &&
        Objects.equals(this.active, assignment.active) &&
        Objects.equals(this.valid, assignment.valid) &&
        Objects.equals(this.name, assignment.name) &&
        Objects.equals(this.description, assignment.description) &&
        Objects.equals(this.assignee, assignment.assignee) &&
        Objects.equals(this.retailerLocation, assignment.retailerLocation) &&
        Objects.equals(this.creator, assignment.creator) &&
        Objects.equals(this.lastUpdatedBy, assignment.lastUpdatedBy) &&
        Objects.equals(this.currentStatus, assignment.currentStatus) &&
        Objects.equals(this.currentStatusType, assignment.currentStatusType) &&
        Objects.equals(this.assets, assignment.assets) &&
        Objects.equals(this.notes, assignment.notes) &&
        Objects.equals(this.publicPermissions, assignment.publicPermissions) &&
        Objects.equals(this.userPermissions, assignment.userPermissions) &&
        Objects.equals(this.visibility, assignment.visibility) &&
        Objects.equals(this.statuses, assignment.statuses) &&
        Objects.equals(this.application, assignment.application) &&
        Objects.equals(this.approvalStatus, assignment.approvalStatus) &&
        Objects.equals(this.contentName, assignment.contentName) &&
        Objects.equals(this.contentAsset, assignment.contentAsset) &&
        Objects.equals(this.owner, assignment.owner) &&
        Objects.equals(this.noteCount, assignment.noteCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, active, valid, name, description, assignee, retailerLocation, creator, lastUpdatedBy, currentStatus, currentStatusType, assets, notes, publicPermissions, userPermissions, visibility, statuses, application, approvalStatus, contentName, contentAsset, owner, noteCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Assignment {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    assignee: ").append(toIndentedString(assignee)).append("\n");
    sb.append("    retailerLocation: ").append(toIndentedString(retailerLocation)).append("\n");
    sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
    sb.append("    lastUpdatedBy: ").append(toIndentedString(lastUpdatedBy)).append("\n");
    sb.append("    currentStatus: ").append(toIndentedString(currentStatus)).append("\n");
    sb.append("    currentStatusType: ").append(toIndentedString(currentStatusType)).append("\n");
    sb.append("    assets: ").append(toIndentedString(assets)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    publicPermissions: ").append(toIndentedString(publicPermissions)).append("\n");
    sb.append("    userPermissions: ").append(toIndentedString(userPermissions)).append("\n");
    sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
    sb.append("    statuses: ").append(toIndentedString(statuses)).append("\n");
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
    sb.append("    approvalStatus: ").append(toIndentedString(approvalStatus)).append("\n");
    sb.append("    contentName: ").append(toIndentedString(contentName)).append("\n");
    sb.append("    contentAsset: ").append(toIndentedString(contentAsset)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    noteCount: ").append(toIndentedString(noteCount)).append("\n");
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


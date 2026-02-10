package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
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

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Assignment  {
  
  @ApiModelProperty(value = "")

  private Long id;

  @ApiModelProperty(value = "")

  private Boolean active;

  @ApiModelProperty(value = "")

  private Boolean valid;

  @ApiModelProperty(value = "")

  private String name;

  @ApiModelProperty(value = "")

  private String description;

  @ApiModelProperty(value = "")

  @Valid

  private Account assignee;

  @ApiModelProperty(value = "")

  @Valid

  private RetailerLocation retailerLocation;

  @ApiModelProperty(value = "")

  @Valid

  private Account creator;

  @ApiModelProperty(value = "")

  @Valid

  private Account lastUpdatedBy;

  @ApiModelProperty(value = "")

  @Valid

  private AssignmentStatus currentStatus;

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

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid Asset> assets = new ArrayList<>();

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid Note> notes = new ArrayList<>();

  @ApiModelProperty(value = "")

  @Valid

  private Permissions publicPermissions;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid UserPermissions> userPermissions = new ArrayList<>();

public enum VisibilityEnum {

PUBLIC(String.valueOf("PUBLIC")), PRIVATE(String.valueOf("PRIVATE")), FRIENDS(String.valueOf("FRIENDS"));


    private String value;

    VisibilityEnum (String v) {
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
    public static VisibilityEnum fromValue(String value) {
        for (VisibilityEnum b : VisibilityEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(value = "")

  private VisibilityEnum visibility;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid AssignmentStatus> statuses = new ArrayList<>();

  @ApiModelProperty(value = "")

  @Valid

  private Application application;

public enum ApprovalStatusEnum {

PENDING(String.valueOf("PENDING")), REJECTED(String.valueOf("REJECTED")), APPROVED(String.valueOf("APPROVED")), FEATURED(String.valueOf("FEATURED"));


    private String value;

    ApprovalStatusEnum (String v) {
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
    public static ApprovalStatusEnum fromValue(String value) {
        for (ApprovalStatusEnum b : ApprovalStatusEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(value = "")

  private ApprovalStatusEnum approvalStatus;

  @ApiModelProperty(value = "")

  private String contentName;

  @ApiModelProperty(value = "")

  @Valid

  private Asset contentAsset;

  @ApiModelProperty(value = "")

  @Valid

  private Account owner;

  @ApiModelProperty(value = "")

  private Long noteCount;
 /**
   * Get id
   * @return id
  **/
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Assignment id(Long id) {
    this.id = id;
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

  public Assignment active(Boolean active) {
    this.active = active;
    return this;
  }

 /**
   * Get valid
   * @return valid
  **/
  @JsonProperty("valid")
  public Boolean getValid() {
    return valid;
  }

  public void setValid(Boolean valid) {
    this.valid = valid;
  }

  public Assignment valid(Boolean valid) {
    this.valid = valid;
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

  public Assignment name(String name) {
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

  public Assignment description(String description) {
    this.description = description;
    return this;
  }

 /**
   * Get assignee
   * @return assignee
  **/
  @JsonProperty("assignee")
  public Account getAssignee() {
    return assignee;
  }

  public void setAssignee(Account assignee) {
    this.assignee = assignee;
  }

  public Assignment assignee(Account assignee) {
    this.assignee = assignee;
    return this;
  }

 /**
   * Get retailerLocation
   * @return retailerLocation
  **/
  @JsonProperty("retailerLocation")
  public RetailerLocation getRetailerLocation() {
    return retailerLocation;
  }

  public void setRetailerLocation(RetailerLocation retailerLocation) {
    this.retailerLocation = retailerLocation;
  }

  public Assignment retailerLocation(RetailerLocation retailerLocation) {
    this.retailerLocation = retailerLocation;
    return this;
  }

 /**
   * Get creator
   * @return creator
  **/
  @JsonProperty("creator")
  public Account getCreator() {
    return creator;
  }

  public void setCreator(Account creator) {
    this.creator = creator;
  }

  public Assignment creator(Account creator) {
    this.creator = creator;
    return this;
  }

 /**
   * Get lastUpdatedBy
   * @return lastUpdatedBy
  **/
  @JsonProperty("lastUpdatedBy")
  public Account getLastUpdatedBy() {
    return lastUpdatedBy;
  }

  public void setLastUpdatedBy(Account lastUpdatedBy) {
    this.lastUpdatedBy = lastUpdatedBy;
  }

  public Assignment lastUpdatedBy(Account lastUpdatedBy) {
    this.lastUpdatedBy = lastUpdatedBy;
    return this;
  }

 /**
   * Get currentStatus
   * @return currentStatus
  **/
  @JsonProperty("currentStatus")
  public AssignmentStatus getCurrentStatus() {
    return currentStatus;
  }

  public void setCurrentStatus(AssignmentStatus currentStatus) {
    this.currentStatus = currentStatus;
  }

  public Assignment currentStatus(AssignmentStatus currentStatus) {
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

  public Assignment currentStatusType(CurrentStatusTypeEnum currentStatusType) {
    this.currentStatusType = currentStatusType;
    return this;
  }

 /**
   * Get assets
   * @return assets
  **/
  @JsonProperty("assets")
  public List<@Valid Asset> getAssets() {
    return assets;
  }

  public void setAssets(List<@Valid Asset> assets) {
    this.assets = assets;
  }

  public Assignment assets(List<@Valid Asset> assets) {
    this.assets = assets;
    return this;
  }

  public Assignment addAssetsItem(Asset assetsItem) {
    this.assets.add(assetsItem);
    return this;
  }

 /**
   * Get notes
   * @return notes
  **/
  @JsonProperty("notes")
  public List<@Valid Note> getNotes() {
    return notes;
  }

  public void setNotes(List<@Valid Note> notes) {
    this.notes = notes;
  }

  public Assignment notes(List<@Valid Note> notes) {
    this.notes = notes;
    return this;
  }

  public Assignment addNotesItem(Note notesItem) {
    this.notes.add(notesItem);
    return this;
  }

 /**
   * Get publicPermissions
   * @return publicPermissions
  **/
  @JsonProperty("publicPermissions")
  public Permissions getPublicPermissions() {
    return publicPermissions;
  }

  public void setPublicPermissions(Permissions publicPermissions) {
    this.publicPermissions = publicPermissions;
  }

  public Assignment publicPermissions(Permissions publicPermissions) {
    this.publicPermissions = publicPermissions;
    return this;
  }

 /**
   * Get userPermissions
   * @return userPermissions
  **/
  @JsonProperty("userPermissions")
  public List<@Valid UserPermissions> getUserPermissions() {
    return userPermissions;
  }

  public void setUserPermissions(List<@Valid UserPermissions> userPermissions) {
    this.userPermissions = userPermissions;
  }

  public Assignment userPermissions(List<@Valid UserPermissions> userPermissions) {
    this.userPermissions = userPermissions;
    return this;
  }

  public Assignment addUserPermissionsItem(UserPermissions userPermissionsItem) {
    this.userPermissions.add(userPermissionsItem);
    return this;
  }

 /**
   * Get visibility
   * @return visibility
  **/
  @JsonProperty("visibility")
  public String getVisibility() {
    if (visibility == null) {
      return null;
    }
    return visibility.value();
  }

  public void setVisibility(VisibilityEnum visibility) {
    this.visibility = visibility;
  }

  public Assignment visibility(VisibilityEnum visibility) {
    this.visibility = visibility;
    return this;
  }

 /**
   * Get statuses
   * @return statuses
  **/
  @JsonProperty("statuses")
  public List<@Valid AssignmentStatus> getStatuses() {
    return statuses;
  }

  public void setStatuses(List<@Valid AssignmentStatus> statuses) {
    this.statuses = statuses;
  }

  public Assignment statuses(List<@Valid AssignmentStatus> statuses) {
    this.statuses = statuses;
    return this;
  }

  public Assignment addStatusesItem(AssignmentStatus statusesItem) {
    this.statuses.add(statusesItem);
    return this;
  }

 /**
   * Get application
   * @return application
  **/
  @JsonProperty("application")
  public Application getApplication() {
    return application;
  }

  public void setApplication(Application application) {
    this.application = application;
  }

  public Assignment application(Application application) {
    this.application = application;
    return this;
  }

 /**
   * Get approvalStatus
   * @return approvalStatus
  **/
  @JsonProperty("approvalStatus")
  public String getApprovalStatus() {
    if (approvalStatus == null) {
      return null;
    }
    return approvalStatus.value();
  }

  public void setApprovalStatus(ApprovalStatusEnum approvalStatus) {
    this.approvalStatus = approvalStatus;
  }

  public Assignment approvalStatus(ApprovalStatusEnum approvalStatus) {
    this.approvalStatus = approvalStatus;
    return this;
  }

 /**
   * Get contentName
   * @return contentName
  **/
  @JsonProperty("contentName")
  public String getContentName() {
    return contentName;
  }

  public void setContentName(String contentName) {
    this.contentName = contentName;
  }

  public Assignment contentName(String contentName) {
    this.contentName = contentName;
    return this;
  }

 /**
   * Get contentAsset
   * @return contentAsset
  **/
  @JsonProperty("contentAsset")
  public Asset getContentAsset() {
    return contentAsset;
  }

  public void setContentAsset(Asset contentAsset) {
    this.contentAsset = contentAsset;
  }

  public Assignment contentAsset(Asset contentAsset) {
    this.contentAsset = contentAsset;
    return this;
  }

 /**
   * Get owner
   * @return owner
  **/
  @JsonProperty("owner")
  public Account getOwner() {
    return owner;
  }

  public void setOwner(Account owner) {
    this.owner = owner;
  }

  public Assignment owner(Account owner) {
    this.owner = owner;
    return this;
  }

 /**
   * Get noteCount
   * @return noteCount
  **/
  @JsonProperty("noteCount")
  public Long getNoteCount() {
    return noteCount;
  }

  public void setNoteCount(Long noteCount) {
    this.noteCount = noteCount;
  }

  public Assignment noteCount(Long noteCount) {
    this.noteCount = noteCount;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


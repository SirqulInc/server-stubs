package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
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
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Assignment
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-09T20:58:37.853899731Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class Assignment {

  private @Nullable Long id;

  private @Nullable Boolean active;

  private @Nullable Boolean valid;

  private @Nullable String name;

  private @Nullable String description;

  private @Nullable Account assignee;

  private @Nullable RetailerLocation retailerLocation;

  private @Nullable Account creator;

  private @Nullable Account lastUpdatedBy;

  private @Nullable AssignmentStatus currentStatus;

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

  @Valid
  private List<@Valid Asset> assets = new ArrayList<>();

  @Valid
  private List<@Valid Note> notes = new ArrayList<>();

  private @Nullable Permissions publicPermissions;

  @Valid
  private List<@Valid UserPermissions> userPermissions = new ArrayList<>();

  /**
   * Gets or Sets visibility
   */
  public enum VisibilityEnum {
    PUBLIC("PUBLIC"),
    
    PRIVATE("PRIVATE"),
    
    FRIENDS("FRIENDS");

    private final String value;

    VisibilityEnum(String value) {
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
    public static VisibilityEnum fromValue(String value) {
      for (VisibilityEnum b : VisibilityEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable VisibilityEnum visibility;

  @Valid
  private List<@Valid AssignmentStatus> statuses = new ArrayList<>();

  private @Nullable Application application;

  /**
   * Gets or Sets approvalStatus
   */
  public enum ApprovalStatusEnum {
    PENDING("PENDING"),
    
    REJECTED("REJECTED"),
    
    APPROVED("APPROVED"),
    
    FEATURED("FEATURED");

    private final String value;

    ApprovalStatusEnum(String value) {
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
    public static ApprovalStatusEnum fromValue(String value) {
      for (ApprovalStatusEnum b : ApprovalStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable ApprovalStatusEnum approvalStatus;

  private @Nullable String contentName;

  private @Nullable Asset contentAsset;

  private @Nullable Account owner;

  private @Nullable Long noteCount;

  public Assignment id(@Nullable Long id) {
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

  public Assignment active(@Nullable Boolean active) {
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

  public Assignment valid(@Nullable Boolean valid) {
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

  public Assignment name(@Nullable String name) {
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

  public Assignment description(@Nullable String description) {
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

  public Assignment assignee(@Nullable Account assignee) {
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
  public @Nullable Account getAssignee() {
    return assignee;
  }

  public void setAssignee(@Nullable Account assignee) {
    this.assignee = assignee;
  }

  public Assignment retailerLocation(@Nullable RetailerLocation retailerLocation) {
    this.retailerLocation = retailerLocation;
    return this;
  }

  /**
   * Get retailerLocation
   * @return retailerLocation
   */
  @Valid 
  @Schema(name = "retailerLocation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("retailerLocation")
  public @Nullable RetailerLocation getRetailerLocation() {
    return retailerLocation;
  }

  public void setRetailerLocation(@Nullable RetailerLocation retailerLocation) {
    this.retailerLocation = retailerLocation;
  }

  public Assignment creator(@Nullable Account creator) {
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
  public @Nullable Account getCreator() {
    return creator;
  }

  public void setCreator(@Nullable Account creator) {
    this.creator = creator;
  }

  public Assignment lastUpdatedBy(@Nullable Account lastUpdatedBy) {
    this.lastUpdatedBy = lastUpdatedBy;
    return this;
  }

  /**
   * Get lastUpdatedBy
   * @return lastUpdatedBy
   */
  @Valid 
  @Schema(name = "lastUpdatedBy", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lastUpdatedBy")
  public @Nullable Account getLastUpdatedBy() {
    return lastUpdatedBy;
  }

  public void setLastUpdatedBy(@Nullable Account lastUpdatedBy) {
    this.lastUpdatedBy = lastUpdatedBy;
  }

  public Assignment currentStatus(@Nullable AssignmentStatus currentStatus) {
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
  public @Nullable AssignmentStatus getCurrentStatus() {
    return currentStatus;
  }

  public void setCurrentStatus(@Nullable AssignmentStatus currentStatus) {
    this.currentStatus = currentStatus;
  }

  public Assignment currentStatusType(@Nullable CurrentStatusTypeEnum currentStatusType) {
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

  public Assignment assets(List<@Valid Asset> assets) {
    this.assets = assets;
    return this;
  }

  public Assignment addAssetsItem(Asset assetsItem) {
    if (this.assets == null) {
      this.assets = new ArrayList<>();
    }
    this.assets.add(assetsItem);
    return this;
  }

  /**
   * Get assets
   * @return assets
   */
  @Valid 
  @Schema(name = "assets", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("assets")
  public List<@Valid Asset> getAssets() {
    return assets;
  }

  public void setAssets(List<@Valid Asset> assets) {
    this.assets = assets;
  }

  public Assignment notes(List<@Valid Note> notes) {
    this.notes = notes;
    return this;
  }

  public Assignment addNotesItem(Note notesItem) {
    if (this.notes == null) {
      this.notes = new ArrayList<>();
    }
    this.notes.add(notesItem);
    return this;
  }

  /**
   * Get notes
   * @return notes
   */
  @Valid 
  @Schema(name = "notes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("notes")
  public List<@Valid Note> getNotes() {
    return notes;
  }

  public void setNotes(List<@Valid Note> notes) {
    this.notes = notes;
  }

  public Assignment publicPermissions(@Nullable Permissions publicPermissions) {
    this.publicPermissions = publicPermissions;
    return this;
  }

  /**
   * Get publicPermissions
   * @return publicPermissions
   */
  @Valid 
  @Schema(name = "publicPermissions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("publicPermissions")
  public @Nullable Permissions getPublicPermissions() {
    return publicPermissions;
  }

  public void setPublicPermissions(@Nullable Permissions publicPermissions) {
    this.publicPermissions = publicPermissions;
  }

  public Assignment userPermissions(List<@Valid UserPermissions> userPermissions) {
    this.userPermissions = userPermissions;
    return this;
  }

  public Assignment addUserPermissionsItem(UserPermissions userPermissionsItem) {
    if (this.userPermissions == null) {
      this.userPermissions = new ArrayList<>();
    }
    this.userPermissions.add(userPermissionsItem);
    return this;
  }

  /**
   * Get userPermissions
   * @return userPermissions
   */
  @Valid 
  @Schema(name = "userPermissions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("userPermissions")
  public List<@Valid UserPermissions> getUserPermissions() {
    return userPermissions;
  }

  public void setUserPermissions(List<@Valid UserPermissions> userPermissions) {
    this.userPermissions = userPermissions;
  }

  public Assignment visibility(@Nullable VisibilityEnum visibility) {
    this.visibility = visibility;
    return this;
  }

  /**
   * Get visibility
   * @return visibility
   */
  
  @Schema(name = "visibility", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("visibility")
  public @Nullable VisibilityEnum getVisibility() {
    return visibility;
  }

  public void setVisibility(@Nullable VisibilityEnum visibility) {
    this.visibility = visibility;
  }

  public Assignment statuses(List<@Valid AssignmentStatus> statuses) {
    this.statuses = statuses;
    return this;
  }

  public Assignment addStatusesItem(AssignmentStatus statusesItem) {
    if (this.statuses == null) {
      this.statuses = new ArrayList<>();
    }
    this.statuses.add(statusesItem);
    return this;
  }

  /**
   * Get statuses
   * @return statuses
   */
  @Valid 
  @Schema(name = "statuses", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("statuses")
  public List<@Valid AssignmentStatus> getStatuses() {
    return statuses;
  }

  public void setStatuses(List<@Valid AssignmentStatus> statuses) {
    this.statuses = statuses;
  }

  public Assignment application(@Nullable Application application) {
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
  public @Nullable Application getApplication() {
    return application;
  }

  public void setApplication(@Nullable Application application) {
    this.application = application;
  }

  public Assignment approvalStatus(@Nullable ApprovalStatusEnum approvalStatus) {
    this.approvalStatus = approvalStatus;
    return this;
  }

  /**
   * Get approvalStatus
   * @return approvalStatus
   */
  
  @Schema(name = "approvalStatus", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("approvalStatus")
  public @Nullable ApprovalStatusEnum getApprovalStatus() {
    return approvalStatus;
  }

  public void setApprovalStatus(@Nullable ApprovalStatusEnum approvalStatus) {
    this.approvalStatus = approvalStatus;
  }

  public Assignment contentName(@Nullable String contentName) {
    this.contentName = contentName;
    return this;
  }

  /**
   * Get contentName
   * @return contentName
   */
  
  @Schema(name = "contentName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("contentName")
  public @Nullable String getContentName() {
    return contentName;
  }

  public void setContentName(@Nullable String contentName) {
    this.contentName = contentName;
  }

  public Assignment contentAsset(@Nullable Asset contentAsset) {
    this.contentAsset = contentAsset;
    return this;
  }

  /**
   * Get contentAsset
   * @return contentAsset
   */
  @Valid 
  @Schema(name = "contentAsset", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("contentAsset")
  public @Nullable Asset getContentAsset() {
    return contentAsset;
  }

  public void setContentAsset(@Nullable Asset contentAsset) {
    this.contentAsset = contentAsset;
  }

  public Assignment owner(@Nullable Account owner) {
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

  public Assignment noteCount(@Nullable Long noteCount) {
    this.noteCount = noteCount;
    return this;
  }

  /**
   * Get noteCount
   * @return noteCount
   */
  
  @Schema(name = "noteCount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("noteCount")
  public @Nullable Long getNoteCount() {
    return noteCount;
  }

  public void setNoteCount(@Nullable Long noteCount) {
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
  private String toIndentedString(@Nullable Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


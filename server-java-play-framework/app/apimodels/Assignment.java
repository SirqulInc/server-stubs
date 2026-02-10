package apimodels;

import apimodels.Account;
import apimodels.Application;
import apimodels.Asset;
import apimodels.AssignmentStatus;
import apimodels.Note;
import apimodels.Permissions;
import apimodels.RetailerLocation;
import apimodels.UserPermissions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Assignment
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class Assignment   {
  @JsonProperty("id")
  
  private Long id;

  @JsonProperty("active")
  
  private Boolean active;

  @JsonProperty("valid")
  
  private Boolean valid;

  @JsonProperty("name")
  
  private String name;

  @JsonProperty("description")
  
  private String description;

  @JsonProperty("assignee")
  @Valid

  private Account assignee;

  @JsonProperty("retailerLocation")
  @Valid

  private RetailerLocation retailerLocation;

  @JsonProperty("creator")
  @Valid

  private Account creator;

  @JsonProperty("lastUpdatedBy")
  @Valid

  private Account lastUpdatedBy;

  @JsonProperty("currentStatus")
  @Valid

  private AssignmentStatus currentStatus;

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

  @JsonProperty("assets")
  @Valid

  private List<@Valid Asset> assets = null;

  @JsonProperty("notes")
  @Valid

  private List<@Valid Note> notes = null;

  @JsonProperty("publicPermissions")
  @Valid

  private Permissions publicPermissions;

  @JsonProperty("userPermissions")
  @Valid

  private List<@Valid UserPermissions> userPermissions = null;

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

  @JsonProperty("visibility")
  
  private VisibilityEnum visibility;

  @JsonProperty("statuses")
  @Valid

  private List<@Valid AssignmentStatus> statuses = null;

  @JsonProperty("application")
  @Valid

  private Application application;

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

  @JsonProperty("approvalStatus")
  
  private ApprovalStatusEnum approvalStatus;

  @JsonProperty("contentName")
  
  private String contentName;

  @JsonProperty("contentAsset")
  @Valid

  private Asset contentAsset;

  @JsonProperty("owner")
  @Valid

  private Account owner;

  @JsonProperty("noteCount")
  
  private Long noteCount;

  public Assignment id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Assignment active(Boolean active) {
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

  public Assignment valid(Boolean valid) {
    this.valid = valid;
    return this;
  }

   /**
   * Get valid
   * @return valid
  **/
  public Boolean getValid() {
    return valid;
  }

  public void setValid(Boolean valid) {
    this.valid = valid;
  }

  public Assignment name(String name) {
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

  public Assignment description(String description) {
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

  public Assignment assignee(Account assignee) {
    this.assignee = assignee;
    return this;
  }

   /**
   * Get assignee
   * @return assignee
  **/
  public Account getAssignee() {
    return assignee;
  }

  public void setAssignee(Account assignee) {
    this.assignee = assignee;
  }

  public Assignment retailerLocation(RetailerLocation retailerLocation) {
    this.retailerLocation = retailerLocation;
    return this;
  }

   /**
   * Get retailerLocation
   * @return retailerLocation
  **/
  public RetailerLocation getRetailerLocation() {
    return retailerLocation;
  }

  public void setRetailerLocation(RetailerLocation retailerLocation) {
    this.retailerLocation = retailerLocation;
  }

  public Assignment creator(Account creator) {
    this.creator = creator;
    return this;
  }

   /**
   * Get creator
   * @return creator
  **/
  public Account getCreator() {
    return creator;
  }

  public void setCreator(Account creator) {
    this.creator = creator;
  }

  public Assignment lastUpdatedBy(Account lastUpdatedBy) {
    this.lastUpdatedBy = lastUpdatedBy;
    return this;
  }

   /**
   * Get lastUpdatedBy
   * @return lastUpdatedBy
  **/
  public Account getLastUpdatedBy() {
    return lastUpdatedBy;
  }

  public void setLastUpdatedBy(Account lastUpdatedBy) {
    this.lastUpdatedBy = lastUpdatedBy;
  }

  public Assignment currentStatus(AssignmentStatus currentStatus) {
    this.currentStatus = currentStatus;
    return this;
  }

   /**
   * Get currentStatus
   * @return currentStatus
  **/
  public AssignmentStatus getCurrentStatus() {
    return currentStatus;
  }

  public void setCurrentStatus(AssignmentStatus currentStatus) {
    this.currentStatus = currentStatus;
  }

  public Assignment currentStatusType(CurrentStatusTypeEnum currentStatusType) {
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
  **/
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
  **/
  public List<@Valid Note> getNotes() {
    return notes;
  }

  public void setNotes(List<@Valid Note> notes) {
    this.notes = notes;
  }

  public Assignment publicPermissions(Permissions publicPermissions) {
    this.publicPermissions = publicPermissions;
    return this;
  }

   /**
   * Get publicPermissions
   * @return publicPermissions
  **/
  public Permissions getPublicPermissions() {
    return publicPermissions;
  }

  public void setPublicPermissions(Permissions publicPermissions) {
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
  **/
  public List<@Valid UserPermissions> getUserPermissions() {
    return userPermissions;
  }

  public void setUserPermissions(List<@Valid UserPermissions> userPermissions) {
    this.userPermissions = userPermissions;
  }

  public Assignment visibility(VisibilityEnum visibility) {
    this.visibility = visibility;
    return this;
  }

   /**
   * Get visibility
   * @return visibility
  **/
  public VisibilityEnum getVisibility() {
    return visibility;
  }

  public void setVisibility(VisibilityEnum visibility) {
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
  **/
  public List<@Valid AssignmentStatus> getStatuses() {
    return statuses;
  }

  public void setStatuses(List<@Valid AssignmentStatus> statuses) {
    this.statuses = statuses;
  }

  public Assignment application(Application application) {
    this.application = application;
    return this;
  }

   /**
   * Get application
   * @return application
  **/
  public Application getApplication() {
    return application;
  }

  public void setApplication(Application application) {
    this.application = application;
  }

  public Assignment approvalStatus(ApprovalStatusEnum approvalStatus) {
    this.approvalStatus = approvalStatus;
    return this;
  }

   /**
   * Get approvalStatus
   * @return approvalStatus
  **/
  public ApprovalStatusEnum getApprovalStatus() {
    return approvalStatus;
  }

  public void setApprovalStatus(ApprovalStatusEnum approvalStatus) {
    this.approvalStatus = approvalStatus;
  }

  public Assignment contentName(String contentName) {
    this.contentName = contentName;
    return this;
  }

   /**
   * Get contentName
   * @return contentName
  **/
  public String getContentName() {
    return contentName;
  }

  public void setContentName(String contentName) {
    this.contentName = contentName;
  }

  public Assignment contentAsset(Asset contentAsset) {
    this.contentAsset = contentAsset;
    return this;
  }

   /**
   * Get contentAsset
   * @return contentAsset
  **/
  public Asset getContentAsset() {
    return contentAsset;
  }

  public void setContentAsset(Asset contentAsset) {
    this.contentAsset = contentAsset;
  }

  public Assignment owner(Account owner) {
    this.owner = owner;
    return this;
  }

   /**
   * Get owner
   * @return owner
  **/
  public Account getOwner() {
    return owner;
  }

  public void setOwner(Account owner) {
    this.owner = owner;
  }

  public Assignment noteCount(Long noteCount) {
    this.noteCount = noteCount;
    return this;
  }

   /**
   * Get noteCount
   * @return noteCount
  **/
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
    return Objects.equals(id, assignment.id) &&
        Objects.equals(active, assignment.active) &&
        Objects.equals(valid, assignment.valid) &&
        Objects.equals(name, assignment.name) &&
        Objects.equals(description, assignment.description) &&
        Objects.equals(assignee, assignment.assignee) &&
        Objects.equals(retailerLocation, assignment.retailerLocation) &&
        Objects.equals(creator, assignment.creator) &&
        Objects.equals(lastUpdatedBy, assignment.lastUpdatedBy) &&
        Objects.equals(currentStatus, assignment.currentStatus) &&
        Objects.equals(currentStatusType, assignment.currentStatusType) &&
        Objects.equals(assets, assignment.assets) &&
        Objects.equals(notes, assignment.notes) &&
        Objects.equals(publicPermissions, assignment.publicPermissions) &&
        Objects.equals(userPermissions, assignment.userPermissions) &&
        Objects.equals(visibility, assignment.visibility) &&
        Objects.equals(statuses, assignment.statuses) &&
        Objects.equals(application, assignment.application) &&
        Objects.equals(approvalStatus, assignment.approvalStatus) &&
        Objects.equals(contentName, assignment.contentName) &&
        Objects.equals(contentAsset, assignment.contentAsset) &&
        Objects.equals(owner, assignment.owner) &&
        Objects.equals(noteCount, assignment.noteCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, active, valid, name, description, assignee, retailerLocation, creator, lastUpdatedBy, currentStatus, currentStatusType, assets, notes, publicPermissions, userPermissions, visibility, statuses, application, approvalStatus, contentName, contentAsset, owner, noteCount);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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


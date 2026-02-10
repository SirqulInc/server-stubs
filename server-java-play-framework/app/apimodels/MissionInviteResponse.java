package apimodels;

import apimodels.AccountShortResponse;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * MissionInviteResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class MissionInviteResponse   {
  @JsonProperty("id")
  
  private Long id;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    AVAILABLE("AVAILABLE"),
    
    PENDING("PENDING"),
    
    UPDATED("UPDATED"),
    
    ACCEPTED("ACCEPTED"),
    
    ACTIVE("ACTIVE"),
    
    BUY_BACK("BUY_BACK"),
    
    FAILED("FAILED"),
    
    QUIT("QUIT"),
    
    COMPLETED("COMPLETED"),
    
    PENDING_REVIEW("PENDING_REVIEW"),
    
    REJECTED("REJECTED");

    private final String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("status")
  
  private StatusEnum status;

  @JsonProperty("title")
  
  private String title;

  @JsonProperty("description")
  
  private String description;

  @JsonProperty("owner")
  @Valid

  private AccountShortResponse owner;

  @JsonProperty("permissionableId")
  
  private Long permissionableId;

  @JsonProperty("permissionableType")
  
  private String permissionableType;

  @JsonProperty("ranked")
  
  private Boolean ranked;

  @JsonProperty("rewarded")
  
  private Boolean rewarded;

  @JsonProperty("startDate")
  
  private Long startDate;

  @JsonProperty("endDate")
  
  private Long endDate;

  @JsonProperty("updated")
  
  private Long updated;

  @JsonProperty("buyBackAvailable")
  
  private Boolean buyBackAvailable;

  /**
   * Gets or Sets inviteStatus
   */
  public enum InviteStatusEnum {
    AVAILABLE("AVAILABLE"),
    
    PENDING("PENDING"),
    
    UPDATED("UPDATED"),
    
    ACCEPTED("ACCEPTED"),
    
    ACTIVE("ACTIVE"),
    
    BUY_BACK("BUY_BACK"),
    
    FAILED("FAILED"),
    
    QUIT("QUIT"),
    
    COMPLETED("COMPLETED"),
    
    PENDING_REVIEW("PENDING_REVIEW"),
    
    REJECTED("REJECTED");

    private final String value;

    InviteStatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static InviteStatusEnum fromValue(String value) {
      for (InviteStatusEnum b : InviteStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("inviteStatus")
  
  private InviteStatusEnum inviteStatus;

  public MissionInviteResponse id(Long id) {
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

  public MissionInviteResponse status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public MissionInviteResponse title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public MissionInviteResponse description(String description) {
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

  public MissionInviteResponse owner(AccountShortResponse owner) {
    this.owner = owner;
    return this;
  }

   /**
   * Get owner
   * @return owner
  **/
  public AccountShortResponse getOwner() {
    return owner;
  }

  public void setOwner(AccountShortResponse owner) {
    this.owner = owner;
  }

  public MissionInviteResponse permissionableId(Long permissionableId) {
    this.permissionableId = permissionableId;
    return this;
  }

   /**
   * Get permissionableId
   * @return permissionableId
  **/
  public Long getPermissionableId() {
    return permissionableId;
  }

  public void setPermissionableId(Long permissionableId) {
    this.permissionableId = permissionableId;
  }

  public MissionInviteResponse permissionableType(String permissionableType) {
    this.permissionableType = permissionableType;
    return this;
  }

   /**
   * Get permissionableType
   * @return permissionableType
  **/
  public String getPermissionableType() {
    return permissionableType;
  }

  public void setPermissionableType(String permissionableType) {
    this.permissionableType = permissionableType;
  }

  public MissionInviteResponse ranked(Boolean ranked) {
    this.ranked = ranked;
    return this;
  }

   /**
   * Get ranked
   * @return ranked
  **/
  public Boolean getRanked() {
    return ranked;
  }

  public void setRanked(Boolean ranked) {
    this.ranked = ranked;
  }

  public MissionInviteResponse rewarded(Boolean rewarded) {
    this.rewarded = rewarded;
    return this;
  }

   /**
   * Get rewarded
   * @return rewarded
  **/
  public Boolean getRewarded() {
    return rewarded;
  }

  public void setRewarded(Boolean rewarded) {
    this.rewarded = rewarded;
  }

  public MissionInviteResponse startDate(Long startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  public Long getStartDate() {
    return startDate;
  }

  public void setStartDate(Long startDate) {
    this.startDate = startDate;
  }

  public MissionInviteResponse endDate(Long endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * Get endDate
   * @return endDate
  **/
  public Long getEndDate() {
    return endDate;
  }

  public void setEndDate(Long endDate) {
    this.endDate = endDate;
  }

  public MissionInviteResponse updated(Long updated) {
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

  public MissionInviteResponse buyBackAvailable(Boolean buyBackAvailable) {
    this.buyBackAvailable = buyBackAvailable;
    return this;
  }

   /**
   * Get buyBackAvailable
   * @return buyBackAvailable
  **/
  public Boolean getBuyBackAvailable() {
    return buyBackAvailable;
  }

  public void setBuyBackAvailable(Boolean buyBackAvailable) {
    this.buyBackAvailable = buyBackAvailable;
  }

  public MissionInviteResponse inviteStatus(InviteStatusEnum inviteStatus) {
    this.inviteStatus = inviteStatus;
    return this;
  }

   /**
   * Get inviteStatus
   * @return inviteStatus
  **/
  public InviteStatusEnum getInviteStatus() {
    return inviteStatus;
  }

  public void setInviteStatus(InviteStatusEnum inviteStatus) {
    this.inviteStatus = inviteStatus;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MissionInviteResponse missionInviteResponse = (MissionInviteResponse) o;
    return Objects.equals(id, missionInviteResponse.id) &&
        Objects.equals(status, missionInviteResponse.status) &&
        Objects.equals(title, missionInviteResponse.title) &&
        Objects.equals(description, missionInviteResponse.description) &&
        Objects.equals(owner, missionInviteResponse.owner) &&
        Objects.equals(permissionableId, missionInviteResponse.permissionableId) &&
        Objects.equals(permissionableType, missionInviteResponse.permissionableType) &&
        Objects.equals(ranked, missionInviteResponse.ranked) &&
        Objects.equals(rewarded, missionInviteResponse.rewarded) &&
        Objects.equals(startDate, missionInviteResponse.startDate) &&
        Objects.equals(endDate, missionInviteResponse.endDate) &&
        Objects.equals(updated, missionInviteResponse.updated) &&
        Objects.equals(buyBackAvailable, missionInviteResponse.buyBackAvailable) &&
        Objects.equals(inviteStatus, missionInviteResponse.inviteStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, status, title, description, owner, permissionableId, permissionableType, ranked, rewarded, startDate, endDate, updated, buyBackAvailable, inviteStatus);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MissionInviteResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    permissionableId: ").append(toIndentedString(permissionableId)).append("\n");
    sb.append("    permissionableType: ").append(toIndentedString(permissionableType)).append("\n");
    sb.append("    ranked: ").append(toIndentedString(ranked)).append("\n");
    sb.append("    rewarded: ").append(toIndentedString(rewarded)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    buyBackAvailable: ").append(toIndentedString(buyBackAvailable)).append("\n");
    sb.append("    inviteStatus: ").append(toIndentedString(inviteStatus)).append("\n");
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


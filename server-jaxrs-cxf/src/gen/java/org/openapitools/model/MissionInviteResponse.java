package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.AccountShortResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class MissionInviteResponse  {
  
  @ApiModelProperty(value = "")

  private Long id;

public enum StatusEnum {

AVAILABLE(String.valueOf("AVAILABLE")), PENDING(String.valueOf("PENDING")), UPDATED(String.valueOf("UPDATED")), ACCEPTED(String.valueOf("ACCEPTED")), ACTIVE(String.valueOf("ACTIVE")), BUY_BACK(String.valueOf("BUY_BACK")), FAILED(String.valueOf("FAILED")), QUIT(String.valueOf("QUIT")), COMPLETED(String.valueOf("COMPLETED")), PENDING_REVIEW(String.valueOf("PENDING_REVIEW")), REJECTED(String.valueOf("REJECTED"));


    private String value;

    StatusEnum (String v) {
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
    public static StatusEnum fromValue(String value) {
        for (StatusEnum b : StatusEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(value = "")

  private StatusEnum status;

  @ApiModelProperty(value = "")

  private String title;

  @ApiModelProperty(value = "")

  private String description;

  @ApiModelProperty(value = "")

  @Valid

  private AccountShortResponse owner;

  @ApiModelProperty(value = "")

  private Long permissionableId;

  @ApiModelProperty(value = "")

  private String permissionableType;

  @ApiModelProperty(value = "")

  private Boolean ranked;

  @ApiModelProperty(value = "")

  private Boolean rewarded;

  @ApiModelProperty(value = "")

  private Long startDate;

  @ApiModelProperty(value = "")

  private Long endDate;

  @ApiModelProperty(value = "")

  private Long updated;

  @ApiModelProperty(value = "")

  private Boolean buyBackAvailable;

public enum InviteStatusEnum {

AVAILABLE(String.valueOf("AVAILABLE")), PENDING(String.valueOf("PENDING")), UPDATED(String.valueOf("UPDATED")), ACCEPTED(String.valueOf("ACCEPTED")), ACTIVE(String.valueOf("ACTIVE")), BUY_BACK(String.valueOf("BUY_BACK")), FAILED(String.valueOf("FAILED")), QUIT(String.valueOf("QUIT")), COMPLETED(String.valueOf("COMPLETED")), PENDING_REVIEW(String.valueOf("PENDING_REVIEW")), REJECTED(String.valueOf("REJECTED"));


    private String value;

    InviteStatusEnum (String v) {
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
    public static InviteStatusEnum fromValue(String value) {
        for (InviteStatusEnum b : InviteStatusEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(value = "")

  private InviteStatusEnum inviteStatus;
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

  public MissionInviteResponse id(Long id) {
    this.id = id;
    return this;
  }

 /**
   * Get status
   * @return status
  **/
  @JsonProperty("status")
  public String getStatus() {
    if (status == null) {
      return null;
    }
    return status.value();
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public MissionInviteResponse status(StatusEnum status) {
    this.status = status;
    return this;
  }

 /**
   * Get title
   * @return title
  **/
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public MissionInviteResponse title(String title) {
    this.title = title;
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

  public MissionInviteResponse description(String description) {
    this.description = description;
    return this;
  }

 /**
   * Get owner
   * @return owner
  **/
  @JsonProperty("owner")
  public AccountShortResponse getOwner() {
    return owner;
  }

  public void setOwner(AccountShortResponse owner) {
    this.owner = owner;
  }

  public MissionInviteResponse owner(AccountShortResponse owner) {
    this.owner = owner;
    return this;
  }

 /**
   * Get permissionableId
   * @return permissionableId
  **/
  @JsonProperty("permissionableId")
  public Long getPermissionableId() {
    return permissionableId;
  }

  public void setPermissionableId(Long permissionableId) {
    this.permissionableId = permissionableId;
  }

  public MissionInviteResponse permissionableId(Long permissionableId) {
    this.permissionableId = permissionableId;
    return this;
  }

 /**
   * Get permissionableType
   * @return permissionableType
  **/
  @JsonProperty("permissionableType")
  public String getPermissionableType() {
    return permissionableType;
  }

  public void setPermissionableType(String permissionableType) {
    this.permissionableType = permissionableType;
  }

  public MissionInviteResponse permissionableType(String permissionableType) {
    this.permissionableType = permissionableType;
    return this;
  }

 /**
   * Get ranked
   * @return ranked
  **/
  @JsonProperty("ranked")
  public Boolean getRanked() {
    return ranked;
  }

  public void setRanked(Boolean ranked) {
    this.ranked = ranked;
  }

  public MissionInviteResponse ranked(Boolean ranked) {
    this.ranked = ranked;
    return this;
  }

 /**
   * Get rewarded
   * @return rewarded
  **/
  @JsonProperty("rewarded")
  public Boolean getRewarded() {
    return rewarded;
  }

  public void setRewarded(Boolean rewarded) {
    this.rewarded = rewarded;
  }

  public MissionInviteResponse rewarded(Boolean rewarded) {
    this.rewarded = rewarded;
    return this;
  }

 /**
   * Get startDate
   * @return startDate
  **/
  @JsonProperty("startDate")
  public Long getStartDate() {
    return startDate;
  }

  public void setStartDate(Long startDate) {
    this.startDate = startDate;
  }

  public MissionInviteResponse startDate(Long startDate) {
    this.startDate = startDate;
    return this;
  }

 /**
   * Get endDate
   * @return endDate
  **/
  @JsonProperty("endDate")
  public Long getEndDate() {
    return endDate;
  }

  public void setEndDate(Long endDate) {
    this.endDate = endDate;
  }

  public MissionInviteResponse endDate(Long endDate) {
    this.endDate = endDate;
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

  public MissionInviteResponse updated(Long updated) {
    this.updated = updated;
    return this;
  }

 /**
   * Get buyBackAvailable
   * @return buyBackAvailable
  **/
  @JsonProperty("buyBackAvailable")
  public Boolean getBuyBackAvailable() {
    return buyBackAvailable;
  }

  public void setBuyBackAvailable(Boolean buyBackAvailable) {
    this.buyBackAvailable = buyBackAvailable;
  }

  public MissionInviteResponse buyBackAvailable(Boolean buyBackAvailable) {
    this.buyBackAvailable = buyBackAvailable;
    return this;
  }

 /**
   * Get inviteStatus
   * @return inviteStatus
  **/
  @JsonProperty("inviteStatus")
  public String getInviteStatus() {
    if (inviteStatus == null) {
      return null;
    }
    return inviteStatus.value();
  }

  public void setInviteStatus(InviteStatusEnum inviteStatus) {
    this.inviteStatus = inviteStatus;
  }

  public MissionInviteResponse inviteStatus(InviteStatusEnum inviteStatus) {
    this.inviteStatus = inviteStatus;
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
    MissionInviteResponse missionInviteResponse = (MissionInviteResponse) o;
    return Objects.equals(this.id, missionInviteResponse.id) &&
        Objects.equals(this.status, missionInviteResponse.status) &&
        Objects.equals(this.title, missionInviteResponse.title) &&
        Objects.equals(this.description, missionInviteResponse.description) &&
        Objects.equals(this.owner, missionInviteResponse.owner) &&
        Objects.equals(this.permissionableId, missionInviteResponse.permissionableId) &&
        Objects.equals(this.permissionableType, missionInviteResponse.permissionableType) &&
        Objects.equals(this.ranked, missionInviteResponse.ranked) &&
        Objects.equals(this.rewarded, missionInviteResponse.rewarded) &&
        Objects.equals(this.startDate, missionInviteResponse.startDate) &&
        Objects.equals(this.endDate, missionInviteResponse.endDate) &&
        Objects.equals(this.updated, missionInviteResponse.updated) &&
        Objects.equals(this.buyBackAvailable, missionInviteResponse.buyBackAvailable) &&
        Objects.equals(this.inviteStatus, missionInviteResponse.inviteStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, status, title, description, owner, permissionableId, permissionableType, ranked, rewarded, startDate, endDate, updated, buyBackAvailable, inviteStatus);
  }

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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


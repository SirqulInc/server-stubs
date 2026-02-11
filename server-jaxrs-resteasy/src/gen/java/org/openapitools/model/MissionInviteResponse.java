package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AccountShortResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class MissionInviteResponse   {
  
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
    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private StatusEnum status;
  private String title;
  private String description;
  private AccountShortResponse owner;
  private Long permissionableId;
  private String permissionableType;
  private Boolean ranked;
  private Boolean rewarded;
  private Long startDate;
  private Long endDate;
  private Long updated;
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
    private String value;

    InviteStatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private InviteStatusEnum inviteStatus;

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
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
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
  @JsonProperty("owner")
  @Valid
  public AccountShortResponse getOwner() {
    return owner;
  }
  public void setOwner(AccountShortResponse owner) {
    this.owner = owner;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("permissionableId")
  public Long getPermissionableId() {
    return permissionableId;
  }
  public void setPermissionableId(Long permissionableId) {
    this.permissionableId = permissionableId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("permissionableType")
  public String getPermissionableType() {
    return permissionableType;
  }
  public void setPermissionableType(String permissionableType) {
    this.permissionableType = permissionableType;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("ranked")
  public Boolean getRanked() {
    return ranked;
  }
  public void setRanked(Boolean ranked) {
    this.ranked = ranked;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("rewarded")
  public Boolean getRewarded() {
    return rewarded;
  }
  public void setRewarded(Boolean rewarded) {
    this.rewarded = rewarded;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("startDate")
  public Long getStartDate() {
    return startDate;
  }
  public void setStartDate(Long startDate) {
    this.startDate = startDate;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("endDate")
  public Long getEndDate() {
    return endDate;
  }
  public void setEndDate(Long endDate) {
    this.endDate = endDate;
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
  @JsonProperty("buyBackAvailable")
  public Boolean getBuyBackAvailable() {
    return buyBackAvailable;
  }
  public void setBuyBackAvailable(Boolean buyBackAvailable) {
    this.buyBackAvailable = buyBackAvailable;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("inviteStatus")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


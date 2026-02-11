package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.AccountShortResponse;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * MissionInviteResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-11T19:32:41.765375324Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class MissionInviteResponse {

  private @Nullable Long id;

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

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
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

  private @Nullable StatusEnum status;

  private @Nullable String title;

  private @Nullable String description;

  private @Nullable AccountShortResponse owner;

  private @Nullable Long permissionableId;

  private @Nullable String permissionableType;

  private @Nullable Boolean ranked;

  private @Nullable Boolean rewarded;

  private @Nullable Long startDate;

  private @Nullable Long endDate;

  private @Nullable Long updated;

  private @Nullable Boolean buyBackAvailable;

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

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
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

  private @Nullable InviteStatusEnum inviteStatus;

  public MissionInviteResponse id(@Nullable Long id) {
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

  public MissionInviteResponse status(@Nullable StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  
  @Schema(name = "status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public @Nullable StatusEnum getStatus() {
    return status;
  }

  public void setStatus(@Nullable StatusEnum status) {
    this.status = status;
  }

  public MissionInviteResponse title(@Nullable String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
   */
  
  @Schema(name = "title", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("title")
  public @Nullable String getTitle() {
    return title;
  }

  public void setTitle(@Nullable String title) {
    this.title = title;
  }

  public MissionInviteResponse description(@Nullable String description) {
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

  public MissionInviteResponse owner(@Nullable AccountShortResponse owner) {
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
  public @Nullable AccountShortResponse getOwner() {
    return owner;
  }

  public void setOwner(@Nullable AccountShortResponse owner) {
    this.owner = owner;
  }

  public MissionInviteResponse permissionableId(@Nullable Long permissionableId) {
    this.permissionableId = permissionableId;
    return this;
  }

  /**
   * Get permissionableId
   * @return permissionableId
   */
  
  @Schema(name = "permissionableId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("permissionableId")
  public @Nullable Long getPermissionableId() {
    return permissionableId;
  }

  public void setPermissionableId(@Nullable Long permissionableId) {
    this.permissionableId = permissionableId;
  }

  public MissionInviteResponse permissionableType(@Nullable String permissionableType) {
    this.permissionableType = permissionableType;
    return this;
  }

  /**
   * Get permissionableType
   * @return permissionableType
   */
  
  @Schema(name = "permissionableType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("permissionableType")
  public @Nullable String getPermissionableType() {
    return permissionableType;
  }

  public void setPermissionableType(@Nullable String permissionableType) {
    this.permissionableType = permissionableType;
  }

  public MissionInviteResponse ranked(@Nullable Boolean ranked) {
    this.ranked = ranked;
    return this;
  }

  /**
   * Get ranked
   * @return ranked
   */
  
  @Schema(name = "ranked", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ranked")
  public @Nullable Boolean getRanked() {
    return ranked;
  }

  public void setRanked(@Nullable Boolean ranked) {
    this.ranked = ranked;
  }

  public MissionInviteResponse rewarded(@Nullable Boolean rewarded) {
    this.rewarded = rewarded;
    return this;
  }

  /**
   * Get rewarded
   * @return rewarded
   */
  
  @Schema(name = "rewarded", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rewarded")
  public @Nullable Boolean getRewarded() {
    return rewarded;
  }

  public void setRewarded(@Nullable Boolean rewarded) {
    this.rewarded = rewarded;
  }

  public MissionInviteResponse startDate(@Nullable Long startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Get startDate
   * @return startDate
   */
  
  @Schema(name = "startDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("startDate")
  public @Nullable Long getStartDate() {
    return startDate;
  }

  public void setStartDate(@Nullable Long startDate) {
    this.startDate = startDate;
  }

  public MissionInviteResponse endDate(@Nullable Long endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * Get endDate
   * @return endDate
   */
  
  @Schema(name = "endDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("endDate")
  public @Nullable Long getEndDate() {
    return endDate;
  }

  public void setEndDate(@Nullable Long endDate) {
    this.endDate = endDate;
  }

  public MissionInviteResponse updated(@Nullable Long updated) {
    this.updated = updated;
    return this;
  }

  /**
   * Get updated
   * @return updated
   */
  
  @Schema(name = "updated", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("updated")
  public @Nullable Long getUpdated() {
    return updated;
  }

  public void setUpdated(@Nullable Long updated) {
    this.updated = updated;
  }

  public MissionInviteResponse buyBackAvailable(@Nullable Boolean buyBackAvailable) {
    this.buyBackAvailable = buyBackAvailable;
    return this;
  }

  /**
   * Get buyBackAvailable
   * @return buyBackAvailable
   */
  
  @Schema(name = "buyBackAvailable", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("buyBackAvailable")
  public @Nullable Boolean getBuyBackAvailable() {
    return buyBackAvailable;
  }

  public void setBuyBackAvailable(@Nullable Boolean buyBackAvailable) {
    this.buyBackAvailable = buyBackAvailable;
  }

  public MissionInviteResponse inviteStatus(@Nullable InviteStatusEnum inviteStatus) {
    this.inviteStatus = inviteStatus;
    return this;
  }

  /**
   * Get inviteStatus
   * @return inviteStatus
   */
  
  @Schema(name = "inviteStatus", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("inviteStatus")
  public @Nullable InviteStatusEnum getInviteStatus() {
    return inviteStatus;
  }

  public void setInviteStatus(@Nullable InviteStatusEnum inviteStatus) {
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
  private String toIndentedString(@Nullable Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


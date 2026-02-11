package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.AccountShortResponse;
import org.openapitools.model.AssetShortResponse;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * MissionShortResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-11T19:32:41.765375324Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class MissionShortResponse {

  /**
   * Gets or Sets action
   */
  public enum ActionEnum {
    DATA("DATA"),
    
    SAVE("SAVE"),
    
    DELETE("DELETE"),
    
    GET("GET");

    private final String value;

    ActionEnum(String value) {
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
    public static ActionEnum fromValue(String value) {
      for (ActionEnum b : ActionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable ActionEnum action;

  private @Nullable String highestAppVersion;

  private @Nullable Long missionId;

  private @Nullable Long ticketsEarned;

  private @Nullable Integer costToPlay;

  private @Nullable String costToPlayType;

  private @Nullable AccountShortResponse owner;

  private @Nullable String title;

  private @Nullable String description;

  private @Nullable String authorOverride;

  private @Nullable AssetShortResponse icon;

  private @Nullable AssetShortResponse image;

  private @Nullable String sequenceType;

  private @Nullable Long updatedDate;

  private @Nullable Long startDate;

  private @Nullable Long endDate;

  private @Nullable String missionType;

  private @Nullable Boolean active;

  private @Nullable Double balance;

  private @Nullable Integer availableLimit;

  private @Nullable Integer inviteCount;

  private @Nullable Integer acceptedCount;

  private @Nullable Long childCount;

  private @Nullable Boolean enableBuyBack;

  private @Nullable Integer minimumToPlay;

  private @Nullable Boolean rewarded;

  private @Nullable Boolean refunded;

  private @Nullable String joinCode;

  public MissionShortResponse action(@Nullable ActionEnum action) {
    this.action = action;
    return this;
  }

  /**
   * Get action
   * @return action
   */
  
  @Schema(name = "action", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("action")
  public @Nullable ActionEnum getAction() {
    return action;
  }

  public void setAction(@Nullable ActionEnum action) {
    this.action = action;
  }

  public MissionShortResponse highestAppVersion(@Nullable String highestAppVersion) {
    this.highestAppVersion = highestAppVersion;
    return this;
  }

  /**
   * Get highestAppVersion
   * @return highestAppVersion
   */
  
  @Schema(name = "highestAppVersion", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("highestAppVersion")
  public @Nullable String getHighestAppVersion() {
    return highestAppVersion;
  }

  public void setHighestAppVersion(@Nullable String highestAppVersion) {
    this.highestAppVersion = highestAppVersion;
  }

  public MissionShortResponse missionId(@Nullable Long missionId) {
    this.missionId = missionId;
    return this;
  }

  /**
   * Get missionId
   * @return missionId
   */
  
  @Schema(name = "missionId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("missionId")
  public @Nullable Long getMissionId() {
    return missionId;
  }

  public void setMissionId(@Nullable Long missionId) {
    this.missionId = missionId;
  }

  public MissionShortResponse ticketsEarned(@Nullable Long ticketsEarned) {
    this.ticketsEarned = ticketsEarned;
    return this;
  }

  /**
   * Get ticketsEarned
   * @return ticketsEarned
   */
  
  @Schema(name = "ticketsEarned", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ticketsEarned")
  public @Nullable Long getTicketsEarned() {
    return ticketsEarned;
  }

  public void setTicketsEarned(@Nullable Long ticketsEarned) {
    this.ticketsEarned = ticketsEarned;
  }

  public MissionShortResponse costToPlay(@Nullable Integer costToPlay) {
    this.costToPlay = costToPlay;
    return this;
  }

  /**
   * Get costToPlay
   * @return costToPlay
   */
  
  @Schema(name = "costToPlay", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("costToPlay")
  public @Nullable Integer getCostToPlay() {
    return costToPlay;
  }

  public void setCostToPlay(@Nullable Integer costToPlay) {
    this.costToPlay = costToPlay;
  }

  public MissionShortResponse costToPlayType(@Nullable String costToPlayType) {
    this.costToPlayType = costToPlayType;
    return this;
  }

  /**
   * Get costToPlayType
   * @return costToPlayType
   */
  
  @Schema(name = "costToPlayType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("costToPlayType")
  public @Nullable String getCostToPlayType() {
    return costToPlayType;
  }

  public void setCostToPlayType(@Nullable String costToPlayType) {
    this.costToPlayType = costToPlayType;
  }

  public MissionShortResponse owner(@Nullable AccountShortResponse owner) {
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

  public MissionShortResponse title(@Nullable String title) {
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

  public MissionShortResponse description(@Nullable String description) {
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

  public MissionShortResponse authorOverride(@Nullable String authorOverride) {
    this.authorOverride = authorOverride;
    return this;
  }

  /**
   * Get authorOverride
   * @return authorOverride
   */
  
  @Schema(name = "authorOverride", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("authorOverride")
  public @Nullable String getAuthorOverride() {
    return authorOverride;
  }

  public void setAuthorOverride(@Nullable String authorOverride) {
    this.authorOverride = authorOverride;
  }

  public MissionShortResponse icon(@Nullable AssetShortResponse icon) {
    this.icon = icon;
    return this;
  }

  /**
   * Get icon
   * @return icon
   */
  @Valid 
  @Schema(name = "icon", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("icon")
  public @Nullable AssetShortResponse getIcon() {
    return icon;
  }

  public void setIcon(@Nullable AssetShortResponse icon) {
    this.icon = icon;
  }

  public MissionShortResponse image(@Nullable AssetShortResponse image) {
    this.image = image;
    return this;
  }

  /**
   * Get image
   * @return image
   */
  @Valid 
  @Schema(name = "image", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("image")
  public @Nullable AssetShortResponse getImage() {
    return image;
  }

  public void setImage(@Nullable AssetShortResponse image) {
    this.image = image;
  }

  public MissionShortResponse sequenceType(@Nullable String sequenceType) {
    this.sequenceType = sequenceType;
    return this;
  }

  /**
   * Get sequenceType
   * @return sequenceType
   */
  
  @Schema(name = "sequenceType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sequenceType")
  public @Nullable String getSequenceType() {
    return sequenceType;
  }

  public void setSequenceType(@Nullable String sequenceType) {
    this.sequenceType = sequenceType;
  }

  public MissionShortResponse updatedDate(@Nullable Long updatedDate) {
    this.updatedDate = updatedDate;
    return this;
  }

  /**
   * Get updatedDate
   * @return updatedDate
   */
  
  @Schema(name = "updatedDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("updatedDate")
  public @Nullable Long getUpdatedDate() {
    return updatedDate;
  }

  public void setUpdatedDate(@Nullable Long updatedDate) {
    this.updatedDate = updatedDate;
  }

  public MissionShortResponse startDate(@Nullable Long startDate) {
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

  public MissionShortResponse endDate(@Nullable Long endDate) {
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

  public MissionShortResponse missionType(@Nullable String missionType) {
    this.missionType = missionType;
    return this;
  }

  /**
   * Get missionType
   * @return missionType
   */
  
  @Schema(name = "missionType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("missionType")
  public @Nullable String getMissionType() {
    return missionType;
  }

  public void setMissionType(@Nullable String missionType) {
    this.missionType = missionType;
  }

  public MissionShortResponse active(@Nullable Boolean active) {
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

  public MissionShortResponse balance(@Nullable Double balance) {
    this.balance = balance;
    return this;
  }

  /**
   * Get balance
   * @return balance
   */
  
  @Schema(name = "balance", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("balance")
  public @Nullable Double getBalance() {
    return balance;
  }

  public void setBalance(@Nullable Double balance) {
    this.balance = balance;
  }

  public MissionShortResponse availableLimit(@Nullable Integer availableLimit) {
    this.availableLimit = availableLimit;
    return this;
  }

  /**
   * Get availableLimit
   * @return availableLimit
   */
  
  @Schema(name = "availableLimit", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("availableLimit")
  public @Nullable Integer getAvailableLimit() {
    return availableLimit;
  }

  public void setAvailableLimit(@Nullable Integer availableLimit) {
    this.availableLimit = availableLimit;
  }

  public MissionShortResponse inviteCount(@Nullable Integer inviteCount) {
    this.inviteCount = inviteCount;
    return this;
  }

  /**
   * Get inviteCount
   * @return inviteCount
   */
  
  @Schema(name = "inviteCount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("inviteCount")
  public @Nullable Integer getInviteCount() {
    return inviteCount;
  }

  public void setInviteCount(@Nullable Integer inviteCount) {
    this.inviteCount = inviteCount;
  }

  public MissionShortResponse acceptedCount(@Nullable Integer acceptedCount) {
    this.acceptedCount = acceptedCount;
    return this;
  }

  /**
   * Get acceptedCount
   * @return acceptedCount
   */
  
  @Schema(name = "acceptedCount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("acceptedCount")
  public @Nullable Integer getAcceptedCount() {
    return acceptedCount;
  }

  public void setAcceptedCount(@Nullable Integer acceptedCount) {
    this.acceptedCount = acceptedCount;
  }

  public MissionShortResponse childCount(@Nullable Long childCount) {
    this.childCount = childCount;
    return this;
  }

  /**
   * Get childCount
   * @return childCount
   */
  
  @Schema(name = "childCount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("childCount")
  public @Nullable Long getChildCount() {
    return childCount;
  }

  public void setChildCount(@Nullable Long childCount) {
    this.childCount = childCount;
  }

  public MissionShortResponse enableBuyBack(@Nullable Boolean enableBuyBack) {
    this.enableBuyBack = enableBuyBack;
    return this;
  }

  /**
   * Get enableBuyBack
   * @return enableBuyBack
   */
  
  @Schema(name = "enableBuyBack", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("enableBuyBack")
  public @Nullable Boolean getEnableBuyBack() {
    return enableBuyBack;
  }

  public void setEnableBuyBack(@Nullable Boolean enableBuyBack) {
    this.enableBuyBack = enableBuyBack;
  }

  public MissionShortResponse minimumToPlay(@Nullable Integer minimumToPlay) {
    this.minimumToPlay = minimumToPlay;
    return this;
  }

  /**
   * Get minimumToPlay
   * @return minimumToPlay
   */
  
  @Schema(name = "minimumToPlay", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("minimumToPlay")
  public @Nullable Integer getMinimumToPlay() {
    return minimumToPlay;
  }

  public void setMinimumToPlay(@Nullable Integer minimumToPlay) {
    this.minimumToPlay = minimumToPlay;
  }

  public MissionShortResponse rewarded(@Nullable Boolean rewarded) {
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

  public MissionShortResponse refunded(@Nullable Boolean refunded) {
    this.refunded = refunded;
    return this;
  }

  /**
   * Get refunded
   * @return refunded
   */
  
  @Schema(name = "refunded", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("refunded")
  public @Nullable Boolean getRefunded() {
    return refunded;
  }

  public void setRefunded(@Nullable Boolean refunded) {
    this.refunded = refunded;
  }

  public MissionShortResponse joinCode(@Nullable String joinCode) {
    this.joinCode = joinCode;
    return this;
  }

  /**
   * Get joinCode
   * @return joinCode
   */
  
  @Schema(name = "joinCode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("joinCode")
  public @Nullable String getJoinCode() {
    return joinCode;
  }

  public void setJoinCode(@Nullable String joinCode) {
    this.joinCode = joinCode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MissionShortResponse missionShortResponse = (MissionShortResponse) o;
    return Objects.equals(this.action, missionShortResponse.action) &&
        Objects.equals(this.highestAppVersion, missionShortResponse.highestAppVersion) &&
        Objects.equals(this.missionId, missionShortResponse.missionId) &&
        Objects.equals(this.ticketsEarned, missionShortResponse.ticketsEarned) &&
        Objects.equals(this.costToPlay, missionShortResponse.costToPlay) &&
        Objects.equals(this.costToPlayType, missionShortResponse.costToPlayType) &&
        Objects.equals(this.owner, missionShortResponse.owner) &&
        Objects.equals(this.title, missionShortResponse.title) &&
        Objects.equals(this.description, missionShortResponse.description) &&
        Objects.equals(this.authorOverride, missionShortResponse.authorOverride) &&
        Objects.equals(this.icon, missionShortResponse.icon) &&
        Objects.equals(this.image, missionShortResponse.image) &&
        Objects.equals(this.sequenceType, missionShortResponse.sequenceType) &&
        Objects.equals(this.updatedDate, missionShortResponse.updatedDate) &&
        Objects.equals(this.startDate, missionShortResponse.startDate) &&
        Objects.equals(this.endDate, missionShortResponse.endDate) &&
        Objects.equals(this.missionType, missionShortResponse.missionType) &&
        Objects.equals(this.active, missionShortResponse.active) &&
        Objects.equals(this.balance, missionShortResponse.balance) &&
        Objects.equals(this.availableLimit, missionShortResponse.availableLimit) &&
        Objects.equals(this.inviteCount, missionShortResponse.inviteCount) &&
        Objects.equals(this.acceptedCount, missionShortResponse.acceptedCount) &&
        Objects.equals(this.childCount, missionShortResponse.childCount) &&
        Objects.equals(this.enableBuyBack, missionShortResponse.enableBuyBack) &&
        Objects.equals(this.minimumToPlay, missionShortResponse.minimumToPlay) &&
        Objects.equals(this.rewarded, missionShortResponse.rewarded) &&
        Objects.equals(this.refunded, missionShortResponse.refunded) &&
        Objects.equals(this.joinCode, missionShortResponse.joinCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, highestAppVersion, missionId, ticketsEarned, costToPlay, costToPlayType, owner, title, description, authorOverride, icon, image, sequenceType, updatedDate, startDate, endDate, missionType, active, balance, availableLimit, inviteCount, acceptedCount, childCount, enableBuyBack, minimumToPlay, rewarded, refunded, joinCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MissionShortResponse {\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    highestAppVersion: ").append(toIndentedString(highestAppVersion)).append("\n");
    sb.append("    missionId: ").append(toIndentedString(missionId)).append("\n");
    sb.append("    ticketsEarned: ").append(toIndentedString(ticketsEarned)).append("\n");
    sb.append("    costToPlay: ").append(toIndentedString(costToPlay)).append("\n");
    sb.append("    costToPlayType: ").append(toIndentedString(costToPlayType)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    authorOverride: ").append(toIndentedString(authorOverride)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    sequenceType: ").append(toIndentedString(sequenceType)).append("\n");
    sb.append("    updatedDate: ").append(toIndentedString(updatedDate)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    missionType: ").append(toIndentedString(missionType)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    availableLimit: ").append(toIndentedString(availableLimit)).append("\n");
    sb.append("    inviteCount: ").append(toIndentedString(inviteCount)).append("\n");
    sb.append("    acceptedCount: ").append(toIndentedString(acceptedCount)).append("\n");
    sb.append("    childCount: ").append(toIndentedString(childCount)).append("\n");
    sb.append("    enableBuyBack: ").append(toIndentedString(enableBuyBack)).append("\n");
    sb.append("    minimumToPlay: ").append(toIndentedString(minimumToPlay)).append("\n");
    sb.append("    rewarded: ").append(toIndentedString(rewarded)).append("\n");
    sb.append("    refunded: ").append(toIndentedString(refunded)).append("\n");
    sb.append("    joinCode: ").append(toIndentedString(joinCode)).append("\n");
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


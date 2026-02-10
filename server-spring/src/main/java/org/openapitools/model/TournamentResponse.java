package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AccountShortResponse;
import org.openapitools.model.AssetShortResponse;
import org.openapitools.model.AudienceResponse;
import org.openapitools.model.CreativeResponse;
import org.openapitools.model.GameListResponse;
import org.openapitools.model.MissionInviteResponse;
import org.openapitools.model.NameStringValueResponse;
import org.openapitools.model.RewardResponse;
import org.openapitools.model.ScoreListResponse;
import org.openapitools.model.UserPermissionsListResponse;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * TournamentResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-09T20:58:37.853899731Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class TournamentResponse {

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

  @Valid
  private List<@Valid RewardResponse> rewards = new ArrayList<>();

  private @Nullable GameListResponse games;

  private @Nullable ScoreListResponse scores;

  private @Nullable UserPermissionsListResponse userPermissionsList;

  @Valid
  private List<@Valid NameStringValueResponse> results = new ArrayList<>();

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

  @Valid
  private List<@Valid AudienceResponse> audiences = new ArrayList<>();

  private @Nullable Long missionInviteId;

  private @Nullable MissionInviteResponse missionInvite;

  private @Nullable AccountShortResponse invitee;

  private @Nullable String formatType;

  @Valid
  private List<@Valid CreativeResponse> creatives = new ArrayList<>();

  private @Nullable Boolean fixedReward;

  private @Nullable Boolean allocateTickets;

  private @Nullable String ticketType;

  private @Nullable Long ticketCount;

  private @Nullable Long points;

  private @Nullable String splitReward;

  private @Nullable Integer secondsBetweenLevels;

  private @Nullable Integer secondsBetweenPacks;

  private @Nullable Boolean advancedReporting;

  private @Nullable String tournamentData;

  public TournamentResponse action(@Nullable ActionEnum action) {
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

  public TournamentResponse highestAppVersion(@Nullable String highestAppVersion) {
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

  public TournamentResponse missionId(@Nullable Long missionId) {
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

  public TournamentResponse ticketsEarned(@Nullable Long ticketsEarned) {
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

  public TournamentResponse costToPlay(@Nullable Integer costToPlay) {
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

  public TournamentResponse costToPlayType(@Nullable String costToPlayType) {
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

  public TournamentResponse owner(@Nullable AccountShortResponse owner) {
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

  public TournamentResponse title(@Nullable String title) {
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

  public TournamentResponse description(@Nullable String description) {
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

  public TournamentResponse authorOverride(@Nullable String authorOverride) {
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

  public TournamentResponse icon(@Nullable AssetShortResponse icon) {
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

  public TournamentResponse image(@Nullable AssetShortResponse image) {
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

  public TournamentResponse sequenceType(@Nullable String sequenceType) {
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

  public TournamentResponse updatedDate(@Nullable Long updatedDate) {
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

  public TournamentResponse startDate(@Nullable Long startDate) {
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

  public TournamentResponse endDate(@Nullable Long endDate) {
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

  public TournamentResponse missionType(@Nullable String missionType) {
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

  public TournamentResponse active(@Nullable Boolean active) {
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

  public TournamentResponse balance(@Nullable Double balance) {
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

  public TournamentResponse availableLimit(@Nullable Integer availableLimit) {
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

  public TournamentResponse inviteCount(@Nullable Integer inviteCount) {
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

  public TournamentResponse acceptedCount(@Nullable Integer acceptedCount) {
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

  public TournamentResponse childCount(@Nullable Long childCount) {
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

  public TournamentResponse enableBuyBack(@Nullable Boolean enableBuyBack) {
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

  public TournamentResponse minimumToPlay(@Nullable Integer minimumToPlay) {
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

  public TournamentResponse rewarded(@Nullable Boolean rewarded) {
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

  public TournamentResponse refunded(@Nullable Boolean refunded) {
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

  public TournamentResponse joinCode(@Nullable String joinCode) {
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

  public TournamentResponse rewards(List<@Valid RewardResponse> rewards) {
    this.rewards = rewards;
    return this;
  }

  public TournamentResponse addRewardsItem(RewardResponse rewardsItem) {
    if (this.rewards == null) {
      this.rewards = new ArrayList<>();
    }
    this.rewards.add(rewardsItem);
    return this;
  }

  /**
   * Get rewards
   * @return rewards
   */
  @Valid 
  @Schema(name = "rewards", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rewards")
  public List<@Valid RewardResponse> getRewards() {
    return rewards;
  }

  public void setRewards(List<@Valid RewardResponse> rewards) {
    this.rewards = rewards;
  }

  public TournamentResponse games(@Nullable GameListResponse games) {
    this.games = games;
    return this;
  }

  /**
   * Get games
   * @return games
   */
  @Valid 
  @Schema(name = "games", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("games")
  public @Nullable GameListResponse getGames() {
    return games;
  }

  public void setGames(@Nullable GameListResponse games) {
    this.games = games;
  }

  public TournamentResponse scores(@Nullable ScoreListResponse scores) {
    this.scores = scores;
    return this;
  }

  /**
   * Get scores
   * @return scores
   */
  @Valid 
  @Schema(name = "scores", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("scores")
  public @Nullable ScoreListResponse getScores() {
    return scores;
  }

  public void setScores(@Nullable ScoreListResponse scores) {
    this.scores = scores;
  }

  public TournamentResponse userPermissionsList(@Nullable UserPermissionsListResponse userPermissionsList) {
    this.userPermissionsList = userPermissionsList;
    return this;
  }

  /**
   * Get userPermissionsList
   * @return userPermissionsList
   */
  @Valid 
  @Schema(name = "userPermissionsList", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("userPermissionsList")
  public @Nullable UserPermissionsListResponse getUserPermissionsList() {
    return userPermissionsList;
  }

  public void setUserPermissionsList(@Nullable UserPermissionsListResponse userPermissionsList) {
    this.userPermissionsList = userPermissionsList;
  }

  public TournamentResponse results(List<@Valid NameStringValueResponse> results) {
    this.results = results;
    return this;
  }

  public TournamentResponse addResultsItem(NameStringValueResponse resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<>();
    }
    this.results.add(resultsItem);
    return this;
  }

  /**
   * Get results
   * @return results
   */
  @Valid 
  @Schema(name = "results", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("results")
  public List<@Valid NameStringValueResponse> getResults() {
    return results;
  }

  public void setResults(List<@Valid NameStringValueResponse> results) {
    this.results = results;
  }

  public TournamentResponse inviteStatus(@Nullable InviteStatusEnum inviteStatus) {
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

  public TournamentResponse audiences(List<@Valid AudienceResponse> audiences) {
    this.audiences = audiences;
    return this;
  }

  public TournamentResponse addAudiencesItem(AudienceResponse audiencesItem) {
    if (this.audiences == null) {
      this.audiences = new ArrayList<>();
    }
    this.audiences.add(audiencesItem);
    return this;
  }

  /**
   * Get audiences
   * @return audiences
   */
  @Valid 
  @Schema(name = "audiences", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("audiences")
  public List<@Valid AudienceResponse> getAudiences() {
    return audiences;
  }

  public void setAudiences(List<@Valid AudienceResponse> audiences) {
    this.audiences = audiences;
  }

  public TournamentResponse missionInviteId(@Nullable Long missionInviteId) {
    this.missionInviteId = missionInviteId;
    return this;
  }

  /**
   * Get missionInviteId
   * @return missionInviteId
   */
  
  @Schema(name = "missionInviteId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("missionInviteId")
  public @Nullable Long getMissionInviteId() {
    return missionInviteId;
  }

  public void setMissionInviteId(@Nullable Long missionInviteId) {
    this.missionInviteId = missionInviteId;
  }

  public TournamentResponse missionInvite(@Nullable MissionInviteResponse missionInvite) {
    this.missionInvite = missionInvite;
    return this;
  }

  /**
   * Get missionInvite
   * @return missionInvite
   */
  @Valid 
  @Schema(name = "missionInvite", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("missionInvite")
  public @Nullable MissionInviteResponse getMissionInvite() {
    return missionInvite;
  }

  public void setMissionInvite(@Nullable MissionInviteResponse missionInvite) {
    this.missionInvite = missionInvite;
  }

  public TournamentResponse invitee(@Nullable AccountShortResponse invitee) {
    this.invitee = invitee;
    return this;
  }

  /**
   * Get invitee
   * @return invitee
   */
  @Valid 
  @Schema(name = "invitee", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("invitee")
  public @Nullable AccountShortResponse getInvitee() {
    return invitee;
  }

  public void setInvitee(@Nullable AccountShortResponse invitee) {
    this.invitee = invitee;
  }

  public TournamentResponse formatType(@Nullable String formatType) {
    this.formatType = formatType;
    return this;
  }

  /**
   * Get formatType
   * @return formatType
   */
  
  @Schema(name = "formatType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("formatType")
  public @Nullable String getFormatType() {
    return formatType;
  }

  public void setFormatType(@Nullable String formatType) {
    this.formatType = formatType;
  }

  public TournamentResponse creatives(List<@Valid CreativeResponse> creatives) {
    this.creatives = creatives;
    return this;
  }

  public TournamentResponse addCreativesItem(CreativeResponse creativesItem) {
    if (this.creatives == null) {
      this.creatives = new ArrayList<>();
    }
    this.creatives.add(creativesItem);
    return this;
  }

  /**
   * Get creatives
   * @return creatives
   */
  @Valid 
  @Schema(name = "creatives", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("creatives")
  public List<@Valid CreativeResponse> getCreatives() {
    return creatives;
  }

  public void setCreatives(List<@Valid CreativeResponse> creatives) {
    this.creatives = creatives;
  }

  public TournamentResponse fixedReward(@Nullable Boolean fixedReward) {
    this.fixedReward = fixedReward;
    return this;
  }

  /**
   * Get fixedReward
   * @return fixedReward
   */
  
  @Schema(name = "fixedReward", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fixedReward")
  public @Nullable Boolean getFixedReward() {
    return fixedReward;
  }

  public void setFixedReward(@Nullable Boolean fixedReward) {
    this.fixedReward = fixedReward;
  }

  public TournamentResponse allocateTickets(@Nullable Boolean allocateTickets) {
    this.allocateTickets = allocateTickets;
    return this;
  }

  /**
   * Get allocateTickets
   * @return allocateTickets
   */
  
  @Schema(name = "allocateTickets", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("allocateTickets")
  public @Nullable Boolean getAllocateTickets() {
    return allocateTickets;
  }

  public void setAllocateTickets(@Nullable Boolean allocateTickets) {
    this.allocateTickets = allocateTickets;
  }

  public TournamentResponse ticketType(@Nullable String ticketType) {
    this.ticketType = ticketType;
    return this;
  }

  /**
   * Get ticketType
   * @return ticketType
   */
  
  @Schema(name = "ticketType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ticketType")
  public @Nullable String getTicketType() {
    return ticketType;
  }

  public void setTicketType(@Nullable String ticketType) {
    this.ticketType = ticketType;
  }

  public TournamentResponse ticketCount(@Nullable Long ticketCount) {
    this.ticketCount = ticketCount;
    return this;
  }

  /**
   * Get ticketCount
   * @return ticketCount
   */
  
  @Schema(name = "ticketCount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ticketCount")
  public @Nullable Long getTicketCount() {
    return ticketCount;
  }

  public void setTicketCount(@Nullable Long ticketCount) {
    this.ticketCount = ticketCount;
  }

  public TournamentResponse points(@Nullable Long points) {
    this.points = points;
    return this;
  }

  /**
   * Get points
   * @return points
   */
  
  @Schema(name = "points", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("points")
  public @Nullable Long getPoints() {
    return points;
  }

  public void setPoints(@Nullable Long points) {
    this.points = points;
  }

  public TournamentResponse splitReward(@Nullable String splitReward) {
    this.splitReward = splitReward;
    return this;
  }

  /**
   * Get splitReward
   * @return splitReward
   */
  
  @Schema(name = "splitReward", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("splitReward")
  public @Nullable String getSplitReward() {
    return splitReward;
  }

  public void setSplitReward(@Nullable String splitReward) {
    this.splitReward = splitReward;
  }

  public TournamentResponse secondsBetweenLevels(@Nullable Integer secondsBetweenLevels) {
    this.secondsBetweenLevels = secondsBetweenLevels;
    return this;
  }

  /**
   * Get secondsBetweenLevels
   * @return secondsBetweenLevels
   */
  
  @Schema(name = "secondsBetweenLevels", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("secondsBetweenLevels")
  public @Nullable Integer getSecondsBetweenLevels() {
    return secondsBetweenLevels;
  }

  public void setSecondsBetweenLevels(@Nullable Integer secondsBetweenLevels) {
    this.secondsBetweenLevels = secondsBetweenLevels;
  }

  public TournamentResponse secondsBetweenPacks(@Nullable Integer secondsBetweenPacks) {
    this.secondsBetweenPacks = secondsBetweenPacks;
    return this;
  }

  /**
   * Get secondsBetweenPacks
   * @return secondsBetweenPacks
   */
  
  @Schema(name = "secondsBetweenPacks", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("secondsBetweenPacks")
  public @Nullable Integer getSecondsBetweenPacks() {
    return secondsBetweenPacks;
  }

  public void setSecondsBetweenPacks(@Nullable Integer secondsBetweenPacks) {
    this.secondsBetweenPacks = secondsBetweenPacks;
  }

  public TournamentResponse advancedReporting(@Nullable Boolean advancedReporting) {
    this.advancedReporting = advancedReporting;
    return this;
  }

  /**
   * Get advancedReporting
   * @return advancedReporting
   */
  
  @Schema(name = "advancedReporting", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("advancedReporting")
  public @Nullable Boolean getAdvancedReporting() {
    return advancedReporting;
  }

  public void setAdvancedReporting(@Nullable Boolean advancedReporting) {
    this.advancedReporting = advancedReporting;
  }

  public TournamentResponse tournamentData(@Nullable String tournamentData) {
    this.tournamentData = tournamentData;
    return this;
  }

  /**
   * Get tournamentData
   * @return tournamentData
   */
  
  @Schema(name = "tournamentData", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tournamentData")
  public @Nullable String getTournamentData() {
    return tournamentData;
  }

  public void setTournamentData(@Nullable String tournamentData) {
    this.tournamentData = tournamentData;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TournamentResponse tournamentResponse = (TournamentResponse) o;
    return Objects.equals(this.action, tournamentResponse.action) &&
        Objects.equals(this.highestAppVersion, tournamentResponse.highestAppVersion) &&
        Objects.equals(this.missionId, tournamentResponse.missionId) &&
        Objects.equals(this.ticketsEarned, tournamentResponse.ticketsEarned) &&
        Objects.equals(this.costToPlay, tournamentResponse.costToPlay) &&
        Objects.equals(this.costToPlayType, tournamentResponse.costToPlayType) &&
        Objects.equals(this.owner, tournamentResponse.owner) &&
        Objects.equals(this.title, tournamentResponse.title) &&
        Objects.equals(this.description, tournamentResponse.description) &&
        Objects.equals(this.authorOverride, tournamentResponse.authorOverride) &&
        Objects.equals(this.icon, tournamentResponse.icon) &&
        Objects.equals(this.image, tournamentResponse.image) &&
        Objects.equals(this.sequenceType, tournamentResponse.sequenceType) &&
        Objects.equals(this.updatedDate, tournamentResponse.updatedDate) &&
        Objects.equals(this.startDate, tournamentResponse.startDate) &&
        Objects.equals(this.endDate, tournamentResponse.endDate) &&
        Objects.equals(this.missionType, tournamentResponse.missionType) &&
        Objects.equals(this.active, tournamentResponse.active) &&
        Objects.equals(this.balance, tournamentResponse.balance) &&
        Objects.equals(this.availableLimit, tournamentResponse.availableLimit) &&
        Objects.equals(this.inviteCount, tournamentResponse.inviteCount) &&
        Objects.equals(this.acceptedCount, tournamentResponse.acceptedCount) &&
        Objects.equals(this.childCount, tournamentResponse.childCount) &&
        Objects.equals(this.enableBuyBack, tournamentResponse.enableBuyBack) &&
        Objects.equals(this.minimumToPlay, tournamentResponse.minimumToPlay) &&
        Objects.equals(this.rewarded, tournamentResponse.rewarded) &&
        Objects.equals(this.refunded, tournamentResponse.refunded) &&
        Objects.equals(this.joinCode, tournamentResponse.joinCode) &&
        Objects.equals(this.rewards, tournamentResponse.rewards) &&
        Objects.equals(this.games, tournamentResponse.games) &&
        Objects.equals(this.scores, tournamentResponse.scores) &&
        Objects.equals(this.userPermissionsList, tournamentResponse.userPermissionsList) &&
        Objects.equals(this.results, tournamentResponse.results) &&
        Objects.equals(this.inviteStatus, tournamentResponse.inviteStatus) &&
        Objects.equals(this.audiences, tournamentResponse.audiences) &&
        Objects.equals(this.missionInviteId, tournamentResponse.missionInviteId) &&
        Objects.equals(this.missionInvite, tournamentResponse.missionInvite) &&
        Objects.equals(this.invitee, tournamentResponse.invitee) &&
        Objects.equals(this.formatType, tournamentResponse.formatType) &&
        Objects.equals(this.creatives, tournamentResponse.creatives) &&
        Objects.equals(this.fixedReward, tournamentResponse.fixedReward) &&
        Objects.equals(this.allocateTickets, tournamentResponse.allocateTickets) &&
        Objects.equals(this.ticketType, tournamentResponse.ticketType) &&
        Objects.equals(this.ticketCount, tournamentResponse.ticketCount) &&
        Objects.equals(this.points, tournamentResponse.points) &&
        Objects.equals(this.splitReward, tournamentResponse.splitReward) &&
        Objects.equals(this.secondsBetweenLevels, tournamentResponse.secondsBetweenLevels) &&
        Objects.equals(this.secondsBetweenPacks, tournamentResponse.secondsBetweenPacks) &&
        Objects.equals(this.advancedReporting, tournamentResponse.advancedReporting) &&
        Objects.equals(this.tournamentData, tournamentResponse.tournamentData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, highestAppVersion, missionId, ticketsEarned, costToPlay, costToPlayType, owner, title, description, authorOverride, icon, image, sequenceType, updatedDate, startDate, endDate, missionType, active, balance, availableLimit, inviteCount, acceptedCount, childCount, enableBuyBack, minimumToPlay, rewarded, refunded, joinCode, rewards, games, scores, userPermissionsList, results, inviteStatus, audiences, missionInviteId, missionInvite, invitee, formatType, creatives, fixedReward, allocateTickets, ticketType, ticketCount, points, splitReward, secondsBetweenLevels, secondsBetweenPacks, advancedReporting, tournamentData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TournamentResponse {\n");
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
    sb.append("    rewards: ").append(toIndentedString(rewards)).append("\n");
    sb.append("    games: ").append(toIndentedString(games)).append("\n");
    sb.append("    scores: ").append(toIndentedString(scores)).append("\n");
    sb.append("    userPermissionsList: ").append(toIndentedString(userPermissionsList)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
    sb.append("    inviteStatus: ").append(toIndentedString(inviteStatus)).append("\n");
    sb.append("    audiences: ").append(toIndentedString(audiences)).append("\n");
    sb.append("    missionInviteId: ").append(toIndentedString(missionInviteId)).append("\n");
    sb.append("    missionInvite: ").append(toIndentedString(missionInvite)).append("\n");
    sb.append("    invitee: ").append(toIndentedString(invitee)).append("\n");
    sb.append("    formatType: ").append(toIndentedString(formatType)).append("\n");
    sb.append("    creatives: ").append(toIndentedString(creatives)).append("\n");
    sb.append("    fixedReward: ").append(toIndentedString(fixedReward)).append("\n");
    sb.append("    allocateTickets: ").append(toIndentedString(allocateTickets)).append("\n");
    sb.append("    ticketType: ").append(toIndentedString(ticketType)).append("\n");
    sb.append("    ticketCount: ").append(toIndentedString(ticketCount)).append("\n");
    sb.append("    points: ").append(toIndentedString(points)).append("\n");
    sb.append("    splitReward: ").append(toIndentedString(splitReward)).append("\n");
    sb.append("    secondsBetweenLevels: ").append(toIndentedString(secondsBetweenLevels)).append("\n");
    sb.append("    secondsBetweenPacks: ").append(toIndentedString(secondsBetweenPacks)).append("\n");
    sb.append("    advancedReporting: ").append(toIndentedString(advancedReporting)).append("\n");
    sb.append("    tournamentData: ").append(toIndentedString(tournamentData)).append("\n");
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


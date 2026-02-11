package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Account;
import org.openapitools.model.Asset;
import org.openapitools.model.Audience;
import org.openapitools.model.BillableEntity;
import org.openapitools.model.Game;
import org.openapitools.model.GameLevel;
import org.openapitools.model.MissionTask;
import org.openapitools.model.Offer;
import org.openapitools.model.Pack;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Mission
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-11T19:32:41.765375324Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class Mission {

  private @Nullable Long id;

  private @Nullable Boolean active;

  private @Nullable Boolean valid;

  private @Nullable Account owner;

  /**
   * Gets or Sets missionType
   */
  public enum MissionTypeEnum {
    PUBLIC("PUBLIC"),
    
    SHARED("SHARED"),
    
    TOURNAMENT("TOURNAMENT"),
    
    POOLPLAY("POOLPLAY");

    private final String value;

    MissionTypeEnum(String value) {
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
    public static MissionTypeEnum fromValue(String value) {
      for (MissionTypeEnum b : MissionTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable MissionTypeEnum missionType;

  private @Nullable String title;

  private @Nullable String description;

  private @Nullable Integer costToPlay;

  private @Nullable String costToPlayType;

  @Valid
  private List<@Valid Game> games = new ArrayList<>();

  @Valid
  private List<@Valid Audience> audiences = new ArrayList<>();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime startDate;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime endDate;

  /**
   * Gets or Sets sequenceType
   */
  public enum SequenceTypeEnum {
    FIRST_AVAILABLE("FIRST_AVAILABLE"),
    
    ALL_AVAILABLE("ALL_AVAILABLE");

    private final String value;

    SequenceTypeEnum(String value) {
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
    public static SequenceTypeEnum fromValue(String value) {
      for (SequenceTypeEnum b : SequenceTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable SequenceTypeEnum sequenceType;

  private @Nullable String authorOverride;

  private @Nullable Asset icon;

  private @Nullable Asset image;

  @Valid
  private List<@Valid Offer> offers = new ArrayList<>();

  /**
   * Gets or Sets visibility
   */
  public enum VisibilityEnum {
    PUBLIC("PUBLIC"),
    
    LISTABLE("LISTABLE"),
    
    REWARDABLE("REWARDABLE"),
    
    TRIGGERABLE("TRIGGERABLE"),
    
    PRIVATE("PRIVATE");

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

  private @Nullable MissionTask task;

  private @Nullable Long points;

  private @Nullable String ticketType;

  private @Nullable Long ticketCount;

  private @Nullable Boolean allocateTickets;

  private @Nullable BillableEntity billableEntity;

  private @Nullable Double balance;

  private @Nullable Integer startingLimit;

  private @Nullable Integer availableLimit;

  private @Nullable Integer inviteCount;

  private @Nullable Integer acceptedCount;

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

  private @Nullable Long childCount;

  private @Nullable Integer secondsBetweenLevels;

  private @Nullable Integer secondsBetweenPacks;

  private @Nullable Integer maximumLevelLength;

  private @Nullable Boolean enableBuyBack;

  private @Nullable Pack activePack;

  private @Nullable Integer minimumToPlay;

  private @Nullable Boolean fixedReward;

  private @Nullable Boolean refunded;

  private @Nullable Boolean notificationsCreated;

  private @Nullable Boolean rewarded;

  private @Nullable Long externalId;

  private @Nullable Boolean advancedReporting;

  /**
   * Gets or Sets splitReward
   */
  public enum SplitRewardEnum {
    EVEN("EVEN"),
    
    ALL("ALL"),
    
    FIRST("FIRST"),
    
    RANDOM("RANDOM");

    private final String value;

    SplitRewardEnum(String value) {
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
    public static SplitRewardEnum fromValue(String value) {
      for (SplitRewardEnum b : SplitRewardEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable SplitRewardEnum splitReward;

  private @Nullable String joinCode;

  private @Nullable Pack firstPack;

  @Valid
  private List<@Valid GameLevel> allGameLevels = new ArrayList<>();

  @Valid
  private List<@Valid Pack> allPacks = new ArrayList<>();

  public Mission id(@Nullable Long id) {
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

  public Mission active(@Nullable Boolean active) {
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

  public Mission valid(@Nullable Boolean valid) {
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

  public Mission owner(@Nullable Account owner) {
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

  public Mission missionType(@Nullable MissionTypeEnum missionType) {
    this.missionType = missionType;
    return this;
  }

  /**
   * Get missionType
   * @return missionType
   */
  
  @Schema(name = "missionType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("missionType")
  public @Nullable MissionTypeEnum getMissionType() {
    return missionType;
  }

  public void setMissionType(@Nullable MissionTypeEnum missionType) {
    this.missionType = missionType;
  }

  public Mission title(@Nullable String title) {
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

  public Mission description(@Nullable String description) {
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

  public Mission costToPlay(@Nullable Integer costToPlay) {
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

  public Mission costToPlayType(@Nullable String costToPlayType) {
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

  public Mission games(List<@Valid Game> games) {
    this.games = games;
    return this;
  }

  public Mission addGamesItem(Game gamesItem) {
    if (this.games == null) {
      this.games = new ArrayList<>();
    }
    this.games.add(gamesItem);
    return this;
  }

  /**
   * Get games
   * @return games
   */
  @Valid 
  @Schema(name = "games", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("games")
  public List<@Valid Game> getGames() {
    return games;
  }

  public void setGames(List<@Valid Game> games) {
    this.games = games;
  }

  public Mission audiences(List<@Valid Audience> audiences) {
    this.audiences = audiences;
    return this;
  }

  public Mission addAudiencesItem(Audience audiencesItem) {
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
  public List<@Valid Audience> getAudiences() {
    return audiences;
  }

  public void setAudiences(List<@Valid Audience> audiences) {
    this.audiences = audiences;
  }

  public Mission startDate(@Nullable OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Get startDate
   * @return startDate
   */
  @Valid 
  @Schema(name = "startDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("startDate")
  public @Nullable OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(@Nullable OffsetDateTime startDate) {
    this.startDate = startDate;
  }

  public Mission endDate(@Nullable OffsetDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * Get endDate
   * @return endDate
   */
  @Valid 
  @Schema(name = "endDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("endDate")
  public @Nullable OffsetDateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(@Nullable OffsetDateTime endDate) {
    this.endDate = endDate;
  }

  public Mission sequenceType(@Nullable SequenceTypeEnum sequenceType) {
    this.sequenceType = sequenceType;
    return this;
  }

  /**
   * Get sequenceType
   * @return sequenceType
   */
  
  @Schema(name = "sequenceType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sequenceType")
  public @Nullable SequenceTypeEnum getSequenceType() {
    return sequenceType;
  }

  public void setSequenceType(@Nullable SequenceTypeEnum sequenceType) {
    this.sequenceType = sequenceType;
  }

  public Mission authorOverride(@Nullable String authorOverride) {
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

  public Mission icon(@Nullable Asset icon) {
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
  public @Nullable Asset getIcon() {
    return icon;
  }

  public void setIcon(@Nullable Asset icon) {
    this.icon = icon;
  }

  public Mission image(@Nullable Asset image) {
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
  public @Nullable Asset getImage() {
    return image;
  }

  public void setImage(@Nullable Asset image) {
    this.image = image;
  }

  public Mission offers(List<@Valid Offer> offers) {
    this.offers = offers;
    return this;
  }

  public Mission addOffersItem(Offer offersItem) {
    if (this.offers == null) {
      this.offers = new ArrayList<>();
    }
    this.offers.add(offersItem);
    return this;
  }

  /**
   * Get offers
   * @return offers
   */
  @Valid 
  @Schema(name = "offers", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("offers")
  public List<@Valid Offer> getOffers() {
    return offers;
  }

  public void setOffers(List<@Valid Offer> offers) {
    this.offers = offers;
  }

  public Mission visibility(@Nullable VisibilityEnum visibility) {
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

  public Mission task(@Nullable MissionTask task) {
    this.task = task;
    return this;
  }

  /**
   * Get task
   * @return task
   */
  @Valid 
  @Schema(name = "task", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("task")
  public @Nullable MissionTask getTask() {
    return task;
  }

  public void setTask(@Nullable MissionTask task) {
    this.task = task;
  }

  public Mission points(@Nullable Long points) {
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

  public Mission ticketType(@Nullable String ticketType) {
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

  public Mission ticketCount(@Nullable Long ticketCount) {
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

  public Mission allocateTickets(@Nullable Boolean allocateTickets) {
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

  public Mission billableEntity(@Nullable BillableEntity billableEntity) {
    this.billableEntity = billableEntity;
    return this;
  }

  /**
   * Get billableEntity
   * @return billableEntity
   */
  @Valid 
  @Schema(name = "billableEntity", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("billableEntity")
  public @Nullable BillableEntity getBillableEntity() {
    return billableEntity;
  }

  public void setBillableEntity(@Nullable BillableEntity billableEntity) {
    this.billableEntity = billableEntity;
  }

  public Mission balance(@Nullable Double balance) {
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

  public Mission startingLimit(@Nullable Integer startingLimit) {
    this.startingLimit = startingLimit;
    return this;
  }

  /**
   * Get startingLimit
   * @return startingLimit
   */
  
  @Schema(name = "startingLimit", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("startingLimit")
  public @Nullable Integer getStartingLimit() {
    return startingLimit;
  }

  public void setStartingLimit(@Nullable Integer startingLimit) {
    this.startingLimit = startingLimit;
  }

  public Mission availableLimit(@Nullable Integer availableLimit) {
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

  public Mission inviteCount(@Nullable Integer inviteCount) {
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

  public Mission acceptedCount(@Nullable Integer acceptedCount) {
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

  public Mission inviteStatus(@Nullable InviteStatusEnum inviteStatus) {
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

  public Mission childCount(@Nullable Long childCount) {
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

  public Mission secondsBetweenLevels(@Nullable Integer secondsBetweenLevels) {
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

  public Mission secondsBetweenPacks(@Nullable Integer secondsBetweenPacks) {
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

  public Mission maximumLevelLength(@Nullable Integer maximumLevelLength) {
    this.maximumLevelLength = maximumLevelLength;
    return this;
  }

  /**
   * Get maximumLevelLength
   * @return maximumLevelLength
   */
  
  @Schema(name = "maximumLevelLength", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("maximumLevelLength")
  public @Nullable Integer getMaximumLevelLength() {
    return maximumLevelLength;
  }

  public void setMaximumLevelLength(@Nullable Integer maximumLevelLength) {
    this.maximumLevelLength = maximumLevelLength;
  }

  public Mission enableBuyBack(@Nullable Boolean enableBuyBack) {
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

  public Mission activePack(@Nullable Pack activePack) {
    this.activePack = activePack;
    return this;
  }

  /**
   * Get activePack
   * @return activePack
   */
  @Valid 
  @Schema(name = "activePack", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("activePack")
  public @Nullable Pack getActivePack() {
    return activePack;
  }

  public void setActivePack(@Nullable Pack activePack) {
    this.activePack = activePack;
  }

  public Mission minimumToPlay(@Nullable Integer minimumToPlay) {
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

  public Mission fixedReward(@Nullable Boolean fixedReward) {
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

  public Mission refunded(@Nullable Boolean refunded) {
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

  public Mission notificationsCreated(@Nullable Boolean notificationsCreated) {
    this.notificationsCreated = notificationsCreated;
    return this;
  }

  /**
   * Get notificationsCreated
   * @return notificationsCreated
   */
  
  @Schema(name = "notificationsCreated", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("notificationsCreated")
  public @Nullable Boolean getNotificationsCreated() {
    return notificationsCreated;
  }

  public void setNotificationsCreated(@Nullable Boolean notificationsCreated) {
    this.notificationsCreated = notificationsCreated;
  }

  public Mission rewarded(@Nullable Boolean rewarded) {
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

  public Mission externalId(@Nullable Long externalId) {
    this.externalId = externalId;
    return this;
  }

  /**
   * Get externalId
   * @return externalId
   */
  
  @Schema(name = "externalId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("externalId")
  public @Nullable Long getExternalId() {
    return externalId;
  }

  public void setExternalId(@Nullable Long externalId) {
    this.externalId = externalId;
  }

  public Mission advancedReporting(@Nullable Boolean advancedReporting) {
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

  public Mission splitReward(@Nullable SplitRewardEnum splitReward) {
    this.splitReward = splitReward;
    return this;
  }

  /**
   * Get splitReward
   * @return splitReward
   */
  
  @Schema(name = "splitReward", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("splitReward")
  public @Nullable SplitRewardEnum getSplitReward() {
    return splitReward;
  }

  public void setSplitReward(@Nullable SplitRewardEnum splitReward) {
    this.splitReward = splitReward;
  }

  public Mission joinCode(@Nullable String joinCode) {
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

  public Mission firstPack(@Nullable Pack firstPack) {
    this.firstPack = firstPack;
    return this;
  }

  /**
   * Get firstPack
   * @return firstPack
   */
  @Valid 
  @Schema(name = "firstPack", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("firstPack")
  public @Nullable Pack getFirstPack() {
    return firstPack;
  }

  public void setFirstPack(@Nullable Pack firstPack) {
    this.firstPack = firstPack;
  }

  public Mission allGameLevels(List<@Valid GameLevel> allGameLevels) {
    this.allGameLevels = allGameLevels;
    return this;
  }

  public Mission addAllGameLevelsItem(GameLevel allGameLevelsItem) {
    if (this.allGameLevels == null) {
      this.allGameLevels = new ArrayList<>();
    }
    this.allGameLevels.add(allGameLevelsItem);
    return this;
  }

  /**
   * Get allGameLevels
   * @return allGameLevels
   */
  @Valid 
  @Schema(name = "allGameLevels", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("allGameLevels")
  public List<@Valid GameLevel> getAllGameLevels() {
    return allGameLevels;
  }

  public void setAllGameLevels(List<@Valid GameLevel> allGameLevels) {
    this.allGameLevels = allGameLevels;
  }

  public Mission allPacks(List<@Valid Pack> allPacks) {
    this.allPacks = allPacks;
    return this;
  }

  public Mission addAllPacksItem(Pack allPacksItem) {
    if (this.allPacks == null) {
      this.allPacks = new ArrayList<>();
    }
    this.allPacks.add(allPacksItem);
    return this;
  }

  /**
   * Get allPacks
   * @return allPacks
   */
  @Valid 
  @Schema(name = "allPacks", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("allPacks")
  public List<@Valid Pack> getAllPacks() {
    return allPacks;
  }

  public void setAllPacks(List<@Valid Pack> allPacks) {
    this.allPacks = allPacks;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Mission mission = (Mission) o;
    return Objects.equals(this.id, mission.id) &&
        Objects.equals(this.active, mission.active) &&
        Objects.equals(this.valid, mission.valid) &&
        Objects.equals(this.owner, mission.owner) &&
        Objects.equals(this.missionType, mission.missionType) &&
        Objects.equals(this.title, mission.title) &&
        Objects.equals(this.description, mission.description) &&
        Objects.equals(this.costToPlay, mission.costToPlay) &&
        Objects.equals(this.costToPlayType, mission.costToPlayType) &&
        Objects.equals(this.games, mission.games) &&
        Objects.equals(this.audiences, mission.audiences) &&
        Objects.equals(this.startDate, mission.startDate) &&
        Objects.equals(this.endDate, mission.endDate) &&
        Objects.equals(this.sequenceType, mission.sequenceType) &&
        Objects.equals(this.authorOverride, mission.authorOverride) &&
        Objects.equals(this.icon, mission.icon) &&
        Objects.equals(this.image, mission.image) &&
        Objects.equals(this.offers, mission.offers) &&
        Objects.equals(this.visibility, mission.visibility) &&
        Objects.equals(this.task, mission.task) &&
        Objects.equals(this.points, mission.points) &&
        Objects.equals(this.ticketType, mission.ticketType) &&
        Objects.equals(this.ticketCount, mission.ticketCount) &&
        Objects.equals(this.allocateTickets, mission.allocateTickets) &&
        Objects.equals(this.billableEntity, mission.billableEntity) &&
        Objects.equals(this.balance, mission.balance) &&
        Objects.equals(this.startingLimit, mission.startingLimit) &&
        Objects.equals(this.availableLimit, mission.availableLimit) &&
        Objects.equals(this.inviteCount, mission.inviteCount) &&
        Objects.equals(this.acceptedCount, mission.acceptedCount) &&
        Objects.equals(this.inviteStatus, mission.inviteStatus) &&
        Objects.equals(this.childCount, mission.childCount) &&
        Objects.equals(this.secondsBetweenLevels, mission.secondsBetweenLevels) &&
        Objects.equals(this.secondsBetweenPacks, mission.secondsBetweenPacks) &&
        Objects.equals(this.maximumLevelLength, mission.maximumLevelLength) &&
        Objects.equals(this.enableBuyBack, mission.enableBuyBack) &&
        Objects.equals(this.activePack, mission.activePack) &&
        Objects.equals(this.minimumToPlay, mission.minimumToPlay) &&
        Objects.equals(this.fixedReward, mission.fixedReward) &&
        Objects.equals(this.refunded, mission.refunded) &&
        Objects.equals(this.notificationsCreated, mission.notificationsCreated) &&
        Objects.equals(this.rewarded, mission.rewarded) &&
        Objects.equals(this.externalId, mission.externalId) &&
        Objects.equals(this.advancedReporting, mission.advancedReporting) &&
        Objects.equals(this.splitReward, mission.splitReward) &&
        Objects.equals(this.joinCode, mission.joinCode) &&
        Objects.equals(this.firstPack, mission.firstPack) &&
        Objects.equals(this.allGameLevels, mission.allGameLevels) &&
        Objects.equals(this.allPacks, mission.allPacks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, active, valid, owner, missionType, title, description, costToPlay, costToPlayType, games, audiences, startDate, endDate, sequenceType, authorOverride, icon, image, offers, visibility, task, points, ticketType, ticketCount, allocateTickets, billableEntity, balance, startingLimit, availableLimit, inviteCount, acceptedCount, inviteStatus, childCount, secondsBetweenLevels, secondsBetweenPacks, maximumLevelLength, enableBuyBack, activePack, minimumToPlay, fixedReward, refunded, notificationsCreated, rewarded, externalId, advancedReporting, splitReward, joinCode, firstPack, allGameLevels, allPacks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Mission {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    missionType: ").append(toIndentedString(missionType)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    costToPlay: ").append(toIndentedString(costToPlay)).append("\n");
    sb.append("    costToPlayType: ").append(toIndentedString(costToPlayType)).append("\n");
    sb.append("    games: ").append(toIndentedString(games)).append("\n");
    sb.append("    audiences: ").append(toIndentedString(audiences)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    sequenceType: ").append(toIndentedString(sequenceType)).append("\n");
    sb.append("    authorOverride: ").append(toIndentedString(authorOverride)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    offers: ").append(toIndentedString(offers)).append("\n");
    sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
    sb.append("    task: ").append(toIndentedString(task)).append("\n");
    sb.append("    points: ").append(toIndentedString(points)).append("\n");
    sb.append("    ticketType: ").append(toIndentedString(ticketType)).append("\n");
    sb.append("    ticketCount: ").append(toIndentedString(ticketCount)).append("\n");
    sb.append("    allocateTickets: ").append(toIndentedString(allocateTickets)).append("\n");
    sb.append("    billableEntity: ").append(toIndentedString(billableEntity)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    startingLimit: ").append(toIndentedString(startingLimit)).append("\n");
    sb.append("    availableLimit: ").append(toIndentedString(availableLimit)).append("\n");
    sb.append("    inviteCount: ").append(toIndentedString(inviteCount)).append("\n");
    sb.append("    acceptedCount: ").append(toIndentedString(acceptedCount)).append("\n");
    sb.append("    inviteStatus: ").append(toIndentedString(inviteStatus)).append("\n");
    sb.append("    childCount: ").append(toIndentedString(childCount)).append("\n");
    sb.append("    secondsBetweenLevels: ").append(toIndentedString(secondsBetweenLevels)).append("\n");
    sb.append("    secondsBetweenPacks: ").append(toIndentedString(secondsBetweenPacks)).append("\n");
    sb.append("    maximumLevelLength: ").append(toIndentedString(maximumLevelLength)).append("\n");
    sb.append("    enableBuyBack: ").append(toIndentedString(enableBuyBack)).append("\n");
    sb.append("    activePack: ").append(toIndentedString(activePack)).append("\n");
    sb.append("    minimumToPlay: ").append(toIndentedString(minimumToPlay)).append("\n");
    sb.append("    fixedReward: ").append(toIndentedString(fixedReward)).append("\n");
    sb.append("    refunded: ").append(toIndentedString(refunded)).append("\n");
    sb.append("    notificationsCreated: ").append(toIndentedString(notificationsCreated)).append("\n");
    sb.append("    rewarded: ").append(toIndentedString(rewarded)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    advancedReporting: ").append(toIndentedString(advancedReporting)).append("\n");
    sb.append("    splitReward: ").append(toIndentedString(splitReward)).append("\n");
    sb.append("    joinCode: ").append(toIndentedString(joinCode)).append("\n");
    sb.append("    firstPack: ").append(toIndentedString(firstPack)).append("\n");
    sb.append("    allGameLevels: ").append(toIndentedString(allGameLevels)).append("\n");
    sb.append("    allPacks: ").append(toIndentedString(allPacks)).append("\n");
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


package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
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
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Mission  {
  
  @ApiModelProperty(value = "")

  private Long id;

  @ApiModelProperty(value = "")

  private Boolean active;

  @ApiModelProperty(value = "")

  private Boolean valid;

  @ApiModelProperty(value = "")

  @Valid

  private Account owner;

public enum MissionTypeEnum {

PUBLIC(String.valueOf("PUBLIC")), SHARED(String.valueOf("SHARED")), TOURNAMENT(String.valueOf("TOURNAMENT")), POOLPLAY(String.valueOf("POOLPLAY"));


    private String value;

    MissionTypeEnum (String v) {
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
    public static MissionTypeEnum fromValue(String value) {
        for (MissionTypeEnum b : MissionTypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(value = "")

  private MissionTypeEnum missionType;

  @ApiModelProperty(value = "")

  private String title;

  @ApiModelProperty(value = "")

  private String description;

  @ApiModelProperty(value = "")

  private Integer costToPlay;

  @ApiModelProperty(value = "")

  private String costToPlayType;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid Game> games = new ArrayList<>();

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid Audience> audiences = new ArrayList<>();

  @ApiModelProperty(value = "")

  private Date startDate;

  @ApiModelProperty(value = "")

  private Date endDate;

public enum SequenceTypeEnum {

FIRST_AVAILABLE(String.valueOf("FIRST_AVAILABLE")), ALL_AVAILABLE(String.valueOf("ALL_AVAILABLE"));


    private String value;

    SequenceTypeEnum (String v) {
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
    public static SequenceTypeEnum fromValue(String value) {
        for (SequenceTypeEnum b : SequenceTypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(value = "")

  private SequenceTypeEnum sequenceType;

  @ApiModelProperty(value = "")

  private String authorOverride;

  @ApiModelProperty(value = "")

  @Valid

  private Asset icon;

  @ApiModelProperty(value = "")

  @Valid

  private Asset image;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid Offer> offers = new ArrayList<>();

public enum VisibilityEnum {

PUBLIC(String.valueOf("PUBLIC")), LISTABLE(String.valueOf("LISTABLE")), REWARDABLE(String.valueOf("REWARDABLE")), TRIGGERABLE(String.valueOf("TRIGGERABLE")), PRIVATE(String.valueOf("PRIVATE"));


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

  private MissionTask task;

  @ApiModelProperty(value = "")

  private Long points;

  @ApiModelProperty(value = "")

  private String ticketType;

  @ApiModelProperty(value = "")

  private Long ticketCount;

  @ApiModelProperty(value = "")

  private Boolean allocateTickets;

  @ApiModelProperty(value = "")

  @Valid

  private BillableEntity billableEntity;

  @ApiModelProperty(value = "")

  private Double balance;

  @ApiModelProperty(value = "")

  private Integer startingLimit;

  @ApiModelProperty(value = "")

  private Integer availableLimit;

  @ApiModelProperty(value = "")

  private Integer inviteCount;

  @ApiModelProperty(value = "")

  private Integer acceptedCount;

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

  @ApiModelProperty(value = "")

  private Long childCount;

  @ApiModelProperty(value = "")

  private Integer secondsBetweenLevels;

  @ApiModelProperty(value = "")

  private Integer secondsBetweenPacks;

  @ApiModelProperty(value = "")

  private Integer maximumLevelLength;

  @ApiModelProperty(value = "")

  private Boolean enableBuyBack;

  @ApiModelProperty(value = "")

  @Valid

  private Pack activePack;

  @ApiModelProperty(value = "")

  private Integer minimumToPlay;

  @ApiModelProperty(value = "")

  private Boolean fixedReward;

  @ApiModelProperty(value = "")

  private Boolean refunded;

  @ApiModelProperty(value = "")

  private Boolean notificationsCreated;

  @ApiModelProperty(value = "")

  private Boolean rewarded;

  @ApiModelProperty(value = "")

  private Long externalId;

  @ApiModelProperty(value = "")

  private Boolean advancedReporting;

public enum SplitRewardEnum {

EVEN(String.valueOf("EVEN")), ALL(String.valueOf("ALL")), FIRST(String.valueOf("FIRST")), RANDOM(String.valueOf("RANDOM"));


    private String value;

    SplitRewardEnum (String v) {
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
    public static SplitRewardEnum fromValue(String value) {
        for (SplitRewardEnum b : SplitRewardEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(value = "")

  private SplitRewardEnum splitReward;

  @ApiModelProperty(value = "")

  private String joinCode;

  @ApiModelProperty(value = "")

  @Valid

  private Pack firstPack;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid GameLevel> allGameLevels = new ArrayList<>();

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid Pack> allPacks = new ArrayList<>();
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

  public Mission id(Long id) {
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

  public Mission active(Boolean active) {
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

  public Mission valid(Boolean valid) {
    this.valid = valid;
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

  public Mission owner(Account owner) {
    this.owner = owner;
    return this;
  }

 /**
   * Get missionType
   * @return missionType
  **/
  @JsonProperty("missionType")
  public String getMissionType() {
    if (missionType == null) {
      return null;
    }
    return missionType.value();
  }

  public void setMissionType(MissionTypeEnum missionType) {
    this.missionType = missionType;
  }

  public Mission missionType(MissionTypeEnum missionType) {
    this.missionType = missionType;
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

  public Mission title(String title) {
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

  public Mission description(String description) {
    this.description = description;
    return this;
  }

 /**
   * Get costToPlay
   * @return costToPlay
  **/
  @JsonProperty("costToPlay")
  public Integer getCostToPlay() {
    return costToPlay;
  }

  public void setCostToPlay(Integer costToPlay) {
    this.costToPlay = costToPlay;
  }

  public Mission costToPlay(Integer costToPlay) {
    this.costToPlay = costToPlay;
    return this;
  }

 /**
   * Get costToPlayType
   * @return costToPlayType
  **/
  @JsonProperty("costToPlayType")
  public String getCostToPlayType() {
    return costToPlayType;
  }

  public void setCostToPlayType(String costToPlayType) {
    this.costToPlayType = costToPlayType;
  }

  public Mission costToPlayType(String costToPlayType) {
    this.costToPlayType = costToPlayType;
    return this;
  }

 /**
   * Get games
   * @return games
  **/
  @JsonProperty("games")
  public List<@Valid Game> getGames() {
    return games;
  }

  public void setGames(List<@Valid Game> games) {
    this.games = games;
  }

  public Mission games(List<@Valid Game> games) {
    this.games = games;
    return this;
  }

  public Mission addGamesItem(Game gamesItem) {
    this.games.add(gamesItem);
    return this;
  }

 /**
   * Get audiences
   * @return audiences
  **/
  @JsonProperty("audiences")
  public List<@Valid Audience> getAudiences() {
    return audiences;
  }

  public void setAudiences(List<@Valid Audience> audiences) {
    this.audiences = audiences;
  }

  public Mission audiences(List<@Valid Audience> audiences) {
    this.audiences = audiences;
    return this;
  }

  public Mission addAudiencesItem(Audience audiencesItem) {
    this.audiences.add(audiencesItem);
    return this;
  }

 /**
   * Get startDate
   * @return startDate
  **/
  @JsonProperty("startDate")
  public Date getStartDate() {
    return startDate;
  }

  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }

  public Mission startDate(Date startDate) {
    this.startDate = startDate;
    return this;
  }

 /**
   * Get endDate
   * @return endDate
  **/
  @JsonProperty("endDate")
  public Date getEndDate() {
    return endDate;
  }

  public void setEndDate(Date endDate) {
    this.endDate = endDate;
  }

  public Mission endDate(Date endDate) {
    this.endDate = endDate;
    return this;
  }

 /**
   * Get sequenceType
   * @return sequenceType
  **/
  @JsonProperty("sequenceType")
  public String getSequenceType() {
    if (sequenceType == null) {
      return null;
    }
    return sequenceType.value();
  }

  public void setSequenceType(SequenceTypeEnum sequenceType) {
    this.sequenceType = sequenceType;
  }

  public Mission sequenceType(SequenceTypeEnum sequenceType) {
    this.sequenceType = sequenceType;
    return this;
  }

 /**
   * Get authorOverride
   * @return authorOverride
  **/
  @JsonProperty("authorOverride")
  public String getAuthorOverride() {
    return authorOverride;
  }

  public void setAuthorOverride(String authorOverride) {
    this.authorOverride = authorOverride;
  }

  public Mission authorOverride(String authorOverride) {
    this.authorOverride = authorOverride;
    return this;
  }

 /**
   * Get icon
   * @return icon
  **/
  @JsonProperty("icon")
  public Asset getIcon() {
    return icon;
  }

  public void setIcon(Asset icon) {
    this.icon = icon;
  }

  public Mission icon(Asset icon) {
    this.icon = icon;
    return this;
  }

 /**
   * Get image
   * @return image
  **/
  @JsonProperty("image")
  public Asset getImage() {
    return image;
  }

  public void setImage(Asset image) {
    this.image = image;
  }

  public Mission image(Asset image) {
    this.image = image;
    return this;
  }

 /**
   * Get offers
   * @return offers
  **/
  @JsonProperty("offers")
  public List<@Valid Offer> getOffers() {
    return offers;
  }

  public void setOffers(List<@Valid Offer> offers) {
    this.offers = offers;
  }

  public Mission offers(List<@Valid Offer> offers) {
    this.offers = offers;
    return this;
  }

  public Mission addOffersItem(Offer offersItem) {
    this.offers.add(offersItem);
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

  public Mission visibility(VisibilityEnum visibility) {
    this.visibility = visibility;
    return this;
  }

 /**
   * Get task
   * @return task
  **/
  @JsonProperty("task")
  public MissionTask getTask() {
    return task;
  }

  public void setTask(MissionTask task) {
    this.task = task;
  }

  public Mission task(MissionTask task) {
    this.task = task;
    return this;
  }

 /**
   * Get points
   * @return points
  **/
  @JsonProperty("points")
  public Long getPoints() {
    return points;
  }

  public void setPoints(Long points) {
    this.points = points;
  }

  public Mission points(Long points) {
    this.points = points;
    return this;
  }

 /**
   * Get ticketType
   * @return ticketType
  **/
  @JsonProperty("ticketType")
  public String getTicketType() {
    return ticketType;
  }

  public void setTicketType(String ticketType) {
    this.ticketType = ticketType;
  }

  public Mission ticketType(String ticketType) {
    this.ticketType = ticketType;
    return this;
  }

 /**
   * Get ticketCount
   * @return ticketCount
  **/
  @JsonProperty("ticketCount")
  public Long getTicketCount() {
    return ticketCount;
  }

  public void setTicketCount(Long ticketCount) {
    this.ticketCount = ticketCount;
  }

  public Mission ticketCount(Long ticketCount) {
    this.ticketCount = ticketCount;
    return this;
  }

 /**
   * Get allocateTickets
   * @return allocateTickets
  **/
  @JsonProperty("allocateTickets")
  public Boolean getAllocateTickets() {
    return allocateTickets;
  }

  public void setAllocateTickets(Boolean allocateTickets) {
    this.allocateTickets = allocateTickets;
  }

  public Mission allocateTickets(Boolean allocateTickets) {
    this.allocateTickets = allocateTickets;
    return this;
  }

 /**
   * Get billableEntity
   * @return billableEntity
  **/
  @JsonProperty("billableEntity")
  public BillableEntity getBillableEntity() {
    return billableEntity;
  }

  public void setBillableEntity(BillableEntity billableEntity) {
    this.billableEntity = billableEntity;
  }

  public Mission billableEntity(BillableEntity billableEntity) {
    this.billableEntity = billableEntity;
    return this;
  }

 /**
   * Get balance
   * @return balance
  **/
  @JsonProperty("balance")
  public Double getBalance() {
    return balance;
  }

  public void setBalance(Double balance) {
    this.balance = balance;
  }

  public Mission balance(Double balance) {
    this.balance = balance;
    return this;
  }

 /**
   * Get startingLimit
   * @return startingLimit
  **/
  @JsonProperty("startingLimit")
  public Integer getStartingLimit() {
    return startingLimit;
  }

  public void setStartingLimit(Integer startingLimit) {
    this.startingLimit = startingLimit;
  }

  public Mission startingLimit(Integer startingLimit) {
    this.startingLimit = startingLimit;
    return this;
  }

 /**
   * Get availableLimit
   * @return availableLimit
  **/
  @JsonProperty("availableLimit")
  public Integer getAvailableLimit() {
    return availableLimit;
  }

  public void setAvailableLimit(Integer availableLimit) {
    this.availableLimit = availableLimit;
  }

  public Mission availableLimit(Integer availableLimit) {
    this.availableLimit = availableLimit;
    return this;
  }

 /**
   * Get inviteCount
   * @return inviteCount
  **/
  @JsonProperty("inviteCount")
  public Integer getInviteCount() {
    return inviteCount;
  }

  public void setInviteCount(Integer inviteCount) {
    this.inviteCount = inviteCount;
  }

  public Mission inviteCount(Integer inviteCount) {
    this.inviteCount = inviteCount;
    return this;
  }

 /**
   * Get acceptedCount
   * @return acceptedCount
  **/
  @JsonProperty("acceptedCount")
  public Integer getAcceptedCount() {
    return acceptedCount;
  }

  public void setAcceptedCount(Integer acceptedCount) {
    this.acceptedCount = acceptedCount;
  }

  public Mission acceptedCount(Integer acceptedCount) {
    this.acceptedCount = acceptedCount;
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

  public Mission inviteStatus(InviteStatusEnum inviteStatus) {
    this.inviteStatus = inviteStatus;
    return this;
  }

 /**
   * Get childCount
   * @return childCount
  **/
  @JsonProperty("childCount")
  public Long getChildCount() {
    return childCount;
  }

  public void setChildCount(Long childCount) {
    this.childCount = childCount;
  }

  public Mission childCount(Long childCount) {
    this.childCount = childCount;
    return this;
  }

 /**
   * Get secondsBetweenLevels
   * @return secondsBetweenLevels
  **/
  @JsonProperty("secondsBetweenLevels")
  public Integer getSecondsBetweenLevels() {
    return secondsBetweenLevels;
  }

  public void setSecondsBetweenLevels(Integer secondsBetweenLevels) {
    this.secondsBetweenLevels = secondsBetweenLevels;
  }

  public Mission secondsBetweenLevels(Integer secondsBetweenLevels) {
    this.secondsBetweenLevels = secondsBetweenLevels;
    return this;
  }

 /**
   * Get secondsBetweenPacks
   * @return secondsBetweenPacks
  **/
  @JsonProperty("secondsBetweenPacks")
  public Integer getSecondsBetweenPacks() {
    return secondsBetweenPacks;
  }

  public void setSecondsBetweenPacks(Integer secondsBetweenPacks) {
    this.secondsBetweenPacks = secondsBetweenPacks;
  }

  public Mission secondsBetweenPacks(Integer secondsBetweenPacks) {
    this.secondsBetweenPacks = secondsBetweenPacks;
    return this;
  }

 /**
   * Get maximumLevelLength
   * @return maximumLevelLength
  **/
  @JsonProperty("maximumLevelLength")
  public Integer getMaximumLevelLength() {
    return maximumLevelLength;
  }

  public void setMaximumLevelLength(Integer maximumLevelLength) {
    this.maximumLevelLength = maximumLevelLength;
  }

  public Mission maximumLevelLength(Integer maximumLevelLength) {
    this.maximumLevelLength = maximumLevelLength;
    return this;
  }

 /**
   * Get enableBuyBack
   * @return enableBuyBack
  **/
  @JsonProperty("enableBuyBack")
  public Boolean getEnableBuyBack() {
    return enableBuyBack;
  }

  public void setEnableBuyBack(Boolean enableBuyBack) {
    this.enableBuyBack = enableBuyBack;
  }

  public Mission enableBuyBack(Boolean enableBuyBack) {
    this.enableBuyBack = enableBuyBack;
    return this;
  }

 /**
   * Get activePack
   * @return activePack
  **/
  @JsonProperty("activePack")
  public Pack getActivePack() {
    return activePack;
  }

  public void setActivePack(Pack activePack) {
    this.activePack = activePack;
  }

  public Mission activePack(Pack activePack) {
    this.activePack = activePack;
    return this;
  }

 /**
   * Get minimumToPlay
   * @return minimumToPlay
  **/
  @JsonProperty("minimumToPlay")
  public Integer getMinimumToPlay() {
    return minimumToPlay;
  }

  public void setMinimumToPlay(Integer minimumToPlay) {
    this.minimumToPlay = minimumToPlay;
  }

  public Mission minimumToPlay(Integer minimumToPlay) {
    this.minimumToPlay = minimumToPlay;
    return this;
  }

 /**
   * Get fixedReward
   * @return fixedReward
  **/
  @JsonProperty("fixedReward")
  public Boolean getFixedReward() {
    return fixedReward;
  }

  public void setFixedReward(Boolean fixedReward) {
    this.fixedReward = fixedReward;
  }

  public Mission fixedReward(Boolean fixedReward) {
    this.fixedReward = fixedReward;
    return this;
  }

 /**
   * Get refunded
   * @return refunded
  **/
  @JsonProperty("refunded")
  public Boolean getRefunded() {
    return refunded;
  }

  public void setRefunded(Boolean refunded) {
    this.refunded = refunded;
  }

  public Mission refunded(Boolean refunded) {
    this.refunded = refunded;
    return this;
  }

 /**
   * Get notificationsCreated
   * @return notificationsCreated
  **/
  @JsonProperty("notificationsCreated")
  public Boolean getNotificationsCreated() {
    return notificationsCreated;
  }

  public void setNotificationsCreated(Boolean notificationsCreated) {
    this.notificationsCreated = notificationsCreated;
  }

  public Mission notificationsCreated(Boolean notificationsCreated) {
    this.notificationsCreated = notificationsCreated;
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

  public Mission rewarded(Boolean rewarded) {
    this.rewarded = rewarded;
    return this;
  }

 /**
   * Get externalId
   * @return externalId
  **/
  @JsonProperty("externalId")
  public Long getExternalId() {
    return externalId;
  }

  public void setExternalId(Long externalId) {
    this.externalId = externalId;
  }

  public Mission externalId(Long externalId) {
    this.externalId = externalId;
    return this;
  }

 /**
   * Get advancedReporting
   * @return advancedReporting
  **/
  @JsonProperty("advancedReporting")
  public Boolean getAdvancedReporting() {
    return advancedReporting;
  }

  public void setAdvancedReporting(Boolean advancedReporting) {
    this.advancedReporting = advancedReporting;
  }

  public Mission advancedReporting(Boolean advancedReporting) {
    this.advancedReporting = advancedReporting;
    return this;
  }

 /**
   * Get splitReward
   * @return splitReward
  **/
  @JsonProperty("splitReward")
  public String getSplitReward() {
    if (splitReward == null) {
      return null;
    }
    return splitReward.value();
  }

  public void setSplitReward(SplitRewardEnum splitReward) {
    this.splitReward = splitReward;
  }

  public Mission splitReward(SplitRewardEnum splitReward) {
    this.splitReward = splitReward;
    return this;
  }

 /**
   * Get joinCode
   * @return joinCode
  **/
  @JsonProperty("joinCode")
  public String getJoinCode() {
    return joinCode;
  }

  public void setJoinCode(String joinCode) {
    this.joinCode = joinCode;
  }

  public Mission joinCode(String joinCode) {
    this.joinCode = joinCode;
    return this;
  }

 /**
   * Get firstPack
   * @return firstPack
  **/
  @JsonProperty("firstPack")
  public Pack getFirstPack() {
    return firstPack;
  }

  public void setFirstPack(Pack firstPack) {
    this.firstPack = firstPack;
  }

  public Mission firstPack(Pack firstPack) {
    this.firstPack = firstPack;
    return this;
  }

 /**
   * Get allGameLevels
   * @return allGameLevels
  **/
  @JsonProperty("allGameLevels")
  public List<@Valid GameLevel> getAllGameLevels() {
    return allGameLevels;
  }

  public void setAllGameLevels(List<@Valid GameLevel> allGameLevels) {
    this.allGameLevels = allGameLevels;
  }

  public Mission allGameLevels(List<@Valid GameLevel> allGameLevels) {
    this.allGameLevels = allGameLevels;
    return this;
  }

  public Mission addAllGameLevelsItem(GameLevel allGameLevelsItem) {
    this.allGameLevels.add(allGameLevelsItem);
    return this;
  }

 /**
   * Get allPacks
   * @return allPacks
  **/
  @JsonProperty("allPacks")
  public List<@Valid Pack> getAllPacks() {
    return allPacks;
  }

  public void setAllPacks(List<@Valid Pack> allPacks) {
    this.allPacks = allPacks;
  }

  public Mission allPacks(List<@Valid Pack> allPacks) {
    this.allPacks = allPacks;
    return this;
  }

  public Mission addAllPacksItem(Pack allPacksItem) {
    this.allPacks.add(allPacksItem);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


package apimodels;

import apimodels.Account;
import apimodels.Asset;
import apimodels.Audience;
import apimodels.BillableEntity;
import apimodels.Game;
import apimodels.GameLevel;
import apimodels.MissionTask;
import apimodels.Offer;
import apimodels.Pack;
import java.time.OffsetDateTime;
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
 * Mission
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class Mission   {
  @JsonProperty("id")
  
  private Long id;

  @JsonProperty("active")
  
  private Boolean active;

  @JsonProperty("valid")
  
  private Boolean valid;

  @JsonProperty("owner")
  @Valid

  private Account owner;

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

  @JsonProperty("missionType")
  
  private MissionTypeEnum missionType;

  @JsonProperty("title")
  
  private String title;

  @JsonProperty("description")
  
  private String description;

  @JsonProperty("costToPlay")
  
  private Integer costToPlay;

  @JsonProperty("costToPlayType")
  
  private String costToPlayType;

  @JsonProperty("games")
  @Valid

  private List<@Valid Game> games = null;

  @JsonProperty("audiences")
  @Valid

  private List<@Valid Audience> audiences = null;

  @JsonProperty("startDate")
  @Valid

  private OffsetDateTime startDate;

  @JsonProperty("endDate")
  @Valid

  private OffsetDateTime endDate;

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

  @JsonProperty("sequenceType")
  
  private SequenceTypeEnum sequenceType;

  @JsonProperty("authorOverride")
  
  private String authorOverride;

  @JsonProperty("icon")
  @Valid

  private Asset icon;

  @JsonProperty("image")
  @Valid

  private Asset image;

  @JsonProperty("offers")
  @Valid

  private List<@Valid Offer> offers = null;

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

  @JsonProperty("task")
  @Valid

  private MissionTask task;

  @JsonProperty("points")
  
  private Long points;

  @JsonProperty("ticketType")
  
  private String ticketType;

  @JsonProperty("ticketCount")
  
  private Long ticketCount;

  @JsonProperty("allocateTickets")
  
  private Boolean allocateTickets;

  @JsonProperty("billableEntity")
  @Valid

  private BillableEntity billableEntity;

  @JsonProperty("balance")
  
  private Double balance;

  @JsonProperty("startingLimit")
  
  private Integer startingLimit;

  @JsonProperty("availableLimit")
  
  private Integer availableLimit;

  @JsonProperty("inviteCount")
  
  private Integer inviteCount;

  @JsonProperty("acceptedCount")
  
  private Integer acceptedCount;

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

  @JsonProperty("childCount")
  
  private Long childCount;

  @JsonProperty("secondsBetweenLevels")
  
  private Integer secondsBetweenLevels;

  @JsonProperty("secondsBetweenPacks")
  
  private Integer secondsBetweenPacks;

  @JsonProperty("maximumLevelLength")
  
  private Integer maximumLevelLength;

  @JsonProperty("enableBuyBack")
  
  private Boolean enableBuyBack;

  @JsonProperty("activePack")
  @Valid

  private Pack activePack;

  @JsonProperty("minimumToPlay")
  
  private Integer minimumToPlay;

  @JsonProperty("fixedReward")
  
  private Boolean fixedReward;

  @JsonProperty("refunded")
  
  private Boolean refunded;

  @JsonProperty("notificationsCreated")
  
  private Boolean notificationsCreated;

  @JsonProperty("rewarded")
  
  private Boolean rewarded;

  @JsonProperty("externalId")
  
  private Long externalId;

  @JsonProperty("advancedReporting")
  
  private Boolean advancedReporting;

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

  @JsonProperty("splitReward")
  
  private SplitRewardEnum splitReward;

  @JsonProperty("joinCode")
  
  private String joinCode;

  @JsonProperty("firstPack")
  @Valid

  private Pack firstPack;

  @JsonProperty("allGameLevels")
  @Valid

  private List<@Valid GameLevel> allGameLevels = null;

  @JsonProperty("allPacks")
  @Valid

  private List<@Valid Pack> allPacks = null;

  public Mission id(Long id) {
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

  public Mission active(Boolean active) {
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

  public Mission valid(Boolean valid) {
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

  public Mission owner(Account owner) {
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

  public Mission missionType(MissionTypeEnum missionType) {
    this.missionType = missionType;
    return this;
  }

   /**
   * Get missionType
   * @return missionType
  **/
  public MissionTypeEnum getMissionType() {
    return missionType;
  }

  public void setMissionType(MissionTypeEnum missionType) {
    this.missionType = missionType;
  }

  public Mission title(String title) {
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

  public Mission description(String description) {
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

  public Mission costToPlay(Integer costToPlay) {
    this.costToPlay = costToPlay;
    return this;
  }

   /**
   * Get costToPlay
   * @return costToPlay
  **/
  public Integer getCostToPlay() {
    return costToPlay;
  }

  public void setCostToPlay(Integer costToPlay) {
    this.costToPlay = costToPlay;
  }

  public Mission costToPlayType(String costToPlayType) {
    this.costToPlayType = costToPlayType;
    return this;
  }

   /**
   * Get costToPlayType
   * @return costToPlayType
  **/
  public String getCostToPlayType() {
    return costToPlayType;
  }

  public void setCostToPlayType(String costToPlayType) {
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
  **/
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
  **/
  public List<@Valid Audience> getAudiences() {
    return audiences;
  }

  public void setAudiences(List<@Valid Audience> audiences) {
    this.audiences = audiences;
  }

  public Mission startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }

  public Mission endDate(OffsetDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * Get endDate
   * @return endDate
  **/
  public OffsetDateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }

  public Mission sequenceType(SequenceTypeEnum sequenceType) {
    this.sequenceType = sequenceType;
    return this;
  }

   /**
   * Get sequenceType
   * @return sequenceType
  **/
  public SequenceTypeEnum getSequenceType() {
    return sequenceType;
  }

  public void setSequenceType(SequenceTypeEnum sequenceType) {
    this.sequenceType = sequenceType;
  }

  public Mission authorOverride(String authorOverride) {
    this.authorOverride = authorOverride;
    return this;
  }

   /**
   * Get authorOverride
   * @return authorOverride
  **/
  public String getAuthorOverride() {
    return authorOverride;
  }

  public void setAuthorOverride(String authorOverride) {
    this.authorOverride = authorOverride;
  }

  public Mission icon(Asset icon) {
    this.icon = icon;
    return this;
  }

   /**
   * Get icon
   * @return icon
  **/
  public Asset getIcon() {
    return icon;
  }

  public void setIcon(Asset icon) {
    this.icon = icon;
  }

  public Mission image(Asset image) {
    this.image = image;
    return this;
  }

   /**
   * Get image
   * @return image
  **/
  public Asset getImage() {
    return image;
  }

  public void setImage(Asset image) {
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
  **/
  public List<@Valid Offer> getOffers() {
    return offers;
  }

  public void setOffers(List<@Valid Offer> offers) {
    this.offers = offers;
  }

  public Mission visibility(VisibilityEnum visibility) {
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

  public Mission task(MissionTask task) {
    this.task = task;
    return this;
  }

   /**
   * Get task
   * @return task
  **/
  public MissionTask getTask() {
    return task;
  }

  public void setTask(MissionTask task) {
    this.task = task;
  }

  public Mission points(Long points) {
    this.points = points;
    return this;
  }

   /**
   * Get points
   * @return points
  **/
  public Long getPoints() {
    return points;
  }

  public void setPoints(Long points) {
    this.points = points;
  }

  public Mission ticketType(String ticketType) {
    this.ticketType = ticketType;
    return this;
  }

   /**
   * Get ticketType
   * @return ticketType
  **/
  public String getTicketType() {
    return ticketType;
  }

  public void setTicketType(String ticketType) {
    this.ticketType = ticketType;
  }

  public Mission ticketCount(Long ticketCount) {
    this.ticketCount = ticketCount;
    return this;
  }

   /**
   * Get ticketCount
   * @return ticketCount
  **/
  public Long getTicketCount() {
    return ticketCount;
  }

  public void setTicketCount(Long ticketCount) {
    this.ticketCount = ticketCount;
  }

  public Mission allocateTickets(Boolean allocateTickets) {
    this.allocateTickets = allocateTickets;
    return this;
  }

   /**
   * Get allocateTickets
   * @return allocateTickets
  **/
  public Boolean getAllocateTickets() {
    return allocateTickets;
  }

  public void setAllocateTickets(Boolean allocateTickets) {
    this.allocateTickets = allocateTickets;
  }

  public Mission billableEntity(BillableEntity billableEntity) {
    this.billableEntity = billableEntity;
    return this;
  }

   /**
   * Get billableEntity
   * @return billableEntity
  **/
  public BillableEntity getBillableEntity() {
    return billableEntity;
  }

  public void setBillableEntity(BillableEntity billableEntity) {
    this.billableEntity = billableEntity;
  }

  public Mission balance(Double balance) {
    this.balance = balance;
    return this;
  }

   /**
   * Get balance
   * @return balance
  **/
  public Double getBalance() {
    return balance;
  }

  public void setBalance(Double balance) {
    this.balance = balance;
  }

  public Mission startingLimit(Integer startingLimit) {
    this.startingLimit = startingLimit;
    return this;
  }

   /**
   * Get startingLimit
   * @return startingLimit
  **/
  public Integer getStartingLimit() {
    return startingLimit;
  }

  public void setStartingLimit(Integer startingLimit) {
    this.startingLimit = startingLimit;
  }

  public Mission availableLimit(Integer availableLimit) {
    this.availableLimit = availableLimit;
    return this;
  }

   /**
   * Get availableLimit
   * @return availableLimit
  **/
  public Integer getAvailableLimit() {
    return availableLimit;
  }

  public void setAvailableLimit(Integer availableLimit) {
    this.availableLimit = availableLimit;
  }

  public Mission inviteCount(Integer inviteCount) {
    this.inviteCount = inviteCount;
    return this;
  }

   /**
   * Get inviteCount
   * @return inviteCount
  **/
  public Integer getInviteCount() {
    return inviteCount;
  }

  public void setInviteCount(Integer inviteCount) {
    this.inviteCount = inviteCount;
  }

  public Mission acceptedCount(Integer acceptedCount) {
    this.acceptedCount = acceptedCount;
    return this;
  }

   /**
   * Get acceptedCount
   * @return acceptedCount
  **/
  public Integer getAcceptedCount() {
    return acceptedCount;
  }

  public void setAcceptedCount(Integer acceptedCount) {
    this.acceptedCount = acceptedCount;
  }

  public Mission inviteStatus(InviteStatusEnum inviteStatus) {
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

  public Mission childCount(Long childCount) {
    this.childCount = childCount;
    return this;
  }

   /**
   * Get childCount
   * @return childCount
  **/
  public Long getChildCount() {
    return childCount;
  }

  public void setChildCount(Long childCount) {
    this.childCount = childCount;
  }

  public Mission secondsBetweenLevels(Integer secondsBetweenLevels) {
    this.secondsBetweenLevels = secondsBetweenLevels;
    return this;
  }

   /**
   * Get secondsBetweenLevels
   * @return secondsBetweenLevels
  **/
  public Integer getSecondsBetweenLevels() {
    return secondsBetweenLevels;
  }

  public void setSecondsBetweenLevels(Integer secondsBetweenLevels) {
    this.secondsBetweenLevels = secondsBetweenLevels;
  }

  public Mission secondsBetweenPacks(Integer secondsBetweenPacks) {
    this.secondsBetweenPacks = secondsBetweenPacks;
    return this;
  }

   /**
   * Get secondsBetweenPacks
   * @return secondsBetweenPacks
  **/
  public Integer getSecondsBetweenPacks() {
    return secondsBetweenPacks;
  }

  public void setSecondsBetweenPacks(Integer secondsBetweenPacks) {
    this.secondsBetweenPacks = secondsBetweenPacks;
  }

  public Mission maximumLevelLength(Integer maximumLevelLength) {
    this.maximumLevelLength = maximumLevelLength;
    return this;
  }

   /**
   * Get maximumLevelLength
   * @return maximumLevelLength
  **/
  public Integer getMaximumLevelLength() {
    return maximumLevelLength;
  }

  public void setMaximumLevelLength(Integer maximumLevelLength) {
    this.maximumLevelLength = maximumLevelLength;
  }

  public Mission enableBuyBack(Boolean enableBuyBack) {
    this.enableBuyBack = enableBuyBack;
    return this;
  }

   /**
   * Get enableBuyBack
   * @return enableBuyBack
  **/
  public Boolean getEnableBuyBack() {
    return enableBuyBack;
  }

  public void setEnableBuyBack(Boolean enableBuyBack) {
    this.enableBuyBack = enableBuyBack;
  }

  public Mission activePack(Pack activePack) {
    this.activePack = activePack;
    return this;
  }

   /**
   * Get activePack
   * @return activePack
  **/
  public Pack getActivePack() {
    return activePack;
  }

  public void setActivePack(Pack activePack) {
    this.activePack = activePack;
  }

  public Mission minimumToPlay(Integer minimumToPlay) {
    this.minimumToPlay = minimumToPlay;
    return this;
  }

   /**
   * Get minimumToPlay
   * @return minimumToPlay
  **/
  public Integer getMinimumToPlay() {
    return minimumToPlay;
  }

  public void setMinimumToPlay(Integer minimumToPlay) {
    this.minimumToPlay = minimumToPlay;
  }

  public Mission fixedReward(Boolean fixedReward) {
    this.fixedReward = fixedReward;
    return this;
  }

   /**
   * Get fixedReward
   * @return fixedReward
  **/
  public Boolean getFixedReward() {
    return fixedReward;
  }

  public void setFixedReward(Boolean fixedReward) {
    this.fixedReward = fixedReward;
  }

  public Mission refunded(Boolean refunded) {
    this.refunded = refunded;
    return this;
  }

   /**
   * Get refunded
   * @return refunded
  **/
  public Boolean getRefunded() {
    return refunded;
  }

  public void setRefunded(Boolean refunded) {
    this.refunded = refunded;
  }

  public Mission notificationsCreated(Boolean notificationsCreated) {
    this.notificationsCreated = notificationsCreated;
    return this;
  }

   /**
   * Get notificationsCreated
   * @return notificationsCreated
  **/
  public Boolean getNotificationsCreated() {
    return notificationsCreated;
  }

  public void setNotificationsCreated(Boolean notificationsCreated) {
    this.notificationsCreated = notificationsCreated;
  }

  public Mission rewarded(Boolean rewarded) {
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

  public Mission externalId(Long externalId) {
    this.externalId = externalId;
    return this;
  }

   /**
   * Get externalId
   * @return externalId
  **/
  public Long getExternalId() {
    return externalId;
  }

  public void setExternalId(Long externalId) {
    this.externalId = externalId;
  }

  public Mission advancedReporting(Boolean advancedReporting) {
    this.advancedReporting = advancedReporting;
    return this;
  }

   /**
   * Get advancedReporting
   * @return advancedReporting
  **/
  public Boolean getAdvancedReporting() {
    return advancedReporting;
  }

  public void setAdvancedReporting(Boolean advancedReporting) {
    this.advancedReporting = advancedReporting;
  }

  public Mission splitReward(SplitRewardEnum splitReward) {
    this.splitReward = splitReward;
    return this;
  }

   /**
   * Get splitReward
   * @return splitReward
  **/
  public SplitRewardEnum getSplitReward() {
    return splitReward;
  }

  public void setSplitReward(SplitRewardEnum splitReward) {
    this.splitReward = splitReward;
  }

  public Mission joinCode(String joinCode) {
    this.joinCode = joinCode;
    return this;
  }

   /**
   * Get joinCode
   * @return joinCode
  **/
  public String getJoinCode() {
    return joinCode;
  }

  public void setJoinCode(String joinCode) {
    this.joinCode = joinCode;
  }

  public Mission firstPack(Pack firstPack) {
    this.firstPack = firstPack;
    return this;
  }

   /**
   * Get firstPack
   * @return firstPack
  **/
  public Pack getFirstPack() {
    return firstPack;
  }

  public void setFirstPack(Pack firstPack) {
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
  **/
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
  **/
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
    return Objects.equals(id, mission.id) &&
        Objects.equals(active, mission.active) &&
        Objects.equals(valid, mission.valid) &&
        Objects.equals(owner, mission.owner) &&
        Objects.equals(missionType, mission.missionType) &&
        Objects.equals(title, mission.title) &&
        Objects.equals(description, mission.description) &&
        Objects.equals(costToPlay, mission.costToPlay) &&
        Objects.equals(costToPlayType, mission.costToPlayType) &&
        Objects.equals(games, mission.games) &&
        Objects.equals(audiences, mission.audiences) &&
        Objects.equals(startDate, mission.startDate) &&
        Objects.equals(endDate, mission.endDate) &&
        Objects.equals(sequenceType, mission.sequenceType) &&
        Objects.equals(authorOverride, mission.authorOverride) &&
        Objects.equals(icon, mission.icon) &&
        Objects.equals(image, mission.image) &&
        Objects.equals(offers, mission.offers) &&
        Objects.equals(visibility, mission.visibility) &&
        Objects.equals(task, mission.task) &&
        Objects.equals(points, mission.points) &&
        Objects.equals(ticketType, mission.ticketType) &&
        Objects.equals(ticketCount, mission.ticketCount) &&
        Objects.equals(allocateTickets, mission.allocateTickets) &&
        Objects.equals(billableEntity, mission.billableEntity) &&
        Objects.equals(balance, mission.balance) &&
        Objects.equals(startingLimit, mission.startingLimit) &&
        Objects.equals(availableLimit, mission.availableLimit) &&
        Objects.equals(inviteCount, mission.inviteCount) &&
        Objects.equals(acceptedCount, mission.acceptedCount) &&
        Objects.equals(inviteStatus, mission.inviteStatus) &&
        Objects.equals(childCount, mission.childCount) &&
        Objects.equals(secondsBetweenLevels, mission.secondsBetweenLevels) &&
        Objects.equals(secondsBetweenPacks, mission.secondsBetweenPacks) &&
        Objects.equals(maximumLevelLength, mission.maximumLevelLength) &&
        Objects.equals(enableBuyBack, mission.enableBuyBack) &&
        Objects.equals(activePack, mission.activePack) &&
        Objects.equals(minimumToPlay, mission.minimumToPlay) &&
        Objects.equals(fixedReward, mission.fixedReward) &&
        Objects.equals(refunded, mission.refunded) &&
        Objects.equals(notificationsCreated, mission.notificationsCreated) &&
        Objects.equals(rewarded, mission.rewarded) &&
        Objects.equals(externalId, mission.externalId) &&
        Objects.equals(advancedReporting, mission.advancedReporting) &&
        Objects.equals(splitReward, mission.splitReward) &&
        Objects.equals(joinCode, mission.joinCode) &&
        Objects.equals(firstPack, mission.firstPack) &&
        Objects.equals(allGameLevels, mission.allGameLevels) &&
        Objects.equals(allPacks, mission.allPacks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, active, valid, owner, missionType, title, description, costToPlay, costToPlayType, games, audiences, startDate, endDate, sequenceType, authorOverride, icon, image, offers, visibility, task, points, ticketType, ticketCount, allocateTickets, billableEntity, balance, startingLimit, availableLimit, inviteCount, acceptedCount, inviteStatus, childCount, secondsBetweenLevels, secondsBetweenPacks, maximumLevelLength, enableBuyBack, activePack, minimumToPlay, fixedReward, refunded, notificationsCreated, rewarded, externalId, advancedReporting, splitReward, joinCode, firstPack, allGameLevels, allPacks);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-09T20:51:23.077809933Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class Mission   {
  
  private Long id;
  private Boolean active;
  private Boolean valid;
  private Account owner;

  /**
   * Gets or Sets missionType
   */
  public enum MissionTypeEnum {
    PUBLIC("PUBLIC"),

        SHARED("SHARED"),

        TOURNAMENT("TOURNAMENT"),

        POOLPLAY("POOLPLAY");
    private String value;

    MissionTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private MissionTypeEnum missionType;
  private String title;
  private String description;
  private Integer costToPlay;
  private String costToPlayType;
  private List<@Valid Game> games = new ArrayList<>();
  private List<@Valid Audience> audiences = new ArrayList<>();
  private Date startDate;
  private Date endDate;

  /**
   * Gets or Sets sequenceType
   */
  public enum SequenceTypeEnum {
    FIRST_AVAILABLE("FIRST_AVAILABLE"),

        ALL_AVAILABLE("ALL_AVAILABLE");
    private String value;

    SequenceTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private SequenceTypeEnum sequenceType;
  private String authorOverride;
  private Asset icon;
  private Asset image;
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
    private String value;

    VisibilityEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private VisibilityEnum visibility;
  private MissionTask task;
  private Long points;
  private String ticketType;
  private Long ticketCount;
  private Boolean allocateTickets;
  private BillableEntity billableEntity;
  private Double balance;
  private Integer startingLimit;
  private Integer availableLimit;
  private Integer inviteCount;
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
  private Long childCount;
  private Integer secondsBetweenLevels;
  private Integer secondsBetweenPacks;
  private Integer maximumLevelLength;
  private Boolean enableBuyBack;
  private Pack activePack;
  private Integer minimumToPlay;
  private Boolean fixedReward;
  private Boolean refunded;
  private Boolean notificationsCreated;
  private Boolean rewarded;
  private Long externalId;
  private Boolean advancedReporting;

  /**
   * Gets or Sets splitReward
   */
  public enum SplitRewardEnum {
    EVEN("EVEN"),

        ALL("ALL"),

        FIRST("FIRST"),

        RANDOM("RANDOM");
    private String value;

    SplitRewardEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private SplitRewardEnum splitReward;
  private String joinCode;
  private Pack firstPack;
  private List<@Valid GameLevel> allGameLevels = new ArrayList<>();
  private List<@Valid Pack> allPacks = new ArrayList<>();

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
  @JsonProperty("active")
  public Boolean getActive() {
    return active;
  }
  public void setActive(Boolean active) {
    this.active = active;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("valid")
  public Boolean getValid() {
    return valid;
  }
  public void setValid(Boolean valid) {
    this.valid = valid;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("owner")
  @Valid
  public Account getOwner() {
    return owner;
  }
  public void setOwner(Account owner) {
    this.owner = owner;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("missionType")
  public MissionTypeEnum getMissionType() {
    return missionType;
  }
  public void setMissionType(MissionTypeEnum missionType) {
    this.missionType = missionType;
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
  @JsonProperty("costToPlay")
  public Integer getCostToPlay() {
    return costToPlay;
  }
  public void setCostToPlay(Integer costToPlay) {
    this.costToPlay = costToPlay;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("costToPlayType")
  public String getCostToPlayType() {
    return costToPlayType;
  }
  public void setCostToPlayType(String costToPlayType) {
    this.costToPlayType = costToPlayType;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("games")
  @Valid
  public List<@Valid Game> getGames() {
    return games;
  }
  public void setGames(List<@Valid Game> games) {
    this.games = games;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("audiences")
  @Valid
  public List<@Valid Audience> getAudiences() {
    return audiences;
  }
  public void setAudiences(List<@Valid Audience> audiences) {
    this.audiences = audiences;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("startDate")
  public Date getStartDate() {
    return startDate;
  }
  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("endDate")
  public Date getEndDate() {
    return endDate;
  }
  public void setEndDate(Date endDate) {
    this.endDate = endDate;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("sequenceType")
  public SequenceTypeEnum getSequenceType() {
    return sequenceType;
  }
  public void setSequenceType(SequenceTypeEnum sequenceType) {
    this.sequenceType = sequenceType;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("authorOverride")
  public String getAuthorOverride() {
    return authorOverride;
  }
  public void setAuthorOverride(String authorOverride) {
    this.authorOverride = authorOverride;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("icon")
  @Valid
  public Asset getIcon() {
    return icon;
  }
  public void setIcon(Asset icon) {
    this.icon = icon;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("image")
  @Valid
  public Asset getImage() {
    return image;
  }
  public void setImage(Asset image) {
    this.image = image;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("offers")
  @Valid
  public List<@Valid Offer> getOffers() {
    return offers;
  }
  public void setOffers(List<@Valid Offer> offers) {
    this.offers = offers;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("visibility")
  public VisibilityEnum getVisibility() {
    return visibility;
  }
  public void setVisibility(VisibilityEnum visibility) {
    this.visibility = visibility;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("task")
  @Valid
  public MissionTask getTask() {
    return task;
  }
  public void setTask(MissionTask task) {
    this.task = task;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("points")
  public Long getPoints() {
    return points;
  }
  public void setPoints(Long points) {
    this.points = points;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("ticketType")
  public String getTicketType() {
    return ticketType;
  }
  public void setTicketType(String ticketType) {
    this.ticketType = ticketType;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("ticketCount")
  public Long getTicketCount() {
    return ticketCount;
  }
  public void setTicketCount(Long ticketCount) {
    this.ticketCount = ticketCount;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("allocateTickets")
  public Boolean getAllocateTickets() {
    return allocateTickets;
  }
  public void setAllocateTickets(Boolean allocateTickets) {
    this.allocateTickets = allocateTickets;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("billableEntity")
  @Valid
  public BillableEntity getBillableEntity() {
    return billableEntity;
  }
  public void setBillableEntity(BillableEntity billableEntity) {
    this.billableEntity = billableEntity;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("balance")
  public Double getBalance() {
    return balance;
  }
  public void setBalance(Double balance) {
    this.balance = balance;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("startingLimit")
  public Integer getStartingLimit() {
    return startingLimit;
  }
  public void setStartingLimit(Integer startingLimit) {
    this.startingLimit = startingLimit;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("availableLimit")
  public Integer getAvailableLimit() {
    return availableLimit;
  }
  public void setAvailableLimit(Integer availableLimit) {
    this.availableLimit = availableLimit;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("inviteCount")
  public Integer getInviteCount() {
    return inviteCount;
  }
  public void setInviteCount(Integer inviteCount) {
    this.inviteCount = inviteCount;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("acceptedCount")
  public Integer getAcceptedCount() {
    return acceptedCount;
  }
  public void setAcceptedCount(Integer acceptedCount) {
    this.acceptedCount = acceptedCount;
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

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("childCount")
  public Long getChildCount() {
    return childCount;
  }
  public void setChildCount(Long childCount) {
    this.childCount = childCount;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("secondsBetweenLevels")
  public Integer getSecondsBetweenLevels() {
    return secondsBetweenLevels;
  }
  public void setSecondsBetweenLevels(Integer secondsBetweenLevels) {
    this.secondsBetweenLevels = secondsBetweenLevels;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("secondsBetweenPacks")
  public Integer getSecondsBetweenPacks() {
    return secondsBetweenPacks;
  }
  public void setSecondsBetweenPacks(Integer secondsBetweenPacks) {
    this.secondsBetweenPacks = secondsBetweenPacks;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("maximumLevelLength")
  public Integer getMaximumLevelLength() {
    return maximumLevelLength;
  }
  public void setMaximumLevelLength(Integer maximumLevelLength) {
    this.maximumLevelLength = maximumLevelLength;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("enableBuyBack")
  public Boolean getEnableBuyBack() {
    return enableBuyBack;
  }
  public void setEnableBuyBack(Boolean enableBuyBack) {
    this.enableBuyBack = enableBuyBack;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("activePack")
  @Valid
  public Pack getActivePack() {
    return activePack;
  }
  public void setActivePack(Pack activePack) {
    this.activePack = activePack;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("minimumToPlay")
  public Integer getMinimumToPlay() {
    return minimumToPlay;
  }
  public void setMinimumToPlay(Integer minimumToPlay) {
    this.minimumToPlay = minimumToPlay;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("fixedReward")
  public Boolean getFixedReward() {
    return fixedReward;
  }
  public void setFixedReward(Boolean fixedReward) {
    this.fixedReward = fixedReward;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("refunded")
  public Boolean getRefunded() {
    return refunded;
  }
  public void setRefunded(Boolean refunded) {
    this.refunded = refunded;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("notificationsCreated")
  public Boolean getNotificationsCreated() {
    return notificationsCreated;
  }
  public void setNotificationsCreated(Boolean notificationsCreated) {
    this.notificationsCreated = notificationsCreated;
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
  @JsonProperty("externalId")
  public Long getExternalId() {
    return externalId;
  }
  public void setExternalId(Long externalId) {
    this.externalId = externalId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("advancedReporting")
  public Boolean getAdvancedReporting() {
    return advancedReporting;
  }
  public void setAdvancedReporting(Boolean advancedReporting) {
    this.advancedReporting = advancedReporting;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("splitReward")
  public SplitRewardEnum getSplitReward() {
    return splitReward;
  }
  public void setSplitReward(SplitRewardEnum splitReward) {
    this.splitReward = splitReward;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("joinCode")
  public String getJoinCode() {
    return joinCode;
  }
  public void setJoinCode(String joinCode) {
    this.joinCode = joinCode;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("firstPack")
  @Valid
  public Pack getFirstPack() {
    return firstPack;
  }
  public void setFirstPack(Pack firstPack) {
    this.firstPack = firstPack;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("allGameLevels")
  @Valid
  public List<@Valid GameLevel> getAllGameLevels() {
    return allGameLevels;
  }
  public void setAllGameLevels(List<@Valid GameLevel> allGameLevels) {
    this.allGameLevels = allGameLevels;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("allPacks")
  @Valid
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


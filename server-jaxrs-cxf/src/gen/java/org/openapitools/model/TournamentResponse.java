package org.openapitools.model;

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
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class TournamentResponse  {
  
public enum ActionEnum {

DATA(String.valueOf("DATA")), SAVE(String.valueOf("SAVE")), DELETE(String.valueOf("DELETE")), GET(String.valueOf("GET"));


    private String value;

    ActionEnum (String v) {
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
    public static ActionEnum fromValue(String value) {
        for (ActionEnum b : ActionEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(value = "")

  private ActionEnum action;

  @ApiModelProperty(value = "")

  private String highestAppVersion;

  @ApiModelProperty(value = "")

  private Long missionId;

  @ApiModelProperty(value = "")

  private Long ticketsEarned;

  @ApiModelProperty(value = "")

  private Integer costToPlay;

  @ApiModelProperty(value = "")

  private String costToPlayType;

  @ApiModelProperty(value = "")

  @Valid

  private AccountShortResponse owner;

  @ApiModelProperty(value = "")

  private String title;

  @ApiModelProperty(value = "")

  private String description;

  @ApiModelProperty(value = "")

  private String authorOverride;

  @ApiModelProperty(value = "")

  @Valid

  private AssetShortResponse icon;

  @ApiModelProperty(value = "")

  @Valid

  private AssetShortResponse image;

  @ApiModelProperty(value = "")

  private String sequenceType;

  @ApiModelProperty(value = "")

  private Long updatedDate;

  @ApiModelProperty(value = "")

  private Long startDate;

  @ApiModelProperty(value = "")

  private Long endDate;

  @ApiModelProperty(value = "")

  private String missionType;

  @ApiModelProperty(value = "")

  private Boolean active;

  @ApiModelProperty(value = "")

  private Double balance;

  @ApiModelProperty(value = "")

  private Integer availableLimit;

  @ApiModelProperty(value = "")

  private Integer inviteCount;

  @ApiModelProperty(value = "")

  private Integer acceptedCount;

  @ApiModelProperty(value = "")

  private Long childCount;

  @ApiModelProperty(value = "")

  private Boolean enableBuyBack;

  @ApiModelProperty(value = "")

  private Integer minimumToPlay;

  @ApiModelProperty(value = "")

  private Boolean rewarded;

  @ApiModelProperty(value = "")

  private Boolean refunded;

  @ApiModelProperty(value = "")

  private String joinCode;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid RewardResponse> rewards = new ArrayList<>();

  @ApiModelProperty(value = "")

  @Valid

  private GameListResponse games;

  @ApiModelProperty(value = "")

  @Valid

  private ScoreListResponse scores;

  @ApiModelProperty(value = "")

  @Valid

  private UserPermissionsListResponse userPermissionsList;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid NameStringValueResponse> results = new ArrayList<>();

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

  @Valid

  private List<@Valid AudienceResponse> audiences = new ArrayList<>();

  @ApiModelProperty(value = "")

  private Long missionInviteId;

  @ApiModelProperty(value = "")

  @Valid

  private MissionInviteResponse missionInvite;

  @ApiModelProperty(value = "")

  @Valid

  private AccountShortResponse invitee;

  @ApiModelProperty(value = "")

  private String formatType;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid CreativeResponse> creatives = new ArrayList<>();

  @ApiModelProperty(value = "")

  private Boolean fixedReward;

  @ApiModelProperty(value = "")

  private Boolean allocateTickets;

  @ApiModelProperty(value = "")

  private String ticketType;

  @ApiModelProperty(value = "")

  private Long ticketCount;

  @ApiModelProperty(value = "")

  private Long points;

  @ApiModelProperty(value = "")

  private String splitReward;

  @ApiModelProperty(value = "")

  private Integer secondsBetweenLevels;

  @ApiModelProperty(value = "")

  private Integer secondsBetweenPacks;

  @ApiModelProperty(value = "")

  private Boolean advancedReporting;

  @ApiModelProperty(value = "")

  private String tournamentData;
 /**
   * Get action
   * @return action
  **/
  @JsonProperty("action")
  public String getAction() {
    if (action == null) {
      return null;
    }
    return action.value();
  }

  public void setAction(ActionEnum action) {
    this.action = action;
  }

  public TournamentResponse action(ActionEnum action) {
    this.action = action;
    return this;
  }

 /**
   * Get highestAppVersion
   * @return highestAppVersion
  **/
  @JsonProperty("highestAppVersion")
  public String getHighestAppVersion() {
    return highestAppVersion;
  }

  public void setHighestAppVersion(String highestAppVersion) {
    this.highestAppVersion = highestAppVersion;
  }

  public TournamentResponse highestAppVersion(String highestAppVersion) {
    this.highestAppVersion = highestAppVersion;
    return this;
  }

 /**
   * Get missionId
   * @return missionId
  **/
  @JsonProperty("missionId")
  public Long getMissionId() {
    return missionId;
  }

  public void setMissionId(Long missionId) {
    this.missionId = missionId;
  }

  public TournamentResponse missionId(Long missionId) {
    this.missionId = missionId;
    return this;
  }

 /**
   * Get ticketsEarned
   * @return ticketsEarned
  **/
  @JsonProperty("ticketsEarned")
  public Long getTicketsEarned() {
    return ticketsEarned;
  }

  public void setTicketsEarned(Long ticketsEarned) {
    this.ticketsEarned = ticketsEarned;
  }

  public TournamentResponse ticketsEarned(Long ticketsEarned) {
    this.ticketsEarned = ticketsEarned;
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

  public TournamentResponse costToPlay(Integer costToPlay) {
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

  public TournamentResponse costToPlayType(String costToPlayType) {
    this.costToPlayType = costToPlayType;
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

  public TournamentResponse owner(AccountShortResponse owner) {
    this.owner = owner;
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

  public TournamentResponse title(String title) {
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

  public TournamentResponse description(String description) {
    this.description = description;
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

  public TournamentResponse authorOverride(String authorOverride) {
    this.authorOverride = authorOverride;
    return this;
  }

 /**
   * Get icon
   * @return icon
  **/
  @JsonProperty("icon")
  public AssetShortResponse getIcon() {
    return icon;
  }

  public void setIcon(AssetShortResponse icon) {
    this.icon = icon;
  }

  public TournamentResponse icon(AssetShortResponse icon) {
    this.icon = icon;
    return this;
  }

 /**
   * Get image
   * @return image
  **/
  @JsonProperty("image")
  public AssetShortResponse getImage() {
    return image;
  }

  public void setImage(AssetShortResponse image) {
    this.image = image;
  }

  public TournamentResponse image(AssetShortResponse image) {
    this.image = image;
    return this;
  }

 /**
   * Get sequenceType
   * @return sequenceType
  **/
  @JsonProperty("sequenceType")
  public String getSequenceType() {
    return sequenceType;
  }

  public void setSequenceType(String sequenceType) {
    this.sequenceType = sequenceType;
  }

  public TournamentResponse sequenceType(String sequenceType) {
    this.sequenceType = sequenceType;
    return this;
  }

 /**
   * Get updatedDate
   * @return updatedDate
  **/
  @JsonProperty("updatedDate")
  public Long getUpdatedDate() {
    return updatedDate;
  }

  public void setUpdatedDate(Long updatedDate) {
    this.updatedDate = updatedDate;
  }

  public TournamentResponse updatedDate(Long updatedDate) {
    this.updatedDate = updatedDate;
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

  public TournamentResponse startDate(Long startDate) {
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

  public TournamentResponse endDate(Long endDate) {
    this.endDate = endDate;
    return this;
  }

 /**
   * Get missionType
   * @return missionType
  **/
  @JsonProperty("missionType")
  public String getMissionType() {
    return missionType;
  }

  public void setMissionType(String missionType) {
    this.missionType = missionType;
  }

  public TournamentResponse missionType(String missionType) {
    this.missionType = missionType;
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

  public TournamentResponse active(Boolean active) {
    this.active = active;
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

  public TournamentResponse balance(Double balance) {
    this.balance = balance;
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

  public TournamentResponse availableLimit(Integer availableLimit) {
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

  public TournamentResponse inviteCount(Integer inviteCount) {
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

  public TournamentResponse acceptedCount(Integer acceptedCount) {
    this.acceptedCount = acceptedCount;
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

  public TournamentResponse childCount(Long childCount) {
    this.childCount = childCount;
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

  public TournamentResponse enableBuyBack(Boolean enableBuyBack) {
    this.enableBuyBack = enableBuyBack;
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

  public TournamentResponse minimumToPlay(Integer minimumToPlay) {
    this.minimumToPlay = minimumToPlay;
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

  public TournamentResponse rewarded(Boolean rewarded) {
    this.rewarded = rewarded;
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

  public TournamentResponse refunded(Boolean refunded) {
    this.refunded = refunded;
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

  public TournamentResponse joinCode(String joinCode) {
    this.joinCode = joinCode;
    return this;
  }

 /**
   * Get rewards
   * @return rewards
  **/
  @JsonProperty("rewards")
  public List<@Valid RewardResponse> getRewards() {
    return rewards;
  }

  public void setRewards(List<@Valid RewardResponse> rewards) {
    this.rewards = rewards;
  }

  public TournamentResponse rewards(List<@Valid RewardResponse> rewards) {
    this.rewards = rewards;
    return this;
  }

  public TournamentResponse addRewardsItem(RewardResponse rewardsItem) {
    this.rewards.add(rewardsItem);
    return this;
  }

 /**
   * Get games
   * @return games
  **/
  @JsonProperty("games")
  public GameListResponse getGames() {
    return games;
  }

  public void setGames(GameListResponse games) {
    this.games = games;
  }

  public TournamentResponse games(GameListResponse games) {
    this.games = games;
    return this;
  }

 /**
   * Get scores
   * @return scores
  **/
  @JsonProperty("scores")
  public ScoreListResponse getScores() {
    return scores;
  }

  public void setScores(ScoreListResponse scores) {
    this.scores = scores;
  }

  public TournamentResponse scores(ScoreListResponse scores) {
    this.scores = scores;
    return this;
  }

 /**
   * Get userPermissionsList
   * @return userPermissionsList
  **/
  @JsonProperty("userPermissionsList")
  public UserPermissionsListResponse getUserPermissionsList() {
    return userPermissionsList;
  }

  public void setUserPermissionsList(UserPermissionsListResponse userPermissionsList) {
    this.userPermissionsList = userPermissionsList;
  }

  public TournamentResponse userPermissionsList(UserPermissionsListResponse userPermissionsList) {
    this.userPermissionsList = userPermissionsList;
    return this;
  }

 /**
   * Get results
   * @return results
  **/
  @JsonProperty("results")
  public List<@Valid NameStringValueResponse> getResults() {
    return results;
  }

  public void setResults(List<@Valid NameStringValueResponse> results) {
    this.results = results;
  }

  public TournamentResponse results(List<@Valid NameStringValueResponse> results) {
    this.results = results;
    return this;
  }

  public TournamentResponse addResultsItem(NameStringValueResponse resultsItem) {
    this.results.add(resultsItem);
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

  public TournamentResponse inviteStatus(InviteStatusEnum inviteStatus) {
    this.inviteStatus = inviteStatus;
    return this;
  }

 /**
   * Get audiences
   * @return audiences
  **/
  @JsonProperty("audiences")
  public List<@Valid AudienceResponse> getAudiences() {
    return audiences;
  }

  public void setAudiences(List<@Valid AudienceResponse> audiences) {
    this.audiences = audiences;
  }

  public TournamentResponse audiences(List<@Valid AudienceResponse> audiences) {
    this.audiences = audiences;
    return this;
  }

  public TournamentResponse addAudiencesItem(AudienceResponse audiencesItem) {
    this.audiences.add(audiencesItem);
    return this;
  }

 /**
   * Get missionInviteId
   * @return missionInviteId
  **/
  @JsonProperty("missionInviteId")
  public Long getMissionInviteId() {
    return missionInviteId;
  }

  public void setMissionInviteId(Long missionInviteId) {
    this.missionInviteId = missionInviteId;
  }

  public TournamentResponse missionInviteId(Long missionInviteId) {
    this.missionInviteId = missionInviteId;
    return this;
  }

 /**
   * Get missionInvite
   * @return missionInvite
  **/
  @JsonProperty("missionInvite")
  public MissionInviteResponse getMissionInvite() {
    return missionInvite;
  }

  public void setMissionInvite(MissionInviteResponse missionInvite) {
    this.missionInvite = missionInvite;
  }

  public TournamentResponse missionInvite(MissionInviteResponse missionInvite) {
    this.missionInvite = missionInvite;
    return this;
  }

 /**
   * Get invitee
   * @return invitee
  **/
  @JsonProperty("invitee")
  public AccountShortResponse getInvitee() {
    return invitee;
  }

  public void setInvitee(AccountShortResponse invitee) {
    this.invitee = invitee;
  }

  public TournamentResponse invitee(AccountShortResponse invitee) {
    this.invitee = invitee;
    return this;
  }

 /**
   * Get formatType
   * @return formatType
  **/
  @JsonProperty("formatType")
  public String getFormatType() {
    return formatType;
  }

  public void setFormatType(String formatType) {
    this.formatType = formatType;
  }

  public TournamentResponse formatType(String formatType) {
    this.formatType = formatType;
    return this;
  }

 /**
   * Get creatives
   * @return creatives
  **/
  @JsonProperty("creatives")
  public List<@Valid CreativeResponse> getCreatives() {
    return creatives;
  }

  public void setCreatives(List<@Valid CreativeResponse> creatives) {
    this.creatives = creatives;
  }

  public TournamentResponse creatives(List<@Valid CreativeResponse> creatives) {
    this.creatives = creatives;
    return this;
  }

  public TournamentResponse addCreativesItem(CreativeResponse creativesItem) {
    this.creatives.add(creativesItem);
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

  public TournamentResponse fixedReward(Boolean fixedReward) {
    this.fixedReward = fixedReward;
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

  public TournamentResponse allocateTickets(Boolean allocateTickets) {
    this.allocateTickets = allocateTickets;
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

  public TournamentResponse ticketType(String ticketType) {
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

  public TournamentResponse ticketCount(Long ticketCount) {
    this.ticketCount = ticketCount;
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

  public TournamentResponse points(Long points) {
    this.points = points;
    return this;
  }

 /**
   * Get splitReward
   * @return splitReward
  **/
  @JsonProperty("splitReward")
  public String getSplitReward() {
    return splitReward;
  }

  public void setSplitReward(String splitReward) {
    this.splitReward = splitReward;
  }

  public TournamentResponse splitReward(String splitReward) {
    this.splitReward = splitReward;
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

  public TournamentResponse secondsBetweenLevels(Integer secondsBetweenLevels) {
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

  public TournamentResponse secondsBetweenPacks(Integer secondsBetweenPacks) {
    this.secondsBetweenPacks = secondsBetweenPacks;
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

  public TournamentResponse advancedReporting(Boolean advancedReporting) {
    this.advancedReporting = advancedReporting;
    return this;
  }

 /**
   * Get tournamentData
   * @return tournamentData
  **/
  @JsonProperty("tournamentData")
  public String getTournamentData() {
    return tournamentData;
  }

  public void setTournamentData(String tournamentData) {
    this.tournamentData = tournamentData;
  }

  public TournamentResponse tournamentData(String tournamentData) {
    this.tournamentData = tournamentData;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


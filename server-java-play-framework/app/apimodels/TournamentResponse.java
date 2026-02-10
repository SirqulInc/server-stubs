package apimodels;

import apimodels.AccountShortResponse;
import apimodels.AssetShortResponse;
import apimodels.AudienceResponse;
import apimodels.CreativeResponse;
import apimodels.GameListResponse;
import apimodels.MissionInviteResponse;
import apimodels.NameStringValueResponse;
import apimodels.RewardResponse;
import apimodels.ScoreListResponse;
import apimodels.UserPermissionsListResponse;
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
 * TournamentResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class TournamentResponse   {
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

  @JsonProperty("action")
  
  private ActionEnum action;

  @JsonProperty("highestAppVersion")
  
  private String highestAppVersion;

  @JsonProperty("missionId")
  
  private Long missionId;

  @JsonProperty("ticketsEarned")
  
  private Long ticketsEarned;

  @JsonProperty("costToPlay")
  
  private Integer costToPlay;

  @JsonProperty("costToPlayType")
  
  private String costToPlayType;

  @JsonProperty("owner")
  @Valid

  private AccountShortResponse owner;

  @JsonProperty("title")
  
  private String title;

  @JsonProperty("description")
  
  private String description;

  @JsonProperty("authorOverride")
  
  private String authorOverride;

  @JsonProperty("icon")
  @Valid

  private AssetShortResponse icon;

  @JsonProperty("image")
  @Valid

  private AssetShortResponse image;

  @JsonProperty("sequenceType")
  
  private String sequenceType;

  @JsonProperty("updatedDate")
  
  private Long updatedDate;

  @JsonProperty("startDate")
  
  private Long startDate;

  @JsonProperty("endDate")
  
  private Long endDate;

  @JsonProperty("missionType")
  
  private String missionType;

  @JsonProperty("active")
  
  private Boolean active;

  @JsonProperty("balance")
  
  private Double balance;

  @JsonProperty("availableLimit")
  
  private Integer availableLimit;

  @JsonProperty("inviteCount")
  
  private Integer inviteCount;

  @JsonProperty("acceptedCount")
  
  private Integer acceptedCount;

  @JsonProperty("childCount")
  
  private Long childCount;

  @JsonProperty("enableBuyBack")
  
  private Boolean enableBuyBack;

  @JsonProperty("minimumToPlay")
  
  private Integer minimumToPlay;

  @JsonProperty("rewarded")
  
  private Boolean rewarded;

  @JsonProperty("refunded")
  
  private Boolean refunded;

  @JsonProperty("joinCode")
  
  private String joinCode;

  @JsonProperty("rewards")
  @Valid

  private List<@Valid RewardResponse> rewards = null;

  @JsonProperty("games")
  @Valid

  private GameListResponse games;

  @JsonProperty("scores")
  @Valid

  private ScoreListResponse scores;

  @JsonProperty("userPermissionsList")
  @Valid

  private UserPermissionsListResponse userPermissionsList;

  @JsonProperty("results")
  @Valid

  private List<@Valid NameStringValueResponse> results = null;

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

  @JsonProperty("audiences")
  @Valid

  private List<@Valid AudienceResponse> audiences = null;

  @JsonProperty("missionInviteId")
  
  private Long missionInviteId;

  @JsonProperty("missionInvite")
  @Valid

  private MissionInviteResponse missionInvite;

  @JsonProperty("invitee")
  @Valid

  private AccountShortResponse invitee;

  @JsonProperty("formatType")
  
  private String formatType;

  @JsonProperty("creatives")
  @Valid

  private List<@Valid CreativeResponse> creatives = null;

  @JsonProperty("fixedReward")
  
  private Boolean fixedReward;

  @JsonProperty("allocateTickets")
  
  private Boolean allocateTickets;

  @JsonProperty("ticketType")
  
  private String ticketType;

  @JsonProperty("ticketCount")
  
  private Long ticketCount;

  @JsonProperty("points")
  
  private Long points;

  @JsonProperty("splitReward")
  
  private String splitReward;

  @JsonProperty("secondsBetweenLevels")
  
  private Integer secondsBetweenLevels;

  @JsonProperty("secondsBetweenPacks")
  
  private Integer secondsBetweenPacks;

  @JsonProperty("advancedReporting")
  
  private Boolean advancedReporting;

  @JsonProperty("tournamentData")
  
  private String tournamentData;

  public TournamentResponse action(ActionEnum action) {
    this.action = action;
    return this;
  }

   /**
   * Get action
   * @return action
  **/
  public ActionEnum getAction() {
    return action;
  }

  public void setAction(ActionEnum action) {
    this.action = action;
  }

  public TournamentResponse highestAppVersion(String highestAppVersion) {
    this.highestAppVersion = highestAppVersion;
    return this;
  }

   /**
   * Get highestAppVersion
   * @return highestAppVersion
  **/
  public String getHighestAppVersion() {
    return highestAppVersion;
  }

  public void setHighestAppVersion(String highestAppVersion) {
    this.highestAppVersion = highestAppVersion;
  }

  public TournamentResponse missionId(Long missionId) {
    this.missionId = missionId;
    return this;
  }

   /**
   * Get missionId
   * @return missionId
  **/
  public Long getMissionId() {
    return missionId;
  }

  public void setMissionId(Long missionId) {
    this.missionId = missionId;
  }

  public TournamentResponse ticketsEarned(Long ticketsEarned) {
    this.ticketsEarned = ticketsEarned;
    return this;
  }

   /**
   * Get ticketsEarned
   * @return ticketsEarned
  **/
  public Long getTicketsEarned() {
    return ticketsEarned;
  }

  public void setTicketsEarned(Long ticketsEarned) {
    this.ticketsEarned = ticketsEarned;
  }

  public TournamentResponse costToPlay(Integer costToPlay) {
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

  public TournamentResponse costToPlayType(String costToPlayType) {
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

  public TournamentResponse owner(AccountShortResponse owner) {
    this.owner = owner;
    return this;
  }

   /**
   * Get owner
   * @return owner
  **/
  public AccountShortResponse getOwner() {
    return owner;
  }

  public void setOwner(AccountShortResponse owner) {
    this.owner = owner;
  }

  public TournamentResponse title(String title) {
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

  public TournamentResponse description(String description) {
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

  public TournamentResponse authorOverride(String authorOverride) {
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

  public TournamentResponse icon(AssetShortResponse icon) {
    this.icon = icon;
    return this;
  }

   /**
   * Get icon
   * @return icon
  **/
  public AssetShortResponse getIcon() {
    return icon;
  }

  public void setIcon(AssetShortResponse icon) {
    this.icon = icon;
  }

  public TournamentResponse image(AssetShortResponse image) {
    this.image = image;
    return this;
  }

   /**
   * Get image
   * @return image
  **/
  public AssetShortResponse getImage() {
    return image;
  }

  public void setImage(AssetShortResponse image) {
    this.image = image;
  }

  public TournamentResponse sequenceType(String sequenceType) {
    this.sequenceType = sequenceType;
    return this;
  }

   /**
   * Get sequenceType
   * @return sequenceType
  **/
  public String getSequenceType() {
    return sequenceType;
  }

  public void setSequenceType(String sequenceType) {
    this.sequenceType = sequenceType;
  }

  public TournamentResponse updatedDate(Long updatedDate) {
    this.updatedDate = updatedDate;
    return this;
  }

   /**
   * Get updatedDate
   * @return updatedDate
  **/
  public Long getUpdatedDate() {
    return updatedDate;
  }

  public void setUpdatedDate(Long updatedDate) {
    this.updatedDate = updatedDate;
  }

  public TournamentResponse startDate(Long startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  public Long getStartDate() {
    return startDate;
  }

  public void setStartDate(Long startDate) {
    this.startDate = startDate;
  }

  public TournamentResponse endDate(Long endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * Get endDate
   * @return endDate
  **/
  public Long getEndDate() {
    return endDate;
  }

  public void setEndDate(Long endDate) {
    this.endDate = endDate;
  }

  public TournamentResponse missionType(String missionType) {
    this.missionType = missionType;
    return this;
  }

   /**
   * Get missionType
   * @return missionType
  **/
  public String getMissionType() {
    return missionType;
  }

  public void setMissionType(String missionType) {
    this.missionType = missionType;
  }

  public TournamentResponse active(Boolean active) {
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

  public TournamentResponse balance(Double balance) {
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

  public TournamentResponse availableLimit(Integer availableLimit) {
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

  public TournamentResponse inviteCount(Integer inviteCount) {
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

  public TournamentResponse acceptedCount(Integer acceptedCount) {
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

  public TournamentResponse childCount(Long childCount) {
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

  public TournamentResponse enableBuyBack(Boolean enableBuyBack) {
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

  public TournamentResponse minimumToPlay(Integer minimumToPlay) {
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

  public TournamentResponse rewarded(Boolean rewarded) {
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

  public TournamentResponse refunded(Boolean refunded) {
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

  public TournamentResponse joinCode(String joinCode) {
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
  **/
  public List<@Valid RewardResponse> getRewards() {
    return rewards;
  }

  public void setRewards(List<@Valid RewardResponse> rewards) {
    this.rewards = rewards;
  }

  public TournamentResponse games(GameListResponse games) {
    this.games = games;
    return this;
  }

   /**
   * Get games
   * @return games
  **/
  public GameListResponse getGames() {
    return games;
  }

  public void setGames(GameListResponse games) {
    this.games = games;
  }

  public TournamentResponse scores(ScoreListResponse scores) {
    this.scores = scores;
    return this;
  }

   /**
   * Get scores
   * @return scores
  **/
  public ScoreListResponse getScores() {
    return scores;
  }

  public void setScores(ScoreListResponse scores) {
    this.scores = scores;
  }

  public TournamentResponse userPermissionsList(UserPermissionsListResponse userPermissionsList) {
    this.userPermissionsList = userPermissionsList;
    return this;
  }

   /**
   * Get userPermissionsList
   * @return userPermissionsList
  **/
  public UserPermissionsListResponse getUserPermissionsList() {
    return userPermissionsList;
  }

  public void setUserPermissionsList(UserPermissionsListResponse userPermissionsList) {
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
  **/
  public List<@Valid NameStringValueResponse> getResults() {
    return results;
  }

  public void setResults(List<@Valid NameStringValueResponse> results) {
    this.results = results;
  }

  public TournamentResponse inviteStatus(InviteStatusEnum inviteStatus) {
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
  **/
  public List<@Valid AudienceResponse> getAudiences() {
    return audiences;
  }

  public void setAudiences(List<@Valid AudienceResponse> audiences) {
    this.audiences = audiences;
  }

  public TournamentResponse missionInviteId(Long missionInviteId) {
    this.missionInviteId = missionInviteId;
    return this;
  }

   /**
   * Get missionInviteId
   * @return missionInviteId
  **/
  public Long getMissionInviteId() {
    return missionInviteId;
  }

  public void setMissionInviteId(Long missionInviteId) {
    this.missionInviteId = missionInviteId;
  }

  public TournamentResponse missionInvite(MissionInviteResponse missionInvite) {
    this.missionInvite = missionInvite;
    return this;
  }

   /**
   * Get missionInvite
   * @return missionInvite
  **/
  public MissionInviteResponse getMissionInvite() {
    return missionInvite;
  }

  public void setMissionInvite(MissionInviteResponse missionInvite) {
    this.missionInvite = missionInvite;
  }

  public TournamentResponse invitee(AccountShortResponse invitee) {
    this.invitee = invitee;
    return this;
  }

   /**
   * Get invitee
   * @return invitee
  **/
  public AccountShortResponse getInvitee() {
    return invitee;
  }

  public void setInvitee(AccountShortResponse invitee) {
    this.invitee = invitee;
  }

  public TournamentResponse formatType(String formatType) {
    this.formatType = formatType;
    return this;
  }

   /**
   * Get formatType
   * @return formatType
  **/
  public String getFormatType() {
    return formatType;
  }

  public void setFormatType(String formatType) {
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
  **/
  public List<@Valid CreativeResponse> getCreatives() {
    return creatives;
  }

  public void setCreatives(List<@Valid CreativeResponse> creatives) {
    this.creatives = creatives;
  }

  public TournamentResponse fixedReward(Boolean fixedReward) {
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

  public TournamentResponse allocateTickets(Boolean allocateTickets) {
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

  public TournamentResponse ticketType(String ticketType) {
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

  public TournamentResponse ticketCount(Long ticketCount) {
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

  public TournamentResponse points(Long points) {
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

  public TournamentResponse splitReward(String splitReward) {
    this.splitReward = splitReward;
    return this;
  }

   /**
   * Get splitReward
   * @return splitReward
  **/
  public String getSplitReward() {
    return splitReward;
  }

  public void setSplitReward(String splitReward) {
    this.splitReward = splitReward;
  }

  public TournamentResponse secondsBetweenLevels(Integer secondsBetweenLevels) {
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

  public TournamentResponse secondsBetweenPacks(Integer secondsBetweenPacks) {
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

  public TournamentResponse advancedReporting(Boolean advancedReporting) {
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

  public TournamentResponse tournamentData(String tournamentData) {
    this.tournamentData = tournamentData;
    return this;
  }

   /**
   * Get tournamentData
   * @return tournamentData
  **/
  public String getTournamentData() {
    return tournamentData;
  }

  public void setTournamentData(String tournamentData) {
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
    return Objects.equals(action, tournamentResponse.action) &&
        Objects.equals(highestAppVersion, tournamentResponse.highestAppVersion) &&
        Objects.equals(missionId, tournamentResponse.missionId) &&
        Objects.equals(ticketsEarned, tournamentResponse.ticketsEarned) &&
        Objects.equals(costToPlay, tournamentResponse.costToPlay) &&
        Objects.equals(costToPlayType, tournamentResponse.costToPlayType) &&
        Objects.equals(owner, tournamentResponse.owner) &&
        Objects.equals(title, tournamentResponse.title) &&
        Objects.equals(description, tournamentResponse.description) &&
        Objects.equals(authorOverride, tournamentResponse.authorOverride) &&
        Objects.equals(icon, tournamentResponse.icon) &&
        Objects.equals(image, tournamentResponse.image) &&
        Objects.equals(sequenceType, tournamentResponse.sequenceType) &&
        Objects.equals(updatedDate, tournamentResponse.updatedDate) &&
        Objects.equals(startDate, tournamentResponse.startDate) &&
        Objects.equals(endDate, tournamentResponse.endDate) &&
        Objects.equals(missionType, tournamentResponse.missionType) &&
        Objects.equals(active, tournamentResponse.active) &&
        Objects.equals(balance, tournamentResponse.balance) &&
        Objects.equals(availableLimit, tournamentResponse.availableLimit) &&
        Objects.equals(inviteCount, tournamentResponse.inviteCount) &&
        Objects.equals(acceptedCount, tournamentResponse.acceptedCount) &&
        Objects.equals(childCount, tournamentResponse.childCount) &&
        Objects.equals(enableBuyBack, tournamentResponse.enableBuyBack) &&
        Objects.equals(minimumToPlay, tournamentResponse.minimumToPlay) &&
        Objects.equals(rewarded, tournamentResponse.rewarded) &&
        Objects.equals(refunded, tournamentResponse.refunded) &&
        Objects.equals(joinCode, tournamentResponse.joinCode) &&
        Objects.equals(rewards, tournamentResponse.rewards) &&
        Objects.equals(games, tournamentResponse.games) &&
        Objects.equals(scores, tournamentResponse.scores) &&
        Objects.equals(userPermissionsList, tournamentResponse.userPermissionsList) &&
        Objects.equals(results, tournamentResponse.results) &&
        Objects.equals(inviteStatus, tournamentResponse.inviteStatus) &&
        Objects.equals(audiences, tournamentResponse.audiences) &&
        Objects.equals(missionInviteId, tournamentResponse.missionInviteId) &&
        Objects.equals(missionInvite, tournamentResponse.missionInvite) &&
        Objects.equals(invitee, tournamentResponse.invitee) &&
        Objects.equals(formatType, tournamentResponse.formatType) &&
        Objects.equals(creatives, tournamentResponse.creatives) &&
        Objects.equals(fixedReward, tournamentResponse.fixedReward) &&
        Objects.equals(allocateTickets, tournamentResponse.allocateTickets) &&
        Objects.equals(ticketType, tournamentResponse.ticketType) &&
        Objects.equals(ticketCount, tournamentResponse.ticketCount) &&
        Objects.equals(points, tournamentResponse.points) &&
        Objects.equals(splitReward, tournamentResponse.splitReward) &&
        Objects.equals(secondsBetweenLevels, tournamentResponse.secondsBetweenLevels) &&
        Objects.equals(secondsBetweenPacks, tournamentResponse.secondsBetweenPacks) &&
        Objects.equals(advancedReporting, tournamentResponse.advancedReporting) &&
        Objects.equals(tournamentData, tournamentResponse.tournamentData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, highestAppVersion, missionId, ticketsEarned, costToPlay, costToPlayType, owner, title, description, authorOverride, icon, image, sequenceType, updatedDate, startDate, endDate, missionType, active, balance, availableLimit, inviteCount, acceptedCount, childCount, enableBuyBack, minimumToPlay, rewarded, refunded, joinCode, rewards, games, scores, userPermissionsList, results, inviteStatus, audiences, missionInviteId, missionInvite, invitee, formatType, creatives, fixedReward, allocateTickets, ticketType, ticketCount, points, splitReward, secondsBetweenLevels, secondsBetweenPacks, advancedReporting, tournamentData);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


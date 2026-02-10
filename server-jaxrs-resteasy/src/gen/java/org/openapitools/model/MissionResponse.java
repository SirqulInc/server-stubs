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
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-09T20:51:23.077809933Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class MissionResponse   {
  

  /**
   * Gets or Sets action
   */
  public enum ActionEnum {
    DATA("DATA"),

        SAVE("SAVE"),

        DELETE("DELETE"),

        GET("GET");
    private String value;

    ActionEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private ActionEnum action;
  private String highestAppVersion;
  private Long missionId;
  private Long ticketsEarned;
  private Integer costToPlay;
  private String costToPlayType;
  private AccountShortResponse owner;
  private String title;
  private String description;
  private String authorOverride;
  private AssetShortResponse icon;
  private AssetShortResponse image;
  private String sequenceType;
  private Long updatedDate;
  private Long startDate;
  private Long endDate;
  private String missionType;
  private Boolean active;
  private Double balance;
  private Integer availableLimit;
  private Integer inviteCount;
  private Integer acceptedCount;
  private Long childCount;
  private Boolean enableBuyBack;
  private Integer minimumToPlay;
  private Boolean rewarded;
  private Boolean refunded;
  private String joinCode;
  private List<@Valid RewardResponse> rewards = new ArrayList<>();
  private GameListResponse games;
  private ScoreListResponse scores;
  private UserPermissionsListResponse userPermissionsList;
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
  private List<@Valid AudienceResponse> audiences = new ArrayList<>();
  private Long missionInviteId;
  private MissionInviteResponse missionInvite;
  private AccountShortResponse invitee;
  private String formatType;
  private List<@Valid CreativeResponse> creatives = new ArrayList<>();
  private Boolean fixedReward;
  private Boolean allocateTickets;
  private String ticketType;
  private Long ticketCount;
  private Long points;
  private String splitReward;
  private Integer secondsBetweenLevels;
  private Integer secondsBetweenPacks;
  private Boolean advancedReporting;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("action")
  public ActionEnum getAction() {
    return action;
  }
  public void setAction(ActionEnum action) {
    this.action = action;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("highestAppVersion")
  public String getHighestAppVersion() {
    return highestAppVersion;
  }
  public void setHighestAppVersion(String highestAppVersion) {
    this.highestAppVersion = highestAppVersion;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("missionId")
  public Long getMissionId() {
    return missionId;
  }
  public void setMissionId(Long missionId) {
    this.missionId = missionId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("ticketsEarned")
  public Long getTicketsEarned() {
    return ticketsEarned;
  }
  public void setTicketsEarned(Long ticketsEarned) {
    this.ticketsEarned = ticketsEarned;
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
  public AssetShortResponse getIcon() {
    return icon;
  }
  public void setIcon(AssetShortResponse icon) {
    this.icon = icon;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("image")
  @Valid
  public AssetShortResponse getImage() {
    return image;
  }
  public void setImage(AssetShortResponse image) {
    this.image = image;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("sequenceType")
  public String getSequenceType() {
    return sequenceType;
  }
  public void setSequenceType(String sequenceType) {
    this.sequenceType = sequenceType;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("updatedDate")
  public Long getUpdatedDate() {
    return updatedDate;
  }
  public void setUpdatedDate(Long updatedDate) {
    this.updatedDate = updatedDate;
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
  @JsonProperty("missionType")
  public String getMissionType() {
    return missionType;
  }
  public void setMissionType(String missionType) {
    this.missionType = missionType;
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
  @JsonProperty("rewards")
  @Valid
  public List<@Valid RewardResponse> getRewards() {
    return rewards;
  }
  public void setRewards(List<@Valid RewardResponse> rewards) {
    this.rewards = rewards;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("games")
  @Valid
  public GameListResponse getGames() {
    return games;
  }
  public void setGames(GameListResponse games) {
    this.games = games;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("scores")
  @Valid
  public ScoreListResponse getScores() {
    return scores;
  }
  public void setScores(ScoreListResponse scores) {
    this.scores = scores;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("userPermissionsList")
  @Valid
  public UserPermissionsListResponse getUserPermissionsList() {
    return userPermissionsList;
  }
  public void setUserPermissionsList(UserPermissionsListResponse userPermissionsList) {
    this.userPermissionsList = userPermissionsList;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("results")
  @Valid
  public List<@Valid NameStringValueResponse> getResults() {
    return results;
  }
  public void setResults(List<@Valid NameStringValueResponse> results) {
    this.results = results;
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
  @JsonProperty("audiences")
  @Valid
  public List<@Valid AudienceResponse> getAudiences() {
    return audiences;
  }
  public void setAudiences(List<@Valid AudienceResponse> audiences) {
    this.audiences = audiences;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("missionInviteId")
  public Long getMissionInviteId() {
    return missionInviteId;
  }
  public void setMissionInviteId(Long missionInviteId) {
    this.missionInviteId = missionInviteId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("missionInvite")
  @Valid
  public MissionInviteResponse getMissionInvite() {
    return missionInvite;
  }
  public void setMissionInvite(MissionInviteResponse missionInvite) {
    this.missionInvite = missionInvite;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("invitee")
  @Valid
  public AccountShortResponse getInvitee() {
    return invitee;
  }
  public void setInvitee(AccountShortResponse invitee) {
    this.invitee = invitee;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("formatType")
  public String getFormatType() {
    return formatType;
  }
  public void setFormatType(String formatType) {
    this.formatType = formatType;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("creatives")
  @Valid
  public List<@Valid CreativeResponse> getCreatives() {
    return creatives;
  }
  public void setCreatives(List<@Valid CreativeResponse> creatives) {
    this.creatives = creatives;
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
  @JsonProperty("splitReward")
  public String getSplitReward() {
    return splitReward;
  }
  public void setSplitReward(String splitReward) {
    this.splitReward = splitReward;
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
  @JsonProperty("advancedReporting")
  public Boolean getAdvancedReporting() {
    return advancedReporting;
  }
  public void setAdvancedReporting(Boolean advancedReporting) {
    this.advancedReporting = advancedReporting;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MissionResponse missionResponse = (MissionResponse) o;
    return Objects.equals(this.action, missionResponse.action) &&
        Objects.equals(this.highestAppVersion, missionResponse.highestAppVersion) &&
        Objects.equals(this.missionId, missionResponse.missionId) &&
        Objects.equals(this.ticketsEarned, missionResponse.ticketsEarned) &&
        Objects.equals(this.costToPlay, missionResponse.costToPlay) &&
        Objects.equals(this.costToPlayType, missionResponse.costToPlayType) &&
        Objects.equals(this.owner, missionResponse.owner) &&
        Objects.equals(this.title, missionResponse.title) &&
        Objects.equals(this.description, missionResponse.description) &&
        Objects.equals(this.authorOverride, missionResponse.authorOverride) &&
        Objects.equals(this.icon, missionResponse.icon) &&
        Objects.equals(this.image, missionResponse.image) &&
        Objects.equals(this.sequenceType, missionResponse.sequenceType) &&
        Objects.equals(this.updatedDate, missionResponse.updatedDate) &&
        Objects.equals(this.startDate, missionResponse.startDate) &&
        Objects.equals(this.endDate, missionResponse.endDate) &&
        Objects.equals(this.missionType, missionResponse.missionType) &&
        Objects.equals(this.active, missionResponse.active) &&
        Objects.equals(this.balance, missionResponse.balance) &&
        Objects.equals(this.availableLimit, missionResponse.availableLimit) &&
        Objects.equals(this.inviteCount, missionResponse.inviteCount) &&
        Objects.equals(this.acceptedCount, missionResponse.acceptedCount) &&
        Objects.equals(this.childCount, missionResponse.childCount) &&
        Objects.equals(this.enableBuyBack, missionResponse.enableBuyBack) &&
        Objects.equals(this.minimumToPlay, missionResponse.minimumToPlay) &&
        Objects.equals(this.rewarded, missionResponse.rewarded) &&
        Objects.equals(this.refunded, missionResponse.refunded) &&
        Objects.equals(this.joinCode, missionResponse.joinCode) &&
        Objects.equals(this.rewards, missionResponse.rewards) &&
        Objects.equals(this.games, missionResponse.games) &&
        Objects.equals(this.scores, missionResponse.scores) &&
        Objects.equals(this.userPermissionsList, missionResponse.userPermissionsList) &&
        Objects.equals(this.results, missionResponse.results) &&
        Objects.equals(this.inviteStatus, missionResponse.inviteStatus) &&
        Objects.equals(this.audiences, missionResponse.audiences) &&
        Objects.equals(this.missionInviteId, missionResponse.missionInviteId) &&
        Objects.equals(this.missionInvite, missionResponse.missionInvite) &&
        Objects.equals(this.invitee, missionResponse.invitee) &&
        Objects.equals(this.formatType, missionResponse.formatType) &&
        Objects.equals(this.creatives, missionResponse.creatives) &&
        Objects.equals(this.fixedReward, missionResponse.fixedReward) &&
        Objects.equals(this.allocateTickets, missionResponse.allocateTickets) &&
        Objects.equals(this.ticketType, missionResponse.ticketType) &&
        Objects.equals(this.ticketCount, missionResponse.ticketCount) &&
        Objects.equals(this.points, missionResponse.points) &&
        Objects.equals(this.splitReward, missionResponse.splitReward) &&
        Objects.equals(this.secondsBetweenLevels, missionResponse.secondsBetweenLevels) &&
        Objects.equals(this.secondsBetweenPacks, missionResponse.secondsBetweenPacks) &&
        Objects.equals(this.advancedReporting, missionResponse.advancedReporting);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, highestAppVersion, missionId, ticketsEarned, costToPlay, costToPlayType, owner, title, description, authorOverride, icon, image, sequenceType, updatedDate, startDate, endDate, missionType, active, balance, availableLimit, inviteCount, acceptedCount, childCount, enableBuyBack, minimumToPlay, rewarded, refunded, joinCode, rewards, games, scores, userPermissionsList, results, inviteStatus, audiences, missionInviteId, missionInvite, invitee, formatType, creatives, fixedReward, allocateTickets, ticketType, ticketCount, points, splitReward, secondsBetweenLevels, secondsBetweenPacks, advancedReporting);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MissionResponse {\n");
    
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


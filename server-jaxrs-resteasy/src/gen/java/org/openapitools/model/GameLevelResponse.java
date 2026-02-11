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
import org.openapitools.model.GameObjectListResponse;
import org.openapitools.model.NameStringValueResponse;
import org.openapitools.model.NoteResponse;
import org.openapitools.model.OfferShortResponse;
import org.openapitools.model.ScoreListResponse;
import org.openapitools.model.TicketListResponse;
import org.openapitools.model.TutorialResponse;
import org.openapitools.model.UserPermissionsListResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class GameLevelResponse   {
  

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
  private Long gameLevelId;
  private String gameType;
  private Boolean active;
  private String name;
  private String description;
  private String difficulty;
  private String appVersion;
  private Long likesCount;
  private Long dislikesCount;
  private Long commentsCount;
  private Long downloadCount;
  private List<@Valid NoteResponse> comments = new ArrayList<>();
  private Boolean locked;
  private Boolean completed;
  private Long ticketsEarned;
  private GameObjectListResponse gameObjects;
  private Boolean hasLiked;
  private AssetShortResponse image;
  private String gameData;
  private String gameDataSuffix;
  private ScoreListResponse scores;
  private AccountShortResponse owner;
  private UserPermissionsListResponse userPermissionsList;
  private List<@Valid NameStringValueResponse> results = new ArrayList<>();
  private Boolean randomizeGameObjects;
  private TicketListResponse tickets;
  private Boolean assignMission;
  private AssetShortResponse icon;
  private String authorOverride;
  private Long updatedDate;
  private Long startDate;
  private Long endDate;
  private String splashTitle;
  private String splashMessage;
  private Boolean hasFlagged;
  private Boolean allocateTickets;
  private String ticketType;
  private Long ticketCount;
  private Long points;
  private String winnerMessage;
  private TutorialResponse tutorial;
  private String appKey;
  private String appName;

  /**
   * Gets or Sets scoringType
   */
  public enum ScoringTypeEnum {
    GAME_LEVEL("GAME_LEVEL"),

        GAME_OBJECT("GAME_OBJECT");
    private String value;

    ScoringTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private ScoringTypeEnum scoringType;
  private String tutorialTitle;
  private String tutorialMessage;
  private String tutorialAlignment;
  private AssetShortResponse tutorialImage;
  private Long nextLevelId;
  private OfferShortResponse offer;

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
  @JsonProperty("gameLevelId")
  public Long getGameLevelId() {
    return gameLevelId;
  }
  public void setGameLevelId(Long gameLevelId) {
    this.gameLevelId = gameLevelId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("gameType")
  public String getGameType() {
    return gameType;
  }
  public void setGameType(String gameType) {
    this.gameType = gameType;
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
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
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
  @JsonProperty("difficulty")
  public String getDifficulty() {
    return difficulty;
  }
  public void setDifficulty(String difficulty) {
    this.difficulty = difficulty;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("appVersion")
  public String getAppVersion() {
    return appVersion;
  }
  public void setAppVersion(String appVersion) {
    this.appVersion = appVersion;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("likesCount")
  public Long getLikesCount() {
    return likesCount;
  }
  public void setLikesCount(Long likesCount) {
    this.likesCount = likesCount;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("dislikesCount")
  public Long getDislikesCount() {
    return dislikesCount;
  }
  public void setDislikesCount(Long dislikesCount) {
    this.dislikesCount = dislikesCount;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("commentsCount")
  public Long getCommentsCount() {
    return commentsCount;
  }
  public void setCommentsCount(Long commentsCount) {
    this.commentsCount = commentsCount;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("downloadCount")
  public Long getDownloadCount() {
    return downloadCount;
  }
  public void setDownloadCount(Long downloadCount) {
    this.downloadCount = downloadCount;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("comments")
  @Valid
  public List<@Valid NoteResponse> getComments() {
    return comments;
  }
  public void setComments(List<@Valid NoteResponse> comments) {
    this.comments = comments;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("locked")
  public Boolean getLocked() {
    return locked;
  }
  public void setLocked(Boolean locked) {
    this.locked = locked;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("completed")
  public Boolean getCompleted() {
    return completed;
  }
  public void setCompleted(Boolean completed) {
    this.completed = completed;
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
  @JsonProperty("gameObjects")
  @Valid
  public GameObjectListResponse getGameObjects() {
    return gameObjects;
  }
  public void setGameObjects(GameObjectListResponse gameObjects) {
    this.gameObjects = gameObjects;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("hasLiked")
  public Boolean getHasLiked() {
    return hasLiked;
  }
  public void setHasLiked(Boolean hasLiked) {
    this.hasLiked = hasLiked;
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
  @JsonProperty("gameData")
  public String getGameData() {
    return gameData;
  }
  public void setGameData(String gameData) {
    this.gameData = gameData;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("gameDataSuffix")
  public String getGameDataSuffix() {
    return gameDataSuffix;
  }
  public void setGameDataSuffix(String gameDataSuffix) {
    this.gameDataSuffix = gameDataSuffix;
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
  @JsonProperty("randomizeGameObjects")
  public Boolean getRandomizeGameObjects() {
    return randomizeGameObjects;
  }
  public void setRandomizeGameObjects(Boolean randomizeGameObjects) {
    this.randomizeGameObjects = randomizeGameObjects;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("tickets")
  @Valid
  public TicketListResponse getTickets() {
    return tickets;
  }
  public void setTickets(TicketListResponse tickets) {
    this.tickets = tickets;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("assignMission")
  public Boolean getAssignMission() {
    return assignMission;
  }
  public void setAssignMission(Boolean assignMission) {
    this.assignMission = assignMission;
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
  @JsonProperty("splashTitle")
  public String getSplashTitle() {
    return splashTitle;
  }
  public void setSplashTitle(String splashTitle) {
    this.splashTitle = splashTitle;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("splashMessage")
  public String getSplashMessage() {
    return splashMessage;
  }
  public void setSplashMessage(String splashMessage) {
    this.splashMessage = splashMessage;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("hasFlagged")
  public Boolean getHasFlagged() {
    return hasFlagged;
  }
  public void setHasFlagged(Boolean hasFlagged) {
    this.hasFlagged = hasFlagged;
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
  @JsonProperty("winnerMessage")
  public String getWinnerMessage() {
    return winnerMessage;
  }
  public void setWinnerMessage(String winnerMessage) {
    this.winnerMessage = winnerMessage;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("tutorial")
  @Valid
  public TutorialResponse getTutorial() {
    return tutorial;
  }
  public void setTutorial(TutorialResponse tutorial) {
    this.tutorial = tutorial;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("appKey")
  public String getAppKey() {
    return appKey;
  }
  public void setAppKey(String appKey) {
    this.appKey = appKey;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("appName")
  public String getAppName() {
    return appName;
  }
  public void setAppName(String appName) {
    this.appName = appName;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("scoringType")
  public ScoringTypeEnum getScoringType() {
    return scoringType;
  }
  public void setScoringType(ScoringTypeEnum scoringType) {
    this.scoringType = scoringType;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("tutorialTitle")
  public String getTutorialTitle() {
    return tutorialTitle;
  }
  public void setTutorialTitle(String tutorialTitle) {
    this.tutorialTitle = tutorialTitle;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("tutorialMessage")
  public String getTutorialMessage() {
    return tutorialMessage;
  }
  public void setTutorialMessage(String tutorialMessage) {
    this.tutorialMessage = tutorialMessage;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("tutorialAlignment")
  public String getTutorialAlignment() {
    return tutorialAlignment;
  }
  public void setTutorialAlignment(String tutorialAlignment) {
    this.tutorialAlignment = tutorialAlignment;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("tutorialImage")
  @Valid
  public AssetShortResponse getTutorialImage() {
    return tutorialImage;
  }
  public void setTutorialImage(AssetShortResponse tutorialImage) {
    this.tutorialImage = tutorialImage;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("nextLevelId")
  public Long getNextLevelId() {
    return nextLevelId;
  }
  public void setNextLevelId(Long nextLevelId) {
    this.nextLevelId = nextLevelId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("offer")
  @Valid
  public OfferShortResponse getOffer() {
    return offer;
  }
  public void setOffer(OfferShortResponse offer) {
    this.offer = offer;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GameLevelResponse gameLevelResponse = (GameLevelResponse) o;
    return Objects.equals(this.action, gameLevelResponse.action) &&
        Objects.equals(this.gameLevelId, gameLevelResponse.gameLevelId) &&
        Objects.equals(this.gameType, gameLevelResponse.gameType) &&
        Objects.equals(this.active, gameLevelResponse.active) &&
        Objects.equals(this.name, gameLevelResponse.name) &&
        Objects.equals(this.description, gameLevelResponse.description) &&
        Objects.equals(this.difficulty, gameLevelResponse.difficulty) &&
        Objects.equals(this.appVersion, gameLevelResponse.appVersion) &&
        Objects.equals(this.likesCount, gameLevelResponse.likesCount) &&
        Objects.equals(this.dislikesCount, gameLevelResponse.dislikesCount) &&
        Objects.equals(this.commentsCount, gameLevelResponse.commentsCount) &&
        Objects.equals(this.downloadCount, gameLevelResponse.downloadCount) &&
        Objects.equals(this.comments, gameLevelResponse.comments) &&
        Objects.equals(this.locked, gameLevelResponse.locked) &&
        Objects.equals(this.completed, gameLevelResponse.completed) &&
        Objects.equals(this.ticketsEarned, gameLevelResponse.ticketsEarned) &&
        Objects.equals(this.gameObjects, gameLevelResponse.gameObjects) &&
        Objects.equals(this.hasLiked, gameLevelResponse.hasLiked) &&
        Objects.equals(this.image, gameLevelResponse.image) &&
        Objects.equals(this.gameData, gameLevelResponse.gameData) &&
        Objects.equals(this.gameDataSuffix, gameLevelResponse.gameDataSuffix) &&
        Objects.equals(this.scores, gameLevelResponse.scores) &&
        Objects.equals(this.owner, gameLevelResponse.owner) &&
        Objects.equals(this.userPermissionsList, gameLevelResponse.userPermissionsList) &&
        Objects.equals(this.results, gameLevelResponse.results) &&
        Objects.equals(this.randomizeGameObjects, gameLevelResponse.randomizeGameObjects) &&
        Objects.equals(this.tickets, gameLevelResponse.tickets) &&
        Objects.equals(this.assignMission, gameLevelResponse.assignMission) &&
        Objects.equals(this.icon, gameLevelResponse.icon) &&
        Objects.equals(this.authorOverride, gameLevelResponse.authorOverride) &&
        Objects.equals(this.updatedDate, gameLevelResponse.updatedDate) &&
        Objects.equals(this.startDate, gameLevelResponse.startDate) &&
        Objects.equals(this.endDate, gameLevelResponse.endDate) &&
        Objects.equals(this.splashTitle, gameLevelResponse.splashTitle) &&
        Objects.equals(this.splashMessage, gameLevelResponse.splashMessage) &&
        Objects.equals(this.hasFlagged, gameLevelResponse.hasFlagged) &&
        Objects.equals(this.allocateTickets, gameLevelResponse.allocateTickets) &&
        Objects.equals(this.ticketType, gameLevelResponse.ticketType) &&
        Objects.equals(this.ticketCount, gameLevelResponse.ticketCount) &&
        Objects.equals(this.points, gameLevelResponse.points) &&
        Objects.equals(this.winnerMessage, gameLevelResponse.winnerMessage) &&
        Objects.equals(this.tutorial, gameLevelResponse.tutorial) &&
        Objects.equals(this.appKey, gameLevelResponse.appKey) &&
        Objects.equals(this.appName, gameLevelResponse.appName) &&
        Objects.equals(this.scoringType, gameLevelResponse.scoringType) &&
        Objects.equals(this.tutorialTitle, gameLevelResponse.tutorialTitle) &&
        Objects.equals(this.tutorialMessage, gameLevelResponse.tutorialMessage) &&
        Objects.equals(this.tutorialAlignment, gameLevelResponse.tutorialAlignment) &&
        Objects.equals(this.tutorialImage, gameLevelResponse.tutorialImage) &&
        Objects.equals(this.nextLevelId, gameLevelResponse.nextLevelId) &&
        Objects.equals(this.offer, gameLevelResponse.offer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, gameLevelId, gameType, active, name, description, difficulty, appVersion, likesCount, dislikesCount, commentsCount, downloadCount, comments, locked, completed, ticketsEarned, gameObjects, hasLiked, image, gameData, gameDataSuffix, scores, owner, userPermissionsList, results, randomizeGameObjects, tickets, assignMission, icon, authorOverride, updatedDate, startDate, endDate, splashTitle, splashMessage, hasFlagged, allocateTickets, ticketType, ticketCount, points, winnerMessage, tutorial, appKey, appName, scoringType, tutorialTitle, tutorialMessage, tutorialAlignment, tutorialImage, nextLevelId, offer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GameLevelResponse {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    gameLevelId: ").append(toIndentedString(gameLevelId)).append("\n");
    sb.append("    gameType: ").append(toIndentedString(gameType)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    difficulty: ").append(toIndentedString(difficulty)).append("\n");
    sb.append("    appVersion: ").append(toIndentedString(appVersion)).append("\n");
    sb.append("    likesCount: ").append(toIndentedString(likesCount)).append("\n");
    sb.append("    dislikesCount: ").append(toIndentedString(dislikesCount)).append("\n");
    sb.append("    commentsCount: ").append(toIndentedString(commentsCount)).append("\n");
    sb.append("    downloadCount: ").append(toIndentedString(downloadCount)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    locked: ").append(toIndentedString(locked)).append("\n");
    sb.append("    completed: ").append(toIndentedString(completed)).append("\n");
    sb.append("    ticketsEarned: ").append(toIndentedString(ticketsEarned)).append("\n");
    sb.append("    gameObjects: ").append(toIndentedString(gameObjects)).append("\n");
    sb.append("    hasLiked: ").append(toIndentedString(hasLiked)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    gameData: ").append(toIndentedString(gameData)).append("\n");
    sb.append("    gameDataSuffix: ").append(toIndentedString(gameDataSuffix)).append("\n");
    sb.append("    scores: ").append(toIndentedString(scores)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    userPermissionsList: ").append(toIndentedString(userPermissionsList)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
    sb.append("    randomizeGameObjects: ").append(toIndentedString(randomizeGameObjects)).append("\n");
    sb.append("    tickets: ").append(toIndentedString(tickets)).append("\n");
    sb.append("    assignMission: ").append(toIndentedString(assignMission)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    authorOverride: ").append(toIndentedString(authorOverride)).append("\n");
    sb.append("    updatedDate: ").append(toIndentedString(updatedDate)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    splashTitle: ").append(toIndentedString(splashTitle)).append("\n");
    sb.append("    splashMessage: ").append(toIndentedString(splashMessage)).append("\n");
    sb.append("    hasFlagged: ").append(toIndentedString(hasFlagged)).append("\n");
    sb.append("    allocateTickets: ").append(toIndentedString(allocateTickets)).append("\n");
    sb.append("    ticketType: ").append(toIndentedString(ticketType)).append("\n");
    sb.append("    ticketCount: ").append(toIndentedString(ticketCount)).append("\n");
    sb.append("    points: ").append(toIndentedString(points)).append("\n");
    sb.append("    winnerMessage: ").append(toIndentedString(winnerMessage)).append("\n");
    sb.append("    tutorial: ").append(toIndentedString(tutorial)).append("\n");
    sb.append("    appKey: ").append(toIndentedString(appKey)).append("\n");
    sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
    sb.append("    scoringType: ").append(toIndentedString(scoringType)).append("\n");
    sb.append("    tutorialTitle: ").append(toIndentedString(tutorialTitle)).append("\n");
    sb.append("    tutorialMessage: ").append(toIndentedString(tutorialMessage)).append("\n");
    sb.append("    tutorialAlignment: ").append(toIndentedString(tutorialAlignment)).append("\n");
    sb.append("    tutorialImage: ").append(toIndentedString(tutorialImage)).append("\n");
    sb.append("    nextLevelId: ").append(toIndentedString(nextLevelId)).append("\n");
    sb.append("    offer: ").append(toIndentedString(offer)).append("\n");
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


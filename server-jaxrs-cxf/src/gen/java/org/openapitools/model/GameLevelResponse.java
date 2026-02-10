package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
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

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GameLevelResponse  {
  
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

  private Long gameLevelId;

  @ApiModelProperty(value = "")

  private String gameType;

  @ApiModelProperty(value = "")

  private Boolean active;

  @ApiModelProperty(value = "")

  private String name;

  @ApiModelProperty(value = "")

  private String description;

  @ApiModelProperty(value = "")

  private String difficulty;

  @ApiModelProperty(value = "")

  private String appVersion;

  @ApiModelProperty(value = "")

  private Long likesCount;

  @ApiModelProperty(value = "")

  private Long dislikesCount;

  @ApiModelProperty(value = "")

  private Long commentsCount;

  @ApiModelProperty(value = "")

  private Long downloadCount;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid NoteResponse> comments = new ArrayList<>();

  @ApiModelProperty(value = "")

  private Boolean locked;

  @ApiModelProperty(value = "")

  private Boolean completed;

  @ApiModelProperty(value = "")

  private Long ticketsEarned;

  @ApiModelProperty(value = "")

  @Valid

  private GameObjectListResponse gameObjects;

  @ApiModelProperty(value = "")

  private Boolean hasLiked;

  @ApiModelProperty(value = "")

  @Valid

  private AssetShortResponse image;

  @ApiModelProperty(value = "")

  private String gameData;

  @ApiModelProperty(value = "")

  private String gameDataSuffix;

  @ApiModelProperty(value = "")

  @Valid

  private ScoreListResponse scores;

  @ApiModelProperty(value = "")

  @Valid

  private AccountShortResponse owner;

  @ApiModelProperty(value = "")

  @Valid

  private UserPermissionsListResponse userPermissionsList;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid NameStringValueResponse> results = new ArrayList<>();

  @ApiModelProperty(value = "")

  private Boolean randomizeGameObjects;

  @ApiModelProperty(value = "")

  @Valid

  private TicketListResponse tickets;

  @ApiModelProperty(value = "")

  private Boolean assignMission;

  @ApiModelProperty(value = "")

  @Valid

  private AssetShortResponse icon;

  @ApiModelProperty(value = "")

  private String authorOverride;

  @ApiModelProperty(value = "")

  private Long updatedDate;

  @ApiModelProperty(value = "")

  private Long startDate;

  @ApiModelProperty(value = "")

  private Long endDate;

  @ApiModelProperty(value = "")

  private String splashTitle;

  @ApiModelProperty(value = "")

  private String splashMessage;

  @ApiModelProperty(value = "")

  private Boolean hasFlagged;

  @ApiModelProperty(value = "")

  private Boolean allocateTickets;

  @ApiModelProperty(value = "")

  private String ticketType;

  @ApiModelProperty(value = "")

  private Long ticketCount;

  @ApiModelProperty(value = "")

  private Long points;

  @ApiModelProperty(value = "")

  private String winnerMessage;

  @ApiModelProperty(value = "")

  @Valid

  private TutorialResponse tutorial;

  @ApiModelProperty(value = "")

  private String appKey;

  @ApiModelProperty(value = "")

  private String appName;

public enum ScoringTypeEnum {

GAME_LEVEL(String.valueOf("GAME_LEVEL")), GAME_OBJECT(String.valueOf("GAME_OBJECT"));


    private String value;

    ScoringTypeEnum (String v) {
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
    public static ScoringTypeEnum fromValue(String value) {
        for (ScoringTypeEnum b : ScoringTypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(value = "")

  private ScoringTypeEnum scoringType;

  @ApiModelProperty(value = "")

  private String tutorialTitle;

  @ApiModelProperty(value = "")

  private String tutorialMessage;

  @ApiModelProperty(value = "")

  private String tutorialAlignment;

  @ApiModelProperty(value = "")

  @Valid

  private AssetShortResponse tutorialImage;

  @ApiModelProperty(value = "")

  private Long nextLevelId;

  @ApiModelProperty(value = "")

  @Valid

  private OfferShortResponse offer;
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

  public GameLevelResponse action(ActionEnum action) {
    this.action = action;
    return this;
  }

 /**
   * Get gameLevelId
   * @return gameLevelId
  **/
  @JsonProperty("gameLevelId")
  public Long getGameLevelId() {
    return gameLevelId;
  }

  public void setGameLevelId(Long gameLevelId) {
    this.gameLevelId = gameLevelId;
  }

  public GameLevelResponse gameLevelId(Long gameLevelId) {
    this.gameLevelId = gameLevelId;
    return this;
  }

 /**
   * Get gameType
   * @return gameType
  **/
  @JsonProperty("gameType")
  public String getGameType() {
    return gameType;
  }

  public void setGameType(String gameType) {
    this.gameType = gameType;
  }

  public GameLevelResponse gameType(String gameType) {
    this.gameType = gameType;
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

  public GameLevelResponse active(Boolean active) {
    this.active = active;
    return this;
  }

 /**
   * Get name
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GameLevelResponse name(String name) {
    this.name = name;
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

  public GameLevelResponse description(String description) {
    this.description = description;
    return this;
  }

 /**
   * Get difficulty
   * @return difficulty
  **/
  @JsonProperty("difficulty")
  public String getDifficulty() {
    return difficulty;
  }

  public void setDifficulty(String difficulty) {
    this.difficulty = difficulty;
  }

  public GameLevelResponse difficulty(String difficulty) {
    this.difficulty = difficulty;
    return this;
  }

 /**
   * Get appVersion
   * @return appVersion
  **/
  @JsonProperty("appVersion")
  public String getAppVersion() {
    return appVersion;
  }

  public void setAppVersion(String appVersion) {
    this.appVersion = appVersion;
  }

  public GameLevelResponse appVersion(String appVersion) {
    this.appVersion = appVersion;
    return this;
  }

 /**
   * Get likesCount
   * @return likesCount
  **/
  @JsonProperty("likesCount")
  public Long getLikesCount() {
    return likesCount;
  }

  public void setLikesCount(Long likesCount) {
    this.likesCount = likesCount;
  }

  public GameLevelResponse likesCount(Long likesCount) {
    this.likesCount = likesCount;
    return this;
  }

 /**
   * Get dislikesCount
   * @return dislikesCount
  **/
  @JsonProperty("dislikesCount")
  public Long getDislikesCount() {
    return dislikesCount;
  }

  public void setDislikesCount(Long dislikesCount) {
    this.dislikesCount = dislikesCount;
  }

  public GameLevelResponse dislikesCount(Long dislikesCount) {
    this.dislikesCount = dislikesCount;
    return this;
  }

 /**
   * Get commentsCount
   * @return commentsCount
  **/
  @JsonProperty("commentsCount")
  public Long getCommentsCount() {
    return commentsCount;
  }

  public void setCommentsCount(Long commentsCount) {
    this.commentsCount = commentsCount;
  }

  public GameLevelResponse commentsCount(Long commentsCount) {
    this.commentsCount = commentsCount;
    return this;
  }

 /**
   * Get downloadCount
   * @return downloadCount
  **/
  @JsonProperty("downloadCount")
  public Long getDownloadCount() {
    return downloadCount;
  }

  public void setDownloadCount(Long downloadCount) {
    this.downloadCount = downloadCount;
  }

  public GameLevelResponse downloadCount(Long downloadCount) {
    this.downloadCount = downloadCount;
    return this;
  }

 /**
   * Get comments
   * @return comments
  **/
  @JsonProperty("comments")
  public List<@Valid NoteResponse> getComments() {
    return comments;
  }

  public void setComments(List<@Valid NoteResponse> comments) {
    this.comments = comments;
  }

  public GameLevelResponse comments(List<@Valid NoteResponse> comments) {
    this.comments = comments;
    return this;
  }

  public GameLevelResponse addCommentsItem(NoteResponse commentsItem) {
    this.comments.add(commentsItem);
    return this;
  }

 /**
   * Get locked
   * @return locked
  **/
  @JsonProperty("locked")
  public Boolean getLocked() {
    return locked;
  }

  public void setLocked(Boolean locked) {
    this.locked = locked;
  }

  public GameLevelResponse locked(Boolean locked) {
    this.locked = locked;
    return this;
  }

 /**
   * Get completed
   * @return completed
  **/
  @JsonProperty("completed")
  public Boolean getCompleted() {
    return completed;
  }

  public void setCompleted(Boolean completed) {
    this.completed = completed;
  }

  public GameLevelResponse completed(Boolean completed) {
    this.completed = completed;
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

  public GameLevelResponse ticketsEarned(Long ticketsEarned) {
    this.ticketsEarned = ticketsEarned;
    return this;
  }

 /**
   * Get gameObjects
   * @return gameObjects
  **/
  @JsonProperty("gameObjects")
  public GameObjectListResponse getGameObjects() {
    return gameObjects;
  }

  public void setGameObjects(GameObjectListResponse gameObjects) {
    this.gameObjects = gameObjects;
  }

  public GameLevelResponse gameObjects(GameObjectListResponse gameObjects) {
    this.gameObjects = gameObjects;
    return this;
  }

 /**
   * Get hasLiked
   * @return hasLiked
  **/
  @JsonProperty("hasLiked")
  public Boolean getHasLiked() {
    return hasLiked;
  }

  public void setHasLiked(Boolean hasLiked) {
    this.hasLiked = hasLiked;
  }

  public GameLevelResponse hasLiked(Boolean hasLiked) {
    this.hasLiked = hasLiked;
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

  public GameLevelResponse image(AssetShortResponse image) {
    this.image = image;
    return this;
  }

 /**
   * Get gameData
   * @return gameData
  **/
  @JsonProperty("gameData")
  public String getGameData() {
    return gameData;
  }

  public void setGameData(String gameData) {
    this.gameData = gameData;
  }

  public GameLevelResponse gameData(String gameData) {
    this.gameData = gameData;
    return this;
  }

 /**
   * Get gameDataSuffix
   * @return gameDataSuffix
  **/
  @JsonProperty("gameDataSuffix")
  public String getGameDataSuffix() {
    return gameDataSuffix;
  }

  public void setGameDataSuffix(String gameDataSuffix) {
    this.gameDataSuffix = gameDataSuffix;
  }

  public GameLevelResponse gameDataSuffix(String gameDataSuffix) {
    this.gameDataSuffix = gameDataSuffix;
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

  public GameLevelResponse scores(ScoreListResponse scores) {
    this.scores = scores;
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

  public GameLevelResponse owner(AccountShortResponse owner) {
    this.owner = owner;
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

  public GameLevelResponse userPermissionsList(UserPermissionsListResponse userPermissionsList) {
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

  public GameLevelResponse results(List<@Valid NameStringValueResponse> results) {
    this.results = results;
    return this;
  }

  public GameLevelResponse addResultsItem(NameStringValueResponse resultsItem) {
    this.results.add(resultsItem);
    return this;
  }

 /**
   * Get randomizeGameObjects
   * @return randomizeGameObjects
  **/
  @JsonProperty("randomizeGameObjects")
  public Boolean getRandomizeGameObjects() {
    return randomizeGameObjects;
  }

  public void setRandomizeGameObjects(Boolean randomizeGameObjects) {
    this.randomizeGameObjects = randomizeGameObjects;
  }

  public GameLevelResponse randomizeGameObjects(Boolean randomizeGameObjects) {
    this.randomizeGameObjects = randomizeGameObjects;
    return this;
  }

 /**
   * Get tickets
   * @return tickets
  **/
  @JsonProperty("tickets")
  public TicketListResponse getTickets() {
    return tickets;
  }

  public void setTickets(TicketListResponse tickets) {
    this.tickets = tickets;
  }

  public GameLevelResponse tickets(TicketListResponse tickets) {
    this.tickets = tickets;
    return this;
  }

 /**
   * Get assignMission
   * @return assignMission
  **/
  @JsonProperty("assignMission")
  public Boolean getAssignMission() {
    return assignMission;
  }

  public void setAssignMission(Boolean assignMission) {
    this.assignMission = assignMission;
  }

  public GameLevelResponse assignMission(Boolean assignMission) {
    this.assignMission = assignMission;
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

  public GameLevelResponse icon(AssetShortResponse icon) {
    this.icon = icon;
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

  public GameLevelResponse authorOverride(String authorOverride) {
    this.authorOverride = authorOverride;
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

  public GameLevelResponse updatedDate(Long updatedDate) {
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

  public GameLevelResponse startDate(Long startDate) {
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

  public GameLevelResponse endDate(Long endDate) {
    this.endDate = endDate;
    return this;
  }

 /**
   * Get splashTitle
   * @return splashTitle
  **/
  @JsonProperty("splashTitle")
  public String getSplashTitle() {
    return splashTitle;
  }

  public void setSplashTitle(String splashTitle) {
    this.splashTitle = splashTitle;
  }

  public GameLevelResponse splashTitle(String splashTitle) {
    this.splashTitle = splashTitle;
    return this;
  }

 /**
   * Get splashMessage
   * @return splashMessage
  **/
  @JsonProperty("splashMessage")
  public String getSplashMessage() {
    return splashMessage;
  }

  public void setSplashMessage(String splashMessage) {
    this.splashMessage = splashMessage;
  }

  public GameLevelResponse splashMessage(String splashMessage) {
    this.splashMessage = splashMessage;
    return this;
  }

 /**
   * Get hasFlagged
   * @return hasFlagged
  **/
  @JsonProperty("hasFlagged")
  public Boolean getHasFlagged() {
    return hasFlagged;
  }

  public void setHasFlagged(Boolean hasFlagged) {
    this.hasFlagged = hasFlagged;
  }

  public GameLevelResponse hasFlagged(Boolean hasFlagged) {
    this.hasFlagged = hasFlagged;
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

  public GameLevelResponse allocateTickets(Boolean allocateTickets) {
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

  public GameLevelResponse ticketType(String ticketType) {
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

  public GameLevelResponse ticketCount(Long ticketCount) {
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

  public GameLevelResponse points(Long points) {
    this.points = points;
    return this;
  }

 /**
   * Get winnerMessage
   * @return winnerMessage
  **/
  @JsonProperty("winnerMessage")
  public String getWinnerMessage() {
    return winnerMessage;
  }

  public void setWinnerMessage(String winnerMessage) {
    this.winnerMessage = winnerMessage;
  }

  public GameLevelResponse winnerMessage(String winnerMessage) {
    this.winnerMessage = winnerMessage;
    return this;
  }

 /**
   * Get tutorial
   * @return tutorial
  **/
  @JsonProperty("tutorial")
  public TutorialResponse getTutorial() {
    return tutorial;
  }

  public void setTutorial(TutorialResponse tutorial) {
    this.tutorial = tutorial;
  }

  public GameLevelResponse tutorial(TutorialResponse tutorial) {
    this.tutorial = tutorial;
    return this;
  }

 /**
   * Get appKey
   * @return appKey
  **/
  @JsonProperty("appKey")
  public String getAppKey() {
    return appKey;
  }

  public void setAppKey(String appKey) {
    this.appKey = appKey;
  }

  public GameLevelResponse appKey(String appKey) {
    this.appKey = appKey;
    return this;
  }

 /**
   * Get appName
   * @return appName
  **/
  @JsonProperty("appName")
  public String getAppName() {
    return appName;
  }

  public void setAppName(String appName) {
    this.appName = appName;
  }

  public GameLevelResponse appName(String appName) {
    this.appName = appName;
    return this;
  }

 /**
   * Get scoringType
   * @return scoringType
  **/
  @JsonProperty("scoringType")
  public String getScoringType() {
    if (scoringType == null) {
      return null;
    }
    return scoringType.value();
  }

  public void setScoringType(ScoringTypeEnum scoringType) {
    this.scoringType = scoringType;
  }

  public GameLevelResponse scoringType(ScoringTypeEnum scoringType) {
    this.scoringType = scoringType;
    return this;
  }

 /**
   * Get tutorialTitle
   * @return tutorialTitle
  **/
  @JsonProperty("tutorialTitle")
  public String getTutorialTitle() {
    return tutorialTitle;
  }

  public void setTutorialTitle(String tutorialTitle) {
    this.tutorialTitle = tutorialTitle;
  }

  public GameLevelResponse tutorialTitle(String tutorialTitle) {
    this.tutorialTitle = tutorialTitle;
    return this;
  }

 /**
   * Get tutorialMessage
   * @return tutorialMessage
  **/
  @JsonProperty("tutorialMessage")
  public String getTutorialMessage() {
    return tutorialMessage;
  }

  public void setTutorialMessage(String tutorialMessage) {
    this.tutorialMessage = tutorialMessage;
  }

  public GameLevelResponse tutorialMessage(String tutorialMessage) {
    this.tutorialMessage = tutorialMessage;
    return this;
  }

 /**
   * Get tutorialAlignment
   * @return tutorialAlignment
  **/
  @JsonProperty("tutorialAlignment")
  public String getTutorialAlignment() {
    return tutorialAlignment;
  }

  public void setTutorialAlignment(String tutorialAlignment) {
    this.tutorialAlignment = tutorialAlignment;
  }

  public GameLevelResponse tutorialAlignment(String tutorialAlignment) {
    this.tutorialAlignment = tutorialAlignment;
    return this;
  }

 /**
   * Get tutorialImage
   * @return tutorialImage
  **/
  @JsonProperty("tutorialImage")
  public AssetShortResponse getTutorialImage() {
    return tutorialImage;
  }

  public void setTutorialImage(AssetShortResponse tutorialImage) {
    this.tutorialImage = tutorialImage;
  }

  public GameLevelResponse tutorialImage(AssetShortResponse tutorialImage) {
    this.tutorialImage = tutorialImage;
    return this;
  }

 /**
   * Get nextLevelId
   * @return nextLevelId
  **/
  @JsonProperty("nextLevelId")
  public Long getNextLevelId() {
    return nextLevelId;
  }

  public void setNextLevelId(Long nextLevelId) {
    this.nextLevelId = nextLevelId;
  }

  public GameLevelResponse nextLevelId(Long nextLevelId) {
    this.nextLevelId = nextLevelId;
    return this;
  }

 /**
   * Get offer
   * @return offer
  **/
  @JsonProperty("offer")
  public OfferShortResponse getOffer() {
    return offer;
  }

  public void setOffer(OfferShortResponse offer) {
    this.offer = offer;
  }

  public GameLevelResponse offer(OfferShortResponse offer) {
    this.offer = offer;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


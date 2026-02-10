package apimodels;

import apimodels.AccountShortResponse;
import apimodels.AssetShortResponse;
import apimodels.GameObjectListResponse;
import apimodels.NameStringValueResponse;
import apimodels.NoteResponse;
import apimodels.OfferShortResponse;
import apimodels.ScoreListResponse;
import apimodels.TicketListResponse;
import apimodels.TutorialResponse;
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
 * GameLevelResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class GameLevelResponse   {
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

  @JsonProperty("gameLevelId")
  
  private Long gameLevelId;

  @JsonProperty("gameType")
  
  private String gameType;

  @JsonProperty("active")
  
  private Boolean active;

  @JsonProperty("name")
  
  private String name;

  @JsonProperty("description")
  
  private String description;

  @JsonProperty("difficulty")
  
  private String difficulty;

  @JsonProperty("appVersion")
  
  private String appVersion;

  @JsonProperty("likesCount")
  
  private Long likesCount;

  @JsonProperty("dislikesCount")
  
  private Long dislikesCount;

  @JsonProperty("commentsCount")
  
  private Long commentsCount;

  @JsonProperty("downloadCount")
  
  private Long downloadCount;

  @JsonProperty("comments")
  @Valid

  private List<@Valid NoteResponse> comments = null;

  @JsonProperty("locked")
  
  private Boolean locked;

  @JsonProperty("completed")
  
  private Boolean completed;

  @JsonProperty("ticketsEarned")
  
  private Long ticketsEarned;

  @JsonProperty("gameObjects")
  @Valid

  private GameObjectListResponse gameObjects;

  @JsonProperty("hasLiked")
  
  private Boolean hasLiked;

  @JsonProperty("image")
  @Valid

  private AssetShortResponse image;

  @JsonProperty("gameData")
  
  private String gameData;

  @JsonProperty("gameDataSuffix")
  
  private String gameDataSuffix;

  @JsonProperty("scores")
  @Valid

  private ScoreListResponse scores;

  @JsonProperty("owner")
  @Valid

  private AccountShortResponse owner;

  @JsonProperty("userPermissionsList")
  @Valid

  private UserPermissionsListResponse userPermissionsList;

  @JsonProperty("results")
  @Valid

  private List<@Valid NameStringValueResponse> results = null;

  @JsonProperty("randomizeGameObjects")
  
  private Boolean randomizeGameObjects;

  @JsonProperty("tickets")
  @Valid

  private TicketListResponse tickets;

  @JsonProperty("assignMission")
  
  private Boolean assignMission;

  @JsonProperty("icon")
  @Valid

  private AssetShortResponse icon;

  @JsonProperty("authorOverride")
  
  private String authorOverride;

  @JsonProperty("updatedDate")
  
  private Long updatedDate;

  @JsonProperty("startDate")
  
  private Long startDate;

  @JsonProperty("endDate")
  
  private Long endDate;

  @JsonProperty("splashTitle")
  
  private String splashTitle;

  @JsonProperty("splashMessage")
  
  private String splashMessage;

  @JsonProperty("hasFlagged")
  
  private Boolean hasFlagged;

  @JsonProperty("allocateTickets")
  
  private Boolean allocateTickets;

  @JsonProperty("ticketType")
  
  private String ticketType;

  @JsonProperty("ticketCount")
  
  private Long ticketCount;

  @JsonProperty("points")
  
  private Long points;

  @JsonProperty("winnerMessage")
  
  private String winnerMessage;

  @JsonProperty("tutorial")
  @Valid

  private TutorialResponse tutorial;

  @JsonProperty("appKey")
  
  private String appKey;

  @JsonProperty("appName")
  
  private String appName;

  /**
   * Gets or Sets scoringType
   */
  public enum ScoringTypeEnum {
    GAME_LEVEL("GAME_LEVEL"),
    
    GAME_OBJECT("GAME_OBJECT");

    private final String value;

    ScoringTypeEnum(String value) {
      this.value = value;
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

  @JsonProperty("scoringType")
  
  private ScoringTypeEnum scoringType;

  @JsonProperty("tutorialTitle")
  
  private String tutorialTitle;

  @JsonProperty("tutorialMessage")
  
  private String tutorialMessage;

  @JsonProperty("tutorialAlignment")
  
  private String tutorialAlignment;

  @JsonProperty("tutorialImage")
  @Valid

  private AssetShortResponse tutorialImage;

  @JsonProperty("nextLevelId")
  
  private Long nextLevelId;

  @JsonProperty("offer")
  @Valid

  private OfferShortResponse offer;

  public GameLevelResponse action(ActionEnum action) {
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

  public GameLevelResponse gameLevelId(Long gameLevelId) {
    this.gameLevelId = gameLevelId;
    return this;
  }

   /**
   * Get gameLevelId
   * @return gameLevelId
  **/
  public Long getGameLevelId() {
    return gameLevelId;
  }

  public void setGameLevelId(Long gameLevelId) {
    this.gameLevelId = gameLevelId;
  }

  public GameLevelResponse gameType(String gameType) {
    this.gameType = gameType;
    return this;
  }

   /**
   * Get gameType
   * @return gameType
  **/
  public String getGameType() {
    return gameType;
  }

  public void setGameType(String gameType) {
    this.gameType = gameType;
  }

  public GameLevelResponse active(Boolean active) {
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

  public GameLevelResponse name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GameLevelResponse description(String description) {
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

  public GameLevelResponse difficulty(String difficulty) {
    this.difficulty = difficulty;
    return this;
  }

   /**
   * Get difficulty
   * @return difficulty
  **/
  public String getDifficulty() {
    return difficulty;
  }

  public void setDifficulty(String difficulty) {
    this.difficulty = difficulty;
  }

  public GameLevelResponse appVersion(String appVersion) {
    this.appVersion = appVersion;
    return this;
  }

   /**
   * Get appVersion
   * @return appVersion
  **/
  public String getAppVersion() {
    return appVersion;
  }

  public void setAppVersion(String appVersion) {
    this.appVersion = appVersion;
  }

  public GameLevelResponse likesCount(Long likesCount) {
    this.likesCount = likesCount;
    return this;
  }

   /**
   * Get likesCount
   * @return likesCount
  **/
  public Long getLikesCount() {
    return likesCount;
  }

  public void setLikesCount(Long likesCount) {
    this.likesCount = likesCount;
  }

  public GameLevelResponse dislikesCount(Long dislikesCount) {
    this.dislikesCount = dislikesCount;
    return this;
  }

   /**
   * Get dislikesCount
   * @return dislikesCount
  **/
  public Long getDislikesCount() {
    return dislikesCount;
  }

  public void setDislikesCount(Long dislikesCount) {
    this.dislikesCount = dislikesCount;
  }

  public GameLevelResponse commentsCount(Long commentsCount) {
    this.commentsCount = commentsCount;
    return this;
  }

   /**
   * Get commentsCount
   * @return commentsCount
  **/
  public Long getCommentsCount() {
    return commentsCount;
  }

  public void setCommentsCount(Long commentsCount) {
    this.commentsCount = commentsCount;
  }

  public GameLevelResponse downloadCount(Long downloadCount) {
    this.downloadCount = downloadCount;
    return this;
  }

   /**
   * Get downloadCount
   * @return downloadCount
  **/
  public Long getDownloadCount() {
    return downloadCount;
  }

  public void setDownloadCount(Long downloadCount) {
    this.downloadCount = downloadCount;
  }

  public GameLevelResponse comments(List<@Valid NoteResponse> comments) {
    this.comments = comments;
    return this;
  }

  public GameLevelResponse addCommentsItem(NoteResponse commentsItem) {
    if (this.comments == null) {
      this.comments = new ArrayList<>();
    }
    this.comments.add(commentsItem);
    return this;
  }

   /**
   * Get comments
   * @return comments
  **/
  public List<@Valid NoteResponse> getComments() {
    return comments;
  }

  public void setComments(List<@Valid NoteResponse> comments) {
    this.comments = comments;
  }

  public GameLevelResponse locked(Boolean locked) {
    this.locked = locked;
    return this;
  }

   /**
   * Get locked
   * @return locked
  **/
  public Boolean getLocked() {
    return locked;
  }

  public void setLocked(Boolean locked) {
    this.locked = locked;
  }

  public GameLevelResponse completed(Boolean completed) {
    this.completed = completed;
    return this;
  }

   /**
   * Get completed
   * @return completed
  **/
  public Boolean getCompleted() {
    return completed;
  }

  public void setCompleted(Boolean completed) {
    this.completed = completed;
  }

  public GameLevelResponse ticketsEarned(Long ticketsEarned) {
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

  public GameLevelResponse gameObjects(GameObjectListResponse gameObjects) {
    this.gameObjects = gameObjects;
    return this;
  }

   /**
   * Get gameObjects
   * @return gameObjects
  **/
  public GameObjectListResponse getGameObjects() {
    return gameObjects;
  }

  public void setGameObjects(GameObjectListResponse gameObjects) {
    this.gameObjects = gameObjects;
  }

  public GameLevelResponse hasLiked(Boolean hasLiked) {
    this.hasLiked = hasLiked;
    return this;
  }

   /**
   * Get hasLiked
   * @return hasLiked
  **/
  public Boolean getHasLiked() {
    return hasLiked;
  }

  public void setHasLiked(Boolean hasLiked) {
    this.hasLiked = hasLiked;
  }

  public GameLevelResponse image(AssetShortResponse image) {
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

  public GameLevelResponse gameData(String gameData) {
    this.gameData = gameData;
    return this;
  }

   /**
   * Get gameData
   * @return gameData
  **/
  public String getGameData() {
    return gameData;
  }

  public void setGameData(String gameData) {
    this.gameData = gameData;
  }

  public GameLevelResponse gameDataSuffix(String gameDataSuffix) {
    this.gameDataSuffix = gameDataSuffix;
    return this;
  }

   /**
   * Get gameDataSuffix
   * @return gameDataSuffix
  **/
  public String getGameDataSuffix() {
    return gameDataSuffix;
  }

  public void setGameDataSuffix(String gameDataSuffix) {
    this.gameDataSuffix = gameDataSuffix;
  }

  public GameLevelResponse scores(ScoreListResponse scores) {
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

  public GameLevelResponse owner(AccountShortResponse owner) {
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

  public GameLevelResponse userPermissionsList(UserPermissionsListResponse userPermissionsList) {
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

  public GameLevelResponse results(List<@Valid NameStringValueResponse> results) {
    this.results = results;
    return this;
  }

  public GameLevelResponse addResultsItem(NameStringValueResponse resultsItem) {
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

  public GameLevelResponse randomizeGameObjects(Boolean randomizeGameObjects) {
    this.randomizeGameObjects = randomizeGameObjects;
    return this;
  }

   /**
   * Get randomizeGameObjects
   * @return randomizeGameObjects
  **/
  public Boolean getRandomizeGameObjects() {
    return randomizeGameObjects;
  }

  public void setRandomizeGameObjects(Boolean randomizeGameObjects) {
    this.randomizeGameObjects = randomizeGameObjects;
  }

  public GameLevelResponse tickets(TicketListResponse tickets) {
    this.tickets = tickets;
    return this;
  }

   /**
   * Get tickets
   * @return tickets
  **/
  public TicketListResponse getTickets() {
    return tickets;
  }

  public void setTickets(TicketListResponse tickets) {
    this.tickets = tickets;
  }

  public GameLevelResponse assignMission(Boolean assignMission) {
    this.assignMission = assignMission;
    return this;
  }

   /**
   * Get assignMission
   * @return assignMission
  **/
  public Boolean getAssignMission() {
    return assignMission;
  }

  public void setAssignMission(Boolean assignMission) {
    this.assignMission = assignMission;
  }

  public GameLevelResponse icon(AssetShortResponse icon) {
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

  public GameLevelResponse authorOverride(String authorOverride) {
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

  public GameLevelResponse updatedDate(Long updatedDate) {
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

  public GameLevelResponse startDate(Long startDate) {
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

  public GameLevelResponse endDate(Long endDate) {
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

  public GameLevelResponse splashTitle(String splashTitle) {
    this.splashTitle = splashTitle;
    return this;
  }

   /**
   * Get splashTitle
   * @return splashTitle
  **/
  public String getSplashTitle() {
    return splashTitle;
  }

  public void setSplashTitle(String splashTitle) {
    this.splashTitle = splashTitle;
  }

  public GameLevelResponse splashMessage(String splashMessage) {
    this.splashMessage = splashMessage;
    return this;
  }

   /**
   * Get splashMessage
   * @return splashMessage
  **/
  public String getSplashMessage() {
    return splashMessage;
  }

  public void setSplashMessage(String splashMessage) {
    this.splashMessage = splashMessage;
  }

  public GameLevelResponse hasFlagged(Boolean hasFlagged) {
    this.hasFlagged = hasFlagged;
    return this;
  }

   /**
   * Get hasFlagged
   * @return hasFlagged
  **/
  public Boolean getHasFlagged() {
    return hasFlagged;
  }

  public void setHasFlagged(Boolean hasFlagged) {
    this.hasFlagged = hasFlagged;
  }

  public GameLevelResponse allocateTickets(Boolean allocateTickets) {
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

  public GameLevelResponse ticketType(String ticketType) {
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

  public GameLevelResponse ticketCount(Long ticketCount) {
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

  public GameLevelResponse points(Long points) {
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

  public GameLevelResponse winnerMessage(String winnerMessage) {
    this.winnerMessage = winnerMessage;
    return this;
  }

   /**
   * Get winnerMessage
   * @return winnerMessage
  **/
  public String getWinnerMessage() {
    return winnerMessage;
  }

  public void setWinnerMessage(String winnerMessage) {
    this.winnerMessage = winnerMessage;
  }

  public GameLevelResponse tutorial(TutorialResponse tutorial) {
    this.tutorial = tutorial;
    return this;
  }

   /**
   * Get tutorial
   * @return tutorial
  **/
  public TutorialResponse getTutorial() {
    return tutorial;
  }

  public void setTutorial(TutorialResponse tutorial) {
    this.tutorial = tutorial;
  }

  public GameLevelResponse appKey(String appKey) {
    this.appKey = appKey;
    return this;
  }

   /**
   * Get appKey
   * @return appKey
  **/
  public String getAppKey() {
    return appKey;
  }

  public void setAppKey(String appKey) {
    this.appKey = appKey;
  }

  public GameLevelResponse appName(String appName) {
    this.appName = appName;
    return this;
  }

   /**
   * Get appName
   * @return appName
  **/
  public String getAppName() {
    return appName;
  }

  public void setAppName(String appName) {
    this.appName = appName;
  }

  public GameLevelResponse scoringType(ScoringTypeEnum scoringType) {
    this.scoringType = scoringType;
    return this;
  }

   /**
   * Get scoringType
   * @return scoringType
  **/
  public ScoringTypeEnum getScoringType() {
    return scoringType;
  }

  public void setScoringType(ScoringTypeEnum scoringType) {
    this.scoringType = scoringType;
  }

  public GameLevelResponse tutorialTitle(String tutorialTitle) {
    this.tutorialTitle = tutorialTitle;
    return this;
  }

   /**
   * Get tutorialTitle
   * @return tutorialTitle
  **/
  public String getTutorialTitle() {
    return tutorialTitle;
  }

  public void setTutorialTitle(String tutorialTitle) {
    this.tutorialTitle = tutorialTitle;
  }

  public GameLevelResponse tutorialMessage(String tutorialMessage) {
    this.tutorialMessage = tutorialMessage;
    return this;
  }

   /**
   * Get tutorialMessage
   * @return tutorialMessage
  **/
  public String getTutorialMessage() {
    return tutorialMessage;
  }

  public void setTutorialMessage(String tutorialMessage) {
    this.tutorialMessage = tutorialMessage;
  }

  public GameLevelResponse tutorialAlignment(String tutorialAlignment) {
    this.tutorialAlignment = tutorialAlignment;
    return this;
  }

   /**
   * Get tutorialAlignment
   * @return tutorialAlignment
  **/
  public String getTutorialAlignment() {
    return tutorialAlignment;
  }

  public void setTutorialAlignment(String tutorialAlignment) {
    this.tutorialAlignment = tutorialAlignment;
  }

  public GameLevelResponse tutorialImage(AssetShortResponse tutorialImage) {
    this.tutorialImage = tutorialImage;
    return this;
  }

   /**
   * Get tutorialImage
   * @return tutorialImage
  **/
  public AssetShortResponse getTutorialImage() {
    return tutorialImage;
  }

  public void setTutorialImage(AssetShortResponse tutorialImage) {
    this.tutorialImage = tutorialImage;
  }

  public GameLevelResponse nextLevelId(Long nextLevelId) {
    this.nextLevelId = nextLevelId;
    return this;
  }

   /**
   * Get nextLevelId
   * @return nextLevelId
  **/
  public Long getNextLevelId() {
    return nextLevelId;
  }

  public void setNextLevelId(Long nextLevelId) {
    this.nextLevelId = nextLevelId;
  }

  public GameLevelResponse offer(OfferShortResponse offer) {
    this.offer = offer;
    return this;
  }

   /**
   * Get offer
   * @return offer
  **/
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
    return Objects.equals(action, gameLevelResponse.action) &&
        Objects.equals(gameLevelId, gameLevelResponse.gameLevelId) &&
        Objects.equals(gameType, gameLevelResponse.gameType) &&
        Objects.equals(active, gameLevelResponse.active) &&
        Objects.equals(name, gameLevelResponse.name) &&
        Objects.equals(description, gameLevelResponse.description) &&
        Objects.equals(difficulty, gameLevelResponse.difficulty) &&
        Objects.equals(appVersion, gameLevelResponse.appVersion) &&
        Objects.equals(likesCount, gameLevelResponse.likesCount) &&
        Objects.equals(dislikesCount, gameLevelResponse.dislikesCount) &&
        Objects.equals(commentsCount, gameLevelResponse.commentsCount) &&
        Objects.equals(downloadCount, gameLevelResponse.downloadCount) &&
        Objects.equals(comments, gameLevelResponse.comments) &&
        Objects.equals(locked, gameLevelResponse.locked) &&
        Objects.equals(completed, gameLevelResponse.completed) &&
        Objects.equals(ticketsEarned, gameLevelResponse.ticketsEarned) &&
        Objects.equals(gameObjects, gameLevelResponse.gameObjects) &&
        Objects.equals(hasLiked, gameLevelResponse.hasLiked) &&
        Objects.equals(image, gameLevelResponse.image) &&
        Objects.equals(gameData, gameLevelResponse.gameData) &&
        Objects.equals(gameDataSuffix, gameLevelResponse.gameDataSuffix) &&
        Objects.equals(scores, gameLevelResponse.scores) &&
        Objects.equals(owner, gameLevelResponse.owner) &&
        Objects.equals(userPermissionsList, gameLevelResponse.userPermissionsList) &&
        Objects.equals(results, gameLevelResponse.results) &&
        Objects.equals(randomizeGameObjects, gameLevelResponse.randomizeGameObjects) &&
        Objects.equals(tickets, gameLevelResponse.tickets) &&
        Objects.equals(assignMission, gameLevelResponse.assignMission) &&
        Objects.equals(icon, gameLevelResponse.icon) &&
        Objects.equals(authorOverride, gameLevelResponse.authorOverride) &&
        Objects.equals(updatedDate, gameLevelResponse.updatedDate) &&
        Objects.equals(startDate, gameLevelResponse.startDate) &&
        Objects.equals(endDate, gameLevelResponse.endDate) &&
        Objects.equals(splashTitle, gameLevelResponse.splashTitle) &&
        Objects.equals(splashMessage, gameLevelResponse.splashMessage) &&
        Objects.equals(hasFlagged, gameLevelResponse.hasFlagged) &&
        Objects.equals(allocateTickets, gameLevelResponse.allocateTickets) &&
        Objects.equals(ticketType, gameLevelResponse.ticketType) &&
        Objects.equals(ticketCount, gameLevelResponse.ticketCount) &&
        Objects.equals(points, gameLevelResponse.points) &&
        Objects.equals(winnerMessage, gameLevelResponse.winnerMessage) &&
        Objects.equals(tutorial, gameLevelResponse.tutorial) &&
        Objects.equals(appKey, gameLevelResponse.appKey) &&
        Objects.equals(appName, gameLevelResponse.appName) &&
        Objects.equals(scoringType, gameLevelResponse.scoringType) &&
        Objects.equals(tutorialTitle, gameLevelResponse.tutorialTitle) &&
        Objects.equals(tutorialMessage, gameLevelResponse.tutorialMessage) &&
        Objects.equals(tutorialAlignment, gameLevelResponse.tutorialAlignment) &&
        Objects.equals(tutorialImage, gameLevelResponse.tutorialImage) &&
        Objects.equals(nextLevelId, gameLevelResponse.nextLevelId) &&
        Objects.equals(offer, gameLevelResponse.offer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, gameLevelId, gameType, active, name, description, difficulty, appVersion, likesCount, dislikesCount, commentsCount, downloadCount, comments, locked, completed, ticketsEarned, gameObjects, hasLiked, image, gameData, gameDataSuffix, scores, owner, userPermissionsList, results, randomizeGameObjects, tickets, assignMission, icon, authorOverride, updatedDate, startDate, endDate, splashTitle, splashMessage, hasFlagged, allocateTickets, ticketType, ticketCount, points, winnerMessage, tutorial, appKey, appName, scoringType, tutorialTitle, tutorialMessage, tutorialAlignment, tutorialImage, nextLevelId, offer);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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


package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
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
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * GameLevelResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-09T20:58:37.853899731Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class GameLevelResponse {

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

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
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

  private @Nullable ActionEnum action;

  private @Nullable Long gameLevelId;

  private @Nullable String gameType;

  private @Nullable Boolean active;

  private @Nullable String name;

  private @Nullable String description;

  private @Nullable String difficulty;

  private @Nullable String appVersion;

  private @Nullable Long likesCount;

  private @Nullable Long dislikesCount;

  private @Nullable Long commentsCount;

  private @Nullable Long downloadCount;

  @Valid
  private List<@Valid NoteResponse> comments = new ArrayList<>();

  private @Nullable Boolean locked;

  private @Nullable Boolean completed;

  private @Nullable Long ticketsEarned;

  private @Nullable GameObjectListResponse gameObjects;

  private @Nullable Boolean hasLiked;

  private @Nullable AssetShortResponse image;

  private @Nullable String gameData;

  private @Nullable String gameDataSuffix;

  private @Nullable ScoreListResponse scores;

  private @Nullable AccountShortResponse owner;

  private @Nullable UserPermissionsListResponse userPermissionsList;

  @Valid
  private List<@Valid NameStringValueResponse> results = new ArrayList<>();

  private @Nullable Boolean randomizeGameObjects;

  private @Nullable TicketListResponse tickets;

  private @Nullable Boolean assignMission;

  private @Nullable AssetShortResponse icon;

  private @Nullable String authorOverride;

  private @Nullable Long updatedDate;

  private @Nullable Long startDate;

  private @Nullable Long endDate;

  private @Nullable String splashTitle;

  private @Nullable String splashMessage;

  private @Nullable Boolean hasFlagged;

  private @Nullable Boolean allocateTickets;

  private @Nullable String ticketType;

  private @Nullable Long ticketCount;

  private @Nullable Long points;

  private @Nullable String winnerMessage;

  private @Nullable TutorialResponse tutorial;

  private @Nullable String appKey;

  private @Nullable String appName;

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

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
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

  private @Nullable ScoringTypeEnum scoringType;

  private @Nullable String tutorialTitle;

  private @Nullable String tutorialMessage;

  private @Nullable String tutorialAlignment;

  private @Nullable AssetShortResponse tutorialImage;

  private @Nullable Long nextLevelId;

  private @Nullable OfferShortResponse offer;

  public GameLevelResponse action(@Nullable ActionEnum action) {
    this.action = action;
    return this;
  }

  /**
   * Get action
   * @return action
   */
  
  @Schema(name = "action", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("action")
  public @Nullable ActionEnum getAction() {
    return action;
  }

  public void setAction(@Nullable ActionEnum action) {
    this.action = action;
  }

  public GameLevelResponse gameLevelId(@Nullable Long gameLevelId) {
    this.gameLevelId = gameLevelId;
    return this;
  }

  /**
   * Get gameLevelId
   * @return gameLevelId
   */
  
  @Schema(name = "gameLevelId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("gameLevelId")
  public @Nullable Long getGameLevelId() {
    return gameLevelId;
  }

  public void setGameLevelId(@Nullable Long gameLevelId) {
    this.gameLevelId = gameLevelId;
  }

  public GameLevelResponse gameType(@Nullable String gameType) {
    this.gameType = gameType;
    return this;
  }

  /**
   * Get gameType
   * @return gameType
   */
  
  @Schema(name = "gameType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("gameType")
  public @Nullable String getGameType() {
    return gameType;
  }

  public void setGameType(@Nullable String gameType) {
    this.gameType = gameType;
  }

  public GameLevelResponse active(@Nullable Boolean active) {
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

  public GameLevelResponse name(@Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  
  @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public @Nullable String getName() {
    return name;
  }

  public void setName(@Nullable String name) {
    this.name = name;
  }

  public GameLevelResponse description(@Nullable String description) {
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

  public GameLevelResponse difficulty(@Nullable String difficulty) {
    this.difficulty = difficulty;
    return this;
  }

  /**
   * Get difficulty
   * @return difficulty
   */
  
  @Schema(name = "difficulty", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("difficulty")
  public @Nullable String getDifficulty() {
    return difficulty;
  }

  public void setDifficulty(@Nullable String difficulty) {
    this.difficulty = difficulty;
  }

  public GameLevelResponse appVersion(@Nullable String appVersion) {
    this.appVersion = appVersion;
    return this;
  }

  /**
   * Get appVersion
   * @return appVersion
   */
  
  @Schema(name = "appVersion", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("appVersion")
  public @Nullable String getAppVersion() {
    return appVersion;
  }

  public void setAppVersion(@Nullable String appVersion) {
    this.appVersion = appVersion;
  }

  public GameLevelResponse likesCount(@Nullable Long likesCount) {
    this.likesCount = likesCount;
    return this;
  }

  /**
   * Get likesCount
   * @return likesCount
   */
  
  @Schema(name = "likesCount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("likesCount")
  public @Nullable Long getLikesCount() {
    return likesCount;
  }

  public void setLikesCount(@Nullable Long likesCount) {
    this.likesCount = likesCount;
  }

  public GameLevelResponse dislikesCount(@Nullable Long dislikesCount) {
    this.dislikesCount = dislikesCount;
    return this;
  }

  /**
   * Get dislikesCount
   * @return dislikesCount
   */
  
  @Schema(name = "dislikesCount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dislikesCount")
  public @Nullable Long getDislikesCount() {
    return dislikesCount;
  }

  public void setDislikesCount(@Nullable Long dislikesCount) {
    this.dislikesCount = dislikesCount;
  }

  public GameLevelResponse commentsCount(@Nullable Long commentsCount) {
    this.commentsCount = commentsCount;
    return this;
  }

  /**
   * Get commentsCount
   * @return commentsCount
   */
  
  @Schema(name = "commentsCount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("commentsCount")
  public @Nullable Long getCommentsCount() {
    return commentsCount;
  }

  public void setCommentsCount(@Nullable Long commentsCount) {
    this.commentsCount = commentsCount;
  }

  public GameLevelResponse downloadCount(@Nullable Long downloadCount) {
    this.downloadCount = downloadCount;
    return this;
  }

  /**
   * Get downloadCount
   * @return downloadCount
   */
  
  @Schema(name = "downloadCount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("downloadCount")
  public @Nullable Long getDownloadCount() {
    return downloadCount;
  }

  public void setDownloadCount(@Nullable Long downloadCount) {
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
   */
  @Valid 
  @Schema(name = "comments", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("comments")
  public List<@Valid NoteResponse> getComments() {
    return comments;
  }

  public void setComments(List<@Valid NoteResponse> comments) {
    this.comments = comments;
  }

  public GameLevelResponse locked(@Nullable Boolean locked) {
    this.locked = locked;
    return this;
  }

  /**
   * Get locked
   * @return locked
   */
  
  @Schema(name = "locked", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("locked")
  public @Nullable Boolean getLocked() {
    return locked;
  }

  public void setLocked(@Nullable Boolean locked) {
    this.locked = locked;
  }

  public GameLevelResponse completed(@Nullable Boolean completed) {
    this.completed = completed;
    return this;
  }

  /**
   * Get completed
   * @return completed
   */
  
  @Schema(name = "completed", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("completed")
  public @Nullable Boolean getCompleted() {
    return completed;
  }

  public void setCompleted(@Nullable Boolean completed) {
    this.completed = completed;
  }

  public GameLevelResponse ticketsEarned(@Nullable Long ticketsEarned) {
    this.ticketsEarned = ticketsEarned;
    return this;
  }

  /**
   * Get ticketsEarned
   * @return ticketsEarned
   */
  
  @Schema(name = "ticketsEarned", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ticketsEarned")
  public @Nullable Long getTicketsEarned() {
    return ticketsEarned;
  }

  public void setTicketsEarned(@Nullable Long ticketsEarned) {
    this.ticketsEarned = ticketsEarned;
  }

  public GameLevelResponse gameObjects(@Nullable GameObjectListResponse gameObjects) {
    this.gameObjects = gameObjects;
    return this;
  }

  /**
   * Get gameObjects
   * @return gameObjects
   */
  @Valid 
  @Schema(name = "gameObjects", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("gameObjects")
  public @Nullable GameObjectListResponse getGameObjects() {
    return gameObjects;
  }

  public void setGameObjects(@Nullable GameObjectListResponse gameObjects) {
    this.gameObjects = gameObjects;
  }

  public GameLevelResponse hasLiked(@Nullable Boolean hasLiked) {
    this.hasLiked = hasLiked;
    return this;
  }

  /**
   * Get hasLiked
   * @return hasLiked
   */
  
  @Schema(name = "hasLiked", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hasLiked")
  public @Nullable Boolean getHasLiked() {
    return hasLiked;
  }

  public void setHasLiked(@Nullable Boolean hasLiked) {
    this.hasLiked = hasLiked;
  }

  public GameLevelResponse image(@Nullable AssetShortResponse image) {
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
  public @Nullable AssetShortResponse getImage() {
    return image;
  }

  public void setImage(@Nullable AssetShortResponse image) {
    this.image = image;
  }

  public GameLevelResponse gameData(@Nullable String gameData) {
    this.gameData = gameData;
    return this;
  }

  /**
   * Get gameData
   * @return gameData
   */
  
  @Schema(name = "gameData", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("gameData")
  public @Nullable String getGameData() {
    return gameData;
  }

  public void setGameData(@Nullable String gameData) {
    this.gameData = gameData;
  }

  public GameLevelResponse gameDataSuffix(@Nullable String gameDataSuffix) {
    this.gameDataSuffix = gameDataSuffix;
    return this;
  }

  /**
   * Get gameDataSuffix
   * @return gameDataSuffix
   */
  
  @Schema(name = "gameDataSuffix", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("gameDataSuffix")
  public @Nullable String getGameDataSuffix() {
    return gameDataSuffix;
  }

  public void setGameDataSuffix(@Nullable String gameDataSuffix) {
    this.gameDataSuffix = gameDataSuffix;
  }

  public GameLevelResponse scores(@Nullable ScoreListResponse scores) {
    this.scores = scores;
    return this;
  }

  /**
   * Get scores
   * @return scores
   */
  @Valid 
  @Schema(name = "scores", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("scores")
  public @Nullable ScoreListResponse getScores() {
    return scores;
  }

  public void setScores(@Nullable ScoreListResponse scores) {
    this.scores = scores;
  }

  public GameLevelResponse owner(@Nullable AccountShortResponse owner) {
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
  public @Nullable AccountShortResponse getOwner() {
    return owner;
  }

  public void setOwner(@Nullable AccountShortResponse owner) {
    this.owner = owner;
  }

  public GameLevelResponse userPermissionsList(@Nullable UserPermissionsListResponse userPermissionsList) {
    this.userPermissionsList = userPermissionsList;
    return this;
  }

  /**
   * Get userPermissionsList
   * @return userPermissionsList
   */
  @Valid 
  @Schema(name = "userPermissionsList", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("userPermissionsList")
  public @Nullable UserPermissionsListResponse getUserPermissionsList() {
    return userPermissionsList;
  }

  public void setUserPermissionsList(@Nullable UserPermissionsListResponse userPermissionsList) {
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
   */
  @Valid 
  @Schema(name = "results", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("results")
  public List<@Valid NameStringValueResponse> getResults() {
    return results;
  }

  public void setResults(List<@Valid NameStringValueResponse> results) {
    this.results = results;
  }

  public GameLevelResponse randomizeGameObjects(@Nullable Boolean randomizeGameObjects) {
    this.randomizeGameObjects = randomizeGameObjects;
    return this;
  }

  /**
   * Get randomizeGameObjects
   * @return randomizeGameObjects
   */
  
  @Schema(name = "randomizeGameObjects", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("randomizeGameObjects")
  public @Nullable Boolean getRandomizeGameObjects() {
    return randomizeGameObjects;
  }

  public void setRandomizeGameObjects(@Nullable Boolean randomizeGameObjects) {
    this.randomizeGameObjects = randomizeGameObjects;
  }

  public GameLevelResponse tickets(@Nullable TicketListResponse tickets) {
    this.tickets = tickets;
    return this;
  }

  /**
   * Get tickets
   * @return tickets
   */
  @Valid 
  @Schema(name = "tickets", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tickets")
  public @Nullable TicketListResponse getTickets() {
    return tickets;
  }

  public void setTickets(@Nullable TicketListResponse tickets) {
    this.tickets = tickets;
  }

  public GameLevelResponse assignMission(@Nullable Boolean assignMission) {
    this.assignMission = assignMission;
    return this;
  }

  /**
   * Get assignMission
   * @return assignMission
   */
  
  @Schema(name = "assignMission", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("assignMission")
  public @Nullable Boolean getAssignMission() {
    return assignMission;
  }

  public void setAssignMission(@Nullable Boolean assignMission) {
    this.assignMission = assignMission;
  }

  public GameLevelResponse icon(@Nullable AssetShortResponse icon) {
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
  public @Nullable AssetShortResponse getIcon() {
    return icon;
  }

  public void setIcon(@Nullable AssetShortResponse icon) {
    this.icon = icon;
  }

  public GameLevelResponse authorOverride(@Nullable String authorOverride) {
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

  public GameLevelResponse updatedDate(@Nullable Long updatedDate) {
    this.updatedDate = updatedDate;
    return this;
  }

  /**
   * Get updatedDate
   * @return updatedDate
   */
  
  @Schema(name = "updatedDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("updatedDate")
  public @Nullable Long getUpdatedDate() {
    return updatedDate;
  }

  public void setUpdatedDate(@Nullable Long updatedDate) {
    this.updatedDate = updatedDate;
  }

  public GameLevelResponse startDate(@Nullable Long startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Get startDate
   * @return startDate
   */
  
  @Schema(name = "startDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("startDate")
  public @Nullable Long getStartDate() {
    return startDate;
  }

  public void setStartDate(@Nullable Long startDate) {
    this.startDate = startDate;
  }

  public GameLevelResponse endDate(@Nullable Long endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * Get endDate
   * @return endDate
   */
  
  @Schema(name = "endDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("endDate")
  public @Nullable Long getEndDate() {
    return endDate;
  }

  public void setEndDate(@Nullable Long endDate) {
    this.endDate = endDate;
  }

  public GameLevelResponse splashTitle(@Nullable String splashTitle) {
    this.splashTitle = splashTitle;
    return this;
  }

  /**
   * Get splashTitle
   * @return splashTitle
   */
  
  @Schema(name = "splashTitle", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("splashTitle")
  public @Nullable String getSplashTitle() {
    return splashTitle;
  }

  public void setSplashTitle(@Nullable String splashTitle) {
    this.splashTitle = splashTitle;
  }

  public GameLevelResponse splashMessage(@Nullable String splashMessage) {
    this.splashMessage = splashMessage;
    return this;
  }

  /**
   * Get splashMessage
   * @return splashMessage
   */
  
  @Schema(name = "splashMessage", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("splashMessage")
  public @Nullable String getSplashMessage() {
    return splashMessage;
  }

  public void setSplashMessage(@Nullable String splashMessage) {
    this.splashMessage = splashMessage;
  }

  public GameLevelResponse hasFlagged(@Nullable Boolean hasFlagged) {
    this.hasFlagged = hasFlagged;
    return this;
  }

  /**
   * Get hasFlagged
   * @return hasFlagged
   */
  
  @Schema(name = "hasFlagged", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hasFlagged")
  public @Nullable Boolean getHasFlagged() {
    return hasFlagged;
  }

  public void setHasFlagged(@Nullable Boolean hasFlagged) {
    this.hasFlagged = hasFlagged;
  }

  public GameLevelResponse allocateTickets(@Nullable Boolean allocateTickets) {
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

  public GameLevelResponse ticketType(@Nullable String ticketType) {
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

  public GameLevelResponse ticketCount(@Nullable Long ticketCount) {
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

  public GameLevelResponse points(@Nullable Long points) {
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

  public GameLevelResponse winnerMessage(@Nullable String winnerMessage) {
    this.winnerMessage = winnerMessage;
    return this;
  }

  /**
   * Get winnerMessage
   * @return winnerMessage
   */
  
  @Schema(name = "winnerMessage", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("winnerMessage")
  public @Nullable String getWinnerMessage() {
    return winnerMessage;
  }

  public void setWinnerMessage(@Nullable String winnerMessage) {
    this.winnerMessage = winnerMessage;
  }

  public GameLevelResponse tutorial(@Nullable TutorialResponse tutorial) {
    this.tutorial = tutorial;
    return this;
  }

  /**
   * Get tutorial
   * @return tutorial
   */
  @Valid 
  @Schema(name = "tutorial", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tutorial")
  public @Nullable TutorialResponse getTutorial() {
    return tutorial;
  }

  public void setTutorial(@Nullable TutorialResponse tutorial) {
    this.tutorial = tutorial;
  }

  public GameLevelResponse appKey(@Nullable String appKey) {
    this.appKey = appKey;
    return this;
  }

  /**
   * Get appKey
   * @return appKey
   */
  
  @Schema(name = "appKey", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("appKey")
  public @Nullable String getAppKey() {
    return appKey;
  }

  public void setAppKey(@Nullable String appKey) {
    this.appKey = appKey;
  }

  public GameLevelResponse appName(@Nullable String appName) {
    this.appName = appName;
    return this;
  }

  /**
   * Get appName
   * @return appName
   */
  
  @Schema(name = "appName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("appName")
  public @Nullable String getAppName() {
    return appName;
  }

  public void setAppName(@Nullable String appName) {
    this.appName = appName;
  }

  public GameLevelResponse scoringType(@Nullable ScoringTypeEnum scoringType) {
    this.scoringType = scoringType;
    return this;
  }

  /**
   * Get scoringType
   * @return scoringType
   */
  
  @Schema(name = "scoringType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("scoringType")
  public @Nullable ScoringTypeEnum getScoringType() {
    return scoringType;
  }

  public void setScoringType(@Nullable ScoringTypeEnum scoringType) {
    this.scoringType = scoringType;
  }

  public GameLevelResponse tutorialTitle(@Nullable String tutorialTitle) {
    this.tutorialTitle = tutorialTitle;
    return this;
  }

  /**
   * Get tutorialTitle
   * @return tutorialTitle
   */
  
  @Schema(name = "tutorialTitle", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tutorialTitle")
  public @Nullable String getTutorialTitle() {
    return tutorialTitle;
  }

  public void setTutorialTitle(@Nullable String tutorialTitle) {
    this.tutorialTitle = tutorialTitle;
  }

  public GameLevelResponse tutorialMessage(@Nullable String tutorialMessage) {
    this.tutorialMessage = tutorialMessage;
    return this;
  }

  /**
   * Get tutorialMessage
   * @return tutorialMessage
   */
  
  @Schema(name = "tutorialMessage", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tutorialMessage")
  public @Nullable String getTutorialMessage() {
    return tutorialMessage;
  }

  public void setTutorialMessage(@Nullable String tutorialMessage) {
    this.tutorialMessage = tutorialMessage;
  }

  public GameLevelResponse tutorialAlignment(@Nullable String tutorialAlignment) {
    this.tutorialAlignment = tutorialAlignment;
    return this;
  }

  /**
   * Get tutorialAlignment
   * @return tutorialAlignment
   */
  
  @Schema(name = "tutorialAlignment", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tutorialAlignment")
  public @Nullable String getTutorialAlignment() {
    return tutorialAlignment;
  }

  public void setTutorialAlignment(@Nullable String tutorialAlignment) {
    this.tutorialAlignment = tutorialAlignment;
  }

  public GameLevelResponse tutorialImage(@Nullable AssetShortResponse tutorialImage) {
    this.tutorialImage = tutorialImage;
    return this;
  }

  /**
   * Get tutorialImage
   * @return tutorialImage
   */
  @Valid 
  @Schema(name = "tutorialImage", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tutorialImage")
  public @Nullable AssetShortResponse getTutorialImage() {
    return tutorialImage;
  }

  public void setTutorialImage(@Nullable AssetShortResponse tutorialImage) {
    this.tutorialImage = tutorialImage;
  }

  public GameLevelResponse nextLevelId(@Nullable Long nextLevelId) {
    this.nextLevelId = nextLevelId;
    return this;
  }

  /**
   * Get nextLevelId
   * @return nextLevelId
   */
  
  @Schema(name = "nextLevelId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("nextLevelId")
  public @Nullable Long getNextLevelId() {
    return nextLevelId;
  }

  public void setNextLevelId(@Nullable Long nextLevelId) {
    this.nextLevelId = nextLevelId;
  }

  public GameLevelResponse offer(@Nullable OfferShortResponse offer) {
    this.offer = offer;
    return this;
  }

  /**
   * Get offer
   * @return offer
   */
  @Valid 
  @Schema(name = "offer", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("offer")
  public @Nullable OfferShortResponse getOffer() {
    return offer;
  }

  public void setOffer(@Nullable OfferShortResponse offer) {
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
  private String toIndentedString(@Nullable Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


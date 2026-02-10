package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.openapitools.model.Account;
import org.openapitools.model.AppVersion;
import org.openapitools.model.Application;
import org.openapitools.model.Asset;
import org.openapitools.model.Flag;
import org.openapitools.model.FlagThreshold;
import org.openapitools.model.Note;
import org.openapitools.model.Offer;
import org.openapitools.model.Permissions;
import org.openapitools.model.Tutorial;
import org.openapitools.model.UserPermissions;
import org.openapitools.model.YayOrNay;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * GameLevel
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-09T20:58:37.853899731Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class GameLevel {

  private @Nullable Long id;

  private @Nullable Boolean active;

  private @Nullable Boolean valid;

  private @Nullable Long newOwnerId;

  /**
   * Gets or Sets gameDifficulty
   */
  public enum GameDifficultyEnum {
    VERY_EASY("VERY_EASY"),
    
    EASY("EASY"),
    
    MEDIUM("MEDIUM"),
    
    HARD("HARD"),
    
    VERY_HARD("VERY_HARD");

    private final String value;

    GameDifficultyEnum(String value) {
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
    public static GameDifficultyEnum fromValue(String value) {
      for (GameDifficultyEnum b : GameDifficultyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable GameDifficultyEnum gameDifficulty;

  private @Nullable String name;

  private @Nullable Asset image;

  private @Nullable Asset icon;

  private @Nullable String description;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime startDate;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime endDate;

  private @Nullable Boolean randomizeGameObjects;

  private @Nullable Account owner;

  private @Nullable AppVersion version;

  @Valid
  private List<@Valid Note> notes = new ArrayList<>();

  private @Nullable Long noteCount;

  @Valid
  private List<@Valid YayOrNay> likes = new ArrayList<>();

  private @Nullable Long likeCount;

  private @Nullable Long dislikeCount;

  private @Nullable Long playCount;

  private @Nullable Long downloadCount;

  private @Nullable Integer gameObjectCount;

  private @Nullable Permissions publicPermissions;

  /**
   * Gets or Sets visibility
   */
  public enum VisibilityEnum {
    PUBLIC("PUBLIC"),
    
    PRIVATE("PRIVATE"),
    
    FRIENDS("FRIENDS");

    private final String value;

    VisibilityEnum(String value) {
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
    public static VisibilityEnum fromValue(String value) {
      for (VisibilityEnum b : VisibilityEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable VisibilityEnum visibility;

  @Valid
  private List<@Valid UserPermissions> userPermissions = new ArrayList<>();

  @Valid
  private List<@Valid Flag> flags = new ArrayList<>();

  private @Nullable Long flagCount;

  private @Nullable FlagThreshold flagThreshold;

  private @Nullable Application application;

  private @Nullable Boolean assignMission;

  private @Nullable String authorOverride;

  private @Nullable String splashTitle;

  private @Nullable String splashMessage;

  private @Nullable String winnerMessage;

  private @Nullable Tutorial tutorial;

  /**
   * Gets or Sets approvalStatus
   */
  public enum ApprovalStatusEnum {
    PENDING("PENDING"),
    
    REJECTED("REJECTED"),
    
    APPROVED("APPROVED"),
    
    FEATURED("FEATURED");

    private final String value;

    ApprovalStatusEnum(String value) {
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
    public static ApprovalStatusEnum fromValue(String value) {
      for (ApprovalStatusEnum b : ApprovalStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable ApprovalStatusEnum approvalStatus;

  private @Nullable GameLevel nextLevel;

  private @Nullable Offer offer;

  private @Nullable Double balance;

  private @Nullable Integer levelNumber;

  private @Nullable Long points;

  private @Nullable String ticketType;

  private @Nullable Long ticketCount;

  private @Nullable Boolean allocateTickets;

  private @Nullable String applicationTitle;

  private @Nullable String ownerUsername;

  @Valid
  private List<Map<String, Object>> likableNotificationModels = new ArrayList<>();

  @Valid
  private List<Map<String, Object>> notableNotificationModels = new ArrayList<>();

  private @Nullable Boolean published;

  private @Nullable String contentName;

  private @Nullable Long defaultThreshold;

  private @Nullable Asset contentAsset;

  private @Nullable String contentType;

  public GameLevel id(@Nullable Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public @Nullable Long getId() {
    return id;
  }

  public void setId(@Nullable Long id) {
    this.id = id;
  }

  public GameLevel active(@Nullable Boolean active) {
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

  public GameLevel valid(@Nullable Boolean valid) {
    this.valid = valid;
    return this;
  }

  /**
   * Get valid
   * @return valid
   */
  
  @Schema(name = "valid", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("valid")
  public @Nullable Boolean getValid() {
    return valid;
  }

  public void setValid(@Nullable Boolean valid) {
    this.valid = valid;
  }

  public GameLevel newOwnerId(@Nullable Long newOwnerId) {
    this.newOwnerId = newOwnerId;
    return this;
  }

  /**
   * Get newOwnerId
   * @return newOwnerId
   */
  
  @Schema(name = "newOwnerId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("newOwnerId")
  public @Nullable Long getNewOwnerId() {
    return newOwnerId;
  }

  public void setNewOwnerId(@Nullable Long newOwnerId) {
    this.newOwnerId = newOwnerId;
  }

  public GameLevel gameDifficulty(@Nullable GameDifficultyEnum gameDifficulty) {
    this.gameDifficulty = gameDifficulty;
    return this;
  }

  /**
   * Get gameDifficulty
   * @return gameDifficulty
   */
  
  @Schema(name = "gameDifficulty", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("gameDifficulty")
  public @Nullable GameDifficultyEnum getGameDifficulty() {
    return gameDifficulty;
  }

  public void setGameDifficulty(@Nullable GameDifficultyEnum gameDifficulty) {
    this.gameDifficulty = gameDifficulty;
  }

  public GameLevel name(@Nullable String name) {
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

  public GameLevel image(@Nullable Asset image) {
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
  public @Nullable Asset getImage() {
    return image;
  }

  public void setImage(@Nullable Asset image) {
    this.image = image;
  }

  public GameLevel icon(@Nullable Asset icon) {
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
  public @Nullable Asset getIcon() {
    return icon;
  }

  public void setIcon(@Nullable Asset icon) {
    this.icon = icon;
  }

  public GameLevel description(@Nullable String description) {
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

  public GameLevel startDate(@Nullable OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Get startDate
   * @return startDate
   */
  @Valid 
  @Schema(name = "startDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("startDate")
  public @Nullable OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(@Nullable OffsetDateTime startDate) {
    this.startDate = startDate;
  }

  public GameLevel endDate(@Nullable OffsetDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * Get endDate
   * @return endDate
   */
  @Valid 
  @Schema(name = "endDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("endDate")
  public @Nullable OffsetDateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(@Nullable OffsetDateTime endDate) {
    this.endDate = endDate;
  }

  public GameLevel randomizeGameObjects(@Nullable Boolean randomizeGameObjects) {
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

  public GameLevel owner(@Nullable Account owner) {
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
  public @Nullable Account getOwner() {
    return owner;
  }

  public void setOwner(@Nullable Account owner) {
    this.owner = owner;
  }

  public GameLevel version(@Nullable AppVersion version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
   */
  @Valid 
  @Schema(name = "version", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("version")
  public @Nullable AppVersion getVersion() {
    return version;
  }

  public void setVersion(@Nullable AppVersion version) {
    this.version = version;
  }

  public GameLevel notes(List<@Valid Note> notes) {
    this.notes = notes;
    return this;
  }

  public GameLevel addNotesItem(Note notesItem) {
    if (this.notes == null) {
      this.notes = new ArrayList<>();
    }
    this.notes.add(notesItem);
    return this;
  }

  /**
   * Get notes
   * @return notes
   */
  @Valid 
  @Schema(name = "notes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("notes")
  public List<@Valid Note> getNotes() {
    return notes;
  }

  public void setNotes(List<@Valid Note> notes) {
    this.notes = notes;
  }

  public GameLevel noteCount(@Nullable Long noteCount) {
    this.noteCount = noteCount;
    return this;
  }

  /**
   * Get noteCount
   * @return noteCount
   */
  
  @Schema(name = "noteCount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("noteCount")
  public @Nullable Long getNoteCount() {
    return noteCount;
  }

  public void setNoteCount(@Nullable Long noteCount) {
    this.noteCount = noteCount;
  }

  public GameLevel likes(List<@Valid YayOrNay> likes) {
    this.likes = likes;
    return this;
  }

  public GameLevel addLikesItem(YayOrNay likesItem) {
    if (this.likes == null) {
      this.likes = new ArrayList<>();
    }
    this.likes.add(likesItem);
    return this;
  }

  /**
   * Get likes
   * @return likes
   */
  @Valid 
  @Schema(name = "likes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("likes")
  public List<@Valid YayOrNay> getLikes() {
    return likes;
  }

  public void setLikes(List<@Valid YayOrNay> likes) {
    this.likes = likes;
  }

  public GameLevel likeCount(@Nullable Long likeCount) {
    this.likeCount = likeCount;
    return this;
  }

  /**
   * Get likeCount
   * @return likeCount
   */
  
  @Schema(name = "likeCount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("likeCount")
  public @Nullable Long getLikeCount() {
    return likeCount;
  }

  public void setLikeCount(@Nullable Long likeCount) {
    this.likeCount = likeCount;
  }

  public GameLevel dislikeCount(@Nullable Long dislikeCount) {
    this.dislikeCount = dislikeCount;
    return this;
  }

  /**
   * Get dislikeCount
   * @return dislikeCount
   */
  
  @Schema(name = "dislikeCount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dislikeCount")
  public @Nullable Long getDislikeCount() {
    return dislikeCount;
  }

  public void setDislikeCount(@Nullable Long dislikeCount) {
    this.dislikeCount = dislikeCount;
  }

  public GameLevel playCount(@Nullable Long playCount) {
    this.playCount = playCount;
    return this;
  }

  /**
   * Get playCount
   * @return playCount
   */
  
  @Schema(name = "playCount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("playCount")
  public @Nullable Long getPlayCount() {
    return playCount;
  }

  public void setPlayCount(@Nullable Long playCount) {
    this.playCount = playCount;
  }

  public GameLevel downloadCount(@Nullable Long downloadCount) {
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

  public GameLevel gameObjectCount(@Nullable Integer gameObjectCount) {
    this.gameObjectCount = gameObjectCount;
    return this;
  }

  /**
   * Get gameObjectCount
   * @return gameObjectCount
   */
  
  @Schema(name = "gameObjectCount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("gameObjectCount")
  public @Nullable Integer getGameObjectCount() {
    return gameObjectCount;
  }

  public void setGameObjectCount(@Nullable Integer gameObjectCount) {
    this.gameObjectCount = gameObjectCount;
  }

  public GameLevel publicPermissions(@Nullable Permissions publicPermissions) {
    this.publicPermissions = publicPermissions;
    return this;
  }

  /**
   * Get publicPermissions
   * @return publicPermissions
   */
  @Valid 
  @Schema(name = "publicPermissions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("publicPermissions")
  public @Nullable Permissions getPublicPermissions() {
    return publicPermissions;
  }

  public void setPublicPermissions(@Nullable Permissions publicPermissions) {
    this.publicPermissions = publicPermissions;
  }

  public GameLevel visibility(@Nullable VisibilityEnum visibility) {
    this.visibility = visibility;
    return this;
  }

  /**
   * Get visibility
   * @return visibility
   */
  
  @Schema(name = "visibility", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("visibility")
  public @Nullable VisibilityEnum getVisibility() {
    return visibility;
  }

  public void setVisibility(@Nullable VisibilityEnum visibility) {
    this.visibility = visibility;
  }

  public GameLevel userPermissions(List<@Valid UserPermissions> userPermissions) {
    this.userPermissions = userPermissions;
    return this;
  }

  public GameLevel addUserPermissionsItem(UserPermissions userPermissionsItem) {
    if (this.userPermissions == null) {
      this.userPermissions = new ArrayList<>();
    }
    this.userPermissions.add(userPermissionsItem);
    return this;
  }

  /**
   * Get userPermissions
   * @return userPermissions
   */
  @Valid 
  @Schema(name = "userPermissions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("userPermissions")
  public List<@Valid UserPermissions> getUserPermissions() {
    return userPermissions;
  }

  public void setUserPermissions(List<@Valid UserPermissions> userPermissions) {
    this.userPermissions = userPermissions;
  }

  public GameLevel flags(List<@Valid Flag> flags) {
    this.flags = flags;
    return this;
  }

  public GameLevel addFlagsItem(Flag flagsItem) {
    if (this.flags == null) {
      this.flags = new ArrayList<>();
    }
    this.flags.add(flagsItem);
    return this;
  }

  /**
   * Get flags
   * @return flags
   */
  @Valid 
  @Schema(name = "flags", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("flags")
  public List<@Valid Flag> getFlags() {
    return flags;
  }

  public void setFlags(List<@Valid Flag> flags) {
    this.flags = flags;
  }

  public GameLevel flagCount(@Nullable Long flagCount) {
    this.flagCount = flagCount;
    return this;
  }

  /**
   * Get flagCount
   * @return flagCount
   */
  
  @Schema(name = "flagCount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("flagCount")
  public @Nullable Long getFlagCount() {
    return flagCount;
  }

  public void setFlagCount(@Nullable Long flagCount) {
    this.flagCount = flagCount;
  }

  public GameLevel flagThreshold(@Nullable FlagThreshold flagThreshold) {
    this.flagThreshold = flagThreshold;
    return this;
  }

  /**
   * Get flagThreshold
   * @return flagThreshold
   */
  @Valid 
  @Schema(name = "flagThreshold", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("flagThreshold")
  public @Nullable FlagThreshold getFlagThreshold() {
    return flagThreshold;
  }

  public void setFlagThreshold(@Nullable FlagThreshold flagThreshold) {
    this.flagThreshold = flagThreshold;
  }

  public GameLevel application(@Nullable Application application) {
    this.application = application;
    return this;
  }

  /**
   * Get application
   * @return application
   */
  @Valid 
  @Schema(name = "application", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("application")
  public @Nullable Application getApplication() {
    return application;
  }

  public void setApplication(@Nullable Application application) {
    this.application = application;
  }

  public GameLevel assignMission(@Nullable Boolean assignMission) {
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

  public GameLevel authorOverride(@Nullable String authorOverride) {
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

  public GameLevel splashTitle(@Nullable String splashTitle) {
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

  public GameLevel splashMessage(@Nullable String splashMessage) {
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

  public GameLevel winnerMessage(@Nullable String winnerMessage) {
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

  public GameLevel tutorial(@Nullable Tutorial tutorial) {
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
  public @Nullable Tutorial getTutorial() {
    return tutorial;
  }

  public void setTutorial(@Nullable Tutorial tutorial) {
    this.tutorial = tutorial;
  }

  public GameLevel approvalStatus(@Nullable ApprovalStatusEnum approvalStatus) {
    this.approvalStatus = approvalStatus;
    return this;
  }

  /**
   * Get approvalStatus
   * @return approvalStatus
   */
  
  @Schema(name = "approvalStatus", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("approvalStatus")
  public @Nullable ApprovalStatusEnum getApprovalStatus() {
    return approvalStatus;
  }

  public void setApprovalStatus(@Nullable ApprovalStatusEnum approvalStatus) {
    this.approvalStatus = approvalStatus;
  }

  public GameLevel nextLevel(@Nullable GameLevel nextLevel) {
    this.nextLevel = nextLevel;
    return this;
  }

  /**
   * Get nextLevel
   * @return nextLevel
   */
  @Valid 
  @Schema(name = "nextLevel", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("nextLevel")
  public @Nullable GameLevel getNextLevel() {
    return nextLevel;
  }

  public void setNextLevel(@Nullable GameLevel nextLevel) {
    this.nextLevel = nextLevel;
  }

  public GameLevel offer(@Nullable Offer offer) {
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
  public @Nullable Offer getOffer() {
    return offer;
  }

  public void setOffer(@Nullable Offer offer) {
    this.offer = offer;
  }

  public GameLevel balance(@Nullable Double balance) {
    this.balance = balance;
    return this;
  }

  /**
   * Get balance
   * @return balance
   */
  
  @Schema(name = "balance", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("balance")
  public @Nullable Double getBalance() {
    return balance;
  }

  public void setBalance(@Nullable Double balance) {
    this.balance = balance;
  }

  public GameLevel levelNumber(@Nullable Integer levelNumber) {
    this.levelNumber = levelNumber;
    return this;
  }

  /**
   * Get levelNumber
   * @return levelNumber
   */
  
  @Schema(name = "levelNumber", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("levelNumber")
  public @Nullable Integer getLevelNumber() {
    return levelNumber;
  }

  public void setLevelNumber(@Nullable Integer levelNumber) {
    this.levelNumber = levelNumber;
  }

  public GameLevel points(@Nullable Long points) {
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

  public GameLevel ticketType(@Nullable String ticketType) {
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

  public GameLevel ticketCount(@Nullable Long ticketCount) {
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

  public GameLevel allocateTickets(@Nullable Boolean allocateTickets) {
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

  public GameLevel applicationTitle(@Nullable String applicationTitle) {
    this.applicationTitle = applicationTitle;
    return this;
  }

  /**
   * Get applicationTitle
   * @return applicationTitle
   */
  
  @Schema(name = "applicationTitle", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("applicationTitle")
  public @Nullable String getApplicationTitle() {
    return applicationTitle;
  }

  public void setApplicationTitle(@Nullable String applicationTitle) {
    this.applicationTitle = applicationTitle;
  }

  public GameLevel ownerUsername(@Nullable String ownerUsername) {
    this.ownerUsername = ownerUsername;
    return this;
  }

  /**
   * Get ownerUsername
   * @return ownerUsername
   */
  
  @Schema(name = "ownerUsername", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ownerUsername")
  public @Nullable String getOwnerUsername() {
    return ownerUsername;
  }

  public void setOwnerUsername(@Nullable String ownerUsername) {
    this.ownerUsername = ownerUsername;
  }

  public GameLevel likableNotificationModels(List<Map<String, Object>> likableNotificationModels) {
    this.likableNotificationModels = likableNotificationModels;
    return this;
  }

  public GameLevel addLikableNotificationModelsItem(Map<String, Object> likableNotificationModelsItem) {
    if (this.likableNotificationModels == null) {
      this.likableNotificationModels = new ArrayList<>();
    }
    this.likableNotificationModels.add(likableNotificationModelsItem);
    return this;
  }

  /**
   * Get likableNotificationModels
   * @return likableNotificationModels
   */
  @Valid 
  @Schema(name = "likableNotificationModels", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("likableNotificationModels")
  public List<Map<String, Object>> getLikableNotificationModels() {
    return likableNotificationModels;
  }

  public void setLikableNotificationModels(List<Map<String, Object>> likableNotificationModels) {
    this.likableNotificationModels = likableNotificationModels;
  }

  public GameLevel notableNotificationModels(List<Map<String, Object>> notableNotificationModels) {
    this.notableNotificationModels = notableNotificationModels;
    return this;
  }

  public GameLevel addNotableNotificationModelsItem(Map<String, Object> notableNotificationModelsItem) {
    if (this.notableNotificationModels == null) {
      this.notableNotificationModels = new ArrayList<>();
    }
    this.notableNotificationModels.add(notableNotificationModelsItem);
    return this;
  }

  /**
   * Get notableNotificationModels
   * @return notableNotificationModels
   */
  @Valid 
  @Schema(name = "notableNotificationModels", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("notableNotificationModels")
  public List<Map<String, Object>> getNotableNotificationModels() {
    return notableNotificationModels;
  }

  public void setNotableNotificationModels(List<Map<String, Object>> notableNotificationModels) {
    this.notableNotificationModels = notableNotificationModels;
  }

  public GameLevel published(@Nullable Boolean published) {
    this.published = published;
    return this;
  }

  /**
   * Get published
   * @return published
   */
  
  @Schema(name = "published", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("published")
  public @Nullable Boolean getPublished() {
    return published;
  }

  public void setPublished(@Nullable Boolean published) {
    this.published = published;
  }

  public GameLevel contentName(@Nullable String contentName) {
    this.contentName = contentName;
    return this;
  }

  /**
   * Get contentName
   * @return contentName
   */
  
  @Schema(name = "contentName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("contentName")
  public @Nullable String getContentName() {
    return contentName;
  }

  public void setContentName(@Nullable String contentName) {
    this.contentName = contentName;
  }

  public GameLevel defaultThreshold(@Nullable Long defaultThreshold) {
    this.defaultThreshold = defaultThreshold;
    return this;
  }

  /**
   * Get defaultThreshold
   * @return defaultThreshold
   */
  
  @Schema(name = "defaultThreshold", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("defaultThreshold")
  public @Nullable Long getDefaultThreshold() {
    return defaultThreshold;
  }

  public void setDefaultThreshold(@Nullable Long defaultThreshold) {
    this.defaultThreshold = defaultThreshold;
  }

  public GameLevel contentAsset(@Nullable Asset contentAsset) {
    this.contentAsset = contentAsset;
    return this;
  }

  /**
   * Get contentAsset
   * @return contentAsset
   */
  @Valid 
  @Schema(name = "contentAsset", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("contentAsset")
  public @Nullable Asset getContentAsset() {
    return contentAsset;
  }

  public void setContentAsset(@Nullable Asset contentAsset) {
    this.contentAsset = contentAsset;
  }

  public GameLevel contentType(@Nullable String contentType) {
    this.contentType = contentType;
    return this;
  }

  /**
   * Get contentType
   * @return contentType
   */
  
  @Schema(name = "contentType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("contentType")
  public @Nullable String getContentType() {
    return contentType;
  }

  public void setContentType(@Nullable String contentType) {
    this.contentType = contentType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GameLevel gameLevel = (GameLevel) o;
    return Objects.equals(this.id, gameLevel.id) &&
        Objects.equals(this.active, gameLevel.active) &&
        Objects.equals(this.valid, gameLevel.valid) &&
        Objects.equals(this.newOwnerId, gameLevel.newOwnerId) &&
        Objects.equals(this.gameDifficulty, gameLevel.gameDifficulty) &&
        Objects.equals(this.name, gameLevel.name) &&
        Objects.equals(this.image, gameLevel.image) &&
        Objects.equals(this.icon, gameLevel.icon) &&
        Objects.equals(this.description, gameLevel.description) &&
        Objects.equals(this.startDate, gameLevel.startDate) &&
        Objects.equals(this.endDate, gameLevel.endDate) &&
        Objects.equals(this.randomizeGameObjects, gameLevel.randomizeGameObjects) &&
        Objects.equals(this.owner, gameLevel.owner) &&
        Objects.equals(this.version, gameLevel.version) &&
        Objects.equals(this.notes, gameLevel.notes) &&
        Objects.equals(this.noteCount, gameLevel.noteCount) &&
        Objects.equals(this.likes, gameLevel.likes) &&
        Objects.equals(this.likeCount, gameLevel.likeCount) &&
        Objects.equals(this.dislikeCount, gameLevel.dislikeCount) &&
        Objects.equals(this.playCount, gameLevel.playCount) &&
        Objects.equals(this.downloadCount, gameLevel.downloadCount) &&
        Objects.equals(this.gameObjectCount, gameLevel.gameObjectCount) &&
        Objects.equals(this.publicPermissions, gameLevel.publicPermissions) &&
        Objects.equals(this.visibility, gameLevel.visibility) &&
        Objects.equals(this.userPermissions, gameLevel.userPermissions) &&
        Objects.equals(this.flags, gameLevel.flags) &&
        Objects.equals(this.flagCount, gameLevel.flagCount) &&
        Objects.equals(this.flagThreshold, gameLevel.flagThreshold) &&
        Objects.equals(this.application, gameLevel.application) &&
        Objects.equals(this.assignMission, gameLevel.assignMission) &&
        Objects.equals(this.authorOverride, gameLevel.authorOverride) &&
        Objects.equals(this.splashTitle, gameLevel.splashTitle) &&
        Objects.equals(this.splashMessage, gameLevel.splashMessage) &&
        Objects.equals(this.winnerMessage, gameLevel.winnerMessage) &&
        Objects.equals(this.tutorial, gameLevel.tutorial) &&
        Objects.equals(this.approvalStatus, gameLevel.approvalStatus) &&
        Objects.equals(this.nextLevel, gameLevel.nextLevel) &&
        Objects.equals(this.offer, gameLevel.offer) &&
        Objects.equals(this.balance, gameLevel.balance) &&
        Objects.equals(this.levelNumber, gameLevel.levelNumber) &&
        Objects.equals(this.points, gameLevel.points) &&
        Objects.equals(this.ticketType, gameLevel.ticketType) &&
        Objects.equals(this.ticketCount, gameLevel.ticketCount) &&
        Objects.equals(this.allocateTickets, gameLevel.allocateTickets) &&
        Objects.equals(this.applicationTitle, gameLevel.applicationTitle) &&
        Objects.equals(this.ownerUsername, gameLevel.ownerUsername) &&
        Objects.equals(this.likableNotificationModels, gameLevel.likableNotificationModels) &&
        Objects.equals(this.notableNotificationModels, gameLevel.notableNotificationModels) &&
        Objects.equals(this.published, gameLevel.published) &&
        Objects.equals(this.contentName, gameLevel.contentName) &&
        Objects.equals(this.defaultThreshold, gameLevel.defaultThreshold) &&
        Objects.equals(this.contentAsset, gameLevel.contentAsset) &&
        Objects.equals(this.contentType, gameLevel.contentType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, active, valid, newOwnerId, gameDifficulty, name, image, icon, description, startDate, endDate, randomizeGameObjects, owner, version, notes, noteCount, likes, likeCount, dislikeCount, playCount, downloadCount, gameObjectCount, publicPermissions, visibility, userPermissions, flags, flagCount, flagThreshold, application, assignMission, authorOverride, splashTitle, splashMessage, winnerMessage, tutorial, approvalStatus, nextLevel, offer, balance, levelNumber, points, ticketType, ticketCount, allocateTickets, applicationTitle, ownerUsername, likableNotificationModels, notableNotificationModels, published, contentName, defaultThreshold, contentAsset, contentType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GameLevel {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    newOwnerId: ").append(toIndentedString(newOwnerId)).append("\n");
    sb.append("    gameDifficulty: ").append(toIndentedString(gameDifficulty)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    randomizeGameObjects: ").append(toIndentedString(randomizeGameObjects)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    noteCount: ").append(toIndentedString(noteCount)).append("\n");
    sb.append("    likes: ").append(toIndentedString(likes)).append("\n");
    sb.append("    likeCount: ").append(toIndentedString(likeCount)).append("\n");
    sb.append("    dislikeCount: ").append(toIndentedString(dislikeCount)).append("\n");
    sb.append("    playCount: ").append(toIndentedString(playCount)).append("\n");
    sb.append("    downloadCount: ").append(toIndentedString(downloadCount)).append("\n");
    sb.append("    gameObjectCount: ").append(toIndentedString(gameObjectCount)).append("\n");
    sb.append("    publicPermissions: ").append(toIndentedString(publicPermissions)).append("\n");
    sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
    sb.append("    userPermissions: ").append(toIndentedString(userPermissions)).append("\n");
    sb.append("    flags: ").append(toIndentedString(flags)).append("\n");
    sb.append("    flagCount: ").append(toIndentedString(flagCount)).append("\n");
    sb.append("    flagThreshold: ").append(toIndentedString(flagThreshold)).append("\n");
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
    sb.append("    assignMission: ").append(toIndentedString(assignMission)).append("\n");
    sb.append("    authorOverride: ").append(toIndentedString(authorOverride)).append("\n");
    sb.append("    splashTitle: ").append(toIndentedString(splashTitle)).append("\n");
    sb.append("    splashMessage: ").append(toIndentedString(splashMessage)).append("\n");
    sb.append("    winnerMessage: ").append(toIndentedString(winnerMessage)).append("\n");
    sb.append("    tutorial: ").append(toIndentedString(tutorial)).append("\n");
    sb.append("    approvalStatus: ").append(toIndentedString(approvalStatus)).append("\n");
    sb.append("    nextLevel: ").append(toIndentedString(nextLevel)).append("\n");
    sb.append("    offer: ").append(toIndentedString(offer)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    levelNumber: ").append(toIndentedString(levelNumber)).append("\n");
    sb.append("    points: ").append(toIndentedString(points)).append("\n");
    sb.append("    ticketType: ").append(toIndentedString(ticketType)).append("\n");
    sb.append("    ticketCount: ").append(toIndentedString(ticketCount)).append("\n");
    sb.append("    allocateTickets: ").append(toIndentedString(allocateTickets)).append("\n");
    sb.append("    applicationTitle: ").append(toIndentedString(applicationTitle)).append("\n");
    sb.append("    ownerUsername: ").append(toIndentedString(ownerUsername)).append("\n");
    sb.append("    likableNotificationModels: ").append(toIndentedString(likableNotificationModels)).append("\n");
    sb.append("    notableNotificationModels: ").append(toIndentedString(notableNotificationModels)).append("\n");
    sb.append("    published: ").append(toIndentedString(published)).append("\n");
    sb.append("    contentName: ").append(toIndentedString(contentName)).append("\n");
    sb.append("    defaultThreshold: ").append(toIndentedString(defaultThreshold)).append("\n");
    sb.append("    contentAsset: ").append(toIndentedString(contentAsset)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
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


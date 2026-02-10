package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
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
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GameLevel  {
  
  @ApiModelProperty(value = "")

  private Long id;

  @ApiModelProperty(value = "")

  private Boolean active;

  @ApiModelProperty(value = "")

  private Boolean valid;

  @ApiModelProperty(value = "")

  private Long newOwnerId;

public enum GameDifficultyEnum {

VERY_EASY(String.valueOf("VERY_EASY")), EASY(String.valueOf("EASY")), MEDIUM(String.valueOf("MEDIUM")), HARD(String.valueOf("HARD")), VERY_HARD(String.valueOf("VERY_HARD"));


    private String value;

    GameDifficultyEnum (String v) {
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
    public static GameDifficultyEnum fromValue(String value) {
        for (GameDifficultyEnum b : GameDifficultyEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(value = "")

  private GameDifficultyEnum gameDifficulty;

  @ApiModelProperty(value = "")

  private String name;

  @ApiModelProperty(value = "")

  @Valid

  private Asset image;

  @ApiModelProperty(value = "")

  @Valid

  private Asset icon;

  @ApiModelProperty(value = "")

  private String description;

  @ApiModelProperty(value = "")

  private Date startDate;

  @ApiModelProperty(value = "")

  private Date endDate;

  @ApiModelProperty(value = "")

  private Boolean randomizeGameObjects;

  @ApiModelProperty(value = "")

  @Valid

  private Account owner;

  @ApiModelProperty(value = "")

  @Valid

  private AppVersion version;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid Note> notes = new ArrayList<>();

  @ApiModelProperty(value = "")

  private Long noteCount;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid YayOrNay> likes = new ArrayList<>();

  @ApiModelProperty(value = "")

  private Long likeCount;

  @ApiModelProperty(value = "")

  private Long dislikeCount;

  @ApiModelProperty(value = "")

  private Long playCount;

  @ApiModelProperty(value = "")

  private Long downloadCount;

  @ApiModelProperty(value = "")

  private Integer gameObjectCount;

  @ApiModelProperty(value = "")

  @Valid

  private Permissions publicPermissions;

public enum VisibilityEnum {

PUBLIC(String.valueOf("PUBLIC")), PRIVATE(String.valueOf("PRIVATE")), FRIENDS(String.valueOf("FRIENDS"));


    private String value;

    VisibilityEnum (String v) {
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
    public static VisibilityEnum fromValue(String value) {
        for (VisibilityEnum b : VisibilityEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(value = "")

  private VisibilityEnum visibility;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid UserPermissions> userPermissions = new ArrayList<>();

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid Flag> flags = new ArrayList<>();

  @ApiModelProperty(value = "")

  private Long flagCount;

  @ApiModelProperty(value = "")

  @Valid

  private FlagThreshold flagThreshold;

  @ApiModelProperty(value = "")

  @Valid

  private Application application;

  @ApiModelProperty(value = "")

  private Boolean assignMission;

  @ApiModelProperty(value = "")

  private String authorOverride;

  @ApiModelProperty(value = "")

  private String splashTitle;

  @ApiModelProperty(value = "")

  private String splashMessage;

  @ApiModelProperty(value = "")

  private String winnerMessage;

  @ApiModelProperty(value = "")

  @Valid

  private Tutorial tutorial;

public enum ApprovalStatusEnum {

PENDING(String.valueOf("PENDING")), REJECTED(String.valueOf("REJECTED")), APPROVED(String.valueOf("APPROVED")), FEATURED(String.valueOf("FEATURED"));


    private String value;

    ApprovalStatusEnum (String v) {
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
    public static ApprovalStatusEnum fromValue(String value) {
        for (ApprovalStatusEnum b : ApprovalStatusEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(value = "")

  private ApprovalStatusEnum approvalStatus;

  @ApiModelProperty(value = "")

  @Valid

  private GameLevel nextLevel;

  @ApiModelProperty(value = "")

  @Valid

  private Offer offer;

  @ApiModelProperty(value = "")

  private Double balance;

  @ApiModelProperty(value = "")

  private Integer levelNumber;

  @ApiModelProperty(value = "")

  private Long points;

  @ApiModelProperty(value = "")

  private String ticketType;

  @ApiModelProperty(value = "")

  private Long ticketCount;

  @ApiModelProperty(value = "")

  private Boolean allocateTickets;

  @ApiModelProperty(value = "")

  private String applicationTitle;

  @ApiModelProperty(value = "")

  private String ownerUsername;

  @ApiModelProperty(value = "")

  @Valid

  private List<Map<String, Object>> likableNotificationModels = new ArrayList<>();

  @ApiModelProperty(value = "")

  @Valid

  private List<Map<String, Object>> notableNotificationModels = new ArrayList<>();

  @ApiModelProperty(value = "")

  private Boolean published;

  @ApiModelProperty(value = "")

  private String contentName;

  @ApiModelProperty(value = "")

  private Long defaultThreshold;

  @ApiModelProperty(value = "")

  @Valid

  private Asset contentAsset;

  @ApiModelProperty(value = "")

  private String contentType;
 /**
   * Get id
   * @return id
  **/
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public GameLevel id(Long id) {
    this.id = id;
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

  public GameLevel active(Boolean active) {
    this.active = active;
    return this;
  }

 /**
   * Get valid
   * @return valid
  **/
  @JsonProperty("valid")
  public Boolean getValid() {
    return valid;
  }

  public void setValid(Boolean valid) {
    this.valid = valid;
  }

  public GameLevel valid(Boolean valid) {
    this.valid = valid;
    return this;
  }

 /**
   * Get newOwnerId
   * @return newOwnerId
  **/
  @JsonProperty("newOwnerId")
  public Long getNewOwnerId() {
    return newOwnerId;
  }

  public void setNewOwnerId(Long newOwnerId) {
    this.newOwnerId = newOwnerId;
  }

  public GameLevel newOwnerId(Long newOwnerId) {
    this.newOwnerId = newOwnerId;
    return this;
  }

 /**
   * Get gameDifficulty
   * @return gameDifficulty
  **/
  @JsonProperty("gameDifficulty")
  public String getGameDifficulty() {
    if (gameDifficulty == null) {
      return null;
    }
    return gameDifficulty.value();
  }

  public void setGameDifficulty(GameDifficultyEnum gameDifficulty) {
    this.gameDifficulty = gameDifficulty;
  }

  public GameLevel gameDifficulty(GameDifficultyEnum gameDifficulty) {
    this.gameDifficulty = gameDifficulty;
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

  public GameLevel name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get image
   * @return image
  **/
  @JsonProperty("image")
  public Asset getImage() {
    return image;
  }

  public void setImage(Asset image) {
    this.image = image;
  }

  public GameLevel image(Asset image) {
    this.image = image;
    return this;
  }

 /**
   * Get icon
   * @return icon
  **/
  @JsonProperty("icon")
  public Asset getIcon() {
    return icon;
  }

  public void setIcon(Asset icon) {
    this.icon = icon;
  }

  public GameLevel icon(Asset icon) {
    this.icon = icon;
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

  public GameLevel description(String description) {
    this.description = description;
    return this;
  }

 /**
   * Get startDate
   * @return startDate
  **/
  @JsonProperty("startDate")
  public Date getStartDate() {
    return startDate;
  }

  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }

  public GameLevel startDate(Date startDate) {
    this.startDate = startDate;
    return this;
  }

 /**
   * Get endDate
   * @return endDate
  **/
  @JsonProperty("endDate")
  public Date getEndDate() {
    return endDate;
  }

  public void setEndDate(Date endDate) {
    this.endDate = endDate;
  }

  public GameLevel endDate(Date endDate) {
    this.endDate = endDate;
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

  public GameLevel randomizeGameObjects(Boolean randomizeGameObjects) {
    this.randomizeGameObjects = randomizeGameObjects;
    return this;
  }

 /**
   * Get owner
   * @return owner
  **/
  @JsonProperty("owner")
  public Account getOwner() {
    return owner;
  }

  public void setOwner(Account owner) {
    this.owner = owner;
  }

  public GameLevel owner(Account owner) {
    this.owner = owner;
    return this;
  }

 /**
   * Get version
   * @return version
  **/
  @JsonProperty("version")
  public AppVersion getVersion() {
    return version;
  }

  public void setVersion(AppVersion version) {
    this.version = version;
  }

  public GameLevel version(AppVersion version) {
    this.version = version;
    return this;
  }

 /**
   * Get notes
   * @return notes
  **/
  @JsonProperty("notes")
  public List<@Valid Note> getNotes() {
    return notes;
  }

  public void setNotes(List<@Valid Note> notes) {
    this.notes = notes;
  }

  public GameLevel notes(List<@Valid Note> notes) {
    this.notes = notes;
    return this;
  }

  public GameLevel addNotesItem(Note notesItem) {
    this.notes.add(notesItem);
    return this;
  }

 /**
   * Get noteCount
   * @return noteCount
  **/
  @JsonProperty("noteCount")
  public Long getNoteCount() {
    return noteCount;
  }

  public void setNoteCount(Long noteCount) {
    this.noteCount = noteCount;
  }

  public GameLevel noteCount(Long noteCount) {
    this.noteCount = noteCount;
    return this;
  }

 /**
   * Get likes
   * @return likes
  **/
  @JsonProperty("likes")
  public List<@Valid YayOrNay> getLikes() {
    return likes;
  }

  public void setLikes(List<@Valid YayOrNay> likes) {
    this.likes = likes;
  }

  public GameLevel likes(List<@Valid YayOrNay> likes) {
    this.likes = likes;
    return this;
  }

  public GameLevel addLikesItem(YayOrNay likesItem) {
    this.likes.add(likesItem);
    return this;
  }

 /**
   * Get likeCount
   * @return likeCount
  **/
  @JsonProperty("likeCount")
  public Long getLikeCount() {
    return likeCount;
  }

  public void setLikeCount(Long likeCount) {
    this.likeCount = likeCount;
  }

  public GameLevel likeCount(Long likeCount) {
    this.likeCount = likeCount;
    return this;
  }

 /**
   * Get dislikeCount
   * @return dislikeCount
  **/
  @JsonProperty("dislikeCount")
  public Long getDislikeCount() {
    return dislikeCount;
  }

  public void setDislikeCount(Long dislikeCount) {
    this.dislikeCount = dislikeCount;
  }

  public GameLevel dislikeCount(Long dislikeCount) {
    this.dislikeCount = dislikeCount;
    return this;
  }

 /**
   * Get playCount
   * @return playCount
  **/
  @JsonProperty("playCount")
  public Long getPlayCount() {
    return playCount;
  }

  public void setPlayCount(Long playCount) {
    this.playCount = playCount;
  }

  public GameLevel playCount(Long playCount) {
    this.playCount = playCount;
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

  public GameLevel downloadCount(Long downloadCount) {
    this.downloadCount = downloadCount;
    return this;
  }

 /**
   * Get gameObjectCount
   * @return gameObjectCount
  **/
  @JsonProperty("gameObjectCount")
  public Integer getGameObjectCount() {
    return gameObjectCount;
  }

  public void setGameObjectCount(Integer gameObjectCount) {
    this.gameObjectCount = gameObjectCount;
  }

  public GameLevel gameObjectCount(Integer gameObjectCount) {
    this.gameObjectCount = gameObjectCount;
    return this;
  }

 /**
   * Get publicPermissions
   * @return publicPermissions
  **/
  @JsonProperty("publicPermissions")
  public Permissions getPublicPermissions() {
    return publicPermissions;
  }

  public void setPublicPermissions(Permissions publicPermissions) {
    this.publicPermissions = publicPermissions;
  }

  public GameLevel publicPermissions(Permissions publicPermissions) {
    this.publicPermissions = publicPermissions;
    return this;
  }

 /**
   * Get visibility
   * @return visibility
  **/
  @JsonProperty("visibility")
  public String getVisibility() {
    if (visibility == null) {
      return null;
    }
    return visibility.value();
  }

  public void setVisibility(VisibilityEnum visibility) {
    this.visibility = visibility;
  }

  public GameLevel visibility(VisibilityEnum visibility) {
    this.visibility = visibility;
    return this;
  }

 /**
   * Get userPermissions
   * @return userPermissions
  **/
  @JsonProperty("userPermissions")
  public List<@Valid UserPermissions> getUserPermissions() {
    return userPermissions;
  }

  public void setUserPermissions(List<@Valid UserPermissions> userPermissions) {
    this.userPermissions = userPermissions;
  }

  public GameLevel userPermissions(List<@Valid UserPermissions> userPermissions) {
    this.userPermissions = userPermissions;
    return this;
  }

  public GameLevel addUserPermissionsItem(UserPermissions userPermissionsItem) {
    this.userPermissions.add(userPermissionsItem);
    return this;
  }

 /**
   * Get flags
   * @return flags
  **/
  @JsonProperty("flags")
  public List<@Valid Flag> getFlags() {
    return flags;
  }

  public void setFlags(List<@Valid Flag> flags) {
    this.flags = flags;
  }

  public GameLevel flags(List<@Valid Flag> flags) {
    this.flags = flags;
    return this;
  }

  public GameLevel addFlagsItem(Flag flagsItem) {
    this.flags.add(flagsItem);
    return this;
  }

 /**
   * Get flagCount
   * @return flagCount
  **/
  @JsonProperty("flagCount")
  public Long getFlagCount() {
    return flagCount;
  }

  public void setFlagCount(Long flagCount) {
    this.flagCount = flagCount;
  }

  public GameLevel flagCount(Long flagCount) {
    this.flagCount = flagCount;
    return this;
  }

 /**
   * Get flagThreshold
   * @return flagThreshold
  **/
  @JsonProperty("flagThreshold")
  public FlagThreshold getFlagThreshold() {
    return flagThreshold;
  }

  public void setFlagThreshold(FlagThreshold flagThreshold) {
    this.flagThreshold = flagThreshold;
  }

  public GameLevel flagThreshold(FlagThreshold flagThreshold) {
    this.flagThreshold = flagThreshold;
    return this;
  }

 /**
   * Get application
   * @return application
  **/
  @JsonProperty("application")
  public Application getApplication() {
    return application;
  }

  public void setApplication(Application application) {
    this.application = application;
  }

  public GameLevel application(Application application) {
    this.application = application;
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

  public GameLevel assignMission(Boolean assignMission) {
    this.assignMission = assignMission;
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

  public GameLevel authorOverride(String authorOverride) {
    this.authorOverride = authorOverride;
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

  public GameLevel splashTitle(String splashTitle) {
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

  public GameLevel splashMessage(String splashMessage) {
    this.splashMessage = splashMessage;
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

  public GameLevel winnerMessage(String winnerMessage) {
    this.winnerMessage = winnerMessage;
    return this;
  }

 /**
   * Get tutorial
   * @return tutorial
  **/
  @JsonProperty("tutorial")
  public Tutorial getTutorial() {
    return tutorial;
  }

  public void setTutorial(Tutorial tutorial) {
    this.tutorial = tutorial;
  }

  public GameLevel tutorial(Tutorial tutorial) {
    this.tutorial = tutorial;
    return this;
  }

 /**
   * Get approvalStatus
   * @return approvalStatus
  **/
  @JsonProperty("approvalStatus")
  public String getApprovalStatus() {
    if (approvalStatus == null) {
      return null;
    }
    return approvalStatus.value();
  }

  public void setApprovalStatus(ApprovalStatusEnum approvalStatus) {
    this.approvalStatus = approvalStatus;
  }

  public GameLevel approvalStatus(ApprovalStatusEnum approvalStatus) {
    this.approvalStatus = approvalStatus;
    return this;
  }

 /**
   * Get nextLevel
   * @return nextLevel
  **/
  @JsonProperty("nextLevel")
  public GameLevel getNextLevel() {
    return nextLevel;
  }

  public void setNextLevel(GameLevel nextLevel) {
    this.nextLevel = nextLevel;
  }

  public GameLevel nextLevel(GameLevel nextLevel) {
    this.nextLevel = nextLevel;
    return this;
  }

 /**
   * Get offer
   * @return offer
  **/
  @JsonProperty("offer")
  public Offer getOffer() {
    return offer;
  }

  public void setOffer(Offer offer) {
    this.offer = offer;
  }

  public GameLevel offer(Offer offer) {
    this.offer = offer;
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

  public GameLevel balance(Double balance) {
    this.balance = balance;
    return this;
  }

 /**
   * Get levelNumber
   * @return levelNumber
  **/
  @JsonProperty("levelNumber")
  public Integer getLevelNumber() {
    return levelNumber;
  }

  public void setLevelNumber(Integer levelNumber) {
    this.levelNumber = levelNumber;
  }

  public GameLevel levelNumber(Integer levelNumber) {
    this.levelNumber = levelNumber;
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

  public GameLevel points(Long points) {
    this.points = points;
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

  public GameLevel ticketType(String ticketType) {
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

  public GameLevel ticketCount(Long ticketCount) {
    this.ticketCount = ticketCount;
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

  public GameLevel allocateTickets(Boolean allocateTickets) {
    this.allocateTickets = allocateTickets;
    return this;
  }

 /**
   * Get applicationTitle
   * @return applicationTitle
  **/
  @JsonProperty("applicationTitle")
  public String getApplicationTitle() {
    return applicationTitle;
  }

  public void setApplicationTitle(String applicationTitle) {
    this.applicationTitle = applicationTitle;
  }

  public GameLevel applicationTitle(String applicationTitle) {
    this.applicationTitle = applicationTitle;
    return this;
  }

 /**
   * Get ownerUsername
   * @return ownerUsername
  **/
  @JsonProperty("ownerUsername")
  public String getOwnerUsername() {
    return ownerUsername;
  }

  public void setOwnerUsername(String ownerUsername) {
    this.ownerUsername = ownerUsername;
  }

  public GameLevel ownerUsername(String ownerUsername) {
    this.ownerUsername = ownerUsername;
    return this;
  }

 /**
   * Get likableNotificationModels
   * @return likableNotificationModels
  **/
  @JsonProperty("likableNotificationModels")
  public List<Map<String, Object>> getLikableNotificationModels() {
    return likableNotificationModels;
  }

  public void setLikableNotificationModels(List<Map<String, Object>> likableNotificationModels) {
    this.likableNotificationModels = likableNotificationModels;
  }

  public GameLevel likableNotificationModels(List<Map<String, Object>> likableNotificationModels) {
    this.likableNotificationModels = likableNotificationModels;
    return this;
  }

  public GameLevel addLikableNotificationModelsItem(Map<String, Object> likableNotificationModelsItem) {
    this.likableNotificationModels.add(likableNotificationModelsItem);
    return this;
  }

 /**
   * Get notableNotificationModels
   * @return notableNotificationModels
  **/
  @JsonProperty("notableNotificationModels")
  public List<Map<String, Object>> getNotableNotificationModels() {
    return notableNotificationModels;
  }

  public void setNotableNotificationModels(List<Map<String, Object>> notableNotificationModels) {
    this.notableNotificationModels = notableNotificationModels;
  }

  public GameLevel notableNotificationModels(List<Map<String, Object>> notableNotificationModels) {
    this.notableNotificationModels = notableNotificationModels;
    return this;
  }

  public GameLevel addNotableNotificationModelsItem(Map<String, Object> notableNotificationModelsItem) {
    this.notableNotificationModels.add(notableNotificationModelsItem);
    return this;
  }

 /**
   * Get published
   * @return published
  **/
  @JsonProperty("published")
  public Boolean getPublished() {
    return published;
  }

  public void setPublished(Boolean published) {
    this.published = published;
  }

  public GameLevel published(Boolean published) {
    this.published = published;
    return this;
  }

 /**
   * Get contentName
   * @return contentName
  **/
  @JsonProperty("contentName")
  public String getContentName() {
    return contentName;
  }

  public void setContentName(String contentName) {
    this.contentName = contentName;
  }

  public GameLevel contentName(String contentName) {
    this.contentName = contentName;
    return this;
  }

 /**
   * Get defaultThreshold
   * @return defaultThreshold
  **/
  @JsonProperty("defaultThreshold")
  public Long getDefaultThreshold() {
    return defaultThreshold;
  }

  public void setDefaultThreshold(Long defaultThreshold) {
    this.defaultThreshold = defaultThreshold;
  }

  public GameLevel defaultThreshold(Long defaultThreshold) {
    this.defaultThreshold = defaultThreshold;
    return this;
  }

 /**
   * Get contentAsset
   * @return contentAsset
  **/
  @JsonProperty("contentAsset")
  public Asset getContentAsset() {
    return contentAsset;
  }

  public void setContentAsset(Asset contentAsset) {
    this.contentAsset = contentAsset;
  }

  public GameLevel contentAsset(Asset contentAsset) {
    this.contentAsset = contentAsset;
    return this;
  }

 /**
   * Get contentType
   * @return contentType
  **/
  @JsonProperty("contentType")
  public String getContentType() {
    return contentType;
  }

  public void setContentType(String contentType) {
    this.contentType = contentType;
  }

  public GameLevel contentType(String contentType) {
    this.contentType = contentType;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


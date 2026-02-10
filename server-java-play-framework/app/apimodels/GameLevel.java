package apimodels;

import apimodels.Account;
import apimodels.AppVersion;
import apimodels.Application;
import apimodels.Asset;
import apimodels.Flag;
import apimodels.FlagThreshold;
import apimodels.Note;
import apimodels.Offer;
import apimodels.Permissions;
import apimodels.Tutorial;
import apimodels.UserPermissions;
import apimodels.YayOrNay;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * GameLevel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class GameLevel   {
  @JsonProperty("id")
  
  private Long id;

  @JsonProperty("active")
  
  private Boolean active;

  @JsonProperty("valid")
  
  private Boolean valid;

  @JsonProperty("newOwnerId")
  
  private Long newOwnerId;

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

  @JsonProperty("gameDifficulty")
  
  private GameDifficultyEnum gameDifficulty;

  @JsonProperty("name")
  
  private String name;

  @JsonProperty("image")
  @Valid

  private Asset image;

  @JsonProperty("icon")
  @Valid

  private Asset icon;

  @JsonProperty("description")
  
  private String description;

  @JsonProperty("startDate")
  @Valid

  private OffsetDateTime startDate;

  @JsonProperty("endDate")
  @Valid

  private OffsetDateTime endDate;

  @JsonProperty("randomizeGameObjects")
  
  private Boolean randomizeGameObjects;

  @JsonProperty("owner")
  @Valid

  private Account owner;

  @JsonProperty("version")
  @Valid

  private AppVersion version;

  @JsonProperty("notes")
  @Valid

  private List<@Valid Note> notes = null;

  @JsonProperty("noteCount")
  
  private Long noteCount;

  @JsonProperty("likes")
  @Valid

  private List<@Valid YayOrNay> likes = null;

  @JsonProperty("likeCount")
  
  private Long likeCount;

  @JsonProperty("dislikeCount")
  
  private Long dislikeCount;

  @JsonProperty("playCount")
  
  private Long playCount;

  @JsonProperty("downloadCount")
  
  private Long downloadCount;

  @JsonProperty("gameObjectCount")
  
  private Integer gameObjectCount;

  @JsonProperty("publicPermissions")
  @Valid

  private Permissions publicPermissions;

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

  @JsonProperty("visibility")
  
  private VisibilityEnum visibility;

  @JsonProperty("userPermissions")
  @Valid

  private List<@Valid UserPermissions> userPermissions = null;

  @JsonProperty("flags")
  @Valid

  private List<@Valid Flag> flags = null;

  @JsonProperty("flagCount")
  
  private Long flagCount;

  @JsonProperty("flagThreshold")
  @Valid

  private FlagThreshold flagThreshold;

  @JsonProperty("application")
  @Valid

  private Application application;

  @JsonProperty("assignMission")
  
  private Boolean assignMission;

  @JsonProperty("authorOverride")
  
  private String authorOverride;

  @JsonProperty("splashTitle")
  
  private String splashTitle;

  @JsonProperty("splashMessage")
  
  private String splashMessage;

  @JsonProperty("winnerMessage")
  
  private String winnerMessage;

  @JsonProperty("tutorial")
  @Valid

  private Tutorial tutorial;

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

  @JsonProperty("approvalStatus")
  
  private ApprovalStatusEnum approvalStatus;

  @JsonProperty("nextLevel")
  @Valid

  private GameLevel nextLevel;

  @JsonProperty("offer")
  @Valid

  private Offer offer;

  @JsonProperty("balance")
  
  private Double balance;

  @JsonProperty("levelNumber")
  
  private Integer levelNumber;

  @JsonProperty("points")
  
  private Long points;

  @JsonProperty("ticketType")
  
  private String ticketType;

  @JsonProperty("ticketCount")
  
  private Long ticketCount;

  @JsonProperty("allocateTickets")
  
  private Boolean allocateTickets;

  @JsonProperty("applicationTitle")
  
  private String applicationTitle;

  @JsonProperty("ownerUsername")
  
  private String ownerUsername;

  @JsonProperty("likableNotificationModels")
  @Valid

  private List<Map<String, Object>> likableNotificationModels = null;

  @JsonProperty("notableNotificationModels")
  @Valid

  private List<Map<String, Object>> notableNotificationModels = null;

  @JsonProperty("published")
  
  private Boolean published;

  @JsonProperty("contentName")
  
  private String contentName;

  @JsonProperty("defaultThreshold")
  
  private Long defaultThreshold;

  @JsonProperty("contentAsset")
  @Valid

  private Asset contentAsset;

  @JsonProperty("contentType")
  
  private String contentType;

  public GameLevel id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public GameLevel active(Boolean active) {
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

  public GameLevel valid(Boolean valid) {
    this.valid = valid;
    return this;
  }

   /**
   * Get valid
   * @return valid
  **/
  public Boolean getValid() {
    return valid;
  }

  public void setValid(Boolean valid) {
    this.valid = valid;
  }

  public GameLevel newOwnerId(Long newOwnerId) {
    this.newOwnerId = newOwnerId;
    return this;
  }

   /**
   * Get newOwnerId
   * @return newOwnerId
  **/
  public Long getNewOwnerId() {
    return newOwnerId;
  }

  public void setNewOwnerId(Long newOwnerId) {
    this.newOwnerId = newOwnerId;
  }

  public GameLevel gameDifficulty(GameDifficultyEnum gameDifficulty) {
    this.gameDifficulty = gameDifficulty;
    return this;
  }

   /**
   * Get gameDifficulty
   * @return gameDifficulty
  **/
  public GameDifficultyEnum getGameDifficulty() {
    return gameDifficulty;
  }

  public void setGameDifficulty(GameDifficultyEnum gameDifficulty) {
    this.gameDifficulty = gameDifficulty;
  }

  public GameLevel name(String name) {
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

  public GameLevel image(Asset image) {
    this.image = image;
    return this;
  }

   /**
   * Get image
   * @return image
  **/
  public Asset getImage() {
    return image;
  }

  public void setImage(Asset image) {
    this.image = image;
  }

  public GameLevel icon(Asset icon) {
    this.icon = icon;
    return this;
  }

   /**
   * Get icon
   * @return icon
  **/
  public Asset getIcon() {
    return icon;
  }

  public void setIcon(Asset icon) {
    this.icon = icon;
  }

  public GameLevel description(String description) {
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

  public GameLevel startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }

  public GameLevel endDate(OffsetDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * Get endDate
   * @return endDate
  **/
  public OffsetDateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }

  public GameLevel randomizeGameObjects(Boolean randomizeGameObjects) {
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

  public GameLevel owner(Account owner) {
    this.owner = owner;
    return this;
  }

   /**
   * Get owner
   * @return owner
  **/
  public Account getOwner() {
    return owner;
  }

  public void setOwner(Account owner) {
    this.owner = owner;
  }

  public GameLevel version(AppVersion version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  public AppVersion getVersion() {
    return version;
  }

  public void setVersion(AppVersion version) {
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
  **/
  public List<@Valid Note> getNotes() {
    return notes;
  }

  public void setNotes(List<@Valid Note> notes) {
    this.notes = notes;
  }

  public GameLevel noteCount(Long noteCount) {
    this.noteCount = noteCount;
    return this;
  }

   /**
   * Get noteCount
   * @return noteCount
  **/
  public Long getNoteCount() {
    return noteCount;
  }

  public void setNoteCount(Long noteCount) {
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
  **/
  public List<@Valid YayOrNay> getLikes() {
    return likes;
  }

  public void setLikes(List<@Valid YayOrNay> likes) {
    this.likes = likes;
  }

  public GameLevel likeCount(Long likeCount) {
    this.likeCount = likeCount;
    return this;
  }

   /**
   * Get likeCount
   * @return likeCount
  **/
  public Long getLikeCount() {
    return likeCount;
  }

  public void setLikeCount(Long likeCount) {
    this.likeCount = likeCount;
  }

  public GameLevel dislikeCount(Long dislikeCount) {
    this.dislikeCount = dislikeCount;
    return this;
  }

   /**
   * Get dislikeCount
   * @return dislikeCount
  **/
  public Long getDislikeCount() {
    return dislikeCount;
  }

  public void setDislikeCount(Long dislikeCount) {
    this.dislikeCount = dislikeCount;
  }

  public GameLevel playCount(Long playCount) {
    this.playCount = playCount;
    return this;
  }

   /**
   * Get playCount
   * @return playCount
  **/
  public Long getPlayCount() {
    return playCount;
  }

  public void setPlayCount(Long playCount) {
    this.playCount = playCount;
  }

  public GameLevel downloadCount(Long downloadCount) {
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

  public GameLevel gameObjectCount(Integer gameObjectCount) {
    this.gameObjectCount = gameObjectCount;
    return this;
  }

   /**
   * Get gameObjectCount
   * @return gameObjectCount
  **/
  public Integer getGameObjectCount() {
    return gameObjectCount;
  }

  public void setGameObjectCount(Integer gameObjectCount) {
    this.gameObjectCount = gameObjectCount;
  }

  public GameLevel publicPermissions(Permissions publicPermissions) {
    this.publicPermissions = publicPermissions;
    return this;
  }

   /**
   * Get publicPermissions
   * @return publicPermissions
  **/
  public Permissions getPublicPermissions() {
    return publicPermissions;
  }

  public void setPublicPermissions(Permissions publicPermissions) {
    this.publicPermissions = publicPermissions;
  }

  public GameLevel visibility(VisibilityEnum visibility) {
    this.visibility = visibility;
    return this;
  }

   /**
   * Get visibility
   * @return visibility
  **/
  public VisibilityEnum getVisibility() {
    return visibility;
  }

  public void setVisibility(VisibilityEnum visibility) {
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
  **/
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
  **/
  public List<@Valid Flag> getFlags() {
    return flags;
  }

  public void setFlags(List<@Valid Flag> flags) {
    this.flags = flags;
  }

  public GameLevel flagCount(Long flagCount) {
    this.flagCount = flagCount;
    return this;
  }

   /**
   * Get flagCount
   * @return flagCount
  **/
  public Long getFlagCount() {
    return flagCount;
  }

  public void setFlagCount(Long flagCount) {
    this.flagCount = flagCount;
  }

  public GameLevel flagThreshold(FlagThreshold flagThreshold) {
    this.flagThreshold = flagThreshold;
    return this;
  }

   /**
   * Get flagThreshold
   * @return flagThreshold
  **/
  public FlagThreshold getFlagThreshold() {
    return flagThreshold;
  }

  public void setFlagThreshold(FlagThreshold flagThreshold) {
    this.flagThreshold = flagThreshold;
  }

  public GameLevel application(Application application) {
    this.application = application;
    return this;
  }

   /**
   * Get application
   * @return application
  **/
  public Application getApplication() {
    return application;
  }

  public void setApplication(Application application) {
    this.application = application;
  }

  public GameLevel assignMission(Boolean assignMission) {
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

  public GameLevel authorOverride(String authorOverride) {
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

  public GameLevel splashTitle(String splashTitle) {
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

  public GameLevel splashMessage(String splashMessage) {
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

  public GameLevel winnerMessage(String winnerMessage) {
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

  public GameLevel tutorial(Tutorial tutorial) {
    this.tutorial = tutorial;
    return this;
  }

   /**
   * Get tutorial
   * @return tutorial
  **/
  public Tutorial getTutorial() {
    return tutorial;
  }

  public void setTutorial(Tutorial tutorial) {
    this.tutorial = tutorial;
  }

  public GameLevel approvalStatus(ApprovalStatusEnum approvalStatus) {
    this.approvalStatus = approvalStatus;
    return this;
  }

   /**
   * Get approvalStatus
   * @return approvalStatus
  **/
  public ApprovalStatusEnum getApprovalStatus() {
    return approvalStatus;
  }

  public void setApprovalStatus(ApprovalStatusEnum approvalStatus) {
    this.approvalStatus = approvalStatus;
  }

  public GameLevel nextLevel(GameLevel nextLevel) {
    this.nextLevel = nextLevel;
    return this;
  }

   /**
   * Get nextLevel
   * @return nextLevel
  **/
  public GameLevel getNextLevel() {
    return nextLevel;
  }

  public void setNextLevel(GameLevel nextLevel) {
    this.nextLevel = nextLevel;
  }

  public GameLevel offer(Offer offer) {
    this.offer = offer;
    return this;
  }

   /**
   * Get offer
   * @return offer
  **/
  public Offer getOffer() {
    return offer;
  }

  public void setOffer(Offer offer) {
    this.offer = offer;
  }

  public GameLevel balance(Double balance) {
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

  public GameLevel levelNumber(Integer levelNumber) {
    this.levelNumber = levelNumber;
    return this;
  }

   /**
   * Get levelNumber
   * @return levelNumber
  **/
  public Integer getLevelNumber() {
    return levelNumber;
  }

  public void setLevelNumber(Integer levelNumber) {
    this.levelNumber = levelNumber;
  }

  public GameLevel points(Long points) {
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

  public GameLevel ticketType(String ticketType) {
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

  public GameLevel ticketCount(Long ticketCount) {
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

  public GameLevel allocateTickets(Boolean allocateTickets) {
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

  public GameLevel applicationTitle(String applicationTitle) {
    this.applicationTitle = applicationTitle;
    return this;
  }

   /**
   * Get applicationTitle
   * @return applicationTitle
  **/
  public String getApplicationTitle() {
    return applicationTitle;
  }

  public void setApplicationTitle(String applicationTitle) {
    this.applicationTitle = applicationTitle;
  }

  public GameLevel ownerUsername(String ownerUsername) {
    this.ownerUsername = ownerUsername;
    return this;
  }

   /**
   * Get ownerUsername
   * @return ownerUsername
  **/
  public String getOwnerUsername() {
    return ownerUsername;
  }

  public void setOwnerUsername(String ownerUsername) {
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
  **/
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
  **/
  public List<Map<String, Object>> getNotableNotificationModels() {
    return notableNotificationModels;
  }

  public void setNotableNotificationModels(List<Map<String, Object>> notableNotificationModels) {
    this.notableNotificationModels = notableNotificationModels;
  }

  public GameLevel published(Boolean published) {
    this.published = published;
    return this;
  }

   /**
   * Get published
   * @return published
  **/
  public Boolean getPublished() {
    return published;
  }

  public void setPublished(Boolean published) {
    this.published = published;
  }

  public GameLevel contentName(String contentName) {
    this.contentName = contentName;
    return this;
  }

   /**
   * Get contentName
   * @return contentName
  **/
  public String getContentName() {
    return contentName;
  }

  public void setContentName(String contentName) {
    this.contentName = contentName;
  }

  public GameLevel defaultThreshold(Long defaultThreshold) {
    this.defaultThreshold = defaultThreshold;
    return this;
  }

   /**
   * Get defaultThreshold
   * @return defaultThreshold
  **/
  public Long getDefaultThreshold() {
    return defaultThreshold;
  }

  public void setDefaultThreshold(Long defaultThreshold) {
    this.defaultThreshold = defaultThreshold;
  }

  public GameLevel contentAsset(Asset contentAsset) {
    this.contentAsset = contentAsset;
    return this;
  }

   /**
   * Get contentAsset
   * @return contentAsset
  **/
  public Asset getContentAsset() {
    return contentAsset;
  }

  public void setContentAsset(Asset contentAsset) {
    this.contentAsset = contentAsset;
  }

  public GameLevel contentType(String contentType) {
    this.contentType = contentType;
    return this;
  }

   /**
   * Get contentType
   * @return contentType
  **/
  public String getContentType() {
    return contentType;
  }

  public void setContentType(String contentType) {
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
    return Objects.equals(id, gameLevel.id) &&
        Objects.equals(active, gameLevel.active) &&
        Objects.equals(valid, gameLevel.valid) &&
        Objects.equals(newOwnerId, gameLevel.newOwnerId) &&
        Objects.equals(gameDifficulty, gameLevel.gameDifficulty) &&
        Objects.equals(name, gameLevel.name) &&
        Objects.equals(image, gameLevel.image) &&
        Objects.equals(icon, gameLevel.icon) &&
        Objects.equals(description, gameLevel.description) &&
        Objects.equals(startDate, gameLevel.startDate) &&
        Objects.equals(endDate, gameLevel.endDate) &&
        Objects.equals(randomizeGameObjects, gameLevel.randomizeGameObjects) &&
        Objects.equals(owner, gameLevel.owner) &&
        Objects.equals(version, gameLevel.version) &&
        Objects.equals(notes, gameLevel.notes) &&
        Objects.equals(noteCount, gameLevel.noteCount) &&
        Objects.equals(likes, gameLevel.likes) &&
        Objects.equals(likeCount, gameLevel.likeCount) &&
        Objects.equals(dislikeCount, gameLevel.dislikeCount) &&
        Objects.equals(playCount, gameLevel.playCount) &&
        Objects.equals(downloadCount, gameLevel.downloadCount) &&
        Objects.equals(gameObjectCount, gameLevel.gameObjectCount) &&
        Objects.equals(publicPermissions, gameLevel.publicPermissions) &&
        Objects.equals(visibility, gameLevel.visibility) &&
        Objects.equals(userPermissions, gameLevel.userPermissions) &&
        Objects.equals(flags, gameLevel.flags) &&
        Objects.equals(flagCount, gameLevel.flagCount) &&
        Objects.equals(flagThreshold, gameLevel.flagThreshold) &&
        Objects.equals(application, gameLevel.application) &&
        Objects.equals(assignMission, gameLevel.assignMission) &&
        Objects.equals(authorOverride, gameLevel.authorOverride) &&
        Objects.equals(splashTitle, gameLevel.splashTitle) &&
        Objects.equals(splashMessage, gameLevel.splashMessage) &&
        Objects.equals(winnerMessage, gameLevel.winnerMessage) &&
        Objects.equals(tutorial, gameLevel.tutorial) &&
        Objects.equals(approvalStatus, gameLevel.approvalStatus) &&
        Objects.equals(nextLevel, gameLevel.nextLevel) &&
        Objects.equals(offer, gameLevel.offer) &&
        Objects.equals(balance, gameLevel.balance) &&
        Objects.equals(levelNumber, gameLevel.levelNumber) &&
        Objects.equals(points, gameLevel.points) &&
        Objects.equals(ticketType, gameLevel.ticketType) &&
        Objects.equals(ticketCount, gameLevel.ticketCount) &&
        Objects.equals(allocateTickets, gameLevel.allocateTickets) &&
        Objects.equals(applicationTitle, gameLevel.applicationTitle) &&
        Objects.equals(ownerUsername, gameLevel.ownerUsername) &&
        Objects.equals(likableNotificationModels, gameLevel.likableNotificationModels) &&
        Objects.equals(notableNotificationModels, gameLevel.notableNotificationModels) &&
        Objects.equals(published, gameLevel.published) &&
        Objects.equals(contentName, gameLevel.contentName) &&
        Objects.equals(defaultThreshold, gameLevel.defaultThreshold) &&
        Objects.equals(contentAsset, gameLevel.contentAsset) &&
        Objects.equals(contentType, gameLevel.contentType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, active, valid, newOwnerId, gameDifficulty, name, image, icon, description, startDate, endDate, randomizeGameObjects, owner, version, notes, noteCount, likes, likeCount, dislikeCount, playCount, downloadCount, gameObjectCount, publicPermissions, visibility, userPermissions, flags, flagCount, flagThreshold, application, assignMission, authorOverride, splashTitle, splashMessage, winnerMessage, tutorial, approvalStatus, nextLevel, offer, balance, levelNumber, points, ticketType, ticketCount, allocateTickets, applicationTitle, ownerUsername, likableNotificationModels, notableNotificationModels, published, contentName, defaultThreshold, contentAsset, contentType);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


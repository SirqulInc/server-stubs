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
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class GameLevel   {
  
  private Long id;
  private Boolean active;
  private Boolean valid;
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
    private String value;

    GameDifficultyEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private GameDifficultyEnum gameDifficulty;
  private String name;
  private Asset image;
  private Asset icon;
  private String description;
  private Date startDate;
  private Date endDate;
  private Boolean randomizeGameObjects;
  private Account owner;
  private AppVersion version;
  private List<@Valid Note> notes = new ArrayList<>();
  private Long noteCount;
  private List<@Valid YayOrNay> likes = new ArrayList<>();
  private Long likeCount;
  private Long dislikeCount;
  private Long playCount;
  private Long downloadCount;
  private Integer gameObjectCount;
  private Permissions publicPermissions;

  /**
   * Gets or Sets visibility
   */
  public enum VisibilityEnum {
    PUBLIC("PUBLIC"),

        PRIVATE("PRIVATE"),

        FRIENDS("FRIENDS");
    private String value;

    VisibilityEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private VisibilityEnum visibility;
  private List<@Valid UserPermissions> userPermissions = new ArrayList<>();
  private List<@Valid Flag> flags = new ArrayList<>();
  private Long flagCount;
  private FlagThreshold flagThreshold;
  private Application application;
  private Boolean assignMission;
  private String authorOverride;
  private String splashTitle;
  private String splashMessage;
  private String winnerMessage;
  private Tutorial tutorial;

  /**
   * Gets or Sets approvalStatus
   */
  public enum ApprovalStatusEnum {
    PENDING("PENDING"),

        REJECTED("REJECTED"),

        APPROVED("APPROVED"),

        FEATURED("FEATURED");
    private String value;

    ApprovalStatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private ApprovalStatusEnum approvalStatus;
  private GameLevel nextLevel;
  private Offer offer;
  private Double balance;
  private Integer levelNumber;
  private Long points;
  private String ticketType;
  private Long ticketCount;
  private Boolean allocateTickets;
  private String applicationTitle;
  private String ownerUsername;
  private List<Map<String, Object>> likableNotificationModels = new ArrayList<>();
  private List<Map<String, Object>> notableNotificationModels = new ArrayList<>();
  private Boolean published;
  private String contentName;
  private Long defaultThreshold;
  private Asset contentAsset;
  private String contentType;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
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
  @JsonProperty("valid")
  public Boolean getValid() {
    return valid;
  }
  public void setValid(Boolean valid) {
    this.valid = valid;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("newOwnerId")
  public Long getNewOwnerId() {
    return newOwnerId;
  }
  public void setNewOwnerId(Long newOwnerId) {
    this.newOwnerId = newOwnerId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("gameDifficulty")
  public GameDifficultyEnum getGameDifficulty() {
    return gameDifficulty;
  }
  public void setGameDifficulty(GameDifficultyEnum gameDifficulty) {
    this.gameDifficulty = gameDifficulty;
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
  @JsonProperty("image")
  @Valid
  public Asset getImage() {
    return image;
  }
  public void setImage(Asset image) {
    this.image = image;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("icon")
  @Valid
  public Asset getIcon() {
    return icon;
  }
  public void setIcon(Asset icon) {
    this.icon = icon;
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
  @JsonProperty("startDate")
  public Date getStartDate() {
    return startDate;
  }
  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("endDate")
  public Date getEndDate() {
    return endDate;
  }
  public void setEndDate(Date endDate) {
    this.endDate = endDate;
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
  @JsonProperty("owner")
  @Valid
  public Account getOwner() {
    return owner;
  }
  public void setOwner(Account owner) {
    this.owner = owner;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("version")
  @Valid
  public AppVersion getVersion() {
    return version;
  }
  public void setVersion(AppVersion version) {
    this.version = version;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("notes")
  @Valid
  public List<@Valid Note> getNotes() {
    return notes;
  }
  public void setNotes(List<@Valid Note> notes) {
    this.notes = notes;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("noteCount")
  public Long getNoteCount() {
    return noteCount;
  }
  public void setNoteCount(Long noteCount) {
    this.noteCount = noteCount;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("likes")
  @Valid
  public List<@Valid YayOrNay> getLikes() {
    return likes;
  }
  public void setLikes(List<@Valid YayOrNay> likes) {
    this.likes = likes;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("likeCount")
  public Long getLikeCount() {
    return likeCount;
  }
  public void setLikeCount(Long likeCount) {
    this.likeCount = likeCount;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("dislikeCount")
  public Long getDislikeCount() {
    return dislikeCount;
  }
  public void setDislikeCount(Long dislikeCount) {
    this.dislikeCount = dislikeCount;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("playCount")
  public Long getPlayCount() {
    return playCount;
  }
  public void setPlayCount(Long playCount) {
    this.playCount = playCount;
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
  @JsonProperty("gameObjectCount")
  public Integer getGameObjectCount() {
    return gameObjectCount;
  }
  public void setGameObjectCount(Integer gameObjectCount) {
    this.gameObjectCount = gameObjectCount;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("publicPermissions")
  @Valid
  public Permissions getPublicPermissions() {
    return publicPermissions;
  }
  public void setPublicPermissions(Permissions publicPermissions) {
    this.publicPermissions = publicPermissions;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("visibility")
  public VisibilityEnum getVisibility() {
    return visibility;
  }
  public void setVisibility(VisibilityEnum visibility) {
    this.visibility = visibility;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("userPermissions")
  @Valid
  public List<@Valid UserPermissions> getUserPermissions() {
    return userPermissions;
  }
  public void setUserPermissions(List<@Valid UserPermissions> userPermissions) {
    this.userPermissions = userPermissions;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("flags")
  @Valid
  public List<@Valid Flag> getFlags() {
    return flags;
  }
  public void setFlags(List<@Valid Flag> flags) {
    this.flags = flags;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("flagCount")
  public Long getFlagCount() {
    return flagCount;
  }
  public void setFlagCount(Long flagCount) {
    this.flagCount = flagCount;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("flagThreshold")
  @Valid
  public FlagThreshold getFlagThreshold() {
    return flagThreshold;
  }
  public void setFlagThreshold(FlagThreshold flagThreshold) {
    this.flagThreshold = flagThreshold;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("application")
  @Valid
  public Application getApplication() {
    return application;
  }
  public void setApplication(Application application) {
    this.application = application;
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
  public Tutorial getTutorial() {
    return tutorial;
  }
  public void setTutorial(Tutorial tutorial) {
    this.tutorial = tutorial;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("approvalStatus")
  public ApprovalStatusEnum getApprovalStatus() {
    return approvalStatus;
  }
  public void setApprovalStatus(ApprovalStatusEnum approvalStatus) {
    this.approvalStatus = approvalStatus;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("nextLevel")
  @Valid
  public GameLevel getNextLevel() {
    return nextLevel;
  }
  public void setNextLevel(GameLevel nextLevel) {
    this.nextLevel = nextLevel;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("offer")
  @Valid
  public Offer getOffer() {
    return offer;
  }
  public void setOffer(Offer offer) {
    this.offer = offer;
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
  @JsonProperty("levelNumber")
  public Integer getLevelNumber() {
    return levelNumber;
  }
  public void setLevelNumber(Integer levelNumber) {
    this.levelNumber = levelNumber;
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
  @JsonProperty("applicationTitle")
  public String getApplicationTitle() {
    return applicationTitle;
  }
  public void setApplicationTitle(String applicationTitle) {
    this.applicationTitle = applicationTitle;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("ownerUsername")
  public String getOwnerUsername() {
    return ownerUsername;
  }
  public void setOwnerUsername(String ownerUsername) {
    this.ownerUsername = ownerUsername;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("likableNotificationModels")
  @Valid
  public List<Map<String, Object>> getLikableNotificationModels() {
    return likableNotificationModels;
  }
  public void setLikableNotificationModels(List<Map<String, Object>> likableNotificationModels) {
    this.likableNotificationModels = likableNotificationModels;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("notableNotificationModels")
  @Valid
  public List<Map<String, Object>> getNotableNotificationModels() {
    return notableNotificationModels;
  }
  public void setNotableNotificationModels(List<Map<String, Object>> notableNotificationModels) {
    this.notableNotificationModels = notableNotificationModels;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("published")
  public Boolean getPublished() {
    return published;
  }
  public void setPublished(Boolean published) {
    this.published = published;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("contentName")
  public String getContentName() {
    return contentName;
  }
  public void setContentName(String contentName) {
    this.contentName = contentName;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("defaultThreshold")
  public Long getDefaultThreshold() {
    return defaultThreshold;
  }
  public void setDefaultThreshold(Long defaultThreshold) {
    this.defaultThreshold = defaultThreshold;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("contentAsset")
  @Valid
  public Asset getContentAsset() {
    return contentAsset;
  }
  public void setContentAsset(Asset contentAsset) {
    this.contentAsset = contentAsset;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("contentType")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


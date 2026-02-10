package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.model.Account;
import org.openapitools.model.Application;
import org.openapitools.model.Asset;
import org.openapitools.model.GameLevel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Pack  {
  
  @ApiModelProperty(value = "")

  private Long id;

  @ApiModelProperty(value = "")

  private Boolean active;

  @ApiModelProperty(value = "")

  private Boolean valid;

  @ApiModelProperty(value = "")

  private Long newOwnerId;

  @ApiModelProperty(value = "")

  @Valid

  private Account owner;

  @ApiModelProperty(value = "")

  @Valid

  private Application application;

public enum SequenceTypeEnum {

FIRST_AVAILABLE(String.valueOf("FIRST_AVAILABLE")), ALL_AVAILABLE(String.valueOf("ALL_AVAILABLE"));


    private String value;

    SequenceTypeEnum (String v) {
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
    public static SequenceTypeEnum fromValue(String value) {
        for (SequenceTypeEnum b : SequenceTypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(value = "")

  private SequenceTypeEnum sequenceType;

  @ApiModelProperty(value = "")

  private String title;

  @ApiModelProperty(value = "")

  private String description;

  @ApiModelProperty(value = "")

  private Date startDate;

  @ApiModelProperty(value = "")

  private Date endDate;

public enum PackTypeEnum {

TUTORIAL(String.valueOf("TUTORIAL")), BUILTIN(String.valueOf("BUILTIN")), DOWNLOAD(String.valueOf("DOWNLOAD")), THRESHOLD(String.valueOf("THRESHOLD")), THEME(String.valueOf("THEME")), TOURNAMENT(String.valueOf("TOURNAMENT"));


    private String value;

    PackTypeEnum (String v) {
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
    public static PackTypeEnum fromValue(String value) {
        for (PackTypeEnum b : PackTypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(value = "")

  private PackTypeEnum packType;

  @ApiModelProperty(value = "")

  @Valid

  private Asset image;

  @ApiModelProperty(value = "")

  @Valid

  private Asset background;

  @ApiModelProperty(value = "")

  private String imageURL;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid GameLevel> gameLevels = new ArrayList<>();

  @ApiModelProperty(value = "")

  private Boolean hasMoreItems;

  @ApiModelProperty(value = "")

  private Long totalCount;

  @ApiModelProperty(value = "")

  private Boolean downloaded;

  @ApiModelProperty(value = "")

  private String authorOverride;

  @ApiModelProperty(value = "")

  private Long packOrder;

  @ApiModelProperty(value = "")

  private Boolean inGame;

  @ApiModelProperty(value = "")

  private Boolean highest;

  @ApiModelProperty(value = "")

  private Integer notificationCount;

  @ApiModelProperty(value = "")

  private Long points;

  @ApiModelProperty(value = "")

  private String ticketType;

  @ApiModelProperty(value = "")

  private Long ticketCount;

  @ApiModelProperty(value = "")

  private String priceType;

  @ApiModelProperty(value = "")

  private Integer price;

  @ApiModelProperty(value = "")

  private Boolean allocateTickets;

  @ApiModelProperty(value = "")

  private String applicationTitle;

  @ApiModelProperty(value = "")

  @Valid

  private Map<String, GameLevel> levelNumberMap = new HashMap<>();
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

  public Pack id(Long id) {
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

  public Pack active(Boolean active) {
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

  public Pack valid(Boolean valid) {
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

  public Pack newOwnerId(Long newOwnerId) {
    this.newOwnerId = newOwnerId;
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

  public Pack owner(Account owner) {
    this.owner = owner;
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

  public Pack application(Application application) {
    this.application = application;
    return this;
  }

 /**
   * Get sequenceType
   * @return sequenceType
  **/
  @JsonProperty("sequenceType")
  public String getSequenceType() {
    if (sequenceType == null) {
      return null;
    }
    return sequenceType.value();
  }

  public void setSequenceType(SequenceTypeEnum sequenceType) {
    this.sequenceType = sequenceType;
  }

  public Pack sequenceType(SequenceTypeEnum sequenceType) {
    this.sequenceType = sequenceType;
    return this;
  }

 /**
   * Get title
   * @return title
  **/
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Pack title(String title) {
    this.title = title;
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

  public Pack description(String description) {
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

  public Pack startDate(Date startDate) {
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

  public Pack endDate(Date endDate) {
    this.endDate = endDate;
    return this;
  }

 /**
   * Get packType
   * @return packType
  **/
  @JsonProperty("packType")
  public String getPackType() {
    if (packType == null) {
      return null;
    }
    return packType.value();
  }

  public void setPackType(PackTypeEnum packType) {
    this.packType = packType;
  }

  public Pack packType(PackTypeEnum packType) {
    this.packType = packType;
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

  public Pack image(Asset image) {
    this.image = image;
    return this;
  }

 /**
   * Get background
   * @return background
  **/
  @JsonProperty("background")
  public Asset getBackground() {
    return background;
  }

  public void setBackground(Asset background) {
    this.background = background;
  }

  public Pack background(Asset background) {
    this.background = background;
    return this;
  }

 /**
   * Get imageURL
   * @return imageURL
  **/
  @JsonProperty("imageURL")
  public String getImageURL() {
    return imageURL;
  }

  public void setImageURL(String imageURL) {
    this.imageURL = imageURL;
  }

  public Pack imageURL(String imageURL) {
    this.imageURL = imageURL;
    return this;
  }

 /**
   * Get gameLevels
   * @return gameLevels
  **/
  @JsonProperty("gameLevels")
  public List<@Valid GameLevel> getGameLevels() {
    return gameLevels;
  }

  public void setGameLevels(List<@Valid GameLevel> gameLevels) {
    this.gameLevels = gameLevels;
  }

  public Pack gameLevels(List<@Valid GameLevel> gameLevels) {
    this.gameLevels = gameLevels;
    return this;
  }

  public Pack addGameLevelsItem(GameLevel gameLevelsItem) {
    this.gameLevels.add(gameLevelsItem);
    return this;
  }

 /**
   * Get hasMoreItems
   * @return hasMoreItems
  **/
  @JsonProperty("hasMoreItems")
  public Boolean getHasMoreItems() {
    return hasMoreItems;
  }

  public void setHasMoreItems(Boolean hasMoreItems) {
    this.hasMoreItems = hasMoreItems;
  }

  public Pack hasMoreItems(Boolean hasMoreItems) {
    this.hasMoreItems = hasMoreItems;
    return this;
  }

 /**
   * Get totalCount
   * @return totalCount
  **/
  @JsonProperty("totalCount")
  public Long getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(Long totalCount) {
    this.totalCount = totalCount;
  }

  public Pack totalCount(Long totalCount) {
    this.totalCount = totalCount;
    return this;
  }

 /**
   * Get downloaded
   * @return downloaded
  **/
  @JsonProperty("downloaded")
  public Boolean getDownloaded() {
    return downloaded;
  }

  public void setDownloaded(Boolean downloaded) {
    this.downloaded = downloaded;
  }

  public Pack downloaded(Boolean downloaded) {
    this.downloaded = downloaded;
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

  public Pack authorOverride(String authorOverride) {
    this.authorOverride = authorOverride;
    return this;
  }

 /**
   * Get packOrder
   * @return packOrder
  **/
  @JsonProperty("packOrder")
  public Long getPackOrder() {
    return packOrder;
  }

  public void setPackOrder(Long packOrder) {
    this.packOrder = packOrder;
  }

  public Pack packOrder(Long packOrder) {
    this.packOrder = packOrder;
    return this;
  }

 /**
   * Get inGame
   * @return inGame
  **/
  @JsonProperty("inGame")
  public Boolean getInGame() {
    return inGame;
  }

  public void setInGame(Boolean inGame) {
    this.inGame = inGame;
  }

  public Pack inGame(Boolean inGame) {
    this.inGame = inGame;
    return this;
  }

 /**
   * Get highest
   * @return highest
  **/
  @JsonProperty("highest")
  public Boolean getHighest() {
    return highest;
  }

  public void setHighest(Boolean highest) {
    this.highest = highest;
  }

  public Pack highest(Boolean highest) {
    this.highest = highest;
    return this;
  }

 /**
   * Get notificationCount
   * @return notificationCount
  **/
  @JsonProperty("notificationCount")
  public Integer getNotificationCount() {
    return notificationCount;
  }

  public void setNotificationCount(Integer notificationCount) {
    this.notificationCount = notificationCount;
  }

  public Pack notificationCount(Integer notificationCount) {
    this.notificationCount = notificationCount;
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

  public Pack points(Long points) {
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

  public Pack ticketType(String ticketType) {
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

  public Pack ticketCount(Long ticketCount) {
    this.ticketCount = ticketCount;
    return this;
  }

 /**
   * Get priceType
   * @return priceType
  **/
  @JsonProperty("priceType")
  public String getPriceType() {
    return priceType;
  }

  public void setPriceType(String priceType) {
    this.priceType = priceType;
  }

  public Pack priceType(String priceType) {
    this.priceType = priceType;
    return this;
  }

 /**
   * Get price
   * @return price
  **/
  @JsonProperty("price")
  public Integer getPrice() {
    return price;
  }

  public void setPrice(Integer price) {
    this.price = price;
  }

  public Pack price(Integer price) {
    this.price = price;
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

  public Pack allocateTickets(Boolean allocateTickets) {
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

  public Pack applicationTitle(String applicationTitle) {
    this.applicationTitle = applicationTitle;
    return this;
  }

 /**
   * Get levelNumberMap
   * @return levelNumberMap
  **/
  @JsonProperty("levelNumberMap")
  public Map<String, GameLevel> getLevelNumberMap() {
    return levelNumberMap;
  }

  public void setLevelNumberMap(Map<String, GameLevel> levelNumberMap) {
    this.levelNumberMap = levelNumberMap;
  }

  public Pack levelNumberMap(Map<String, GameLevel> levelNumberMap) {
    this.levelNumberMap = levelNumberMap;
    return this;
  }

  public Pack putLevelNumberMapItem(String key, GameLevel levelNumberMapItem) {
    this.levelNumberMap.put(key, levelNumberMapItem);
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
    Pack pack = (Pack) o;
    return Objects.equals(this.id, pack.id) &&
        Objects.equals(this.active, pack.active) &&
        Objects.equals(this.valid, pack.valid) &&
        Objects.equals(this.newOwnerId, pack.newOwnerId) &&
        Objects.equals(this.owner, pack.owner) &&
        Objects.equals(this.application, pack.application) &&
        Objects.equals(this.sequenceType, pack.sequenceType) &&
        Objects.equals(this.title, pack.title) &&
        Objects.equals(this.description, pack.description) &&
        Objects.equals(this.startDate, pack.startDate) &&
        Objects.equals(this.endDate, pack.endDate) &&
        Objects.equals(this.packType, pack.packType) &&
        Objects.equals(this.image, pack.image) &&
        Objects.equals(this.background, pack.background) &&
        Objects.equals(this.imageURL, pack.imageURL) &&
        Objects.equals(this.gameLevels, pack.gameLevels) &&
        Objects.equals(this.hasMoreItems, pack.hasMoreItems) &&
        Objects.equals(this.totalCount, pack.totalCount) &&
        Objects.equals(this.downloaded, pack.downloaded) &&
        Objects.equals(this.authorOverride, pack.authorOverride) &&
        Objects.equals(this.packOrder, pack.packOrder) &&
        Objects.equals(this.inGame, pack.inGame) &&
        Objects.equals(this.highest, pack.highest) &&
        Objects.equals(this.notificationCount, pack.notificationCount) &&
        Objects.equals(this.points, pack.points) &&
        Objects.equals(this.ticketType, pack.ticketType) &&
        Objects.equals(this.ticketCount, pack.ticketCount) &&
        Objects.equals(this.priceType, pack.priceType) &&
        Objects.equals(this.price, pack.price) &&
        Objects.equals(this.allocateTickets, pack.allocateTickets) &&
        Objects.equals(this.applicationTitle, pack.applicationTitle) &&
        Objects.equals(this.levelNumberMap, pack.levelNumberMap);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, active, valid, newOwnerId, owner, application, sequenceType, title, description, startDate, endDate, packType, image, background, imageURL, gameLevels, hasMoreItems, totalCount, downloaded, authorOverride, packOrder, inGame, highest, notificationCount, points, ticketType, ticketCount, priceType, price, allocateTickets, applicationTitle, levelNumberMap);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Pack {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    newOwnerId: ").append(toIndentedString(newOwnerId)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
    sb.append("    sequenceType: ").append(toIndentedString(sequenceType)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    packType: ").append(toIndentedString(packType)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    background: ").append(toIndentedString(background)).append("\n");
    sb.append("    imageURL: ").append(toIndentedString(imageURL)).append("\n");
    sb.append("    gameLevels: ").append(toIndentedString(gameLevels)).append("\n");
    sb.append("    hasMoreItems: ").append(toIndentedString(hasMoreItems)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    downloaded: ").append(toIndentedString(downloaded)).append("\n");
    sb.append("    authorOverride: ").append(toIndentedString(authorOverride)).append("\n");
    sb.append("    packOrder: ").append(toIndentedString(packOrder)).append("\n");
    sb.append("    inGame: ").append(toIndentedString(inGame)).append("\n");
    sb.append("    highest: ").append(toIndentedString(highest)).append("\n");
    sb.append("    notificationCount: ").append(toIndentedString(notificationCount)).append("\n");
    sb.append("    points: ").append(toIndentedString(points)).append("\n");
    sb.append("    ticketType: ").append(toIndentedString(ticketType)).append("\n");
    sb.append("    ticketCount: ").append(toIndentedString(ticketCount)).append("\n");
    sb.append("    priceType: ").append(toIndentedString(priceType)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    allocateTickets: ").append(toIndentedString(allocateTickets)).append("\n");
    sb.append("    applicationTitle: ").append(toIndentedString(applicationTitle)).append("\n");
    sb.append("    levelNumberMap: ").append(toIndentedString(levelNumberMap)).append("\n");
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


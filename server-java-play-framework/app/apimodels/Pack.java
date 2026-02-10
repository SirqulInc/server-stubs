package apimodels;

import apimodels.Account;
import apimodels.Application;
import apimodels.Asset;
import apimodels.GameLevel;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Pack
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class Pack   {
  @JsonProperty("id")
  
  private Long id;

  @JsonProperty("active")
  
  private Boolean active;

  @JsonProperty("valid")
  
  private Boolean valid;

  @JsonProperty("newOwnerId")
  
  private Long newOwnerId;

  @JsonProperty("owner")
  @Valid

  private Account owner;

  @JsonProperty("application")
  @Valid

  private Application application;

  /**
   * Gets or Sets sequenceType
   */
  public enum SequenceTypeEnum {
    FIRST_AVAILABLE("FIRST_AVAILABLE"),
    
    ALL_AVAILABLE("ALL_AVAILABLE");

    private final String value;

    SequenceTypeEnum(String value) {
      this.value = value;
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

  @JsonProperty("sequenceType")
  
  private SequenceTypeEnum sequenceType;

  @JsonProperty("title")
  
  private String title;

  @JsonProperty("description")
  
  private String description;

  @JsonProperty("startDate")
  @Valid

  private OffsetDateTime startDate;

  @JsonProperty("endDate")
  @Valid

  private OffsetDateTime endDate;

  /**
   * Gets or Sets packType
   */
  public enum PackTypeEnum {
    TUTORIAL("TUTORIAL"),
    
    BUILTIN("BUILTIN"),
    
    DOWNLOAD("DOWNLOAD"),
    
    THRESHOLD("THRESHOLD"),
    
    THEME("THEME"),
    
    TOURNAMENT("TOURNAMENT");

    private final String value;

    PackTypeEnum(String value) {
      this.value = value;
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

  @JsonProperty("packType")
  
  private PackTypeEnum packType;

  @JsonProperty("image")
  @Valid

  private Asset image;

  @JsonProperty("background")
  @Valid

  private Asset background;

  @JsonProperty("imageURL")
  
  private String imageURL;

  @JsonProperty("gameLevels")
  @Valid

  private List<@Valid GameLevel> gameLevels = null;

  @JsonProperty("hasMoreItems")
  
  private Boolean hasMoreItems;

  @JsonProperty("totalCount")
  
  private Long totalCount;

  @JsonProperty("downloaded")
  
  private Boolean downloaded;

  @JsonProperty("authorOverride")
  
  private String authorOverride;

  @JsonProperty("packOrder")
  
  private Long packOrder;

  @JsonProperty("inGame")
  
  private Boolean inGame;

  @JsonProperty("highest")
  
  private Boolean highest;

  @JsonProperty("notificationCount")
  
  private Integer notificationCount;

  @JsonProperty("points")
  
  private Long points;

  @JsonProperty("ticketType")
  
  private String ticketType;

  @JsonProperty("ticketCount")
  
  private Long ticketCount;

  @JsonProperty("priceType")
  
  private String priceType;

  @JsonProperty("price")
  
  private Integer price;

  @JsonProperty("allocateTickets")
  
  private Boolean allocateTickets;

  @JsonProperty("applicationTitle")
  
  private String applicationTitle;

  @JsonProperty("levelNumberMap")
  @Valid

  private Map<String, GameLevel> levelNumberMap = null;

  public Pack id(Long id) {
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

  public Pack active(Boolean active) {
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

  public Pack valid(Boolean valid) {
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

  public Pack newOwnerId(Long newOwnerId) {
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

  public Pack owner(Account owner) {
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

  public Pack application(Application application) {
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

  public Pack sequenceType(SequenceTypeEnum sequenceType) {
    this.sequenceType = sequenceType;
    return this;
  }

   /**
   * Get sequenceType
   * @return sequenceType
  **/
  public SequenceTypeEnum getSequenceType() {
    return sequenceType;
  }

  public void setSequenceType(SequenceTypeEnum sequenceType) {
    this.sequenceType = sequenceType;
  }

  public Pack title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Pack description(String description) {
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

  public Pack startDate(OffsetDateTime startDate) {
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

  public Pack endDate(OffsetDateTime endDate) {
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

  public Pack packType(PackTypeEnum packType) {
    this.packType = packType;
    return this;
  }

   /**
   * Get packType
   * @return packType
  **/
  public PackTypeEnum getPackType() {
    return packType;
  }

  public void setPackType(PackTypeEnum packType) {
    this.packType = packType;
  }

  public Pack image(Asset image) {
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

  public Pack background(Asset background) {
    this.background = background;
    return this;
  }

   /**
   * Get background
   * @return background
  **/
  public Asset getBackground() {
    return background;
  }

  public void setBackground(Asset background) {
    this.background = background;
  }

  public Pack imageURL(String imageURL) {
    this.imageURL = imageURL;
    return this;
  }

   /**
   * Get imageURL
   * @return imageURL
  **/
  public String getImageURL() {
    return imageURL;
  }

  public void setImageURL(String imageURL) {
    this.imageURL = imageURL;
  }

  public Pack gameLevels(List<@Valid GameLevel> gameLevels) {
    this.gameLevels = gameLevels;
    return this;
  }

  public Pack addGameLevelsItem(GameLevel gameLevelsItem) {
    if (this.gameLevels == null) {
      this.gameLevels = new ArrayList<>();
    }
    this.gameLevels.add(gameLevelsItem);
    return this;
  }

   /**
   * Get gameLevels
   * @return gameLevels
  **/
  public List<@Valid GameLevel> getGameLevels() {
    return gameLevels;
  }

  public void setGameLevels(List<@Valid GameLevel> gameLevels) {
    this.gameLevels = gameLevels;
  }

  public Pack hasMoreItems(Boolean hasMoreItems) {
    this.hasMoreItems = hasMoreItems;
    return this;
  }

   /**
   * Get hasMoreItems
   * @return hasMoreItems
  **/
  public Boolean getHasMoreItems() {
    return hasMoreItems;
  }

  public void setHasMoreItems(Boolean hasMoreItems) {
    this.hasMoreItems = hasMoreItems;
  }

  public Pack totalCount(Long totalCount) {
    this.totalCount = totalCount;
    return this;
  }

   /**
   * Get totalCount
   * @return totalCount
  **/
  public Long getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(Long totalCount) {
    this.totalCount = totalCount;
  }

  public Pack downloaded(Boolean downloaded) {
    this.downloaded = downloaded;
    return this;
  }

   /**
   * Get downloaded
   * @return downloaded
  **/
  public Boolean getDownloaded() {
    return downloaded;
  }

  public void setDownloaded(Boolean downloaded) {
    this.downloaded = downloaded;
  }

  public Pack authorOverride(String authorOverride) {
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

  public Pack packOrder(Long packOrder) {
    this.packOrder = packOrder;
    return this;
  }

   /**
   * Get packOrder
   * @return packOrder
  **/
  public Long getPackOrder() {
    return packOrder;
  }

  public void setPackOrder(Long packOrder) {
    this.packOrder = packOrder;
  }

  public Pack inGame(Boolean inGame) {
    this.inGame = inGame;
    return this;
  }

   /**
   * Get inGame
   * @return inGame
  **/
  public Boolean getInGame() {
    return inGame;
  }

  public void setInGame(Boolean inGame) {
    this.inGame = inGame;
  }

  public Pack highest(Boolean highest) {
    this.highest = highest;
    return this;
  }

   /**
   * Get highest
   * @return highest
  **/
  public Boolean getHighest() {
    return highest;
  }

  public void setHighest(Boolean highest) {
    this.highest = highest;
  }

  public Pack notificationCount(Integer notificationCount) {
    this.notificationCount = notificationCount;
    return this;
  }

   /**
   * Get notificationCount
   * @return notificationCount
  **/
  public Integer getNotificationCount() {
    return notificationCount;
  }

  public void setNotificationCount(Integer notificationCount) {
    this.notificationCount = notificationCount;
  }

  public Pack points(Long points) {
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

  public Pack ticketType(String ticketType) {
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

  public Pack ticketCount(Long ticketCount) {
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

  public Pack priceType(String priceType) {
    this.priceType = priceType;
    return this;
  }

   /**
   * Get priceType
   * @return priceType
  **/
  public String getPriceType() {
    return priceType;
  }

  public void setPriceType(String priceType) {
    this.priceType = priceType;
  }

  public Pack price(Integer price) {
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  public Integer getPrice() {
    return price;
  }

  public void setPrice(Integer price) {
    this.price = price;
  }

  public Pack allocateTickets(Boolean allocateTickets) {
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

  public Pack applicationTitle(String applicationTitle) {
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

  public Pack levelNumberMap(Map<String, GameLevel> levelNumberMap) {
    this.levelNumberMap = levelNumberMap;
    return this;
  }

  public Pack putLevelNumberMapItem(String key, GameLevel levelNumberMapItem) {
    if (this.levelNumberMap == null) {
      this.levelNumberMap = new HashMap<>();
    }
    this.levelNumberMap.put(key, levelNumberMapItem);
    return this;
  }

   /**
   * Get levelNumberMap
   * @return levelNumberMap
  **/
  public Map<String, GameLevel> getLevelNumberMap() {
    return levelNumberMap;
  }

  public void setLevelNumberMap(Map<String, GameLevel> levelNumberMap) {
    this.levelNumberMap = levelNumberMap;
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
    return Objects.equals(id, pack.id) &&
        Objects.equals(active, pack.active) &&
        Objects.equals(valid, pack.valid) &&
        Objects.equals(newOwnerId, pack.newOwnerId) &&
        Objects.equals(owner, pack.owner) &&
        Objects.equals(application, pack.application) &&
        Objects.equals(sequenceType, pack.sequenceType) &&
        Objects.equals(title, pack.title) &&
        Objects.equals(description, pack.description) &&
        Objects.equals(startDate, pack.startDate) &&
        Objects.equals(endDate, pack.endDate) &&
        Objects.equals(packType, pack.packType) &&
        Objects.equals(image, pack.image) &&
        Objects.equals(background, pack.background) &&
        Objects.equals(imageURL, pack.imageURL) &&
        Objects.equals(gameLevels, pack.gameLevels) &&
        Objects.equals(hasMoreItems, pack.hasMoreItems) &&
        Objects.equals(totalCount, pack.totalCount) &&
        Objects.equals(downloaded, pack.downloaded) &&
        Objects.equals(authorOverride, pack.authorOverride) &&
        Objects.equals(packOrder, pack.packOrder) &&
        Objects.equals(inGame, pack.inGame) &&
        Objects.equals(highest, pack.highest) &&
        Objects.equals(notificationCount, pack.notificationCount) &&
        Objects.equals(points, pack.points) &&
        Objects.equals(ticketType, pack.ticketType) &&
        Objects.equals(ticketCount, pack.ticketCount) &&
        Objects.equals(priceType, pack.priceType) &&
        Objects.equals(price, pack.price) &&
        Objects.equals(allocateTickets, pack.allocateTickets) &&
        Objects.equals(applicationTitle, pack.applicationTitle) &&
        Objects.equals(levelNumberMap, pack.levelNumberMap);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, active, valid, newOwnerId, owner, application, sequenceType, title, description, startDate, endDate, packType, image, background, imageURL, gameLevels, hasMoreItems, totalCount, downloaded, authorOverride, packOrder, inGame, highest, notificationCount, points, ticketType, ticketCount, priceType, price, allocateTickets, applicationTitle, levelNumberMap);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


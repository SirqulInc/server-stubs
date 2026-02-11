package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.model.Account;
import org.openapitools.model.Application;
import org.openapitools.model.Asset;
import org.openapitools.model.GameLevel;
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
 * Pack
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-11T19:32:41.765375324Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class Pack {

  private @Nullable Long id;

  private @Nullable Boolean active;

  private @Nullable Boolean valid;

  private @Nullable Long newOwnerId;

  private @Nullable Account owner;

  private @Nullable Application application;

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

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
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

  private @Nullable SequenceTypeEnum sequenceType;

  private @Nullable String title;

  private @Nullable String description;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime startDate;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime endDate;

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

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
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

  private @Nullable PackTypeEnum packType;

  private @Nullable Asset image;

  private @Nullable Asset background;

  private @Nullable String imageURL;

  @Valid
  private List<@Valid GameLevel> gameLevels = new ArrayList<>();

  private @Nullable Boolean hasMoreItems;

  private @Nullable Long totalCount;

  private @Nullable Boolean downloaded;

  private @Nullable String authorOverride;

  private @Nullable Long packOrder;

  private @Nullable Boolean inGame;

  private @Nullable Boolean highest;

  private @Nullable Integer notificationCount;

  private @Nullable Long points;

  private @Nullable String ticketType;

  private @Nullable Long ticketCount;

  private @Nullable String priceType;

  private @Nullable Integer price;

  private @Nullable Boolean allocateTickets;

  private @Nullable String applicationTitle;

  @Valid
  private Map<String, GameLevel> levelNumberMap = new HashMap<>();

  public Pack id(@Nullable Long id) {
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

  public Pack active(@Nullable Boolean active) {
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

  public Pack valid(@Nullable Boolean valid) {
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

  public Pack newOwnerId(@Nullable Long newOwnerId) {
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

  public Pack owner(@Nullable Account owner) {
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

  public Pack application(@Nullable Application application) {
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

  public Pack sequenceType(@Nullable SequenceTypeEnum sequenceType) {
    this.sequenceType = sequenceType;
    return this;
  }

  /**
   * Get sequenceType
   * @return sequenceType
   */
  
  @Schema(name = "sequenceType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sequenceType")
  public @Nullable SequenceTypeEnum getSequenceType() {
    return sequenceType;
  }

  public void setSequenceType(@Nullable SequenceTypeEnum sequenceType) {
    this.sequenceType = sequenceType;
  }

  public Pack title(@Nullable String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
   */
  
  @Schema(name = "title", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("title")
  public @Nullable String getTitle() {
    return title;
  }

  public void setTitle(@Nullable String title) {
    this.title = title;
  }

  public Pack description(@Nullable String description) {
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

  public Pack startDate(@Nullable OffsetDateTime startDate) {
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

  public Pack endDate(@Nullable OffsetDateTime endDate) {
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

  public Pack packType(@Nullable PackTypeEnum packType) {
    this.packType = packType;
    return this;
  }

  /**
   * Get packType
   * @return packType
   */
  
  @Schema(name = "packType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("packType")
  public @Nullable PackTypeEnum getPackType() {
    return packType;
  }

  public void setPackType(@Nullable PackTypeEnum packType) {
    this.packType = packType;
  }

  public Pack image(@Nullable Asset image) {
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

  public Pack background(@Nullable Asset background) {
    this.background = background;
    return this;
  }

  /**
   * Get background
   * @return background
   */
  @Valid 
  @Schema(name = "background", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("background")
  public @Nullable Asset getBackground() {
    return background;
  }

  public void setBackground(@Nullable Asset background) {
    this.background = background;
  }

  public Pack imageURL(@Nullable String imageURL) {
    this.imageURL = imageURL;
    return this;
  }

  /**
   * Get imageURL
   * @return imageURL
   */
  
  @Schema(name = "imageURL", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("imageURL")
  public @Nullable String getImageURL() {
    return imageURL;
  }

  public void setImageURL(@Nullable String imageURL) {
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
   */
  @Valid 
  @Schema(name = "gameLevels", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("gameLevels")
  public List<@Valid GameLevel> getGameLevels() {
    return gameLevels;
  }

  public void setGameLevels(List<@Valid GameLevel> gameLevels) {
    this.gameLevels = gameLevels;
  }

  public Pack hasMoreItems(@Nullable Boolean hasMoreItems) {
    this.hasMoreItems = hasMoreItems;
    return this;
  }

  /**
   * Get hasMoreItems
   * @return hasMoreItems
   */
  
  @Schema(name = "hasMoreItems", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hasMoreItems")
  public @Nullable Boolean getHasMoreItems() {
    return hasMoreItems;
  }

  public void setHasMoreItems(@Nullable Boolean hasMoreItems) {
    this.hasMoreItems = hasMoreItems;
  }

  public Pack totalCount(@Nullable Long totalCount) {
    this.totalCount = totalCount;
    return this;
  }

  /**
   * Get totalCount
   * @return totalCount
   */
  
  @Schema(name = "totalCount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("totalCount")
  public @Nullable Long getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(@Nullable Long totalCount) {
    this.totalCount = totalCount;
  }

  public Pack downloaded(@Nullable Boolean downloaded) {
    this.downloaded = downloaded;
    return this;
  }

  /**
   * Get downloaded
   * @return downloaded
   */
  
  @Schema(name = "downloaded", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("downloaded")
  public @Nullable Boolean getDownloaded() {
    return downloaded;
  }

  public void setDownloaded(@Nullable Boolean downloaded) {
    this.downloaded = downloaded;
  }

  public Pack authorOverride(@Nullable String authorOverride) {
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

  public Pack packOrder(@Nullable Long packOrder) {
    this.packOrder = packOrder;
    return this;
  }

  /**
   * Get packOrder
   * @return packOrder
   */
  
  @Schema(name = "packOrder", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("packOrder")
  public @Nullable Long getPackOrder() {
    return packOrder;
  }

  public void setPackOrder(@Nullable Long packOrder) {
    this.packOrder = packOrder;
  }

  public Pack inGame(@Nullable Boolean inGame) {
    this.inGame = inGame;
    return this;
  }

  /**
   * Get inGame
   * @return inGame
   */
  
  @Schema(name = "inGame", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("inGame")
  public @Nullable Boolean getInGame() {
    return inGame;
  }

  public void setInGame(@Nullable Boolean inGame) {
    this.inGame = inGame;
  }

  public Pack highest(@Nullable Boolean highest) {
    this.highest = highest;
    return this;
  }

  /**
   * Get highest
   * @return highest
   */
  
  @Schema(name = "highest", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("highest")
  public @Nullable Boolean getHighest() {
    return highest;
  }

  public void setHighest(@Nullable Boolean highest) {
    this.highest = highest;
  }

  public Pack notificationCount(@Nullable Integer notificationCount) {
    this.notificationCount = notificationCount;
    return this;
  }

  /**
   * Get notificationCount
   * @return notificationCount
   */
  
  @Schema(name = "notificationCount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("notificationCount")
  public @Nullable Integer getNotificationCount() {
    return notificationCount;
  }

  public void setNotificationCount(@Nullable Integer notificationCount) {
    this.notificationCount = notificationCount;
  }

  public Pack points(@Nullable Long points) {
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

  public Pack ticketType(@Nullable String ticketType) {
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

  public Pack ticketCount(@Nullable Long ticketCount) {
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

  public Pack priceType(@Nullable String priceType) {
    this.priceType = priceType;
    return this;
  }

  /**
   * Get priceType
   * @return priceType
   */
  
  @Schema(name = "priceType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("priceType")
  public @Nullable String getPriceType() {
    return priceType;
  }

  public void setPriceType(@Nullable String priceType) {
    this.priceType = priceType;
  }

  public Pack price(@Nullable Integer price) {
    this.price = price;
    return this;
  }

  /**
   * Get price
   * @return price
   */
  
  @Schema(name = "price", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("price")
  public @Nullable Integer getPrice() {
    return price;
  }

  public void setPrice(@Nullable Integer price) {
    this.price = price;
  }

  public Pack allocateTickets(@Nullable Boolean allocateTickets) {
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

  public Pack applicationTitle(@Nullable String applicationTitle) {
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
   */
  @Valid 
  @Schema(name = "levelNumberMap", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("levelNumberMap")
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
  private String toIndentedString(@Nullable Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


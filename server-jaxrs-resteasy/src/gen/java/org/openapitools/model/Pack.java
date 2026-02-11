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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.model.Account;
import org.openapitools.model.Application;
import org.openapitools.model.Asset;
import org.openapitools.model.GameLevel;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class Pack   {
  
  private Long id;
  private Boolean active;
  private Boolean valid;
  private Long newOwnerId;
  private Account owner;
  private Application application;

  /**
   * Gets or Sets sequenceType
   */
  public enum SequenceTypeEnum {
    FIRST_AVAILABLE("FIRST_AVAILABLE"),

        ALL_AVAILABLE("ALL_AVAILABLE");
    private String value;

    SequenceTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private SequenceTypeEnum sequenceType;
  private String title;
  private String description;
  private Date startDate;
  private Date endDate;

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
    private String value;

    PackTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private PackTypeEnum packType;
  private Asset image;
  private Asset background;
  private String imageURL;
  private List<@Valid GameLevel> gameLevels = new ArrayList<>();
  private Boolean hasMoreItems;
  private Long totalCount;
  private Boolean downloaded;
  private String authorOverride;
  private Long packOrder;
  private Boolean inGame;
  private Boolean highest;
  private Integer notificationCount;
  private Long points;
  private String ticketType;
  private Long ticketCount;
  private String priceType;
  private Integer price;
  private Boolean allocateTickets;
  private String applicationTitle;
  private Map<String, GameLevel> levelNumberMap = new HashMap<>();

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
  @JsonProperty("sequenceType")
  public SequenceTypeEnum getSequenceType() {
    return sequenceType;
  }
  public void setSequenceType(SequenceTypeEnum sequenceType) {
    this.sequenceType = sequenceType;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
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
  @JsonProperty("packType")
  public PackTypeEnum getPackType() {
    return packType;
  }
  public void setPackType(PackTypeEnum packType) {
    this.packType = packType;
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
  @JsonProperty("background")
  @Valid
  public Asset getBackground() {
    return background;
  }
  public void setBackground(Asset background) {
    this.background = background;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("imageURL")
  public String getImageURL() {
    return imageURL;
  }
  public void setImageURL(String imageURL) {
    this.imageURL = imageURL;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("gameLevels")
  @Valid
  public List<@Valid GameLevel> getGameLevels() {
    return gameLevels;
  }
  public void setGameLevels(List<@Valid GameLevel> gameLevels) {
    this.gameLevels = gameLevels;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("hasMoreItems")
  public Boolean getHasMoreItems() {
    return hasMoreItems;
  }
  public void setHasMoreItems(Boolean hasMoreItems) {
    this.hasMoreItems = hasMoreItems;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("totalCount")
  public Long getTotalCount() {
    return totalCount;
  }
  public void setTotalCount(Long totalCount) {
    this.totalCount = totalCount;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("downloaded")
  public Boolean getDownloaded() {
    return downloaded;
  }
  public void setDownloaded(Boolean downloaded) {
    this.downloaded = downloaded;
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
  @JsonProperty("packOrder")
  public Long getPackOrder() {
    return packOrder;
  }
  public void setPackOrder(Long packOrder) {
    this.packOrder = packOrder;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("inGame")
  public Boolean getInGame() {
    return inGame;
  }
  public void setInGame(Boolean inGame) {
    this.inGame = inGame;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("highest")
  public Boolean getHighest() {
    return highest;
  }
  public void setHighest(Boolean highest) {
    this.highest = highest;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("notificationCount")
  public Integer getNotificationCount() {
    return notificationCount;
  }
  public void setNotificationCount(Integer notificationCount) {
    this.notificationCount = notificationCount;
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
  @JsonProperty("priceType")
  public String getPriceType() {
    return priceType;
  }
  public void setPriceType(String priceType) {
    this.priceType = priceType;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("price")
  public Integer getPrice() {
    return price;
  }
  public void setPrice(Integer price) {
    this.price = price;
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
  @JsonProperty("levelNumberMap")
  @Valid
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


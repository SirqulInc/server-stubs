package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AccountShortResponse;
import org.openapitools.model.ApplicationShortResponse;
import org.openapitools.model.AssetShortResponse;
import org.openapitools.model.GameLevelListResponse;
import org.openapitools.model.NameStringValueResponse;
import org.openapitools.model.ScoreListResponse;
import org.openapitools.model.TicketListResponse;
import org.openapitools.model.UserPermissionsListResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PackResponse  {
  
public enum ActionEnum {

DATA(String.valueOf("DATA")), SAVE(String.valueOf("SAVE")), DELETE(String.valueOf("DELETE")), GET(String.valueOf("GET"));


    private String value;

    ActionEnum (String v) {
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
    public static ActionEnum fromValue(String value) {
        for (ActionEnum b : ActionEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(value = "")

  private ActionEnum action;

  @ApiModelProperty(value = "")

  private String highestAppVersion;

  @ApiModelProperty(value = "")

  private String gameType;

  @ApiModelProperty(value = "")

  private Long packId;

  @ApiModelProperty(value = "")

  private String name;

  @ApiModelProperty(value = "")

  private String description;

  @ApiModelProperty(value = "")

  private Boolean active;

  @ApiModelProperty(value = "")

  private Boolean downloaded;

  @ApiModelProperty(value = "")

  private Boolean completed;

  @ApiModelProperty(value = "")

  @Valid

  private AssetShortResponse icon;

  @ApiModelProperty(value = "")

  @Valid

  private AssetShortResponse background;

  @ApiModelProperty(value = "")

  private Long ticketsEarned;

  @ApiModelProperty(value = "")

  @Valid

  private GameLevelListResponse levels;

  @ApiModelProperty(value = "")

  private String sequenceType;

  @ApiModelProperty(value = "")

  @Valid

  private ScoreListResponse scores;

  @ApiModelProperty(value = "")

  @Valid

  private AccountShortResponse owner;

  @ApiModelProperty(value = "")

  private Long costToRedeem;

  @ApiModelProperty(value = "")

  private Long price;

  @ApiModelProperty(value = "")

  private String priceType;

  @ApiModelProperty(value = "")

  @Valid

  private UserPermissionsListResponse userPermissionsList;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid NameStringValueResponse> results = new ArrayList<>();

  @ApiModelProperty(value = "")

  @Valid

  private TicketListResponse tickets;

  @ApiModelProperty(value = "")

  private String authorOverride;

  @ApiModelProperty(value = "")

  private Long updatedDate;

  @ApiModelProperty(value = "")

  private Long startDate;

  @ApiModelProperty(value = "")

  private Long endDate;

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

  private Long packOrder;

  @ApiModelProperty(value = "")

  private String appKey;

  @ApiModelProperty(value = "")

  @Valid

  private ApplicationShortResponse application;

  @ApiModelProperty(value = "")

  private Boolean inGame;

  @ApiModelProperty(value = "")

  private Boolean highest;

  @ApiModelProperty(value = "")

  private Boolean allocateTickets;

  @ApiModelProperty(value = "")

  private String ticketType;

  @ApiModelProperty(value = "")

  private Long ticketCount;

  @ApiModelProperty(value = "")

  private Long points;
 /**
   * Get action
   * @return action
  **/
  @JsonProperty("action")
  public String getAction() {
    if (action == null) {
      return null;
    }
    return action.value();
  }

  public void setAction(ActionEnum action) {
    this.action = action;
  }

  public PackResponse action(ActionEnum action) {
    this.action = action;
    return this;
  }

 /**
   * Get highestAppVersion
   * @return highestAppVersion
  **/
  @JsonProperty("highestAppVersion")
  public String getHighestAppVersion() {
    return highestAppVersion;
  }

  public void setHighestAppVersion(String highestAppVersion) {
    this.highestAppVersion = highestAppVersion;
  }

  public PackResponse highestAppVersion(String highestAppVersion) {
    this.highestAppVersion = highestAppVersion;
    return this;
  }

 /**
   * Get gameType
   * @return gameType
  **/
  @JsonProperty("gameType")
  public String getGameType() {
    return gameType;
  }

  public void setGameType(String gameType) {
    this.gameType = gameType;
  }

  public PackResponse gameType(String gameType) {
    this.gameType = gameType;
    return this;
  }

 /**
   * Get packId
   * @return packId
  **/
  @JsonProperty("packId")
  public Long getPackId() {
    return packId;
  }

  public void setPackId(Long packId) {
    this.packId = packId;
  }

  public PackResponse packId(Long packId) {
    this.packId = packId;
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

  public PackResponse name(String name) {
    this.name = name;
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

  public PackResponse description(String description) {
    this.description = description;
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

  public PackResponse active(Boolean active) {
    this.active = active;
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

  public PackResponse downloaded(Boolean downloaded) {
    this.downloaded = downloaded;
    return this;
  }

 /**
   * Get completed
   * @return completed
  **/
  @JsonProperty("completed")
  public Boolean getCompleted() {
    return completed;
  }

  public void setCompleted(Boolean completed) {
    this.completed = completed;
  }

  public PackResponse completed(Boolean completed) {
    this.completed = completed;
    return this;
  }

 /**
   * Get icon
   * @return icon
  **/
  @JsonProperty("icon")
  public AssetShortResponse getIcon() {
    return icon;
  }

  public void setIcon(AssetShortResponse icon) {
    this.icon = icon;
  }

  public PackResponse icon(AssetShortResponse icon) {
    this.icon = icon;
    return this;
  }

 /**
   * Get background
   * @return background
  **/
  @JsonProperty("background")
  public AssetShortResponse getBackground() {
    return background;
  }

  public void setBackground(AssetShortResponse background) {
    this.background = background;
  }

  public PackResponse background(AssetShortResponse background) {
    this.background = background;
    return this;
  }

 /**
   * Get ticketsEarned
   * @return ticketsEarned
  **/
  @JsonProperty("ticketsEarned")
  public Long getTicketsEarned() {
    return ticketsEarned;
  }

  public void setTicketsEarned(Long ticketsEarned) {
    this.ticketsEarned = ticketsEarned;
  }

  public PackResponse ticketsEarned(Long ticketsEarned) {
    this.ticketsEarned = ticketsEarned;
    return this;
  }

 /**
   * Get levels
   * @return levels
  **/
  @JsonProperty("levels")
  public GameLevelListResponse getLevels() {
    return levels;
  }

  public void setLevels(GameLevelListResponse levels) {
    this.levels = levels;
  }

  public PackResponse levels(GameLevelListResponse levels) {
    this.levels = levels;
    return this;
  }

 /**
   * Get sequenceType
   * @return sequenceType
  **/
  @JsonProperty("sequenceType")
  public String getSequenceType() {
    return sequenceType;
  }

  public void setSequenceType(String sequenceType) {
    this.sequenceType = sequenceType;
  }

  public PackResponse sequenceType(String sequenceType) {
    this.sequenceType = sequenceType;
    return this;
  }

 /**
   * Get scores
   * @return scores
  **/
  @JsonProperty("scores")
  public ScoreListResponse getScores() {
    return scores;
  }

  public void setScores(ScoreListResponse scores) {
    this.scores = scores;
  }

  public PackResponse scores(ScoreListResponse scores) {
    this.scores = scores;
    return this;
  }

 /**
   * Get owner
   * @return owner
  **/
  @JsonProperty("owner")
  public AccountShortResponse getOwner() {
    return owner;
  }

  public void setOwner(AccountShortResponse owner) {
    this.owner = owner;
  }

  public PackResponse owner(AccountShortResponse owner) {
    this.owner = owner;
    return this;
  }

 /**
   * Get costToRedeem
   * @return costToRedeem
  **/
  @JsonProperty("costToRedeem")
  public Long getCostToRedeem() {
    return costToRedeem;
  }

  public void setCostToRedeem(Long costToRedeem) {
    this.costToRedeem = costToRedeem;
  }

  public PackResponse costToRedeem(Long costToRedeem) {
    this.costToRedeem = costToRedeem;
    return this;
  }

 /**
   * Get price
   * @return price
  **/
  @JsonProperty("price")
  public Long getPrice() {
    return price;
  }

  public void setPrice(Long price) {
    this.price = price;
  }

  public PackResponse price(Long price) {
    this.price = price;
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

  public PackResponse priceType(String priceType) {
    this.priceType = priceType;
    return this;
  }

 /**
   * Get userPermissionsList
   * @return userPermissionsList
  **/
  @JsonProperty("userPermissionsList")
  public UserPermissionsListResponse getUserPermissionsList() {
    return userPermissionsList;
  }

  public void setUserPermissionsList(UserPermissionsListResponse userPermissionsList) {
    this.userPermissionsList = userPermissionsList;
  }

  public PackResponse userPermissionsList(UserPermissionsListResponse userPermissionsList) {
    this.userPermissionsList = userPermissionsList;
    return this;
  }

 /**
   * Get results
   * @return results
  **/
  @JsonProperty("results")
  public List<@Valid NameStringValueResponse> getResults() {
    return results;
  }

  public void setResults(List<@Valid NameStringValueResponse> results) {
    this.results = results;
  }

  public PackResponse results(List<@Valid NameStringValueResponse> results) {
    this.results = results;
    return this;
  }

  public PackResponse addResultsItem(NameStringValueResponse resultsItem) {
    this.results.add(resultsItem);
    return this;
  }

 /**
   * Get tickets
   * @return tickets
  **/
  @JsonProperty("tickets")
  public TicketListResponse getTickets() {
    return tickets;
  }

  public void setTickets(TicketListResponse tickets) {
    this.tickets = tickets;
  }

  public PackResponse tickets(TicketListResponse tickets) {
    this.tickets = tickets;
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

  public PackResponse authorOverride(String authorOverride) {
    this.authorOverride = authorOverride;
    return this;
  }

 /**
   * Get updatedDate
   * @return updatedDate
  **/
  @JsonProperty("updatedDate")
  public Long getUpdatedDate() {
    return updatedDate;
  }

  public void setUpdatedDate(Long updatedDate) {
    this.updatedDate = updatedDate;
  }

  public PackResponse updatedDate(Long updatedDate) {
    this.updatedDate = updatedDate;
    return this;
  }

 /**
   * Get startDate
   * @return startDate
  **/
  @JsonProperty("startDate")
  public Long getStartDate() {
    return startDate;
  }

  public void setStartDate(Long startDate) {
    this.startDate = startDate;
  }

  public PackResponse startDate(Long startDate) {
    this.startDate = startDate;
    return this;
  }

 /**
   * Get endDate
   * @return endDate
  **/
  @JsonProperty("endDate")
  public Long getEndDate() {
    return endDate;
  }

  public void setEndDate(Long endDate) {
    this.endDate = endDate;
  }

  public PackResponse endDate(Long endDate) {
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

  public PackResponse packType(PackTypeEnum packType) {
    this.packType = packType;
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

  public PackResponse packOrder(Long packOrder) {
    this.packOrder = packOrder;
    return this;
  }

 /**
   * Get appKey
   * @return appKey
  **/
  @JsonProperty("appKey")
  public String getAppKey() {
    return appKey;
  }

  public void setAppKey(String appKey) {
    this.appKey = appKey;
  }

  public PackResponse appKey(String appKey) {
    this.appKey = appKey;
    return this;
  }

 /**
   * Get application
   * @return application
  **/
  @JsonProperty("application")
  public ApplicationShortResponse getApplication() {
    return application;
  }

  public void setApplication(ApplicationShortResponse application) {
    this.application = application;
  }

  public PackResponse application(ApplicationShortResponse application) {
    this.application = application;
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

  public PackResponse inGame(Boolean inGame) {
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

  public PackResponse highest(Boolean highest) {
    this.highest = highest;
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

  public PackResponse allocateTickets(Boolean allocateTickets) {
    this.allocateTickets = allocateTickets;
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

  public PackResponse ticketType(String ticketType) {
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

  public PackResponse ticketCount(Long ticketCount) {
    this.ticketCount = ticketCount;
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

  public PackResponse points(Long points) {
    this.points = points;
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
    PackResponse packResponse = (PackResponse) o;
    return Objects.equals(this.action, packResponse.action) &&
        Objects.equals(this.highestAppVersion, packResponse.highestAppVersion) &&
        Objects.equals(this.gameType, packResponse.gameType) &&
        Objects.equals(this.packId, packResponse.packId) &&
        Objects.equals(this.name, packResponse.name) &&
        Objects.equals(this.description, packResponse.description) &&
        Objects.equals(this.active, packResponse.active) &&
        Objects.equals(this.downloaded, packResponse.downloaded) &&
        Objects.equals(this.completed, packResponse.completed) &&
        Objects.equals(this.icon, packResponse.icon) &&
        Objects.equals(this.background, packResponse.background) &&
        Objects.equals(this.ticketsEarned, packResponse.ticketsEarned) &&
        Objects.equals(this.levels, packResponse.levels) &&
        Objects.equals(this.sequenceType, packResponse.sequenceType) &&
        Objects.equals(this.scores, packResponse.scores) &&
        Objects.equals(this.owner, packResponse.owner) &&
        Objects.equals(this.costToRedeem, packResponse.costToRedeem) &&
        Objects.equals(this.price, packResponse.price) &&
        Objects.equals(this.priceType, packResponse.priceType) &&
        Objects.equals(this.userPermissionsList, packResponse.userPermissionsList) &&
        Objects.equals(this.results, packResponse.results) &&
        Objects.equals(this.tickets, packResponse.tickets) &&
        Objects.equals(this.authorOverride, packResponse.authorOverride) &&
        Objects.equals(this.updatedDate, packResponse.updatedDate) &&
        Objects.equals(this.startDate, packResponse.startDate) &&
        Objects.equals(this.endDate, packResponse.endDate) &&
        Objects.equals(this.packType, packResponse.packType) &&
        Objects.equals(this.packOrder, packResponse.packOrder) &&
        Objects.equals(this.appKey, packResponse.appKey) &&
        Objects.equals(this.application, packResponse.application) &&
        Objects.equals(this.inGame, packResponse.inGame) &&
        Objects.equals(this.highest, packResponse.highest) &&
        Objects.equals(this.allocateTickets, packResponse.allocateTickets) &&
        Objects.equals(this.ticketType, packResponse.ticketType) &&
        Objects.equals(this.ticketCount, packResponse.ticketCount) &&
        Objects.equals(this.points, packResponse.points);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, highestAppVersion, gameType, packId, name, description, active, downloaded, completed, icon, background, ticketsEarned, levels, sequenceType, scores, owner, costToRedeem, price, priceType, userPermissionsList, results, tickets, authorOverride, updatedDate, startDate, endDate, packType, packOrder, appKey, application, inGame, highest, allocateTickets, ticketType, ticketCount, points);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PackResponse {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    highestAppVersion: ").append(toIndentedString(highestAppVersion)).append("\n");
    sb.append("    gameType: ").append(toIndentedString(gameType)).append("\n");
    sb.append("    packId: ").append(toIndentedString(packId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    downloaded: ").append(toIndentedString(downloaded)).append("\n");
    sb.append("    completed: ").append(toIndentedString(completed)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    background: ").append(toIndentedString(background)).append("\n");
    sb.append("    ticketsEarned: ").append(toIndentedString(ticketsEarned)).append("\n");
    sb.append("    levels: ").append(toIndentedString(levels)).append("\n");
    sb.append("    sequenceType: ").append(toIndentedString(sequenceType)).append("\n");
    sb.append("    scores: ").append(toIndentedString(scores)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    costToRedeem: ").append(toIndentedString(costToRedeem)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    priceType: ").append(toIndentedString(priceType)).append("\n");
    sb.append("    userPermissionsList: ").append(toIndentedString(userPermissionsList)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
    sb.append("    tickets: ").append(toIndentedString(tickets)).append("\n");
    sb.append("    authorOverride: ").append(toIndentedString(authorOverride)).append("\n");
    sb.append("    updatedDate: ").append(toIndentedString(updatedDate)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    packType: ").append(toIndentedString(packType)).append("\n");
    sb.append("    packOrder: ").append(toIndentedString(packOrder)).append("\n");
    sb.append("    appKey: ").append(toIndentedString(appKey)).append("\n");
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
    sb.append("    inGame: ").append(toIndentedString(inGame)).append("\n");
    sb.append("    highest: ").append(toIndentedString(highest)).append("\n");
    sb.append("    allocateTickets: ").append(toIndentedString(allocateTickets)).append("\n");
    sb.append("    ticketType: ").append(toIndentedString(ticketType)).append("\n");
    sb.append("    ticketCount: ").append(toIndentedString(ticketCount)).append("\n");
    sb.append("    points: ").append(toIndentedString(points)).append("\n");
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


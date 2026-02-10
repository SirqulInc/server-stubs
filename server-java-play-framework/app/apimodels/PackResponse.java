package apimodels;

import apimodels.AccountShortResponse;
import apimodels.ApplicationShortResponse;
import apimodels.AssetShortResponse;
import apimodels.GameLevelListResponse;
import apimodels.NameStringValueResponse;
import apimodels.ScoreListResponse;
import apimodels.TicketListResponse;
import apimodels.UserPermissionsListResponse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * PackResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class PackResponse   {
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

  @JsonProperty("action")
  
  private ActionEnum action;

  @JsonProperty("highestAppVersion")
  
  private String highestAppVersion;

  @JsonProperty("gameType")
  
  private String gameType;

  @JsonProperty("packId")
  
  private Long packId;

  @JsonProperty("name")
  
  private String name;

  @JsonProperty("description")
  
  private String description;

  @JsonProperty("active")
  
  private Boolean active;

  @JsonProperty("downloaded")
  
  private Boolean downloaded;

  @JsonProperty("completed")
  
  private Boolean completed;

  @JsonProperty("icon")
  @Valid

  private AssetShortResponse icon;

  @JsonProperty("background")
  @Valid

  private AssetShortResponse background;

  @JsonProperty("ticketsEarned")
  
  private Long ticketsEarned;

  @JsonProperty("levels")
  @Valid

  private GameLevelListResponse levels;

  @JsonProperty("sequenceType")
  
  private String sequenceType;

  @JsonProperty("scores")
  @Valid

  private ScoreListResponse scores;

  @JsonProperty("owner")
  @Valid

  private AccountShortResponse owner;

  @JsonProperty("costToRedeem")
  
  private Long costToRedeem;

  @JsonProperty("price")
  
  private Long price;

  @JsonProperty("priceType")
  
  private String priceType;

  @JsonProperty("userPermissionsList")
  @Valid

  private UserPermissionsListResponse userPermissionsList;

  @JsonProperty("results")
  @Valid

  private List<@Valid NameStringValueResponse> results = null;

  @JsonProperty("tickets")
  @Valid

  private TicketListResponse tickets;

  @JsonProperty("authorOverride")
  
  private String authorOverride;

  @JsonProperty("updatedDate")
  
  private Long updatedDate;

  @JsonProperty("startDate")
  
  private Long startDate;

  @JsonProperty("endDate")
  
  private Long endDate;

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

  @JsonProperty("packOrder")
  
  private Long packOrder;

  @JsonProperty("appKey")
  
  private String appKey;

  @JsonProperty("application")
  @Valid

  private ApplicationShortResponse application;

  @JsonProperty("inGame")
  
  private Boolean inGame;

  @JsonProperty("highest")
  
  private Boolean highest;

  @JsonProperty("allocateTickets")
  
  private Boolean allocateTickets;

  @JsonProperty("ticketType")
  
  private String ticketType;

  @JsonProperty("ticketCount")
  
  private Long ticketCount;

  @JsonProperty("points")
  
  private Long points;

  public PackResponse action(ActionEnum action) {
    this.action = action;
    return this;
  }

   /**
   * Get action
   * @return action
  **/
  public ActionEnum getAction() {
    return action;
  }

  public void setAction(ActionEnum action) {
    this.action = action;
  }

  public PackResponse highestAppVersion(String highestAppVersion) {
    this.highestAppVersion = highestAppVersion;
    return this;
  }

   /**
   * Get highestAppVersion
   * @return highestAppVersion
  **/
  public String getHighestAppVersion() {
    return highestAppVersion;
  }

  public void setHighestAppVersion(String highestAppVersion) {
    this.highestAppVersion = highestAppVersion;
  }

  public PackResponse gameType(String gameType) {
    this.gameType = gameType;
    return this;
  }

   /**
   * Get gameType
   * @return gameType
  **/
  public String getGameType() {
    return gameType;
  }

  public void setGameType(String gameType) {
    this.gameType = gameType;
  }

  public PackResponse packId(Long packId) {
    this.packId = packId;
    return this;
  }

   /**
   * Get packId
   * @return packId
  **/
  public Long getPackId() {
    return packId;
  }

  public void setPackId(Long packId) {
    this.packId = packId;
  }

  public PackResponse name(String name) {
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

  public PackResponse description(String description) {
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

  public PackResponse active(Boolean active) {
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

  public PackResponse downloaded(Boolean downloaded) {
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

  public PackResponse completed(Boolean completed) {
    this.completed = completed;
    return this;
  }

   /**
   * Get completed
   * @return completed
  **/
  public Boolean getCompleted() {
    return completed;
  }

  public void setCompleted(Boolean completed) {
    this.completed = completed;
  }

  public PackResponse icon(AssetShortResponse icon) {
    this.icon = icon;
    return this;
  }

   /**
   * Get icon
   * @return icon
  **/
  public AssetShortResponse getIcon() {
    return icon;
  }

  public void setIcon(AssetShortResponse icon) {
    this.icon = icon;
  }

  public PackResponse background(AssetShortResponse background) {
    this.background = background;
    return this;
  }

   /**
   * Get background
   * @return background
  **/
  public AssetShortResponse getBackground() {
    return background;
  }

  public void setBackground(AssetShortResponse background) {
    this.background = background;
  }

  public PackResponse ticketsEarned(Long ticketsEarned) {
    this.ticketsEarned = ticketsEarned;
    return this;
  }

   /**
   * Get ticketsEarned
   * @return ticketsEarned
  **/
  public Long getTicketsEarned() {
    return ticketsEarned;
  }

  public void setTicketsEarned(Long ticketsEarned) {
    this.ticketsEarned = ticketsEarned;
  }

  public PackResponse levels(GameLevelListResponse levels) {
    this.levels = levels;
    return this;
  }

   /**
   * Get levels
   * @return levels
  **/
  public GameLevelListResponse getLevels() {
    return levels;
  }

  public void setLevels(GameLevelListResponse levels) {
    this.levels = levels;
  }

  public PackResponse sequenceType(String sequenceType) {
    this.sequenceType = sequenceType;
    return this;
  }

   /**
   * Get sequenceType
   * @return sequenceType
  **/
  public String getSequenceType() {
    return sequenceType;
  }

  public void setSequenceType(String sequenceType) {
    this.sequenceType = sequenceType;
  }

  public PackResponse scores(ScoreListResponse scores) {
    this.scores = scores;
    return this;
  }

   /**
   * Get scores
   * @return scores
  **/
  public ScoreListResponse getScores() {
    return scores;
  }

  public void setScores(ScoreListResponse scores) {
    this.scores = scores;
  }

  public PackResponse owner(AccountShortResponse owner) {
    this.owner = owner;
    return this;
  }

   /**
   * Get owner
   * @return owner
  **/
  public AccountShortResponse getOwner() {
    return owner;
  }

  public void setOwner(AccountShortResponse owner) {
    this.owner = owner;
  }

  public PackResponse costToRedeem(Long costToRedeem) {
    this.costToRedeem = costToRedeem;
    return this;
  }

   /**
   * Get costToRedeem
   * @return costToRedeem
  **/
  public Long getCostToRedeem() {
    return costToRedeem;
  }

  public void setCostToRedeem(Long costToRedeem) {
    this.costToRedeem = costToRedeem;
  }

  public PackResponse price(Long price) {
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  public Long getPrice() {
    return price;
  }

  public void setPrice(Long price) {
    this.price = price;
  }

  public PackResponse priceType(String priceType) {
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

  public PackResponse userPermissionsList(UserPermissionsListResponse userPermissionsList) {
    this.userPermissionsList = userPermissionsList;
    return this;
  }

   /**
   * Get userPermissionsList
   * @return userPermissionsList
  **/
  public UserPermissionsListResponse getUserPermissionsList() {
    return userPermissionsList;
  }

  public void setUserPermissionsList(UserPermissionsListResponse userPermissionsList) {
    this.userPermissionsList = userPermissionsList;
  }

  public PackResponse results(List<@Valid NameStringValueResponse> results) {
    this.results = results;
    return this;
  }

  public PackResponse addResultsItem(NameStringValueResponse resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<>();
    }
    this.results.add(resultsItem);
    return this;
  }

   /**
   * Get results
   * @return results
  **/
  public List<@Valid NameStringValueResponse> getResults() {
    return results;
  }

  public void setResults(List<@Valid NameStringValueResponse> results) {
    this.results = results;
  }

  public PackResponse tickets(TicketListResponse tickets) {
    this.tickets = tickets;
    return this;
  }

   /**
   * Get tickets
   * @return tickets
  **/
  public TicketListResponse getTickets() {
    return tickets;
  }

  public void setTickets(TicketListResponse tickets) {
    this.tickets = tickets;
  }

  public PackResponse authorOverride(String authorOverride) {
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

  public PackResponse updatedDate(Long updatedDate) {
    this.updatedDate = updatedDate;
    return this;
  }

   /**
   * Get updatedDate
   * @return updatedDate
  **/
  public Long getUpdatedDate() {
    return updatedDate;
  }

  public void setUpdatedDate(Long updatedDate) {
    this.updatedDate = updatedDate;
  }

  public PackResponse startDate(Long startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  public Long getStartDate() {
    return startDate;
  }

  public void setStartDate(Long startDate) {
    this.startDate = startDate;
  }

  public PackResponse endDate(Long endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * Get endDate
   * @return endDate
  **/
  public Long getEndDate() {
    return endDate;
  }

  public void setEndDate(Long endDate) {
    this.endDate = endDate;
  }

  public PackResponse packType(PackTypeEnum packType) {
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

  public PackResponse packOrder(Long packOrder) {
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

  public PackResponse appKey(String appKey) {
    this.appKey = appKey;
    return this;
  }

   /**
   * Get appKey
   * @return appKey
  **/
  public String getAppKey() {
    return appKey;
  }

  public void setAppKey(String appKey) {
    this.appKey = appKey;
  }

  public PackResponse application(ApplicationShortResponse application) {
    this.application = application;
    return this;
  }

   /**
   * Get application
   * @return application
  **/
  public ApplicationShortResponse getApplication() {
    return application;
  }

  public void setApplication(ApplicationShortResponse application) {
    this.application = application;
  }

  public PackResponse inGame(Boolean inGame) {
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

  public PackResponse highest(Boolean highest) {
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

  public PackResponse allocateTickets(Boolean allocateTickets) {
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

  public PackResponse ticketType(String ticketType) {
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

  public PackResponse ticketCount(Long ticketCount) {
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

  public PackResponse points(Long points) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PackResponse packResponse = (PackResponse) o;
    return Objects.equals(action, packResponse.action) &&
        Objects.equals(highestAppVersion, packResponse.highestAppVersion) &&
        Objects.equals(gameType, packResponse.gameType) &&
        Objects.equals(packId, packResponse.packId) &&
        Objects.equals(name, packResponse.name) &&
        Objects.equals(description, packResponse.description) &&
        Objects.equals(active, packResponse.active) &&
        Objects.equals(downloaded, packResponse.downloaded) &&
        Objects.equals(completed, packResponse.completed) &&
        Objects.equals(icon, packResponse.icon) &&
        Objects.equals(background, packResponse.background) &&
        Objects.equals(ticketsEarned, packResponse.ticketsEarned) &&
        Objects.equals(levels, packResponse.levels) &&
        Objects.equals(sequenceType, packResponse.sequenceType) &&
        Objects.equals(scores, packResponse.scores) &&
        Objects.equals(owner, packResponse.owner) &&
        Objects.equals(costToRedeem, packResponse.costToRedeem) &&
        Objects.equals(price, packResponse.price) &&
        Objects.equals(priceType, packResponse.priceType) &&
        Objects.equals(userPermissionsList, packResponse.userPermissionsList) &&
        Objects.equals(results, packResponse.results) &&
        Objects.equals(tickets, packResponse.tickets) &&
        Objects.equals(authorOverride, packResponse.authorOverride) &&
        Objects.equals(updatedDate, packResponse.updatedDate) &&
        Objects.equals(startDate, packResponse.startDate) &&
        Objects.equals(endDate, packResponse.endDate) &&
        Objects.equals(packType, packResponse.packType) &&
        Objects.equals(packOrder, packResponse.packOrder) &&
        Objects.equals(appKey, packResponse.appKey) &&
        Objects.equals(application, packResponse.application) &&
        Objects.equals(inGame, packResponse.inGame) &&
        Objects.equals(highest, packResponse.highest) &&
        Objects.equals(allocateTickets, packResponse.allocateTickets) &&
        Objects.equals(ticketType, packResponse.ticketType) &&
        Objects.equals(ticketCount, packResponse.ticketCount) &&
        Objects.equals(points, packResponse.points);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, highestAppVersion, gameType, packId, name, description, active, downloaded, completed, icon, background, ticketsEarned, levels, sequenceType, scores, owner, costToRedeem, price, priceType, userPermissionsList, results, tickets, authorOverride, updatedDate, startDate, endDate, packType, packOrder, appKey, application, inGame, highest, allocateTickets, ticketType, ticketCount, points);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


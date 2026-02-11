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
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class PackResponse   {
  

  /**
   * Gets or Sets action
   */
  public enum ActionEnum {
    DATA("DATA"),

        SAVE("SAVE"),

        DELETE("DELETE"),

        GET("GET");
    private String value;

    ActionEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private ActionEnum action;
  private String highestAppVersion;
  private String gameType;
  private Long packId;
  private String name;
  private String description;
  private Boolean active;
  private Boolean downloaded;
  private Boolean completed;
  private AssetShortResponse icon;
  private AssetShortResponse background;
  private Long ticketsEarned;
  private GameLevelListResponse levels;
  private String sequenceType;
  private ScoreListResponse scores;
  private AccountShortResponse owner;
  private Long costToRedeem;
  private Long price;
  private String priceType;
  private UserPermissionsListResponse userPermissionsList;
  private List<@Valid NameStringValueResponse> results = new ArrayList<>();
  private TicketListResponse tickets;
  private String authorOverride;
  private Long updatedDate;
  private Long startDate;
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
  private Long packOrder;
  private String appKey;
  private ApplicationShortResponse application;
  private Boolean inGame;
  private Boolean highest;
  private Boolean allocateTickets;
  private String ticketType;
  private Long ticketCount;
  private Long points;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("action")
  public ActionEnum getAction() {
    return action;
  }
  public void setAction(ActionEnum action) {
    this.action = action;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("highestAppVersion")
  public String getHighestAppVersion() {
    return highestAppVersion;
  }
  public void setHighestAppVersion(String highestAppVersion) {
    this.highestAppVersion = highestAppVersion;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("gameType")
  public String getGameType() {
    return gameType;
  }
  public void setGameType(String gameType) {
    this.gameType = gameType;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("packId")
  public Long getPackId() {
    return packId;
  }
  public void setPackId(Long packId) {
    this.packId = packId;
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
  @JsonProperty("completed")
  public Boolean getCompleted() {
    return completed;
  }
  public void setCompleted(Boolean completed) {
    this.completed = completed;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("icon")
  @Valid
  public AssetShortResponse getIcon() {
    return icon;
  }
  public void setIcon(AssetShortResponse icon) {
    this.icon = icon;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("background")
  @Valid
  public AssetShortResponse getBackground() {
    return background;
  }
  public void setBackground(AssetShortResponse background) {
    this.background = background;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("ticketsEarned")
  public Long getTicketsEarned() {
    return ticketsEarned;
  }
  public void setTicketsEarned(Long ticketsEarned) {
    this.ticketsEarned = ticketsEarned;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("levels")
  @Valid
  public GameLevelListResponse getLevels() {
    return levels;
  }
  public void setLevels(GameLevelListResponse levels) {
    this.levels = levels;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("sequenceType")
  public String getSequenceType() {
    return sequenceType;
  }
  public void setSequenceType(String sequenceType) {
    this.sequenceType = sequenceType;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("scores")
  @Valid
  public ScoreListResponse getScores() {
    return scores;
  }
  public void setScores(ScoreListResponse scores) {
    this.scores = scores;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("owner")
  @Valid
  public AccountShortResponse getOwner() {
    return owner;
  }
  public void setOwner(AccountShortResponse owner) {
    this.owner = owner;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("costToRedeem")
  public Long getCostToRedeem() {
    return costToRedeem;
  }
  public void setCostToRedeem(Long costToRedeem) {
    this.costToRedeem = costToRedeem;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("price")
  public Long getPrice() {
    return price;
  }
  public void setPrice(Long price) {
    this.price = price;
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
  @JsonProperty("userPermissionsList")
  @Valid
  public UserPermissionsListResponse getUserPermissionsList() {
    return userPermissionsList;
  }
  public void setUserPermissionsList(UserPermissionsListResponse userPermissionsList) {
    this.userPermissionsList = userPermissionsList;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("results")
  @Valid
  public List<@Valid NameStringValueResponse> getResults() {
    return results;
  }
  public void setResults(List<@Valid NameStringValueResponse> results) {
    this.results = results;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("tickets")
  @Valid
  public TicketListResponse getTickets() {
    return tickets;
  }
  public void setTickets(TicketListResponse tickets) {
    this.tickets = tickets;
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
  @JsonProperty("updatedDate")
  public Long getUpdatedDate() {
    return updatedDate;
  }
  public void setUpdatedDate(Long updatedDate) {
    this.updatedDate = updatedDate;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("startDate")
  public Long getStartDate() {
    return startDate;
  }
  public void setStartDate(Long startDate) {
    this.startDate = startDate;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("endDate")
  public Long getEndDate() {
    return endDate;
  }
  public void setEndDate(Long endDate) {
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
  @JsonProperty("appKey")
  public String getAppKey() {
    return appKey;
  }
  public void setAppKey(String appKey) {
    this.appKey = appKey;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("application")
  @Valid
  public ApplicationShortResponse getApplication() {
    return application;
  }
  public void setApplication(ApplicationShortResponse application) {
    this.application = application;
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
  @JsonProperty("points")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


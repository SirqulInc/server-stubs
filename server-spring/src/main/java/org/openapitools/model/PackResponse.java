package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
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
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PackResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-09T20:58:37.853899731Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class PackResponse {

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

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
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

  private @Nullable ActionEnum action;

  private @Nullable String highestAppVersion;

  private @Nullable String gameType;

  private @Nullable Long packId;

  private @Nullable String name;

  private @Nullable String description;

  private @Nullable Boolean active;

  private @Nullable Boolean downloaded;

  private @Nullable Boolean completed;

  private @Nullable AssetShortResponse icon;

  private @Nullable AssetShortResponse background;

  private @Nullable Long ticketsEarned;

  private @Nullable GameLevelListResponse levels;

  private @Nullable String sequenceType;

  private @Nullable ScoreListResponse scores;

  private @Nullable AccountShortResponse owner;

  private @Nullable Long costToRedeem;

  private @Nullable Long price;

  private @Nullable String priceType;

  private @Nullable UserPermissionsListResponse userPermissionsList;

  @Valid
  private List<@Valid NameStringValueResponse> results = new ArrayList<>();

  private @Nullable TicketListResponse tickets;

  private @Nullable String authorOverride;

  private @Nullable Long updatedDate;

  private @Nullable Long startDate;

  private @Nullable Long endDate;

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

  private @Nullable Long packOrder;

  private @Nullable String appKey;

  private @Nullable ApplicationShortResponse application;

  private @Nullable Boolean inGame;

  private @Nullable Boolean highest;

  private @Nullable Boolean allocateTickets;

  private @Nullable String ticketType;

  private @Nullable Long ticketCount;

  private @Nullable Long points;

  public PackResponse action(@Nullable ActionEnum action) {
    this.action = action;
    return this;
  }

  /**
   * Get action
   * @return action
   */
  
  @Schema(name = "action", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("action")
  public @Nullable ActionEnum getAction() {
    return action;
  }

  public void setAction(@Nullable ActionEnum action) {
    this.action = action;
  }

  public PackResponse highestAppVersion(@Nullable String highestAppVersion) {
    this.highestAppVersion = highestAppVersion;
    return this;
  }

  /**
   * Get highestAppVersion
   * @return highestAppVersion
   */
  
  @Schema(name = "highestAppVersion", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("highestAppVersion")
  public @Nullable String getHighestAppVersion() {
    return highestAppVersion;
  }

  public void setHighestAppVersion(@Nullable String highestAppVersion) {
    this.highestAppVersion = highestAppVersion;
  }

  public PackResponse gameType(@Nullable String gameType) {
    this.gameType = gameType;
    return this;
  }

  /**
   * Get gameType
   * @return gameType
   */
  
  @Schema(name = "gameType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("gameType")
  public @Nullable String getGameType() {
    return gameType;
  }

  public void setGameType(@Nullable String gameType) {
    this.gameType = gameType;
  }

  public PackResponse packId(@Nullable Long packId) {
    this.packId = packId;
    return this;
  }

  /**
   * Get packId
   * @return packId
   */
  
  @Schema(name = "packId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("packId")
  public @Nullable Long getPackId() {
    return packId;
  }

  public void setPackId(@Nullable Long packId) {
    this.packId = packId;
  }

  public PackResponse name(@Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  
  @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public @Nullable String getName() {
    return name;
  }

  public void setName(@Nullable String name) {
    this.name = name;
  }

  public PackResponse description(@Nullable String description) {
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

  public PackResponse active(@Nullable Boolean active) {
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

  public PackResponse downloaded(@Nullable Boolean downloaded) {
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

  public PackResponse completed(@Nullable Boolean completed) {
    this.completed = completed;
    return this;
  }

  /**
   * Get completed
   * @return completed
   */
  
  @Schema(name = "completed", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("completed")
  public @Nullable Boolean getCompleted() {
    return completed;
  }

  public void setCompleted(@Nullable Boolean completed) {
    this.completed = completed;
  }

  public PackResponse icon(@Nullable AssetShortResponse icon) {
    this.icon = icon;
    return this;
  }

  /**
   * Get icon
   * @return icon
   */
  @Valid 
  @Schema(name = "icon", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("icon")
  public @Nullable AssetShortResponse getIcon() {
    return icon;
  }

  public void setIcon(@Nullable AssetShortResponse icon) {
    this.icon = icon;
  }

  public PackResponse background(@Nullable AssetShortResponse background) {
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
  public @Nullable AssetShortResponse getBackground() {
    return background;
  }

  public void setBackground(@Nullable AssetShortResponse background) {
    this.background = background;
  }

  public PackResponse ticketsEarned(@Nullable Long ticketsEarned) {
    this.ticketsEarned = ticketsEarned;
    return this;
  }

  /**
   * Get ticketsEarned
   * @return ticketsEarned
   */
  
  @Schema(name = "ticketsEarned", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ticketsEarned")
  public @Nullable Long getTicketsEarned() {
    return ticketsEarned;
  }

  public void setTicketsEarned(@Nullable Long ticketsEarned) {
    this.ticketsEarned = ticketsEarned;
  }

  public PackResponse levels(@Nullable GameLevelListResponse levels) {
    this.levels = levels;
    return this;
  }

  /**
   * Get levels
   * @return levels
   */
  @Valid 
  @Schema(name = "levels", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("levels")
  public @Nullable GameLevelListResponse getLevels() {
    return levels;
  }

  public void setLevels(@Nullable GameLevelListResponse levels) {
    this.levels = levels;
  }

  public PackResponse sequenceType(@Nullable String sequenceType) {
    this.sequenceType = sequenceType;
    return this;
  }

  /**
   * Get sequenceType
   * @return sequenceType
   */
  
  @Schema(name = "sequenceType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sequenceType")
  public @Nullable String getSequenceType() {
    return sequenceType;
  }

  public void setSequenceType(@Nullable String sequenceType) {
    this.sequenceType = sequenceType;
  }

  public PackResponse scores(@Nullable ScoreListResponse scores) {
    this.scores = scores;
    return this;
  }

  /**
   * Get scores
   * @return scores
   */
  @Valid 
  @Schema(name = "scores", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("scores")
  public @Nullable ScoreListResponse getScores() {
    return scores;
  }

  public void setScores(@Nullable ScoreListResponse scores) {
    this.scores = scores;
  }

  public PackResponse owner(@Nullable AccountShortResponse owner) {
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
  public @Nullable AccountShortResponse getOwner() {
    return owner;
  }

  public void setOwner(@Nullable AccountShortResponse owner) {
    this.owner = owner;
  }

  public PackResponse costToRedeem(@Nullable Long costToRedeem) {
    this.costToRedeem = costToRedeem;
    return this;
  }

  /**
   * Get costToRedeem
   * @return costToRedeem
   */
  
  @Schema(name = "costToRedeem", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("costToRedeem")
  public @Nullable Long getCostToRedeem() {
    return costToRedeem;
  }

  public void setCostToRedeem(@Nullable Long costToRedeem) {
    this.costToRedeem = costToRedeem;
  }

  public PackResponse price(@Nullable Long price) {
    this.price = price;
    return this;
  }

  /**
   * Get price
   * @return price
   */
  
  @Schema(name = "price", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("price")
  public @Nullable Long getPrice() {
    return price;
  }

  public void setPrice(@Nullable Long price) {
    this.price = price;
  }

  public PackResponse priceType(@Nullable String priceType) {
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

  public PackResponse userPermissionsList(@Nullable UserPermissionsListResponse userPermissionsList) {
    this.userPermissionsList = userPermissionsList;
    return this;
  }

  /**
   * Get userPermissionsList
   * @return userPermissionsList
   */
  @Valid 
  @Schema(name = "userPermissionsList", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("userPermissionsList")
  public @Nullable UserPermissionsListResponse getUserPermissionsList() {
    return userPermissionsList;
  }

  public void setUserPermissionsList(@Nullable UserPermissionsListResponse userPermissionsList) {
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
   */
  @Valid 
  @Schema(name = "results", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("results")
  public List<@Valid NameStringValueResponse> getResults() {
    return results;
  }

  public void setResults(List<@Valid NameStringValueResponse> results) {
    this.results = results;
  }

  public PackResponse tickets(@Nullable TicketListResponse tickets) {
    this.tickets = tickets;
    return this;
  }

  /**
   * Get tickets
   * @return tickets
   */
  @Valid 
  @Schema(name = "tickets", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tickets")
  public @Nullable TicketListResponse getTickets() {
    return tickets;
  }

  public void setTickets(@Nullable TicketListResponse tickets) {
    this.tickets = tickets;
  }

  public PackResponse authorOverride(@Nullable String authorOverride) {
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

  public PackResponse updatedDate(@Nullable Long updatedDate) {
    this.updatedDate = updatedDate;
    return this;
  }

  /**
   * Get updatedDate
   * @return updatedDate
   */
  
  @Schema(name = "updatedDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("updatedDate")
  public @Nullable Long getUpdatedDate() {
    return updatedDate;
  }

  public void setUpdatedDate(@Nullable Long updatedDate) {
    this.updatedDate = updatedDate;
  }

  public PackResponse startDate(@Nullable Long startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Get startDate
   * @return startDate
   */
  
  @Schema(name = "startDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("startDate")
  public @Nullable Long getStartDate() {
    return startDate;
  }

  public void setStartDate(@Nullable Long startDate) {
    this.startDate = startDate;
  }

  public PackResponse endDate(@Nullable Long endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * Get endDate
   * @return endDate
   */
  
  @Schema(name = "endDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("endDate")
  public @Nullable Long getEndDate() {
    return endDate;
  }

  public void setEndDate(@Nullable Long endDate) {
    this.endDate = endDate;
  }

  public PackResponse packType(@Nullable PackTypeEnum packType) {
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

  public PackResponse packOrder(@Nullable Long packOrder) {
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

  public PackResponse appKey(@Nullable String appKey) {
    this.appKey = appKey;
    return this;
  }

  /**
   * Get appKey
   * @return appKey
   */
  
  @Schema(name = "appKey", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("appKey")
  public @Nullable String getAppKey() {
    return appKey;
  }

  public void setAppKey(@Nullable String appKey) {
    this.appKey = appKey;
  }

  public PackResponse application(@Nullable ApplicationShortResponse application) {
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
  public @Nullable ApplicationShortResponse getApplication() {
    return application;
  }

  public void setApplication(@Nullable ApplicationShortResponse application) {
    this.application = application;
  }

  public PackResponse inGame(@Nullable Boolean inGame) {
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

  public PackResponse highest(@Nullable Boolean highest) {
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

  public PackResponse allocateTickets(@Nullable Boolean allocateTickets) {
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

  public PackResponse ticketType(@Nullable String ticketType) {
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

  public PackResponse ticketCount(@Nullable Long ticketCount) {
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

  public PackResponse points(@Nullable Long points) {
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
  private String toIndentedString(@Nullable Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.NameStringValueResponse;
import org.openapitools.model.ScoreListResponse;
import org.openapitools.model.TicketListResponse;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * GameObjectResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-11T19:32:41.765375324Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class GameObjectResponse {

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

  private @Nullable Long gameObjectId;

  private @Nullable String gameType;

  private @Nullable Long ticketsEarned;

  private @Nullable ScoreListResponse scores;

  private @Nullable TicketListResponse tickets;

  @Valid
  private List<@Valid NameStringValueResponse> items = new ArrayList<>();

  private @Nullable Boolean allocateTickets;

  public GameObjectResponse action(@Nullable ActionEnum action) {
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

  public GameObjectResponse gameObjectId(@Nullable Long gameObjectId) {
    this.gameObjectId = gameObjectId;
    return this;
  }

  /**
   * Get gameObjectId
   * @return gameObjectId
   */
  
  @Schema(name = "gameObjectId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("gameObjectId")
  public @Nullable Long getGameObjectId() {
    return gameObjectId;
  }

  public void setGameObjectId(@Nullable Long gameObjectId) {
    this.gameObjectId = gameObjectId;
  }

  public GameObjectResponse gameType(@Nullable String gameType) {
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

  public GameObjectResponse ticketsEarned(@Nullable Long ticketsEarned) {
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

  public GameObjectResponse scores(@Nullable ScoreListResponse scores) {
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

  public GameObjectResponse tickets(@Nullable TicketListResponse tickets) {
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

  public GameObjectResponse items(List<@Valid NameStringValueResponse> items) {
    this.items = items;
    return this;
  }

  public GameObjectResponse addItemsItem(NameStringValueResponse itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * Get items
   * @return items
   */
  @Valid 
  @Schema(name = "items", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("items")
  public List<@Valid NameStringValueResponse> getItems() {
    return items;
  }

  public void setItems(List<@Valid NameStringValueResponse> items) {
    this.items = items;
  }

  public GameObjectResponse allocateTickets(@Nullable Boolean allocateTickets) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GameObjectResponse gameObjectResponse = (GameObjectResponse) o;
    return Objects.equals(this.action, gameObjectResponse.action) &&
        Objects.equals(this.gameObjectId, gameObjectResponse.gameObjectId) &&
        Objects.equals(this.gameType, gameObjectResponse.gameType) &&
        Objects.equals(this.ticketsEarned, gameObjectResponse.ticketsEarned) &&
        Objects.equals(this.scores, gameObjectResponse.scores) &&
        Objects.equals(this.tickets, gameObjectResponse.tickets) &&
        Objects.equals(this.items, gameObjectResponse.items) &&
        Objects.equals(this.allocateTickets, gameObjectResponse.allocateTickets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, gameObjectId, gameType, ticketsEarned, scores, tickets, items, allocateTickets);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GameObjectResponse {\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    gameObjectId: ").append(toIndentedString(gameObjectId)).append("\n");
    sb.append("    gameType: ").append(toIndentedString(gameType)).append("\n");
    sb.append("    ticketsEarned: ").append(toIndentedString(ticketsEarned)).append("\n");
    sb.append("    scores: ").append(toIndentedString(scores)).append("\n");
    sb.append("    tickets: ").append(toIndentedString(tickets)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    allocateTickets: ").append(toIndentedString(allocateTickets)).append("\n");
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


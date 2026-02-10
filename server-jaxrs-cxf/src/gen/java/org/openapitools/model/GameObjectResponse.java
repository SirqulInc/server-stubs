package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.NameStringValueResponse;
import org.openapitools.model.ScoreListResponse;
import org.openapitools.model.TicketListResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GameObjectResponse  {
  
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

  private Long gameObjectId;

  @ApiModelProperty(value = "")

  private String gameType;

  @ApiModelProperty(value = "")

  private Long ticketsEarned;

  @ApiModelProperty(value = "")

  @Valid

  private ScoreListResponse scores;

  @ApiModelProperty(value = "")

  @Valid

  private TicketListResponse tickets;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid NameStringValueResponse> items = new ArrayList<>();

  @ApiModelProperty(value = "")

  private Boolean allocateTickets;
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

  public GameObjectResponse action(ActionEnum action) {
    this.action = action;
    return this;
  }

 /**
   * Get gameObjectId
   * @return gameObjectId
  **/
  @JsonProperty("gameObjectId")
  public Long getGameObjectId() {
    return gameObjectId;
  }

  public void setGameObjectId(Long gameObjectId) {
    this.gameObjectId = gameObjectId;
  }

  public GameObjectResponse gameObjectId(Long gameObjectId) {
    this.gameObjectId = gameObjectId;
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

  public GameObjectResponse gameType(String gameType) {
    this.gameType = gameType;
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

  public GameObjectResponse ticketsEarned(Long ticketsEarned) {
    this.ticketsEarned = ticketsEarned;
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

  public GameObjectResponse scores(ScoreListResponse scores) {
    this.scores = scores;
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

  public GameObjectResponse tickets(TicketListResponse tickets) {
    this.tickets = tickets;
    return this;
  }

 /**
   * Get items
   * @return items
  **/
  @JsonProperty("items")
  public List<@Valid NameStringValueResponse> getItems() {
    return items;
  }

  public void setItems(List<@Valid NameStringValueResponse> items) {
    this.items = items;
  }

  public GameObjectResponse items(List<@Valid NameStringValueResponse> items) {
    this.items = items;
    return this;
  }

  public GameObjectResponse addItemsItem(NameStringValueResponse itemsItem) {
    this.items.add(itemsItem);
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

  public GameObjectResponse allocateTickets(Boolean allocateTickets) {
    this.allocateTickets = allocateTickets;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


package apimodels;

import apimodels.NameStringValueResponse;
import apimodels.ScoreListResponse;
import apimodels.TicketListResponse;
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
 * GameObjectResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class GameObjectResponse   {
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

  @JsonProperty("gameObjectId")
  
  private Long gameObjectId;

  @JsonProperty("gameType")
  
  private String gameType;

  @JsonProperty("ticketsEarned")
  
  private Long ticketsEarned;

  @JsonProperty("scores")
  @Valid

  private ScoreListResponse scores;

  @JsonProperty("tickets")
  @Valid

  private TicketListResponse tickets;

  @JsonProperty("items")
  @Valid

  private List<@Valid NameStringValueResponse> items = null;

  @JsonProperty("allocateTickets")
  
  private Boolean allocateTickets;

  public GameObjectResponse action(ActionEnum action) {
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

  public GameObjectResponse gameObjectId(Long gameObjectId) {
    this.gameObjectId = gameObjectId;
    return this;
  }

   /**
   * Get gameObjectId
   * @return gameObjectId
  **/
  public Long getGameObjectId() {
    return gameObjectId;
  }

  public void setGameObjectId(Long gameObjectId) {
    this.gameObjectId = gameObjectId;
  }

  public GameObjectResponse gameType(String gameType) {
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

  public GameObjectResponse ticketsEarned(Long ticketsEarned) {
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

  public GameObjectResponse scores(ScoreListResponse scores) {
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

  public GameObjectResponse tickets(TicketListResponse tickets) {
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
  **/
  public List<@Valid NameStringValueResponse> getItems() {
    return items;
  }

  public void setItems(List<@Valid NameStringValueResponse> items) {
    this.items = items;
  }

  public GameObjectResponse allocateTickets(Boolean allocateTickets) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GameObjectResponse gameObjectResponse = (GameObjectResponse) o;
    return Objects.equals(action, gameObjectResponse.action) &&
        Objects.equals(gameObjectId, gameObjectResponse.gameObjectId) &&
        Objects.equals(gameType, gameObjectResponse.gameType) &&
        Objects.equals(ticketsEarned, gameObjectResponse.ticketsEarned) &&
        Objects.equals(scores, gameObjectResponse.scores) &&
        Objects.equals(tickets, gameObjectResponse.tickets) &&
        Objects.equals(items, gameObjectResponse.items) &&
        Objects.equals(allocateTickets, gameObjectResponse.allocateTickets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, gameObjectId, gameType, ticketsEarned, scores, tickets, items, allocateTickets);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


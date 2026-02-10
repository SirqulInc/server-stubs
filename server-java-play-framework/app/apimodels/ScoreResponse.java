package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ScoreResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ScoreResponse   {
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

  @JsonProperty("scoreId")
  
  private Long scoreId;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    COMPLETED("COMPLETED"),
    
    OWNER_CREDIT("OWNER_CREDIT"),
    
    SUMMATION("SUMMATION"),
    
    TOURNAMENT("TOURNAMENT");

    private final String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("status")
  
  private StatusEnum status;

  @JsonProperty("points")
  
  private Integer points;

  @JsonProperty("timeTaken")
  
  private Integer timeTaken;

  @JsonProperty("ticketsEarned")
  
  private Long ticketsEarned;

  @JsonProperty("gameType")
  
  private String gameType;

  @JsonProperty("accountId")
  
  private Long accountId;

  @JsonProperty("accountDisplay")
  
  private String accountDisplay;

  public ScoreResponse action(ActionEnum action) {
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

  public ScoreResponse scoreId(Long scoreId) {
    this.scoreId = scoreId;
    return this;
  }

   /**
   * Get scoreId
   * @return scoreId
  **/
  public Long getScoreId() {
    return scoreId;
  }

  public void setScoreId(Long scoreId) {
    this.scoreId = scoreId;
  }

  public ScoreResponse status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public ScoreResponse points(Integer points) {
    this.points = points;
    return this;
  }

   /**
   * Get points
   * @return points
  **/
  public Integer getPoints() {
    return points;
  }

  public void setPoints(Integer points) {
    this.points = points;
  }

  public ScoreResponse timeTaken(Integer timeTaken) {
    this.timeTaken = timeTaken;
    return this;
  }

   /**
   * Get timeTaken
   * @return timeTaken
  **/
  public Integer getTimeTaken() {
    return timeTaken;
  }

  public void setTimeTaken(Integer timeTaken) {
    this.timeTaken = timeTaken;
  }

  public ScoreResponse ticketsEarned(Long ticketsEarned) {
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

  public ScoreResponse gameType(String gameType) {
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

  public ScoreResponse accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * Get accountId
   * @return accountId
  **/
  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public ScoreResponse accountDisplay(String accountDisplay) {
    this.accountDisplay = accountDisplay;
    return this;
  }

   /**
   * Get accountDisplay
   * @return accountDisplay
  **/
  public String getAccountDisplay() {
    return accountDisplay;
  }

  public void setAccountDisplay(String accountDisplay) {
    this.accountDisplay = accountDisplay;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScoreResponse scoreResponse = (ScoreResponse) o;
    return Objects.equals(action, scoreResponse.action) &&
        Objects.equals(scoreId, scoreResponse.scoreId) &&
        Objects.equals(status, scoreResponse.status) &&
        Objects.equals(points, scoreResponse.points) &&
        Objects.equals(timeTaken, scoreResponse.timeTaken) &&
        Objects.equals(ticketsEarned, scoreResponse.ticketsEarned) &&
        Objects.equals(gameType, scoreResponse.gameType) &&
        Objects.equals(accountId, scoreResponse.accountId) &&
        Objects.equals(accountDisplay, scoreResponse.accountDisplay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, scoreId, status, points, timeTaken, ticketsEarned, gameType, accountId, accountDisplay);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScoreResponse {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    scoreId: ").append(toIndentedString(scoreId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    points: ").append(toIndentedString(points)).append("\n");
    sb.append("    timeTaken: ").append(toIndentedString(timeTaken)).append("\n");
    sb.append("    ticketsEarned: ").append(toIndentedString(ticketsEarned)).append("\n");
    sb.append("    gameType: ").append(toIndentedString(gameType)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    accountDisplay: ").append(toIndentedString(accountDisplay)).append("\n");
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


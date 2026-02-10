package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ScoreResponse  {
  
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

  private Long scoreId;

public enum StatusEnum {

COMPLETED(String.valueOf("COMPLETED")), OWNER_CREDIT(String.valueOf("OWNER_CREDIT")), SUMMATION(String.valueOf("SUMMATION")), TOURNAMENT(String.valueOf("TOURNAMENT"));


    private String value;

    StatusEnum (String v) {
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
    public static StatusEnum fromValue(String value) {
        for (StatusEnum b : StatusEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(value = "")

  private StatusEnum status;

  @ApiModelProperty(value = "")

  private Integer points;

  @ApiModelProperty(value = "")

  private Integer timeTaken;

  @ApiModelProperty(value = "")

  private Long ticketsEarned;

  @ApiModelProperty(value = "")

  private String gameType;

  @ApiModelProperty(value = "")

  private Long accountId;

  @ApiModelProperty(value = "")

  private String accountDisplay;
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

  public ScoreResponse action(ActionEnum action) {
    this.action = action;
    return this;
  }

 /**
   * Get scoreId
   * @return scoreId
  **/
  @JsonProperty("scoreId")
  public Long getScoreId() {
    return scoreId;
  }

  public void setScoreId(Long scoreId) {
    this.scoreId = scoreId;
  }

  public ScoreResponse scoreId(Long scoreId) {
    this.scoreId = scoreId;
    return this;
  }

 /**
   * Get status
   * @return status
  **/
  @JsonProperty("status")
  public String getStatus() {
    if (status == null) {
      return null;
    }
    return status.value();
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public ScoreResponse status(StatusEnum status) {
    this.status = status;
    return this;
  }

 /**
   * Get points
   * @return points
  **/
  @JsonProperty("points")
  public Integer getPoints() {
    return points;
  }

  public void setPoints(Integer points) {
    this.points = points;
  }

  public ScoreResponse points(Integer points) {
    this.points = points;
    return this;
  }

 /**
   * Get timeTaken
   * @return timeTaken
  **/
  @JsonProperty("timeTaken")
  public Integer getTimeTaken() {
    return timeTaken;
  }

  public void setTimeTaken(Integer timeTaken) {
    this.timeTaken = timeTaken;
  }

  public ScoreResponse timeTaken(Integer timeTaken) {
    this.timeTaken = timeTaken;
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

  public ScoreResponse ticketsEarned(Long ticketsEarned) {
    this.ticketsEarned = ticketsEarned;
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

  public ScoreResponse gameType(String gameType) {
    this.gameType = gameType;
    return this;
  }

 /**
   * Get accountId
   * @return accountId
  **/
  @JsonProperty("accountId")
  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public ScoreResponse accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

 /**
   * Get accountDisplay
   * @return accountDisplay
  **/
  @JsonProperty("accountDisplay")
  public String getAccountDisplay() {
    return accountDisplay;
  }

  public void setAccountDisplay(String accountDisplay) {
    this.accountDisplay = accountDisplay;
  }

  public ScoreResponse accountDisplay(String accountDisplay) {
    this.accountDisplay = accountDisplay;
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
    ScoreResponse scoreResponse = (ScoreResponse) o;
    return Objects.equals(this.action, scoreResponse.action) &&
        Objects.equals(this.scoreId, scoreResponse.scoreId) &&
        Objects.equals(this.status, scoreResponse.status) &&
        Objects.equals(this.points, scoreResponse.points) &&
        Objects.equals(this.timeTaken, scoreResponse.timeTaken) &&
        Objects.equals(this.ticketsEarned, scoreResponse.ticketsEarned) &&
        Objects.equals(this.gameType, scoreResponse.gameType) &&
        Objects.equals(this.accountId, scoreResponse.accountId) &&
        Objects.equals(this.accountDisplay, scoreResponse.accountDisplay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, scoreId, status, points, timeTaken, ticketsEarned, gameType, accountId, accountDisplay);
  }

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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


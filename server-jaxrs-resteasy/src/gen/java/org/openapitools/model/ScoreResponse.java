package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-09T20:51:23.077809933Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class ScoreResponse   {
  

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
  private Long scoreId;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    COMPLETED("COMPLETED"),

        OWNER_CREDIT("OWNER_CREDIT"),

        SUMMATION("SUMMATION"),

        TOURNAMENT("TOURNAMENT");
    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private StatusEnum status;
  private Integer points;
  private Integer timeTaken;
  private Long ticketsEarned;
  private String gameType;
  private Long accountId;
  private String accountDisplay;

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
  @JsonProperty("scoreId")
  public Long getScoreId() {
    return scoreId;
  }
  public void setScoreId(Long scoreId) {
    this.scoreId = scoreId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("points")
  public Integer getPoints() {
    return points;
  }
  public void setPoints(Integer points) {
    this.points = points;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("timeTaken")
  public Integer getTimeTaken() {
    return timeTaken;
  }
  public void setTimeTaken(Integer timeTaken) {
    this.timeTaken = timeTaken;
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
  @JsonProperty("accountId")
  public Long getAccountId() {
    return accountId;
  }
  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("accountDisplay")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


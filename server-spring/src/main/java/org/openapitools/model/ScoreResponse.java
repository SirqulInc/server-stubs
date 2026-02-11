package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ScoreResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-11T19:32:41.765375324Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class ScoreResponse {

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

  private @Nullable Long scoreId;

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

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
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

  private @Nullable StatusEnum status;

  private @Nullable Integer points;

  private @Nullable Integer timeTaken;

  private @Nullable Long ticketsEarned;

  private @Nullable String gameType;

  private @Nullable Long accountId;

  private @Nullable String accountDisplay;

  public ScoreResponse action(@Nullable ActionEnum action) {
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

  public ScoreResponse scoreId(@Nullable Long scoreId) {
    this.scoreId = scoreId;
    return this;
  }

  /**
   * Get scoreId
   * @return scoreId
   */
  
  @Schema(name = "scoreId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("scoreId")
  public @Nullable Long getScoreId() {
    return scoreId;
  }

  public void setScoreId(@Nullable Long scoreId) {
    this.scoreId = scoreId;
  }

  public ScoreResponse status(@Nullable StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  
  @Schema(name = "status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public @Nullable StatusEnum getStatus() {
    return status;
  }

  public void setStatus(@Nullable StatusEnum status) {
    this.status = status;
  }

  public ScoreResponse points(@Nullable Integer points) {
    this.points = points;
    return this;
  }

  /**
   * Get points
   * @return points
   */
  
  @Schema(name = "points", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("points")
  public @Nullable Integer getPoints() {
    return points;
  }

  public void setPoints(@Nullable Integer points) {
    this.points = points;
  }

  public ScoreResponse timeTaken(@Nullable Integer timeTaken) {
    this.timeTaken = timeTaken;
    return this;
  }

  /**
   * Get timeTaken
   * @return timeTaken
   */
  
  @Schema(name = "timeTaken", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("timeTaken")
  public @Nullable Integer getTimeTaken() {
    return timeTaken;
  }

  public void setTimeTaken(@Nullable Integer timeTaken) {
    this.timeTaken = timeTaken;
  }

  public ScoreResponse ticketsEarned(@Nullable Long ticketsEarned) {
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

  public ScoreResponse gameType(@Nullable String gameType) {
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

  public ScoreResponse accountId(@Nullable Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * Get accountId
   * @return accountId
   */
  
  @Schema(name = "accountId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("accountId")
  public @Nullable Long getAccountId() {
    return accountId;
  }

  public void setAccountId(@Nullable Long accountId) {
    this.accountId = accountId;
  }

  public ScoreResponse accountDisplay(@Nullable String accountDisplay) {
    this.accountDisplay = accountDisplay;
    return this;
  }

  /**
   * Get accountDisplay
   * @return accountDisplay
   */
  
  @Schema(name = "accountDisplay", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("accountDisplay")
  public @Nullable String getAccountDisplay() {
    return accountDisplay;
  }

  public void setAccountDisplay(@Nullable String accountDisplay) {
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
  private String toIndentedString(@Nullable Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


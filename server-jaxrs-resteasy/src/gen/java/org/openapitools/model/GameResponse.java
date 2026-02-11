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
import org.openapitools.model.AssetShortResponse;
import org.openapitools.model.NameStringValueResponse;
import org.openapitools.model.PackListResponse;
import org.openapitools.model.RuleListResponse;
import org.openapitools.model.ScoreListResponse;
import org.openapitools.model.UserPermissionsListResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class GameResponse   {
  

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
  private Long gameId;
  private String gameType;
  private PackListResponse packs;
  private ScoreListResponse scores;
  private AccountShortResponse owner;
  private UserPermissionsListResponse userPermissionsList;
  private RuleListResponse rules;
  private List<@Valid NameStringValueResponse> results = new ArrayList<>();
  private Long ticketsEarned;
  private String title;
  private String description;
  private String authorOverride;
  private AssetShortResponse icon;
  private AssetShortResponse image;
  private String sequenceType;
  private Long updatedDate;
  private Long startDate;
  private Long endDate;
  private String appKey;

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
  @JsonProperty("gameId")
  public Long getGameId() {
    return gameId;
  }
  public void setGameId(Long gameId) {
    this.gameId = gameId;
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
  @JsonProperty("packs")
  @Valid
  public PackListResponse getPacks() {
    return packs;
  }
  public void setPacks(PackListResponse packs) {
    this.packs = packs;
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
  @JsonProperty("rules")
  @Valid
  public RuleListResponse getRules() {
    return rules;
  }
  public void setRules(RuleListResponse rules) {
    this.rules = rules;
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
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
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
  @JsonProperty("image")
  @Valid
  public AssetShortResponse getImage() {
    return image;
  }
  public void setImage(AssetShortResponse image) {
    this.image = image;
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
  @JsonProperty("appKey")
  public String getAppKey() {
    return appKey;
  }
  public void setAppKey(String appKey) {
    this.appKey = appKey;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GameResponse gameResponse = (GameResponse) o;
    return Objects.equals(this.action, gameResponse.action) &&
        Objects.equals(this.highestAppVersion, gameResponse.highestAppVersion) &&
        Objects.equals(this.gameId, gameResponse.gameId) &&
        Objects.equals(this.gameType, gameResponse.gameType) &&
        Objects.equals(this.packs, gameResponse.packs) &&
        Objects.equals(this.scores, gameResponse.scores) &&
        Objects.equals(this.owner, gameResponse.owner) &&
        Objects.equals(this.userPermissionsList, gameResponse.userPermissionsList) &&
        Objects.equals(this.rules, gameResponse.rules) &&
        Objects.equals(this.results, gameResponse.results) &&
        Objects.equals(this.ticketsEarned, gameResponse.ticketsEarned) &&
        Objects.equals(this.title, gameResponse.title) &&
        Objects.equals(this.description, gameResponse.description) &&
        Objects.equals(this.authorOverride, gameResponse.authorOverride) &&
        Objects.equals(this.icon, gameResponse.icon) &&
        Objects.equals(this.image, gameResponse.image) &&
        Objects.equals(this.sequenceType, gameResponse.sequenceType) &&
        Objects.equals(this.updatedDate, gameResponse.updatedDate) &&
        Objects.equals(this.startDate, gameResponse.startDate) &&
        Objects.equals(this.endDate, gameResponse.endDate) &&
        Objects.equals(this.appKey, gameResponse.appKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, highestAppVersion, gameId, gameType, packs, scores, owner, userPermissionsList, rules, results, ticketsEarned, title, description, authorOverride, icon, image, sequenceType, updatedDate, startDate, endDate, appKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GameResponse {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    highestAppVersion: ").append(toIndentedString(highestAppVersion)).append("\n");
    sb.append("    gameId: ").append(toIndentedString(gameId)).append("\n");
    sb.append("    gameType: ").append(toIndentedString(gameType)).append("\n");
    sb.append("    packs: ").append(toIndentedString(packs)).append("\n");
    sb.append("    scores: ").append(toIndentedString(scores)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    userPermissionsList: ").append(toIndentedString(userPermissionsList)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
    sb.append("    ticketsEarned: ").append(toIndentedString(ticketsEarned)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    authorOverride: ").append(toIndentedString(authorOverride)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    sequenceType: ").append(toIndentedString(sequenceType)).append("\n");
    sb.append("    updatedDate: ").append(toIndentedString(updatedDate)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    appKey: ").append(toIndentedString(appKey)).append("\n");
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


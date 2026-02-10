package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
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

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GameResponse  {
  
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

  private String highestAppVersion;

  @ApiModelProperty(value = "")

  private Long gameId;

  @ApiModelProperty(value = "")

  private String gameType;

  @ApiModelProperty(value = "")

  @Valid

  private PackListResponse packs;

  @ApiModelProperty(value = "")

  @Valid

  private ScoreListResponse scores;

  @ApiModelProperty(value = "")

  @Valid

  private AccountShortResponse owner;

  @ApiModelProperty(value = "")

  @Valid

  private UserPermissionsListResponse userPermissionsList;

  @ApiModelProperty(value = "")

  @Valid

  private RuleListResponse rules;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid NameStringValueResponse> results = new ArrayList<>();

  @ApiModelProperty(value = "")

  private Long ticketsEarned;

  @ApiModelProperty(value = "")

  private String title;

  @ApiModelProperty(value = "")

  private String description;

  @ApiModelProperty(value = "")

  private String authorOverride;

  @ApiModelProperty(value = "")

  @Valid

  private AssetShortResponse icon;

  @ApiModelProperty(value = "")

  @Valid

  private AssetShortResponse image;

  @ApiModelProperty(value = "")

  private String sequenceType;

  @ApiModelProperty(value = "")

  private Long updatedDate;

  @ApiModelProperty(value = "")

  private Long startDate;

  @ApiModelProperty(value = "")

  private Long endDate;

  @ApiModelProperty(value = "")

  private String appKey;
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

  public GameResponse action(ActionEnum action) {
    this.action = action;
    return this;
  }

 /**
   * Get highestAppVersion
   * @return highestAppVersion
  **/
  @JsonProperty("highestAppVersion")
  public String getHighestAppVersion() {
    return highestAppVersion;
  }

  public void setHighestAppVersion(String highestAppVersion) {
    this.highestAppVersion = highestAppVersion;
  }

  public GameResponse highestAppVersion(String highestAppVersion) {
    this.highestAppVersion = highestAppVersion;
    return this;
  }

 /**
   * Get gameId
   * @return gameId
  **/
  @JsonProperty("gameId")
  public Long getGameId() {
    return gameId;
  }

  public void setGameId(Long gameId) {
    this.gameId = gameId;
  }

  public GameResponse gameId(Long gameId) {
    this.gameId = gameId;
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

  public GameResponse gameType(String gameType) {
    this.gameType = gameType;
    return this;
  }

 /**
   * Get packs
   * @return packs
  **/
  @JsonProperty("packs")
  public PackListResponse getPacks() {
    return packs;
  }

  public void setPacks(PackListResponse packs) {
    this.packs = packs;
  }

  public GameResponse packs(PackListResponse packs) {
    this.packs = packs;
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

  public GameResponse scores(ScoreListResponse scores) {
    this.scores = scores;
    return this;
  }

 /**
   * Get owner
   * @return owner
  **/
  @JsonProperty("owner")
  public AccountShortResponse getOwner() {
    return owner;
  }

  public void setOwner(AccountShortResponse owner) {
    this.owner = owner;
  }

  public GameResponse owner(AccountShortResponse owner) {
    this.owner = owner;
    return this;
  }

 /**
   * Get userPermissionsList
   * @return userPermissionsList
  **/
  @JsonProperty("userPermissionsList")
  public UserPermissionsListResponse getUserPermissionsList() {
    return userPermissionsList;
  }

  public void setUserPermissionsList(UserPermissionsListResponse userPermissionsList) {
    this.userPermissionsList = userPermissionsList;
  }

  public GameResponse userPermissionsList(UserPermissionsListResponse userPermissionsList) {
    this.userPermissionsList = userPermissionsList;
    return this;
  }

 /**
   * Get rules
   * @return rules
  **/
  @JsonProperty("rules")
  public RuleListResponse getRules() {
    return rules;
  }

  public void setRules(RuleListResponse rules) {
    this.rules = rules;
  }

  public GameResponse rules(RuleListResponse rules) {
    this.rules = rules;
    return this;
  }

 /**
   * Get results
   * @return results
  **/
  @JsonProperty("results")
  public List<@Valid NameStringValueResponse> getResults() {
    return results;
  }

  public void setResults(List<@Valid NameStringValueResponse> results) {
    this.results = results;
  }

  public GameResponse results(List<@Valid NameStringValueResponse> results) {
    this.results = results;
    return this;
  }

  public GameResponse addResultsItem(NameStringValueResponse resultsItem) {
    this.results.add(resultsItem);
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

  public GameResponse ticketsEarned(Long ticketsEarned) {
    this.ticketsEarned = ticketsEarned;
    return this;
  }

 /**
   * Get title
   * @return title
  **/
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public GameResponse title(String title) {
    this.title = title;
    return this;
  }

 /**
   * Get description
   * @return description
  **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public GameResponse description(String description) {
    this.description = description;
    return this;
  }

 /**
   * Get authorOverride
   * @return authorOverride
  **/
  @JsonProperty("authorOverride")
  public String getAuthorOverride() {
    return authorOverride;
  }

  public void setAuthorOverride(String authorOverride) {
    this.authorOverride = authorOverride;
  }

  public GameResponse authorOverride(String authorOverride) {
    this.authorOverride = authorOverride;
    return this;
  }

 /**
   * Get icon
   * @return icon
  **/
  @JsonProperty("icon")
  public AssetShortResponse getIcon() {
    return icon;
  }

  public void setIcon(AssetShortResponse icon) {
    this.icon = icon;
  }

  public GameResponse icon(AssetShortResponse icon) {
    this.icon = icon;
    return this;
  }

 /**
   * Get image
   * @return image
  **/
  @JsonProperty("image")
  public AssetShortResponse getImage() {
    return image;
  }

  public void setImage(AssetShortResponse image) {
    this.image = image;
  }

  public GameResponse image(AssetShortResponse image) {
    this.image = image;
    return this;
  }

 /**
   * Get sequenceType
   * @return sequenceType
  **/
  @JsonProperty("sequenceType")
  public String getSequenceType() {
    return sequenceType;
  }

  public void setSequenceType(String sequenceType) {
    this.sequenceType = sequenceType;
  }

  public GameResponse sequenceType(String sequenceType) {
    this.sequenceType = sequenceType;
    return this;
  }

 /**
   * Get updatedDate
   * @return updatedDate
  **/
  @JsonProperty("updatedDate")
  public Long getUpdatedDate() {
    return updatedDate;
  }

  public void setUpdatedDate(Long updatedDate) {
    this.updatedDate = updatedDate;
  }

  public GameResponse updatedDate(Long updatedDate) {
    this.updatedDate = updatedDate;
    return this;
  }

 /**
   * Get startDate
   * @return startDate
  **/
  @JsonProperty("startDate")
  public Long getStartDate() {
    return startDate;
  }

  public void setStartDate(Long startDate) {
    this.startDate = startDate;
  }

  public GameResponse startDate(Long startDate) {
    this.startDate = startDate;
    return this;
  }

 /**
   * Get endDate
   * @return endDate
  **/
  @JsonProperty("endDate")
  public Long getEndDate() {
    return endDate;
  }

  public void setEndDate(Long endDate) {
    this.endDate = endDate;
  }

  public GameResponse endDate(Long endDate) {
    this.endDate = endDate;
    return this;
  }

 /**
   * Get appKey
   * @return appKey
  **/
  @JsonProperty("appKey")
  public String getAppKey() {
    return appKey;
  }

  public void setAppKey(String appKey) {
    this.appKey = appKey;
  }

  public GameResponse appKey(String appKey) {
    this.appKey = appKey;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


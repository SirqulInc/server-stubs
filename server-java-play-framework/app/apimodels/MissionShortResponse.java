package apimodels;

import apimodels.AccountShortResponse;
import apimodels.AssetShortResponse;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * MissionShortResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class MissionShortResponse   {
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

  @JsonProperty("highestAppVersion")
  
  private String highestAppVersion;

  @JsonProperty("missionId")
  
  private Long missionId;

  @JsonProperty("ticketsEarned")
  
  private Long ticketsEarned;

  @JsonProperty("costToPlay")
  
  private Integer costToPlay;

  @JsonProperty("costToPlayType")
  
  private String costToPlayType;

  @JsonProperty("owner")
  @Valid

  private AccountShortResponse owner;

  @JsonProperty("title")
  
  private String title;

  @JsonProperty("description")
  
  private String description;

  @JsonProperty("authorOverride")
  
  private String authorOverride;

  @JsonProperty("icon")
  @Valid

  private AssetShortResponse icon;

  @JsonProperty("image")
  @Valid

  private AssetShortResponse image;

  @JsonProperty("sequenceType")
  
  private String sequenceType;

  @JsonProperty("updatedDate")
  
  private Long updatedDate;

  @JsonProperty("startDate")
  
  private Long startDate;

  @JsonProperty("endDate")
  
  private Long endDate;

  @JsonProperty("missionType")
  
  private String missionType;

  @JsonProperty("active")
  
  private Boolean active;

  @JsonProperty("balance")
  
  private Double balance;

  @JsonProperty("availableLimit")
  
  private Integer availableLimit;

  @JsonProperty("inviteCount")
  
  private Integer inviteCount;

  @JsonProperty("acceptedCount")
  
  private Integer acceptedCount;

  @JsonProperty("childCount")
  
  private Long childCount;

  @JsonProperty("enableBuyBack")
  
  private Boolean enableBuyBack;

  @JsonProperty("minimumToPlay")
  
  private Integer minimumToPlay;

  @JsonProperty("rewarded")
  
  private Boolean rewarded;

  @JsonProperty("refunded")
  
  private Boolean refunded;

  @JsonProperty("joinCode")
  
  private String joinCode;

  public MissionShortResponse action(ActionEnum action) {
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

  public MissionShortResponse highestAppVersion(String highestAppVersion) {
    this.highestAppVersion = highestAppVersion;
    return this;
  }

   /**
   * Get highestAppVersion
   * @return highestAppVersion
  **/
  public String getHighestAppVersion() {
    return highestAppVersion;
  }

  public void setHighestAppVersion(String highestAppVersion) {
    this.highestAppVersion = highestAppVersion;
  }

  public MissionShortResponse missionId(Long missionId) {
    this.missionId = missionId;
    return this;
  }

   /**
   * Get missionId
   * @return missionId
  **/
  public Long getMissionId() {
    return missionId;
  }

  public void setMissionId(Long missionId) {
    this.missionId = missionId;
  }

  public MissionShortResponse ticketsEarned(Long ticketsEarned) {
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

  public MissionShortResponse costToPlay(Integer costToPlay) {
    this.costToPlay = costToPlay;
    return this;
  }

   /**
   * Get costToPlay
   * @return costToPlay
  **/
  public Integer getCostToPlay() {
    return costToPlay;
  }

  public void setCostToPlay(Integer costToPlay) {
    this.costToPlay = costToPlay;
  }

  public MissionShortResponse costToPlayType(String costToPlayType) {
    this.costToPlayType = costToPlayType;
    return this;
  }

   /**
   * Get costToPlayType
   * @return costToPlayType
  **/
  public String getCostToPlayType() {
    return costToPlayType;
  }

  public void setCostToPlayType(String costToPlayType) {
    this.costToPlayType = costToPlayType;
  }

  public MissionShortResponse owner(AccountShortResponse owner) {
    this.owner = owner;
    return this;
  }

   /**
   * Get owner
   * @return owner
  **/
  public AccountShortResponse getOwner() {
    return owner;
  }

  public void setOwner(AccountShortResponse owner) {
    this.owner = owner;
  }

  public MissionShortResponse title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public MissionShortResponse description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public MissionShortResponse authorOverride(String authorOverride) {
    this.authorOverride = authorOverride;
    return this;
  }

   /**
   * Get authorOverride
   * @return authorOverride
  **/
  public String getAuthorOverride() {
    return authorOverride;
  }

  public void setAuthorOverride(String authorOverride) {
    this.authorOverride = authorOverride;
  }

  public MissionShortResponse icon(AssetShortResponse icon) {
    this.icon = icon;
    return this;
  }

   /**
   * Get icon
   * @return icon
  **/
  public AssetShortResponse getIcon() {
    return icon;
  }

  public void setIcon(AssetShortResponse icon) {
    this.icon = icon;
  }

  public MissionShortResponse image(AssetShortResponse image) {
    this.image = image;
    return this;
  }

   /**
   * Get image
   * @return image
  **/
  public AssetShortResponse getImage() {
    return image;
  }

  public void setImage(AssetShortResponse image) {
    this.image = image;
  }

  public MissionShortResponse sequenceType(String sequenceType) {
    this.sequenceType = sequenceType;
    return this;
  }

   /**
   * Get sequenceType
   * @return sequenceType
  **/
  public String getSequenceType() {
    return sequenceType;
  }

  public void setSequenceType(String sequenceType) {
    this.sequenceType = sequenceType;
  }

  public MissionShortResponse updatedDate(Long updatedDate) {
    this.updatedDate = updatedDate;
    return this;
  }

   /**
   * Get updatedDate
   * @return updatedDate
  **/
  public Long getUpdatedDate() {
    return updatedDate;
  }

  public void setUpdatedDate(Long updatedDate) {
    this.updatedDate = updatedDate;
  }

  public MissionShortResponse startDate(Long startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  public Long getStartDate() {
    return startDate;
  }

  public void setStartDate(Long startDate) {
    this.startDate = startDate;
  }

  public MissionShortResponse endDate(Long endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * Get endDate
   * @return endDate
  **/
  public Long getEndDate() {
    return endDate;
  }

  public void setEndDate(Long endDate) {
    this.endDate = endDate;
  }

  public MissionShortResponse missionType(String missionType) {
    this.missionType = missionType;
    return this;
  }

   /**
   * Get missionType
   * @return missionType
  **/
  public String getMissionType() {
    return missionType;
  }

  public void setMissionType(String missionType) {
    this.missionType = missionType;
  }

  public MissionShortResponse active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public MissionShortResponse balance(Double balance) {
    this.balance = balance;
    return this;
  }

   /**
   * Get balance
   * @return balance
  **/
  public Double getBalance() {
    return balance;
  }

  public void setBalance(Double balance) {
    this.balance = balance;
  }

  public MissionShortResponse availableLimit(Integer availableLimit) {
    this.availableLimit = availableLimit;
    return this;
  }

   /**
   * Get availableLimit
   * @return availableLimit
  **/
  public Integer getAvailableLimit() {
    return availableLimit;
  }

  public void setAvailableLimit(Integer availableLimit) {
    this.availableLimit = availableLimit;
  }

  public MissionShortResponse inviteCount(Integer inviteCount) {
    this.inviteCount = inviteCount;
    return this;
  }

   /**
   * Get inviteCount
   * @return inviteCount
  **/
  public Integer getInviteCount() {
    return inviteCount;
  }

  public void setInviteCount(Integer inviteCount) {
    this.inviteCount = inviteCount;
  }

  public MissionShortResponse acceptedCount(Integer acceptedCount) {
    this.acceptedCount = acceptedCount;
    return this;
  }

   /**
   * Get acceptedCount
   * @return acceptedCount
  **/
  public Integer getAcceptedCount() {
    return acceptedCount;
  }

  public void setAcceptedCount(Integer acceptedCount) {
    this.acceptedCount = acceptedCount;
  }

  public MissionShortResponse childCount(Long childCount) {
    this.childCount = childCount;
    return this;
  }

   /**
   * Get childCount
   * @return childCount
  **/
  public Long getChildCount() {
    return childCount;
  }

  public void setChildCount(Long childCount) {
    this.childCount = childCount;
  }

  public MissionShortResponse enableBuyBack(Boolean enableBuyBack) {
    this.enableBuyBack = enableBuyBack;
    return this;
  }

   /**
   * Get enableBuyBack
   * @return enableBuyBack
  **/
  public Boolean getEnableBuyBack() {
    return enableBuyBack;
  }

  public void setEnableBuyBack(Boolean enableBuyBack) {
    this.enableBuyBack = enableBuyBack;
  }

  public MissionShortResponse minimumToPlay(Integer minimumToPlay) {
    this.minimumToPlay = minimumToPlay;
    return this;
  }

   /**
   * Get minimumToPlay
   * @return minimumToPlay
  **/
  public Integer getMinimumToPlay() {
    return minimumToPlay;
  }

  public void setMinimumToPlay(Integer minimumToPlay) {
    this.minimumToPlay = minimumToPlay;
  }

  public MissionShortResponse rewarded(Boolean rewarded) {
    this.rewarded = rewarded;
    return this;
  }

   /**
   * Get rewarded
   * @return rewarded
  **/
  public Boolean getRewarded() {
    return rewarded;
  }

  public void setRewarded(Boolean rewarded) {
    this.rewarded = rewarded;
  }

  public MissionShortResponse refunded(Boolean refunded) {
    this.refunded = refunded;
    return this;
  }

   /**
   * Get refunded
   * @return refunded
  **/
  public Boolean getRefunded() {
    return refunded;
  }

  public void setRefunded(Boolean refunded) {
    this.refunded = refunded;
  }

  public MissionShortResponse joinCode(String joinCode) {
    this.joinCode = joinCode;
    return this;
  }

   /**
   * Get joinCode
   * @return joinCode
  **/
  public String getJoinCode() {
    return joinCode;
  }

  public void setJoinCode(String joinCode) {
    this.joinCode = joinCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MissionShortResponse missionShortResponse = (MissionShortResponse) o;
    return Objects.equals(action, missionShortResponse.action) &&
        Objects.equals(highestAppVersion, missionShortResponse.highestAppVersion) &&
        Objects.equals(missionId, missionShortResponse.missionId) &&
        Objects.equals(ticketsEarned, missionShortResponse.ticketsEarned) &&
        Objects.equals(costToPlay, missionShortResponse.costToPlay) &&
        Objects.equals(costToPlayType, missionShortResponse.costToPlayType) &&
        Objects.equals(owner, missionShortResponse.owner) &&
        Objects.equals(title, missionShortResponse.title) &&
        Objects.equals(description, missionShortResponse.description) &&
        Objects.equals(authorOverride, missionShortResponse.authorOverride) &&
        Objects.equals(icon, missionShortResponse.icon) &&
        Objects.equals(image, missionShortResponse.image) &&
        Objects.equals(sequenceType, missionShortResponse.sequenceType) &&
        Objects.equals(updatedDate, missionShortResponse.updatedDate) &&
        Objects.equals(startDate, missionShortResponse.startDate) &&
        Objects.equals(endDate, missionShortResponse.endDate) &&
        Objects.equals(missionType, missionShortResponse.missionType) &&
        Objects.equals(active, missionShortResponse.active) &&
        Objects.equals(balance, missionShortResponse.balance) &&
        Objects.equals(availableLimit, missionShortResponse.availableLimit) &&
        Objects.equals(inviteCount, missionShortResponse.inviteCount) &&
        Objects.equals(acceptedCount, missionShortResponse.acceptedCount) &&
        Objects.equals(childCount, missionShortResponse.childCount) &&
        Objects.equals(enableBuyBack, missionShortResponse.enableBuyBack) &&
        Objects.equals(minimumToPlay, missionShortResponse.minimumToPlay) &&
        Objects.equals(rewarded, missionShortResponse.rewarded) &&
        Objects.equals(refunded, missionShortResponse.refunded) &&
        Objects.equals(joinCode, missionShortResponse.joinCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, highestAppVersion, missionId, ticketsEarned, costToPlay, costToPlayType, owner, title, description, authorOverride, icon, image, sequenceType, updatedDate, startDate, endDate, missionType, active, balance, availableLimit, inviteCount, acceptedCount, childCount, enableBuyBack, minimumToPlay, rewarded, refunded, joinCode);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MissionShortResponse {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    highestAppVersion: ").append(toIndentedString(highestAppVersion)).append("\n");
    sb.append("    missionId: ").append(toIndentedString(missionId)).append("\n");
    sb.append("    ticketsEarned: ").append(toIndentedString(ticketsEarned)).append("\n");
    sb.append("    costToPlay: ").append(toIndentedString(costToPlay)).append("\n");
    sb.append("    costToPlayType: ").append(toIndentedString(costToPlayType)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    authorOverride: ").append(toIndentedString(authorOverride)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    sequenceType: ").append(toIndentedString(sequenceType)).append("\n");
    sb.append("    updatedDate: ").append(toIndentedString(updatedDate)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    missionType: ").append(toIndentedString(missionType)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    availableLimit: ").append(toIndentedString(availableLimit)).append("\n");
    sb.append("    inviteCount: ").append(toIndentedString(inviteCount)).append("\n");
    sb.append("    acceptedCount: ").append(toIndentedString(acceptedCount)).append("\n");
    sb.append("    childCount: ").append(toIndentedString(childCount)).append("\n");
    sb.append("    enableBuyBack: ").append(toIndentedString(enableBuyBack)).append("\n");
    sb.append("    minimumToPlay: ").append(toIndentedString(minimumToPlay)).append("\n");
    sb.append("    rewarded: ").append(toIndentedString(rewarded)).append("\n");
    sb.append("    refunded: ").append(toIndentedString(refunded)).append("\n");
    sb.append("    joinCode: ").append(toIndentedString(joinCode)).append("\n");
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


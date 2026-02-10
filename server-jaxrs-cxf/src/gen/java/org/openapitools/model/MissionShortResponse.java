package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.AccountShortResponse;
import org.openapitools.model.AssetShortResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class MissionShortResponse  {
  
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

  private Long missionId;

  @ApiModelProperty(value = "")

  private Long ticketsEarned;

  @ApiModelProperty(value = "")

  private Integer costToPlay;

  @ApiModelProperty(value = "")

  private String costToPlayType;

  @ApiModelProperty(value = "")

  @Valid

  private AccountShortResponse owner;

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

  private String missionType;

  @ApiModelProperty(value = "")

  private Boolean active;

  @ApiModelProperty(value = "")

  private Double balance;

  @ApiModelProperty(value = "")

  private Integer availableLimit;

  @ApiModelProperty(value = "")

  private Integer inviteCount;

  @ApiModelProperty(value = "")

  private Integer acceptedCount;

  @ApiModelProperty(value = "")

  private Long childCount;

  @ApiModelProperty(value = "")

  private Boolean enableBuyBack;

  @ApiModelProperty(value = "")

  private Integer minimumToPlay;

  @ApiModelProperty(value = "")

  private Boolean rewarded;

  @ApiModelProperty(value = "")

  private Boolean refunded;

  @ApiModelProperty(value = "")

  private String joinCode;
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

  public MissionShortResponse action(ActionEnum action) {
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

  public MissionShortResponse highestAppVersion(String highestAppVersion) {
    this.highestAppVersion = highestAppVersion;
    return this;
  }

 /**
   * Get missionId
   * @return missionId
  **/
  @JsonProperty("missionId")
  public Long getMissionId() {
    return missionId;
  }

  public void setMissionId(Long missionId) {
    this.missionId = missionId;
  }

  public MissionShortResponse missionId(Long missionId) {
    this.missionId = missionId;
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

  public MissionShortResponse ticketsEarned(Long ticketsEarned) {
    this.ticketsEarned = ticketsEarned;
    return this;
  }

 /**
   * Get costToPlay
   * @return costToPlay
  **/
  @JsonProperty("costToPlay")
  public Integer getCostToPlay() {
    return costToPlay;
  }

  public void setCostToPlay(Integer costToPlay) {
    this.costToPlay = costToPlay;
  }

  public MissionShortResponse costToPlay(Integer costToPlay) {
    this.costToPlay = costToPlay;
    return this;
  }

 /**
   * Get costToPlayType
   * @return costToPlayType
  **/
  @JsonProperty("costToPlayType")
  public String getCostToPlayType() {
    return costToPlayType;
  }

  public void setCostToPlayType(String costToPlayType) {
    this.costToPlayType = costToPlayType;
  }

  public MissionShortResponse costToPlayType(String costToPlayType) {
    this.costToPlayType = costToPlayType;
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

  public MissionShortResponse owner(AccountShortResponse owner) {
    this.owner = owner;
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

  public MissionShortResponse title(String title) {
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

  public MissionShortResponse description(String description) {
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

  public MissionShortResponse authorOverride(String authorOverride) {
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

  public MissionShortResponse icon(AssetShortResponse icon) {
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

  public MissionShortResponse image(AssetShortResponse image) {
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

  public MissionShortResponse sequenceType(String sequenceType) {
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

  public MissionShortResponse updatedDate(Long updatedDate) {
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

  public MissionShortResponse startDate(Long startDate) {
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

  public MissionShortResponse endDate(Long endDate) {
    this.endDate = endDate;
    return this;
  }

 /**
   * Get missionType
   * @return missionType
  **/
  @JsonProperty("missionType")
  public String getMissionType() {
    return missionType;
  }

  public void setMissionType(String missionType) {
    this.missionType = missionType;
  }

  public MissionShortResponse missionType(String missionType) {
    this.missionType = missionType;
    return this;
  }

 /**
   * Get active
   * @return active
  **/
  @JsonProperty("active")
  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public MissionShortResponse active(Boolean active) {
    this.active = active;
    return this;
  }

 /**
   * Get balance
   * @return balance
  **/
  @JsonProperty("balance")
  public Double getBalance() {
    return balance;
  }

  public void setBalance(Double balance) {
    this.balance = balance;
  }

  public MissionShortResponse balance(Double balance) {
    this.balance = balance;
    return this;
  }

 /**
   * Get availableLimit
   * @return availableLimit
  **/
  @JsonProperty("availableLimit")
  public Integer getAvailableLimit() {
    return availableLimit;
  }

  public void setAvailableLimit(Integer availableLimit) {
    this.availableLimit = availableLimit;
  }

  public MissionShortResponse availableLimit(Integer availableLimit) {
    this.availableLimit = availableLimit;
    return this;
  }

 /**
   * Get inviteCount
   * @return inviteCount
  **/
  @JsonProperty("inviteCount")
  public Integer getInviteCount() {
    return inviteCount;
  }

  public void setInviteCount(Integer inviteCount) {
    this.inviteCount = inviteCount;
  }

  public MissionShortResponse inviteCount(Integer inviteCount) {
    this.inviteCount = inviteCount;
    return this;
  }

 /**
   * Get acceptedCount
   * @return acceptedCount
  **/
  @JsonProperty("acceptedCount")
  public Integer getAcceptedCount() {
    return acceptedCount;
  }

  public void setAcceptedCount(Integer acceptedCount) {
    this.acceptedCount = acceptedCount;
  }

  public MissionShortResponse acceptedCount(Integer acceptedCount) {
    this.acceptedCount = acceptedCount;
    return this;
  }

 /**
   * Get childCount
   * @return childCount
  **/
  @JsonProperty("childCount")
  public Long getChildCount() {
    return childCount;
  }

  public void setChildCount(Long childCount) {
    this.childCount = childCount;
  }

  public MissionShortResponse childCount(Long childCount) {
    this.childCount = childCount;
    return this;
  }

 /**
   * Get enableBuyBack
   * @return enableBuyBack
  **/
  @JsonProperty("enableBuyBack")
  public Boolean getEnableBuyBack() {
    return enableBuyBack;
  }

  public void setEnableBuyBack(Boolean enableBuyBack) {
    this.enableBuyBack = enableBuyBack;
  }

  public MissionShortResponse enableBuyBack(Boolean enableBuyBack) {
    this.enableBuyBack = enableBuyBack;
    return this;
  }

 /**
   * Get minimumToPlay
   * @return minimumToPlay
  **/
  @JsonProperty("minimumToPlay")
  public Integer getMinimumToPlay() {
    return minimumToPlay;
  }

  public void setMinimumToPlay(Integer minimumToPlay) {
    this.minimumToPlay = minimumToPlay;
  }

  public MissionShortResponse minimumToPlay(Integer minimumToPlay) {
    this.minimumToPlay = minimumToPlay;
    return this;
  }

 /**
   * Get rewarded
   * @return rewarded
  **/
  @JsonProperty("rewarded")
  public Boolean getRewarded() {
    return rewarded;
  }

  public void setRewarded(Boolean rewarded) {
    this.rewarded = rewarded;
  }

  public MissionShortResponse rewarded(Boolean rewarded) {
    this.rewarded = rewarded;
    return this;
  }

 /**
   * Get refunded
   * @return refunded
  **/
  @JsonProperty("refunded")
  public Boolean getRefunded() {
    return refunded;
  }

  public void setRefunded(Boolean refunded) {
    this.refunded = refunded;
  }

  public MissionShortResponse refunded(Boolean refunded) {
    this.refunded = refunded;
    return this;
  }

 /**
   * Get joinCode
   * @return joinCode
  **/
  @JsonProperty("joinCode")
  public String getJoinCode() {
    return joinCode;
  }

  public void setJoinCode(String joinCode) {
    this.joinCode = joinCode;
  }

  public MissionShortResponse joinCode(String joinCode) {
    this.joinCode = joinCode;
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
    MissionShortResponse missionShortResponse = (MissionShortResponse) o;
    return Objects.equals(this.action, missionShortResponse.action) &&
        Objects.equals(this.highestAppVersion, missionShortResponse.highestAppVersion) &&
        Objects.equals(this.missionId, missionShortResponse.missionId) &&
        Objects.equals(this.ticketsEarned, missionShortResponse.ticketsEarned) &&
        Objects.equals(this.costToPlay, missionShortResponse.costToPlay) &&
        Objects.equals(this.costToPlayType, missionShortResponse.costToPlayType) &&
        Objects.equals(this.owner, missionShortResponse.owner) &&
        Objects.equals(this.title, missionShortResponse.title) &&
        Objects.equals(this.description, missionShortResponse.description) &&
        Objects.equals(this.authorOverride, missionShortResponse.authorOverride) &&
        Objects.equals(this.icon, missionShortResponse.icon) &&
        Objects.equals(this.image, missionShortResponse.image) &&
        Objects.equals(this.sequenceType, missionShortResponse.sequenceType) &&
        Objects.equals(this.updatedDate, missionShortResponse.updatedDate) &&
        Objects.equals(this.startDate, missionShortResponse.startDate) &&
        Objects.equals(this.endDate, missionShortResponse.endDate) &&
        Objects.equals(this.missionType, missionShortResponse.missionType) &&
        Objects.equals(this.active, missionShortResponse.active) &&
        Objects.equals(this.balance, missionShortResponse.balance) &&
        Objects.equals(this.availableLimit, missionShortResponse.availableLimit) &&
        Objects.equals(this.inviteCount, missionShortResponse.inviteCount) &&
        Objects.equals(this.acceptedCount, missionShortResponse.acceptedCount) &&
        Objects.equals(this.childCount, missionShortResponse.childCount) &&
        Objects.equals(this.enableBuyBack, missionShortResponse.enableBuyBack) &&
        Objects.equals(this.minimumToPlay, missionShortResponse.minimumToPlay) &&
        Objects.equals(this.rewarded, missionShortResponse.rewarded) &&
        Objects.equals(this.refunded, missionShortResponse.refunded) &&
        Objects.equals(this.joinCode, missionShortResponse.joinCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, highestAppVersion, missionId, ticketsEarned, costToPlay, costToPlayType, owner, title, description, authorOverride, icon, image, sequenceType, updatedDate, startDate, endDate, missionType, active, balance, availableLimit, inviteCount, acceptedCount, childCount, enableBuyBack, minimumToPlay, rewarded, refunded, joinCode);
  }

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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


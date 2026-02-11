package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AccountShortResponse;
import org.openapitools.model.AssetShortResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class MissionShortResponse   {
  

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
  private Long missionId;
  private Long ticketsEarned;
  private Integer costToPlay;
  private String costToPlayType;
  private AccountShortResponse owner;
  private String title;
  private String description;
  private String authorOverride;
  private AssetShortResponse icon;
  private AssetShortResponse image;
  private String sequenceType;
  private Long updatedDate;
  private Long startDate;
  private Long endDate;
  private String missionType;
  private Boolean active;
  private Double balance;
  private Integer availableLimit;
  private Integer inviteCount;
  private Integer acceptedCount;
  private Long childCount;
  private Boolean enableBuyBack;
  private Integer minimumToPlay;
  private Boolean rewarded;
  private Boolean refunded;
  private String joinCode;

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
  @JsonProperty("missionId")
  public Long getMissionId() {
    return missionId;
  }
  public void setMissionId(Long missionId) {
    this.missionId = missionId;
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
  @JsonProperty("costToPlay")
  public Integer getCostToPlay() {
    return costToPlay;
  }
  public void setCostToPlay(Integer costToPlay) {
    this.costToPlay = costToPlay;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("costToPlayType")
  public String getCostToPlayType() {
    return costToPlayType;
  }
  public void setCostToPlayType(String costToPlayType) {
    this.costToPlayType = costToPlayType;
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
  @JsonProperty("missionType")
  public String getMissionType() {
    return missionType;
  }
  public void setMissionType(String missionType) {
    this.missionType = missionType;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("active")
  public Boolean getActive() {
    return active;
  }
  public void setActive(Boolean active) {
    this.active = active;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("balance")
  public Double getBalance() {
    return balance;
  }
  public void setBalance(Double balance) {
    this.balance = balance;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("availableLimit")
  public Integer getAvailableLimit() {
    return availableLimit;
  }
  public void setAvailableLimit(Integer availableLimit) {
    this.availableLimit = availableLimit;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("inviteCount")
  public Integer getInviteCount() {
    return inviteCount;
  }
  public void setInviteCount(Integer inviteCount) {
    this.inviteCount = inviteCount;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("acceptedCount")
  public Integer getAcceptedCount() {
    return acceptedCount;
  }
  public void setAcceptedCount(Integer acceptedCount) {
    this.acceptedCount = acceptedCount;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("childCount")
  public Long getChildCount() {
    return childCount;
  }
  public void setChildCount(Long childCount) {
    this.childCount = childCount;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("enableBuyBack")
  public Boolean getEnableBuyBack() {
    return enableBuyBack;
  }
  public void setEnableBuyBack(Boolean enableBuyBack) {
    this.enableBuyBack = enableBuyBack;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("minimumToPlay")
  public Integer getMinimumToPlay() {
    return minimumToPlay;
  }
  public void setMinimumToPlay(Integer minimumToPlay) {
    this.minimumToPlay = minimumToPlay;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("rewarded")
  public Boolean getRewarded() {
    return rewarded;
  }
  public void setRewarded(Boolean rewarded) {
    this.rewarded = rewarded;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("refunded")
  public Boolean getRefunded() {
    return refunded;
  }
  public void setRefunded(Boolean refunded) {
    this.refunded = refunded;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("joinCode")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


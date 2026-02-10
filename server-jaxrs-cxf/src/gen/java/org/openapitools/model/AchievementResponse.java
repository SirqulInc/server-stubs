package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AchievementTierResponse;
import org.openapitools.model.NameStringValueResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AchievementResponse  {
  
  @ApiModelProperty(value = "")

  private Boolean valid;

  @ApiModelProperty(value = "")

  private String message;

  @ApiModelProperty(value = "")

  private Double version;

  @ApiModelProperty(value = "")

  private Boolean serializeNulls;

  @ApiModelProperty(value = "")

  private Long startTimeLog;

  @ApiModelProperty(value = "")

  private String errorCode;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid NameStringValueResponse> request = new ArrayList<>();

  @ApiModelProperty(value = "")

  private Long achievementId;

  @ApiModelProperty(value = "")

  private String title;

  @ApiModelProperty(value = "")

  private String description;

  @ApiModelProperty(value = "")

  private String analyticsTag;

  @ApiModelProperty(value = "")

  private String rankType;

  @ApiModelProperty(value = "")

  private Integer rankIncrement;

  @ApiModelProperty(value = "")

  private Boolean validate;

  @ApiModelProperty(value = "")

  private String appName;

  @ApiModelProperty(value = "")

  private Boolean active;

  @ApiModelProperty(value = "")

  private Long updated;

  @ApiModelProperty(value = "")

  private Long created;

  @ApiModelProperty(value = "")

  private Integer tierCount;

  @ApiModelProperty(value = "")

  private Integer minIncrement;

  @ApiModelProperty(value = "")

  private Integer maxIncrement;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid AchievementTierResponse> tiers = new ArrayList<>();

  @ApiModelProperty(value = "")

  private String returning;
 /**
   * Get valid
   * @return valid
  **/
  @JsonProperty("valid")
  public Boolean getValid() {
    return valid;
  }

  public void setValid(Boolean valid) {
    this.valid = valid;
  }

  public AchievementResponse valid(Boolean valid) {
    this.valid = valid;
    return this;
  }

 /**
   * Get message
   * @return message
  **/
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public AchievementResponse message(String message) {
    this.message = message;
    return this;
  }

 /**
   * Get version
   * @return version
  **/
  @JsonProperty("version")
  public Double getVersion() {
    return version;
  }

  public void setVersion(Double version) {
    this.version = version;
  }

  public AchievementResponse version(Double version) {
    this.version = version;
    return this;
  }

 /**
   * Get serializeNulls
   * @return serializeNulls
  **/
  @JsonProperty("serializeNulls")
  public Boolean getSerializeNulls() {
    return serializeNulls;
  }

  public void setSerializeNulls(Boolean serializeNulls) {
    this.serializeNulls = serializeNulls;
  }

  public AchievementResponse serializeNulls(Boolean serializeNulls) {
    this.serializeNulls = serializeNulls;
    return this;
  }

 /**
   * Get startTimeLog
   * @return startTimeLog
  **/
  @JsonProperty("startTimeLog")
  public Long getStartTimeLog() {
    return startTimeLog;
  }

  public void setStartTimeLog(Long startTimeLog) {
    this.startTimeLog = startTimeLog;
  }

  public AchievementResponse startTimeLog(Long startTimeLog) {
    this.startTimeLog = startTimeLog;
    return this;
  }

 /**
   * Get errorCode
   * @return errorCode
  **/
  @JsonProperty("errorCode")
  public String getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  public AchievementResponse errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

 /**
   * Get request
   * @return request
  **/
  @JsonProperty("request")
  public List<@Valid NameStringValueResponse> getRequest() {
    return request;
  }

  public void setRequest(List<@Valid NameStringValueResponse> request) {
    this.request = request;
  }

  public AchievementResponse request(List<@Valid NameStringValueResponse> request) {
    this.request = request;
    return this;
  }

  public AchievementResponse addRequestItem(NameStringValueResponse requestItem) {
    this.request.add(requestItem);
    return this;
  }

 /**
   * Get achievementId
   * @return achievementId
  **/
  @JsonProperty("achievementId")
  public Long getAchievementId() {
    return achievementId;
  }

  public void setAchievementId(Long achievementId) {
    this.achievementId = achievementId;
  }

  public AchievementResponse achievementId(Long achievementId) {
    this.achievementId = achievementId;
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

  public AchievementResponse title(String title) {
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

  public AchievementResponse description(String description) {
    this.description = description;
    return this;
  }

 /**
   * Get analyticsTag
   * @return analyticsTag
  **/
  @JsonProperty("analyticsTag")
  public String getAnalyticsTag() {
    return analyticsTag;
  }

  public void setAnalyticsTag(String analyticsTag) {
    this.analyticsTag = analyticsTag;
  }

  public AchievementResponse analyticsTag(String analyticsTag) {
    this.analyticsTag = analyticsTag;
    return this;
  }

 /**
   * Get rankType
   * @return rankType
  **/
  @JsonProperty("rankType")
  public String getRankType() {
    return rankType;
  }

  public void setRankType(String rankType) {
    this.rankType = rankType;
  }

  public AchievementResponse rankType(String rankType) {
    this.rankType = rankType;
    return this;
  }

 /**
   * Get rankIncrement
   * @return rankIncrement
  **/
  @JsonProperty("rankIncrement")
  public Integer getRankIncrement() {
    return rankIncrement;
  }

  public void setRankIncrement(Integer rankIncrement) {
    this.rankIncrement = rankIncrement;
  }

  public AchievementResponse rankIncrement(Integer rankIncrement) {
    this.rankIncrement = rankIncrement;
    return this;
  }

 /**
   * Get validate
   * @return validate
  **/
  @JsonProperty("validate")
  public Boolean getValidate() {
    return validate;
  }

  public void setValidate(Boolean validate) {
    this.validate = validate;
  }

  public AchievementResponse validate(Boolean validate) {
    this.validate = validate;
    return this;
  }

 /**
   * Get appName
   * @return appName
  **/
  @JsonProperty("appName")
  public String getAppName() {
    return appName;
  }

  public void setAppName(String appName) {
    this.appName = appName;
  }

  public AchievementResponse appName(String appName) {
    this.appName = appName;
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

  public AchievementResponse active(Boolean active) {
    this.active = active;
    return this;
  }

 /**
   * Get updated
   * @return updated
  **/
  @JsonProperty("updated")
  public Long getUpdated() {
    return updated;
  }

  public void setUpdated(Long updated) {
    this.updated = updated;
  }

  public AchievementResponse updated(Long updated) {
    this.updated = updated;
    return this;
  }

 /**
   * Get created
   * @return created
  **/
  @JsonProperty("created")
  public Long getCreated() {
    return created;
  }

  public void setCreated(Long created) {
    this.created = created;
  }

  public AchievementResponse created(Long created) {
    this.created = created;
    return this;
  }

 /**
   * Get tierCount
   * @return tierCount
  **/
  @JsonProperty("tierCount")
  public Integer getTierCount() {
    return tierCount;
  }

  public void setTierCount(Integer tierCount) {
    this.tierCount = tierCount;
  }

  public AchievementResponse tierCount(Integer tierCount) {
    this.tierCount = tierCount;
    return this;
  }

 /**
   * Get minIncrement
   * @return minIncrement
  **/
  @JsonProperty("minIncrement")
  public Integer getMinIncrement() {
    return minIncrement;
  }

  public void setMinIncrement(Integer minIncrement) {
    this.minIncrement = minIncrement;
  }

  public AchievementResponse minIncrement(Integer minIncrement) {
    this.minIncrement = minIncrement;
    return this;
  }

 /**
   * Get maxIncrement
   * @return maxIncrement
  **/
  @JsonProperty("maxIncrement")
  public Integer getMaxIncrement() {
    return maxIncrement;
  }

  public void setMaxIncrement(Integer maxIncrement) {
    this.maxIncrement = maxIncrement;
  }

  public AchievementResponse maxIncrement(Integer maxIncrement) {
    this.maxIncrement = maxIncrement;
    return this;
  }

 /**
   * Get tiers
   * @return tiers
  **/
  @JsonProperty("tiers")
  public List<@Valid AchievementTierResponse> getTiers() {
    return tiers;
  }

  public void setTiers(List<@Valid AchievementTierResponse> tiers) {
    this.tiers = tiers;
  }

  public AchievementResponse tiers(List<@Valid AchievementTierResponse> tiers) {
    this.tiers = tiers;
    return this;
  }

  public AchievementResponse addTiersItem(AchievementTierResponse tiersItem) {
    this.tiers.add(tiersItem);
    return this;
  }

 /**
   * Get returning
   * @return returning
  **/
  @JsonProperty("returning")
  public String getReturning() {
    return returning;
  }

  public void setReturning(String returning) {
    this.returning = returning;
  }

  public AchievementResponse returning(String returning) {
    this.returning = returning;
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
    AchievementResponse achievementResponse = (AchievementResponse) o;
    return Objects.equals(this.valid, achievementResponse.valid) &&
        Objects.equals(this.message, achievementResponse.message) &&
        Objects.equals(this.version, achievementResponse.version) &&
        Objects.equals(this.serializeNulls, achievementResponse.serializeNulls) &&
        Objects.equals(this.startTimeLog, achievementResponse.startTimeLog) &&
        Objects.equals(this.errorCode, achievementResponse.errorCode) &&
        Objects.equals(this.request, achievementResponse.request) &&
        Objects.equals(this.achievementId, achievementResponse.achievementId) &&
        Objects.equals(this.title, achievementResponse.title) &&
        Objects.equals(this.description, achievementResponse.description) &&
        Objects.equals(this.analyticsTag, achievementResponse.analyticsTag) &&
        Objects.equals(this.rankType, achievementResponse.rankType) &&
        Objects.equals(this.rankIncrement, achievementResponse.rankIncrement) &&
        Objects.equals(this.validate, achievementResponse.validate) &&
        Objects.equals(this.appName, achievementResponse.appName) &&
        Objects.equals(this.active, achievementResponse.active) &&
        Objects.equals(this.updated, achievementResponse.updated) &&
        Objects.equals(this.created, achievementResponse.created) &&
        Objects.equals(this.tierCount, achievementResponse.tierCount) &&
        Objects.equals(this.minIncrement, achievementResponse.minIncrement) &&
        Objects.equals(this.maxIncrement, achievementResponse.maxIncrement) &&
        Objects.equals(this.tiers, achievementResponse.tiers) &&
        Objects.equals(this.returning, achievementResponse.returning);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valid, message, version, serializeNulls, startTimeLog, errorCode, request, achievementId, title, description, analyticsTag, rankType, rankIncrement, validate, appName, active, updated, created, tierCount, minIncrement, maxIncrement, tiers, returning);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AchievementResponse {\n");
    
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    serializeNulls: ").append(toIndentedString(serializeNulls)).append("\n");
    sb.append("    startTimeLog: ").append(toIndentedString(startTimeLog)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
    sb.append("    achievementId: ").append(toIndentedString(achievementId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    analyticsTag: ").append(toIndentedString(analyticsTag)).append("\n");
    sb.append("    rankType: ").append(toIndentedString(rankType)).append("\n");
    sb.append("    rankIncrement: ").append(toIndentedString(rankIncrement)).append("\n");
    sb.append("    validate: ").append(toIndentedString(validate)).append("\n");
    sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    tierCount: ").append(toIndentedString(tierCount)).append("\n");
    sb.append("    minIncrement: ").append(toIndentedString(minIncrement)).append("\n");
    sb.append("    maxIncrement: ").append(toIndentedString(maxIncrement)).append("\n");
    sb.append("    tiers: ").append(toIndentedString(tiers)).append("\n");
    sb.append("    returning: ").append(toIndentedString(returning)).append("\n");
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


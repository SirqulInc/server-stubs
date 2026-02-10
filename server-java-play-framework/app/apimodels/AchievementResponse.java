package apimodels;

import apimodels.AchievementTierResponse;
import apimodels.NameStringValueResponse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * AchievementResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class AchievementResponse   {
  @JsonProperty("valid")
  
  private Boolean valid;

  @JsonProperty("message")
  
  private String message;

  @JsonProperty("version")
  
  private Double version;

  @JsonProperty("serializeNulls")
  
  private Boolean serializeNulls;

  @JsonProperty("startTimeLog")
  
  private Long startTimeLog;

  @JsonProperty("errorCode")
  
  private String errorCode;

  @JsonProperty("request")
  @Valid

  private List<@Valid NameStringValueResponse> request = null;

  @JsonProperty("achievementId")
  
  private Long achievementId;

  @JsonProperty("title")
  
  private String title;

  @JsonProperty("description")
  
  private String description;

  @JsonProperty("analyticsTag")
  
  private String analyticsTag;

  @JsonProperty("rankType")
  
  private String rankType;

  @JsonProperty("rankIncrement")
  
  private Integer rankIncrement;

  @JsonProperty("validate")
  
  private Boolean validate;

  @JsonProperty("appName")
  
  private String appName;

  @JsonProperty("active")
  
  private Boolean active;

  @JsonProperty("updated")
  
  private Long updated;

  @JsonProperty("created")
  
  private Long created;

  @JsonProperty("tierCount")
  
  private Integer tierCount;

  @JsonProperty("minIncrement")
  
  private Integer minIncrement;

  @JsonProperty("maxIncrement")
  
  private Integer maxIncrement;

  @JsonProperty("tiers")
  @Valid

  private List<@Valid AchievementTierResponse> tiers = null;

  @JsonProperty("returning")
  
  private String returning;

  public AchievementResponse valid(Boolean valid) {
    this.valid = valid;
    return this;
  }

   /**
   * Get valid
   * @return valid
  **/
  public Boolean getValid() {
    return valid;
  }

  public void setValid(Boolean valid) {
    this.valid = valid;
  }

  public AchievementResponse message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public AchievementResponse version(Double version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  public Double getVersion() {
    return version;
  }

  public void setVersion(Double version) {
    this.version = version;
  }

  public AchievementResponse serializeNulls(Boolean serializeNulls) {
    this.serializeNulls = serializeNulls;
    return this;
  }

   /**
   * Get serializeNulls
   * @return serializeNulls
  **/
  public Boolean getSerializeNulls() {
    return serializeNulls;
  }

  public void setSerializeNulls(Boolean serializeNulls) {
    this.serializeNulls = serializeNulls;
  }

  public AchievementResponse startTimeLog(Long startTimeLog) {
    this.startTimeLog = startTimeLog;
    return this;
  }

   /**
   * Get startTimeLog
   * @return startTimeLog
  **/
  public Long getStartTimeLog() {
    return startTimeLog;
  }

  public void setStartTimeLog(Long startTimeLog) {
    this.startTimeLog = startTimeLog;
  }

  public AchievementResponse errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

   /**
   * Get errorCode
   * @return errorCode
  **/
  public String getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  public AchievementResponse request(List<@Valid NameStringValueResponse> request) {
    this.request = request;
    return this;
  }

  public AchievementResponse addRequestItem(NameStringValueResponse requestItem) {
    if (this.request == null) {
      this.request = new ArrayList<>();
    }
    this.request.add(requestItem);
    return this;
  }

   /**
   * Get request
   * @return request
  **/
  public List<@Valid NameStringValueResponse> getRequest() {
    return request;
  }

  public void setRequest(List<@Valid NameStringValueResponse> request) {
    this.request = request;
  }

  public AchievementResponse achievementId(Long achievementId) {
    this.achievementId = achievementId;
    return this;
  }

   /**
   * Get achievementId
   * @return achievementId
  **/
  public Long getAchievementId() {
    return achievementId;
  }

  public void setAchievementId(Long achievementId) {
    this.achievementId = achievementId;
  }

  public AchievementResponse title(String title) {
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

  public AchievementResponse description(String description) {
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

  public AchievementResponse analyticsTag(String analyticsTag) {
    this.analyticsTag = analyticsTag;
    return this;
  }

   /**
   * Get analyticsTag
   * @return analyticsTag
  **/
  public String getAnalyticsTag() {
    return analyticsTag;
  }

  public void setAnalyticsTag(String analyticsTag) {
    this.analyticsTag = analyticsTag;
  }

  public AchievementResponse rankType(String rankType) {
    this.rankType = rankType;
    return this;
  }

   /**
   * Get rankType
   * @return rankType
  **/
  public String getRankType() {
    return rankType;
  }

  public void setRankType(String rankType) {
    this.rankType = rankType;
  }

  public AchievementResponse rankIncrement(Integer rankIncrement) {
    this.rankIncrement = rankIncrement;
    return this;
  }

   /**
   * Get rankIncrement
   * @return rankIncrement
  **/
  public Integer getRankIncrement() {
    return rankIncrement;
  }

  public void setRankIncrement(Integer rankIncrement) {
    this.rankIncrement = rankIncrement;
  }

  public AchievementResponse validate(Boolean validate) {
    this.validate = validate;
    return this;
  }

   /**
   * Get validate
   * @return validate
  **/
  public Boolean getValidate() {
    return validate;
  }

  public void setValidate(Boolean validate) {
    this.validate = validate;
  }

  public AchievementResponse appName(String appName) {
    this.appName = appName;
    return this;
  }

   /**
   * Get appName
   * @return appName
  **/
  public String getAppName() {
    return appName;
  }

  public void setAppName(String appName) {
    this.appName = appName;
  }

  public AchievementResponse active(Boolean active) {
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

  public AchievementResponse updated(Long updated) {
    this.updated = updated;
    return this;
  }

   /**
   * Get updated
   * @return updated
  **/
  public Long getUpdated() {
    return updated;
  }

  public void setUpdated(Long updated) {
    this.updated = updated;
  }

  public AchievementResponse created(Long created) {
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  public Long getCreated() {
    return created;
  }

  public void setCreated(Long created) {
    this.created = created;
  }

  public AchievementResponse tierCount(Integer tierCount) {
    this.tierCount = tierCount;
    return this;
  }

   /**
   * Get tierCount
   * @return tierCount
  **/
  public Integer getTierCount() {
    return tierCount;
  }

  public void setTierCount(Integer tierCount) {
    this.tierCount = tierCount;
  }

  public AchievementResponse minIncrement(Integer minIncrement) {
    this.minIncrement = minIncrement;
    return this;
  }

   /**
   * Get minIncrement
   * @return minIncrement
  **/
  public Integer getMinIncrement() {
    return minIncrement;
  }

  public void setMinIncrement(Integer minIncrement) {
    this.minIncrement = minIncrement;
  }

  public AchievementResponse maxIncrement(Integer maxIncrement) {
    this.maxIncrement = maxIncrement;
    return this;
  }

   /**
   * Get maxIncrement
   * @return maxIncrement
  **/
  public Integer getMaxIncrement() {
    return maxIncrement;
  }

  public void setMaxIncrement(Integer maxIncrement) {
    this.maxIncrement = maxIncrement;
  }

  public AchievementResponse tiers(List<@Valid AchievementTierResponse> tiers) {
    this.tiers = tiers;
    return this;
  }

  public AchievementResponse addTiersItem(AchievementTierResponse tiersItem) {
    if (this.tiers == null) {
      this.tiers = new ArrayList<>();
    }
    this.tiers.add(tiersItem);
    return this;
  }

   /**
   * Get tiers
   * @return tiers
  **/
  public List<@Valid AchievementTierResponse> getTiers() {
    return tiers;
  }

  public void setTiers(List<@Valid AchievementTierResponse> tiers) {
    this.tiers = tiers;
  }

  public AchievementResponse returning(String returning) {
    this.returning = returning;
    return this;
  }

   /**
   * Get returning
   * @return returning
  **/
  public String getReturning() {
    return returning;
  }

  public void setReturning(String returning) {
    this.returning = returning;
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
    return Objects.equals(valid, achievementResponse.valid) &&
        Objects.equals(message, achievementResponse.message) &&
        Objects.equals(version, achievementResponse.version) &&
        Objects.equals(serializeNulls, achievementResponse.serializeNulls) &&
        Objects.equals(startTimeLog, achievementResponse.startTimeLog) &&
        Objects.equals(errorCode, achievementResponse.errorCode) &&
        Objects.equals(request, achievementResponse.request) &&
        Objects.equals(achievementId, achievementResponse.achievementId) &&
        Objects.equals(title, achievementResponse.title) &&
        Objects.equals(description, achievementResponse.description) &&
        Objects.equals(analyticsTag, achievementResponse.analyticsTag) &&
        Objects.equals(rankType, achievementResponse.rankType) &&
        Objects.equals(rankIncrement, achievementResponse.rankIncrement) &&
        Objects.equals(validate, achievementResponse.validate) &&
        Objects.equals(appName, achievementResponse.appName) &&
        Objects.equals(active, achievementResponse.active) &&
        Objects.equals(updated, achievementResponse.updated) &&
        Objects.equals(created, achievementResponse.created) &&
        Objects.equals(tierCount, achievementResponse.tierCount) &&
        Objects.equals(minIncrement, achievementResponse.minIncrement) &&
        Objects.equals(maxIncrement, achievementResponse.maxIncrement) &&
        Objects.equals(tiers, achievementResponse.tiers) &&
        Objects.equals(returning, achievementResponse.returning);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valid, message, version, serializeNulls, startTimeLog, errorCode, request, achievementId, title, description, analyticsTag, rankType, rankIncrement, validate, appName, active, updated, created, tierCount, minIncrement, maxIncrement, tiers, returning);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


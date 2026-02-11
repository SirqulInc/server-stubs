package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AchievementTierResponse;
import org.openapitools.model.NameStringValueResponse;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AchievementResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-11T19:32:41.765375324Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class AchievementResponse {

  private @Nullable Boolean valid;

  private @Nullable String message;

  private @Nullable Double version;

  private @Nullable Boolean serializeNulls;

  private @Nullable Long startTimeLog;

  private @Nullable String errorCode;

  @Valid
  private List<@Valid NameStringValueResponse> request = new ArrayList<>();

  private @Nullable Long achievementId;

  private @Nullable String title;

  private @Nullable String description;

  private @Nullable String analyticsTag;

  private @Nullable String rankType;

  private @Nullable Integer rankIncrement;

  private @Nullable Boolean validate;

  private @Nullable String appName;

  private @Nullable Boolean active;

  private @Nullable Long updated;

  private @Nullable Long created;

  private @Nullable Integer tierCount;

  private @Nullable Integer minIncrement;

  private @Nullable Integer maxIncrement;

  @Valid
  private List<@Valid AchievementTierResponse> tiers = new ArrayList<>();

  private @Nullable String returning;

  public AchievementResponse valid(@Nullable Boolean valid) {
    this.valid = valid;
    return this;
  }

  /**
   * Get valid
   * @return valid
   */
  
  @Schema(name = "valid", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("valid")
  public @Nullable Boolean getValid() {
    return valid;
  }

  public void setValid(@Nullable Boolean valid) {
    this.valid = valid;
  }

  public AchievementResponse message(@Nullable String message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
   */
  
  @Schema(name = "message", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("message")
  public @Nullable String getMessage() {
    return message;
  }

  public void setMessage(@Nullable String message) {
    this.message = message;
  }

  public AchievementResponse version(@Nullable Double version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
   */
  
  @Schema(name = "version", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("version")
  public @Nullable Double getVersion() {
    return version;
  }

  public void setVersion(@Nullable Double version) {
    this.version = version;
  }

  public AchievementResponse serializeNulls(@Nullable Boolean serializeNulls) {
    this.serializeNulls = serializeNulls;
    return this;
  }

  /**
   * Get serializeNulls
   * @return serializeNulls
   */
  
  @Schema(name = "serializeNulls", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("serializeNulls")
  public @Nullable Boolean getSerializeNulls() {
    return serializeNulls;
  }

  public void setSerializeNulls(@Nullable Boolean serializeNulls) {
    this.serializeNulls = serializeNulls;
  }

  public AchievementResponse startTimeLog(@Nullable Long startTimeLog) {
    this.startTimeLog = startTimeLog;
    return this;
  }

  /**
   * Get startTimeLog
   * @return startTimeLog
   */
  
  @Schema(name = "startTimeLog", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("startTimeLog")
  public @Nullable Long getStartTimeLog() {
    return startTimeLog;
  }

  public void setStartTimeLog(@Nullable Long startTimeLog) {
    this.startTimeLog = startTimeLog;
  }

  public AchievementResponse errorCode(@Nullable String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

  /**
   * Get errorCode
   * @return errorCode
   */
  
  @Schema(name = "errorCode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("errorCode")
  public @Nullable String getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(@Nullable String errorCode) {
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
   */
  @Valid 
  @Schema(name = "request", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("request")
  public List<@Valid NameStringValueResponse> getRequest() {
    return request;
  }

  public void setRequest(List<@Valid NameStringValueResponse> request) {
    this.request = request;
  }

  public AchievementResponse achievementId(@Nullable Long achievementId) {
    this.achievementId = achievementId;
    return this;
  }

  /**
   * Get achievementId
   * @return achievementId
   */
  
  @Schema(name = "achievementId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("achievementId")
  public @Nullable Long getAchievementId() {
    return achievementId;
  }

  public void setAchievementId(@Nullable Long achievementId) {
    this.achievementId = achievementId;
  }

  public AchievementResponse title(@Nullable String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
   */
  
  @Schema(name = "title", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("title")
  public @Nullable String getTitle() {
    return title;
  }

  public void setTitle(@Nullable String title) {
    this.title = title;
  }

  public AchievementResponse description(@Nullable String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   */
  
  @Schema(name = "description", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public @Nullable String getDescription() {
    return description;
  }

  public void setDescription(@Nullable String description) {
    this.description = description;
  }

  public AchievementResponse analyticsTag(@Nullable String analyticsTag) {
    this.analyticsTag = analyticsTag;
    return this;
  }

  /**
   * Get analyticsTag
   * @return analyticsTag
   */
  
  @Schema(name = "analyticsTag", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("analyticsTag")
  public @Nullable String getAnalyticsTag() {
    return analyticsTag;
  }

  public void setAnalyticsTag(@Nullable String analyticsTag) {
    this.analyticsTag = analyticsTag;
  }

  public AchievementResponse rankType(@Nullable String rankType) {
    this.rankType = rankType;
    return this;
  }

  /**
   * Get rankType
   * @return rankType
   */
  
  @Schema(name = "rankType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rankType")
  public @Nullable String getRankType() {
    return rankType;
  }

  public void setRankType(@Nullable String rankType) {
    this.rankType = rankType;
  }

  public AchievementResponse rankIncrement(@Nullable Integer rankIncrement) {
    this.rankIncrement = rankIncrement;
    return this;
  }

  /**
   * Get rankIncrement
   * @return rankIncrement
   */
  
  @Schema(name = "rankIncrement", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rankIncrement")
  public @Nullable Integer getRankIncrement() {
    return rankIncrement;
  }

  public void setRankIncrement(@Nullable Integer rankIncrement) {
    this.rankIncrement = rankIncrement;
  }

  public AchievementResponse validate(@Nullable Boolean validate) {
    this.validate = validate;
    return this;
  }

  /**
   * Get validate
   * @return validate
   */
  
  @Schema(name = "validate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("validate")
  public @Nullable Boolean getValidate() {
    return validate;
  }

  public void setValidate(@Nullable Boolean validate) {
    this.validate = validate;
  }

  public AchievementResponse appName(@Nullable String appName) {
    this.appName = appName;
    return this;
  }

  /**
   * Get appName
   * @return appName
   */
  
  @Schema(name = "appName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("appName")
  public @Nullable String getAppName() {
    return appName;
  }

  public void setAppName(@Nullable String appName) {
    this.appName = appName;
  }

  public AchievementResponse active(@Nullable Boolean active) {
    this.active = active;
    return this;
  }

  /**
   * Get active
   * @return active
   */
  
  @Schema(name = "active", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("active")
  public @Nullable Boolean getActive() {
    return active;
  }

  public void setActive(@Nullable Boolean active) {
    this.active = active;
  }

  public AchievementResponse updated(@Nullable Long updated) {
    this.updated = updated;
    return this;
  }

  /**
   * Get updated
   * @return updated
   */
  
  @Schema(name = "updated", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("updated")
  public @Nullable Long getUpdated() {
    return updated;
  }

  public void setUpdated(@Nullable Long updated) {
    this.updated = updated;
  }

  public AchievementResponse created(@Nullable Long created) {
    this.created = created;
    return this;
  }

  /**
   * Get created
   * @return created
   */
  
  @Schema(name = "created", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("created")
  public @Nullable Long getCreated() {
    return created;
  }

  public void setCreated(@Nullable Long created) {
    this.created = created;
  }

  public AchievementResponse tierCount(@Nullable Integer tierCount) {
    this.tierCount = tierCount;
    return this;
  }

  /**
   * Get tierCount
   * @return tierCount
   */
  
  @Schema(name = "tierCount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tierCount")
  public @Nullable Integer getTierCount() {
    return tierCount;
  }

  public void setTierCount(@Nullable Integer tierCount) {
    this.tierCount = tierCount;
  }

  public AchievementResponse minIncrement(@Nullable Integer minIncrement) {
    this.minIncrement = minIncrement;
    return this;
  }

  /**
   * Get minIncrement
   * @return minIncrement
   */
  
  @Schema(name = "minIncrement", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("minIncrement")
  public @Nullable Integer getMinIncrement() {
    return minIncrement;
  }

  public void setMinIncrement(@Nullable Integer minIncrement) {
    this.minIncrement = minIncrement;
  }

  public AchievementResponse maxIncrement(@Nullable Integer maxIncrement) {
    this.maxIncrement = maxIncrement;
    return this;
  }

  /**
   * Get maxIncrement
   * @return maxIncrement
   */
  
  @Schema(name = "maxIncrement", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("maxIncrement")
  public @Nullable Integer getMaxIncrement() {
    return maxIncrement;
  }

  public void setMaxIncrement(@Nullable Integer maxIncrement) {
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
   */
  @Valid 
  @Schema(name = "tiers", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tiers")
  public List<@Valid AchievementTierResponse> getTiers() {
    return tiers;
  }

  public void setTiers(List<@Valid AchievementTierResponse> tiers) {
    this.tiers = tiers;
  }

  public AchievementResponse returning(@Nullable String returning) {
    this.returning = returning;
    return this;
  }

  /**
   * Get returning
   * @return returning
   */
  
  @Schema(name = "returning", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("returning")
  public @Nullable String getReturning() {
    return returning;
  }

  public void setReturning(@Nullable String returning) {
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
  private String toIndentedString(@Nullable Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


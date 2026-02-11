package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AchievementTierResponse;
import org.openapitools.model.NameStringValueResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class AchievementResponse   {
  
  private Boolean valid;
  private String message;
  private Double version;
  private Boolean serializeNulls;
  private Long startTimeLog;
  private String errorCode;
  private List<@Valid NameStringValueResponse> request = new ArrayList<>();
  private Long achievementId;
  private String title;
  private String description;
  private String analyticsTag;
  private String rankType;
  private Integer rankIncrement;
  private Boolean validate;
  private String appName;
  private Boolean active;
  private Long updated;
  private Long created;
  private Integer tierCount;
  private Integer minIncrement;
  private Integer maxIncrement;
  private List<@Valid AchievementTierResponse> tiers = new ArrayList<>();
  private String returning;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("valid")
  public Boolean getValid() {
    return valid;
  }
  public void setValid(Boolean valid) {
    this.valid = valid;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("version")
  public Double getVersion() {
    return version;
  }
  public void setVersion(Double version) {
    this.version = version;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("serializeNulls")
  public Boolean getSerializeNulls() {
    return serializeNulls;
  }
  public void setSerializeNulls(Boolean serializeNulls) {
    this.serializeNulls = serializeNulls;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("startTimeLog")
  public Long getStartTimeLog() {
    return startTimeLog;
  }
  public void setStartTimeLog(Long startTimeLog) {
    this.startTimeLog = startTimeLog;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("errorCode")
  public String getErrorCode() {
    return errorCode;
  }
  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("request")
  @Valid
  public List<@Valid NameStringValueResponse> getRequest() {
    return request;
  }
  public void setRequest(List<@Valid NameStringValueResponse> request) {
    this.request = request;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("achievementId")
  public Long getAchievementId() {
    return achievementId;
  }
  public void setAchievementId(Long achievementId) {
    this.achievementId = achievementId;
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
  @JsonProperty("analyticsTag")
  public String getAnalyticsTag() {
    return analyticsTag;
  }
  public void setAnalyticsTag(String analyticsTag) {
    this.analyticsTag = analyticsTag;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("rankType")
  public String getRankType() {
    return rankType;
  }
  public void setRankType(String rankType) {
    this.rankType = rankType;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("rankIncrement")
  public Integer getRankIncrement() {
    return rankIncrement;
  }
  public void setRankIncrement(Integer rankIncrement) {
    this.rankIncrement = rankIncrement;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("validate")
  public Boolean getValidate() {
    return validate;
  }
  public void setValidate(Boolean validate) {
    this.validate = validate;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("appName")
  public String getAppName() {
    return appName;
  }
  public void setAppName(String appName) {
    this.appName = appName;
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
  @JsonProperty("updated")
  public Long getUpdated() {
    return updated;
  }
  public void setUpdated(Long updated) {
    this.updated = updated;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("created")
  public Long getCreated() {
    return created;
  }
  public void setCreated(Long created) {
    this.created = created;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("tierCount")
  public Integer getTierCount() {
    return tierCount;
  }
  public void setTierCount(Integer tierCount) {
    this.tierCount = tierCount;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("minIncrement")
  public Integer getMinIncrement() {
    return minIncrement;
  }
  public void setMinIncrement(Integer minIncrement) {
    this.minIncrement = minIncrement;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("maxIncrement")
  public Integer getMaxIncrement() {
    return maxIncrement;
  }
  public void setMaxIncrement(Integer maxIncrement) {
    this.maxIncrement = maxIncrement;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("tiers")
  @Valid
  public List<@Valid AchievementTierResponse> getTiers() {
    return tiers;
  }
  public void setTiers(List<@Valid AchievementTierResponse> tiers) {
    this.tiers = tiers;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("returning")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


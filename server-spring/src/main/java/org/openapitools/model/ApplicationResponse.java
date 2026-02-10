package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AssetShortResponse;
import org.openapitools.model.BillableEntityShortResponse;
import org.openapitools.model.CategoryResponse;
import org.openapitools.model.NameStringValueResponse;
import org.openapitools.model.PlatformResponse;
import org.openapitools.model.TrilatAppSettings;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ApplicationResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-09T20:58:37.853899731Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class ApplicationResponse {

  private @Nullable Boolean valid;

  private @Nullable String message;

  private @Nullable Double version;

  private @Nullable Boolean serializeNulls;

  private @Nullable Long startTimeLog;

  private @Nullable String errorCode;

  @Valid
  private List<@Valid NameStringValueResponse> request = new ArrayList<>();

  private @Nullable Long applicationId;

  private @Nullable String appKey;

  private @Nullable String title;

  private @Nullable String currentBuildVersion;

  private @Nullable String currentApiVersion;

  private @Nullable AssetShortResponse appIcon;

  private @Nullable AssetShortResponse appLogo;

  private @Nullable Boolean active;

  private @Nullable String about;

  private @Nullable String landingPageUrl;

  private @Nullable String landingPageFullUrl;

  private @Nullable String defaultImageFullUrl;

  private @Nullable String activityDescription;

  @Valid
  private List<@Valid PlatformResponse> platforms = new ArrayList<>();

  @Valid
  private List<@Valid CategoryResponse> categories = new ArrayList<>();

  private @Nullable Integer placementCount;

  private @Nullable BillableEntityShortResponse billable;

  private @Nullable Boolean hasAds;

  private @Nullable Boolean publicNotifications;

  private @Nullable String urlScheme;

  private @Nullable Boolean global;

  private @Nullable String downloadUrls;

  private @Nullable Boolean localAdsEnabled;

  private @Nullable TrilatAppSettings trilatSettings;

  private @Nullable String appType;

  private @Nullable String appName;

  private @Nullable String bundleId;

  /**
   * Gets or Sets scoringType
   */
  public enum ScoringTypeEnum {
    GAME_LEVEL("GAME_LEVEL"),
    
    GAME_OBJECT("GAME_OBJECT");

    private final String value;

    ScoringTypeEnum(String value) {
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
    public static ScoringTypeEnum fromValue(String value) {
      for (ScoringTypeEnum b : ScoringTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable ScoringTypeEnum scoringType;

  private @Nullable Integer hintCost;

  private @Nullable Integer maxScore;

  private @Nullable Float ticketsPerPoint;

  private @Nullable Boolean hasGameData;

  private @Nullable Boolean globalTickets;

  private @Nullable String eulaVersion;

  private @Nullable Long eulaDateUpdated;

  private @Nullable String modules;

  private @Nullable String billableEntityName;

  private @Nullable Boolean showInActivities;

  private @Nullable String cssClass;

  private @Nullable String inviteWelcomeText;

  private @Nullable String invitePageUrl;

  private @Nullable String apnsCertificateFileName;

  private @Nullable String facebookAppId;

  private @Nullable String facebookAppSecret;

  private @Nullable String appToken;

  private @Nullable String googleApiKey;

  private @Nullable String appRestKey;

  private @Nullable Boolean publicContentApproval;

  private @Nullable Boolean productionMode;

  private @Nullable Integer minimumSessionLength;

  private @Nullable Integer sessionGapLength;

  private @Nullable String sqootApiKey;

  private @Nullable Boolean amqpEnabled;

  private @Nullable Integer authorizedCount;

  private @Nullable String authorizedServers;

  private @Nullable String returning;

  public ApplicationResponse valid(@Nullable Boolean valid) {
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

  public ApplicationResponse message(@Nullable String message) {
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

  public ApplicationResponse version(@Nullable Double version) {
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

  public ApplicationResponse serializeNulls(@Nullable Boolean serializeNulls) {
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

  public ApplicationResponse startTimeLog(@Nullable Long startTimeLog) {
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

  public ApplicationResponse errorCode(@Nullable String errorCode) {
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

  public ApplicationResponse request(List<@Valid NameStringValueResponse> request) {
    this.request = request;
    return this;
  }

  public ApplicationResponse addRequestItem(NameStringValueResponse requestItem) {
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

  public ApplicationResponse applicationId(@Nullable Long applicationId) {
    this.applicationId = applicationId;
    return this;
  }

  /**
   * Get applicationId
   * @return applicationId
   */
  
  @Schema(name = "applicationId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("applicationId")
  public @Nullable Long getApplicationId() {
    return applicationId;
  }

  public void setApplicationId(@Nullable Long applicationId) {
    this.applicationId = applicationId;
  }

  public ApplicationResponse appKey(@Nullable String appKey) {
    this.appKey = appKey;
    return this;
  }

  /**
   * Get appKey
   * @return appKey
   */
  
  @Schema(name = "appKey", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("appKey")
  public @Nullable String getAppKey() {
    return appKey;
  }

  public void setAppKey(@Nullable String appKey) {
    this.appKey = appKey;
  }

  public ApplicationResponse title(@Nullable String title) {
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

  public ApplicationResponse currentBuildVersion(@Nullable String currentBuildVersion) {
    this.currentBuildVersion = currentBuildVersion;
    return this;
  }

  /**
   * Get currentBuildVersion
   * @return currentBuildVersion
   */
  
  @Schema(name = "currentBuildVersion", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("currentBuildVersion")
  public @Nullable String getCurrentBuildVersion() {
    return currentBuildVersion;
  }

  public void setCurrentBuildVersion(@Nullable String currentBuildVersion) {
    this.currentBuildVersion = currentBuildVersion;
  }

  public ApplicationResponse currentApiVersion(@Nullable String currentApiVersion) {
    this.currentApiVersion = currentApiVersion;
    return this;
  }

  /**
   * Get currentApiVersion
   * @return currentApiVersion
   */
  
  @Schema(name = "currentApiVersion", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("currentApiVersion")
  public @Nullable String getCurrentApiVersion() {
    return currentApiVersion;
  }

  public void setCurrentApiVersion(@Nullable String currentApiVersion) {
    this.currentApiVersion = currentApiVersion;
  }

  public ApplicationResponse appIcon(@Nullable AssetShortResponse appIcon) {
    this.appIcon = appIcon;
    return this;
  }

  /**
   * Get appIcon
   * @return appIcon
   */
  @Valid 
  @Schema(name = "appIcon", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("appIcon")
  public @Nullable AssetShortResponse getAppIcon() {
    return appIcon;
  }

  public void setAppIcon(@Nullable AssetShortResponse appIcon) {
    this.appIcon = appIcon;
  }

  public ApplicationResponse appLogo(@Nullable AssetShortResponse appLogo) {
    this.appLogo = appLogo;
    return this;
  }

  /**
   * Get appLogo
   * @return appLogo
   */
  @Valid 
  @Schema(name = "appLogo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("appLogo")
  public @Nullable AssetShortResponse getAppLogo() {
    return appLogo;
  }

  public void setAppLogo(@Nullable AssetShortResponse appLogo) {
    this.appLogo = appLogo;
  }

  public ApplicationResponse active(@Nullable Boolean active) {
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

  public ApplicationResponse about(@Nullable String about) {
    this.about = about;
    return this;
  }

  /**
   * Get about
   * @return about
   */
  
  @Schema(name = "about", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("about")
  public @Nullable String getAbout() {
    return about;
  }

  public void setAbout(@Nullable String about) {
    this.about = about;
  }

  public ApplicationResponse landingPageUrl(@Nullable String landingPageUrl) {
    this.landingPageUrl = landingPageUrl;
    return this;
  }

  /**
   * Get landingPageUrl
   * @return landingPageUrl
   */
  
  @Schema(name = "landingPageUrl", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("landingPageUrl")
  public @Nullable String getLandingPageUrl() {
    return landingPageUrl;
  }

  public void setLandingPageUrl(@Nullable String landingPageUrl) {
    this.landingPageUrl = landingPageUrl;
  }

  public ApplicationResponse landingPageFullUrl(@Nullable String landingPageFullUrl) {
    this.landingPageFullUrl = landingPageFullUrl;
    return this;
  }

  /**
   * Get landingPageFullUrl
   * @return landingPageFullUrl
   */
  
  @Schema(name = "landingPageFullUrl", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("landingPageFullUrl")
  public @Nullable String getLandingPageFullUrl() {
    return landingPageFullUrl;
  }

  public void setLandingPageFullUrl(@Nullable String landingPageFullUrl) {
    this.landingPageFullUrl = landingPageFullUrl;
  }

  public ApplicationResponse defaultImageFullUrl(@Nullable String defaultImageFullUrl) {
    this.defaultImageFullUrl = defaultImageFullUrl;
    return this;
  }

  /**
   * Get defaultImageFullUrl
   * @return defaultImageFullUrl
   */
  
  @Schema(name = "defaultImageFullUrl", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("defaultImageFullUrl")
  public @Nullable String getDefaultImageFullUrl() {
    return defaultImageFullUrl;
  }

  public void setDefaultImageFullUrl(@Nullable String defaultImageFullUrl) {
    this.defaultImageFullUrl = defaultImageFullUrl;
  }

  public ApplicationResponse activityDescription(@Nullable String activityDescription) {
    this.activityDescription = activityDescription;
    return this;
  }

  /**
   * Get activityDescription
   * @return activityDescription
   */
  
  @Schema(name = "activityDescription", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("activityDescription")
  public @Nullable String getActivityDescription() {
    return activityDescription;
  }

  public void setActivityDescription(@Nullable String activityDescription) {
    this.activityDescription = activityDescription;
  }

  public ApplicationResponse platforms(List<@Valid PlatformResponse> platforms) {
    this.platforms = platforms;
    return this;
  }

  public ApplicationResponse addPlatformsItem(PlatformResponse platformsItem) {
    if (this.platforms == null) {
      this.platforms = new ArrayList<>();
    }
    this.platforms.add(platformsItem);
    return this;
  }

  /**
   * Get platforms
   * @return platforms
   */
  @Valid 
  @Schema(name = "platforms", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("platforms")
  public List<@Valid PlatformResponse> getPlatforms() {
    return platforms;
  }

  public void setPlatforms(List<@Valid PlatformResponse> platforms) {
    this.platforms = platforms;
  }

  public ApplicationResponse categories(List<@Valid CategoryResponse> categories) {
    this.categories = categories;
    return this;
  }

  public ApplicationResponse addCategoriesItem(CategoryResponse categoriesItem) {
    if (this.categories == null) {
      this.categories = new ArrayList<>();
    }
    this.categories.add(categoriesItem);
    return this;
  }

  /**
   * Get categories
   * @return categories
   */
  @Valid 
  @Schema(name = "categories", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("categories")
  public List<@Valid CategoryResponse> getCategories() {
    return categories;
  }

  public void setCategories(List<@Valid CategoryResponse> categories) {
    this.categories = categories;
  }

  public ApplicationResponse placementCount(@Nullable Integer placementCount) {
    this.placementCount = placementCount;
    return this;
  }

  /**
   * Get placementCount
   * @return placementCount
   */
  
  @Schema(name = "placementCount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("placementCount")
  public @Nullable Integer getPlacementCount() {
    return placementCount;
  }

  public void setPlacementCount(@Nullable Integer placementCount) {
    this.placementCount = placementCount;
  }

  public ApplicationResponse billable(@Nullable BillableEntityShortResponse billable) {
    this.billable = billable;
    return this;
  }

  /**
   * Get billable
   * @return billable
   */
  @Valid 
  @Schema(name = "billable", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("billable")
  public @Nullable BillableEntityShortResponse getBillable() {
    return billable;
  }

  public void setBillable(@Nullable BillableEntityShortResponse billable) {
    this.billable = billable;
  }

  public ApplicationResponse hasAds(@Nullable Boolean hasAds) {
    this.hasAds = hasAds;
    return this;
  }

  /**
   * Get hasAds
   * @return hasAds
   */
  
  @Schema(name = "hasAds", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hasAds")
  public @Nullable Boolean getHasAds() {
    return hasAds;
  }

  public void setHasAds(@Nullable Boolean hasAds) {
    this.hasAds = hasAds;
  }

  public ApplicationResponse publicNotifications(@Nullable Boolean publicNotifications) {
    this.publicNotifications = publicNotifications;
    return this;
  }

  /**
   * Get publicNotifications
   * @return publicNotifications
   */
  
  @Schema(name = "publicNotifications", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("publicNotifications")
  public @Nullable Boolean getPublicNotifications() {
    return publicNotifications;
  }

  public void setPublicNotifications(@Nullable Boolean publicNotifications) {
    this.publicNotifications = publicNotifications;
  }

  public ApplicationResponse urlScheme(@Nullable String urlScheme) {
    this.urlScheme = urlScheme;
    return this;
  }

  /**
   * Get urlScheme
   * @return urlScheme
   */
  
  @Schema(name = "urlScheme", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("urlScheme")
  public @Nullable String getUrlScheme() {
    return urlScheme;
  }

  public void setUrlScheme(@Nullable String urlScheme) {
    this.urlScheme = urlScheme;
  }

  public ApplicationResponse global(@Nullable Boolean global) {
    this.global = global;
    return this;
  }

  /**
   * Get global
   * @return global
   */
  
  @Schema(name = "global", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("global")
  public @Nullable Boolean getGlobal() {
    return global;
  }

  public void setGlobal(@Nullable Boolean global) {
    this.global = global;
  }

  public ApplicationResponse downloadUrls(@Nullable String downloadUrls) {
    this.downloadUrls = downloadUrls;
    return this;
  }

  /**
   * Get downloadUrls
   * @return downloadUrls
   */
  
  @Schema(name = "downloadUrls", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("downloadUrls")
  public @Nullable String getDownloadUrls() {
    return downloadUrls;
  }

  public void setDownloadUrls(@Nullable String downloadUrls) {
    this.downloadUrls = downloadUrls;
  }

  public ApplicationResponse localAdsEnabled(@Nullable Boolean localAdsEnabled) {
    this.localAdsEnabled = localAdsEnabled;
    return this;
  }

  /**
   * Get localAdsEnabled
   * @return localAdsEnabled
   */
  
  @Schema(name = "localAdsEnabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("localAdsEnabled")
  public @Nullable Boolean getLocalAdsEnabled() {
    return localAdsEnabled;
  }

  public void setLocalAdsEnabled(@Nullable Boolean localAdsEnabled) {
    this.localAdsEnabled = localAdsEnabled;
  }

  public ApplicationResponse trilatSettings(@Nullable TrilatAppSettings trilatSettings) {
    this.trilatSettings = trilatSettings;
    return this;
  }

  /**
   * Get trilatSettings
   * @return trilatSettings
   */
  @Valid 
  @Schema(name = "trilatSettings", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("trilatSettings")
  public @Nullable TrilatAppSettings getTrilatSettings() {
    return trilatSettings;
  }

  public void setTrilatSettings(@Nullable TrilatAppSettings trilatSettings) {
    this.trilatSettings = trilatSettings;
  }

  public ApplicationResponse appType(@Nullable String appType) {
    this.appType = appType;
    return this;
  }

  /**
   * Get appType
   * @return appType
   */
  
  @Schema(name = "appType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("appType")
  public @Nullable String getAppType() {
    return appType;
  }

  public void setAppType(@Nullable String appType) {
    this.appType = appType;
  }

  public ApplicationResponse appName(@Nullable String appName) {
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

  public ApplicationResponse bundleId(@Nullable String bundleId) {
    this.bundleId = bundleId;
    return this;
  }

  /**
   * Get bundleId
   * @return bundleId
   */
  
  @Schema(name = "bundleId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("bundleId")
  public @Nullable String getBundleId() {
    return bundleId;
  }

  public void setBundleId(@Nullable String bundleId) {
    this.bundleId = bundleId;
  }

  public ApplicationResponse scoringType(@Nullable ScoringTypeEnum scoringType) {
    this.scoringType = scoringType;
    return this;
  }

  /**
   * Get scoringType
   * @return scoringType
   */
  
  @Schema(name = "scoringType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("scoringType")
  public @Nullable ScoringTypeEnum getScoringType() {
    return scoringType;
  }

  public void setScoringType(@Nullable ScoringTypeEnum scoringType) {
    this.scoringType = scoringType;
  }

  public ApplicationResponse hintCost(@Nullable Integer hintCost) {
    this.hintCost = hintCost;
    return this;
  }

  /**
   * Get hintCost
   * @return hintCost
   */
  
  @Schema(name = "hintCost", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hintCost")
  public @Nullable Integer getHintCost() {
    return hintCost;
  }

  public void setHintCost(@Nullable Integer hintCost) {
    this.hintCost = hintCost;
  }

  public ApplicationResponse maxScore(@Nullable Integer maxScore) {
    this.maxScore = maxScore;
    return this;
  }

  /**
   * Get maxScore
   * @return maxScore
   */
  
  @Schema(name = "maxScore", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("maxScore")
  public @Nullable Integer getMaxScore() {
    return maxScore;
  }

  public void setMaxScore(@Nullable Integer maxScore) {
    this.maxScore = maxScore;
  }

  public ApplicationResponse ticketsPerPoint(@Nullable Float ticketsPerPoint) {
    this.ticketsPerPoint = ticketsPerPoint;
    return this;
  }

  /**
   * Get ticketsPerPoint
   * @return ticketsPerPoint
   */
  
  @Schema(name = "ticketsPerPoint", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ticketsPerPoint")
  public @Nullable Float getTicketsPerPoint() {
    return ticketsPerPoint;
  }

  public void setTicketsPerPoint(@Nullable Float ticketsPerPoint) {
    this.ticketsPerPoint = ticketsPerPoint;
  }

  public ApplicationResponse hasGameData(@Nullable Boolean hasGameData) {
    this.hasGameData = hasGameData;
    return this;
  }

  /**
   * Get hasGameData
   * @return hasGameData
   */
  
  @Schema(name = "hasGameData", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hasGameData")
  public @Nullable Boolean getHasGameData() {
    return hasGameData;
  }

  public void setHasGameData(@Nullable Boolean hasGameData) {
    this.hasGameData = hasGameData;
  }

  public ApplicationResponse globalTickets(@Nullable Boolean globalTickets) {
    this.globalTickets = globalTickets;
    return this;
  }

  /**
   * Get globalTickets
   * @return globalTickets
   */
  
  @Schema(name = "globalTickets", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("globalTickets")
  public @Nullable Boolean getGlobalTickets() {
    return globalTickets;
  }

  public void setGlobalTickets(@Nullable Boolean globalTickets) {
    this.globalTickets = globalTickets;
  }

  public ApplicationResponse eulaVersion(@Nullable String eulaVersion) {
    this.eulaVersion = eulaVersion;
    return this;
  }

  /**
   * Get eulaVersion
   * @return eulaVersion
   */
  
  @Schema(name = "eulaVersion", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("eulaVersion")
  public @Nullable String getEulaVersion() {
    return eulaVersion;
  }

  public void setEulaVersion(@Nullable String eulaVersion) {
    this.eulaVersion = eulaVersion;
  }

  public ApplicationResponse eulaDateUpdated(@Nullable Long eulaDateUpdated) {
    this.eulaDateUpdated = eulaDateUpdated;
    return this;
  }

  /**
   * Get eulaDateUpdated
   * @return eulaDateUpdated
   */
  
  @Schema(name = "eulaDateUpdated", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("eulaDateUpdated")
  public @Nullable Long getEulaDateUpdated() {
    return eulaDateUpdated;
  }

  public void setEulaDateUpdated(@Nullable Long eulaDateUpdated) {
    this.eulaDateUpdated = eulaDateUpdated;
  }

  public ApplicationResponse modules(@Nullable String modules) {
    this.modules = modules;
    return this;
  }

  /**
   * Get modules
   * @return modules
   */
  
  @Schema(name = "modules", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("modules")
  public @Nullable String getModules() {
    return modules;
  }

  public void setModules(@Nullable String modules) {
    this.modules = modules;
  }

  public ApplicationResponse billableEntityName(@Nullable String billableEntityName) {
    this.billableEntityName = billableEntityName;
    return this;
  }

  /**
   * Get billableEntityName
   * @return billableEntityName
   */
  
  @Schema(name = "billableEntityName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("billableEntityName")
  public @Nullable String getBillableEntityName() {
    return billableEntityName;
  }

  public void setBillableEntityName(@Nullable String billableEntityName) {
    this.billableEntityName = billableEntityName;
  }

  public ApplicationResponse showInActivities(@Nullable Boolean showInActivities) {
    this.showInActivities = showInActivities;
    return this;
  }

  /**
   * Get showInActivities
   * @return showInActivities
   */
  
  @Schema(name = "showInActivities", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("showInActivities")
  public @Nullable Boolean getShowInActivities() {
    return showInActivities;
  }

  public void setShowInActivities(@Nullable Boolean showInActivities) {
    this.showInActivities = showInActivities;
  }

  public ApplicationResponse cssClass(@Nullable String cssClass) {
    this.cssClass = cssClass;
    return this;
  }

  /**
   * Get cssClass
   * @return cssClass
   */
  
  @Schema(name = "cssClass", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cssClass")
  public @Nullable String getCssClass() {
    return cssClass;
  }

  public void setCssClass(@Nullable String cssClass) {
    this.cssClass = cssClass;
  }

  public ApplicationResponse inviteWelcomeText(@Nullable String inviteWelcomeText) {
    this.inviteWelcomeText = inviteWelcomeText;
    return this;
  }

  /**
   * Get inviteWelcomeText
   * @return inviteWelcomeText
   */
  
  @Schema(name = "inviteWelcomeText", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("inviteWelcomeText")
  public @Nullable String getInviteWelcomeText() {
    return inviteWelcomeText;
  }

  public void setInviteWelcomeText(@Nullable String inviteWelcomeText) {
    this.inviteWelcomeText = inviteWelcomeText;
  }

  public ApplicationResponse invitePageUrl(@Nullable String invitePageUrl) {
    this.invitePageUrl = invitePageUrl;
    return this;
  }

  /**
   * Get invitePageUrl
   * @return invitePageUrl
   */
  
  @Schema(name = "invitePageUrl", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("invitePageUrl")
  public @Nullable String getInvitePageUrl() {
    return invitePageUrl;
  }

  public void setInvitePageUrl(@Nullable String invitePageUrl) {
    this.invitePageUrl = invitePageUrl;
  }

  public ApplicationResponse apnsCertificateFileName(@Nullable String apnsCertificateFileName) {
    this.apnsCertificateFileName = apnsCertificateFileName;
    return this;
  }

  /**
   * Get apnsCertificateFileName
   * @return apnsCertificateFileName
   */
  
  @Schema(name = "apnsCertificateFileName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("apnsCertificateFileName")
  public @Nullable String getApnsCertificateFileName() {
    return apnsCertificateFileName;
  }

  public void setApnsCertificateFileName(@Nullable String apnsCertificateFileName) {
    this.apnsCertificateFileName = apnsCertificateFileName;
  }

  public ApplicationResponse facebookAppId(@Nullable String facebookAppId) {
    this.facebookAppId = facebookAppId;
    return this;
  }

  /**
   * Get facebookAppId
   * @return facebookAppId
   */
  
  @Schema(name = "facebookAppId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("facebookAppId")
  public @Nullable String getFacebookAppId() {
    return facebookAppId;
  }

  public void setFacebookAppId(@Nullable String facebookAppId) {
    this.facebookAppId = facebookAppId;
  }

  public ApplicationResponse facebookAppSecret(@Nullable String facebookAppSecret) {
    this.facebookAppSecret = facebookAppSecret;
    return this;
  }

  /**
   * Get facebookAppSecret
   * @return facebookAppSecret
   */
  
  @Schema(name = "facebookAppSecret", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("facebookAppSecret")
  public @Nullable String getFacebookAppSecret() {
    return facebookAppSecret;
  }

  public void setFacebookAppSecret(@Nullable String facebookAppSecret) {
    this.facebookAppSecret = facebookAppSecret;
  }

  public ApplicationResponse appToken(@Nullable String appToken) {
    this.appToken = appToken;
    return this;
  }

  /**
   * Get appToken
   * @return appToken
   */
  
  @Schema(name = "appToken", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("appToken")
  public @Nullable String getAppToken() {
    return appToken;
  }

  public void setAppToken(@Nullable String appToken) {
    this.appToken = appToken;
  }

  public ApplicationResponse googleApiKey(@Nullable String googleApiKey) {
    this.googleApiKey = googleApiKey;
    return this;
  }

  /**
   * Get googleApiKey
   * @return googleApiKey
   */
  
  @Schema(name = "googleApiKey", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("googleApiKey")
  public @Nullable String getGoogleApiKey() {
    return googleApiKey;
  }

  public void setGoogleApiKey(@Nullable String googleApiKey) {
    this.googleApiKey = googleApiKey;
  }

  public ApplicationResponse appRestKey(@Nullable String appRestKey) {
    this.appRestKey = appRestKey;
    return this;
  }

  /**
   * Get appRestKey
   * @return appRestKey
   */
  
  @Schema(name = "appRestKey", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("appRestKey")
  public @Nullable String getAppRestKey() {
    return appRestKey;
  }

  public void setAppRestKey(@Nullable String appRestKey) {
    this.appRestKey = appRestKey;
  }

  public ApplicationResponse publicContentApproval(@Nullable Boolean publicContentApproval) {
    this.publicContentApproval = publicContentApproval;
    return this;
  }

  /**
   * Get publicContentApproval
   * @return publicContentApproval
   */
  
  @Schema(name = "publicContentApproval", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("publicContentApproval")
  public @Nullable Boolean getPublicContentApproval() {
    return publicContentApproval;
  }

  public void setPublicContentApproval(@Nullable Boolean publicContentApproval) {
    this.publicContentApproval = publicContentApproval;
  }

  public ApplicationResponse productionMode(@Nullable Boolean productionMode) {
    this.productionMode = productionMode;
    return this;
  }

  /**
   * Get productionMode
   * @return productionMode
   */
  
  @Schema(name = "productionMode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("productionMode")
  public @Nullable Boolean getProductionMode() {
    return productionMode;
  }

  public void setProductionMode(@Nullable Boolean productionMode) {
    this.productionMode = productionMode;
  }

  public ApplicationResponse minimumSessionLength(@Nullable Integer minimumSessionLength) {
    this.minimumSessionLength = minimumSessionLength;
    return this;
  }

  /**
   * Get minimumSessionLength
   * @return minimumSessionLength
   */
  
  @Schema(name = "minimumSessionLength", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("minimumSessionLength")
  public @Nullable Integer getMinimumSessionLength() {
    return minimumSessionLength;
  }

  public void setMinimumSessionLength(@Nullable Integer minimumSessionLength) {
    this.minimumSessionLength = minimumSessionLength;
  }

  public ApplicationResponse sessionGapLength(@Nullable Integer sessionGapLength) {
    this.sessionGapLength = sessionGapLength;
    return this;
  }

  /**
   * Get sessionGapLength
   * @return sessionGapLength
   */
  
  @Schema(name = "sessionGapLength", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sessionGapLength")
  public @Nullable Integer getSessionGapLength() {
    return sessionGapLength;
  }

  public void setSessionGapLength(@Nullable Integer sessionGapLength) {
    this.sessionGapLength = sessionGapLength;
  }

  public ApplicationResponse sqootApiKey(@Nullable String sqootApiKey) {
    this.sqootApiKey = sqootApiKey;
    return this;
  }

  /**
   * Get sqootApiKey
   * @return sqootApiKey
   */
  
  @Schema(name = "sqootApiKey", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sqootApiKey")
  public @Nullable String getSqootApiKey() {
    return sqootApiKey;
  }

  public void setSqootApiKey(@Nullable String sqootApiKey) {
    this.sqootApiKey = sqootApiKey;
  }

  public ApplicationResponse amqpEnabled(@Nullable Boolean amqpEnabled) {
    this.amqpEnabled = amqpEnabled;
    return this;
  }

  /**
   * Get amqpEnabled
   * @return amqpEnabled
   */
  
  @Schema(name = "amqpEnabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("amqpEnabled")
  public @Nullable Boolean getAmqpEnabled() {
    return amqpEnabled;
  }

  public void setAmqpEnabled(@Nullable Boolean amqpEnabled) {
    this.amqpEnabled = amqpEnabled;
  }

  public ApplicationResponse authorizedCount(@Nullable Integer authorizedCount) {
    this.authorizedCount = authorizedCount;
    return this;
  }

  /**
   * Get authorizedCount
   * @return authorizedCount
   */
  
  @Schema(name = "authorizedCount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("authorizedCount")
  public @Nullable Integer getAuthorizedCount() {
    return authorizedCount;
  }

  public void setAuthorizedCount(@Nullable Integer authorizedCount) {
    this.authorizedCount = authorizedCount;
  }

  public ApplicationResponse authorizedServers(@Nullable String authorizedServers) {
    this.authorizedServers = authorizedServers;
    return this;
  }

  /**
   * Get authorizedServers
   * @return authorizedServers
   */
  
  @Schema(name = "authorizedServers", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("authorizedServers")
  public @Nullable String getAuthorizedServers() {
    return authorizedServers;
  }

  public void setAuthorizedServers(@Nullable String authorizedServers) {
    this.authorizedServers = authorizedServers;
  }

  public ApplicationResponse returning(@Nullable String returning) {
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
    ApplicationResponse applicationResponse = (ApplicationResponse) o;
    return Objects.equals(this.valid, applicationResponse.valid) &&
        Objects.equals(this.message, applicationResponse.message) &&
        Objects.equals(this.version, applicationResponse.version) &&
        Objects.equals(this.serializeNulls, applicationResponse.serializeNulls) &&
        Objects.equals(this.startTimeLog, applicationResponse.startTimeLog) &&
        Objects.equals(this.errorCode, applicationResponse.errorCode) &&
        Objects.equals(this.request, applicationResponse.request) &&
        Objects.equals(this.applicationId, applicationResponse.applicationId) &&
        Objects.equals(this.appKey, applicationResponse.appKey) &&
        Objects.equals(this.title, applicationResponse.title) &&
        Objects.equals(this.currentBuildVersion, applicationResponse.currentBuildVersion) &&
        Objects.equals(this.currentApiVersion, applicationResponse.currentApiVersion) &&
        Objects.equals(this.appIcon, applicationResponse.appIcon) &&
        Objects.equals(this.appLogo, applicationResponse.appLogo) &&
        Objects.equals(this.active, applicationResponse.active) &&
        Objects.equals(this.about, applicationResponse.about) &&
        Objects.equals(this.landingPageUrl, applicationResponse.landingPageUrl) &&
        Objects.equals(this.landingPageFullUrl, applicationResponse.landingPageFullUrl) &&
        Objects.equals(this.defaultImageFullUrl, applicationResponse.defaultImageFullUrl) &&
        Objects.equals(this.activityDescription, applicationResponse.activityDescription) &&
        Objects.equals(this.platforms, applicationResponse.platforms) &&
        Objects.equals(this.categories, applicationResponse.categories) &&
        Objects.equals(this.placementCount, applicationResponse.placementCount) &&
        Objects.equals(this.billable, applicationResponse.billable) &&
        Objects.equals(this.hasAds, applicationResponse.hasAds) &&
        Objects.equals(this.publicNotifications, applicationResponse.publicNotifications) &&
        Objects.equals(this.urlScheme, applicationResponse.urlScheme) &&
        Objects.equals(this.global, applicationResponse.global) &&
        Objects.equals(this.downloadUrls, applicationResponse.downloadUrls) &&
        Objects.equals(this.localAdsEnabled, applicationResponse.localAdsEnabled) &&
        Objects.equals(this.trilatSettings, applicationResponse.trilatSettings) &&
        Objects.equals(this.appType, applicationResponse.appType) &&
        Objects.equals(this.appName, applicationResponse.appName) &&
        Objects.equals(this.bundleId, applicationResponse.bundleId) &&
        Objects.equals(this.scoringType, applicationResponse.scoringType) &&
        Objects.equals(this.hintCost, applicationResponse.hintCost) &&
        Objects.equals(this.maxScore, applicationResponse.maxScore) &&
        Objects.equals(this.ticketsPerPoint, applicationResponse.ticketsPerPoint) &&
        Objects.equals(this.hasGameData, applicationResponse.hasGameData) &&
        Objects.equals(this.globalTickets, applicationResponse.globalTickets) &&
        Objects.equals(this.eulaVersion, applicationResponse.eulaVersion) &&
        Objects.equals(this.eulaDateUpdated, applicationResponse.eulaDateUpdated) &&
        Objects.equals(this.modules, applicationResponse.modules) &&
        Objects.equals(this.billableEntityName, applicationResponse.billableEntityName) &&
        Objects.equals(this.showInActivities, applicationResponse.showInActivities) &&
        Objects.equals(this.cssClass, applicationResponse.cssClass) &&
        Objects.equals(this.inviteWelcomeText, applicationResponse.inviteWelcomeText) &&
        Objects.equals(this.invitePageUrl, applicationResponse.invitePageUrl) &&
        Objects.equals(this.apnsCertificateFileName, applicationResponse.apnsCertificateFileName) &&
        Objects.equals(this.facebookAppId, applicationResponse.facebookAppId) &&
        Objects.equals(this.facebookAppSecret, applicationResponse.facebookAppSecret) &&
        Objects.equals(this.appToken, applicationResponse.appToken) &&
        Objects.equals(this.googleApiKey, applicationResponse.googleApiKey) &&
        Objects.equals(this.appRestKey, applicationResponse.appRestKey) &&
        Objects.equals(this.publicContentApproval, applicationResponse.publicContentApproval) &&
        Objects.equals(this.productionMode, applicationResponse.productionMode) &&
        Objects.equals(this.minimumSessionLength, applicationResponse.minimumSessionLength) &&
        Objects.equals(this.sessionGapLength, applicationResponse.sessionGapLength) &&
        Objects.equals(this.sqootApiKey, applicationResponse.sqootApiKey) &&
        Objects.equals(this.amqpEnabled, applicationResponse.amqpEnabled) &&
        Objects.equals(this.authorizedCount, applicationResponse.authorizedCount) &&
        Objects.equals(this.authorizedServers, applicationResponse.authorizedServers) &&
        Objects.equals(this.returning, applicationResponse.returning);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valid, message, version, serializeNulls, startTimeLog, errorCode, request, applicationId, appKey, title, currentBuildVersion, currentApiVersion, appIcon, appLogo, active, about, landingPageUrl, landingPageFullUrl, defaultImageFullUrl, activityDescription, platforms, categories, placementCount, billable, hasAds, publicNotifications, urlScheme, global, downloadUrls, localAdsEnabled, trilatSettings, appType, appName, bundleId, scoringType, hintCost, maxScore, ticketsPerPoint, hasGameData, globalTickets, eulaVersion, eulaDateUpdated, modules, billableEntityName, showInActivities, cssClass, inviteWelcomeText, invitePageUrl, apnsCertificateFileName, facebookAppId, facebookAppSecret, appToken, googleApiKey, appRestKey, publicContentApproval, productionMode, minimumSessionLength, sessionGapLength, sqootApiKey, amqpEnabled, authorizedCount, authorizedServers, returning);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationResponse {\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    serializeNulls: ").append(toIndentedString(serializeNulls)).append("\n");
    sb.append("    startTimeLog: ").append(toIndentedString(startTimeLog)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
    sb.append("    appKey: ").append(toIndentedString(appKey)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    currentBuildVersion: ").append(toIndentedString(currentBuildVersion)).append("\n");
    sb.append("    currentApiVersion: ").append(toIndentedString(currentApiVersion)).append("\n");
    sb.append("    appIcon: ").append(toIndentedString(appIcon)).append("\n");
    sb.append("    appLogo: ").append(toIndentedString(appLogo)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    about: ").append(toIndentedString(about)).append("\n");
    sb.append("    landingPageUrl: ").append(toIndentedString(landingPageUrl)).append("\n");
    sb.append("    landingPageFullUrl: ").append(toIndentedString(landingPageFullUrl)).append("\n");
    sb.append("    defaultImageFullUrl: ").append(toIndentedString(defaultImageFullUrl)).append("\n");
    sb.append("    activityDescription: ").append(toIndentedString(activityDescription)).append("\n");
    sb.append("    platforms: ").append(toIndentedString(platforms)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    placementCount: ").append(toIndentedString(placementCount)).append("\n");
    sb.append("    billable: ").append(toIndentedString(billable)).append("\n");
    sb.append("    hasAds: ").append(toIndentedString(hasAds)).append("\n");
    sb.append("    publicNotifications: ").append(toIndentedString(publicNotifications)).append("\n");
    sb.append("    urlScheme: ").append(toIndentedString(urlScheme)).append("\n");
    sb.append("    global: ").append(toIndentedString(global)).append("\n");
    sb.append("    downloadUrls: ").append(toIndentedString(downloadUrls)).append("\n");
    sb.append("    localAdsEnabled: ").append(toIndentedString(localAdsEnabled)).append("\n");
    sb.append("    trilatSettings: ").append(toIndentedString(trilatSettings)).append("\n");
    sb.append("    appType: ").append(toIndentedString(appType)).append("\n");
    sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
    sb.append("    bundleId: ").append(toIndentedString(bundleId)).append("\n");
    sb.append("    scoringType: ").append(toIndentedString(scoringType)).append("\n");
    sb.append("    hintCost: ").append(toIndentedString(hintCost)).append("\n");
    sb.append("    maxScore: ").append(toIndentedString(maxScore)).append("\n");
    sb.append("    ticketsPerPoint: ").append(toIndentedString(ticketsPerPoint)).append("\n");
    sb.append("    hasGameData: ").append(toIndentedString(hasGameData)).append("\n");
    sb.append("    globalTickets: ").append(toIndentedString(globalTickets)).append("\n");
    sb.append("    eulaVersion: ").append(toIndentedString(eulaVersion)).append("\n");
    sb.append("    eulaDateUpdated: ").append(toIndentedString(eulaDateUpdated)).append("\n");
    sb.append("    modules: ").append(toIndentedString(modules)).append("\n");
    sb.append("    billableEntityName: ").append(toIndentedString(billableEntityName)).append("\n");
    sb.append("    showInActivities: ").append(toIndentedString(showInActivities)).append("\n");
    sb.append("    cssClass: ").append(toIndentedString(cssClass)).append("\n");
    sb.append("    inviteWelcomeText: ").append(toIndentedString(inviteWelcomeText)).append("\n");
    sb.append("    invitePageUrl: ").append(toIndentedString(invitePageUrl)).append("\n");
    sb.append("    apnsCertificateFileName: ").append(toIndentedString(apnsCertificateFileName)).append("\n");
    sb.append("    facebookAppId: ").append(toIndentedString(facebookAppId)).append("\n");
    sb.append("    facebookAppSecret: ").append(toIndentedString(facebookAppSecret)).append("\n");
    sb.append("    appToken: ").append(toIndentedString(appToken)).append("\n");
    sb.append("    googleApiKey: ").append(toIndentedString(googleApiKey)).append("\n");
    sb.append("    appRestKey: ").append(toIndentedString(appRestKey)).append("\n");
    sb.append("    publicContentApproval: ").append(toIndentedString(publicContentApproval)).append("\n");
    sb.append("    productionMode: ").append(toIndentedString(productionMode)).append("\n");
    sb.append("    minimumSessionLength: ").append(toIndentedString(minimumSessionLength)).append("\n");
    sb.append("    sessionGapLength: ").append(toIndentedString(sessionGapLength)).append("\n");
    sb.append("    sqootApiKey: ").append(toIndentedString(sqootApiKey)).append("\n");
    sb.append("    amqpEnabled: ").append(toIndentedString(amqpEnabled)).append("\n");
    sb.append("    authorizedCount: ").append(toIndentedString(authorizedCount)).append("\n");
    sb.append("    authorizedServers: ").append(toIndentedString(authorizedServers)).append("\n");
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


package org.openapitools.model;

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
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ApplicationResponse  {
  
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

  private Long applicationId;

  @ApiModelProperty(value = "")

  private String appKey;

  @ApiModelProperty(value = "")

  private String title;

  @ApiModelProperty(value = "")

  private String currentBuildVersion;

  @ApiModelProperty(value = "")

  private String currentApiVersion;

  @ApiModelProperty(value = "")

  @Valid

  private AssetShortResponse appIcon;

  @ApiModelProperty(value = "")

  @Valid

  private AssetShortResponse appLogo;

  @ApiModelProperty(value = "")

  private Boolean active;

  @ApiModelProperty(value = "")

  private String about;

  @ApiModelProperty(value = "")

  private String landingPageUrl;

  @ApiModelProperty(value = "")

  private String landingPageFullUrl;

  @ApiModelProperty(value = "")

  private String defaultImageFullUrl;

  @ApiModelProperty(value = "")

  private String activityDescription;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid PlatformResponse> platforms = new ArrayList<>();

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid CategoryResponse> categories = new ArrayList<>();

  @ApiModelProperty(value = "")

  private Integer placementCount;

  @ApiModelProperty(value = "")

  @Valid

  private BillableEntityShortResponse billable;

  @ApiModelProperty(value = "")

  private Boolean hasAds;

  @ApiModelProperty(value = "")

  private Boolean publicNotifications;

  @ApiModelProperty(value = "")

  private String urlScheme;

  @ApiModelProperty(value = "")

  private Boolean global;

  @ApiModelProperty(value = "")

  private String downloadUrls;

  @ApiModelProperty(value = "")

  private Boolean localAdsEnabled;

  @ApiModelProperty(value = "")

  @Valid

  private TrilatAppSettings trilatSettings;

  @ApiModelProperty(value = "")

  private String appType;

  @ApiModelProperty(value = "")

  private String appName;

  @ApiModelProperty(value = "")

  private String bundleId;

public enum ScoringTypeEnum {

GAME_LEVEL(String.valueOf("GAME_LEVEL")), GAME_OBJECT(String.valueOf("GAME_OBJECT"));


    private String value;

    ScoringTypeEnum (String v) {
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
    public static ScoringTypeEnum fromValue(String value) {
        for (ScoringTypeEnum b : ScoringTypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(value = "")

  private ScoringTypeEnum scoringType;

  @ApiModelProperty(value = "")

  private Integer hintCost;

  @ApiModelProperty(value = "")

  private Integer maxScore;

  @ApiModelProperty(value = "")

  private Float ticketsPerPoint;

  @ApiModelProperty(value = "")

  private Boolean hasGameData;

  @ApiModelProperty(value = "")

  private Boolean globalTickets;

  @ApiModelProperty(value = "")

  private String eulaVersion;

  @ApiModelProperty(value = "")

  private Long eulaDateUpdated;

  @ApiModelProperty(value = "")

  private String modules;

  @ApiModelProperty(value = "")

  private String billableEntityName;

  @ApiModelProperty(value = "")

  private Boolean showInActivities;

  @ApiModelProperty(value = "")

  private String cssClass;

  @ApiModelProperty(value = "")

  private String inviteWelcomeText;

  @ApiModelProperty(value = "")

  private String invitePageUrl;

  @ApiModelProperty(value = "")

  private String apnsCertificateFileName;

  @ApiModelProperty(value = "")

  private String facebookAppId;

  @ApiModelProperty(value = "")

  private String facebookAppSecret;

  @ApiModelProperty(value = "")

  private String appToken;

  @ApiModelProperty(value = "")

  private String googleApiKey;

  @ApiModelProperty(value = "")

  private String appRestKey;

  @ApiModelProperty(value = "")

  private Boolean publicContentApproval;

  @ApiModelProperty(value = "")

  private Boolean productionMode;

  @ApiModelProperty(value = "")

  private Integer minimumSessionLength;

  @ApiModelProperty(value = "")

  private Integer sessionGapLength;

  @ApiModelProperty(value = "")

  private String sqootApiKey;

  @ApiModelProperty(value = "")

  private Boolean amqpEnabled;

  @ApiModelProperty(value = "")

  private Integer authorizedCount;

  @ApiModelProperty(value = "")

  private String authorizedServers;

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

  public ApplicationResponse valid(Boolean valid) {
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

  public ApplicationResponse message(String message) {
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

  public ApplicationResponse version(Double version) {
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

  public ApplicationResponse serializeNulls(Boolean serializeNulls) {
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

  public ApplicationResponse startTimeLog(Long startTimeLog) {
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

  public ApplicationResponse errorCode(String errorCode) {
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

  public ApplicationResponse request(List<@Valid NameStringValueResponse> request) {
    this.request = request;
    return this;
  }

  public ApplicationResponse addRequestItem(NameStringValueResponse requestItem) {
    this.request.add(requestItem);
    return this;
  }

 /**
   * Get applicationId
   * @return applicationId
  **/
  @JsonProperty("applicationId")
  public Long getApplicationId() {
    return applicationId;
  }

  public void setApplicationId(Long applicationId) {
    this.applicationId = applicationId;
  }

  public ApplicationResponse applicationId(Long applicationId) {
    this.applicationId = applicationId;
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

  public ApplicationResponse appKey(String appKey) {
    this.appKey = appKey;
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

  public ApplicationResponse title(String title) {
    this.title = title;
    return this;
  }

 /**
   * Get currentBuildVersion
   * @return currentBuildVersion
  **/
  @JsonProperty("currentBuildVersion")
  public String getCurrentBuildVersion() {
    return currentBuildVersion;
  }

  public void setCurrentBuildVersion(String currentBuildVersion) {
    this.currentBuildVersion = currentBuildVersion;
  }

  public ApplicationResponse currentBuildVersion(String currentBuildVersion) {
    this.currentBuildVersion = currentBuildVersion;
    return this;
  }

 /**
   * Get currentApiVersion
   * @return currentApiVersion
  **/
  @JsonProperty("currentApiVersion")
  public String getCurrentApiVersion() {
    return currentApiVersion;
  }

  public void setCurrentApiVersion(String currentApiVersion) {
    this.currentApiVersion = currentApiVersion;
  }

  public ApplicationResponse currentApiVersion(String currentApiVersion) {
    this.currentApiVersion = currentApiVersion;
    return this;
  }

 /**
   * Get appIcon
   * @return appIcon
  **/
  @JsonProperty("appIcon")
  public AssetShortResponse getAppIcon() {
    return appIcon;
  }

  public void setAppIcon(AssetShortResponse appIcon) {
    this.appIcon = appIcon;
  }

  public ApplicationResponse appIcon(AssetShortResponse appIcon) {
    this.appIcon = appIcon;
    return this;
  }

 /**
   * Get appLogo
   * @return appLogo
  **/
  @JsonProperty("appLogo")
  public AssetShortResponse getAppLogo() {
    return appLogo;
  }

  public void setAppLogo(AssetShortResponse appLogo) {
    this.appLogo = appLogo;
  }

  public ApplicationResponse appLogo(AssetShortResponse appLogo) {
    this.appLogo = appLogo;
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

  public ApplicationResponse active(Boolean active) {
    this.active = active;
    return this;
  }

 /**
   * Get about
   * @return about
  **/
  @JsonProperty("about")
  public String getAbout() {
    return about;
  }

  public void setAbout(String about) {
    this.about = about;
  }

  public ApplicationResponse about(String about) {
    this.about = about;
    return this;
  }

 /**
   * Get landingPageUrl
   * @return landingPageUrl
  **/
  @JsonProperty("landingPageUrl")
  public String getLandingPageUrl() {
    return landingPageUrl;
  }

  public void setLandingPageUrl(String landingPageUrl) {
    this.landingPageUrl = landingPageUrl;
  }

  public ApplicationResponse landingPageUrl(String landingPageUrl) {
    this.landingPageUrl = landingPageUrl;
    return this;
  }

 /**
   * Get landingPageFullUrl
   * @return landingPageFullUrl
  **/
  @JsonProperty("landingPageFullUrl")
  public String getLandingPageFullUrl() {
    return landingPageFullUrl;
  }

  public void setLandingPageFullUrl(String landingPageFullUrl) {
    this.landingPageFullUrl = landingPageFullUrl;
  }

  public ApplicationResponse landingPageFullUrl(String landingPageFullUrl) {
    this.landingPageFullUrl = landingPageFullUrl;
    return this;
  }

 /**
   * Get defaultImageFullUrl
   * @return defaultImageFullUrl
  **/
  @JsonProperty("defaultImageFullUrl")
  public String getDefaultImageFullUrl() {
    return defaultImageFullUrl;
  }

  public void setDefaultImageFullUrl(String defaultImageFullUrl) {
    this.defaultImageFullUrl = defaultImageFullUrl;
  }

  public ApplicationResponse defaultImageFullUrl(String defaultImageFullUrl) {
    this.defaultImageFullUrl = defaultImageFullUrl;
    return this;
  }

 /**
   * Get activityDescription
   * @return activityDescription
  **/
  @JsonProperty("activityDescription")
  public String getActivityDescription() {
    return activityDescription;
  }

  public void setActivityDescription(String activityDescription) {
    this.activityDescription = activityDescription;
  }

  public ApplicationResponse activityDescription(String activityDescription) {
    this.activityDescription = activityDescription;
    return this;
  }

 /**
   * Get platforms
   * @return platforms
  **/
  @JsonProperty("platforms")
  public List<@Valid PlatformResponse> getPlatforms() {
    return platforms;
  }

  public void setPlatforms(List<@Valid PlatformResponse> platforms) {
    this.platforms = platforms;
  }

  public ApplicationResponse platforms(List<@Valid PlatformResponse> platforms) {
    this.platforms = platforms;
    return this;
  }

  public ApplicationResponse addPlatformsItem(PlatformResponse platformsItem) {
    this.platforms.add(platformsItem);
    return this;
  }

 /**
   * Get categories
   * @return categories
  **/
  @JsonProperty("categories")
  public List<@Valid CategoryResponse> getCategories() {
    return categories;
  }

  public void setCategories(List<@Valid CategoryResponse> categories) {
    this.categories = categories;
  }

  public ApplicationResponse categories(List<@Valid CategoryResponse> categories) {
    this.categories = categories;
    return this;
  }

  public ApplicationResponse addCategoriesItem(CategoryResponse categoriesItem) {
    this.categories.add(categoriesItem);
    return this;
  }

 /**
   * Get placementCount
   * @return placementCount
  **/
  @JsonProperty("placementCount")
  public Integer getPlacementCount() {
    return placementCount;
  }

  public void setPlacementCount(Integer placementCount) {
    this.placementCount = placementCount;
  }

  public ApplicationResponse placementCount(Integer placementCount) {
    this.placementCount = placementCount;
    return this;
  }

 /**
   * Get billable
   * @return billable
  **/
  @JsonProperty("billable")
  public BillableEntityShortResponse getBillable() {
    return billable;
  }

  public void setBillable(BillableEntityShortResponse billable) {
    this.billable = billable;
  }

  public ApplicationResponse billable(BillableEntityShortResponse billable) {
    this.billable = billable;
    return this;
  }

 /**
   * Get hasAds
   * @return hasAds
  **/
  @JsonProperty("hasAds")
  public Boolean getHasAds() {
    return hasAds;
  }

  public void setHasAds(Boolean hasAds) {
    this.hasAds = hasAds;
  }

  public ApplicationResponse hasAds(Boolean hasAds) {
    this.hasAds = hasAds;
    return this;
  }

 /**
   * Get publicNotifications
   * @return publicNotifications
  **/
  @JsonProperty("publicNotifications")
  public Boolean getPublicNotifications() {
    return publicNotifications;
  }

  public void setPublicNotifications(Boolean publicNotifications) {
    this.publicNotifications = publicNotifications;
  }

  public ApplicationResponse publicNotifications(Boolean publicNotifications) {
    this.publicNotifications = publicNotifications;
    return this;
  }

 /**
   * Get urlScheme
   * @return urlScheme
  **/
  @JsonProperty("urlScheme")
  public String getUrlScheme() {
    return urlScheme;
  }

  public void setUrlScheme(String urlScheme) {
    this.urlScheme = urlScheme;
  }

  public ApplicationResponse urlScheme(String urlScheme) {
    this.urlScheme = urlScheme;
    return this;
  }

 /**
   * Get global
   * @return global
  **/
  @JsonProperty("global")
  public Boolean getGlobal() {
    return global;
  }

  public void setGlobal(Boolean global) {
    this.global = global;
  }

  public ApplicationResponse global(Boolean global) {
    this.global = global;
    return this;
  }

 /**
   * Get downloadUrls
   * @return downloadUrls
  **/
  @JsonProperty("downloadUrls")
  public String getDownloadUrls() {
    return downloadUrls;
  }

  public void setDownloadUrls(String downloadUrls) {
    this.downloadUrls = downloadUrls;
  }

  public ApplicationResponse downloadUrls(String downloadUrls) {
    this.downloadUrls = downloadUrls;
    return this;
  }

 /**
   * Get localAdsEnabled
   * @return localAdsEnabled
  **/
  @JsonProperty("localAdsEnabled")
  public Boolean getLocalAdsEnabled() {
    return localAdsEnabled;
  }

  public void setLocalAdsEnabled(Boolean localAdsEnabled) {
    this.localAdsEnabled = localAdsEnabled;
  }

  public ApplicationResponse localAdsEnabled(Boolean localAdsEnabled) {
    this.localAdsEnabled = localAdsEnabled;
    return this;
  }

 /**
   * Get trilatSettings
   * @return trilatSettings
  **/
  @JsonProperty("trilatSettings")
  public TrilatAppSettings getTrilatSettings() {
    return trilatSettings;
  }

  public void setTrilatSettings(TrilatAppSettings trilatSettings) {
    this.trilatSettings = trilatSettings;
  }

  public ApplicationResponse trilatSettings(TrilatAppSettings trilatSettings) {
    this.trilatSettings = trilatSettings;
    return this;
  }

 /**
   * Get appType
   * @return appType
  **/
  @JsonProperty("appType")
  public String getAppType() {
    return appType;
  }

  public void setAppType(String appType) {
    this.appType = appType;
  }

  public ApplicationResponse appType(String appType) {
    this.appType = appType;
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

  public ApplicationResponse appName(String appName) {
    this.appName = appName;
    return this;
  }

 /**
   * Get bundleId
   * @return bundleId
  **/
  @JsonProperty("bundleId")
  public String getBundleId() {
    return bundleId;
  }

  public void setBundleId(String bundleId) {
    this.bundleId = bundleId;
  }

  public ApplicationResponse bundleId(String bundleId) {
    this.bundleId = bundleId;
    return this;
  }

 /**
   * Get scoringType
   * @return scoringType
  **/
  @JsonProperty("scoringType")
  public String getScoringType() {
    if (scoringType == null) {
      return null;
    }
    return scoringType.value();
  }

  public void setScoringType(ScoringTypeEnum scoringType) {
    this.scoringType = scoringType;
  }

  public ApplicationResponse scoringType(ScoringTypeEnum scoringType) {
    this.scoringType = scoringType;
    return this;
  }

 /**
   * Get hintCost
   * @return hintCost
  **/
  @JsonProperty("hintCost")
  public Integer getHintCost() {
    return hintCost;
  }

  public void setHintCost(Integer hintCost) {
    this.hintCost = hintCost;
  }

  public ApplicationResponse hintCost(Integer hintCost) {
    this.hintCost = hintCost;
    return this;
  }

 /**
   * Get maxScore
   * @return maxScore
  **/
  @JsonProperty("maxScore")
  public Integer getMaxScore() {
    return maxScore;
  }

  public void setMaxScore(Integer maxScore) {
    this.maxScore = maxScore;
  }

  public ApplicationResponse maxScore(Integer maxScore) {
    this.maxScore = maxScore;
    return this;
  }

 /**
   * Get ticketsPerPoint
   * @return ticketsPerPoint
  **/
  @JsonProperty("ticketsPerPoint")
  public Float getTicketsPerPoint() {
    return ticketsPerPoint;
  }

  public void setTicketsPerPoint(Float ticketsPerPoint) {
    this.ticketsPerPoint = ticketsPerPoint;
  }

  public ApplicationResponse ticketsPerPoint(Float ticketsPerPoint) {
    this.ticketsPerPoint = ticketsPerPoint;
    return this;
  }

 /**
   * Get hasGameData
   * @return hasGameData
  **/
  @JsonProperty("hasGameData")
  public Boolean getHasGameData() {
    return hasGameData;
  }

  public void setHasGameData(Boolean hasGameData) {
    this.hasGameData = hasGameData;
  }

  public ApplicationResponse hasGameData(Boolean hasGameData) {
    this.hasGameData = hasGameData;
    return this;
  }

 /**
   * Get globalTickets
   * @return globalTickets
  **/
  @JsonProperty("globalTickets")
  public Boolean getGlobalTickets() {
    return globalTickets;
  }

  public void setGlobalTickets(Boolean globalTickets) {
    this.globalTickets = globalTickets;
  }

  public ApplicationResponse globalTickets(Boolean globalTickets) {
    this.globalTickets = globalTickets;
    return this;
  }

 /**
   * Get eulaVersion
   * @return eulaVersion
  **/
  @JsonProperty("eulaVersion")
  public String getEulaVersion() {
    return eulaVersion;
  }

  public void setEulaVersion(String eulaVersion) {
    this.eulaVersion = eulaVersion;
  }

  public ApplicationResponse eulaVersion(String eulaVersion) {
    this.eulaVersion = eulaVersion;
    return this;
  }

 /**
   * Get eulaDateUpdated
   * @return eulaDateUpdated
  **/
  @JsonProperty("eulaDateUpdated")
  public Long getEulaDateUpdated() {
    return eulaDateUpdated;
  }

  public void setEulaDateUpdated(Long eulaDateUpdated) {
    this.eulaDateUpdated = eulaDateUpdated;
  }

  public ApplicationResponse eulaDateUpdated(Long eulaDateUpdated) {
    this.eulaDateUpdated = eulaDateUpdated;
    return this;
  }

 /**
   * Get modules
   * @return modules
  **/
  @JsonProperty("modules")
  public String getModules() {
    return modules;
  }

  public void setModules(String modules) {
    this.modules = modules;
  }

  public ApplicationResponse modules(String modules) {
    this.modules = modules;
    return this;
  }

 /**
   * Get billableEntityName
   * @return billableEntityName
  **/
  @JsonProperty("billableEntityName")
  public String getBillableEntityName() {
    return billableEntityName;
  }

  public void setBillableEntityName(String billableEntityName) {
    this.billableEntityName = billableEntityName;
  }

  public ApplicationResponse billableEntityName(String billableEntityName) {
    this.billableEntityName = billableEntityName;
    return this;
  }

 /**
   * Get showInActivities
   * @return showInActivities
  **/
  @JsonProperty("showInActivities")
  public Boolean getShowInActivities() {
    return showInActivities;
  }

  public void setShowInActivities(Boolean showInActivities) {
    this.showInActivities = showInActivities;
  }

  public ApplicationResponse showInActivities(Boolean showInActivities) {
    this.showInActivities = showInActivities;
    return this;
  }

 /**
   * Get cssClass
   * @return cssClass
  **/
  @JsonProperty("cssClass")
  public String getCssClass() {
    return cssClass;
  }

  public void setCssClass(String cssClass) {
    this.cssClass = cssClass;
  }

  public ApplicationResponse cssClass(String cssClass) {
    this.cssClass = cssClass;
    return this;
  }

 /**
   * Get inviteWelcomeText
   * @return inviteWelcomeText
  **/
  @JsonProperty("inviteWelcomeText")
  public String getInviteWelcomeText() {
    return inviteWelcomeText;
  }

  public void setInviteWelcomeText(String inviteWelcomeText) {
    this.inviteWelcomeText = inviteWelcomeText;
  }

  public ApplicationResponse inviteWelcomeText(String inviteWelcomeText) {
    this.inviteWelcomeText = inviteWelcomeText;
    return this;
  }

 /**
   * Get invitePageUrl
   * @return invitePageUrl
  **/
  @JsonProperty("invitePageUrl")
  public String getInvitePageUrl() {
    return invitePageUrl;
  }

  public void setInvitePageUrl(String invitePageUrl) {
    this.invitePageUrl = invitePageUrl;
  }

  public ApplicationResponse invitePageUrl(String invitePageUrl) {
    this.invitePageUrl = invitePageUrl;
    return this;
  }

 /**
   * Get apnsCertificateFileName
   * @return apnsCertificateFileName
  **/
  @JsonProperty("apnsCertificateFileName")
  public String getApnsCertificateFileName() {
    return apnsCertificateFileName;
  }

  public void setApnsCertificateFileName(String apnsCertificateFileName) {
    this.apnsCertificateFileName = apnsCertificateFileName;
  }

  public ApplicationResponse apnsCertificateFileName(String apnsCertificateFileName) {
    this.apnsCertificateFileName = apnsCertificateFileName;
    return this;
  }

 /**
   * Get facebookAppId
   * @return facebookAppId
  **/
  @JsonProperty("facebookAppId")
  public String getFacebookAppId() {
    return facebookAppId;
  }

  public void setFacebookAppId(String facebookAppId) {
    this.facebookAppId = facebookAppId;
  }

  public ApplicationResponse facebookAppId(String facebookAppId) {
    this.facebookAppId = facebookAppId;
    return this;
  }

 /**
   * Get facebookAppSecret
   * @return facebookAppSecret
  **/
  @JsonProperty("facebookAppSecret")
  public String getFacebookAppSecret() {
    return facebookAppSecret;
  }

  public void setFacebookAppSecret(String facebookAppSecret) {
    this.facebookAppSecret = facebookAppSecret;
  }

  public ApplicationResponse facebookAppSecret(String facebookAppSecret) {
    this.facebookAppSecret = facebookAppSecret;
    return this;
  }

 /**
   * Get appToken
   * @return appToken
  **/
  @JsonProperty("appToken")
  public String getAppToken() {
    return appToken;
  }

  public void setAppToken(String appToken) {
    this.appToken = appToken;
  }

  public ApplicationResponse appToken(String appToken) {
    this.appToken = appToken;
    return this;
  }

 /**
   * Get googleApiKey
   * @return googleApiKey
  **/
  @JsonProperty("googleApiKey")
  public String getGoogleApiKey() {
    return googleApiKey;
  }

  public void setGoogleApiKey(String googleApiKey) {
    this.googleApiKey = googleApiKey;
  }

  public ApplicationResponse googleApiKey(String googleApiKey) {
    this.googleApiKey = googleApiKey;
    return this;
  }

 /**
   * Get appRestKey
   * @return appRestKey
  **/
  @JsonProperty("appRestKey")
  public String getAppRestKey() {
    return appRestKey;
  }

  public void setAppRestKey(String appRestKey) {
    this.appRestKey = appRestKey;
  }

  public ApplicationResponse appRestKey(String appRestKey) {
    this.appRestKey = appRestKey;
    return this;
  }

 /**
   * Get publicContentApproval
   * @return publicContentApproval
  **/
  @JsonProperty("publicContentApproval")
  public Boolean getPublicContentApproval() {
    return publicContentApproval;
  }

  public void setPublicContentApproval(Boolean publicContentApproval) {
    this.publicContentApproval = publicContentApproval;
  }

  public ApplicationResponse publicContentApproval(Boolean publicContentApproval) {
    this.publicContentApproval = publicContentApproval;
    return this;
  }

 /**
   * Get productionMode
   * @return productionMode
  **/
  @JsonProperty("productionMode")
  public Boolean getProductionMode() {
    return productionMode;
  }

  public void setProductionMode(Boolean productionMode) {
    this.productionMode = productionMode;
  }

  public ApplicationResponse productionMode(Boolean productionMode) {
    this.productionMode = productionMode;
    return this;
  }

 /**
   * Get minimumSessionLength
   * @return minimumSessionLength
  **/
  @JsonProperty("minimumSessionLength")
  public Integer getMinimumSessionLength() {
    return minimumSessionLength;
  }

  public void setMinimumSessionLength(Integer minimumSessionLength) {
    this.minimumSessionLength = minimumSessionLength;
  }

  public ApplicationResponse minimumSessionLength(Integer minimumSessionLength) {
    this.minimumSessionLength = minimumSessionLength;
    return this;
  }

 /**
   * Get sessionGapLength
   * @return sessionGapLength
  **/
  @JsonProperty("sessionGapLength")
  public Integer getSessionGapLength() {
    return sessionGapLength;
  }

  public void setSessionGapLength(Integer sessionGapLength) {
    this.sessionGapLength = sessionGapLength;
  }

  public ApplicationResponse sessionGapLength(Integer sessionGapLength) {
    this.sessionGapLength = sessionGapLength;
    return this;
  }

 /**
   * Get sqootApiKey
   * @return sqootApiKey
  **/
  @JsonProperty("sqootApiKey")
  public String getSqootApiKey() {
    return sqootApiKey;
  }

  public void setSqootApiKey(String sqootApiKey) {
    this.sqootApiKey = sqootApiKey;
  }

  public ApplicationResponse sqootApiKey(String sqootApiKey) {
    this.sqootApiKey = sqootApiKey;
    return this;
  }

 /**
   * Get amqpEnabled
   * @return amqpEnabled
  **/
  @JsonProperty("amqpEnabled")
  public Boolean getAmqpEnabled() {
    return amqpEnabled;
  }

  public void setAmqpEnabled(Boolean amqpEnabled) {
    this.amqpEnabled = amqpEnabled;
  }

  public ApplicationResponse amqpEnabled(Boolean amqpEnabled) {
    this.amqpEnabled = amqpEnabled;
    return this;
  }

 /**
   * Get authorizedCount
   * @return authorizedCount
  **/
  @JsonProperty("authorizedCount")
  public Integer getAuthorizedCount() {
    return authorizedCount;
  }

  public void setAuthorizedCount(Integer authorizedCount) {
    this.authorizedCount = authorizedCount;
  }

  public ApplicationResponse authorizedCount(Integer authorizedCount) {
    this.authorizedCount = authorizedCount;
    return this;
  }

 /**
   * Get authorizedServers
   * @return authorizedServers
  **/
  @JsonProperty("authorizedServers")
  public String getAuthorizedServers() {
    return authorizedServers;
  }

  public void setAuthorizedServers(String authorizedServers) {
    this.authorizedServers = authorizedServers;
  }

  public ApplicationResponse authorizedServers(String authorizedServers) {
    this.authorizedServers = authorizedServers;
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

  public ApplicationResponse returning(String returning) {
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


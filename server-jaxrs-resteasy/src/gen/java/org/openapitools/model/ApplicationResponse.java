package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-09T20:51:23.077809933Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class ApplicationResponse   {
  
  private Boolean valid;
  private String message;
  private Double version;
  private Boolean serializeNulls;
  private Long startTimeLog;
  private String errorCode;
  private List<@Valid NameStringValueResponse> request = new ArrayList<>();
  private Long applicationId;
  private String appKey;
  private String title;
  private String currentBuildVersion;
  private String currentApiVersion;
  private AssetShortResponse appIcon;
  private AssetShortResponse appLogo;
  private Boolean active;
  private String about;
  private String landingPageUrl;
  private String landingPageFullUrl;
  private String defaultImageFullUrl;
  private String activityDescription;
  private List<@Valid PlatformResponse> platforms = new ArrayList<>();
  private List<@Valid CategoryResponse> categories = new ArrayList<>();
  private Integer placementCount;
  private BillableEntityShortResponse billable;
  private Boolean hasAds;
  private Boolean publicNotifications;
  private String urlScheme;
  private Boolean global;
  private String downloadUrls;
  private Boolean localAdsEnabled;
  private TrilatAppSettings trilatSettings;
  private String appType;
  private String appName;
  private String bundleId;

  /**
   * Gets or Sets scoringType
   */
  public enum ScoringTypeEnum {
    GAME_LEVEL("GAME_LEVEL"),

        GAME_OBJECT("GAME_OBJECT");
    private String value;

    ScoringTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private ScoringTypeEnum scoringType;
  private Integer hintCost;
  private Integer maxScore;
  private Float ticketsPerPoint;
  private Boolean hasGameData;
  private Boolean globalTickets;
  private String eulaVersion;
  private Long eulaDateUpdated;
  private String modules;
  private String billableEntityName;
  private Boolean showInActivities;
  private String cssClass;
  private String inviteWelcomeText;
  private String invitePageUrl;
  private String apnsCertificateFileName;
  private String facebookAppId;
  private String facebookAppSecret;
  private String appToken;
  private String googleApiKey;
  private String appRestKey;
  private Boolean publicContentApproval;
  private Boolean productionMode;
  private Integer minimumSessionLength;
  private Integer sessionGapLength;
  private String sqootApiKey;
  private Boolean amqpEnabled;
  private Integer authorizedCount;
  private String authorizedServers;
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
  @JsonProperty("applicationId")
  public Long getApplicationId() {
    return applicationId;
  }
  public void setApplicationId(Long applicationId) {
    this.applicationId = applicationId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("appKey")
  public String getAppKey() {
    return appKey;
  }
  public void setAppKey(String appKey) {
    this.appKey = appKey;
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
  @JsonProperty("currentBuildVersion")
  public String getCurrentBuildVersion() {
    return currentBuildVersion;
  }
  public void setCurrentBuildVersion(String currentBuildVersion) {
    this.currentBuildVersion = currentBuildVersion;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("currentApiVersion")
  public String getCurrentApiVersion() {
    return currentApiVersion;
  }
  public void setCurrentApiVersion(String currentApiVersion) {
    this.currentApiVersion = currentApiVersion;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("appIcon")
  @Valid
  public AssetShortResponse getAppIcon() {
    return appIcon;
  }
  public void setAppIcon(AssetShortResponse appIcon) {
    this.appIcon = appIcon;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("appLogo")
  @Valid
  public AssetShortResponse getAppLogo() {
    return appLogo;
  }
  public void setAppLogo(AssetShortResponse appLogo) {
    this.appLogo = appLogo;
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
  @JsonProperty("about")
  public String getAbout() {
    return about;
  }
  public void setAbout(String about) {
    this.about = about;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("landingPageUrl")
  public String getLandingPageUrl() {
    return landingPageUrl;
  }
  public void setLandingPageUrl(String landingPageUrl) {
    this.landingPageUrl = landingPageUrl;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("landingPageFullUrl")
  public String getLandingPageFullUrl() {
    return landingPageFullUrl;
  }
  public void setLandingPageFullUrl(String landingPageFullUrl) {
    this.landingPageFullUrl = landingPageFullUrl;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("defaultImageFullUrl")
  public String getDefaultImageFullUrl() {
    return defaultImageFullUrl;
  }
  public void setDefaultImageFullUrl(String defaultImageFullUrl) {
    this.defaultImageFullUrl = defaultImageFullUrl;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("activityDescription")
  public String getActivityDescription() {
    return activityDescription;
  }
  public void setActivityDescription(String activityDescription) {
    this.activityDescription = activityDescription;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("platforms")
  @Valid
  public List<@Valid PlatformResponse> getPlatforms() {
    return platforms;
  }
  public void setPlatforms(List<@Valid PlatformResponse> platforms) {
    this.platforms = platforms;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("categories")
  @Valid
  public List<@Valid CategoryResponse> getCategories() {
    return categories;
  }
  public void setCategories(List<@Valid CategoryResponse> categories) {
    this.categories = categories;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("placementCount")
  public Integer getPlacementCount() {
    return placementCount;
  }
  public void setPlacementCount(Integer placementCount) {
    this.placementCount = placementCount;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("billable")
  @Valid
  public BillableEntityShortResponse getBillable() {
    return billable;
  }
  public void setBillable(BillableEntityShortResponse billable) {
    this.billable = billable;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("hasAds")
  public Boolean getHasAds() {
    return hasAds;
  }
  public void setHasAds(Boolean hasAds) {
    this.hasAds = hasAds;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("publicNotifications")
  public Boolean getPublicNotifications() {
    return publicNotifications;
  }
  public void setPublicNotifications(Boolean publicNotifications) {
    this.publicNotifications = publicNotifications;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("urlScheme")
  public String getUrlScheme() {
    return urlScheme;
  }
  public void setUrlScheme(String urlScheme) {
    this.urlScheme = urlScheme;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("global")
  public Boolean getGlobal() {
    return global;
  }
  public void setGlobal(Boolean global) {
    this.global = global;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("downloadUrls")
  public String getDownloadUrls() {
    return downloadUrls;
  }
  public void setDownloadUrls(String downloadUrls) {
    this.downloadUrls = downloadUrls;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("localAdsEnabled")
  public Boolean getLocalAdsEnabled() {
    return localAdsEnabled;
  }
  public void setLocalAdsEnabled(Boolean localAdsEnabled) {
    this.localAdsEnabled = localAdsEnabled;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("trilatSettings")
  @Valid
  public TrilatAppSettings getTrilatSettings() {
    return trilatSettings;
  }
  public void setTrilatSettings(TrilatAppSettings trilatSettings) {
    this.trilatSettings = trilatSettings;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("appType")
  public String getAppType() {
    return appType;
  }
  public void setAppType(String appType) {
    this.appType = appType;
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
  @JsonProperty("bundleId")
  public String getBundleId() {
    return bundleId;
  }
  public void setBundleId(String bundleId) {
    this.bundleId = bundleId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("scoringType")
  public ScoringTypeEnum getScoringType() {
    return scoringType;
  }
  public void setScoringType(ScoringTypeEnum scoringType) {
    this.scoringType = scoringType;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("hintCost")
  public Integer getHintCost() {
    return hintCost;
  }
  public void setHintCost(Integer hintCost) {
    this.hintCost = hintCost;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("maxScore")
  public Integer getMaxScore() {
    return maxScore;
  }
  public void setMaxScore(Integer maxScore) {
    this.maxScore = maxScore;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("ticketsPerPoint")
  public Float getTicketsPerPoint() {
    return ticketsPerPoint;
  }
  public void setTicketsPerPoint(Float ticketsPerPoint) {
    this.ticketsPerPoint = ticketsPerPoint;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("hasGameData")
  public Boolean getHasGameData() {
    return hasGameData;
  }
  public void setHasGameData(Boolean hasGameData) {
    this.hasGameData = hasGameData;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("globalTickets")
  public Boolean getGlobalTickets() {
    return globalTickets;
  }
  public void setGlobalTickets(Boolean globalTickets) {
    this.globalTickets = globalTickets;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("eulaVersion")
  public String getEulaVersion() {
    return eulaVersion;
  }
  public void setEulaVersion(String eulaVersion) {
    this.eulaVersion = eulaVersion;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("eulaDateUpdated")
  public Long getEulaDateUpdated() {
    return eulaDateUpdated;
  }
  public void setEulaDateUpdated(Long eulaDateUpdated) {
    this.eulaDateUpdated = eulaDateUpdated;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("modules")
  public String getModules() {
    return modules;
  }
  public void setModules(String modules) {
    this.modules = modules;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("billableEntityName")
  public String getBillableEntityName() {
    return billableEntityName;
  }
  public void setBillableEntityName(String billableEntityName) {
    this.billableEntityName = billableEntityName;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("showInActivities")
  public Boolean getShowInActivities() {
    return showInActivities;
  }
  public void setShowInActivities(Boolean showInActivities) {
    this.showInActivities = showInActivities;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cssClass")
  public String getCssClass() {
    return cssClass;
  }
  public void setCssClass(String cssClass) {
    this.cssClass = cssClass;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("inviteWelcomeText")
  public String getInviteWelcomeText() {
    return inviteWelcomeText;
  }
  public void setInviteWelcomeText(String inviteWelcomeText) {
    this.inviteWelcomeText = inviteWelcomeText;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("invitePageUrl")
  public String getInvitePageUrl() {
    return invitePageUrl;
  }
  public void setInvitePageUrl(String invitePageUrl) {
    this.invitePageUrl = invitePageUrl;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("apnsCertificateFileName")
  public String getApnsCertificateFileName() {
    return apnsCertificateFileName;
  }
  public void setApnsCertificateFileName(String apnsCertificateFileName) {
    this.apnsCertificateFileName = apnsCertificateFileName;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("facebookAppId")
  public String getFacebookAppId() {
    return facebookAppId;
  }
  public void setFacebookAppId(String facebookAppId) {
    this.facebookAppId = facebookAppId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("facebookAppSecret")
  public String getFacebookAppSecret() {
    return facebookAppSecret;
  }
  public void setFacebookAppSecret(String facebookAppSecret) {
    this.facebookAppSecret = facebookAppSecret;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("appToken")
  public String getAppToken() {
    return appToken;
  }
  public void setAppToken(String appToken) {
    this.appToken = appToken;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("googleApiKey")
  public String getGoogleApiKey() {
    return googleApiKey;
  }
  public void setGoogleApiKey(String googleApiKey) {
    this.googleApiKey = googleApiKey;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("appRestKey")
  public String getAppRestKey() {
    return appRestKey;
  }
  public void setAppRestKey(String appRestKey) {
    this.appRestKey = appRestKey;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("publicContentApproval")
  public Boolean getPublicContentApproval() {
    return publicContentApproval;
  }
  public void setPublicContentApproval(Boolean publicContentApproval) {
    this.publicContentApproval = publicContentApproval;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("productionMode")
  public Boolean getProductionMode() {
    return productionMode;
  }
  public void setProductionMode(Boolean productionMode) {
    this.productionMode = productionMode;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("minimumSessionLength")
  public Integer getMinimumSessionLength() {
    return minimumSessionLength;
  }
  public void setMinimumSessionLength(Integer minimumSessionLength) {
    this.minimumSessionLength = minimumSessionLength;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("sessionGapLength")
  public Integer getSessionGapLength() {
    return sessionGapLength;
  }
  public void setSessionGapLength(Integer sessionGapLength) {
    this.sessionGapLength = sessionGapLength;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("sqootApiKey")
  public String getSqootApiKey() {
    return sqootApiKey;
  }
  public void setSqootApiKey(String sqootApiKey) {
    this.sqootApiKey = sqootApiKey;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("amqpEnabled")
  public Boolean getAmqpEnabled() {
    return amqpEnabled;
  }
  public void setAmqpEnabled(Boolean amqpEnabled) {
    this.amqpEnabled = amqpEnabled;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("authorizedCount")
  public Integer getAuthorizedCount() {
    return authorizedCount;
  }
  public void setAuthorizedCount(Integer authorizedCount) {
    this.authorizedCount = authorizedCount;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("authorizedServers")
  public String getAuthorizedServers() {
    return authorizedServers;
  }
  public void setAuthorizedServers(String authorizedServers) {
    this.authorizedServers = authorizedServers;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


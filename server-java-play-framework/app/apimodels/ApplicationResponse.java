package apimodels;

import apimodels.AssetShortResponse;
import apimodels.BillableEntityShortResponse;
import apimodels.CategoryResponse;
import apimodels.NameStringValueResponse;
import apimodels.PlatformResponse;
import apimodels.TrilatAppSettings;
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
 * ApplicationResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ApplicationResponse   {
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

  @JsonProperty("applicationId")
  
  private Long applicationId;

  @JsonProperty("appKey")
  
  private String appKey;

  @JsonProperty("title")
  
  private String title;

  @JsonProperty("currentBuildVersion")
  
  private String currentBuildVersion;

  @JsonProperty("currentApiVersion")
  
  private String currentApiVersion;

  @JsonProperty("appIcon")
  @Valid

  private AssetShortResponse appIcon;

  @JsonProperty("appLogo")
  @Valid

  private AssetShortResponse appLogo;

  @JsonProperty("active")
  
  private Boolean active;

  @JsonProperty("about")
  
  private String about;

  @JsonProperty("landingPageUrl")
  
  private String landingPageUrl;

  @JsonProperty("landingPageFullUrl")
  
  private String landingPageFullUrl;

  @JsonProperty("defaultImageFullUrl")
  
  private String defaultImageFullUrl;

  @JsonProperty("activityDescription")
  
  private String activityDescription;

  @JsonProperty("platforms")
  @Valid

  private List<@Valid PlatformResponse> platforms = null;

  @JsonProperty("categories")
  @Valid

  private List<@Valid CategoryResponse> categories = null;

  @JsonProperty("placementCount")
  
  private Integer placementCount;

  @JsonProperty("billable")
  @Valid

  private BillableEntityShortResponse billable;

  @JsonProperty("hasAds")
  
  private Boolean hasAds;

  @JsonProperty("publicNotifications")
  
  private Boolean publicNotifications;

  @JsonProperty("urlScheme")
  
  private String urlScheme;

  @JsonProperty("global")
  
  private Boolean global;

  @JsonProperty("downloadUrls")
  
  private String downloadUrls;

  @JsonProperty("localAdsEnabled")
  
  private Boolean localAdsEnabled;

  @JsonProperty("trilatSettings")
  @Valid

  private TrilatAppSettings trilatSettings;

  @JsonProperty("appType")
  
  private String appType;

  @JsonProperty("appName")
  
  private String appName;

  @JsonProperty("bundleId")
  
  private String bundleId;

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

  @JsonProperty("scoringType")
  
  private ScoringTypeEnum scoringType;

  @JsonProperty("hintCost")
  
  private Integer hintCost;

  @JsonProperty("maxScore")
  
  private Integer maxScore;

  @JsonProperty("ticketsPerPoint")
  
  private Float ticketsPerPoint;

  @JsonProperty("hasGameData")
  
  private Boolean hasGameData;

  @JsonProperty("globalTickets")
  
  private Boolean globalTickets;

  @JsonProperty("eulaVersion")
  
  private String eulaVersion;

  @JsonProperty("eulaDateUpdated")
  
  private Long eulaDateUpdated;

  @JsonProperty("modules")
  
  private String modules;

  @JsonProperty("billableEntityName")
  
  private String billableEntityName;

  @JsonProperty("showInActivities")
  
  private Boolean showInActivities;

  @JsonProperty("cssClass")
  
  private String cssClass;

  @JsonProperty("inviteWelcomeText")
  
  private String inviteWelcomeText;

  @JsonProperty("invitePageUrl")
  
  private String invitePageUrl;

  @JsonProperty("apnsCertificateFileName")
  
  private String apnsCertificateFileName;

  @JsonProperty("facebookAppId")
  
  private String facebookAppId;

  @JsonProperty("facebookAppSecret")
  
  private String facebookAppSecret;

  @JsonProperty("appToken")
  
  private String appToken;

  @JsonProperty("googleApiKey")
  
  private String googleApiKey;

  @JsonProperty("appRestKey")
  
  private String appRestKey;

  @JsonProperty("publicContentApproval")
  
  private Boolean publicContentApproval;

  @JsonProperty("productionMode")
  
  private Boolean productionMode;

  @JsonProperty("minimumSessionLength")
  
  private Integer minimumSessionLength;

  @JsonProperty("sessionGapLength")
  
  private Integer sessionGapLength;

  @JsonProperty("sqootApiKey")
  
  private String sqootApiKey;

  @JsonProperty("amqpEnabled")
  
  private Boolean amqpEnabled;

  @JsonProperty("authorizedCount")
  
  private Integer authorizedCount;

  @JsonProperty("authorizedServers")
  
  private String authorizedServers;

  @JsonProperty("returning")
  
  private String returning;

  public ApplicationResponse valid(Boolean valid) {
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

  public ApplicationResponse message(String message) {
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

  public ApplicationResponse version(Double version) {
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

  public ApplicationResponse serializeNulls(Boolean serializeNulls) {
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

  public ApplicationResponse startTimeLog(Long startTimeLog) {
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

  public ApplicationResponse errorCode(String errorCode) {
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
  **/
  public List<@Valid NameStringValueResponse> getRequest() {
    return request;
  }

  public void setRequest(List<@Valid NameStringValueResponse> request) {
    this.request = request;
  }

  public ApplicationResponse applicationId(Long applicationId) {
    this.applicationId = applicationId;
    return this;
  }

   /**
   * Get applicationId
   * @return applicationId
  **/
  public Long getApplicationId() {
    return applicationId;
  }

  public void setApplicationId(Long applicationId) {
    this.applicationId = applicationId;
  }

  public ApplicationResponse appKey(String appKey) {
    this.appKey = appKey;
    return this;
  }

   /**
   * Get appKey
   * @return appKey
  **/
  public String getAppKey() {
    return appKey;
  }

  public void setAppKey(String appKey) {
    this.appKey = appKey;
  }

  public ApplicationResponse title(String title) {
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

  public ApplicationResponse currentBuildVersion(String currentBuildVersion) {
    this.currentBuildVersion = currentBuildVersion;
    return this;
  }

   /**
   * Get currentBuildVersion
   * @return currentBuildVersion
  **/
  public String getCurrentBuildVersion() {
    return currentBuildVersion;
  }

  public void setCurrentBuildVersion(String currentBuildVersion) {
    this.currentBuildVersion = currentBuildVersion;
  }

  public ApplicationResponse currentApiVersion(String currentApiVersion) {
    this.currentApiVersion = currentApiVersion;
    return this;
  }

   /**
   * Get currentApiVersion
   * @return currentApiVersion
  **/
  public String getCurrentApiVersion() {
    return currentApiVersion;
  }

  public void setCurrentApiVersion(String currentApiVersion) {
    this.currentApiVersion = currentApiVersion;
  }

  public ApplicationResponse appIcon(AssetShortResponse appIcon) {
    this.appIcon = appIcon;
    return this;
  }

   /**
   * Get appIcon
   * @return appIcon
  **/
  public AssetShortResponse getAppIcon() {
    return appIcon;
  }

  public void setAppIcon(AssetShortResponse appIcon) {
    this.appIcon = appIcon;
  }

  public ApplicationResponse appLogo(AssetShortResponse appLogo) {
    this.appLogo = appLogo;
    return this;
  }

   /**
   * Get appLogo
   * @return appLogo
  **/
  public AssetShortResponse getAppLogo() {
    return appLogo;
  }

  public void setAppLogo(AssetShortResponse appLogo) {
    this.appLogo = appLogo;
  }

  public ApplicationResponse active(Boolean active) {
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

  public ApplicationResponse about(String about) {
    this.about = about;
    return this;
  }

   /**
   * Get about
   * @return about
  **/
  public String getAbout() {
    return about;
  }

  public void setAbout(String about) {
    this.about = about;
  }

  public ApplicationResponse landingPageUrl(String landingPageUrl) {
    this.landingPageUrl = landingPageUrl;
    return this;
  }

   /**
   * Get landingPageUrl
   * @return landingPageUrl
  **/
  public String getLandingPageUrl() {
    return landingPageUrl;
  }

  public void setLandingPageUrl(String landingPageUrl) {
    this.landingPageUrl = landingPageUrl;
  }

  public ApplicationResponse landingPageFullUrl(String landingPageFullUrl) {
    this.landingPageFullUrl = landingPageFullUrl;
    return this;
  }

   /**
   * Get landingPageFullUrl
   * @return landingPageFullUrl
  **/
  public String getLandingPageFullUrl() {
    return landingPageFullUrl;
  }

  public void setLandingPageFullUrl(String landingPageFullUrl) {
    this.landingPageFullUrl = landingPageFullUrl;
  }

  public ApplicationResponse defaultImageFullUrl(String defaultImageFullUrl) {
    this.defaultImageFullUrl = defaultImageFullUrl;
    return this;
  }

   /**
   * Get defaultImageFullUrl
   * @return defaultImageFullUrl
  **/
  public String getDefaultImageFullUrl() {
    return defaultImageFullUrl;
  }

  public void setDefaultImageFullUrl(String defaultImageFullUrl) {
    this.defaultImageFullUrl = defaultImageFullUrl;
  }

  public ApplicationResponse activityDescription(String activityDescription) {
    this.activityDescription = activityDescription;
    return this;
  }

   /**
   * Get activityDescription
   * @return activityDescription
  **/
  public String getActivityDescription() {
    return activityDescription;
  }

  public void setActivityDescription(String activityDescription) {
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
  **/
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
  **/
  public List<@Valid CategoryResponse> getCategories() {
    return categories;
  }

  public void setCategories(List<@Valid CategoryResponse> categories) {
    this.categories = categories;
  }

  public ApplicationResponse placementCount(Integer placementCount) {
    this.placementCount = placementCount;
    return this;
  }

   /**
   * Get placementCount
   * @return placementCount
  **/
  public Integer getPlacementCount() {
    return placementCount;
  }

  public void setPlacementCount(Integer placementCount) {
    this.placementCount = placementCount;
  }

  public ApplicationResponse billable(BillableEntityShortResponse billable) {
    this.billable = billable;
    return this;
  }

   /**
   * Get billable
   * @return billable
  **/
  public BillableEntityShortResponse getBillable() {
    return billable;
  }

  public void setBillable(BillableEntityShortResponse billable) {
    this.billable = billable;
  }

  public ApplicationResponse hasAds(Boolean hasAds) {
    this.hasAds = hasAds;
    return this;
  }

   /**
   * Get hasAds
   * @return hasAds
  **/
  public Boolean getHasAds() {
    return hasAds;
  }

  public void setHasAds(Boolean hasAds) {
    this.hasAds = hasAds;
  }

  public ApplicationResponse publicNotifications(Boolean publicNotifications) {
    this.publicNotifications = publicNotifications;
    return this;
  }

   /**
   * Get publicNotifications
   * @return publicNotifications
  **/
  public Boolean getPublicNotifications() {
    return publicNotifications;
  }

  public void setPublicNotifications(Boolean publicNotifications) {
    this.publicNotifications = publicNotifications;
  }

  public ApplicationResponse urlScheme(String urlScheme) {
    this.urlScheme = urlScheme;
    return this;
  }

   /**
   * Get urlScheme
   * @return urlScheme
  **/
  public String getUrlScheme() {
    return urlScheme;
  }

  public void setUrlScheme(String urlScheme) {
    this.urlScheme = urlScheme;
  }

  public ApplicationResponse global(Boolean global) {
    this.global = global;
    return this;
  }

   /**
   * Get global
   * @return global
  **/
  public Boolean getGlobal() {
    return global;
  }

  public void setGlobal(Boolean global) {
    this.global = global;
  }

  public ApplicationResponse downloadUrls(String downloadUrls) {
    this.downloadUrls = downloadUrls;
    return this;
  }

   /**
   * Get downloadUrls
   * @return downloadUrls
  **/
  public String getDownloadUrls() {
    return downloadUrls;
  }

  public void setDownloadUrls(String downloadUrls) {
    this.downloadUrls = downloadUrls;
  }

  public ApplicationResponse localAdsEnabled(Boolean localAdsEnabled) {
    this.localAdsEnabled = localAdsEnabled;
    return this;
  }

   /**
   * Get localAdsEnabled
   * @return localAdsEnabled
  **/
  public Boolean getLocalAdsEnabled() {
    return localAdsEnabled;
  }

  public void setLocalAdsEnabled(Boolean localAdsEnabled) {
    this.localAdsEnabled = localAdsEnabled;
  }

  public ApplicationResponse trilatSettings(TrilatAppSettings trilatSettings) {
    this.trilatSettings = trilatSettings;
    return this;
  }

   /**
   * Get trilatSettings
   * @return trilatSettings
  **/
  public TrilatAppSettings getTrilatSettings() {
    return trilatSettings;
  }

  public void setTrilatSettings(TrilatAppSettings trilatSettings) {
    this.trilatSettings = trilatSettings;
  }

  public ApplicationResponse appType(String appType) {
    this.appType = appType;
    return this;
  }

   /**
   * Get appType
   * @return appType
  **/
  public String getAppType() {
    return appType;
  }

  public void setAppType(String appType) {
    this.appType = appType;
  }

  public ApplicationResponse appName(String appName) {
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

  public ApplicationResponse bundleId(String bundleId) {
    this.bundleId = bundleId;
    return this;
  }

   /**
   * Get bundleId
   * @return bundleId
  **/
  public String getBundleId() {
    return bundleId;
  }

  public void setBundleId(String bundleId) {
    this.bundleId = bundleId;
  }

  public ApplicationResponse scoringType(ScoringTypeEnum scoringType) {
    this.scoringType = scoringType;
    return this;
  }

   /**
   * Get scoringType
   * @return scoringType
  **/
  public ScoringTypeEnum getScoringType() {
    return scoringType;
  }

  public void setScoringType(ScoringTypeEnum scoringType) {
    this.scoringType = scoringType;
  }

  public ApplicationResponse hintCost(Integer hintCost) {
    this.hintCost = hintCost;
    return this;
  }

   /**
   * Get hintCost
   * @return hintCost
  **/
  public Integer getHintCost() {
    return hintCost;
  }

  public void setHintCost(Integer hintCost) {
    this.hintCost = hintCost;
  }

  public ApplicationResponse maxScore(Integer maxScore) {
    this.maxScore = maxScore;
    return this;
  }

   /**
   * Get maxScore
   * @return maxScore
  **/
  public Integer getMaxScore() {
    return maxScore;
  }

  public void setMaxScore(Integer maxScore) {
    this.maxScore = maxScore;
  }

  public ApplicationResponse ticketsPerPoint(Float ticketsPerPoint) {
    this.ticketsPerPoint = ticketsPerPoint;
    return this;
  }

   /**
   * Get ticketsPerPoint
   * @return ticketsPerPoint
  **/
  public Float getTicketsPerPoint() {
    return ticketsPerPoint;
  }

  public void setTicketsPerPoint(Float ticketsPerPoint) {
    this.ticketsPerPoint = ticketsPerPoint;
  }

  public ApplicationResponse hasGameData(Boolean hasGameData) {
    this.hasGameData = hasGameData;
    return this;
  }

   /**
   * Get hasGameData
   * @return hasGameData
  **/
  public Boolean getHasGameData() {
    return hasGameData;
  }

  public void setHasGameData(Boolean hasGameData) {
    this.hasGameData = hasGameData;
  }

  public ApplicationResponse globalTickets(Boolean globalTickets) {
    this.globalTickets = globalTickets;
    return this;
  }

   /**
   * Get globalTickets
   * @return globalTickets
  **/
  public Boolean getGlobalTickets() {
    return globalTickets;
  }

  public void setGlobalTickets(Boolean globalTickets) {
    this.globalTickets = globalTickets;
  }

  public ApplicationResponse eulaVersion(String eulaVersion) {
    this.eulaVersion = eulaVersion;
    return this;
  }

   /**
   * Get eulaVersion
   * @return eulaVersion
  **/
  public String getEulaVersion() {
    return eulaVersion;
  }

  public void setEulaVersion(String eulaVersion) {
    this.eulaVersion = eulaVersion;
  }

  public ApplicationResponse eulaDateUpdated(Long eulaDateUpdated) {
    this.eulaDateUpdated = eulaDateUpdated;
    return this;
  }

   /**
   * Get eulaDateUpdated
   * @return eulaDateUpdated
  **/
  public Long getEulaDateUpdated() {
    return eulaDateUpdated;
  }

  public void setEulaDateUpdated(Long eulaDateUpdated) {
    this.eulaDateUpdated = eulaDateUpdated;
  }

  public ApplicationResponse modules(String modules) {
    this.modules = modules;
    return this;
  }

   /**
   * Get modules
   * @return modules
  **/
  public String getModules() {
    return modules;
  }

  public void setModules(String modules) {
    this.modules = modules;
  }

  public ApplicationResponse billableEntityName(String billableEntityName) {
    this.billableEntityName = billableEntityName;
    return this;
  }

   /**
   * Get billableEntityName
   * @return billableEntityName
  **/
  public String getBillableEntityName() {
    return billableEntityName;
  }

  public void setBillableEntityName(String billableEntityName) {
    this.billableEntityName = billableEntityName;
  }

  public ApplicationResponse showInActivities(Boolean showInActivities) {
    this.showInActivities = showInActivities;
    return this;
  }

   /**
   * Get showInActivities
   * @return showInActivities
  **/
  public Boolean getShowInActivities() {
    return showInActivities;
  }

  public void setShowInActivities(Boolean showInActivities) {
    this.showInActivities = showInActivities;
  }

  public ApplicationResponse cssClass(String cssClass) {
    this.cssClass = cssClass;
    return this;
  }

   /**
   * Get cssClass
   * @return cssClass
  **/
  public String getCssClass() {
    return cssClass;
  }

  public void setCssClass(String cssClass) {
    this.cssClass = cssClass;
  }

  public ApplicationResponse inviteWelcomeText(String inviteWelcomeText) {
    this.inviteWelcomeText = inviteWelcomeText;
    return this;
  }

   /**
   * Get inviteWelcomeText
   * @return inviteWelcomeText
  **/
  public String getInviteWelcomeText() {
    return inviteWelcomeText;
  }

  public void setInviteWelcomeText(String inviteWelcomeText) {
    this.inviteWelcomeText = inviteWelcomeText;
  }

  public ApplicationResponse invitePageUrl(String invitePageUrl) {
    this.invitePageUrl = invitePageUrl;
    return this;
  }

   /**
   * Get invitePageUrl
   * @return invitePageUrl
  **/
  public String getInvitePageUrl() {
    return invitePageUrl;
  }

  public void setInvitePageUrl(String invitePageUrl) {
    this.invitePageUrl = invitePageUrl;
  }

  public ApplicationResponse apnsCertificateFileName(String apnsCertificateFileName) {
    this.apnsCertificateFileName = apnsCertificateFileName;
    return this;
  }

   /**
   * Get apnsCertificateFileName
   * @return apnsCertificateFileName
  **/
  public String getApnsCertificateFileName() {
    return apnsCertificateFileName;
  }

  public void setApnsCertificateFileName(String apnsCertificateFileName) {
    this.apnsCertificateFileName = apnsCertificateFileName;
  }

  public ApplicationResponse facebookAppId(String facebookAppId) {
    this.facebookAppId = facebookAppId;
    return this;
  }

   /**
   * Get facebookAppId
   * @return facebookAppId
  **/
  public String getFacebookAppId() {
    return facebookAppId;
  }

  public void setFacebookAppId(String facebookAppId) {
    this.facebookAppId = facebookAppId;
  }

  public ApplicationResponse facebookAppSecret(String facebookAppSecret) {
    this.facebookAppSecret = facebookAppSecret;
    return this;
  }

   /**
   * Get facebookAppSecret
   * @return facebookAppSecret
  **/
  public String getFacebookAppSecret() {
    return facebookAppSecret;
  }

  public void setFacebookAppSecret(String facebookAppSecret) {
    this.facebookAppSecret = facebookAppSecret;
  }

  public ApplicationResponse appToken(String appToken) {
    this.appToken = appToken;
    return this;
  }

   /**
   * Get appToken
   * @return appToken
  **/
  public String getAppToken() {
    return appToken;
  }

  public void setAppToken(String appToken) {
    this.appToken = appToken;
  }

  public ApplicationResponse googleApiKey(String googleApiKey) {
    this.googleApiKey = googleApiKey;
    return this;
  }

   /**
   * Get googleApiKey
   * @return googleApiKey
  **/
  public String getGoogleApiKey() {
    return googleApiKey;
  }

  public void setGoogleApiKey(String googleApiKey) {
    this.googleApiKey = googleApiKey;
  }

  public ApplicationResponse appRestKey(String appRestKey) {
    this.appRestKey = appRestKey;
    return this;
  }

   /**
   * Get appRestKey
   * @return appRestKey
  **/
  public String getAppRestKey() {
    return appRestKey;
  }

  public void setAppRestKey(String appRestKey) {
    this.appRestKey = appRestKey;
  }

  public ApplicationResponse publicContentApproval(Boolean publicContentApproval) {
    this.publicContentApproval = publicContentApproval;
    return this;
  }

   /**
   * Get publicContentApproval
   * @return publicContentApproval
  **/
  public Boolean getPublicContentApproval() {
    return publicContentApproval;
  }

  public void setPublicContentApproval(Boolean publicContentApproval) {
    this.publicContentApproval = publicContentApproval;
  }

  public ApplicationResponse productionMode(Boolean productionMode) {
    this.productionMode = productionMode;
    return this;
  }

   /**
   * Get productionMode
   * @return productionMode
  **/
  public Boolean getProductionMode() {
    return productionMode;
  }

  public void setProductionMode(Boolean productionMode) {
    this.productionMode = productionMode;
  }

  public ApplicationResponse minimumSessionLength(Integer minimumSessionLength) {
    this.minimumSessionLength = minimumSessionLength;
    return this;
  }

   /**
   * Get minimumSessionLength
   * @return minimumSessionLength
  **/
  public Integer getMinimumSessionLength() {
    return minimumSessionLength;
  }

  public void setMinimumSessionLength(Integer minimumSessionLength) {
    this.minimumSessionLength = minimumSessionLength;
  }

  public ApplicationResponse sessionGapLength(Integer sessionGapLength) {
    this.sessionGapLength = sessionGapLength;
    return this;
  }

   /**
   * Get sessionGapLength
   * @return sessionGapLength
  **/
  public Integer getSessionGapLength() {
    return sessionGapLength;
  }

  public void setSessionGapLength(Integer sessionGapLength) {
    this.sessionGapLength = sessionGapLength;
  }

  public ApplicationResponse sqootApiKey(String sqootApiKey) {
    this.sqootApiKey = sqootApiKey;
    return this;
  }

   /**
   * Get sqootApiKey
   * @return sqootApiKey
  **/
  public String getSqootApiKey() {
    return sqootApiKey;
  }

  public void setSqootApiKey(String sqootApiKey) {
    this.sqootApiKey = sqootApiKey;
  }

  public ApplicationResponse amqpEnabled(Boolean amqpEnabled) {
    this.amqpEnabled = amqpEnabled;
    return this;
  }

   /**
   * Get amqpEnabled
   * @return amqpEnabled
  **/
  public Boolean getAmqpEnabled() {
    return amqpEnabled;
  }

  public void setAmqpEnabled(Boolean amqpEnabled) {
    this.amqpEnabled = amqpEnabled;
  }

  public ApplicationResponse authorizedCount(Integer authorizedCount) {
    this.authorizedCount = authorizedCount;
    return this;
  }

   /**
   * Get authorizedCount
   * @return authorizedCount
  **/
  public Integer getAuthorizedCount() {
    return authorizedCount;
  }

  public void setAuthorizedCount(Integer authorizedCount) {
    this.authorizedCount = authorizedCount;
  }

  public ApplicationResponse authorizedServers(String authorizedServers) {
    this.authorizedServers = authorizedServers;
    return this;
  }

   /**
   * Get authorizedServers
   * @return authorizedServers
  **/
  public String getAuthorizedServers() {
    return authorizedServers;
  }

  public void setAuthorizedServers(String authorizedServers) {
    this.authorizedServers = authorizedServers;
  }

  public ApplicationResponse returning(String returning) {
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
    ApplicationResponse applicationResponse = (ApplicationResponse) o;
    return Objects.equals(valid, applicationResponse.valid) &&
        Objects.equals(message, applicationResponse.message) &&
        Objects.equals(version, applicationResponse.version) &&
        Objects.equals(serializeNulls, applicationResponse.serializeNulls) &&
        Objects.equals(startTimeLog, applicationResponse.startTimeLog) &&
        Objects.equals(errorCode, applicationResponse.errorCode) &&
        Objects.equals(request, applicationResponse.request) &&
        Objects.equals(applicationId, applicationResponse.applicationId) &&
        Objects.equals(appKey, applicationResponse.appKey) &&
        Objects.equals(title, applicationResponse.title) &&
        Objects.equals(currentBuildVersion, applicationResponse.currentBuildVersion) &&
        Objects.equals(currentApiVersion, applicationResponse.currentApiVersion) &&
        Objects.equals(appIcon, applicationResponse.appIcon) &&
        Objects.equals(appLogo, applicationResponse.appLogo) &&
        Objects.equals(active, applicationResponse.active) &&
        Objects.equals(about, applicationResponse.about) &&
        Objects.equals(landingPageUrl, applicationResponse.landingPageUrl) &&
        Objects.equals(landingPageFullUrl, applicationResponse.landingPageFullUrl) &&
        Objects.equals(defaultImageFullUrl, applicationResponse.defaultImageFullUrl) &&
        Objects.equals(activityDescription, applicationResponse.activityDescription) &&
        Objects.equals(platforms, applicationResponse.platforms) &&
        Objects.equals(categories, applicationResponse.categories) &&
        Objects.equals(placementCount, applicationResponse.placementCount) &&
        Objects.equals(billable, applicationResponse.billable) &&
        Objects.equals(hasAds, applicationResponse.hasAds) &&
        Objects.equals(publicNotifications, applicationResponse.publicNotifications) &&
        Objects.equals(urlScheme, applicationResponse.urlScheme) &&
        Objects.equals(global, applicationResponse.global) &&
        Objects.equals(downloadUrls, applicationResponse.downloadUrls) &&
        Objects.equals(localAdsEnabled, applicationResponse.localAdsEnabled) &&
        Objects.equals(trilatSettings, applicationResponse.trilatSettings) &&
        Objects.equals(appType, applicationResponse.appType) &&
        Objects.equals(appName, applicationResponse.appName) &&
        Objects.equals(bundleId, applicationResponse.bundleId) &&
        Objects.equals(scoringType, applicationResponse.scoringType) &&
        Objects.equals(hintCost, applicationResponse.hintCost) &&
        Objects.equals(maxScore, applicationResponse.maxScore) &&
        Objects.equals(ticketsPerPoint, applicationResponse.ticketsPerPoint) &&
        Objects.equals(hasGameData, applicationResponse.hasGameData) &&
        Objects.equals(globalTickets, applicationResponse.globalTickets) &&
        Objects.equals(eulaVersion, applicationResponse.eulaVersion) &&
        Objects.equals(eulaDateUpdated, applicationResponse.eulaDateUpdated) &&
        Objects.equals(modules, applicationResponse.modules) &&
        Objects.equals(billableEntityName, applicationResponse.billableEntityName) &&
        Objects.equals(showInActivities, applicationResponse.showInActivities) &&
        Objects.equals(cssClass, applicationResponse.cssClass) &&
        Objects.equals(inviteWelcomeText, applicationResponse.inviteWelcomeText) &&
        Objects.equals(invitePageUrl, applicationResponse.invitePageUrl) &&
        Objects.equals(apnsCertificateFileName, applicationResponse.apnsCertificateFileName) &&
        Objects.equals(facebookAppId, applicationResponse.facebookAppId) &&
        Objects.equals(facebookAppSecret, applicationResponse.facebookAppSecret) &&
        Objects.equals(appToken, applicationResponse.appToken) &&
        Objects.equals(googleApiKey, applicationResponse.googleApiKey) &&
        Objects.equals(appRestKey, applicationResponse.appRestKey) &&
        Objects.equals(publicContentApproval, applicationResponse.publicContentApproval) &&
        Objects.equals(productionMode, applicationResponse.productionMode) &&
        Objects.equals(minimumSessionLength, applicationResponse.minimumSessionLength) &&
        Objects.equals(sessionGapLength, applicationResponse.sessionGapLength) &&
        Objects.equals(sqootApiKey, applicationResponse.sqootApiKey) &&
        Objects.equals(amqpEnabled, applicationResponse.amqpEnabled) &&
        Objects.equals(authorizedCount, applicationResponse.authorizedCount) &&
        Objects.equals(authorizedServers, applicationResponse.authorizedServers) &&
        Objects.equals(returning, applicationResponse.returning);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valid, message, version, serializeNulls, startTimeLog, errorCode, request, applicationId, appKey, title, currentBuildVersion, currentApiVersion, appIcon, appLogo, active, about, landingPageUrl, landingPageFullUrl, defaultImageFullUrl, activityDescription, platforms, categories, placementCount, billable, hasAds, publicNotifications, urlScheme, global, downloadUrls, localAdsEnabled, trilatSettings, appType, appName, bundleId, scoringType, hintCost, maxScore, ticketsPerPoint, hasGameData, globalTickets, eulaVersion, eulaDateUpdated, modules, billableEntityName, showInActivities, cssClass, inviteWelcomeText, invitePageUrl, apnsCertificateFileName, facebookAppId, facebookAppSecret, appToken, googleApiKey, appRestKey, publicContentApproval, productionMode, minimumSessionLength, sessionGapLength, sqootApiKey, amqpEnabled, authorizedCount, authorizedServers, returning);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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


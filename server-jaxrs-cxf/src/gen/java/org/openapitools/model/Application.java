package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import org.openapitools.model.Asset;
import org.openapitools.model.BillableEntity;
import org.openapitools.model.BlobFile;
import org.openapitools.model.Category;
import org.openapitools.model.Placement;
import org.openapitools.model.Platform;
import org.openapitools.model.Retailer;
import org.openapitools.model.TrilatAppSettings;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Application  {
  
  @ApiModelProperty(value = "")

  private Long id;

  @ApiModelProperty(value = "")

  private Boolean active;

  @ApiModelProperty(value = "")

  private Boolean valid;

  @ApiModelProperty(value = "")

  private String title;

  @ApiModelProperty(value = "")

  private String about;

  @ApiModelProperty(value = "")

  private String certificateUrl;

  @ApiModelProperty(value = "")

  private String certificateName;

  @ApiModelProperty(value = "")

  @Valid

  private BlobFile certificate;

  @ApiModelProperty(value = "")

  private Date certificateLastUpdated;

  @ApiModelProperty(value = "")

  private String appDescription;

  @ApiModelProperty(value = "")

  private Boolean showInActivities;

  @ApiModelProperty(value = "")

  private String cssClass;

  @ApiModelProperty(value = "")

  private String inviteWelcomeText;

  @ApiModelProperty(value = "")

  private String bundleId;

  @ApiModelProperty(value = "")

  private String appType;

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

  private String appKey;

  @ApiModelProperty(value = "")

  private String appRestKey;

  @ApiModelProperty(value = "")

  private String appTokenKey;

  @ApiModelProperty(value = "")

  private Integer hintCost;

  @ApiModelProperty(value = "")

  private Date eulaDate;

  @ApiModelProperty(value = "")

  private String eulaVersion;

  @ApiModelProperty(value = "")

  private String landingPageUrl;

  @ApiModelProperty(value = "")

  private String invitePageUrl;

  @ApiModelProperty(value = "")

  private String downloadUrls;

  @ApiModelProperty(value = "")

  private String appName;

  @ApiModelProperty(value = "")

  @Valid

  private Asset appIcon;

  @ApiModelProperty(value = "")

  @Valid

  private Asset appLogo;

  @ApiModelProperty(value = "")

  @Valid

  private BillableEntity billableEntity;

  @ApiModelProperty(value = "")

  private String facebookAppId;

  @ApiModelProperty(value = "")

  private String facebookAppSecret;

  @ApiModelProperty(value = "")

  private String twitterAppId;

  @ApiModelProperty(value = "")

  private String twitterAppSecret;

  @ApiModelProperty(value = "")

  private String twitterCallbackURL;

  @ApiModelProperty(value = "")

  private String defaultImage;

  @ApiModelProperty(value = "")

  private String modules;

  @ApiModelProperty(value = "")

  private String authorizedServers;

  @ApiModelProperty(value = "")

  private Integer authorizedCount;

  @ApiModelProperty(value = "")

  private String activeServers;

  @ApiModelProperty(value = "")

  private Date licensePeriod;

  @ApiModelProperty(value = "")

  private Boolean hasGameData;

  @ApiModelProperty(value = "")

  private String currentBuildVersion;

  @ApiModelProperty(value = "")

  private String currentApiVersion;

  @ApiModelProperty(value = "")

  private Boolean globalTickets;

  @ApiModelProperty(value = "")

  private Float ticketsPerPoint;

  @ApiModelProperty(value = "")

  private Integer maxPointsPerScore;

  @ApiModelProperty(value = "")

  private Boolean useAppCache;

  @ApiModelProperty(value = "")

  private String uniqueUserTag;

  @ApiModelProperty(value = "")

  private Boolean useMatchingAlgorithm;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid Platform> platforms = new ArrayList<>();

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid Category> categories = new ArrayList<>();

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid Placement> placements = new ArrayList<>();

  @ApiModelProperty(value = "")

  private Boolean hasAdvertisements;

  @ApiModelProperty(value = "")

  private String appleAppId;

  @ApiModelProperty(value = "")

  private String googleAppId;

  @ApiModelProperty(value = "")

  private String googleApiKey;

  @ApiModelProperty(value = "")

  private String googleOAuthClientId;

  @ApiModelProperty(value = "")

  private String googleOAuthSecret;

  @ApiModelProperty(value = "")

  private String googleOAuthAccessToken;

  @ApiModelProperty(value = "")

  private String googleOAuthRefreshToken;

  @ApiModelProperty(value = "")

  private String baiduApiKey;

  @ApiModelProperty(value = "")

  private String baiduSecretKey;

  @ApiModelProperty(value = "")

  private String jpushAppKey;

  @ApiModelProperty(value = "")

  private String jpushMasterSecret;

  @ApiModelProperty(value = "")

  private String xgPushSecretKey;

  @ApiModelProperty(value = "")

  private Boolean publicNotifications;

  @ApiModelProperty(value = "")

  private String urlScheme;

  @ApiModelProperty(value = "")

  @Valid

  private Retailer retailer;

  @ApiModelProperty(value = "")

  private String objectStoreSession;

  @ApiModelProperty(value = "")

  private Boolean publicContentApproval;

  @ApiModelProperty(value = "")

  private Boolean productionMode;

  @ApiModelProperty(value = "")

  private String griplyBaseUrl;

  @ApiModelProperty(value = "")

  private Integer minimumSessionLength;

  @ApiModelProperty(value = "")

  private Integer sessionGapLength;

  @ApiModelProperty(value = "")

  private Boolean processSessionData;

  @ApiModelProperty(value = "")

  private Boolean localAdsEnabled;

  @ApiModelProperty(value = "")

  private Boolean includeInReport;

  @ApiModelProperty(value = "")

  private String sqootApiKey;

  @ApiModelProperty(value = "")

  private Boolean amqpEnabled;

  @ApiModelProperty(value = "")

  @Valid

  private TrilatAppSettings trilatSettings;
 /**
   * Get id
   * @return id
  **/
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Application id(Long id) {
    this.id = id;
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

  public Application active(Boolean active) {
    this.active = active;
    return this;
  }

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

  public Application valid(Boolean valid) {
    this.valid = valid;
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

  public Application title(String title) {
    this.title = title;
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

  public Application about(String about) {
    this.about = about;
    return this;
  }

 /**
   * Get certificateUrl
   * @return certificateUrl
  **/
  @JsonProperty("certificateUrl")
  public String getCertificateUrl() {
    return certificateUrl;
  }

  public void setCertificateUrl(String certificateUrl) {
    this.certificateUrl = certificateUrl;
  }

  public Application certificateUrl(String certificateUrl) {
    this.certificateUrl = certificateUrl;
    return this;
  }

 /**
   * Get certificateName
   * @return certificateName
  **/
  @JsonProperty("certificateName")
  public String getCertificateName() {
    return certificateName;
  }

  public void setCertificateName(String certificateName) {
    this.certificateName = certificateName;
  }

  public Application certificateName(String certificateName) {
    this.certificateName = certificateName;
    return this;
  }

 /**
   * Get certificate
   * @return certificate
  **/
  @JsonProperty("certificate")
  public BlobFile getCertificate() {
    return certificate;
  }

  public void setCertificate(BlobFile certificate) {
    this.certificate = certificate;
  }

  public Application certificate(BlobFile certificate) {
    this.certificate = certificate;
    return this;
  }

 /**
   * Get certificateLastUpdated
   * @return certificateLastUpdated
  **/
  @JsonProperty("certificateLastUpdated")
  public Date getCertificateLastUpdated() {
    return certificateLastUpdated;
  }

  public void setCertificateLastUpdated(Date certificateLastUpdated) {
    this.certificateLastUpdated = certificateLastUpdated;
  }

  public Application certificateLastUpdated(Date certificateLastUpdated) {
    this.certificateLastUpdated = certificateLastUpdated;
    return this;
  }

 /**
   * Get appDescription
   * @return appDescription
  **/
  @JsonProperty("appDescription")
  public String getAppDescription() {
    return appDescription;
  }

  public void setAppDescription(String appDescription) {
    this.appDescription = appDescription;
  }

  public Application appDescription(String appDescription) {
    this.appDescription = appDescription;
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

  public Application showInActivities(Boolean showInActivities) {
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

  public Application cssClass(String cssClass) {
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

  public Application inviteWelcomeText(String inviteWelcomeText) {
    this.inviteWelcomeText = inviteWelcomeText;
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

  public Application bundleId(String bundleId) {
    this.bundleId = bundleId;
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

  public Application appType(String appType) {
    this.appType = appType;
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

  public Application scoringType(ScoringTypeEnum scoringType) {
    this.scoringType = scoringType;
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

  public Application appKey(String appKey) {
    this.appKey = appKey;
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

  public Application appRestKey(String appRestKey) {
    this.appRestKey = appRestKey;
    return this;
  }

 /**
   * Get appTokenKey
   * @return appTokenKey
  **/
  @JsonProperty("appTokenKey")
  public String getAppTokenKey() {
    return appTokenKey;
  }

  public void setAppTokenKey(String appTokenKey) {
    this.appTokenKey = appTokenKey;
  }

  public Application appTokenKey(String appTokenKey) {
    this.appTokenKey = appTokenKey;
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

  public Application hintCost(Integer hintCost) {
    this.hintCost = hintCost;
    return this;
  }

 /**
   * Get eulaDate
   * @return eulaDate
  **/
  @JsonProperty("eulaDate")
  public Date getEulaDate() {
    return eulaDate;
  }

  public void setEulaDate(Date eulaDate) {
    this.eulaDate = eulaDate;
  }

  public Application eulaDate(Date eulaDate) {
    this.eulaDate = eulaDate;
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

  public Application eulaVersion(String eulaVersion) {
    this.eulaVersion = eulaVersion;
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

  public Application landingPageUrl(String landingPageUrl) {
    this.landingPageUrl = landingPageUrl;
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

  public Application invitePageUrl(String invitePageUrl) {
    this.invitePageUrl = invitePageUrl;
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

  public Application downloadUrls(String downloadUrls) {
    this.downloadUrls = downloadUrls;
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

  public Application appName(String appName) {
    this.appName = appName;
    return this;
  }

 /**
   * Get appIcon
   * @return appIcon
  **/
  @JsonProperty("appIcon")
  public Asset getAppIcon() {
    return appIcon;
  }

  public void setAppIcon(Asset appIcon) {
    this.appIcon = appIcon;
  }

  public Application appIcon(Asset appIcon) {
    this.appIcon = appIcon;
    return this;
  }

 /**
   * Get appLogo
   * @return appLogo
  **/
  @JsonProperty("appLogo")
  public Asset getAppLogo() {
    return appLogo;
  }

  public void setAppLogo(Asset appLogo) {
    this.appLogo = appLogo;
  }

  public Application appLogo(Asset appLogo) {
    this.appLogo = appLogo;
    return this;
  }

 /**
   * Get billableEntity
   * @return billableEntity
  **/
  @JsonProperty("billableEntity")
  public BillableEntity getBillableEntity() {
    return billableEntity;
  }

  public void setBillableEntity(BillableEntity billableEntity) {
    this.billableEntity = billableEntity;
  }

  public Application billableEntity(BillableEntity billableEntity) {
    this.billableEntity = billableEntity;
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

  public Application facebookAppId(String facebookAppId) {
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

  public Application facebookAppSecret(String facebookAppSecret) {
    this.facebookAppSecret = facebookAppSecret;
    return this;
  }

 /**
   * Get twitterAppId
   * @return twitterAppId
  **/
  @JsonProperty("twitterAppId")
  public String getTwitterAppId() {
    return twitterAppId;
  }

  public void setTwitterAppId(String twitterAppId) {
    this.twitterAppId = twitterAppId;
  }

  public Application twitterAppId(String twitterAppId) {
    this.twitterAppId = twitterAppId;
    return this;
  }

 /**
   * Get twitterAppSecret
   * @return twitterAppSecret
  **/
  @JsonProperty("twitterAppSecret")
  public String getTwitterAppSecret() {
    return twitterAppSecret;
  }

  public void setTwitterAppSecret(String twitterAppSecret) {
    this.twitterAppSecret = twitterAppSecret;
  }

  public Application twitterAppSecret(String twitterAppSecret) {
    this.twitterAppSecret = twitterAppSecret;
    return this;
  }

 /**
   * Get twitterCallbackURL
   * @return twitterCallbackURL
  **/
  @JsonProperty("twitterCallbackURL")
  public String getTwitterCallbackURL() {
    return twitterCallbackURL;
  }

  public void setTwitterCallbackURL(String twitterCallbackURL) {
    this.twitterCallbackURL = twitterCallbackURL;
  }

  public Application twitterCallbackURL(String twitterCallbackURL) {
    this.twitterCallbackURL = twitterCallbackURL;
    return this;
  }

 /**
   * Get defaultImage
   * @return defaultImage
  **/
  @JsonProperty("defaultImage")
  public String getDefaultImage() {
    return defaultImage;
  }

  public void setDefaultImage(String defaultImage) {
    this.defaultImage = defaultImage;
  }

  public Application defaultImage(String defaultImage) {
    this.defaultImage = defaultImage;
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

  public Application modules(String modules) {
    this.modules = modules;
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

  public Application authorizedServers(String authorizedServers) {
    this.authorizedServers = authorizedServers;
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

  public Application authorizedCount(Integer authorizedCount) {
    this.authorizedCount = authorizedCount;
    return this;
  }

 /**
   * Get activeServers
   * @return activeServers
  **/
  @JsonProperty("activeServers")
  public String getActiveServers() {
    return activeServers;
  }

  public void setActiveServers(String activeServers) {
    this.activeServers = activeServers;
  }

  public Application activeServers(String activeServers) {
    this.activeServers = activeServers;
    return this;
  }

 /**
   * Get licensePeriod
   * @return licensePeriod
  **/
  @JsonProperty("licensePeriod")
  public Date getLicensePeriod() {
    return licensePeriod;
  }

  public void setLicensePeriod(Date licensePeriod) {
    this.licensePeriod = licensePeriod;
  }

  public Application licensePeriod(Date licensePeriod) {
    this.licensePeriod = licensePeriod;
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

  public Application hasGameData(Boolean hasGameData) {
    this.hasGameData = hasGameData;
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

  public Application currentBuildVersion(String currentBuildVersion) {
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

  public Application currentApiVersion(String currentApiVersion) {
    this.currentApiVersion = currentApiVersion;
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

  public Application globalTickets(Boolean globalTickets) {
    this.globalTickets = globalTickets;
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

  public Application ticketsPerPoint(Float ticketsPerPoint) {
    this.ticketsPerPoint = ticketsPerPoint;
    return this;
  }

 /**
   * Get maxPointsPerScore
   * @return maxPointsPerScore
  **/
  @JsonProperty("maxPointsPerScore")
  public Integer getMaxPointsPerScore() {
    return maxPointsPerScore;
  }

  public void setMaxPointsPerScore(Integer maxPointsPerScore) {
    this.maxPointsPerScore = maxPointsPerScore;
  }

  public Application maxPointsPerScore(Integer maxPointsPerScore) {
    this.maxPointsPerScore = maxPointsPerScore;
    return this;
  }

 /**
   * Get useAppCache
   * @return useAppCache
  **/
  @JsonProperty("useAppCache")
  public Boolean getUseAppCache() {
    return useAppCache;
  }

  public void setUseAppCache(Boolean useAppCache) {
    this.useAppCache = useAppCache;
  }

  public Application useAppCache(Boolean useAppCache) {
    this.useAppCache = useAppCache;
    return this;
  }

 /**
   * Get uniqueUserTag
   * @return uniqueUserTag
  **/
  @JsonProperty("uniqueUserTag")
  public String getUniqueUserTag() {
    return uniqueUserTag;
  }

  public void setUniqueUserTag(String uniqueUserTag) {
    this.uniqueUserTag = uniqueUserTag;
  }

  public Application uniqueUserTag(String uniqueUserTag) {
    this.uniqueUserTag = uniqueUserTag;
    return this;
  }

 /**
   * Get useMatchingAlgorithm
   * @return useMatchingAlgorithm
  **/
  @JsonProperty("useMatchingAlgorithm")
  public Boolean getUseMatchingAlgorithm() {
    return useMatchingAlgorithm;
  }

  public void setUseMatchingAlgorithm(Boolean useMatchingAlgorithm) {
    this.useMatchingAlgorithm = useMatchingAlgorithm;
  }

  public Application useMatchingAlgorithm(Boolean useMatchingAlgorithm) {
    this.useMatchingAlgorithm = useMatchingAlgorithm;
    return this;
  }

 /**
   * Get platforms
   * @return platforms
  **/
  @JsonProperty("platforms")
  public List<@Valid Platform> getPlatforms() {
    return platforms;
  }

  public void setPlatforms(List<@Valid Platform> platforms) {
    this.platforms = platforms;
  }

  public Application platforms(List<@Valid Platform> platforms) {
    this.platforms = platforms;
    return this;
  }

  public Application addPlatformsItem(Platform platformsItem) {
    this.platforms.add(platformsItem);
    return this;
  }

 /**
   * Get categories
   * @return categories
  **/
  @JsonProperty("categories")
  public List<@Valid Category> getCategories() {
    return categories;
  }

  public void setCategories(List<@Valid Category> categories) {
    this.categories = categories;
  }

  public Application categories(List<@Valid Category> categories) {
    this.categories = categories;
    return this;
  }

  public Application addCategoriesItem(Category categoriesItem) {
    this.categories.add(categoriesItem);
    return this;
  }

 /**
   * Get placements
   * @return placements
  **/
  @JsonProperty("placements")
  public List<@Valid Placement> getPlacements() {
    return placements;
  }

  public void setPlacements(List<@Valid Placement> placements) {
    this.placements = placements;
  }

  public Application placements(List<@Valid Placement> placements) {
    this.placements = placements;
    return this;
  }

  public Application addPlacementsItem(Placement placementsItem) {
    this.placements.add(placementsItem);
    return this;
  }

 /**
   * Get hasAdvertisements
   * @return hasAdvertisements
  **/
  @JsonProperty("hasAdvertisements")
  public Boolean getHasAdvertisements() {
    return hasAdvertisements;
  }

  public void setHasAdvertisements(Boolean hasAdvertisements) {
    this.hasAdvertisements = hasAdvertisements;
  }

  public Application hasAdvertisements(Boolean hasAdvertisements) {
    this.hasAdvertisements = hasAdvertisements;
    return this;
  }

 /**
   * Get appleAppId
   * @return appleAppId
  **/
  @JsonProperty("appleAppId")
  public String getAppleAppId() {
    return appleAppId;
  }

  public void setAppleAppId(String appleAppId) {
    this.appleAppId = appleAppId;
  }

  public Application appleAppId(String appleAppId) {
    this.appleAppId = appleAppId;
    return this;
  }

 /**
   * Get googleAppId
   * @return googleAppId
  **/
  @JsonProperty("googleAppId")
  public String getGoogleAppId() {
    return googleAppId;
  }

  public void setGoogleAppId(String googleAppId) {
    this.googleAppId = googleAppId;
  }

  public Application googleAppId(String googleAppId) {
    this.googleAppId = googleAppId;
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

  public Application googleApiKey(String googleApiKey) {
    this.googleApiKey = googleApiKey;
    return this;
  }

 /**
   * Get googleOAuthClientId
   * @return googleOAuthClientId
  **/
  @JsonProperty("googleOAuthClientId")
  public String getGoogleOAuthClientId() {
    return googleOAuthClientId;
  }

  public void setGoogleOAuthClientId(String googleOAuthClientId) {
    this.googleOAuthClientId = googleOAuthClientId;
  }

  public Application googleOAuthClientId(String googleOAuthClientId) {
    this.googleOAuthClientId = googleOAuthClientId;
    return this;
  }

 /**
   * Get googleOAuthSecret
   * @return googleOAuthSecret
  **/
  @JsonProperty("googleOAuthSecret")
  public String getGoogleOAuthSecret() {
    return googleOAuthSecret;
  }

  public void setGoogleOAuthSecret(String googleOAuthSecret) {
    this.googleOAuthSecret = googleOAuthSecret;
  }

  public Application googleOAuthSecret(String googleOAuthSecret) {
    this.googleOAuthSecret = googleOAuthSecret;
    return this;
  }

 /**
   * Get googleOAuthAccessToken
   * @return googleOAuthAccessToken
  **/
  @JsonProperty("googleOAuthAccessToken")
  public String getGoogleOAuthAccessToken() {
    return googleOAuthAccessToken;
  }

  public void setGoogleOAuthAccessToken(String googleOAuthAccessToken) {
    this.googleOAuthAccessToken = googleOAuthAccessToken;
  }

  public Application googleOAuthAccessToken(String googleOAuthAccessToken) {
    this.googleOAuthAccessToken = googleOAuthAccessToken;
    return this;
  }

 /**
   * Get googleOAuthRefreshToken
   * @return googleOAuthRefreshToken
  **/
  @JsonProperty("googleOAuthRefreshToken")
  public String getGoogleOAuthRefreshToken() {
    return googleOAuthRefreshToken;
  }

  public void setGoogleOAuthRefreshToken(String googleOAuthRefreshToken) {
    this.googleOAuthRefreshToken = googleOAuthRefreshToken;
  }

  public Application googleOAuthRefreshToken(String googleOAuthRefreshToken) {
    this.googleOAuthRefreshToken = googleOAuthRefreshToken;
    return this;
  }

 /**
   * Get baiduApiKey
   * @return baiduApiKey
  **/
  @JsonProperty("baiduApiKey")
  public String getBaiduApiKey() {
    return baiduApiKey;
  }

  public void setBaiduApiKey(String baiduApiKey) {
    this.baiduApiKey = baiduApiKey;
  }

  public Application baiduApiKey(String baiduApiKey) {
    this.baiduApiKey = baiduApiKey;
    return this;
  }

 /**
   * Get baiduSecretKey
   * @return baiduSecretKey
  **/
  @JsonProperty("baiduSecretKey")
  public String getBaiduSecretKey() {
    return baiduSecretKey;
  }

  public void setBaiduSecretKey(String baiduSecretKey) {
    this.baiduSecretKey = baiduSecretKey;
  }

  public Application baiduSecretKey(String baiduSecretKey) {
    this.baiduSecretKey = baiduSecretKey;
    return this;
  }

 /**
   * Get jpushAppKey
   * @return jpushAppKey
  **/
  @JsonProperty("jpushAppKey")
  public String getJpushAppKey() {
    return jpushAppKey;
  }

  public void setJpushAppKey(String jpushAppKey) {
    this.jpushAppKey = jpushAppKey;
  }

  public Application jpushAppKey(String jpushAppKey) {
    this.jpushAppKey = jpushAppKey;
    return this;
  }

 /**
   * Get jpushMasterSecret
   * @return jpushMasterSecret
  **/
  @JsonProperty("jpushMasterSecret")
  public String getJpushMasterSecret() {
    return jpushMasterSecret;
  }

  public void setJpushMasterSecret(String jpushMasterSecret) {
    this.jpushMasterSecret = jpushMasterSecret;
  }

  public Application jpushMasterSecret(String jpushMasterSecret) {
    this.jpushMasterSecret = jpushMasterSecret;
    return this;
  }

 /**
   * Get xgPushSecretKey
   * @return xgPushSecretKey
  **/
  @JsonProperty("xgPushSecretKey")
  public String getXgPushSecretKey() {
    return xgPushSecretKey;
  }

  public void setXgPushSecretKey(String xgPushSecretKey) {
    this.xgPushSecretKey = xgPushSecretKey;
  }

  public Application xgPushSecretKey(String xgPushSecretKey) {
    this.xgPushSecretKey = xgPushSecretKey;
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

  public Application publicNotifications(Boolean publicNotifications) {
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

  public Application urlScheme(String urlScheme) {
    this.urlScheme = urlScheme;
    return this;
  }

 /**
   * Get retailer
   * @return retailer
  **/
  @JsonProperty("retailer")
  public Retailer getRetailer() {
    return retailer;
  }

  public void setRetailer(Retailer retailer) {
    this.retailer = retailer;
  }

  public Application retailer(Retailer retailer) {
    this.retailer = retailer;
    return this;
  }

 /**
   * Get objectStoreSession
   * @return objectStoreSession
  **/
  @JsonProperty("objectStoreSession")
  public String getObjectStoreSession() {
    return objectStoreSession;
  }

  public void setObjectStoreSession(String objectStoreSession) {
    this.objectStoreSession = objectStoreSession;
  }

  public Application objectStoreSession(String objectStoreSession) {
    this.objectStoreSession = objectStoreSession;
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

  public Application publicContentApproval(Boolean publicContentApproval) {
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

  public Application productionMode(Boolean productionMode) {
    this.productionMode = productionMode;
    return this;
  }

 /**
   * Get griplyBaseUrl
   * @return griplyBaseUrl
  **/
  @JsonProperty("griplyBaseUrl")
  public String getGriplyBaseUrl() {
    return griplyBaseUrl;
  }

  public void setGriplyBaseUrl(String griplyBaseUrl) {
    this.griplyBaseUrl = griplyBaseUrl;
  }

  public Application griplyBaseUrl(String griplyBaseUrl) {
    this.griplyBaseUrl = griplyBaseUrl;
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

  public Application minimumSessionLength(Integer minimumSessionLength) {
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

  public Application sessionGapLength(Integer sessionGapLength) {
    this.sessionGapLength = sessionGapLength;
    return this;
  }

 /**
   * Get processSessionData
   * @return processSessionData
  **/
  @JsonProperty("processSessionData")
  public Boolean getProcessSessionData() {
    return processSessionData;
  }

  public void setProcessSessionData(Boolean processSessionData) {
    this.processSessionData = processSessionData;
  }

  public Application processSessionData(Boolean processSessionData) {
    this.processSessionData = processSessionData;
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

  public Application localAdsEnabled(Boolean localAdsEnabled) {
    this.localAdsEnabled = localAdsEnabled;
    return this;
  }

 /**
   * Get includeInReport
   * @return includeInReport
  **/
  @JsonProperty("includeInReport")
  public Boolean getIncludeInReport() {
    return includeInReport;
  }

  public void setIncludeInReport(Boolean includeInReport) {
    this.includeInReport = includeInReport;
  }

  public Application includeInReport(Boolean includeInReport) {
    this.includeInReport = includeInReport;
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

  public Application sqootApiKey(String sqootApiKey) {
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

  public Application amqpEnabled(Boolean amqpEnabled) {
    this.amqpEnabled = amqpEnabled;
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

  public Application trilatSettings(TrilatAppSettings trilatSettings) {
    this.trilatSettings = trilatSettings;
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
    Application application = (Application) o;
    return Objects.equals(this.id, application.id) &&
        Objects.equals(this.active, application.active) &&
        Objects.equals(this.valid, application.valid) &&
        Objects.equals(this.title, application.title) &&
        Objects.equals(this.about, application.about) &&
        Objects.equals(this.certificateUrl, application.certificateUrl) &&
        Objects.equals(this.certificateName, application.certificateName) &&
        Objects.equals(this.certificate, application.certificate) &&
        Objects.equals(this.certificateLastUpdated, application.certificateLastUpdated) &&
        Objects.equals(this.appDescription, application.appDescription) &&
        Objects.equals(this.showInActivities, application.showInActivities) &&
        Objects.equals(this.cssClass, application.cssClass) &&
        Objects.equals(this.inviteWelcomeText, application.inviteWelcomeText) &&
        Objects.equals(this.bundleId, application.bundleId) &&
        Objects.equals(this.appType, application.appType) &&
        Objects.equals(this.scoringType, application.scoringType) &&
        Objects.equals(this.appKey, application.appKey) &&
        Objects.equals(this.appRestKey, application.appRestKey) &&
        Objects.equals(this.appTokenKey, application.appTokenKey) &&
        Objects.equals(this.hintCost, application.hintCost) &&
        Objects.equals(this.eulaDate, application.eulaDate) &&
        Objects.equals(this.eulaVersion, application.eulaVersion) &&
        Objects.equals(this.landingPageUrl, application.landingPageUrl) &&
        Objects.equals(this.invitePageUrl, application.invitePageUrl) &&
        Objects.equals(this.downloadUrls, application.downloadUrls) &&
        Objects.equals(this.appName, application.appName) &&
        Objects.equals(this.appIcon, application.appIcon) &&
        Objects.equals(this.appLogo, application.appLogo) &&
        Objects.equals(this.billableEntity, application.billableEntity) &&
        Objects.equals(this.facebookAppId, application.facebookAppId) &&
        Objects.equals(this.facebookAppSecret, application.facebookAppSecret) &&
        Objects.equals(this.twitterAppId, application.twitterAppId) &&
        Objects.equals(this.twitterAppSecret, application.twitterAppSecret) &&
        Objects.equals(this.twitterCallbackURL, application.twitterCallbackURL) &&
        Objects.equals(this.defaultImage, application.defaultImage) &&
        Objects.equals(this.modules, application.modules) &&
        Objects.equals(this.authorizedServers, application.authorizedServers) &&
        Objects.equals(this.authorizedCount, application.authorizedCount) &&
        Objects.equals(this.activeServers, application.activeServers) &&
        Objects.equals(this.licensePeriod, application.licensePeriod) &&
        Objects.equals(this.hasGameData, application.hasGameData) &&
        Objects.equals(this.currentBuildVersion, application.currentBuildVersion) &&
        Objects.equals(this.currentApiVersion, application.currentApiVersion) &&
        Objects.equals(this.globalTickets, application.globalTickets) &&
        Objects.equals(this.ticketsPerPoint, application.ticketsPerPoint) &&
        Objects.equals(this.maxPointsPerScore, application.maxPointsPerScore) &&
        Objects.equals(this.useAppCache, application.useAppCache) &&
        Objects.equals(this.uniqueUserTag, application.uniqueUserTag) &&
        Objects.equals(this.useMatchingAlgorithm, application.useMatchingAlgorithm) &&
        Objects.equals(this.platforms, application.platforms) &&
        Objects.equals(this.categories, application.categories) &&
        Objects.equals(this.placements, application.placements) &&
        Objects.equals(this.hasAdvertisements, application.hasAdvertisements) &&
        Objects.equals(this.appleAppId, application.appleAppId) &&
        Objects.equals(this.googleAppId, application.googleAppId) &&
        Objects.equals(this.googleApiKey, application.googleApiKey) &&
        Objects.equals(this.googleOAuthClientId, application.googleOAuthClientId) &&
        Objects.equals(this.googleOAuthSecret, application.googleOAuthSecret) &&
        Objects.equals(this.googleOAuthAccessToken, application.googleOAuthAccessToken) &&
        Objects.equals(this.googleOAuthRefreshToken, application.googleOAuthRefreshToken) &&
        Objects.equals(this.baiduApiKey, application.baiduApiKey) &&
        Objects.equals(this.baiduSecretKey, application.baiduSecretKey) &&
        Objects.equals(this.jpushAppKey, application.jpushAppKey) &&
        Objects.equals(this.jpushMasterSecret, application.jpushMasterSecret) &&
        Objects.equals(this.xgPushSecretKey, application.xgPushSecretKey) &&
        Objects.equals(this.publicNotifications, application.publicNotifications) &&
        Objects.equals(this.urlScheme, application.urlScheme) &&
        Objects.equals(this.retailer, application.retailer) &&
        Objects.equals(this.objectStoreSession, application.objectStoreSession) &&
        Objects.equals(this.publicContentApproval, application.publicContentApproval) &&
        Objects.equals(this.productionMode, application.productionMode) &&
        Objects.equals(this.griplyBaseUrl, application.griplyBaseUrl) &&
        Objects.equals(this.minimumSessionLength, application.minimumSessionLength) &&
        Objects.equals(this.sessionGapLength, application.sessionGapLength) &&
        Objects.equals(this.processSessionData, application.processSessionData) &&
        Objects.equals(this.localAdsEnabled, application.localAdsEnabled) &&
        Objects.equals(this.includeInReport, application.includeInReport) &&
        Objects.equals(this.sqootApiKey, application.sqootApiKey) &&
        Objects.equals(this.amqpEnabled, application.amqpEnabled) &&
        Objects.equals(this.trilatSettings, application.trilatSettings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, active, valid, title, about, certificateUrl, certificateName, certificate, certificateLastUpdated, appDescription, showInActivities, cssClass, inviteWelcomeText, bundleId, appType, scoringType, appKey, appRestKey, appTokenKey, hintCost, eulaDate, eulaVersion, landingPageUrl, invitePageUrl, downloadUrls, appName, appIcon, appLogo, billableEntity, facebookAppId, facebookAppSecret, twitterAppId, twitterAppSecret, twitterCallbackURL, defaultImage, modules, authorizedServers, authorizedCount, activeServers, licensePeriod, hasGameData, currentBuildVersion, currentApiVersion, globalTickets, ticketsPerPoint, maxPointsPerScore, useAppCache, uniqueUserTag, useMatchingAlgorithm, platforms, categories, placements, hasAdvertisements, appleAppId, googleAppId, googleApiKey, googleOAuthClientId, googleOAuthSecret, googleOAuthAccessToken, googleOAuthRefreshToken, baiduApiKey, baiduSecretKey, jpushAppKey, jpushMasterSecret, xgPushSecretKey, publicNotifications, urlScheme, retailer, objectStoreSession, publicContentApproval, productionMode, griplyBaseUrl, minimumSessionLength, sessionGapLength, processSessionData, localAdsEnabled, includeInReport, sqootApiKey, amqpEnabled, trilatSettings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Application {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    about: ").append(toIndentedString(about)).append("\n");
    sb.append("    certificateUrl: ").append(toIndentedString(certificateUrl)).append("\n");
    sb.append("    certificateName: ").append(toIndentedString(certificateName)).append("\n");
    sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
    sb.append("    certificateLastUpdated: ").append(toIndentedString(certificateLastUpdated)).append("\n");
    sb.append("    appDescription: ").append(toIndentedString(appDescription)).append("\n");
    sb.append("    showInActivities: ").append(toIndentedString(showInActivities)).append("\n");
    sb.append("    cssClass: ").append(toIndentedString(cssClass)).append("\n");
    sb.append("    inviteWelcomeText: ").append(toIndentedString(inviteWelcomeText)).append("\n");
    sb.append("    bundleId: ").append(toIndentedString(bundleId)).append("\n");
    sb.append("    appType: ").append(toIndentedString(appType)).append("\n");
    sb.append("    scoringType: ").append(toIndentedString(scoringType)).append("\n");
    sb.append("    appKey: ").append(toIndentedString(appKey)).append("\n");
    sb.append("    appRestKey: ").append(toIndentedString(appRestKey)).append("\n");
    sb.append("    appTokenKey: ").append(toIndentedString(appTokenKey)).append("\n");
    sb.append("    hintCost: ").append(toIndentedString(hintCost)).append("\n");
    sb.append("    eulaDate: ").append(toIndentedString(eulaDate)).append("\n");
    sb.append("    eulaVersion: ").append(toIndentedString(eulaVersion)).append("\n");
    sb.append("    landingPageUrl: ").append(toIndentedString(landingPageUrl)).append("\n");
    sb.append("    invitePageUrl: ").append(toIndentedString(invitePageUrl)).append("\n");
    sb.append("    downloadUrls: ").append(toIndentedString(downloadUrls)).append("\n");
    sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
    sb.append("    appIcon: ").append(toIndentedString(appIcon)).append("\n");
    sb.append("    appLogo: ").append(toIndentedString(appLogo)).append("\n");
    sb.append("    billableEntity: ").append(toIndentedString(billableEntity)).append("\n");
    sb.append("    facebookAppId: ").append(toIndentedString(facebookAppId)).append("\n");
    sb.append("    facebookAppSecret: ").append(toIndentedString(facebookAppSecret)).append("\n");
    sb.append("    twitterAppId: ").append(toIndentedString(twitterAppId)).append("\n");
    sb.append("    twitterAppSecret: ").append(toIndentedString(twitterAppSecret)).append("\n");
    sb.append("    twitterCallbackURL: ").append(toIndentedString(twitterCallbackURL)).append("\n");
    sb.append("    defaultImage: ").append(toIndentedString(defaultImage)).append("\n");
    sb.append("    modules: ").append(toIndentedString(modules)).append("\n");
    sb.append("    authorizedServers: ").append(toIndentedString(authorizedServers)).append("\n");
    sb.append("    authorizedCount: ").append(toIndentedString(authorizedCount)).append("\n");
    sb.append("    activeServers: ").append(toIndentedString(activeServers)).append("\n");
    sb.append("    licensePeriod: ").append(toIndentedString(licensePeriod)).append("\n");
    sb.append("    hasGameData: ").append(toIndentedString(hasGameData)).append("\n");
    sb.append("    currentBuildVersion: ").append(toIndentedString(currentBuildVersion)).append("\n");
    sb.append("    currentApiVersion: ").append(toIndentedString(currentApiVersion)).append("\n");
    sb.append("    globalTickets: ").append(toIndentedString(globalTickets)).append("\n");
    sb.append("    ticketsPerPoint: ").append(toIndentedString(ticketsPerPoint)).append("\n");
    sb.append("    maxPointsPerScore: ").append(toIndentedString(maxPointsPerScore)).append("\n");
    sb.append("    useAppCache: ").append(toIndentedString(useAppCache)).append("\n");
    sb.append("    uniqueUserTag: ").append(toIndentedString(uniqueUserTag)).append("\n");
    sb.append("    useMatchingAlgorithm: ").append(toIndentedString(useMatchingAlgorithm)).append("\n");
    sb.append("    platforms: ").append(toIndentedString(platforms)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    placements: ").append(toIndentedString(placements)).append("\n");
    sb.append("    hasAdvertisements: ").append(toIndentedString(hasAdvertisements)).append("\n");
    sb.append("    appleAppId: ").append(toIndentedString(appleAppId)).append("\n");
    sb.append("    googleAppId: ").append(toIndentedString(googleAppId)).append("\n");
    sb.append("    googleApiKey: ").append(toIndentedString(googleApiKey)).append("\n");
    sb.append("    googleOAuthClientId: ").append(toIndentedString(googleOAuthClientId)).append("\n");
    sb.append("    googleOAuthSecret: ").append(toIndentedString(googleOAuthSecret)).append("\n");
    sb.append("    googleOAuthAccessToken: ").append(toIndentedString(googleOAuthAccessToken)).append("\n");
    sb.append("    googleOAuthRefreshToken: ").append(toIndentedString(googleOAuthRefreshToken)).append("\n");
    sb.append("    baiduApiKey: ").append(toIndentedString(baiduApiKey)).append("\n");
    sb.append("    baiduSecretKey: ").append(toIndentedString(baiduSecretKey)).append("\n");
    sb.append("    jpushAppKey: ").append(toIndentedString(jpushAppKey)).append("\n");
    sb.append("    jpushMasterSecret: ").append(toIndentedString(jpushMasterSecret)).append("\n");
    sb.append("    xgPushSecretKey: ").append(toIndentedString(xgPushSecretKey)).append("\n");
    sb.append("    publicNotifications: ").append(toIndentedString(publicNotifications)).append("\n");
    sb.append("    urlScheme: ").append(toIndentedString(urlScheme)).append("\n");
    sb.append("    retailer: ").append(toIndentedString(retailer)).append("\n");
    sb.append("    objectStoreSession: ").append(toIndentedString(objectStoreSession)).append("\n");
    sb.append("    publicContentApproval: ").append(toIndentedString(publicContentApproval)).append("\n");
    sb.append("    productionMode: ").append(toIndentedString(productionMode)).append("\n");
    sb.append("    griplyBaseUrl: ").append(toIndentedString(griplyBaseUrl)).append("\n");
    sb.append("    minimumSessionLength: ").append(toIndentedString(minimumSessionLength)).append("\n");
    sb.append("    sessionGapLength: ").append(toIndentedString(sessionGapLength)).append("\n");
    sb.append("    processSessionData: ").append(toIndentedString(processSessionData)).append("\n");
    sb.append("    localAdsEnabled: ").append(toIndentedString(localAdsEnabled)).append("\n");
    sb.append("    includeInReport: ").append(toIndentedString(includeInReport)).append("\n");
    sb.append("    sqootApiKey: ").append(toIndentedString(sqootApiKey)).append("\n");
    sb.append("    amqpEnabled: ").append(toIndentedString(amqpEnabled)).append("\n");
    sb.append("    trilatSettings: ").append(toIndentedString(trilatSettings)).append("\n");
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


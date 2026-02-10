package apimodels;

import apimodels.Asset;
import apimodels.BillableEntity;
import apimodels.BlobFile;
import apimodels.Category;
import apimodels.Placement;
import apimodels.Platform;
import apimodels.Retailer;
import apimodels.TrilatAppSettings;
import java.time.OffsetDateTime;
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
 * Application
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class Application   {
  @JsonProperty("id")
  
  private Long id;

  @JsonProperty("active")
  
  private Boolean active;

  @JsonProperty("valid")
  
  private Boolean valid;

  @JsonProperty("title")
  
  private String title;

  @JsonProperty("about")
  
  private String about;

  @JsonProperty("certificateUrl")
  
  private String certificateUrl;

  @JsonProperty("certificateName")
  
  private String certificateName;

  @JsonProperty("certificate")
  @Valid

  private BlobFile certificate;

  @JsonProperty("certificateLastUpdated")
  @Valid

  private OffsetDateTime certificateLastUpdated;

  @JsonProperty("appDescription")
  
  private String appDescription;

  @JsonProperty("showInActivities")
  
  private Boolean showInActivities;

  @JsonProperty("cssClass")
  
  private String cssClass;

  @JsonProperty("inviteWelcomeText")
  
  private String inviteWelcomeText;

  @JsonProperty("bundleId")
  
  private String bundleId;

  @JsonProperty("appType")
  
  private String appType;

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

  @JsonProperty("appKey")
  
  private String appKey;

  @JsonProperty("appRestKey")
  
  private String appRestKey;

  @JsonProperty("appTokenKey")
  
  private String appTokenKey;

  @JsonProperty("hintCost")
  
  private Integer hintCost;

  @JsonProperty("eulaDate")
  @Valid

  private OffsetDateTime eulaDate;

  @JsonProperty("eulaVersion")
  
  private String eulaVersion;

  @JsonProperty("landingPageUrl")
  
  private String landingPageUrl;

  @JsonProperty("invitePageUrl")
  
  private String invitePageUrl;

  @JsonProperty("downloadUrls")
  
  private String downloadUrls;

  @JsonProperty("appName")
  
  private String appName;

  @JsonProperty("appIcon")
  @Valid

  private Asset appIcon;

  @JsonProperty("appLogo")
  @Valid

  private Asset appLogo;

  @JsonProperty("billableEntity")
  @Valid

  private BillableEntity billableEntity;

  @JsonProperty("facebookAppId")
  
  private String facebookAppId;

  @JsonProperty("facebookAppSecret")
  
  private String facebookAppSecret;

  @JsonProperty("twitterAppId")
  
  private String twitterAppId;

  @JsonProperty("twitterAppSecret")
  
  private String twitterAppSecret;

  @JsonProperty("twitterCallbackURL")
  
  private String twitterCallbackURL;

  @JsonProperty("defaultImage")
  
  private String defaultImage;

  @JsonProperty("modules")
  
  private String modules;

  @JsonProperty("authorizedServers")
  
  private String authorizedServers;

  @JsonProperty("authorizedCount")
  
  private Integer authorizedCount;

  @JsonProperty("activeServers")
  
  private String activeServers;

  @JsonProperty("licensePeriod")
  @Valid

  private OffsetDateTime licensePeriod;

  @JsonProperty("hasGameData")
  
  private Boolean hasGameData;

  @JsonProperty("currentBuildVersion")
  
  private String currentBuildVersion;

  @JsonProperty("currentApiVersion")
  
  private String currentApiVersion;

  @JsonProperty("globalTickets")
  
  private Boolean globalTickets;

  @JsonProperty("ticketsPerPoint")
  
  private Float ticketsPerPoint;

  @JsonProperty("maxPointsPerScore")
  
  private Integer maxPointsPerScore;

  @JsonProperty("useAppCache")
  
  private Boolean useAppCache;

  @JsonProperty("uniqueUserTag")
  
  private String uniqueUserTag;

  @JsonProperty("useMatchingAlgorithm")
  
  private Boolean useMatchingAlgorithm;

  @JsonProperty("platforms")
  @Valid

  private List<@Valid Platform> platforms = null;

  @JsonProperty("categories")
  @Valid

  private List<@Valid Category> categories = null;

  @JsonProperty("placements")
  @Valid

  private List<@Valid Placement> placements = null;

  @JsonProperty("hasAdvertisements")
  
  private Boolean hasAdvertisements;

  @JsonProperty("appleAppId")
  
  private String appleAppId;

  @JsonProperty("googleAppId")
  
  private String googleAppId;

  @JsonProperty("googleApiKey")
  
  private String googleApiKey;

  @JsonProperty("googleOAuthClientId")
  
  private String googleOAuthClientId;

  @JsonProperty("googleOAuthSecret")
  
  private String googleOAuthSecret;

  @JsonProperty("googleOAuthAccessToken")
  
  private String googleOAuthAccessToken;

  @JsonProperty("googleOAuthRefreshToken")
  
  private String googleOAuthRefreshToken;

  @JsonProperty("baiduApiKey")
  
  private String baiduApiKey;

  @JsonProperty("baiduSecretKey")
  
  private String baiduSecretKey;

  @JsonProperty("jpushAppKey")
  
  private String jpushAppKey;

  @JsonProperty("jpushMasterSecret")
  
  private String jpushMasterSecret;

  @JsonProperty("xgPushSecretKey")
  
  private String xgPushSecretKey;

  @JsonProperty("publicNotifications")
  
  private Boolean publicNotifications;

  @JsonProperty("urlScheme")
  
  private String urlScheme;

  @JsonProperty("retailer")
  @Valid

  private Retailer retailer;

  @JsonProperty("objectStoreSession")
  
  private String objectStoreSession;

  @JsonProperty("publicContentApproval")
  
  private Boolean publicContentApproval;

  @JsonProperty("productionMode")
  
  private Boolean productionMode;

  @JsonProperty("griplyBaseUrl")
  
  private String griplyBaseUrl;

  @JsonProperty("minimumSessionLength")
  
  private Integer minimumSessionLength;

  @JsonProperty("sessionGapLength")
  
  private Integer sessionGapLength;

  @JsonProperty("processSessionData")
  
  private Boolean processSessionData;

  @JsonProperty("localAdsEnabled")
  
  private Boolean localAdsEnabled;

  @JsonProperty("includeInReport")
  
  private Boolean includeInReport;

  @JsonProperty("sqootApiKey")
  
  private String sqootApiKey;

  @JsonProperty("amqpEnabled")
  
  private Boolean amqpEnabled;

  @JsonProperty("trilatSettings")
  @Valid

  private TrilatAppSettings trilatSettings;

  public Application id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Application active(Boolean active) {
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

  public Application valid(Boolean valid) {
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

  public Application title(String title) {
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

  public Application about(String about) {
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

  public Application certificateUrl(String certificateUrl) {
    this.certificateUrl = certificateUrl;
    return this;
  }

   /**
   * Get certificateUrl
   * @return certificateUrl
  **/
  public String getCertificateUrl() {
    return certificateUrl;
  }

  public void setCertificateUrl(String certificateUrl) {
    this.certificateUrl = certificateUrl;
  }

  public Application certificateName(String certificateName) {
    this.certificateName = certificateName;
    return this;
  }

   /**
   * Get certificateName
   * @return certificateName
  **/
  public String getCertificateName() {
    return certificateName;
  }

  public void setCertificateName(String certificateName) {
    this.certificateName = certificateName;
  }

  public Application certificate(BlobFile certificate) {
    this.certificate = certificate;
    return this;
  }

   /**
   * Get certificate
   * @return certificate
  **/
  public BlobFile getCertificate() {
    return certificate;
  }

  public void setCertificate(BlobFile certificate) {
    this.certificate = certificate;
  }

  public Application certificateLastUpdated(OffsetDateTime certificateLastUpdated) {
    this.certificateLastUpdated = certificateLastUpdated;
    return this;
  }

   /**
   * Get certificateLastUpdated
   * @return certificateLastUpdated
  **/
  public OffsetDateTime getCertificateLastUpdated() {
    return certificateLastUpdated;
  }

  public void setCertificateLastUpdated(OffsetDateTime certificateLastUpdated) {
    this.certificateLastUpdated = certificateLastUpdated;
  }

  public Application appDescription(String appDescription) {
    this.appDescription = appDescription;
    return this;
  }

   /**
   * Get appDescription
   * @return appDescription
  **/
  public String getAppDescription() {
    return appDescription;
  }

  public void setAppDescription(String appDescription) {
    this.appDescription = appDescription;
  }

  public Application showInActivities(Boolean showInActivities) {
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

  public Application cssClass(String cssClass) {
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

  public Application inviteWelcomeText(String inviteWelcomeText) {
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

  public Application bundleId(String bundleId) {
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

  public Application appType(String appType) {
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

  public Application scoringType(ScoringTypeEnum scoringType) {
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

  public Application appKey(String appKey) {
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

  public Application appRestKey(String appRestKey) {
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

  public Application appTokenKey(String appTokenKey) {
    this.appTokenKey = appTokenKey;
    return this;
  }

   /**
   * Get appTokenKey
   * @return appTokenKey
  **/
  public String getAppTokenKey() {
    return appTokenKey;
  }

  public void setAppTokenKey(String appTokenKey) {
    this.appTokenKey = appTokenKey;
  }

  public Application hintCost(Integer hintCost) {
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

  public Application eulaDate(OffsetDateTime eulaDate) {
    this.eulaDate = eulaDate;
    return this;
  }

   /**
   * Get eulaDate
   * @return eulaDate
  **/
  public OffsetDateTime getEulaDate() {
    return eulaDate;
  }

  public void setEulaDate(OffsetDateTime eulaDate) {
    this.eulaDate = eulaDate;
  }

  public Application eulaVersion(String eulaVersion) {
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

  public Application landingPageUrl(String landingPageUrl) {
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

  public Application invitePageUrl(String invitePageUrl) {
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

  public Application downloadUrls(String downloadUrls) {
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

  public Application appName(String appName) {
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

  public Application appIcon(Asset appIcon) {
    this.appIcon = appIcon;
    return this;
  }

   /**
   * Get appIcon
   * @return appIcon
  **/
  public Asset getAppIcon() {
    return appIcon;
  }

  public void setAppIcon(Asset appIcon) {
    this.appIcon = appIcon;
  }

  public Application appLogo(Asset appLogo) {
    this.appLogo = appLogo;
    return this;
  }

   /**
   * Get appLogo
   * @return appLogo
  **/
  public Asset getAppLogo() {
    return appLogo;
  }

  public void setAppLogo(Asset appLogo) {
    this.appLogo = appLogo;
  }

  public Application billableEntity(BillableEntity billableEntity) {
    this.billableEntity = billableEntity;
    return this;
  }

   /**
   * Get billableEntity
   * @return billableEntity
  **/
  public BillableEntity getBillableEntity() {
    return billableEntity;
  }

  public void setBillableEntity(BillableEntity billableEntity) {
    this.billableEntity = billableEntity;
  }

  public Application facebookAppId(String facebookAppId) {
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

  public Application facebookAppSecret(String facebookAppSecret) {
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

  public Application twitterAppId(String twitterAppId) {
    this.twitterAppId = twitterAppId;
    return this;
  }

   /**
   * Get twitterAppId
   * @return twitterAppId
  **/
  public String getTwitterAppId() {
    return twitterAppId;
  }

  public void setTwitterAppId(String twitterAppId) {
    this.twitterAppId = twitterAppId;
  }

  public Application twitterAppSecret(String twitterAppSecret) {
    this.twitterAppSecret = twitterAppSecret;
    return this;
  }

   /**
   * Get twitterAppSecret
   * @return twitterAppSecret
  **/
  public String getTwitterAppSecret() {
    return twitterAppSecret;
  }

  public void setTwitterAppSecret(String twitterAppSecret) {
    this.twitterAppSecret = twitterAppSecret;
  }

  public Application twitterCallbackURL(String twitterCallbackURL) {
    this.twitterCallbackURL = twitterCallbackURL;
    return this;
  }

   /**
   * Get twitterCallbackURL
   * @return twitterCallbackURL
  **/
  public String getTwitterCallbackURL() {
    return twitterCallbackURL;
  }

  public void setTwitterCallbackURL(String twitterCallbackURL) {
    this.twitterCallbackURL = twitterCallbackURL;
  }

  public Application defaultImage(String defaultImage) {
    this.defaultImage = defaultImage;
    return this;
  }

   /**
   * Get defaultImage
   * @return defaultImage
  **/
  public String getDefaultImage() {
    return defaultImage;
  }

  public void setDefaultImage(String defaultImage) {
    this.defaultImage = defaultImage;
  }

  public Application modules(String modules) {
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

  public Application authorizedServers(String authorizedServers) {
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

  public Application authorizedCount(Integer authorizedCount) {
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

  public Application activeServers(String activeServers) {
    this.activeServers = activeServers;
    return this;
  }

   /**
   * Get activeServers
   * @return activeServers
  **/
  public String getActiveServers() {
    return activeServers;
  }

  public void setActiveServers(String activeServers) {
    this.activeServers = activeServers;
  }

  public Application licensePeriod(OffsetDateTime licensePeriod) {
    this.licensePeriod = licensePeriod;
    return this;
  }

   /**
   * Get licensePeriod
   * @return licensePeriod
  **/
  public OffsetDateTime getLicensePeriod() {
    return licensePeriod;
  }

  public void setLicensePeriod(OffsetDateTime licensePeriod) {
    this.licensePeriod = licensePeriod;
  }

  public Application hasGameData(Boolean hasGameData) {
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

  public Application currentBuildVersion(String currentBuildVersion) {
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

  public Application currentApiVersion(String currentApiVersion) {
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

  public Application globalTickets(Boolean globalTickets) {
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

  public Application ticketsPerPoint(Float ticketsPerPoint) {
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

  public Application maxPointsPerScore(Integer maxPointsPerScore) {
    this.maxPointsPerScore = maxPointsPerScore;
    return this;
  }

   /**
   * Get maxPointsPerScore
   * @return maxPointsPerScore
  **/
  public Integer getMaxPointsPerScore() {
    return maxPointsPerScore;
  }

  public void setMaxPointsPerScore(Integer maxPointsPerScore) {
    this.maxPointsPerScore = maxPointsPerScore;
  }

  public Application useAppCache(Boolean useAppCache) {
    this.useAppCache = useAppCache;
    return this;
  }

   /**
   * Get useAppCache
   * @return useAppCache
  **/
  public Boolean getUseAppCache() {
    return useAppCache;
  }

  public void setUseAppCache(Boolean useAppCache) {
    this.useAppCache = useAppCache;
  }

  public Application uniqueUserTag(String uniqueUserTag) {
    this.uniqueUserTag = uniqueUserTag;
    return this;
  }

   /**
   * Get uniqueUserTag
   * @return uniqueUserTag
  **/
  public String getUniqueUserTag() {
    return uniqueUserTag;
  }

  public void setUniqueUserTag(String uniqueUserTag) {
    this.uniqueUserTag = uniqueUserTag;
  }

  public Application useMatchingAlgorithm(Boolean useMatchingAlgorithm) {
    this.useMatchingAlgorithm = useMatchingAlgorithm;
    return this;
  }

   /**
   * Get useMatchingAlgorithm
   * @return useMatchingAlgorithm
  **/
  public Boolean getUseMatchingAlgorithm() {
    return useMatchingAlgorithm;
  }

  public void setUseMatchingAlgorithm(Boolean useMatchingAlgorithm) {
    this.useMatchingAlgorithm = useMatchingAlgorithm;
  }

  public Application platforms(List<@Valid Platform> platforms) {
    this.platforms = platforms;
    return this;
  }

  public Application addPlatformsItem(Platform platformsItem) {
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
  public List<@Valid Platform> getPlatforms() {
    return platforms;
  }

  public void setPlatforms(List<@Valid Platform> platforms) {
    this.platforms = platforms;
  }

  public Application categories(List<@Valid Category> categories) {
    this.categories = categories;
    return this;
  }

  public Application addCategoriesItem(Category categoriesItem) {
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
  public List<@Valid Category> getCategories() {
    return categories;
  }

  public void setCategories(List<@Valid Category> categories) {
    this.categories = categories;
  }

  public Application placements(List<@Valid Placement> placements) {
    this.placements = placements;
    return this;
  }

  public Application addPlacementsItem(Placement placementsItem) {
    if (this.placements == null) {
      this.placements = new ArrayList<>();
    }
    this.placements.add(placementsItem);
    return this;
  }

   /**
   * Get placements
   * @return placements
  **/
  public List<@Valid Placement> getPlacements() {
    return placements;
  }

  public void setPlacements(List<@Valid Placement> placements) {
    this.placements = placements;
  }

  public Application hasAdvertisements(Boolean hasAdvertisements) {
    this.hasAdvertisements = hasAdvertisements;
    return this;
  }

   /**
   * Get hasAdvertisements
   * @return hasAdvertisements
  **/
  public Boolean getHasAdvertisements() {
    return hasAdvertisements;
  }

  public void setHasAdvertisements(Boolean hasAdvertisements) {
    this.hasAdvertisements = hasAdvertisements;
  }

  public Application appleAppId(String appleAppId) {
    this.appleAppId = appleAppId;
    return this;
  }

   /**
   * Get appleAppId
   * @return appleAppId
  **/
  public String getAppleAppId() {
    return appleAppId;
  }

  public void setAppleAppId(String appleAppId) {
    this.appleAppId = appleAppId;
  }

  public Application googleAppId(String googleAppId) {
    this.googleAppId = googleAppId;
    return this;
  }

   /**
   * Get googleAppId
   * @return googleAppId
  **/
  public String getGoogleAppId() {
    return googleAppId;
  }

  public void setGoogleAppId(String googleAppId) {
    this.googleAppId = googleAppId;
  }

  public Application googleApiKey(String googleApiKey) {
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

  public Application googleOAuthClientId(String googleOAuthClientId) {
    this.googleOAuthClientId = googleOAuthClientId;
    return this;
  }

   /**
   * Get googleOAuthClientId
   * @return googleOAuthClientId
  **/
  public String getGoogleOAuthClientId() {
    return googleOAuthClientId;
  }

  public void setGoogleOAuthClientId(String googleOAuthClientId) {
    this.googleOAuthClientId = googleOAuthClientId;
  }

  public Application googleOAuthSecret(String googleOAuthSecret) {
    this.googleOAuthSecret = googleOAuthSecret;
    return this;
  }

   /**
   * Get googleOAuthSecret
   * @return googleOAuthSecret
  **/
  public String getGoogleOAuthSecret() {
    return googleOAuthSecret;
  }

  public void setGoogleOAuthSecret(String googleOAuthSecret) {
    this.googleOAuthSecret = googleOAuthSecret;
  }

  public Application googleOAuthAccessToken(String googleOAuthAccessToken) {
    this.googleOAuthAccessToken = googleOAuthAccessToken;
    return this;
  }

   /**
   * Get googleOAuthAccessToken
   * @return googleOAuthAccessToken
  **/
  public String getGoogleOAuthAccessToken() {
    return googleOAuthAccessToken;
  }

  public void setGoogleOAuthAccessToken(String googleOAuthAccessToken) {
    this.googleOAuthAccessToken = googleOAuthAccessToken;
  }

  public Application googleOAuthRefreshToken(String googleOAuthRefreshToken) {
    this.googleOAuthRefreshToken = googleOAuthRefreshToken;
    return this;
  }

   /**
   * Get googleOAuthRefreshToken
   * @return googleOAuthRefreshToken
  **/
  public String getGoogleOAuthRefreshToken() {
    return googleOAuthRefreshToken;
  }

  public void setGoogleOAuthRefreshToken(String googleOAuthRefreshToken) {
    this.googleOAuthRefreshToken = googleOAuthRefreshToken;
  }

  public Application baiduApiKey(String baiduApiKey) {
    this.baiduApiKey = baiduApiKey;
    return this;
  }

   /**
   * Get baiduApiKey
   * @return baiduApiKey
  **/
  public String getBaiduApiKey() {
    return baiduApiKey;
  }

  public void setBaiduApiKey(String baiduApiKey) {
    this.baiduApiKey = baiduApiKey;
  }

  public Application baiduSecretKey(String baiduSecretKey) {
    this.baiduSecretKey = baiduSecretKey;
    return this;
  }

   /**
   * Get baiduSecretKey
   * @return baiduSecretKey
  **/
  public String getBaiduSecretKey() {
    return baiduSecretKey;
  }

  public void setBaiduSecretKey(String baiduSecretKey) {
    this.baiduSecretKey = baiduSecretKey;
  }

  public Application jpushAppKey(String jpushAppKey) {
    this.jpushAppKey = jpushAppKey;
    return this;
  }

   /**
   * Get jpushAppKey
   * @return jpushAppKey
  **/
  public String getJpushAppKey() {
    return jpushAppKey;
  }

  public void setJpushAppKey(String jpushAppKey) {
    this.jpushAppKey = jpushAppKey;
  }

  public Application jpushMasterSecret(String jpushMasterSecret) {
    this.jpushMasterSecret = jpushMasterSecret;
    return this;
  }

   /**
   * Get jpushMasterSecret
   * @return jpushMasterSecret
  **/
  public String getJpushMasterSecret() {
    return jpushMasterSecret;
  }

  public void setJpushMasterSecret(String jpushMasterSecret) {
    this.jpushMasterSecret = jpushMasterSecret;
  }

  public Application xgPushSecretKey(String xgPushSecretKey) {
    this.xgPushSecretKey = xgPushSecretKey;
    return this;
  }

   /**
   * Get xgPushSecretKey
   * @return xgPushSecretKey
  **/
  public String getXgPushSecretKey() {
    return xgPushSecretKey;
  }

  public void setXgPushSecretKey(String xgPushSecretKey) {
    this.xgPushSecretKey = xgPushSecretKey;
  }

  public Application publicNotifications(Boolean publicNotifications) {
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

  public Application urlScheme(String urlScheme) {
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

  public Application retailer(Retailer retailer) {
    this.retailer = retailer;
    return this;
  }

   /**
   * Get retailer
   * @return retailer
  **/
  public Retailer getRetailer() {
    return retailer;
  }

  public void setRetailer(Retailer retailer) {
    this.retailer = retailer;
  }

  public Application objectStoreSession(String objectStoreSession) {
    this.objectStoreSession = objectStoreSession;
    return this;
  }

   /**
   * Get objectStoreSession
   * @return objectStoreSession
  **/
  public String getObjectStoreSession() {
    return objectStoreSession;
  }

  public void setObjectStoreSession(String objectStoreSession) {
    this.objectStoreSession = objectStoreSession;
  }

  public Application publicContentApproval(Boolean publicContentApproval) {
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

  public Application productionMode(Boolean productionMode) {
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

  public Application griplyBaseUrl(String griplyBaseUrl) {
    this.griplyBaseUrl = griplyBaseUrl;
    return this;
  }

   /**
   * Get griplyBaseUrl
   * @return griplyBaseUrl
  **/
  public String getGriplyBaseUrl() {
    return griplyBaseUrl;
  }

  public void setGriplyBaseUrl(String griplyBaseUrl) {
    this.griplyBaseUrl = griplyBaseUrl;
  }

  public Application minimumSessionLength(Integer minimumSessionLength) {
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

  public Application sessionGapLength(Integer sessionGapLength) {
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

  public Application processSessionData(Boolean processSessionData) {
    this.processSessionData = processSessionData;
    return this;
  }

   /**
   * Get processSessionData
   * @return processSessionData
  **/
  public Boolean getProcessSessionData() {
    return processSessionData;
  }

  public void setProcessSessionData(Boolean processSessionData) {
    this.processSessionData = processSessionData;
  }

  public Application localAdsEnabled(Boolean localAdsEnabled) {
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

  public Application includeInReport(Boolean includeInReport) {
    this.includeInReport = includeInReport;
    return this;
  }

   /**
   * Get includeInReport
   * @return includeInReport
  **/
  public Boolean getIncludeInReport() {
    return includeInReport;
  }

  public void setIncludeInReport(Boolean includeInReport) {
    this.includeInReport = includeInReport;
  }

  public Application sqootApiKey(String sqootApiKey) {
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

  public Application amqpEnabled(Boolean amqpEnabled) {
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

  public Application trilatSettings(TrilatAppSettings trilatSettings) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Application application = (Application) o;
    return Objects.equals(id, application.id) &&
        Objects.equals(active, application.active) &&
        Objects.equals(valid, application.valid) &&
        Objects.equals(title, application.title) &&
        Objects.equals(about, application.about) &&
        Objects.equals(certificateUrl, application.certificateUrl) &&
        Objects.equals(certificateName, application.certificateName) &&
        Objects.equals(certificate, application.certificate) &&
        Objects.equals(certificateLastUpdated, application.certificateLastUpdated) &&
        Objects.equals(appDescription, application.appDescription) &&
        Objects.equals(showInActivities, application.showInActivities) &&
        Objects.equals(cssClass, application.cssClass) &&
        Objects.equals(inviteWelcomeText, application.inviteWelcomeText) &&
        Objects.equals(bundleId, application.bundleId) &&
        Objects.equals(appType, application.appType) &&
        Objects.equals(scoringType, application.scoringType) &&
        Objects.equals(appKey, application.appKey) &&
        Objects.equals(appRestKey, application.appRestKey) &&
        Objects.equals(appTokenKey, application.appTokenKey) &&
        Objects.equals(hintCost, application.hintCost) &&
        Objects.equals(eulaDate, application.eulaDate) &&
        Objects.equals(eulaVersion, application.eulaVersion) &&
        Objects.equals(landingPageUrl, application.landingPageUrl) &&
        Objects.equals(invitePageUrl, application.invitePageUrl) &&
        Objects.equals(downloadUrls, application.downloadUrls) &&
        Objects.equals(appName, application.appName) &&
        Objects.equals(appIcon, application.appIcon) &&
        Objects.equals(appLogo, application.appLogo) &&
        Objects.equals(billableEntity, application.billableEntity) &&
        Objects.equals(facebookAppId, application.facebookAppId) &&
        Objects.equals(facebookAppSecret, application.facebookAppSecret) &&
        Objects.equals(twitterAppId, application.twitterAppId) &&
        Objects.equals(twitterAppSecret, application.twitterAppSecret) &&
        Objects.equals(twitterCallbackURL, application.twitterCallbackURL) &&
        Objects.equals(defaultImage, application.defaultImage) &&
        Objects.equals(modules, application.modules) &&
        Objects.equals(authorizedServers, application.authorizedServers) &&
        Objects.equals(authorizedCount, application.authorizedCount) &&
        Objects.equals(activeServers, application.activeServers) &&
        Objects.equals(licensePeriod, application.licensePeriod) &&
        Objects.equals(hasGameData, application.hasGameData) &&
        Objects.equals(currentBuildVersion, application.currentBuildVersion) &&
        Objects.equals(currentApiVersion, application.currentApiVersion) &&
        Objects.equals(globalTickets, application.globalTickets) &&
        Objects.equals(ticketsPerPoint, application.ticketsPerPoint) &&
        Objects.equals(maxPointsPerScore, application.maxPointsPerScore) &&
        Objects.equals(useAppCache, application.useAppCache) &&
        Objects.equals(uniqueUserTag, application.uniqueUserTag) &&
        Objects.equals(useMatchingAlgorithm, application.useMatchingAlgorithm) &&
        Objects.equals(platforms, application.platforms) &&
        Objects.equals(categories, application.categories) &&
        Objects.equals(placements, application.placements) &&
        Objects.equals(hasAdvertisements, application.hasAdvertisements) &&
        Objects.equals(appleAppId, application.appleAppId) &&
        Objects.equals(googleAppId, application.googleAppId) &&
        Objects.equals(googleApiKey, application.googleApiKey) &&
        Objects.equals(googleOAuthClientId, application.googleOAuthClientId) &&
        Objects.equals(googleOAuthSecret, application.googleOAuthSecret) &&
        Objects.equals(googleOAuthAccessToken, application.googleOAuthAccessToken) &&
        Objects.equals(googleOAuthRefreshToken, application.googleOAuthRefreshToken) &&
        Objects.equals(baiduApiKey, application.baiduApiKey) &&
        Objects.equals(baiduSecretKey, application.baiduSecretKey) &&
        Objects.equals(jpushAppKey, application.jpushAppKey) &&
        Objects.equals(jpushMasterSecret, application.jpushMasterSecret) &&
        Objects.equals(xgPushSecretKey, application.xgPushSecretKey) &&
        Objects.equals(publicNotifications, application.publicNotifications) &&
        Objects.equals(urlScheme, application.urlScheme) &&
        Objects.equals(retailer, application.retailer) &&
        Objects.equals(objectStoreSession, application.objectStoreSession) &&
        Objects.equals(publicContentApproval, application.publicContentApproval) &&
        Objects.equals(productionMode, application.productionMode) &&
        Objects.equals(griplyBaseUrl, application.griplyBaseUrl) &&
        Objects.equals(minimumSessionLength, application.minimumSessionLength) &&
        Objects.equals(sessionGapLength, application.sessionGapLength) &&
        Objects.equals(processSessionData, application.processSessionData) &&
        Objects.equals(localAdsEnabled, application.localAdsEnabled) &&
        Objects.equals(includeInReport, application.includeInReport) &&
        Objects.equals(sqootApiKey, application.sqootApiKey) &&
        Objects.equals(amqpEnabled, application.amqpEnabled) &&
        Objects.equals(trilatSettings, application.trilatSettings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, active, valid, title, about, certificateUrl, certificateName, certificate, certificateLastUpdated, appDescription, showInActivities, cssClass, inviteWelcomeText, bundleId, appType, scoringType, appKey, appRestKey, appTokenKey, hintCost, eulaDate, eulaVersion, landingPageUrl, invitePageUrl, downloadUrls, appName, appIcon, appLogo, billableEntity, facebookAppId, facebookAppSecret, twitterAppId, twitterAppSecret, twitterCallbackURL, defaultImage, modules, authorizedServers, authorizedCount, activeServers, licensePeriod, hasGameData, currentBuildVersion, currentApiVersion, globalTickets, ticketsPerPoint, maxPointsPerScore, useAppCache, uniqueUserTag, useMatchingAlgorithm, platforms, categories, placements, hasAdvertisements, appleAppId, googleAppId, googleApiKey, googleOAuthClientId, googleOAuthSecret, googleOAuthAccessToken, googleOAuthRefreshToken, baiduApiKey, baiduSecretKey, jpushAppKey, jpushMasterSecret, xgPushSecretKey, publicNotifications, urlScheme, retailer, objectStoreSession, publicContentApproval, productionMode, griplyBaseUrl, minimumSessionLength, sessionGapLength, processSessionData, localAdsEnabled, includeInReport, sqootApiKey, amqpEnabled, trilatSettings);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


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
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class Application   {
  
  private Long id;
  private Boolean active;
  private Boolean valid;
  private String title;
  private String about;
  private String certificateUrl;
  private String certificateName;
  private BlobFile certificate;
  private Date certificateLastUpdated;
  private String appDescription;
  private Boolean showInActivities;
  private String cssClass;
  private String inviteWelcomeText;
  private String bundleId;
  private String appType;

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
  private String appKey;
  private String appRestKey;
  private String appTokenKey;
  private Integer hintCost;
  private Date eulaDate;
  private String eulaVersion;
  private String landingPageUrl;
  private String invitePageUrl;
  private String downloadUrls;
  private String appName;
  private Asset appIcon;
  private Asset appLogo;
  private BillableEntity billableEntity;
  private String facebookAppId;
  private String facebookAppSecret;
  private String twitterAppId;
  private String twitterAppSecret;
  private String twitterCallbackURL;
  private String defaultImage;
  private String modules;
  private String authorizedServers;
  private Integer authorizedCount;
  private String activeServers;
  private Date licensePeriod;
  private Boolean hasGameData;
  private String currentBuildVersion;
  private String currentApiVersion;
  private Boolean globalTickets;
  private Float ticketsPerPoint;
  private Integer maxPointsPerScore;
  private Boolean useAppCache;
  private String uniqueUserTag;
  private Boolean useMatchingAlgorithm;
  private List<@Valid Platform> platforms = new ArrayList<>();
  private List<@Valid Category> categories = new ArrayList<>();
  private List<@Valid Placement> placements = new ArrayList<>();
  private Boolean hasAdvertisements;
  private String appleAppId;
  private String googleAppId;
  private String googleApiKey;
  private String googleOAuthClientId;
  private String googleOAuthSecret;
  private String googleOAuthAccessToken;
  private String googleOAuthRefreshToken;
  private String baiduApiKey;
  private String baiduSecretKey;
  private String jpushAppKey;
  private String jpushMasterSecret;
  private String xgPushSecretKey;
  private Boolean publicNotifications;
  private String urlScheme;
  private Retailer retailer;
  private String objectStoreSession;
  private Boolean publicContentApproval;
  private Boolean productionMode;
  private String griplyBaseUrl;
  private Integer minimumSessionLength;
  private Integer sessionGapLength;
  private Boolean processSessionData;
  private Boolean localAdsEnabled;
  private Boolean includeInReport;
  private String sqootApiKey;
  private Boolean amqpEnabled;
  private TrilatAppSettings trilatSettings;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
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
  @JsonProperty("certificateUrl")
  public String getCertificateUrl() {
    return certificateUrl;
  }
  public void setCertificateUrl(String certificateUrl) {
    this.certificateUrl = certificateUrl;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("certificateName")
  public String getCertificateName() {
    return certificateName;
  }
  public void setCertificateName(String certificateName) {
    this.certificateName = certificateName;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("certificate")
  @Valid
  public BlobFile getCertificate() {
    return certificate;
  }
  public void setCertificate(BlobFile certificate) {
    this.certificate = certificate;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("certificateLastUpdated")
  public Date getCertificateLastUpdated() {
    return certificateLastUpdated;
  }
  public void setCertificateLastUpdated(Date certificateLastUpdated) {
    this.certificateLastUpdated = certificateLastUpdated;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("appDescription")
  public String getAppDescription() {
    return appDescription;
  }
  public void setAppDescription(String appDescription) {
    this.appDescription = appDescription;
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
  @JsonProperty("appTokenKey")
  public String getAppTokenKey() {
    return appTokenKey;
  }
  public void setAppTokenKey(String appTokenKey) {
    this.appTokenKey = appTokenKey;
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
  @JsonProperty("eulaDate")
  public Date getEulaDate() {
    return eulaDate;
  }
  public void setEulaDate(Date eulaDate) {
    this.eulaDate = eulaDate;
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
  @JsonProperty("appIcon")
  @Valid
  public Asset getAppIcon() {
    return appIcon;
  }
  public void setAppIcon(Asset appIcon) {
    this.appIcon = appIcon;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("appLogo")
  @Valid
  public Asset getAppLogo() {
    return appLogo;
  }
  public void setAppLogo(Asset appLogo) {
    this.appLogo = appLogo;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("billableEntity")
  @Valid
  public BillableEntity getBillableEntity() {
    return billableEntity;
  }
  public void setBillableEntity(BillableEntity billableEntity) {
    this.billableEntity = billableEntity;
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
  @JsonProperty("twitterAppId")
  public String getTwitterAppId() {
    return twitterAppId;
  }
  public void setTwitterAppId(String twitterAppId) {
    this.twitterAppId = twitterAppId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("twitterAppSecret")
  public String getTwitterAppSecret() {
    return twitterAppSecret;
  }
  public void setTwitterAppSecret(String twitterAppSecret) {
    this.twitterAppSecret = twitterAppSecret;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("twitterCallbackURL")
  public String getTwitterCallbackURL() {
    return twitterCallbackURL;
  }
  public void setTwitterCallbackURL(String twitterCallbackURL) {
    this.twitterCallbackURL = twitterCallbackURL;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("defaultImage")
  public String getDefaultImage() {
    return defaultImage;
  }
  public void setDefaultImage(String defaultImage) {
    this.defaultImage = defaultImage;
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
  @JsonProperty("activeServers")
  public String getActiveServers() {
    return activeServers;
  }
  public void setActiveServers(String activeServers) {
    this.activeServers = activeServers;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("licensePeriod")
  public Date getLicensePeriod() {
    return licensePeriod;
  }
  public void setLicensePeriod(Date licensePeriod) {
    this.licensePeriod = licensePeriod;
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
  @JsonProperty("maxPointsPerScore")
  public Integer getMaxPointsPerScore() {
    return maxPointsPerScore;
  }
  public void setMaxPointsPerScore(Integer maxPointsPerScore) {
    this.maxPointsPerScore = maxPointsPerScore;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("useAppCache")
  public Boolean getUseAppCache() {
    return useAppCache;
  }
  public void setUseAppCache(Boolean useAppCache) {
    this.useAppCache = useAppCache;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("uniqueUserTag")
  public String getUniqueUserTag() {
    return uniqueUserTag;
  }
  public void setUniqueUserTag(String uniqueUserTag) {
    this.uniqueUserTag = uniqueUserTag;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("useMatchingAlgorithm")
  public Boolean getUseMatchingAlgorithm() {
    return useMatchingAlgorithm;
  }
  public void setUseMatchingAlgorithm(Boolean useMatchingAlgorithm) {
    this.useMatchingAlgorithm = useMatchingAlgorithm;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("platforms")
  @Valid
  public List<@Valid Platform> getPlatforms() {
    return platforms;
  }
  public void setPlatforms(List<@Valid Platform> platforms) {
    this.platforms = platforms;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("categories")
  @Valid
  public List<@Valid Category> getCategories() {
    return categories;
  }
  public void setCategories(List<@Valid Category> categories) {
    this.categories = categories;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("placements")
  @Valid
  public List<@Valid Placement> getPlacements() {
    return placements;
  }
  public void setPlacements(List<@Valid Placement> placements) {
    this.placements = placements;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("hasAdvertisements")
  public Boolean getHasAdvertisements() {
    return hasAdvertisements;
  }
  public void setHasAdvertisements(Boolean hasAdvertisements) {
    this.hasAdvertisements = hasAdvertisements;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("appleAppId")
  public String getAppleAppId() {
    return appleAppId;
  }
  public void setAppleAppId(String appleAppId) {
    this.appleAppId = appleAppId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("googleAppId")
  public String getGoogleAppId() {
    return googleAppId;
  }
  public void setGoogleAppId(String googleAppId) {
    this.googleAppId = googleAppId;
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
  @JsonProperty("googleOAuthClientId")
  public String getGoogleOAuthClientId() {
    return googleOAuthClientId;
  }
  public void setGoogleOAuthClientId(String googleOAuthClientId) {
    this.googleOAuthClientId = googleOAuthClientId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("googleOAuthSecret")
  public String getGoogleOAuthSecret() {
    return googleOAuthSecret;
  }
  public void setGoogleOAuthSecret(String googleOAuthSecret) {
    this.googleOAuthSecret = googleOAuthSecret;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("googleOAuthAccessToken")
  public String getGoogleOAuthAccessToken() {
    return googleOAuthAccessToken;
  }
  public void setGoogleOAuthAccessToken(String googleOAuthAccessToken) {
    this.googleOAuthAccessToken = googleOAuthAccessToken;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("googleOAuthRefreshToken")
  public String getGoogleOAuthRefreshToken() {
    return googleOAuthRefreshToken;
  }
  public void setGoogleOAuthRefreshToken(String googleOAuthRefreshToken) {
    this.googleOAuthRefreshToken = googleOAuthRefreshToken;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("baiduApiKey")
  public String getBaiduApiKey() {
    return baiduApiKey;
  }
  public void setBaiduApiKey(String baiduApiKey) {
    this.baiduApiKey = baiduApiKey;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("baiduSecretKey")
  public String getBaiduSecretKey() {
    return baiduSecretKey;
  }
  public void setBaiduSecretKey(String baiduSecretKey) {
    this.baiduSecretKey = baiduSecretKey;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("jpushAppKey")
  public String getJpushAppKey() {
    return jpushAppKey;
  }
  public void setJpushAppKey(String jpushAppKey) {
    this.jpushAppKey = jpushAppKey;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("jpushMasterSecret")
  public String getJpushMasterSecret() {
    return jpushMasterSecret;
  }
  public void setJpushMasterSecret(String jpushMasterSecret) {
    this.jpushMasterSecret = jpushMasterSecret;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("xgPushSecretKey")
  public String getXgPushSecretKey() {
    return xgPushSecretKey;
  }
  public void setXgPushSecretKey(String xgPushSecretKey) {
    this.xgPushSecretKey = xgPushSecretKey;
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
  @JsonProperty("retailer")
  @Valid
  public Retailer getRetailer() {
    return retailer;
  }
  public void setRetailer(Retailer retailer) {
    this.retailer = retailer;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("objectStoreSession")
  public String getObjectStoreSession() {
    return objectStoreSession;
  }
  public void setObjectStoreSession(String objectStoreSession) {
    this.objectStoreSession = objectStoreSession;
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
  @JsonProperty("griplyBaseUrl")
  public String getGriplyBaseUrl() {
    return griplyBaseUrl;
  }
  public void setGriplyBaseUrl(String griplyBaseUrl) {
    this.griplyBaseUrl = griplyBaseUrl;
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
  @JsonProperty("processSessionData")
  public Boolean getProcessSessionData() {
    return processSessionData;
  }
  public void setProcessSessionData(Boolean processSessionData) {
    this.processSessionData = processSessionData;
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
  @JsonProperty("includeInReport")
  public Boolean getIncludeInReport() {
    return includeInReport;
  }
  public void setIncludeInReport(Boolean includeInReport) {
    this.includeInReport = includeInReport;
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
  @JsonProperty("trilatSettings")
  @Valid
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


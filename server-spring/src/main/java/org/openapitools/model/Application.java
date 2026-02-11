package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Asset;
import org.openapitools.model.BillableEntity;
import org.openapitools.model.BlobFile;
import org.openapitools.model.Category;
import org.openapitools.model.Placement;
import org.openapitools.model.Platform;
import org.openapitools.model.Retailer;
import org.openapitools.model.TrilatAppSettings;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Application
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-11T19:32:41.765375324Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class Application {

  private @Nullable Long id;

  private @Nullable Boolean active;

  private @Nullable Boolean valid;

  private @Nullable String title;

  private @Nullable String about;

  private @Nullable String certificateUrl;

  private @Nullable String certificateName;

  private @Nullable BlobFile certificate;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime certificateLastUpdated;

  private @Nullable String appDescription;

  private @Nullable Boolean showInActivities;

  private @Nullable String cssClass;

  private @Nullable String inviteWelcomeText;

  private @Nullable String bundleId;

  private @Nullable String appType;

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

  private @Nullable String appKey;

  private @Nullable String appRestKey;

  private @Nullable String appTokenKey;

  private @Nullable Integer hintCost;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime eulaDate;

  private @Nullable String eulaVersion;

  private @Nullable String landingPageUrl;

  private @Nullable String invitePageUrl;

  private @Nullable String downloadUrls;

  private @Nullable String appName;

  private @Nullable Asset appIcon;

  private @Nullable Asset appLogo;

  private @Nullable BillableEntity billableEntity;

  private @Nullable String facebookAppId;

  private @Nullable String facebookAppSecret;

  private @Nullable String twitterAppId;

  private @Nullable String twitterAppSecret;

  private @Nullable String twitterCallbackURL;

  private @Nullable String defaultImage;

  private @Nullable String modules;

  private @Nullable String authorizedServers;

  private @Nullable Integer authorizedCount;

  private @Nullable String activeServers;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime licensePeriod;

  private @Nullable Boolean hasGameData;

  private @Nullable String currentBuildVersion;

  private @Nullable String currentApiVersion;

  private @Nullable Boolean globalTickets;

  private @Nullable Float ticketsPerPoint;

  private @Nullable Integer maxPointsPerScore;

  private @Nullable Boolean useAppCache;

  private @Nullable String uniqueUserTag;

  private @Nullable Boolean useMatchingAlgorithm;

  @Valid
  private List<@Valid Platform> platforms = new ArrayList<>();

  @Valid
  private List<@Valid Category> categories = new ArrayList<>();

  @Valid
  private List<@Valid Placement> placements = new ArrayList<>();

  private @Nullable Boolean hasAdvertisements;

  private @Nullable String appleAppId;

  private @Nullable String googleAppId;

  private @Nullable String googleApiKey;

  private @Nullable String googleOAuthClientId;

  private @Nullable String googleOAuthSecret;

  private @Nullable String googleOAuthAccessToken;

  private @Nullable String googleOAuthRefreshToken;

  private @Nullable String baiduApiKey;

  private @Nullable String baiduSecretKey;

  private @Nullable String jpushAppKey;

  private @Nullable String jpushMasterSecret;

  private @Nullable String xgPushSecretKey;

  private @Nullable Boolean publicNotifications;

  private @Nullable String urlScheme;

  private @Nullable Retailer retailer;

  private @Nullable String objectStoreSession;

  private @Nullable Boolean publicContentApproval;

  private @Nullable Boolean productionMode;

  private @Nullable String griplyBaseUrl;

  private @Nullable Integer minimumSessionLength;

  private @Nullable Integer sessionGapLength;

  private @Nullable Boolean processSessionData;

  private @Nullable Boolean localAdsEnabled;

  private @Nullable Boolean includeInReport;

  private @Nullable String sqootApiKey;

  private @Nullable Boolean amqpEnabled;

  private @Nullable TrilatAppSettings trilatSettings;

  public Application id(@Nullable Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public @Nullable Long getId() {
    return id;
  }

  public void setId(@Nullable Long id) {
    this.id = id;
  }

  public Application active(@Nullable Boolean active) {
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

  public Application valid(@Nullable Boolean valid) {
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

  public Application title(@Nullable String title) {
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

  public Application about(@Nullable String about) {
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

  public Application certificateUrl(@Nullable String certificateUrl) {
    this.certificateUrl = certificateUrl;
    return this;
  }

  /**
   * Get certificateUrl
   * @return certificateUrl
   */
  
  @Schema(name = "certificateUrl", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("certificateUrl")
  public @Nullable String getCertificateUrl() {
    return certificateUrl;
  }

  public void setCertificateUrl(@Nullable String certificateUrl) {
    this.certificateUrl = certificateUrl;
  }

  public Application certificateName(@Nullable String certificateName) {
    this.certificateName = certificateName;
    return this;
  }

  /**
   * Get certificateName
   * @return certificateName
   */
  
  @Schema(name = "certificateName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("certificateName")
  public @Nullable String getCertificateName() {
    return certificateName;
  }

  public void setCertificateName(@Nullable String certificateName) {
    this.certificateName = certificateName;
  }

  public Application certificate(@Nullable BlobFile certificate) {
    this.certificate = certificate;
    return this;
  }

  /**
   * Get certificate
   * @return certificate
   */
  @Valid 
  @Schema(name = "certificate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("certificate")
  public @Nullable BlobFile getCertificate() {
    return certificate;
  }

  public void setCertificate(@Nullable BlobFile certificate) {
    this.certificate = certificate;
  }

  public Application certificateLastUpdated(@Nullable OffsetDateTime certificateLastUpdated) {
    this.certificateLastUpdated = certificateLastUpdated;
    return this;
  }

  /**
   * Get certificateLastUpdated
   * @return certificateLastUpdated
   */
  @Valid 
  @Schema(name = "certificateLastUpdated", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("certificateLastUpdated")
  public @Nullable OffsetDateTime getCertificateLastUpdated() {
    return certificateLastUpdated;
  }

  public void setCertificateLastUpdated(@Nullable OffsetDateTime certificateLastUpdated) {
    this.certificateLastUpdated = certificateLastUpdated;
  }

  public Application appDescription(@Nullable String appDescription) {
    this.appDescription = appDescription;
    return this;
  }

  /**
   * Get appDescription
   * @return appDescription
   */
  
  @Schema(name = "appDescription", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("appDescription")
  public @Nullable String getAppDescription() {
    return appDescription;
  }

  public void setAppDescription(@Nullable String appDescription) {
    this.appDescription = appDescription;
  }

  public Application showInActivities(@Nullable Boolean showInActivities) {
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

  public Application cssClass(@Nullable String cssClass) {
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

  public Application inviteWelcomeText(@Nullable String inviteWelcomeText) {
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

  public Application bundleId(@Nullable String bundleId) {
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

  public Application appType(@Nullable String appType) {
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

  public Application scoringType(@Nullable ScoringTypeEnum scoringType) {
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

  public Application appKey(@Nullable String appKey) {
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

  public Application appRestKey(@Nullable String appRestKey) {
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

  public Application appTokenKey(@Nullable String appTokenKey) {
    this.appTokenKey = appTokenKey;
    return this;
  }

  /**
   * Get appTokenKey
   * @return appTokenKey
   */
  
  @Schema(name = "appTokenKey", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("appTokenKey")
  public @Nullable String getAppTokenKey() {
    return appTokenKey;
  }

  public void setAppTokenKey(@Nullable String appTokenKey) {
    this.appTokenKey = appTokenKey;
  }

  public Application hintCost(@Nullable Integer hintCost) {
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

  public Application eulaDate(@Nullable OffsetDateTime eulaDate) {
    this.eulaDate = eulaDate;
    return this;
  }

  /**
   * Get eulaDate
   * @return eulaDate
   */
  @Valid 
  @Schema(name = "eulaDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("eulaDate")
  public @Nullable OffsetDateTime getEulaDate() {
    return eulaDate;
  }

  public void setEulaDate(@Nullable OffsetDateTime eulaDate) {
    this.eulaDate = eulaDate;
  }

  public Application eulaVersion(@Nullable String eulaVersion) {
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

  public Application landingPageUrl(@Nullable String landingPageUrl) {
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

  public Application invitePageUrl(@Nullable String invitePageUrl) {
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

  public Application downloadUrls(@Nullable String downloadUrls) {
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

  public Application appName(@Nullable String appName) {
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

  public Application appIcon(@Nullable Asset appIcon) {
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
  public @Nullable Asset getAppIcon() {
    return appIcon;
  }

  public void setAppIcon(@Nullable Asset appIcon) {
    this.appIcon = appIcon;
  }

  public Application appLogo(@Nullable Asset appLogo) {
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
  public @Nullable Asset getAppLogo() {
    return appLogo;
  }

  public void setAppLogo(@Nullable Asset appLogo) {
    this.appLogo = appLogo;
  }

  public Application billableEntity(@Nullable BillableEntity billableEntity) {
    this.billableEntity = billableEntity;
    return this;
  }

  /**
   * Get billableEntity
   * @return billableEntity
   */
  @Valid 
  @Schema(name = "billableEntity", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("billableEntity")
  public @Nullable BillableEntity getBillableEntity() {
    return billableEntity;
  }

  public void setBillableEntity(@Nullable BillableEntity billableEntity) {
    this.billableEntity = billableEntity;
  }

  public Application facebookAppId(@Nullable String facebookAppId) {
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

  public Application facebookAppSecret(@Nullable String facebookAppSecret) {
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

  public Application twitterAppId(@Nullable String twitterAppId) {
    this.twitterAppId = twitterAppId;
    return this;
  }

  /**
   * Get twitterAppId
   * @return twitterAppId
   */
  
  @Schema(name = "twitterAppId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("twitterAppId")
  public @Nullable String getTwitterAppId() {
    return twitterAppId;
  }

  public void setTwitterAppId(@Nullable String twitterAppId) {
    this.twitterAppId = twitterAppId;
  }

  public Application twitterAppSecret(@Nullable String twitterAppSecret) {
    this.twitterAppSecret = twitterAppSecret;
    return this;
  }

  /**
   * Get twitterAppSecret
   * @return twitterAppSecret
   */
  
  @Schema(name = "twitterAppSecret", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("twitterAppSecret")
  public @Nullable String getTwitterAppSecret() {
    return twitterAppSecret;
  }

  public void setTwitterAppSecret(@Nullable String twitterAppSecret) {
    this.twitterAppSecret = twitterAppSecret;
  }

  public Application twitterCallbackURL(@Nullable String twitterCallbackURL) {
    this.twitterCallbackURL = twitterCallbackURL;
    return this;
  }

  /**
   * Get twitterCallbackURL
   * @return twitterCallbackURL
   */
  
  @Schema(name = "twitterCallbackURL", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("twitterCallbackURL")
  public @Nullable String getTwitterCallbackURL() {
    return twitterCallbackURL;
  }

  public void setTwitterCallbackURL(@Nullable String twitterCallbackURL) {
    this.twitterCallbackURL = twitterCallbackURL;
  }

  public Application defaultImage(@Nullable String defaultImage) {
    this.defaultImage = defaultImage;
    return this;
  }

  /**
   * Get defaultImage
   * @return defaultImage
   */
  
  @Schema(name = "defaultImage", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("defaultImage")
  public @Nullable String getDefaultImage() {
    return defaultImage;
  }

  public void setDefaultImage(@Nullable String defaultImage) {
    this.defaultImage = defaultImage;
  }

  public Application modules(@Nullable String modules) {
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

  public Application authorizedServers(@Nullable String authorizedServers) {
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

  public Application authorizedCount(@Nullable Integer authorizedCount) {
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

  public Application activeServers(@Nullable String activeServers) {
    this.activeServers = activeServers;
    return this;
  }

  /**
   * Get activeServers
   * @return activeServers
   */
  
  @Schema(name = "activeServers", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("activeServers")
  public @Nullable String getActiveServers() {
    return activeServers;
  }

  public void setActiveServers(@Nullable String activeServers) {
    this.activeServers = activeServers;
  }

  public Application licensePeriod(@Nullable OffsetDateTime licensePeriod) {
    this.licensePeriod = licensePeriod;
    return this;
  }

  /**
   * Get licensePeriod
   * @return licensePeriod
   */
  @Valid 
  @Schema(name = "licensePeriod", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("licensePeriod")
  public @Nullable OffsetDateTime getLicensePeriod() {
    return licensePeriod;
  }

  public void setLicensePeriod(@Nullable OffsetDateTime licensePeriod) {
    this.licensePeriod = licensePeriod;
  }

  public Application hasGameData(@Nullable Boolean hasGameData) {
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

  public Application currentBuildVersion(@Nullable String currentBuildVersion) {
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

  public Application currentApiVersion(@Nullable String currentApiVersion) {
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

  public Application globalTickets(@Nullable Boolean globalTickets) {
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

  public Application ticketsPerPoint(@Nullable Float ticketsPerPoint) {
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

  public Application maxPointsPerScore(@Nullable Integer maxPointsPerScore) {
    this.maxPointsPerScore = maxPointsPerScore;
    return this;
  }

  /**
   * Get maxPointsPerScore
   * @return maxPointsPerScore
   */
  
  @Schema(name = "maxPointsPerScore", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("maxPointsPerScore")
  public @Nullable Integer getMaxPointsPerScore() {
    return maxPointsPerScore;
  }

  public void setMaxPointsPerScore(@Nullable Integer maxPointsPerScore) {
    this.maxPointsPerScore = maxPointsPerScore;
  }

  public Application useAppCache(@Nullable Boolean useAppCache) {
    this.useAppCache = useAppCache;
    return this;
  }

  /**
   * Get useAppCache
   * @return useAppCache
   */
  
  @Schema(name = "useAppCache", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("useAppCache")
  public @Nullable Boolean getUseAppCache() {
    return useAppCache;
  }

  public void setUseAppCache(@Nullable Boolean useAppCache) {
    this.useAppCache = useAppCache;
  }

  public Application uniqueUserTag(@Nullable String uniqueUserTag) {
    this.uniqueUserTag = uniqueUserTag;
    return this;
  }

  /**
   * Get uniqueUserTag
   * @return uniqueUserTag
   */
  
  @Schema(name = "uniqueUserTag", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("uniqueUserTag")
  public @Nullable String getUniqueUserTag() {
    return uniqueUserTag;
  }

  public void setUniqueUserTag(@Nullable String uniqueUserTag) {
    this.uniqueUserTag = uniqueUserTag;
  }

  public Application useMatchingAlgorithm(@Nullable Boolean useMatchingAlgorithm) {
    this.useMatchingAlgorithm = useMatchingAlgorithm;
    return this;
  }

  /**
   * Get useMatchingAlgorithm
   * @return useMatchingAlgorithm
   */
  
  @Schema(name = "useMatchingAlgorithm", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("useMatchingAlgorithm")
  public @Nullable Boolean getUseMatchingAlgorithm() {
    return useMatchingAlgorithm;
  }

  public void setUseMatchingAlgorithm(@Nullable Boolean useMatchingAlgorithm) {
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
   */
  @Valid 
  @Schema(name = "platforms", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("platforms")
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
   */
  @Valid 
  @Schema(name = "categories", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("categories")
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
   */
  @Valid 
  @Schema(name = "placements", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("placements")
  public List<@Valid Placement> getPlacements() {
    return placements;
  }

  public void setPlacements(List<@Valid Placement> placements) {
    this.placements = placements;
  }

  public Application hasAdvertisements(@Nullable Boolean hasAdvertisements) {
    this.hasAdvertisements = hasAdvertisements;
    return this;
  }

  /**
   * Get hasAdvertisements
   * @return hasAdvertisements
   */
  
  @Schema(name = "hasAdvertisements", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hasAdvertisements")
  public @Nullable Boolean getHasAdvertisements() {
    return hasAdvertisements;
  }

  public void setHasAdvertisements(@Nullable Boolean hasAdvertisements) {
    this.hasAdvertisements = hasAdvertisements;
  }

  public Application appleAppId(@Nullable String appleAppId) {
    this.appleAppId = appleAppId;
    return this;
  }

  /**
   * Get appleAppId
   * @return appleAppId
   */
  
  @Schema(name = "appleAppId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("appleAppId")
  public @Nullable String getAppleAppId() {
    return appleAppId;
  }

  public void setAppleAppId(@Nullable String appleAppId) {
    this.appleAppId = appleAppId;
  }

  public Application googleAppId(@Nullable String googleAppId) {
    this.googleAppId = googleAppId;
    return this;
  }

  /**
   * Get googleAppId
   * @return googleAppId
   */
  
  @Schema(name = "googleAppId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("googleAppId")
  public @Nullable String getGoogleAppId() {
    return googleAppId;
  }

  public void setGoogleAppId(@Nullable String googleAppId) {
    this.googleAppId = googleAppId;
  }

  public Application googleApiKey(@Nullable String googleApiKey) {
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

  public Application googleOAuthClientId(@Nullable String googleOAuthClientId) {
    this.googleOAuthClientId = googleOAuthClientId;
    return this;
  }

  /**
   * Get googleOAuthClientId
   * @return googleOAuthClientId
   */
  
  @Schema(name = "googleOAuthClientId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("googleOAuthClientId")
  public @Nullable String getGoogleOAuthClientId() {
    return googleOAuthClientId;
  }

  public void setGoogleOAuthClientId(@Nullable String googleOAuthClientId) {
    this.googleOAuthClientId = googleOAuthClientId;
  }

  public Application googleOAuthSecret(@Nullable String googleOAuthSecret) {
    this.googleOAuthSecret = googleOAuthSecret;
    return this;
  }

  /**
   * Get googleOAuthSecret
   * @return googleOAuthSecret
   */
  
  @Schema(name = "googleOAuthSecret", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("googleOAuthSecret")
  public @Nullable String getGoogleOAuthSecret() {
    return googleOAuthSecret;
  }

  public void setGoogleOAuthSecret(@Nullable String googleOAuthSecret) {
    this.googleOAuthSecret = googleOAuthSecret;
  }

  public Application googleOAuthAccessToken(@Nullable String googleOAuthAccessToken) {
    this.googleOAuthAccessToken = googleOAuthAccessToken;
    return this;
  }

  /**
   * Get googleOAuthAccessToken
   * @return googleOAuthAccessToken
   */
  
  @Schema(name = "googleOAuthAccessToken", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("googleOAuthAccessToken")
  public @Nullable String getGoogleOAuthAccessToken() {
    return googleOAuthAccessToken;
  }

  public void setGoogleOAuthAccessToken(@Nullable String googleOAuthAccessToken) {
    this.googleOAuthAccessToken = googleOAuthAccessToken;
  }

  public Application googleOAuthRefreshToken(@Nullable String googleOAuthRefreshToken) {
    this.googleOAuthRefreshToken = googleOAuthRefreshToken;
    return this;
  }

  /**
   * Get googleOAuthRefreshToken
   * @return googleOAuthRefreshToken
   */
  
  @Schema(name = "googleOAuthRefreshToken", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("googleOAuthRefreshToken")
  public @Nullable String getGoogleOAuthRefreshToken() {
    return googleOAuthRefreshToken;
  }

  public void setGoogleOAuthRefreshToken(@Nullable String googleOAuthRefreshToken) {
    this.googleOAuthRefreshToken = googleOAuthRefreshToken;
  }

  public Application baiduApiKey(@Nullable String baiduApiKey) {
    this.baiduApiKey = baiduApiKey;
    return this;
  }

  /**
   * Get baiduApiKey
   * @return baiduApiKey
   */
  
  @Schema(name = "baiduApiKey", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("baiduApiKey")
  public @Nullable String getBaiduApiKey() {
    return baiduApiKey;
  }

  public void setBaiduApiKey(@Nullable String baiduApiKey) {
    this.baiduApiKey = baiduApiKey;
  }

  public Application baiduSecretKey(@Nullable String baiduSecretKey) {
    this.baiduSecretKey = baiduSecretKey;
    return this;
  }

  /**
   * Get baiduSecretKey
   * @return baiduSecretKey
   */
  
  @Schema(name = "baiduSecretKey", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("baiduSecretKey")
  public @Nullable String getBaiduSecretKey() {
    return baiduSecretKey;
  }

  public void setBaiduSecretKey(@Nullable String baiduSecretKey) {
    this.baiduSecretKey = baiduSecretKey;
  }

  public Application jpushAppKey(@Nullable String jpushAppKey) {
    this.jpushAppKey = jpushAppKey;
    return this;
  }

  /**
   * Get jpushAppKey
   * @return jpushAppKey
   */
  
  @Schema(name = "jpushAppKey", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("jpushAppKey")
  public @Nullable String getJpushAppKey() {
    return jpushAppKey;
  }

  public void setJpushAppKey(@Nullable String jpushAppKey) {
    this.jpushAppKey = jpushAppKey;
  }

  public Application jpushMasterSecret(@Nullable String jpushMasterSecret) {
    this.jpushMasterSecret = jpushMasterSecret;
    return this;
  }

  /**
   * Get jpushMasterSecret
   * @return jpushMasterSecret
   */
  
  @Schema(name = "jpushMasterSecret", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("jpushMasterSecret")
  public @Nullable String getJpushMasterSecret() {
    return jpushMasterSecret;
  }

  public void setJpushMasterSecret(@Nullable String jpushMasterSecret) {
    this.jpushMasterSecret = jpushMasterSecret;
  }

  public Application xgPushSecretKey(@Nullable String xgPushSecretKey) {
    this.xgPushSecretKey = xgPushSecretKey;
    return this;
  }

  /**
   * Get xgPushSecretKey
   * @return xgPushSecretKey
   */
  
  @Schema(name = "xgPushSecretKey", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("xgPushSecretKey")
  public @Nullable String getXgPushSecretKey() {
    return xgPushSecretKey;
  }

  public void setXgPushSecretKey(@Nullable String xgPushSecretKey) {
    this.xgPushSecretKey = xgPushSecretKey;
  }

  public Application publicNotifications(@Nullable Boolean publicNotifications) {
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

  public Application urlScheme(@Nullable String urlScheme) {
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

  public Application retailer(@Nullable Retailer retailer) {
    this.retailer = retailer;
    return this;
  }

  /**
   * Get retailer
   * @return retailer
   */
  @Valid 
  @Schema(name = "retailer", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("retailer")
  public @Nullable Retailer getRetailer() {
    return retailer;
  }

  public void setRetailer(@Nullable Retailer retailer) {
    this.retailer = retailer;
  }

  public Application objectStoreSession(@Nullable String objectStoreSession) {
    this.objectStoreSession = objectStoreSession;
    return this;
  }

  /**
   * Get objectStoreSession
   * @return objectStoreSession
   */
  
  @Schema(name = "objectStoreSession", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("objectStoreSession")
  public @Nullable String getObjectStoreSession() {
    return objectStoreSession;
  }

  public void setObjectStoreSession(@Nullable String objectStoreSession) {
    this.objectStoreSession = objectStoreSession;
  }

  public Application publicContentApproval(@Nullable Boolean publicContentApproval) {
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

  public Application productionMode(@Nullable Boolean productionMode) {
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

  public Application griplyBaseUrl(@Nullable String griplyBaseUrl) {
    this.griplyBaseUrl = griplyBaseUrl;
    return this;
  }

  /**
   * Get griplyBaseUrl
   * @return griplyBaseUrl
   */
  
  @Schema(name = "griplyBaseUrl", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("griplyBaseUrl")
  public @Nullable String getGriplyBaseUrl() {
    return griplyBaseUrl;
  }

  public void setGriplyBaseUrl(@Nullable String griplyBaseUrl) {
    this.griplyBaseUrl = griplyBaseUrl;
  }

  public Application minimumSessionLength(@Nullable Integer minimumSessionLength) {
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

  public Application sessionGapLength(@Nullable Integer sessionGapLength) {
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

  public Application processSessionData(@Nullable Boolean processSessionData) {
    this.processSessionData = processSessionData;
    return this;
  }

  /**
   * Get processSessionData
   * @return processSessionData
   */
  
  @Schema(name = "processSessionData", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processSessionData")
  public @Nullable Boolean getProcessSessionData() {
    return processSessionData;
  }

  public void setProcessSessionData(@Nullable Boolean processSessionData) {
    this.processSessionData = processSessionData;
  }

  public Application localAdsEnabled(@Nullable Boolean localAdsEnabled) {
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

  public Application includeInReport(@Nullable Boolean includeInReport) {
    this.includeInReport = includeInReport;
    return this;
  }

  /**
   * Get includeInReport
   * @return includeInReport
   */
  
  @Schema(name = "includeInReport", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("includeInReport")
  public @Nullable Boolean getIncludeInReport() {
    return includeInReport;
  }

  public void setIncludeInReport(@Nullable Boolean includeInReport) {
    this.includeInReport = includeInReport;
  }

  public Application sqootApiKey(@Nullable String sqootApiKey) {
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

  public Application amqpEnabled(@Nullable Boolean amqpEnabled) {
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

  public Application trilatSettings(@Nullable TrilatAppSettings trilatSettings) {
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
  private String toIndentedString(@Nullable Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


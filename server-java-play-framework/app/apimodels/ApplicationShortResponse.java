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
 * ApplicationShortResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ApplicationShortResponse   {
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

  @JsonProperty("returning")
  
  private String returning;

  public ApplicationShortResponse valid(Boolean valid) {
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

  public ApplicationShortResponse message(String message) {
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

  public ApplicationShortResponse version(Double version) {
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

  public ApplicationShortResponse serializeNulls(Boolean serializeNulls) {
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

  public ApplicationShortResponse startTimeLog(Long startTimeLog) {
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

  public ApplicationShortResponse errorCode(String errorCode) {
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

  public ApplicationShortResponse request(List<@Valid NameStringValueResponse> request) {
    this.request = request;
    return this;
  }

  public ApplicationShortResponse addRequestItem(NameStringValueResponse requestItem) {
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

  public ApplicationShortResponse applicationId(Long applicationId) {
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

  public ApplicationShortResponse appKey(String appKey) {
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

  public ApplicationShortResponse title(String title) {
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

  public ApplicationShortResponse currentBuildVersion(String currentBuildVersion) {
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

  public ApplicationShortResponse currentApiVersion(String currentApiVersion) {
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

  public ApplicationShortResponse appIcon(AssetShortResponse appIcon) {
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

  public ApplicationShortResponse appLogo(AssetShortResponse appLogo) {
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

  public ApplicationShortResponse active(Boolean active) {
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

  public ApplicationShortResponse about(String about) {
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

  public ApplicationShortResponse landingPageUrl(String landingPageUrl) {
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

  public ApplicationShortResponse landingPageFullUrl(String landingPageFullUrl) {
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

  public ApplicationShortResponse defaultImageFullUrl(String defaultImageFullUrl) {
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

  public ApplicationShortResponse activityDescription(String activityDescription) {
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

  public ApplicationShortResponse platforms(List<@Valid PlatformResponse> platforms) {
    this.platforms = platforms;
    return this;
  }

  public ApplicationShortResponse addPlatformsItem(PlatformResponse platformsItem) {
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

  public ApplicationShortResponse categories(List<@Valid CategoryResponse> categories) {
    this.categories = categories;
    return this;
  }

  public ApplicationShortResponse addCategoriesItem(CategoryResponse categoriesItem) {
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

  public ApplicationShortResponse placementCount(Integer placementCount) {
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

  public ApplicationShortResponse billable(BillableEntityShortResponse billable) {
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

  public ApplicationShortResponse hasAds(Boolean hasAds) {
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

  public ApplicationShortResponse publicNotifications(Boolean publicNotifications) {
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

  public ApplicationShortResponse urlScheme(String urlScheme) {
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

  public ApplicationShortResponse global(Boolean global) {
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

  public ApplicationShortResponse downloadUrls(String downloadUrls) {
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

  public ApplicationShortResponse localAdsEnabled(Boolean localAdsEnabled) {
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

  public ApplicationShortResponse trilatSettings(TrilatAppSettings trilatSettings) {
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

  public ApplicationShortResponse returning(String returning) {
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
    ApplicationShortResponse applicationShortResponse = (ApplicationShortResponse) o;
    return Objects.equals(valid, applicationShortResponse.valid) &&
        Objects.equals(message, applicationShortResponse.message) &&
        Objects.equals(version, applicationShortResponse.version) &&
        Objects.equals(serializeNulls, applicationShortResponse.serializeNulls) &&
        Objects.equals(startTimeLog, applicationShortResponse.startTimeLog) &&
        Objects.equals(errorCode, applicationShortResponse.errorCode) &&
        Objects.equals(request, applicationShortResponse.request) &&
        Objects.equals(applicationId, applicationShortResponse.applicationId) &&
        Objects.equals(appKey, applicationShortResponse.appKey) &&
        Objects.equals(title, applicationShortResponse.title) &&
        Objects.equals(currentBuildVersion, applicationShortResponse.currentBuildVersion) &&
        Objects.equals(currentApiVersion, applicationShortResponse.currentApiVersion) &&
        Objects.equals(appIcon, applicationShortResponse.appIcon) &&
        Objects.equals(appLogo, applicationShortResponse.appLogo) &&
        Objects.equals(active, applicationShortResponse.active) &&
        Objects.equals(about, applicationShortResponse.about) &&
        Objects.equals(landingPageUrl, applicationShortResponse.landingPageUrl) &&
        Objects.equals(landingPageFullUrl, applicationShortResponse.landingPageFullUrl) &&
        Objects.equals(defaultImageFullUrl, applicationShortResponse.defaultImageFullUrl) &&
        Objects.equals(activityDescription, applicationShortResponse.activityDescription) &&
        Objects.equals(platforms, applicationShortResponse.platforms) &&
        Objects.equals(categories, applicationShortResponse.categories) &&
        Objects.equals(placementCount, applicationShortResponse.placementCount) &&
        Objects.equals(billable, applicationShortResponse.billable) &&
        Objects.equals(hasAds, applicationShortResponse.hasAds) &&
        Objects.equals(publicNotifications, applicationShortResponse.publicNotifications) &&
        Objects.equals(urlScheme, applicationShortResponse.urlScheme) &&
        Objects.equals(global, applicationShortResponse.global) &&
        Objects.equals(downloadUrls, applicationShortResponse.downloadUrls) &&
        Objects.equals(localAdsEnabled, applicationShortResponse.localAdsEnabled) &&
        Objects.equals(trilatSettings, applicationShortResponse.trilatSettings) &&
        Objects.equals(returning, applicationShortResponse.returning);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valid, message, version, serializeNulls, startTimeLog, errorCode, request, applicationId, appKey, title, currentBuildVersion, currentApiVersion, appIcon, appLogo, active, about, landingPageUrl, landingPageFullUrl, defaultImageFullUrl, activityDescription, platforms, categories, placementCount, billable, hasAds, publicNotifications, urlScheme, global, downloadUrls, localAdsEnabled, trilatSettings, returning);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationShortResponse {\n");
    
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


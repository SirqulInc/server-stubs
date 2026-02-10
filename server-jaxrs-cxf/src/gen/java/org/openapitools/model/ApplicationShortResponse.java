package org.openapitools.model;

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


public class ApplicationShortResponse  {
  
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

  public ApplicationShortResponse valid(Boolean valid) {
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

  public ApplicationShortResponse message(String message) {
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

  public ApplicationShortResponse version(Double version) {
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

  public ApplicationShortResponse serializeNulls(Boolean serializeNulls) {
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

  public ApplicationShortResponse startTimeLog(Long startTimeLog) {
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

  public ApplicationShortResponse errorCode(String errorCode) {
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

  public ApplicationShortResponse request(List<@Valid NameStringValueResponse> request) {
    this.request = request;
    return this;
  }

  public ApplicationShortResponse addRequestItem(NameStringValueResponse requestItem) {
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

  public ApplicationShortResponse applicationId(Long applicationId) {
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

  public ApplicationShortResponse appKey(String appKey) {
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

  public ApplicationShortResponse title(String title) {
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

  public ApplicationShortResponse currentBuildVersion(String currentBuildVersion) {
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

  public ApplicationShortResponse currentApiVersion(String currentApiVersion) {
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

  public ApplicationShortResponse appIcon(AssetShortResponse appIcon) {
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

  public ApplicationShortResponse appLogo(AssetShortResponse appLogo) {
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

  public ApplicationShortResponse active(Boolean active) {
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

  public ApplicationShortResponse about(String about) {
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

  public ApplicationShortResponse landingPageUrl(String landingPageUrl) {
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

  public ApplicationShortResponse landingPageFullUrl(String landingPageFullUrl) {
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

  public ApplicationShortResponse defaultImageFullUrl(String defaultImageFullUrl) {
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

  public ApplicationShortResponse activityDescription(String activityDescription) {
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

  public ApplicationShortResponse platforms(List<@Valid PlatformResponse> platforms) {
    this.platforms = platforms;
    return this;
  }

  public ApplicationShortResponse addPlatformsItem(PlatformResponse platformsItem) {
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

  public ApplicationShortResponse categories(List<@Valid CategoryResponse> categories) {
    this.categories = categories;
    return this;
  }

  public ApplicationShortResponse addCategoriesItem(CategoryResponse categoriesItem) {
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

  public ApplicationShortResponse placementCount(Integer placementCount) {
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

  public ApplicationShortResponse billable(BillableEntityShortResponse billable) {
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

  public ApplicationShortResponse hasAds(Boolean hasAds) {
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

  public ApplicationShortResponse publicNotifications(Boolean publicNotifications) {
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

  public ApplicationShortResponse urlScheme(String urlScheme) {
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

  public ApplicationShortResponse global(Boolean global) {
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

  public ApplicationShortResponse downloadUrls(String downloadUrls) {
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

  public ApplicationShortResponse localAdsEnabled(Boolean localAdsEnabled) {
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

  public ApplicationShortResponse trilatSettings(TrilatAppSettings trilatSettings) {
    this.trilatSettings = trilatSettings;
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

  public ApplicationShortResponse returning(String returning) {
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
    ApplicationShortResponse applicationShortResponse = (ApplicationShortResponse) o;
    return Objects.equals(this.valid, applicationShortResponse.valid) &&
        Objects.equals(this.message, applicationShortResponse.message) &&
        Objects.equals(this.version, applicationShortResponse.version) &&
        Objects.equals(this.serializeNulls, applicationShortResponse.serializeNulls) &&
        Objects.equals(this.startTimeLog, applicationShortResponse.startTimeLog) &&
        Objects.equals(this.errorCode, applicationShortResponse.errorCode) &&
        Objects.equals(this.request, applicationShortResponse.request) &&
        Objects.equals(this.applicationId, applicationShortResponse.applicationId) &&
        Objects.equals(this.appKey, applicationShortResponse.appKey) &&
        Objects.equals(this.title, applicationShortResponse.title) &&
        Objects.equals(this.currentBuildVersion, applicationShortResponse.currentBuildVersion) &&
        Objects.equals(this.currentApiVersion, applicationShortResponse.currentApiVersion) &&
        Objects.equals(this.appIcon, applicationShortResponse.appIcon) &&
        Objects.equals(this.appLogo, applicationShortResponse.appLogo) &&
        Objects.equals(this.active, applicationShortResponse.active) &&
        Objects.equals(this.about, applicationShortResponse.about) &&
        Objects.equals(this.landingPageUrl, applicationShortResponse.landingPageUrl) &&
        Objects.equals(this.landingPageFullUrl, applicationShortResponse.landingPageFullUrl) &&
        Objects.equals(this.defaultImageFullUrl, applicationShortResponse.defaultImageFullUrl) &&
        Objects.equals(this.activityDescription, applicationShortResponse.activityDescription) &&
        Objects.equals(this.platforms, applicationShortResponse.platforms) &&
        Objects.equals(this.categories, applicationShortResponse.categories) &&
        Objects.equals(this.placementCount, applicationShortResponse.placementCount) &&
        Objects.equals(this.billable, applicationShortResponse.billable) &&
        Objects.equals(this.hasAds, applicationShortResponse.hasAds) &&
        Objects.equals(this.publicNotifications, applicationShortResponse.publicNotifications) &&
        Objects.equals(this.urlScheme, applicationShortResponse.urlScheme) &&
        Objects.equals(this.global, applicationShortResponse.global) &&
        Objects.equals(this.downloadUrls, applicationShortResponse.downloadUrls) &&
        Objects.equals(this.localAdsEnabled, applicationShortResponse.localAdsEnabled) &&
        Objects.equals(this.trilatSettings, applicationShortResponse.trilatSettings) &&
        Objects.equals(this.returning, applicationShortResponse.returning);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valid, message, version, serializeNulls, startTimeLog, errorCode, request, applicationId, appKey, title, currentBuildVersion, currentApiVersion, appIcon, appLogo, active, about, landingPageUrl, landingPageFullUrl, defaultImageFullUrl, activityDescription, platforms, categories, placementCount, billable, hasAds, publicNotifications, urlScheme, global, downloadUrls, localAdsEnabled, trilatSettings, returning);
  }

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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

